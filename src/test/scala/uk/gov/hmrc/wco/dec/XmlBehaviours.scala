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

package uk.gov.hmrc.wco.dec

import java.io.StringReader

import javax.xml.XMLConstants
import javax.xml.transform.Source
import javax.xml.transform.stream.StreamSource
import javax.xml.validation.{Schema, SchemaFactory}
import org.scalatest.wordspec.AnyWordSpec

import scala.xml.{Elem, SAXException}

trait XmlBehaviours {
  this: AnyWordSpec =>

  val importDeclarationSchemaResources: Seq[String] = Seq("/DocumentMetaData_2_DMS.xsd", "/WCO_DEC_2_DMS.xsd")

  val importDeclarationCancellationSchemas: Seq[String] = Seq("/CANCEL_METADATA.xsd","/CANCEL.xsd")

  val responseSchemaResources: Seq[String] = Seq("/DocumentMetaData_2_DMS.xsd", "/WCO_RES_2_DMS.xsd")

  val inventoryLinkingRequestResources: Seq[String] = Seq(
    "/inventory-linking-exports-schemas/exports/inventoryLinkingRequestExternal.xsd")

  val inventoryLinkingResponseResources: Seq[String] = Seq(
    "/inventory-linking-exports-schemas/exports/inventoryLinkingResponseExternal.xsd")

  def validDeclarationXmlScenario()(test: => Elem): Unit = validXmlScenario(importDeclarationSchemaResources)(test)

  def validResponseXmlScenario()(test: => Elem): Unit = validXmlScenario(responseSchemaResources)(test)

  def validCancellationDeclarationXml()(test: => Elem): Unit =
    validXmlScenario(importDeclarationCancellationSchemas)(test)

  def validInventoryLinkingRequestXmlScenario()(test: => Elem): Unit =
    validXmlScenario(inventoryLinkingRequestResources)(test)

  def validInventoryLinkingResponseXmlScenario()(test: => Elem): Unit =
    validXmlScenario(inventoryLinkingResponseResources)(test)

  protected def isValidImportDeclarationXml(xml: String): Boolean =
    try {
      validateAgainstSchemaResources(xml, importDeclarationSchemaResources)
      true
    } catch {
      case _: SAXException => false
    }

  private def validXmlScenario(schemas: Seq[String])(test: => Elem): Unit =
    validateAgainstSchemaResources(test.mkString, schemas)

  private def validateAgainstSchemaResources(xml: String, schemas: Seq[String]): Unit = {
    val schema: Schema = {
      val sources = schemas.map(res => getClass.getResource(res).toString).map(systemId => new StreamSource(systemId)).toArray[Source]
      SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(sources)
    }
    val validator = schema.newValidator()

    validator.validate(new StreamSource(new StringReader(xml)))
  }
}
