/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.wco.dec.status
import uk.gov.hmrc.wco.dec.WcoSpec

import scala.xml.XML

class StatusRequestSpec extends WcoSpec {

  "from XML" should {

    val xml = XML.load(getClass.getResourceAsStream("/StatusQueryResponseExample.xml")).mkString
    val resp = DeclarationManagementInformationResponse.fromXml(xml)

    "read declaration version number" in {
      resp.declaration.versionNumber.get must be("100")
    }

    "read creation date format code" in {
      resp.declaration.creationDate.get.formatCode.get must be("string")
    }

    "read creation date value" in {
      resp.declaration.creationDate.get.value.get must be("2008-09-29T02:49:45")
    }

    "read goods item count unit type" in {
      resp.declaration.goodsItemCount.get.unitType.get must be("string")
    }

    "read goods item count qualifier" in {
      resp.declaration.goodsItemCount.get.qualifier.get must be("string")
    }

    "read goods item count value" in {
      resp.declaration.goodsItemCount.get.value.get must be("1000.00")
    }

    "read trade movement type type" in {
      resp.declaration.tradeMovementType.get.`type`.get must be("token")
    }

    "read trade movement type responsible agent" in {
      resp.declaration.tradeMovementType.get.responsibleAgent.get must be("token")
    }

    "read trade movement type value" in {
      resp.declaration.tradeMovementType.get.value.get must be("token")
    }

    "read type type" in {
      resp.declaration.`type`.get.`type`.get must be("token")
    }

    "read type responsible agent" in {
      resp.declaration.`type`.get.responsibleAgent.get must be("token")
    }

    "read type value" in {
      resp.declaration.`type`.get.value.get must be("token")
    }

    "read package count unit type" in {
      resp.declaration.packageCount.get.unitType.get must be("string")
    }

    "read package count qualifier" in {
      resp.declaration.packageCount.get.qualifier.get must be("string")
    }

    "read package count value" in {
      resp.declaration.packageCount.get.value.get must be("1000.00")
    }

    "read acceptance date format code" in {
      resp.declaration.acceptanceDate.get.formatCode.get must be("string")
    }

    "read acceptance date value" in {
      resp.declaration.acceptanceDate.get.value.get must be("2014-09-19T00:18:33")
    }

    "read parties party identification number" in {
      resp.declaration.parties.head.partyIdentification.get.number.get must be("string")
    }
  }

  val dateWithooutZoneFormat = "102"
  val dateWithZoneFormat = "304"
  val year = "2019"
  val month = "03"
  val day = "05"
  val hour = "11"
  val minute = "30"
  val second = "23"

  "Date Time Formatter" should {
    "accept and recognize 102 date format" in {
      val time = year + month + day
      val date = DateTime(Some(dateWithooutZoneFormat), Some(time))
      val parsedDate = date.timeOpt().get

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
    }

    "accept and recognize 304 date format with Z" in {
      val zone = "Z"
      val time = year + month + day + hour + minute + second + zone

      val date = DateTime(Some(dateWithZoneFormat), Some(time))
      val parsedDate = date.timeOpt().get

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }

    "accept and recognize 304 date format with zone (+)" in {
      val zone = "+01"
      val time = year + month + day + hour + minute + second + zone

      val date = DateTime(Some(dateWithZoneFormat), Some(time))
      val parsedDate = date.timeOpt().get

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }

    "accept and recognize 304 date format with zone (-)" in {
      val zone = "-01"
      val time = year + month + day + hour + minute + second + zone

      val date = DateTime(Some(dateWithZoneFormat), Some(time))
      val parsedDate = date.timeOpt().get

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }
  }
}
