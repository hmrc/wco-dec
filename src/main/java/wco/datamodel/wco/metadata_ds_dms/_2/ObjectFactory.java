/*
 * Copyright 2023 HM Revenue & Customs
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

package wco.datamodel.wco.metadata_ds_dms._2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wco.datamodel.wco.metadata_ds_dms._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wco.datamodel.wco.metadata_ds_dms._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetaDataWCODataModelVersionCodeType }
     * 
     */
    public MetaDataWCODataModelVersionCodeType createMetaDataWCODataModelVersionCodeType() {
        return new MetaDataWCODataModelVersionCodeType();
    }

    /**
     * Create an instance of {@link MetaDataWCOTypeNameTextType }
     * 
     */
    public MetaDataWCOTypeNameTextType createMetaDataWCOTypeNameTextType() {
        return new MetaDataWCOTypeNameTextType();
    }

    /**
     * Create an instance of {@link MetaDataResponsibleCountryCodeType }
     * 
     */
    public MetaDataResponsibleCountryCodeType createMetaDataResponsibleCountryCodeType() {
        return new MetaDataResponsibleCountryCodeType();
    }

    /**
     * Create an instance of {@link MetaDataResponsibleAgencyNameTextType }
     * 
     */
    public MetaDataResponsibleAgencyNameTextType createMetaDataResponsibleAgencyNameTextType() {
        return new MetaDataResponsibleAgencyNameTextType();
    }

    /**
     * Create an instance of {@link MetaDataAgencyAssignedCustomizationCodeType }
     * 
     */
    public MetaDataAgencyAssignedCustomizationCodeType createMetaDataAgencyAssignedCustomizationCodeType() {
        return new MetaDataAgencyAssignedCustomizationCodeType();
    }

    /**
     * Create an instance of {@link MetaDataAgencyAssignedCustomizationVersionCodeType }
     * 
     */
    public MetaDataAgencyAssignedCustomizationVersionCodeType createMetaDataAgencyAssignedCustomizationVersionCodeType() {
        return new MetaDataAgencyAssignedCustomizationVersionCodeType();
    }

}
