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

package uk.gov.hmrc.wco.dec.utilities

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, ZoneId, ZonedDateTime}

/**
  * DateTimeFormats objects provide a possibility to generate ZonedDateTime from formats supported by xml schema
  * and time value
  *
  * Supported formats are 102 and 304.
  *
  * Example supported data:
  * - 102: 20190305
  * - 304: 20190305105523+01
  */
object DateTimeFormats {
  private val format102 = DateTimeFormatter.ofPattern("yyyyMMdd")
  private val format304 = DateTimeFormatter.ofPattern("yyyyMMddHHmmssX")

  def handle102Format(value: String): ZonedDateTime = {
    val localDate = LocalDate.parse(value, format102)

    localDate.atStartOfDay(ZoneId.systemDefault())
  }

  def handle304Format(value: String): ZonedDateTime = ZonedDateTime.parse(value, format304)
}
