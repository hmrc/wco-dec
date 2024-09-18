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

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import wco.datamodel.wco.declaration_ds.dms._2.*;
import wco.datamodel.wco.response_ds.dms._2.*;

/**
 * <p>Java class for IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="schemeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemeAgencyID" type="{urn:un:unece:uncefact:codelist:standard:UNECE:AgencyIdentificationCode:D12B}AgencyIdentificationCodeContentType" />
 *       &lt;attribute name="schemeAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="schemeDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ResponseFunctionalReferenceIDType.class,
    BankAccountIdentificationIDType.class,
    BankReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeQuotaOrderIDType.class,
    wco.datamodel.wco.response_ds.dms._2.CommunicationIdentificationIDType.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationIdentificationIDType.class,
    AppealOfficeIdentificationIDType.class,
    ContactOfficeIdentificationIDType.class,
    PaymentReferenceIDType.class,
    DeclarationVersionIDType.class,
    wco.datamodel.wco.response_ds.dms._2.DeclarationFunctionalReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.ObligationGuaranteeReferenceIDType.class,
    wco.datamodel.wco.response_ds.dms._2.PointerTagIDType.class,
    AgentIdentificationIDType.class,
    DeclarationDeclarationOfficeIDType.class,
    ArrivalTransportMeansIdentificationIDType.class,
    SellerIdentificationIDType.class,
    GoodsLocationIdentificationIDType.class,
    AuthorisationHolderIdentificationIDType.class,
    UCRIdentificationIDType.class,
    AddressPostcodeIDType.class,
    GuaranteeOfficeIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.PointerTagIDType.class,
    ConsignorIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeQuotaOrderIDType.class,
    UCRTraderAssignedReferenceIDType.class,
    BorderTransportMeansIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.CommunicationIdentificationIDType.class,
    ClassificationIdentificationIDType.class,
    SubmitterIdentificationIDType.class,
    PackagingMarksNumbersIDType.class,
    ExitOfficeIdentificationIDType.class,
    TradeTermsLocationIDType.class,
    ImporterIdentificationIDType.class,
    LoadingLocationIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationFunctionalReferenceIDType.class,
    ConsigneeIdentificationIDType.class,
    AdditionalDocumentIdentificationIDType.class,
    ExporterIdentificationIDType.class,
    AEOMutualRecognitionPartyIdentificationIDType.class,
    ClassificationBindingTariffReferenceIDType.class,
    PreviousDocumentIdentificationIDType.class,
    InvoiceIdentificationIDType.class,
    PayerIdentificationIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.DeclarationIdentificationIDType.class,
    OriginRegionIDType.class,
    SuretyIdentificationIDType.class,
    DangerousGoodsUNDGIDType.class,
    wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeReferenceIDType.class,
    TransportEquipmentIdentificationIDType.class,
    BuyerIdentificationIDType.class,
    PresentationOfficeIdentificationIDType.class,
    SupervisingOfficeIdentificationIDType.class,
    DeclarationIssueLocationIdentificationIDType.class,
    DestinationRegionIDType.class,
    SealIdentificationIDType.class,
    DepartureTransportMeansIdentificationIDType.class,
    DomesticDutyTaxPartyIdentificationIDType.class,
    WarehouseIdentificationIDType.class,
    ObligationGuaranteeIdentificationIDType.class,
    CarrierIdentificationIDType.class,
    DeclarantIdentificationIDType.class
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
