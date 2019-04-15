
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
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCityNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountrySubDivisionNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressLineTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthenticationAuthenticationTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthenticatorNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.BuyerNameTextType;
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
import wco.datamodel.wco.declaration_ds.dms._2.ManufacturerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingPackingMaterialDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.PayerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.RefundRecipientPartyNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SellerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SuretyNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsLocationNameTextType;


/**
 * <p>Java class for TextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", propOrder = {
    "value"
})
@XmlSeeAlso({
    TradeTermsDescriptionTextType.class,
    AuthenticatorNameTextType.class,
    CommodityDescriptionTextType.class,
    AgentNameTextType.class,
    ManufacturerNameTextType.class,
    PackagingPackingMaterialDescriptionTextType.class,
    TradeTermsLocationNameTextType.class,
    ConsignorNameTextType.class,
    SubmitterNameTextType.class,
    AuthenticationAuthenticationTextType.class,
    ArrivalTransportMeansNameTextType.class,
    PayerNameTextType.class,
    DeclarantNameTextType.class,
    ImporterNameTextType.class,
    GoodsLocationNameTextType.class,
    BorderTransportMeansNameTextType.class,
    ConsigneeNameTextType.class,
    AdditionalDocumentNameTextType.class,
    ExporterNameTextType.class,
    ContactNameTextType.class,
    AdditionalInformationStatementDescriptionTextType.class,
    LoadingLocationNameTextType.class,
    SellerNameTextType.class,
    AddressLineTextType.class,
    SuretyNameTextType.class,
    DepartureTransportMeansNameTextType.class,
    AddressCityNameTextType.class,
    AddressCountrySubDivisionNameTextType.class,
    RefundRecipientPartyNameTextType.class,
    BuyerNameTextType.class
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
