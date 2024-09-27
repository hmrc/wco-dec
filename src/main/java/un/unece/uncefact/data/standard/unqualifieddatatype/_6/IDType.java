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
import wco.datamodel.wco.declaration_ds.dms._2.AEOMutualRecognitionPartyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressPostcodeIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthorisationHolderIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.BuyerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.CarrierIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ClassificationBindingTariffReferenceIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ClassificationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsigneeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsignorIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DangerousGoodsUNDGIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarantIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationDeclarationOfficeIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationIssueLocationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DestinationRegionIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DomesticDutyTaxPartyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ExitOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ExporterIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsLocationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.GuaranteeOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ImporterIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.InvoiceIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.LoadingLocationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.OriginRegionIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingMarksNumbersIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PayerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PresentationOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PreviousDocumentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SealIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SellerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SupervisingOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SuretyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsLocationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.TransportEquipmentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.UCRIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.UCRTraderAssignedReferenceIDType;
import wco.datamodel.wco.declaration_ds.dms._2.WarehouseIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.AppealOfficeIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.BankAccountIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.BankReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.ContactOfficeIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationVersionIDType;
import wco.datamodel.wco.response_ds.dms._2.PaymentReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.ResponseFunctionalReferenceIDType;


/**
 * <p>Java class for IDType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IDType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>token">
 *       <attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="schemeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="schemeAgencyID" type="{urn:un:unece:uncefact:codelist:standard:UNECE:AgencyIdentificationCode:D12B}AgencyIdentificationCodeContentType" />
 *       <attribute name="schemeAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="schemeDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ResponseFunctionalReferenceIDType.class,
    AppealOfficeIdentificationIDType.class,
    BankAccountIdentificationIDType.class,
    BankReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.CommunicationIdentificationIDType.class,
    ContactOfficeIdentificationIDType.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationFunctionalReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationIdentificationIDType.class,
    DeclarationVersionIDType.class,
    wco.datamodel.wco.response_ds.dms._2.ObligationGuaranteeReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.PointerTagIDType.class,
    PaymentReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeQuotaOrderIDType.class,
    AdditionalDocumentIdentificationIDType.class,
    AddressPostcodeIDType.class,
    AEOMutualRecognitionPartyIdentificationIDType.class,
    AgentIdentificationIDType.class,
    ArrivalTransportMeansIdentificationIDType.class,
    AuthorisationHolderIdentificationIDType.class,
    BorderTransportMeansIdentificationIDType.class,
    BuyerIdentificationIDType.class,
    CarrierIdentificationIDType.class,
    ClassificationBindingTariffReferenceIDType.class,
    ClassificationIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.CommunicationIdentificationIDType.class,
    ConsigneeIdentificationIDType.class,
    ConsignorIdentificationIDType.class,
    DangerousGoodsUNDGIDType.class,
    DeclarantIdentificationIDType.class,
    DeclarationDeclarationOfficeIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationFunctionalReferenceIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationIdentificationIDType.class,
    DeclarationIssueLocationIdentificationIDType.class,
    DepartureTransportMeansIdentificationIDType.class,
    DestinationRegionIDType.class,
    DomesticDutyTaxPartyIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeQuotaOrderIDType.class,
    ExitOfficeIdentificationIDType.class,
    ExporterIdentificationIDType.class,
    GoodsLocationIdentificationIDType.class,
    GuaranteeOfficeIdentificationIDType.class,
    ImporterIdentificationIDType.class,
    InvoiceIdentificationIDType.class,
    LoadingLocationIdentificationIDType.class,
    ObligationGuaranteeIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeReferenceIDType.class,
    OriginRegionIDType.class,
    PackagingMarksNumbersIDType.class,
    PayerIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.PointerTagIDType.class,
    PresentationOfficeIdentificationIDType.class,
    PreviousDocumentIdentificationIDType.class,
    SealIdentificationIDType.class,
    SellerIdentificationIDType.class,
    SubmitterIdentificationIDType.class,
    SupervisingOfficeIdentificationIDType.class,
    SuretyIdentificationIDType.class,
    TradeTermsLocationIDType.class,
    TransportEquipmentIdentificationIDType.class,
    UCRIdentificationIDType.class,
    UCRTraderAssignedReferenceIDType.class,
    WarehouseIdentificationIDType.class
})
public class IDType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeID;
    @XmlAttribute(name = "schemeName")
    protected String schemeName;
    @XmlAttribute(name = "schemeAgencyID")
    protected String schemeAgencyID;
    @XmlAttribute(name = "schemeAgencyName")
    protected String schemeAgencyName;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeVersionID;
    @XmlAttribute(name = "schemeDataURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeDataURI;
    @XmlAttribute(name = "schemeURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeURI;

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
     * Gets the value of the schemeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Sets the value of the schemeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Gets the value of the schemeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * Sets the value of the schemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeName(String value) {
        this.schemeName = value;
    }

    /**
     * Gets the value of the schemeAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Sets the value of the schemeAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

    /**
     * Gets the value of the schemeAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyName() {
        return schemeAgencyName;
    }

    /**
     * Sets the value of the schemeAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyName(String value) {
        this.schemeAgencyName = value;
    }

    /**
     * Gets the value of the schemeVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * Sets the value of the schemeVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

    /**
     * Gets the value of the schemeDataURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeDataURI() {
        return schemeDataURI;
    }

    /**
     * Sets the value of the schemeDataURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeDataURI(String value) {
        this.schemeDataURI = value;
    }

    /**
     * Gets the value of the schemeURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeURI() {
        return schemeURI;
    }

    /**
     * Sets the value of the schemeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeURI(String value) {
        this.schemeURI = value;
    }

}
