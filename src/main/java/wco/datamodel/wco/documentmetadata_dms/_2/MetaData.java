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

package wco.datamodel.wco.documentmetadata_dms._2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *         &lt;choice>
 *           &lt;group ref="{urn:wco:datamodel:WCO:DocumentMetaData-DMS:2}Declaration"/>
 *           &lt;group ref="{urn:wco:datamodel:WCO:DocumentMetaData-DMS:2}Response" maxOccurs="unbounded"/>
 *         &lt;/choice>
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
    "any",
    "response"
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
    @XmlAnyElement(lax = true)
    protected List<Object> response;

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

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getResponse() {
        if (response == null) {
            response = new ArrayList<Object>();
        }
        return this.response;
    }

}
