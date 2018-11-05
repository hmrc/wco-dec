/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICEInventoryLinkingMovementRequestE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIOInventoryLinkingMovementRequest OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.wco.dec.inventorylinking

import java.io.StringWriter

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.dataformat.xml.annotation.{JacksonXmlProperty, JacksonXmlRootElement, JacksonXmlText}
import uk.gov.hmrc.wco.dec.StdAttributeAndTextDeserializer
import uk.gov.hmrc.wco.dec.utilities.JacksonMapper

object InventoryLinkingMovementRequest extends JacksonMapper {
  final val namespace = "http://gov.uk/customs/inventoryLinking/v1"

  def fromXml(xml: String): InventoryLinkingMovementRequest =
    _xml.readValue(xml, classOf[InventoryLinkingMovementRequest])

}

@JsonIgnoreProperties(Array("_xml", "_schema", "_props"))
@JacksonXmlRootElement(localName = "InventoryLinkingMovementRequest", namespace = InventoryLinkingMovementRequest.namespace)
case class InventoryLinkingMovementRequest(

  @JacksonXmlProperty(localName = "messageCode", namespace = InventoryLinkingMovementRequest.namespace)
  messageCode: String,

  @JacksonXmlProperty(localName = "agentDetails", namespace = InventoryLinkingMovementRequest.namespace)
  agentDetails: Option[AgentDetails] = None,

  @JacksonXmlProperty(localName = "ucrBlock", namespace = InventoryLinkingMovementRequest.namespace)
  ucrBlock: UcrBlock,

  @JacksonXmlProperty(localName = "goodsLocation", namespace = InventoryLinkingMovementRequest.namespace)
  goodsLocation: String,

  @JacksonXmlProperty(localName = "goodsArrivalDateTime", namespace = InventoryLinkingMovementRequest.namespace)
  goodsArrivalDateTime: Option[DateTime] = None,

  @JacksonXmlProperty(localName = "goodsDepartureDateTime", namespace = InventoryLinkingMovementRequest.namespace)
  goodsDepartureDateTime: Option[DateTime] = None,

  @JacksonXmlProperty(localName = "shedOPID", namespace = InventoryLinkingMovementRequest.namespace)
  shedOPID: Option[String] = None,

  @JacksonXmlProperty(localName = "masterUCR", namespace = InventoryLinkingMovementRequest.namespace)
  masterUCR: Option[String] = None,

  @JacksonXmlProperty(localName = "masterOpt", namespace = InventoryLinkingMovementRequest.namespace)
  masterOpt: Option[String] = None,

  @JacksonXmlProperty(localName = "movementReference", namespace = InventoryLinkingMovementRequest.namespace)
  movementReference: Option[String] = None,

  @JacksonXmlProperty(localName = "transportDetails", namespace = InventoryLinkingMovementRequest.namespace)
  transportDetails: Option[TransportDetails] = None

) extends JacksonMapper {

  def toXml: String = {
    val sw = new StringWriter()
    _xml.writeValue(sw, this)
    sw.toString
  }

}

case class MessageCodeMovement(
  @JacksonXmlProperty(localName = "messageCodeMovement", namespace = InventoryLinkingMovementRequest.namespace)
  codeMovement: String // values EAA, EAL, EDL - enumerations
)

case class AgentDetails(
  @JacksonXmlProperty(localName = "EORI", namespace = InventoryLinkingMovementRequest.namespace)
  eori: Option[String] = None,

  @JacksonXmlProperty(localName = "agentLocation", namespace = InventoryLinkingMovementRequest.namespace)
  agentLocation: Option[String] = None,

  @JacksonXmlProperty(localName = "agentRole", namespace = InventoryLinkingMovementRequest.namespace)
  agentRole: Option[String] = None
)

case class UcrBlock(
  @JacksonXmlProperty(localName = "ucr", namespace = InventoryLinkingMovementRequest.namespace)
  ucr: String,

  @JacksonXmlProperty(localName = "ucrType", namespace = InventoryLinkingMovementRequest.namespace)
  ucrType: String
)

@JsonDeserialize(using = classOf[DateTimeDeserializer])
case class DateTime(
  @JacksonXmlProperty(isAttribute = true)
  formatCode: Option[String] = None,

  @JacksonXmlText
  value: Option[String] = None
)

class DateTimeDeserializer extends StdAttributeAndTextDeserializer[DateTime]("formatCode", classOf[DateTime]) {

  override def newInstanceFromTuple(values: (Option[String], Option[String])): DateTime = DateTime(values._1, values._2)

}

case class TransportDetails(
  @JacksonXmlProperty(localName = "transportID", namespace = InventoryLinkingMovementRequest.namespace)
  transportID: Option[String] = None,

  @JacksonXmlProperty(localName = "transportMode", namespace = InventoryLinkingMovementRequest.namespace)
  transportMode: Option[String] = None,

  @JacksonXmlProperty(localName = "transportNationality", namespace = InventoryLinkingMovementRequest.namespace)
  transportNationality: Option[String] = None
)
