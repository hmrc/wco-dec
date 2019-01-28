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

package uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request

import uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request.ConsolidationRequestSpec._
import uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request.input.ConsolidationRequestSpecInputXMLProvider
import uk.gov.hmrc.wco.dec.{WcoSpec, XmlBehaviours}

class ConsolidationRequestFromXmlSpec extends WcoSpec with XmlBehaviours {

  "InventoryLinkingConsolidationRequest deserialized from XML" when {

    "no tag present" should {
      "fill optional field with None" in {
        val inputXML = ConsolidationRequestSpecInputXMLProvider.provideTestXMLForConsolidationRequest("TestNoTagForOptionalField")
        val actualConsolidationRequest = InventoryLinkingConsolidationRequest.fromXml(inputXML)

        actualConsolidationRequest.ucrBlock mustNot be(defined)
      }
    }

    "value is not provided" should {
      "fill optional field with None" in {
        val inputXML = ConsolidationRequestSpecInputXMLProvider.provideTestXMLForConsolidationRequest("TestNoValueForOptionalField")
        val actualConsolidationRequest = InventoryLinkingConsolidationRequest.fromXml(inputXML)

        actualConsolidationRequest.ucrBlock mustNot be(defined)
      }

    }

    "value is provided" should {
      "fill messageCode" in {
        val inputXML = ConsolidationRequestSpecInputXMLProvider.provideTestXMLForConsolidationRequest("TestMessageCode")
        val actualConsolidationRequest = InventoryLinkingConsolidationRequest.fromXml(inputXML)
        val expectedMessageCode = messageCodeConsolidation

        actualConsolidationRequest.messageCode must be(expectedMessageCode)
      }

      "fill transactionType" in {
        val inputXML = ConsolidationRequestSpecInputXMLProvider.provideTestXMLForConsolidationRequest("TestTransactionType")
        val actualConsolidationRequest = InventoryLinkingConsolidationRequest.fromXml(inputXML)
        val expectedTransactionType = transactionType

        actualConsolidationRequest.transactionType must be(expectedTransactionType)

      }

      "fill masterUCR" in {
        val inputXML = ConsolidationRequestSpecInputXMLProvider.provideTestXMLForConsolidationRequest("TestMasterUCR")
        val actualConsolidationRequest = InventoryLinkingConsolidationRequest.fromXml(inputXML)
        val expectedMasterUCR = masterUCR

        actualConsolidationRequest.masterUCR must be(defined)
        actualConsolidationRequest.masterUCR.get must be(expectedMasterUCR)
      }

      "fill ucrBlock" in {
        val inputXml = ConsolidationRequestSpecInputXMLProvider.provideTestXMLForConsolidationRequest("TestUcrBlock")
        val actualConsolidationRequest = InventoryLinkingConsolidationRequest.fromXml(inputXml)
        val expectedUcrBlock = ucrBlock
        
        actualConsolidationRequest.ucrBlock.get.ucr must be(expectedUcrBlock.ucr)
        actualConsolidationRequest.ucrBlock.get.ucrType must be(expectedUcrBlock.ucrType)
      }
    }
  }
}
