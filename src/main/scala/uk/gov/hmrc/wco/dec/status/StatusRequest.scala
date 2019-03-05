/*
 * Copyright 2019 HM Revenue & Customs
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

import java.time.ZonedDateTime

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.{ObjectNode, TextNode}
import com.fasterxml.jackson.databind.{DeserializationContext, JsonNode}
import com.fasterxml.jackson.dataformat.xml.annotation.{JacksonXmlProperty, JacksonXmlRootElement, JacksonXmlText}
import uk.gov.hmrc.wco.dec.utilities.JacksonMapper
import uk.gov.hmrc.wco.dec.{StdAttributeAndTextDeserializer, utilities}

@JacksonXmlRootElement(namespace = "", localName = "declarationManagementInformationResponse")
case class DeclarationManagementInformationResponse(declaration: Declaration = Declaration())

object DeclarationManagementInformationResponse extends JacksonMapper {

  def fromXml(xml: String): DeclarationManagementInformationResponse =
    _xml.readValue(xml, classOf[DeclarationManagementInformationResponse])
}

case class Declaration(versionNumber: Option[Int] = None,
                       creationDate: Option[DateTime] = None,
                       goodsItemCount: Option[Quantity] = None,
                       tradeMovementType: Option[CodeListElementField] = None,
                      `type`: Option[CodeListElementField] = None,
                       packageCount: Option[Quantity] = None,
                       acceptanceDate: Option[DateTime] = None,
                       parties: Seq[Parties] = Seq.empty)

@JsonDeserialize(using = classOf[DateTimeDeserializer])
case class DateTime(@JacksonXmlProperty(isAttribute = true)
                    formatCode: Option[String] = None,

                    @JacksonXmlText
                    value: Option[String] = None) {
  import utilities.DateTimeFormats._

  def timeOpt(): Option[ZonedDateTime] = (formatCode, value) match {
    case (Some(code), Some(timeValue)) if code == "102" => Some(handle102Format(timeValue))
    case (Some(code), Some(timeValue)) if code == "304" => Some(handle304Format(timeValue))
    case _ => None
  }
}

class DateTimeDeserializer extends StdAttributeAndTextDeserializer[DateTime]("formatCode", classOf[DateTime]) {

  override def newInstanceFromTuple(values: (Option[String], Option[String])): DateTime = DateTime(values._1, values._2)

}

@JsonDeserialize(using = classOf[QuantityDeserializer])
case class Quantity(@JacksonXmlProperty(isAttribute = true)
                    unitType: Option[String] = None,

                    @JacksonXmlProperty(isAttribute = true)
                    qualifier: Option[String] = None,

                    @JacksonXmlText
                    value: Option[String] = None)

class QuantityDeserializer extends ExtendedAttributeAndTextDeserializer[Quantity]("unitType", "qualifier", classOf[Quantity]) {

  override def newInstanceFromTuple(values: (Option[String], Option[String], Option[String])): Quantity = Quantity(values._1, values._2, values._3)

}

@JsonDeserialize(using = classOf[CodeListElementFieldDeserializer])
case class CodeListElementField(@JacksonXmlProperty(isAttribute = true)
                                `type`: Option[String] = None,

                                 @JacksonXmlProperty(isAttribute = true)
                                 responsibleAgent: Option[String] = None,

                                 @JacksonXmlText
                                 value: Option[String] = None)

class CodeListElementFieldDeserializer extends ExtendedAttributeAndTextDeserializer[CodeListElementField]("type", "responsibleAgent", classOf[CodeListElementField]) {

  override def newInstanceFromTuple(values: (Option[String], Option[String], Option[String])): CodeListElementField =
    CodeListElementField(values._1, values._2, values._3)
}

case class Parties(partyIdentification: Option[PartyIdentification] = None)

case class PartyIdentification(number: Option[String] = None)

// yes, I know this is crude and clumsy duplication but it will have to suffice for now
// TODO create a more elegant solution which refactors StdAttributeAndTextDeserializer to handle more than 1 attribute
abstract class ExtendedAttributeAndTextDeserializer[T](attributeOne: String, attributeTwo: String, t: Class[T])
  extends StdDeserializer[T](t) {

  def newInstanceFromTuple(values: (Option[String], Option[String], Option[String])): T

  override final def deserialize(p: JsonParser, ctx: DeserializationContext): T = {
    val n: JsonNode = p.getCodec.readTree(p)
    n match {
      case o: ObjectNode =>
        newInstanceFromTuple(
          (nonEmptyOrNone(o.get(attributeOne)), nonEmptyOrNone(o.get(attributeTwo)), nonEmptyOrNone(o.get("")))
        )
      case t: TextNode => newInstanceFromTuple((None, None, nonEmptyOrNone(t)))
    }
  }

  private def nonEmptyOrNone(n: JsonNode): Option[String] =
    if (n == null || n.asText() == null || n.asText().trim.isEmpty) None else Some(n.asText())
}
