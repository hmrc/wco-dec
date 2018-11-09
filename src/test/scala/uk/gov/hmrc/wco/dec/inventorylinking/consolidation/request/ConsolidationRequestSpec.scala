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

package uk.gov.hmrc.wco.dec.inventorylinking.consolidation.request

import uk.gov.hmrc.wco.dec.WcoSpec
import uk.gov.hmrc.wco.dec.inventorylinking.common.UcrBlock

object ConsolidationRequestSpec extends WcoSpec {
  val messageCodeConsolidationValues = Seq("CST", "EAC")
  val transactionTypeValues = Seq("Associate", "Disassociate", "Shut")
  val ucrTypeValues = Seq("D", "M")

  val messageCodeConsolidation : String = messageCodeConsolidationValues(randomInt(messageCodeConsolidationValues.length))
  val transactionType: String = transactionTypeValues(randomInt(transactionTypeValues.length))
  val masterUCR: String = "GB/ESH-JL2EBNT2CXR2HU9OZ1WMMQYPP7"
  val ucrBlock: UcrBlock = UcrBlock("GB/S48-FOLC5X3O", ucrTypeValues(randomInt(ucrTypeValues.length)))
}
