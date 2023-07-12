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

package uk.gov.hmrc.wco.dec.inventorylinking.movement.response

import java.io.StringWriter
import java.util.Properties
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.{JacksonXmlProperty, JacksonXmlRootElement}
import uk.gov.hmrc.wco.dec.inventorylinking.common.{EntryStatus, GoodsItem, UcrBlock}
import uk.gov.hmrc.wco.dec.utilities.JacksonMapper

import scala.collection.JavaConverters.propertiesAsScalaMapConverter


@JsonIgnoreProperties(Array("_xml", "_schema", "_props"))
@JacksonXmlRootElement(namespace = InventoryLinkingMovementResponse.namespace, localName = "inventoryLinkingMovementResponse")
case class InventoryLinkingMovementResponse(
  @JacksonXmlProperty(localName = "messageCode", namespace = InventoryLinkingMovementResponse.namespace)
  messageCode: String, // values EAA, EAL, EDL - enumerations

  @JacksonXmlProperty(localName = "crc", namespace = InventoryLinkingMovementResponse.namespace)
  crcCode: Option[String] = None, // length = 3

  @JacksonXmlProperty(localName = "goodsArrivalDateTime", namespace = InventoryLinkingMovementResponse.namespace)
  goodsArrivalDateTime: Option[String] = None,

  @JacksonXmlProperty(localName = "goodsLocation", namespace = InventoryLinkingMovementResponse.namespace)
  goodsLocation: Option[String] = None, // max length = 17

  @JacksonXmlProperty(localName = "shedOPID", namespace = InventoryLinkingMovementResponse.namespace)
  shedOPID: Option[String] = None, // max length = 3

  @JacksonXmlProperty(localName = "movementReference", namespace = InventoryLinkingMovementResponse.namespace)
  movementReference: Option[String] = None, // max length = 25

  @JacksonXmlProperty(localName = "submitRole", namespace = InventoryLinkingMovementResponse.namespace)
  submitRole: Option[String] = None, // max length = 35

  @JacksonXmlProperty(localName = "ucrBlock", namespace = InventoryLinkingMovementResponse.namespace)
  ucrBlock: Option[UcrBlock] = None,

  @JacksonXmlProperty(localName = "goodsItem", namespace = InventoryLinkingMovementResponse.namespace)
  goodsItem: Option[GoodsItem] = None,

  @JacksonXmlProperty(localName = "entryStatus", namespace = InventoryLinkingMovementResponse.namespace)
  entryStatus: Option[EntryStatus] = None
) extends JacksonMapper {

  def toXml: String = {
    val sw = new StringWriter()
    _xml.writeValue(sw, this)
    sw.toString
  }

  def toProperties: Map[String, String] = _props.writeValueAsProperties(this, _schema).asScala.toMap
}

object InventoryLinkingMovementResponse extends JacksonMapper {

  final val namespace = "http://gov.uk/customs/inventoryLinking/v1"

  def fromXml(xml: String): InventoryLinkingMovementResponse =
    _xml.readValue(xml, classOf[InventoryLinkingMovementResponse])

  def fromProperties(props: Map[String, String]): InventoryLinkingMovementResponse = {
    val p = new Properties()
    props.foreach(v => p.put(v._1, v._2))
    _props.readPropertiesAs(p, _schema, classOf[InventoryLinkingMovementResponse])
  }
}
