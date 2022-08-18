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

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.dataformat.javaprop.{JavaPropsMapper, JavaPropsSchema}
import com.fasterxml.jackson.dataformat.xml.{JacksonXmlModule, XmlMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule

trait JacksonMapper {

  private val _modxml = new JacksonXmlModule()
  _modxml.setDefaultUseWrapper(false)
  protected val _schema: JavaPropsSchema = JavaPropsSchema.emptySchema().withWriteIndexUsingMarkers(true).withFirstArrayOffset(0)
  protected val _xml: ObjectMapper = new XmlMapper(_modxml)
    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
    .setSerializationInclusion(JsonInclude.Include.NON_ABSENT)
    .registerModule(DefaultScalaModule)
    .registerModule(CustomSeqModule)
  protected val _props: JavaPropsMapper = new JavaPropsMapper()
  _props.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
  _props.registerModule(DefaultScalaModule)
}

object CustomSeqModule extends SimpleModule {
  setDeserializerModifier(SeqDeserializationModifier)
}

