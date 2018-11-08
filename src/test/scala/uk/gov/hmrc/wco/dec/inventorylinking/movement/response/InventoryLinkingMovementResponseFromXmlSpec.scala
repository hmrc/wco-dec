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

package uk.gov.hmrc.wco.dec.inventorylinking.movement.response

import uk.gov.hmrc.wco.dec.inventorylinking.movement.response.input._
import uk.gov.hmrc.wco.dec.{WcoSpec, XmlBehaviours}

class InventoryLinkingMovementResponseFromXmlSpec extends WcoSpec with XmlBehaviours {
  import InventoryLinkingMovementResponseSpec._

  "from Xml" should {
    "fill message code" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestMessageCode)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.messageCode must be (messageCodeMovement)
    }

    "fill crc" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestCrc)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.crcCode.isDefined must be (true)
      inventoryLinkingMovementResponse.crcCode.get must be (crc)
    }

    "fill goods arrival date time" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestArrivalDateTime)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.goodsArrivalDateTime.isDefined must be (true)
      inventoryLinkingMovementResponse.goodsArrivalDateTime.get must be (goodsArrivalDateTime)
    }

    "fill goods location" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestGoodsLocation)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.goodsLocation.isDefined must be (true)
      inventoryLinkingMovementResponse.goodsLocation.get must be (goodsLocation)
    }

    "fill shedOPID" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestShedOPID)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.shedOPID.isDefined must be (true)
      inventoryLinkingMovementResponse.shedOPID.get must be (shedOPID)
    }

    "fill movement request" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestMovementReference)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.movementReference.isDefined must be (true)
      inventoryLinkingMovementResponse.movementReference.get must be (movementReference)
    }

    "fill submit role" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestSubmitRole)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.submitRole.isDefined must be (true)
      inventoryLinkingMovementResponse.submitRole.get must be (submitRole)
    }

    "fill ucr block" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestUcrBlock)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.ucrBlock.isDefined must be (true)
      inventoryLinkingMovementResponse.ucrBlock.get.ucr must be (movementUcr)
      inventoryLinkingMovementResponse.ucrBlock.get.ucrType must be (movementUcrType)
    }

    "fill goods item" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestGoodsItem)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.goodsItem.isDefined must be (true)
      inventoryLinkingMovementResponse.goodsItem.get.commodityCode.isDefined must be (true)
      inventoryLinkingMovementResponse.goodsItem.get.commodityCode.get must be (commodityCode)
      inventoryLinkingMovementResponse.goodsItem.get.totalNetMass.isDefined must be (true)
      inventoryLinkingMovementResponse.goodsItem.get.totalNetMass.get must be (totalNetMass)
      inventoryLinkingMovementResponse.goodsItem.get.totalPackages.isDefined must be (true)
      inventoryLinkingMovementResponse.goodsItem.get.totalPackages.get must be (totalPackages)
    }

    "fill entry status" in {
      val inputXml = MovementResponseXMLProvider.provideTestXMLFor(TestEntryStatus)
      val inventoryLinkingMovementResponse = InventoryLinkingMovementResponse.fromXml(inputXml)

      inventoryLinkingMovementResponse.entryStatus.isDefined must be (true)
      inventoryLinkingMovementResponse.entryStatus.get.ics.isDefined must be (true)
      inventoryLinkingMovementResponse.entryStatus.get.ics.get must be (ics)
      inventoryLinkingMovementResponse.entryStatus.get.roe.isDefined must be (true)
      inventoryLinkingMovementResponse.entryStatus.get.roe.get must be (roe)
      inventoryLinkingMovementResponse.entryStatus.get.soe.isDefined must be (true)
      inventoryLinkingMovementResponse.entryStatus.get.soe.get must be (soe)
    }
  }
}
