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

class ResponseSpec extends WcoSpec with XmlBehaviours {


  "to XML" should {

    "include WCODataModelVersionCode" in validResponseXmlScenario() {
      val version = randomString(6)
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = Some(Seq(randomValidResponse)))
      hasExpectedOutput(meta, version) { xml =>
         (xml \ "WCODataModelVersionCode").text.trim
      }

    }

    "include WCOTypeName" in validResponseXmlScenario() {
      val name = randomString(72)
      val meta = MetaData(wcoTypeName = Some(name), response = Some(Seq(randomValidResponse)))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "WCOTypeName").text.trim
      }
    }

    "include ResponsibleCountryCode" in validResponseXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(responsibleCountryCode = Some(code), response = Some(Seq(randomValidResponse)))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "ResponsibleCountryCode").text.trim
      }
    }

    "include ResponsibleAgencyName" in validResponseXmlScenario() {
      val agency = randomString(70)
      val meta = MetaData(responsibleAgencyName = Some(agency), response = Some(Seq(randomValidResponse)))
      hasExpectedOutput(meta, agency) { xml =>
        (xml \ "ResponsibleAgencyName").text.trim
      }
    }

    "include AgencyAssignedCustomizationCode" in validResponseXmlScenario() {
      val code = randomString(6)
      val meta = MetaData(agencyAssignedCustomizationCode = Some(code), response = Some(Seq(randomValidResponse)))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "AgencyAssignedCustomizationCode").text.trim
      }
    }

    "include AgencyAssignedCustomizationVersionCode" in validResponseXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(agencyAssignedCustomizationVersionCode = Some(code), response = Some(Seq(randomValidResponse)))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "AgencyAssignedCustomizationVersionCode").text.trim
      }
    }


    "include FunctionCode" in validResponseXmlScenario() {
      val version = randomString(6)
      val expectedCode = randomDeclarationFunctionCode
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = Some(Seq(
        Response(expectedCode, Some("functionalRefId1"), declaration = Some(ResponseDeclaration()))
      )))

      hasExpectedOutput(meta, expectedCode) { xml =>
        (xml \ "Response" \ "FunctionCode").text.trim.toInt
      }
    }

    "include FunctionalReferenceID" in validResponseXmlScenario() {
      val version = randomString(6)
      val expectedCode = randomDeclarationFunctionCode
      val refId = "functionalRefId1"
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = Some(Seq(
        Response(expectedCode, Some(refId), declaration = Some(ResponseDeclaration()))
      )))

      hasExpectedOutput(meta, refId) { xml =>
        (xml \ "Response" \ "FunctionCode").text.trim.toInt
        (xml \ "Response" \ "FunctionalReferenceID").text.trim
      }
    }

    "include IssueDateTime" in validResponseXmlScenario() {
      val version = randomString(6)
      val expectedCode = randomDeclarationFunctionCode
      val refId = "functionalRefId1"

      val formatCode = randomDateTimeFormatCode
      val dateTime = randomDateTimeString

       val issueTime = Some(ResponseDateTimeElement(DateTimeString(formatCode, dateTime)))

      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = Some(Seq(
        Response(expectedCode, Some(refId), issueTime, declaration = Some(ResponseDeclaration()))
      )))

      hasExpectedOutput(meta, Seq(formatCode, dateTime)) { xml =>
        Seq(
          (xml \ "Response" \ "IssueDateTime" \ "DateTimeString" \ "@formatCode").text.trim,
          (xml \ "Response" \ "IssueDateTime" \ "DateTimeString").text.trim
        )
      }
    }

  }
}
