package uk.gov.hmrc.wco.dec.inventorylinking

import java.io.StringWriter
import java.util.Properties

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.{JacksonXmlProperty, JacksonXmlRootElement}
import uk.gov.hmrc.wco.dec.MetaData
import uk.gov.hmrc.wco.dec.utilities.JacksonMapper

import scala.collection.JavaConverters._

object InventoryLinkingConsolidationRequest extends JacksonMapper {
  final val inventoryLinking = "http://gov.uk/customs/inventoryLinking/v1"

  def fromXml(xml: String): InventoryLinkingConsolidationRequest = _xml.readValue(xml, classOf[InventoryLinkingConsolidationRequest])

  def fromProperties(props: Map[String, String]): MetaData = {
    val p = new Properties()
    p.putAll(props.asJava)
    _props.readPropertiesAs(p, _schema, classOf[MetaData])
  }
}

@JsonIgnoreProperties(Array("_xml", "_schema", "_props" ))
@JacksonXmlRootElement(localName = "InventoryLinkingConsolidationRequest", namespace = InventoryLinkingMovementRequest.inventoryLinking)
case class InventoryLinkingConsolidationRequest(
  @JacksonXmlProperty(localName = "messageCode", namespace = InventoryLinkingMovementRequest.inventoryLinking)
  messageCode: String,

  @JacksonXmlProperty(localName = "transactionType", namespace = InventoryLinkingMovementRequest.inventoryLinking)
  transactionType: String,

  @JacksonXmlProperty(localName = "masterUCR", namespace = InventoryLinkingMovementRequest.inventoryLinking)
  masterUCR: Option[String] = None,

  @JacksonXmlProperty(localName = "ucrBlock", namespace = InventoryLinkingMovementRequest.inventoryLinking)
  ucrBlock: Option[String] = None

)extends JacksonMapper {

  def toXml: String = {
    val sw = new StringWriter()
    _xml.writeValue(sw, this)
    sw.toString
  }

  def toProperties: Map[String, String] = _props.writeValueAsProperties(this, _schema).asScala.toMap

}

case class UcrBlock(
  @JacksonXmlProperty(localName = "ucrBlock", namespace = InventoryLinkingMovementRequest.inventoryLinking)
  ucrBlock: Option[String] = None,

  @JacksonXmlProperty(localName = "ucr", namespace = InventoryLinkingMovementRequest.inventoryLinking)
  ucr: String
)
