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

package uk.gov.hmrc.wco.dec

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.exc.MismatchedInputException
import com.fasterxml.jackson.module.scala.DefaultScalaModule

object TypeCodeValues {

  private val _mapper = new ObjectMapper()
  _mapper.registerModule(DefaultScalaModule)

  def load(name: String): Seq[TypeCodeValue] = try {
    _mapper.readValue[Array[TypeCodeValue]](
      getClass.getResourceAsStream(s"/uk/gov/hmrc/wco/dec/$name.json"), classOf[Array[TypeCodeValue]]
    )
  } catch {
    case e: MismatchedInputException => throw new IllegalArgumentException(s"Unknown type code value list name: $name", e)
  }

}

case class TypeCodeValue(value: String, display: String, additionalDisplay: Option[String])
