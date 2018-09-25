/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.wco.dec

import scala.xml.{Elem, XML}

class ResponseSpec extends WcoSpec with XmlBehaviours {


  def hasExpectedOutput[T](meta: ResponseMetaData, expected: T)(extractor: Elem => T): Elem = {
    val xmlString = meta.toXml
    val xml = XML.loadString(xmlString)
    extractor(xml) must be(expected)
    xml
  }
  "to XML" should {

    "include WCODataModelVersionCode" in validResponseXmlScenario() {
      val version = randomString(6)
      val meta = ResponseMetaData(wcoDataModelVersionCode = Some(version), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, version) { xml =>
        (xml \ "WCODataModelVersionCode").text.trim
      }

    }

    "include WCOTypeName" in validDeclarationXmlScenario() {
      val name = randomString(12)
      val meta = MetaData(wcoTypeName = Some(name), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, name) { xml => println("XML is " + xml)
        (xml \ "WCOTypeName").text.trim
      }
    }

 }
}
