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

import java.time.LocalDateTime

import uk.gov.hmrc.wco.dec.WcoSpec
import uk.gov.hmrc.wco.dec.inventorylinking.common.{EntryStatus, GoodsItem, UcrBlock}

object InventoryLinkingMovementResponseSpec extends WcoSpec {
  val messageCodeMovement = "EAA"
  val crc = randomString(3)
  val goodsArrivalDateTime = LocalDateTime.now().withNano(0).toString
  val goodsLocation = randomString(17)
  val shedOPID = randomString(3)
  val movementReference = randomString(25)
  val submitRole = randomString(35)
  val movementUcr = "GB/OHR5CMXY6LOV-CIK1TLGPXT2WFGP42"
  val movementUcrType = "D"
  val ucrBlock = UcrBlock(movementUcr, movementUcrType)
  val commodityCode = randomInt(99999999)
  val totalPackages = randomInt(99999999)
  val totalNetMass = randomBigDecimal
  val goodsItem = GoodsItem(Some(commodityCode), Some(totalPackages), Some(totalNetMass))
  val ics = randomString(2)
  val roe = randomString(2)
  val soe = randomString(2)
  val entryStatus = EntryStatus(Some(ics), Some(roe), Some(soe))
}