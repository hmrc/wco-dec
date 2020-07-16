/*
 * Copyright 2020 HM Revenue & Customs
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

package uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request

import uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request.ConsolidationRequestSpec._
import uk.gov.hmrc.wco.dec.{WcoSpec, XmlBehaviours}


class ConsolidationRequestToXmlSpec extends WcoSpec with XmlBehaviours{

  "InventoryLinkingConsolidationRequest serialized to Xml" should {

    "contain MessageCode" in validInventoryLinkingRequestXmlScenario() {
      val inventoryLinkingConsolidationRequest = InventoryLinkingConsolidationRequest(
        messageCode = messageCodeConsolidation
      )
      val expectedMessageCode = messageCodeConsolidation

      hasExpectedOutput(inventoryLinkingConsolidationRequest, expectedMessageCode) { xml =>
        (xml \ "messageCode").text.trim
      }

    }

    "contain masterUcr" in validInventoryLinkingRequestXmlScenario(){
      val inventoryLinkingConsolidationRequest = InventoryLinkingConsolidationRequest(
        messageCode = messageCodeConsolidation,
        masterUCR = Some(masterUCR)
      )
      val expectedMasterUCR = masterUCR

      hasExpectedOutput(inventoryLinkingConsolidationRequest, expectedMasterUCR) { xml =>
        (xml \ "masterUCR").text.trim
      }

    }

    "contain ucrBlock" in validInventoryLinkingRequestXmlScenario(){
      val inventoryLinkingConsolidationRequest = InventoryLinkingConsolidationRequest(
        messageCode = messageCodeConsolidation,
        ucrBlock = Some(ucrBlock)
      )
      val expectedUcrBlock = Seq(ucrBlock.ucr, ucrBlock.ucrPartNo.get, ucrBlock.ucrType)

      hasExpectedOutput(inventoryLinkingConsolidationRequest, expectedUcrBlock) { xml =>
        Seq(
          (xml \ "ucrBlock" \ "ucr").text.trim,
          (xml \ "ucrBlock" \ "ucrPartNo").text.trim,
          (xml \ "ucrBlock" \ "ucrType").text.trim
        )
      }
    }
  }

}
