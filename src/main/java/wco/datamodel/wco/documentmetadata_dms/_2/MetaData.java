
package wco.datamodel.wco.documentmetadata_dms._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import wco.datamodel.wco.metadata_ds_dms._2.MetaDataAgencyAssignedCustomizationCodeType;
import wco.datamodel.wco.metadata_ds_dms._2.MetaDataAgencyAssignedCustomizationVersionCodeType;
import wco.datamodel.wco.metadata_ds_dms._2.MetaDataResponsibleAgencyNameTextType;
import wco.datamodel.wco.metadata_ds_dms._2.MetaDataResponsibleCountryCodeType;
import wco.datamodel.wco.metadata_ds_dms._2.MetaDataWCODataModelVersionCodeType;
import wco.datamodel.wco.metadata_ds_dms._2.MetaDataWCOTypeNameTextType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WCODataModelVersionCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataWCODataModelVersionCodeType" minOccurs="0"/>
 *         &lt;element name="WCOTypeName" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataWCOTypeNameTextType" minOccurs="0"/>
 *         &lt;element name="ResponsibleCountryCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataResponsibleCountryCodeType" minOccurs="0"/>
 *         &lt;element name="ResponsibleAgencyName" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataResponsibleAgencyNameTextType" minOccurs="0"/>
 *         &lt;element name="AgencyAssignedCustomizationCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataAgencyAssignedCustomizationCodeType" minOccurs="0"/>
 *         &lt;element name="AgencyAssignedCustomizationVersionCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataAgencyAssignedCustomizationVersionCodeType" minOccurs="0"/>
 *         &lt;group ref="{urn:wco:datamodel:WCO:DocumentMetaData-DMS:2}Declaration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wcoDataModelVersionCode",
    "wcoTypeName",
    "responsibleCountryCode",
    "responsibleAgencyName",
    "agencyAssignedCustomizationCode",
    "agencyAssignedCustomizationVersionCode",
    "any"
})
@XmlRootElement(name = "MetaData")
public class MetaData {

    @XmlElement(name = "WCODataModelVersionCode")
    protected MetaDataWCODataModelVersionCodeType wcoDataModelVersionCode;
    @XmlElement(name = "WCOTypeName")
    protected MetaDataWCOTypeNameTextType wcoTypeName;
    @XmlElement(name = "ResponsibleCountryCode")
    protected MetaDataResponsibleCountryCodeType responsibleCountryCode;
    @XmlElement(name = "ResponsibleAgencyName")
    protected MetaDataResponsibleAgencyNameTextType responsibleAgencyName;
    @XmlElement(name = "AgencyAssignedCustomizationCode")
    protected MetaDataAgencyAssignedCustomizationCodeType agencyAssignedCustomizationCode;
    @XmlElement(name = "AgencyAssignedCustomizationVersionCode")
    protected MetaDataAgencyAssignedCustomizationVersionCodeType agencyAssignedCustomizationVersionCode;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the wcoDataModelVersionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataWCODataModelVersionCodeType }
     *     
     */
    public MetaDataWCODataModelVersionCodeType getWCODataModelVersionCode() {
        return wcoDataModelVersionCode;
    }

    /**
     * Sets the value of the wcoDataModelVersionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataWCODataModelVersionCodeType }
     *     
     */
    public void setWCODataModelVersionCode(MetaDataWCODataModelVersionCodeType value) {
        this.wcoDataModelVersionCode = value;
    }

    /**
     * Gets the value of the wcoTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataWCOTypeNameTextType }
     *     
     */
    public MetaDataWCOTypeNameTextType getWCOTypeName() {
        return wcoTypeName;
    }

    /**
     * Sets the value of the wcoTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataWCOTypeNameTextType }
     *     
     */
    public void setWCOTypeName(MetaDataWCOTypeNameTextType value) {
        this.wcoTypeName = value;
    }

    /**
     * Gets the value of the responsibleCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataResponsibleCountryCodeType }
     *     
     */
    public MetaDataResponsibleCountryCodeType getResponsibleCountryCode() {
        return responsibleCountryCode;
    }

    /**
     * Sets the value of the responsibleCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataResponsibleCountryCodeType }
     *     
     */
    public void setResponsibleCountryCode(MetaDataResponsibleCountryCodeType value) {
        this.responsibleCountryCode = value;
    }

    /**
     * Gets the value of the responsibleAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataResponsibleAgencyNameTextType }
     *     
     */
    public MetaDataResponsibleAgencyNameTextType getResponsibleAgencyName() {
        return responsibleAgencyName;
    }

    /**
     * Sets the value of the responsibleAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataResponsibleAgencyNameTextType }
     *     
     */
    public void setResponsibleAgencyName(MetaDataResponsibleAgencyNameTextType value) {
        this.responsibleAgencyName = value;
    }

    /**
     * Gets the value of the agencyAssignedCustomizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAgencyAssignedCustomizationCodeType }
     *     
     */
    public MetaDataAgencyAssignedCustomizationCodeType getAgencyAssignedCustomizationCode() {
        return agencyAssignedCustomizationCode;
    }

    /**
     * Sets the value of the agencyAssignedCustomizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAgencyAssignedCustomizationCodeType }
     *     
     */
    public void setAgencyAssignedCustomizationCode(MetaDataAgencyAssignedCustomizationCodeType value) {
        this.agencyAssignedCustomizationCode = value;
    }

    /**
     * Gets the value of the agencyAssignedCustomizationVersionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAgencyAssignedCustomizationVersionCodeType }
     *     
     */
    public MetaDataAgencyAssignedCustomizationVersionCodeType getAgencyAssignedCustomizationVersionCode() {
        return agencyAssignedCustomizationVersionCode;
    }

    /**
     * Sets the value of the agencyAssignedCustomizationVersionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAgencyAssignedCustomizationVersionCodeType }
     *     
     */
    public void setAgencyAssignedCustomizationVersionCode(MetaDataAgencyAssignedCustomizationVersionCodeType value) {
        this.agencyAssignedCustomizationVersionCode = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
