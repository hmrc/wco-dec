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

import uk.gov.hmrc.wco.dec.inventorylinking.InventoryLinkingMovementRequest
import uk.gov.hmrc.wco.dec.inventorylinking.movement.request.MovementRequestSpec._
import uk.gov.hmrc.wco.dec.inventorylinking.movement.request.input._
import uk.gov.hmrc.wco.dec.{WcoSpec, XmlBehaviours}


class MovementRequestFromXmlSpec extends WcoSpec with XmlBehaviours {

  "InventoryLinkingMovementRequest deserialized from XML" when {

    "no tag present" should {
      "fill optional field with None" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestNoTagForOptionalField)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)

        actualMovementRequest.shedOPID mustNot be(defined)
      }
    }

    "value is not provided" should {
      "fill optional field with None" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestNoValueForOptionalField)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)

        actualMovementRequest.shedOPID mustNot be(defined)
      }
    }

    "value is provided" should {
      "fill messageCode" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestMessageCode)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedMessageCode = messageCodeMovement

        actualMovementRequest.messageCode must equal(expectedMessageCode)
      }

      "fill agentDetails" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestAgentDetails)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedAgentDetails = agentDetails

        actualMovementRequest.agentDetails must be(defined)
        val actualAgentDetails = actualMovementRequest.agentDetails.get

        actualAgentDetails.eori must be(defined)
        actualAgentDetails.eori.get must equal(expectedAgentDetails.eori.get)
        actualAgentDetails.agentLocation must be(defined)
        actualAgentDetails.agentLocation.get must equal(expectedAgentDetails.agentLocation.get)
        actualAgentDetails.agentRole must be(defined)
        actualAgentDetails.agentRole.get must equal(expectedAgentDetails.agentRole.get)
      }

      "fill ucrBlock" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestUcrBlock)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedUcrBlock = ucrBlock

        actualMovementRequest.ucrBlock.ucr must equal(expectedUcrBlock.ucr)
        actualMovementRequest.ucrBlock.ucrType must equal(expectedUcrBlock.ucrType)
      }

      "fill goodsLocation" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestGoodsLocation)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedGoodsLocation = goodsLocation

        actualMovementRequest.goodsLocation must equal(expectedGoodsLocation)
      }

      "fill goodsArrivalDateTime" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestGoodsArrivalDateTime)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedGoodsArrivalDateTime = goodsArrivalDateTime

        actualMovementRequest.goodsArrivalDateTime must be(defined)
        actualMovementRequest.goodsArrivalDateTime.get must equal(expectedGoodsArrivalDateTime)
      }

      "fill goodsDepartureDateTime" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestGoodsDepartureDateTime)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedGoodsDepartureDateTime = goodsDepartureDateTime

        actualMovementRequest.goodsDepartureDateTime must be(defined)
        actualMovementRequest.goodsDepartureDateTime.get must equal(expectedGoodsDepartureDateTime)
      }

      "fill shedOPID" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestShedOPID)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedShedOPID = shedOPID

        actualMovementRequest.shedOPID must be(defined)
        actualMovementRequest.shedOPID.get must equal(expectedShedOPID)
      }

      "fill masterUCR" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestMasterUCR)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedMasterUCR = masterUCR

        actualMovementRequest.masterUCR must be(defined)
        actualMovementRequest.masterUCR.get must equal(expectedMasterUCR)
      }

      "fill masterOpt" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestMasterOpt)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedMasterOpt = masterOpt

        actualMovementRequest.masterOpt must be(defined)
        actualMovementRequest.masterOpt.get must equal(expectedMasterOpt)
      }

      "fill movementReference" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestMovementReference)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedMovementReference = movementReference

        actualMovementRequest.movementReference must be(defined)
        actualMovementRequest.movementReference.get must equal(expectedMovementReference)
      }

      "fill transportDetails" in {
        val inputXML = MovementRequestSpecInputXMLProvider.provideTestXMLFor(TestTransportDetails)
        val actualMovementRequest = InventoryLinkingMovementRequest.fromXml(inputXML)
        val expectedTransportDetails = transportDetails

        actualMovementRequest.transportDetails must be(defined)
        val actualTransportDetails = actualMovementRequest.transportDetails.get

        actualTransportDetails.transportID must be(defined)
        actualTransportDetails.transportID.get must equal(expectedTransportDetails.transportID.get)
        actualTransportDetails.transportMode must be(defined)
        actualTransportDetails.transportMode.get must equal(expectedTransportDetails.transportMode.get)
        actualTransportDetails.transportNationality must be(defined)
        actualTransportDetails.transportNationality.get must equal(expectedTransportDetails.transportNationality.get)
      }
    }

  }
}
