
package un.unece.uncefact.data.standard.unqualifieddatatype._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>DateTimePatternType">
 *       &lt;attribute name="formatCode" use="required" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6}FormatCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    wco.datamodel.wco.response_ds.dms._2.ResponseIssueDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationAcceptanceDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationCancellationDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.StatusEffectiveDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.AdditionalInformationLimitDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.PaymentDueDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.StatusReleaseDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationRejectionDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationAcceptanceDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.InvoiceIssueDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentEffectiveDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.GoodsShipmentExitDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationIssueDateTimeType.DateTimeString.class
})
public class DateTimeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "formatCode", required = true)
    protected String formatCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the formatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatCode() {
        return formatCode;
    }

    /**
     * Sets the value of the formatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatCode(String value) {
        this.formatCode = value;
    }

}
