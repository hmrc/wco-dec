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

package uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request.input

import uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request.ConsolidationRequestSpec._

object ConsolidationRequestSpecInputXMLProvider {

  def provideTestXMLForConsolidationRequest(testName: String): String =
    consolidationOpeningTag + testXMLConsolidationContentMap(testName) + consolidationClosingTag

  private val consolidationOpeningTag =
    "<inventoryLinkingConsolidationRequest xmlns:inv=\"http://gov.uk/customs/inventoryLinking/v1\">"
  private val consolidationClosingTag =
    "</inventoryLinkingConsolidationRequest>"

  private val consolidationMandatoryFields =
    "<messageCode>" + messageCodeConsolidation + "</messageCode>" +
      "<transactionType>" + transactionType + "</transactionType>"


  private val consolidationTestNoTagForOptionalField = consolidationMandatoryFields

  private val consolidationTestNoValueForOptionalField =
    consolidationMandatoryFields

  private val consolidationTestMessageCode = consolidationMandatoryFields

  private val consolidationTestUcrBlock = consolidationMandatoryFields +
    "<ucrBlock>" +
    "<ucr>" + ucrBlock.ucr + "</ucr>" +
    "<ucrType>" + ucrBlock.ucrType + "</ucrType>" +
    "</ucrBlock>"

  private val consolidationTestTransactionType = consolidationMandatoryFields

  private val consolidationTestMasterUCR =
    consolidationMandatoryFields +
      "<masterUCR>" + masterUCR + "</masterUCR>"

  private val testXMLConsolidationContentMap: Map[String, String] = Map(
    "TestNoTagForOptionalField" -> consolidationTestNoTagForOptionalField,
    "TestNoValueForOptionalField" -> consolidationTestNoValueForOptionalField,
    "TestMessageCode" -> consolidationTestMessageCode,
    "TestTransactionType" -> consolidationTestTransactionType,
    "TestUcrBlock" -> consolidationTestUcrBlock,
    "TestMasterUCR" -> consolidationTestMasterUCR
  )

}
