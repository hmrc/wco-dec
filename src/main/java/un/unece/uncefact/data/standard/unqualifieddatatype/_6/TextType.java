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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCityNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountrySubDivisionNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressLineTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthenticationAuthenticationTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthenticatorNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.BuyerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.CarrierNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.CommodityDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsigneeNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsignorNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ContactNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarantNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ExporterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsLocationNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ImporterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.LoadingLocationNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingPackingMaterialDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.PayerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SellerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SuretyNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsLocationNameTextType;
import wco.datamodel.wco.response_ds.dms._2.ErrorDescriptionTextType;


/**
 * <p>Java class for TextType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TextType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", propOrder = {
    "value"
})
@XmlSeeAlso({
    wco.datamodel.wco.response_ds.dms._2.AdditionalInformationStatementDescriptionTextType.class,
    ErrorDescriptionTextType.class,
    AdditionalDocumentNameTextType.class,
    wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementDescriptionTextType.class,
    AddressCityNameTextType.class,
    AddressCountrySubDivisionNameTextType.class,
    AddressLineTextType.class,
    AgentNameTextType.class,
    ArrivalTransportMeansNameTextType.class,
    AuthenticationAuthenticationTextType.class,
    AuthenticatorNameTextType.class,
    BorderTransportMeansNameTextType.class,
    BuyerNameTextType.class,
    CarrierNameTextType.class,
    CommodityDescriptionTextType.class,
    ConsigneeNameTextType.class,
    ConsignorNameTextType.class,
    ContactNameTextType.class,
    DeclarantNameTextType.class,
    DepartureTransportMeansNameTextType.class,
    ExporterNameTextType.class,
    GoodsLocationNameTextType.class,
    ImporterNameTextType.class,
    LoadingLocationNameTextType.class,
    PackagingPackingMaterialDescriptionTextType.class,
    PayerNameTextType.class,
    SellerNameTextType.class,
    SubmitterNameTextType.class,
    SuretyNameTextType.class,
    TradeTermsDescriptionTextType.class,
    TradeTermsLocationNameTextType.class
})
public class TextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageID;

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
     * Gets the value of the languageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

}
