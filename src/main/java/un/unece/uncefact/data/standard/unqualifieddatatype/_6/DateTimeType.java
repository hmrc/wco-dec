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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DateTimeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DateTimeType">
 *   <simpleContent>
 *     <extension base="<urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>DateTimePatternType">
 *       <attribute name="formatCode" use="required" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6}FormatCodeType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    wco.datamodel.wco.response_ds.dms._2.ResponseIssueDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.AdditionalInformationLimitDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationAcceptanceDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationCancellationDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationRejectionDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.PaymentDueDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.StatusEffectiveDateTimeType.DateTimeString.class,
    wco.datamodel.wco.response_ds.dms._2.StatusReleaseDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentEffectiveDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationAcceptanceDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationIssueDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.GoodsShipmentExitDateTimeType.DateTimeString.class,
    wco.datamodel.wco.declaration_ds.dms._2.InvoiceIssueDateTimeType.DateTimeString.class
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
