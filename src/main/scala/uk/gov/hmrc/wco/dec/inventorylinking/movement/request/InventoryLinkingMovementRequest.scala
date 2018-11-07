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

package uk.gov.hmrc.wco.dec.inventorylinking.movement.request

import java.io.StringWriter
import java.util.Properties

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.{JacksonXmlProperty, JacksonXmlRootElement}
import uk.gov.hmrc.wco.dec.utilities.JacksonMapper

import scala.collection.JavaConverters._


object InventoryLinkingMovementRequest extends JacksonMapper {
  final val namespace = "http://gov.uk/customs/inventoryLinking/v1"

  def fromXml(xml: String): InventoryLinkingMovementRequest =
    _xml.readValue(xml, classOf[InventoryLinkingMovementRequest])

  def fromProperties(props: Map[String, String]): InventoryLinkingMovementRequest = {
    val p = new Properties()
    p.putAll(props.asJava)
    _props.readPropertiesAs(p, _schema, classOf[InventoryLinkingMovementRequest])
  }
}

@JsonIgnoreProperties(Array("_xml", "_schema", "_props"))
@JacksonXmlRootElement(localName = "inventoryLinkingMovementRequest", namespace = InventoryLinkingMovementRequest.namespace)
case class InventoryLinkingMovementRequest(

  @JacksonXmlProperty(localName = "messageCode", namespace = InventoryLinkingMovementRequest.namespace)
  messageCode: String,  // Enumeration values: EAA, EAL, EDL

  @JacksonXmlProperty(localName = "agentDetails", namespace = InventoryLinkingMovementRequest.namespace)
  agentDetails: Option[AgentDetails] = None,

  @JacksonXmlProperty(localName = "ucrBlock", namespace = InventoryLinkingMovementRequest.namespace)
  ucrBlock: UcrBlock,

  @JacksonXmlProperty(localName = "goodsLocation", namespace = InventoryLinkingMovementRequest.namespace)
  goodsLocation: String,  // max 17 chars

  @JacksonXmlProperty(localName = "goodsArrivalDateTime", namespace = InventoryLinkingMovementRequest.namespace)
  goodsArrivalDateTime: Option[String] = None,

  @JacksonXmlProperty(localName = "goodsDepartureDateTime", namespace = InventoryLinkingMovementRequest.namespace)
  goodsDepartureDateTime: Option[String] = None,

  @JacksonXmlProperty(localName = "shedOPID", namespace = InventoryLinkingMovementRequest.namespace)
  shedOPID: Option[String] = None,  // max 3 chars

  @JacksonXmlProperty(localName = "masterUCR", namespace = InventoryLinkingMovementRequest.namespace)
  masterUCR: Option[String] = None,   // max 35 chars

  @JacksonXmlProperty(localName = "masterOpt", namespace = InventoryLinkingMovementRequest.namespace)
  masterOpt: Option[String] = None,   // Enumeration values: A, F, R, X

  @JacksonXmlProperty(localName = "movementReference", namespace = InventoryLinkingMovementRequest.namespace)
  movementReference: Option[String] = None,   // max 25 chars

  @JacksonXmlProperty(localName = "transportDetails", namespace = InventoryLinkingMovementRequest.namespace)
  transportDetails: Option[TransportDetails] = None

) extends JacksonMapper {

  def toXml: String = {
    val sw = new StringWriter()
    _xml.writeValue(sw, this)
    sw.toString
  }

  def toProperties: Map[String, String] = _props.writeValueAsProperties(this, _schema).asScala.toMap

}


case class AgentDetails(
  @JacksonXmlProperty(localName = "EORI", namespace = InventoryLinkingMovementRequest.namespace)
  eori: Option[String] = None,  // max 17 chars

  @JacksonXmlProperty(localName = "agentLocation", namespace = InventoryLinkingMovementRequest.namespace)
  agentLocation: Option[String] = None,   // max 12 chars

  @JacksonXmlProperty(localName = "agentRole", namespace = InventoryLinkingMovementRequest.namespace)
  agentRole: Option[String] = None  // max 3 chars
)

case class UcrBlock(
  @JacksonXmlProperty(localName = "ucr", namespace = InventoryLinkingMovementRequest.namespace)
  ucr: String,  // max 35 chars

  @JacksonXmlProperty(localName = "ucrType", namespace = InventoryLinkingMovementRequest.namespace)
  ucrType: String   // Enumeration values: D, M
)

case class TransportDetails(
  @JacksonXmlProperty(localName = "transportID", namespace = InventoryLinkingMovementRequest.namespace)
  transportID: Option[String] = None,   // max 35 chars

  @JacksonXmlProperty(localName = "transportMode", namespace = InventoryLinkingMovementRequest.namespace)
  transportMode: Option[String] = None,   // max 1 char

  @JacksonXmlProperty(localName = "transportNationality", namespace = InventoryLinkingMovementRequest.namespace)
  transportNationality: Option[String] = None   // max 2 chars
)
