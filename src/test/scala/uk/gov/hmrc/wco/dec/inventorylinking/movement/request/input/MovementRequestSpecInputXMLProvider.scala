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

package uk.gov.hmrc.wco.dec.inventorylinking.movement.request.input

import uk.gov.hmrc.wco.dec.inventorylinking.movement.request.InventoryLinkingMovementRequestSpec._

object MovementRequestSpecInputXMLProvider {

  def provideTestXMLFor(testName: MovementRequestTestName): String =
    openingTag + testXMLContentMap(testName) + closingTag

  private val openingTag =
    "<inventoryLinkingMovementRequest xmlns:inv=\"http://gov.uk/customs/inventoryLinking/v1\">"
  private val closingTag =
    "</inventoryLinkingMovementRequest>"

  private val mandatoryFields =
    "<messageCode>" + messageCodeMovement + "</messageCode>" +
    "<ucrBlock>" +
      "<ucr>" + ucrBlock.ucr + "</ucr>" +
      "<ucrType>" + ucrBlock.ucrType + "</ucrType>" +
    "</ucrBlock>" +
    "<goodsLocation>" + goodsLocation + "</goodsLocation>"


  private val testNoTagForOptionalField = mandatoryFields

  private val testNoValueForOptionalField =
    mandatoryFields +
    "<shedOPID/>"

  private val testMessageCode = mandatoryFields

  private val testAgentDetails =
    mandatoryFields +
    "<agentDetails>" +
      "<EORI>" + agentDetails.eori.get + "</EORI>" +
      "<agentLocation>" + agentDetails.agentLocation.get + "</agentLocation>" +
      "<agentRole>" + agentDetails.agentRole.get + "</agentRole>" +
    "</agentDetails>"

  private val testUcrBlock = mandatoryFields

  private val testGoodsLocation = mandatoryFields

  private val testGoodsArrivalDateTime =
    mandatoryFields +
    "<goodsArrivalDateTime>" + goodsArrivalDateTime + "</goodsArrivalDateTime>"

  private val testGoodsDepartureDateTime =
    mandatoryFields +
    "<goodsDepartureDateTime>" + goodsDepartureDateTime + "</goodsDepartureDateTime>"

  private val testShedOPID =
    mandatoryFields +
    "<shedOPID>" + shedOPID + "</shedOPID>"

  private val testMasterUCR =
    mandatoryFields +
    "<masterUCR>" + masterUCR + "</masterUCR>"

  private val testMasterOpt =
    mandatoryFields +
    "<masterOpt>" + masterOpt + "</masterOpt>"

  private val testMovementReference =
    mandatoryFields +
    "<movementReference>" + movementReference + "</movementReference>"

  private val testTransportDetails =
    mandatoryFields +
      "<transportDetails>" +
        "<transportID>" + transportDetails.transportID.get + "</transportID>" +
        "<transportMode>" + transportDetails.transportMode.get + "</transportMode>" +
        "<transportNationality>" + transportDetails.transportNationality.get + "</transportNationality>" +
      "</transportDetails>"


  private val testXMLContentMap: Map[MovementRequestTestName, String] = Map(
    TestNoTagForOptionalField -> testNoTagForOptionalField,
    TestNoValueForOptionalField -> testNoValueForOptionalField,
    TestMessageCode -> testMessageCode,
    TestAgentDetails -> testAgentDetails,
    TestUcrBlock -> testUcrBlock,
    TestGoodsLocation -> testGoodsLocation,
    TestGoodsArrivalDateTime -> testGoodsArrivalDateTime,
    TestGoodsDepartureDateTime -> testGoodsDepartureDateTime,
    TestShedOPID -> testShedOPID,
    TestMasterUCR -> testMasterUCR,
    TestMasterOpt -> testMasterOpt,
    TestMovementReference -> testMovementReference,
    TestTransportDetails -> testTransportDetails
  )

}
