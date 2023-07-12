/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.{JacksonXmlProperty, JacksonXmlRootElement}
import uk.gov.hmrc.wco.dec.inventorylinking.common.UcrBlock
import uk.gov.hmrc.wco.dec.inventorylinking.movement.request.InventoryLinkingMovementRequest
import uk.gov.hmrc.wco.dec.utilities.JacksonMapper

import java.io.StringWriter
import java.util.Properties
import scala.collection.JavaConverters.propertiesAsScalaMapConverter

object InventoryLinkingConsolidationRequest extends JacksonMapper {
  final val inventoryLinking = "http://gov.uk/customs/inventoryLinking/v1"

  def fromXml(xml: String): InventoryLinkingConsolidationRequest = _xml.readValue(xml, classOf[InventoryLinkingConsolidationRequest])

  def fromProperties(props: Map[String, String]): InventoryLinkingConsolidationRequest = {
    val p = new Properties()
    props.foreach(v => p.put(v._1, v._2))
    _props.readPropertiesAs(p, _schema, classOf[InventoryLinkingConsolidationRequest])
  }
}

@JsonIgnoreProperties(Array("_xml", "_schema", "_props" ))
@JacksonXmlRootElement(localName = "inventoryLinkingConsolidationRequest", namespace = InventoryLinkingMovementRequest.namespace)
case class InventoryLinkingConsolidationRequest(
  @JacksonXmlProperty(localName = "messageCode", namespace = InventoryLinkingMovementRequest.namespace)
  messageCode: String,

  @JacksonXmlProperty(localName = "masterUCR", namespace = InventoryLinkingMovementRequest.namespace)
  masterUCR: Option[String] = None,

  @JacksonXmlProperty(localName = "ucrBlock", namespace = InventoryLinkingMovementRequest.namespace)
  ucrBlock: Option[UcrBlock] = None

) extends JacksonMapper {

  def toXml: String = {
      val sw = new StringWriter()
      _xml.writeValue(sw, this)
      sw.toString
  }

  def toProperties: Map[String, String] = _props.writeValueAsProperties(this, _schema).asScala.toMap

}