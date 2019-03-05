/*
 * Copyright 2019 HM Revenue & Customs
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

import uk.gov.hmrc.wco.dec.inventorylinking.movement.request.InventoryLinkingMovementRequestSpec._
import uk.gov.hmrc.wco.dec.{WcoSpec, XmlBehaviours}


class InventoryLinkingMovementRequestToXmlSpec extends WcoSpec with XmlBehaviours {

  "InventoryLinkingMovementRequest serialized to Xml" should {

    "contain messageCode" in validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation
      )
      val expectedMessageCode = messageCodeMovement

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedMessageCode) { xml =>
        (xml \ "messageCode").text.trim
      }
    }

    "contain agentDetails" in validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        agentDetails = Some(agentDetails),
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation
      )
      val expectedAgentDetails: Seq[String] =
        Seq(agentDetails.eori.get, agentDetails.agentLocation.get, agentDetails.agentRole.get)

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedAgentDetails) { xml =>
        Seq(
          (xml \ "agentDetails" \ "EORI").text.trim,
          (xml \ "agentDetails" \ "agentLocation").text.trim,
          (xml \ "agentDetails" \ "agentRole").text.trim
        )
      }
    }

    "contain ucrBlock" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation
      )
      val expectedUcrBlock: Seq[String] = Seq(ucrBlock.ucr, ucrBlock.ucrType)

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedUcrBlock) { xml =>
        Seq(
          (xml \ "ucrBlock" \ "ucr").text.trim,
          (xml \ "ucrBlock" \ "ucrType").text.trim
        )
      }
    }

    "contain goodsLocation" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation
      )
      val expectedGoodsLocation: String = goodsLocation

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedGoodsLocation) { xml =>
        (xml \ "goodsLocation").text.trim
      }
    }

    "contain goodsArrivalDateTime" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        goodsArrivalDateTime = Some(goodsArrivalDateTime)
      )
      val expectedGoodsArrivalDateTime: String = goodsArrivalDateTime

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedGoodsArrivalDateTime) { xml =>
        (xml \ "goodsArrivalDateTime").text.trim
      }
    }

    "contain goodsDepartureDateTime" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        goodsDepartureDateTime = Some(goodsDepartureDateTime)
      )
      val expectedGoodsDepartureDateTime: String = goodsDepartureDateTime

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedGoodsDepartureDateTime) { xml =>
        (xml \ "goodsDepartureDateTime").text.trim
      }
    }

    "contain shedOPID" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        shedOPID = Some(shedOPID)
      )
      val expectedShedOPID = shedOPID

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedShedOPID) { xml =>
        (xml \ "shedOPID").text.trim
      }
    }

    "contain masterUCR" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        masterUCR = Some(masterUCR)
      )
      val expectedMasterUCR = masterUCR

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedMasterUCR) { xml =>
        (xml \ "masterUCR").text.trim
      }
    }

    "contain masterOpt" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        masterOpt = Some(masterOpt)
      )
      val expectedMasterOpt = masterOpt

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedMasterOpt) { xml =>
        (xml \ "masterOpt").text.trim
      }
    }

    "contain movementReference" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        movementReference = Some(movementReference)
      )
      val expectedMovementReference = movementReference

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedMovementReference) { xml =>
        (xml \ "movementReference").text.trim
      }
    }

    "contain transportDetails" in  validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation,
        transportDetails = Some(transportDetails)
      )

      val expectedTransportDetails: Seq[String] = Seq(
        transportDetails.transportID.get,
        transportDetails.transportMode.get,
        transportDetails.transportNationality.get
      )

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedTransportDetails) { xml =>
        Seq(
          (xml \ "transportDetails" \ "transportID").text.trim,
          (xml \ "transportDetails" \ "transportMode").text.trim,
          (xml \ "transportDetails" \ "transportNationality").text.trim
        )
      }
    }
  }
}
