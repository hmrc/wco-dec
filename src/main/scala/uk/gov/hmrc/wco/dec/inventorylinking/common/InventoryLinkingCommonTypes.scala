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

package uk.gov.hmrc.wco.dec.inventorylinking.common

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import uk.gov.hmrc.wco.dec.inventorylinking.movement.request.InventoryLinkingMovementRequest
import uk.gov.hmrc.wco.dec.inventorylinking.movement.response.InventoryLinkingMovementResponse

case class AgentDetails(
  @JacksonXmlProperty(localName = "EORI", namespace = InventoryLinkingMovementRequest.namespace)
  eori: Option[String] = None,  // max 17 chars

  @JacksonXmlProperty(localName = "agentLocation", namespace = InventoryLinkingMovementRequest.namespace)
  agentLocation: Option[String] = None,   // max 12 chars

  @JacksonXmlProperty(localName = "agentRole", namespace = InventoryLinkingMovementRequest.namespace)
  agentRole: Option[String] = None  // max 3 chars
)

case class EntryStatus(
  @JacksonXmlProperty(localName = "ics", namespace = InventoryLinkingMovementResponse.namespace)
  ics: Option[String], //min length: 1, max length: 2

  @JacksonXmlProperty(localName = "roe", namespace = InventoryLinkingMovementResponse.namespace)
  roe: Option[String], //min length: 1, max length: 2

  @JacksonXmlProperty(localName = "soe", namespace = InventoryLinkingMovementResponse.namespace)
  soe: Option[String] //min length: 1, max length: 2
)

case class GoodsItem(
  @JacksonXmlProperty(localName = "commodityCode", namespace = InventoryLinkingMovementResponse.namespace)
  @JsonDeserialize(contentAs = classOf[java.lang.Integer])
  commodityCode: Option[Int], // positive integer - 8 digits

  @JacksonXmlProperty(localName = "totalPackages", namespace = InventoryLinkingMovementResponse.namespace)
  @JsonDeserialize(contentAs = classOf[java.lang.Integer])
  totalPackages: Option[Int], // positive integer - 8 digits

  @JacksonXmlProperty(localName = "totalNetMass", namespace = InventoryLinkingMovementResponse.namespace)
  totalNetMass: Option[BigDecimal] // fraction digits: 4, value: 0-9999999999999999
)

case class TransportDetails(
  @JacksonXmlProperty(localName = "transportID", namespace = InventoryLinkingMovementRequest.namespace)
  transportID: Option[String] = None,   // max 35 chars

  @JacksonXmlProperty(localName = "transportMode", namespace = InventoryLinkingMovementRequest.namespace)
  transportMode: Option[String] = None,   // max 1 char

  @JacksonXmlProperty(localName = "transportNationality", namespace = InventoryLinkingMovementRequest.namespace)
  transportNationality: Option[String] = None   // max 2 chars
)

case class UcrBlock(
  @JacksonXmlProperty(localName = "ucr", namespace = InventoryLinkingMovementRequest.namespace)
  ucr: String,  // max 35 chars

  @JacksonXmlProperty(localName = "ucrPartNo", namespace = InventoryLinkingMovementRequest.namespace)
  ucrPartNo: Option[String],  // 1-3 digits

  @JacksonXmlProperty(localName = "ucrType", namespace = InventoryLinkingMovementRequest.namespace)
  ucrType: String   // Enumeration values: D, M
)
