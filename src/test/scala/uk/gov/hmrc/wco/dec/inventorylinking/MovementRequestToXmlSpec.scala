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

package uk.gov.hmrc.wco.dec.inventorylinking

import uk.gov.hmrc.wco.dec.{WcoSpec, XmlBehaviours}

object MovementRequestToXmlSpec extends WcoSpec {
  val messageCodeMovementValues = Seq("EAA", "EAL", "EDL")
  val ucrTypeValues = Seq("D", "M")
  val masterOptValues = Seq("A", "F", "R", "X")

  val messageCodeMovement: String = messageCodeMovementValues(randomInt(messageCodeMovementValues.length))
  val agentDetails: AgentDetails = AgentDetails(
    Some(randomString(17)),
    Some(randomString(12)),
    Some(randomString(3))
  )
  val ucrBlock: UcrBlock = UcrBlock(randomString(35), ucrTypeValues(randomInt(ucrTypeValues.length)))
  val goodsLocation: String = randomString(17)
  val dateTimeFormatCode: String = randomDateTimeFormatCode
  val dateTime: String = randomDateTimeString
  val goodsArrivalDateTime: DateTime = DateTime(Some(dateTimeFormatCode), Some(dateTime))
  val goodsDepartureDateTime: DateTime = DateTime(Some(dateTimeFormatCode), Some(dateTime))
  val shedOPID: String = randomString(3)
  val masterUCR: String = randomString(35)
  val masterOpt: String = masterOptValues(randomInt(masterOptValues.length))
  val movementReference: String = randomString(25)
  val transportDetails: TransportDetails = TransportDetails(
    Some(randomString(35)),
    Some(randomString(1)),
    Some(randomString(2))
  )
}

class MovementRequestToXmlSpec extends WcoSpec with XmlBehaviours {
  import MovementRequestToXmlSpec._

  "MovementRequest serialized to Xml" should {

    "contain messageCode" in validInventoryLinkingMovementRequestXmlScenario() {
      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(
        messageCode = messageCodeMovement,
        ucrBlock = ucrBlock,
        goodsLocation = goodsLocation
      )
      val expectedOutput = messageCodeMovement

      hasExpectedOutput(inventoryLinkingMovementRequest, expectedOutput) { xml =>
        (xml \ "messageCode").text.trim
      }
    }

    "contain agentDetails" in validInventoryLinkingMovementRequestXmlScenario() {
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
//
//    "contain ucrBlock" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      val expectedUcrBlock: Seq[String] = Seq(ucrBlock.ucr, ucrBlock.ucrType)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, expectedUcrBlock) { xml =>
//        Seq(
//          (xml \ "ucrBlock" \ "ucr").text.trim,
//          (xml \ "ucrBlock" \ "ucrType").text.trim
//        )
//      }
//    }
//
//    "contain goodsLocation" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, goodsLocation) { xml =>
//        (xml \ "goodsLocation").text.trim
//      }
//    }
//
//    "contain goodsArrivalDateTime" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      val expectedGoodsArrivalDateTime: Seq[String] =
//        Seq(goodsArrivalDateTime.formatCode.get, goodsArrivalDateTime.value.get)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, expectedGoodsArrivalDateTime) { xml =>
//        Seq(
//          (xml \ "goodsArrivalDateTime" \ "@formatCode").text.trim,
//          (xml \ "goodsArrivalDateTime").text.trim
//        )
//      }
//    }
//
//    "contain goodsDepartureDateTime" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      val expectedGoodsDepartureDateTime: Seq[String] =
//        Seq(goodsDepartureDateTime.formatCode.get, goodsDepartureDateTime.value.get)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, expectedGoodsDepartureDateTime) { xml =>
//        Seq(
//          (xml \ "goodsDepartureDateTime" \ "@formatCode").text.trim,
//          (xml \ "goodsDepartureDateTime").text.trim
//        )
//      }
//    }
//
//    "contain shedOPID" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, shedOPID) { xml =>
//        (xml \ "shedOPID").text.trim
//      }
//    }
//
//    "contain masterUCR" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, masterUCR) { xml =>
//        (xml \ "masterUCR").text.trim
//      }
//    }
//
//    "contain masterOpt" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, masterOpt) { xml =>
//        (xml \ "masterOpt").text.trim
//      }
//    }
//
//    "contain movementReference" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, movementReference) { xml =>
//        (xml \ "movementReference").text.trim
//      }
//    }
//
//    "contain transportDetails" in validResponseXmlScenario() {
//      val messageCodeMovement = MessageCodeMovement(messageCodeMovementValue)
//      val inventoryLinkingMovementRequest = InventoryLinkingMovementRequest(messageCodeMovement)
//
//      val expectedTransportDetails: Seq[String] = Seq(
//        transportDetails.transportID.get,
//        transportDetails.transportMode.get,
//        transportDetails.transportNationality.get
//      )
//
//      hasExpectedOutput(inventoryLinkingMovementRequest, expectedTransportDetails) { xml =>
//        Seq(
//          (xml \ "transportDetails" \ "transportID").text.trim,
//          (xml \ "transportDetails" \ "transportMode").text.trim,
//          (xml \ "transportDetails" \ "transportNationality").text.trim
//        )
//      }
//    }
  }
}
