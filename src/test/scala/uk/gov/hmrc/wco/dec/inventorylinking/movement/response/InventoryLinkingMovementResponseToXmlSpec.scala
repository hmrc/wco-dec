/*
 * Copyright 2024 HM Revenue & Customs
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

import uk.gov.hmrc.wco.dec._

class InventoryLinkingMovementResponseToXmlSpec extends WcoSpec with XmlBehaviours {
  import InventoryLinkingMovementResponseSpec._

  "to XML" should {
    "include message code" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse(messageCodeMovement)

      val expectedOutput = "EAA"

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "messageCode").text.trim
      }
    }

    "include crc" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse(messageCodeMovement, Some(crc))

      val expectedOutput = crc

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "crc").text.trim
      }
    }

    "include goods arrival date time" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, goodsArrivalDateTime = Some(goodsArrivalDateTime))

      val expectedOutput = goodsArrivalDateTime

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "goodsArrivalDateTime").text.trim
      }
    }

    "include goods location" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, goodsLocation = Some(goodsLocation))

      val expectedOutput = goodsLocation

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "goodsLocation").text.trim
      }
    }

    "include shedOPID" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, shedOPID = Some(shedOPID))

      val expectedOutput = shedOPID

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "shedOPID").text.trim
      }
    }

    "include movement reference" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, movementReference = Some(movementReference))

      val expectedOutput = movementReference

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "movementReference").text.trim
      }
    }

    "include submit role" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, submitRole = Some(submitRole))

      val expectedOutput = submitRole

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        (xml \ "submitRole").text.trim
      }
    }

    "include ucr block" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, ucrBlock = Some(ucrBlock))

      val expectedOutput = Seq(movementUcr, movementUcrPartNo, movementUcrType)

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        Seq(
          (xml \ "ucrBlock" \ "ucr").text.trim,
          (xml \ "ucrBlock" \ "ucrPartNo").text.trim,
          (xml \ "ucrBlock" \ "ucrType").text.trim
        )
      }
    }

    "include goods item" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, goodsItem = Some(goodsItem))

      val expectedOutput = Seq(commodityCode.toString, totalPackages.toString, totalNetMass.toString)

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        Seq(
          (xml \ "goodsItem" \ "commodityCode").text.trim,
          (xml \ "goodsItem" \ "totalPackages").text.trim,
          (xml \ "goodsItem" \ "totalNetMass").text.trim
        )
      }
    }

    "include entry status" in validInventoryLinkingResponseXmlScenario() {
      val inventoryLinkingMovementResponse =
        InventoryLinkingMovementResponse(messageCodeMovement, entryStatus = Some(entryStatus))

      val expectedOutput = Seq(ics, roe, soe)

      hasExpectedOutput(inventoryLinkingMovementResponse, expectedOutput) { xml =>
        Seq(
          (xml \ "entryStatus" \ "ics").text.trim,
          (xml \ "entryStatus" \ "roe").text.trim,
          (xml \ "entryStatus" \ "soe").text.trim
        )
      }
    }
  }
}
