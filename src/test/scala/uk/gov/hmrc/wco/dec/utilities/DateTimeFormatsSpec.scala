/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.wco.dec.utilities
import uk.gov.hmrc.wco.dec.WcoSpec

class DateTimeFormatsSpec extends WcoSpec {
  import DateTimeFormatsSpec._

  "DateTimeFormats" should {
    "correctly handle date with 102 format" in {
      val parsedDate = DateTimeFormats.handle102Format(time102)

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
    }

    "correctly handle date with 304 format" in {
      val parsedDate = DateTimeFormats.handle304Format(time304)

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }
  }
}

object DateTimeFormatsSpec {
  val year = "2019"
  val month = "03"
  val day = "05"
  val hour = "11"
  val minute = "30"
  val second = "48"
  val zone = "+01"

  val time102 = year + month + day
  val time304 = year + month + day + hour + minute + second + zone
}