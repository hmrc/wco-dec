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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WCODataModelVersionCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataWCODataModelVersionCodeType" minOccurs="0"/>
 *         <element name="WCOTypeName" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataWCOTypeNameTextType" minOccurs="0"/>
 *         <element name="ResponsibleCountryCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataResponsibleCountryCodeType" minOccurs="0"/>
 *         <element name="ResponsibleAgencyName" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataResponsibleAgencyNameTextType" minOccurs="0"/>
 *         <element name="AgencyAssignedCustomizationCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataAgencyAssignedCustomizationCodeType" minOccurs="0"/>
 *         <element name="AgencyAssignedCustomizationVersionCode" type="{urn:wco:datamodel:WCO:MetaData_DS-DMS:2}MetaDataAgencyAssignedCustomizationVersionCodeType" minOccurs="0"/>
 *         <choice>
 *           <group ref="{urn:wco:datamodel:WCO:DocumentMetaData-DMS:2}Declaration"/>
 *           <group ref="{urn:wco:datamodel:WCO:DocumentMetaData-DMS:2}Response" maxOccurs="unbounded"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..6&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCO code list&lt;/WCOCodeRemarks&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. WCO Data Model Version. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataWCODataModelVersionCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCODataModelVersionCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCO Data Model Version&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9010&lt;/UniquePositionID&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "WCODataModelVersionCode")
    protected MetaDataWCODataModelVersionCodeType wcoDataModelVersionCode;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. WCO Type Name. Text&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataWCOTypeNameTextType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCOTypeName&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCO Type Name&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9013&lt;/UniquePositionID&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "WCOTypeName")
    protected MetaDataWCOTypeNameTextType wcoTypeName;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;a2&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. Responsible Country. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataResponsibleCountryCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsibleCountryCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Responsible Country&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9014&lt;/UniquePositionID&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "ResponsibleCountryCode")
    protected MetaDataResponsibleCountryCodeType responsibleCountryCode;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..70&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. ResponsibleAgencyName. Text&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataResponsibleAgencyNameTextType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsibleAgencyName&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Responsible Agency Name&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9016&lt;/UniquePositionID&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "ResponsibleAgencyName")
    protected MetaDataResponsibleAgencyNameTextType responsibleAgencyName;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..6&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;User codes&lt;/WCOCodeRemarks&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. Agency Assigned Customization. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataAgencyAssignedCustomizationCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AgencyAssignedCustomizationCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Agency Assigned Customization&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9000&lt;/UniquePositionID&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "AgencyAssignedCustomizationCode")
    protected MetaDataAgencyAssignedCustomizationCodeType agencyAssignedCustomizationCode;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..3&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;User codes&lt;/WCOCodeRemarks&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. Agency Assigned Customization Version. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataAgencyAssignedCustomizationVersionCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AgencyAssignedCustomizationVersionCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Agency Assigned Customization Version&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9017&lt;/UniquePositionID&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "AgencyAssignedCustomizationVersionCode")
    protected MetaDataAgencyAssignedCustomizationVersionCodeType agencyAssignedCustomizationVersionCode;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAnyElement(lax = true)
    protected List<Object> response;

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..6&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCO code list&lt;/WCOCodeRemarks&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. WCO Data Model Version. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataWCODataModelVersionCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCODataModelVersionCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCO Data Model Version&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9010&lt;/UniquePositionID&gt;
     * </pre>
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
     * @see #getWCODataModelVersionCode()
     */
    public void setWCODataModelVersionCode(MetaDataWCODataModelVersionCodeType value) {
        this.wcoDataModelVersionCode = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. WCO Type Name. Text&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataWCOTypeNameTextType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCOTypeName&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;WCO Type Name&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9013&lt;/UniquePositionID&gt;
     * </pre>
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
     * @see #getWCOTypeName()
     */
    public void setWCOTypeName(MetaDataWCOTypeNameTextType value) {
        this.wcoTypeName = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;a2&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. Responsible Country. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataResponsibleCountryCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsibleCountryCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Responsible Country&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9014&lt;/UniquePositionID&gt;
     * </pre>
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
     * @see #getResponsibleCountryCode()
     */
    public void setResponsibleCountryCode(MetaDataResponsibleCountryCodeType value) {
        this.responsibleCountryCode = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..70&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. ResponsibleAgencyName. Text&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataResponsibleAgencyNameTextType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsibleAgencyName&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Responsible Agency Name&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9016&lt;/UniquePositionID&gt;
     * </pre>
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
     * @see #getResponsibleAgencyName()
     */
    public void setResponsibleAgencyName(MetaDataResponsibleAgencyNameTextType value) {
        this.responsibleAgencyName = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..6&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;User codes&lt;/WCOCodeRemarks&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. Agency Assigned Customization. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataAgencyAssignedCustomizationCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AgencyAssignedCustomizationCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Agency Assigned Customization&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9000&lt;/UniquePositionID&gt;
     * </pre>
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
     * @see #getAgencyAssignedCustomizationCode()
     */
    public void setAgencyAssignedCustomizationCode(MetaDataAgencyAssignedCustomizationCodeType value) {
        this.agencyAssignedCustomizationCode = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..3&lt;/WCOFormat&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;User codes&lt;/WCOCodeRemarks&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document Meta Data. Agency Assigned Customization Version. Code&lt;/DictionaryEntryName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentMetaDataAgencyAssignedCustomizationVersionCodeType&lt;/NamedComplexType&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AgencyAssignedCustomizationVersionCode&lt;/XMLTag&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Agency Assigned Customization Version&lt;/WCOName&gt;
     * </pre>
     * 
     *               
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:DocumentMetaData-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:MetaData_DS-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9017&lt;/UniquePositionID&gt;
     * </pre>
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
     * @see #getAgencyAssignedCustomizationVersionCode()
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the response property.
     */
    public List<Object> getResponse() {
        if (response == null) {
            response = new ArrayList<>();
        }
        return this.response;
    }

}
