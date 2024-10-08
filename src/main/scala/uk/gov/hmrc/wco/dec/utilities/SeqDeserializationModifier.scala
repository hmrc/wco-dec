/*
 * Copyright 2024 HM Revenue & Customs
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

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind._
import com.fasterxml.jackson.databind.`type`.CollectionLikeType
import com.fasterxml.jackson.databind.deser.{BeanDeserializerModifier, ContextualDeserializer}

object SeqDeserializationModifier extends BeanDeserializerModifier {

  override def modifyCollectionLikeDeserializer(
    config: DeserializationConfig,
    `type`: CollectionLikeType,
    beanDesc: BeanDescription,
    deserializer: JsonDeserializer[_]
  ): JsonDeserializer[_] = new JsonDeserializer[Seq[_]] with ContextualDeserializer {

    override def deserialize(p: JsonParser, ctx: DeserializationContext): Seq[_] =
      deserializer.deserialize(p, ctx).asInstanceOf[Seq[_]]

    override def createContextual(ctx: DeserializationContext, prop: BeanProperty): JsonDeserializer[_] =
      modifyCollectionLikeDeserializer(
        config,
        `type`,
        beanDesc,
        deserializer.asInstanceOf[ContextualDeserializer].createContextual(ctx, prop)
      )

    override def getNullValue(ctx: DeserializationContext): Seq[_] = Seq.empty
  }
}
