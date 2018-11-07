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

import java.time.LocalDateTime

import uk.gov.hmrc.wco.dec.WcoSpec

object MovementRequestSpec extends WcoSpec {
  val messageCodeMovementValues = Seq("EAA", "EAL", "EDL")
  val ucrTypeValues = Seq("D", "M")
  val masterOptValues = Seq("A", "F", "R", "X")

  val messageCodeMovement: String = messageCodeMovementValues(randomInt(messageCodeMovementValues.length))
  val agentDetails: AgentDetails = AgentDetails(
    Some(randomString(17)),
    Some(randomString(12)),
    Some(randomString(3))
  )
  val ucrBlock: UcrBlock = UcrBlock("GB/S48-FOLC5X3O", ucrTypeValues(randomInt(ucrTypeValues.length)))
  val goodsLocation: String = randomString(17)
  val goodsArrivalDateTime: String = LocalDateTime.now.withNano(0).toString
  val goodsDepartureDateTime: String = LocalDateTime.now.withNano(0).toString
  val shedOPID: String = randomString(3)
  val masterUCR: String = "GB/ESH-JL2EBNT2CXR2HU9OZ1WMMQYPP7"
  val masterOpt: String = masterOptValues(randomInt(masterOptValues.length))
  val movementReference: String = randomString(25)
  val transportDetails: TransportDetails = TransportDetails(
    Some(randomString(35)),
    Some(randomString(1)),
    Some(randomString(2))
  )
}
