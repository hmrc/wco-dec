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

package un.unece.uncefact.data.standard.unqualifieddatatype._6;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import wco.datamodel.wco.declaration_ds.dms._2.ChargeDeductionOtherChargeDeductionAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.CustomsValuationFreightChargeAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationInvoiceAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemCustomsValueAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemStatisticalValueAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.InvoiceLineItemChargeAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeAmountAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.WriteOffAmountAmountType;


/**
 * <p>Java class for AmountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AmountType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attribute name="currencyID" type="{urn:un:unece:uncefact:codelist:standard:ISO:ISO3AlphaCurrencyCode:2012-08-31}ISO3AlphaCurrencyCodeContentType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
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
    ChargeDeductionOtherChargeDeductionAmountType.class,
    CustomsValuationFreightChargeAmountType.class,
    DeclarationInvoiceAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeAdValoremTaxBaseAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeDeductAmountType.class,
    GovernmentAgencyGoodsItemCustomsValueAmountType.class,
    GovernmentAgencyGoodsItemStatisticalValueAmountType.class,
    InvoiceLineItemChargeAmountType.class,
    ObligationGuaranteeAmountAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.PaymentPaymentAmountType.class,
    wco.datamodel.wco.declaration_ds.dms._2.PaymentTaxAssessedAmountType.class,
    WriteOffAmountAmountType.class
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
