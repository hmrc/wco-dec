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

package uk.gov.hmrc.wco.dec.inventorylinking.movement.response.input

import uk.gov.hmrc.wco.dec.inventorylinking.movement.response.InventoryLinkingMovementResponseSpec


object MovementResponseXMLProvider {

  def provideTestXMLFor(testName: String): String =
    inventoryMovementResponseOpenTag + testXmlContentMap(testName) + inventoryMovementResponseCloseTag

  private val inventoryMovementResponseOpenTag =
    "<inv:inventoryLinkingMovementResponse xmlns:inv=\"http://gov.uk/customs/inventoryLinking/v1\">"

  private val inventoryMovementResponseCloseTag = "</inv:inventoryLinkingMovementResponse>"

  private val messageCode =
    "<inv:messageCode>" + InventoryLinkingMovementResponseSpec.messageCodeMovement + "</inv:messageCode>"

  private val crc = "<inv:crc>" + InventoryLinkingMovementResponseSpec.crc + "</inv:crc>"

  private val goodsArrivalDateTime =
    "<inv:goodsArrivalDateTime>" +
      InventoryLinkingMovementResponseSpec.goodsArrivalDateTime +
    "</inv:goodsArrivalDateTime>"

  private val goodsLocation =
    "<inv:goodsLocation>" + InventoryLinkingMovementResponseSpec.goodsLocation + "</inv:goodsLocation>"

  private val shedOPID = "<inv:shedOPID>" + InventoryLinkingMovementResponseSpec.shedOPID + "</inv:shedOPID>"

  private val movementReference =
    "<inv:movementReference>" + InventoryLinkingMovementResponseSpec.movementReference + "</inv:movementReference>"

  private val submitRole = "<inv:submitRole>" + InventoryLinkingMovementResponseSpec.submitRole + "</inv:submitRole>"

  private val ucr = "<inv:ucr>" + InventoryLinkingMovementResponseSpec.movementUcr + "</inv:ucr>"

  private val ucrType = "<inv:ucrType>" + InventoryLinkingMovementResponseSpec.movementUcrType + "</inv:ucrType>"

  private val ucrBlock = "<inv:ucrBlock>" + ucr + ucrType + "</inv:ucrBlock>"

  private val commodityCode =
    "<inv:commodityCode>" + InventoryLinkingMovementResponseSpec.commodityCode + "</inv:commodityCode>"

  private val totalPackages =
    "<inv:totalPackages>" + InventoryLinkingMovementResponseSpec.totalPackages + "</inv:totalPackages>"

  private val totalNetMass =
    "<inv:totalNetMass>" + InventoryLinkingMovementResponseSpec.totalNetMass + "</inv:totalNetMass>"

  private val goodsItem = "<inv:goodsItem>" + commodityCode + totalPackages + totalNetMass + "</inv:goodsItem>"

  private val ics = "<inv:ics>" + InventoryLinkingMovementResponseSpec.ics + "</inv:ics>"

  private val roe = "<inv:roe>" + InventoryLinkingMovementResponseSpec.roe + "</inv:roe>"

  private val soe = "<inv:soe>" + InventoryLinkingMovementResponseSpec.soe + "</inv:soe>"

  private val entryStatus = "<inv:entryStatus>" + ics + roe + soe + "</inv:entryStatus>"

  private val testMessageCode = messageCode

  private val testCrc = messageCode + crc

  private val testArrivalDateTime = messageCode + goodsArrivalDateTime

  private val testGoodsLocation = messageCode + goodsLocation

  private val testShedOPID = messageCode + shedOPID

  private val testMovementReference = messageCode + movementReference

  private val testSubmitRole = messageCode + submitRole

  private val testUcrBlock = messageCode + ucrBlock

  private val testGoodsItem = messageCode + goodsItem

  private val testEntryStatus = messageCode + entryStatus

  private val testXmlContentMap: Map[String, String] = Map(
    "TestMessageCode" -> testMessageCode,
    "TestCrc" -> testCrc,
    "TestArrivalDateTime" -> testArrivalDateTime,
    "TestGoodsLocation" -> testGoodsLocation,
    "TestShedOPID" -> testShedOPID,
    "TestMovementReference" -> testMovementReference,
    "TestSubmitRole" -> testSubmitRole,
    "TestUcrBlock" -> testUcrBlock,
    "TestGoodsItem" -> testGoodsItem,
    "TestEntryStatus" -> testEntryStatus
  )
}
