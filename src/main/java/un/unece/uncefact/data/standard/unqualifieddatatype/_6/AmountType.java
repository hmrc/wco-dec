
package un.unece.uncefact.data.standard.unqualifieddatatype._6;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import wco.datamodel.wco.declaration_ds.dms._2.ChargeDeductionOtherChargeDeductionAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.CustomsValuationFreightChargeAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationInvoiceAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemCustomsValueAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemStatisticalValueAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.InvoiceLineItemChargeAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeAmountAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.WriteOffAmountAmountType;


/**
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="currencyID" type="{urn:un:unece:uncefact:codelist:standard:ISO:ISO3AlphaCurrencyCode:2012-08-31}ISO3AlphaCurrencyCodeContentType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "value"
})
@XmlSeeAlso({
    wco.datamodel.wco.response_ds.dms._2.PaymentPaymentAmountType.class,
    wco.datamodel.wco.response_ds.dms._2.PaymentTaxAssessedAmountType.class,
    wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeAdValoremTaxBaseAmountType.class,
    wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeDeductAmountType.class,
    DeclarationInvoiceAmountType.class,
    CustomsValuationFreightChargeAmountType.class,
    WriteOffAmountAmountType.class,
    GovernmentAgencyGoodsItemStatisticalValueAmountType.class,
    InvoiceLineItemChargeAmountType.class,
    ObligationGuaranteeAmountAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.PaymentTaxAssessedAmountType.class,
    ChargeDeductionOtherChargeDeductionAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeDeductAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.PaymentPaymentAmountType.class,
    GovernmentAgencyGoodsItemCustomsValueAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeAdValoremTaxBaseAmountType.class
})
public class AmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "currencyID")
    protected String currencyID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyID(String value) {
        this.currencyID = value;
    }

}
