
package un.unece.uncefact.data.standard.unqualifieddatatype._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import wco.datamodel.wco.declaration_ds.dms._2.AEOMutualRecognitionPartyRoleCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentCategoryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentLPCOExemptionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountrySubDivisionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentFunctionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AmendmentChangeReasonCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansModeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthorisationHolderCategoryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansModeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansRegistrationNationalityCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ChargeDeductionChargesTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ClassificationIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ClassificationNameCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.CommunicationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsignmentContainerCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.CurrencyExchangeCurrencyTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.CustomsValuationMethodCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationFunctionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationSpecificCircumstancesCodeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansModeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DestinationCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DomesticDutyTaxPartyRoleCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeDutyRegimeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ExportCountryCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.FreightPaymentMethodCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsLocationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsShipmentTransactionNatureCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemTransactionNatureCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentProcedureCurrentCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentProcedurePreviousCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ItineraryRoutingCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeAccessCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeSecurityDetailsCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.OriginCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.OriginTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PaymentMethodCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PointerDocumentSectionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PreviousDocumentCategoryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PreviousDocumentTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterRoleCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsConditionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsCountryRelationshipCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ValuationAdjustmentAdditionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.WarehouseTypeCodeType;


/**
 * <p>Java class for CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="listAgencyID" type="{urn:un:unece:uncefact:codelist:standard:UNECE:AgencyIdentificationCode:D12B}AgencyIdentificationCodeContentType" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    DutyTaxFeeDutyRegimeCodeType.class,
    BorderTransportMeansModeCodeType.class,
    GovernmentAgencyGoodsItemTransactionNatureCodeType.class,
    DeclarationFunctionCodeType.class,
    AEOMutualRecognitionPartyRoleCodeType.class,
    CurrencyExchangeCurrencyTypeCodeType.class,
    AddressTypeCodeType.class,
    OriginTypeCodeType.class,
    PaymentMethodCodeType.class,
    GovernmentProcedureCurrentCodeType.class,
    AmendmentChangeReasonCodeType.class,
    ClassificationNameCodeType.class,
    DeclarationSpecificCircumstancesCodeCodeType.class,
    CommunicationTypeCodeType.class,
    WarehouseTypeCodeType.class,
    AgentFunctionCodeType.class,
    PreviousDocumentCategoryCodeType.class,
    ClassificationIdentificationTypeCodeType.class,
    TradeTermsCountryRelationshipCodeType.class,
    ArrivalTransportMeansTypeCodeType.class,
    ItineraryRoutingCountryCodeType.class,
    AuthorisationHolderCategoryCodeType.class,
    DestinationCountryCodeType.class,
    PointerDocumentSectionCodeType.class,
    GoodsShipmentTransactionNatureCodeType.class,
    AddressCountrySubDivisionCodeType.class,
    PackagingTypeCodeType.class,
    DutyTaxFeeTypeCodeType.class,
    ObligationGuaranteeAccessCodeType.class,
    AdditionalDocumentTypeCodeType.class,
    FreightPaymentMethodCodeType.class,
    OriginCountryCodeType.class,
    ArrivalTransportMeansModeCodeType.class,
    DomesticDutyTaxPartyRoleCodeType.class,
    AdditionalInformationStatementCodeType.class,
    GoodsLocationTypeCodeType.class,
    ExportCountryCountryCodeType.class,
    BorderTransportMeansTypeCodeType.class,
    AdditionalDocumentLPCOExemptionCodeType.class,
    DepartureTransportMeansModeCodeType.class,
    ArrivalTransportMeansIdentificationTypeCodeType.class,
    AdditionalInformationStatementTypeCodeType.class,
    AddressCountryCodeType.class,
    CustomsValuationMethodCodeType.class,
    ObligationGuaranteeSecurityDetailsCodeType.class,
    GovernmentProcedurePreviousCodeType.class,
    ChargeDeductionChargesTypeCodeType.class,
    PreviousDocumentTypeCodeType.class,
    ValuationAdjustmentAdditionCodeType.class,
    TradeTermsConditionCodeType.class,
    DepartureTransportMeansIdentificationTypeCodeType.class,
    DepartureTransportMeansTypeCodeType.class,
    DeclarationTypeCodeType.class,
    BorderTransportMeansIdentificationTypeCodeType.class,
    ConsignmentContainerCodeType.class,
    AdditionalDocumentCategoryCodeType.class,
    BorderTransportMeansRegistrationNationalityCodeType.class,
    SubmitterRoleCodeType.class
})
public class CodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listID;
    @XmlAttribute(name = "listAgencyID")
    protected String listAgencyID;
    @XmlAttribute(name = "listAgencyName")
    protected String listAgencyName;
    @XmlAttribute(name = "listName")
    protected String listName;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listVersionID;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageID;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;
    @XmlAttribute(name = "listSchemeURI")
    @XmlSchemaType(name = "anyURI")
    protected String listSchemeURI;

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
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the listAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * Sets the value of the listAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * Gets the value of the listAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyName() {
        return listAgencyName;
    }

    /**
     * Sets the value of the listAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    /**
     * Gets the value of the listName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Gets the value of the listVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Sets the value of the listVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Gets the value of the listURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * Sets the value of the listURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * Gets the value of the listSchemeURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSchemeURI() {
        return listSchemeURI;
    }

    /**
     * Sets the value of the listSchemeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSchemeURI(String value) {
        this.listSchemeURI = value;
    }

}
