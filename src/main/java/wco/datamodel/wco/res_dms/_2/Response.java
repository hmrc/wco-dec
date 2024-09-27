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

package wco.datamodel.wco.res_dms._2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import wco.datamodel.wco.response_ds.dms._2.AdditionalInformationLimitDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.AdditionalInformationStatementCodeType;
import wco.datamodel.wco.response_ds.dms._2.AdditionalInformationStatementDescriptionTextType;
import wco.datamodel.wco.response_ds.dms._2.AdditionalInformationStatementTypeCodeType;
import wco.datamodel.wco.response_ds.dms._2.AmendmentChangeReasonCodeType;
import wco.datamodel.wco.response_ds.dms._2.AppealOfficeIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.BankAccountIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.BankReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.CommunicationIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.CommunicationTypeCodeType;
import wco.datamodel.wco.response_ds.dms._2.ContactOfficeIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationAcceptanceDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationCancellationDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationFunctionalReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationIdentificationIDType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationRejectionDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.DeclarationVersionIDType;
import wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeAdValoremTaxBaseAmountType;
import wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeDeductAmountType;
import wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeDutyRegimeCodeType;
import wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeSpecificTaxBaseQuantityType;
import wco.datamodel.wco.response_ds.dms._2.DutyTaxFeeTypeCodeType;
import wco.datamodel.wco.response_ds.dms._2.ErrorDescriptionTextType;
import wco.datamodel.wco.response_ds.dms._2.ErrorValidationCodeType;
import wco.datamodel.wco.response_ds.dms._2.ObligationGuaranteeReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.PaymentDueDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.PaymentPaymentAmountType;
import wco.datamodel.wco.response_ds.dms._2.PaymentReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.PaymentTaxAssessedAmountType;
import wco.datamodel.wco.response_ds.dms._2.PointerDocumentSectionCodeType;
import wco.datamodel.wco.response_ds.dms._2.PointerTagIDType;
import wco.datamodel.wco.response_ds.dms._2.ResponseFunctionCodeType;
import wco.datamodel.wco.response_ds.dms._2.ResponseFunctionalReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.ResponseIssueDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.StatusEffectiveDateTimeType;
import wco.datamodel.wco.response_ds.dms._2.StatusNameCodeType;
import wco.datamodel.wco.response_ds.dms._2.StatusReleaseDateTimeType;


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
 *         <element name="FunctionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ResponseFunctionCodeType"/>
 *         <element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ResponseFunctionalReferenceIDType" minOccurs="0"/>
 *         <element name="IssueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ResponseIssueDateTimeType" minOccurs="0"/>
 *         <element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StatementCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                   <element name="StatementDescription" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
 *                   <element name="LimitDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
 *                   <element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
 *                   <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Amendment" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ChangeReasonCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AmendmentChangeReasonCodeType" minOccurs="0"/>
 *                   <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AppealOffice" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AppealOfficeIdentificationIDType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Bank" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankReferenceIDType" minOccurs="0"/>
 *                   <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankAccountIdentificationIDType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ContactOffice" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ContactOfficeIdentificationIDType" minOccurs="0"/>
 *                   <element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                             <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Error" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Description" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorDescriptionTextType" minOccurs="0"/>
 *                   <element name="ValidationCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorValidationCodeType" minOccurs="0"/>
 *                   <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Status" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusEffectiveDateTimeType" minOccurs="0"/>
 *                   <element name="NameCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusNameCodeType" minOccurs="0"/>
 *                   <element name="ReleaseDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusReleaseDateTimeType" minOccurs="0"/>
 *                   <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Declaration">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AcceptanceDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationAcceptanceDateTimeType" minOccurs="0"/>
 *                   <element name="CancellationDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationCancellationDateTimeType" minOccurs="0"/>
 *                   <element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationFunctionalReferenceIDType" minOccurs="0"/>
 *                   <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationIdentificationIDType" minOccurs="0"/>
 *                   <element name="RejectionDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationRejectionDateTimeType" minOccurs="0"/>
 *                   <element name="VersionID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationVersionIDType" minOccurs="0"/>
 *                   <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Payment" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
 *                                       <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
 *                                       <element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
 *                                       <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
 *                                       <element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
 *                                               </sequence>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="GoodsShipment" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
 *                                       <element name="Commodity" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
 *                                                   <complexType>
 *                                                     <complexContent>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         <sequence>
 *                                                           <element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
 *                                                           <element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
 *                                                           <element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
 *                                                           <element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
 *                                                           <element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
 *                                                           <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
 *                                                           <element name="Payment" minOccurs="0">
 *                                                             <complexType>
 *                                                               <complexContent>
 *                                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   <sequence>
 *                                                                     <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
 *                                                                     <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
 *                                                                   </sequence>
 *                                                                 </restriction>
 *                                                               </complexContent>
 *                                                             </complexType>
 *                                                           </element>
 *                                                         </sequence>
 *                                                       </restriction>
 *                                                     </complexContent>
 *                                                   </complexType>
 *                                                 </element>
 *                                               </sequence>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{urn:wco:datamodel:WCO:DEC-DMS:2}Declaration" minOccurs="0"/>
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
    "content"
})
@XmlRootElement(name = "Response")
public class Response {

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Declaration" is used by two different parts of a schema. See: 
     * line 1426 of file:/home/luke/devel/clients/hmrc/cds/wco-dec/updateSchema/customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
     * line 832 of file:/home/luke/devel/clients/hmrc/cds/wco-dec/updateSchema/customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:
     * 
     */
    @XmlElementRefs({
        @XmlElementRef(name = "FunctionCode", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FunctionalReferenceID", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IssueDateTime", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AdditionalInformation", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Amendment", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AppealOffice", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bank", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ContactOffice", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Error", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Status", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Declaration", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Declaration", namespace = "urn:wco:datamodel:WCO:DEC-DMS:2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Declaration" is used by two different parts of a schema. See: 
     * line 1426 of file:/home/luke/devel/clients/hmrc/cds/wco-dec/updateSchema/customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
     * line 832 of file:/home/luke/devel/clients/hmrc/cds/wco-dec/updateSchema/customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:
     * 
     * Gets the value of the content property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link wco.datamodel.wco.dec_dms._2.Declaration }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.AdditionalInformation }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Amendment }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.AppealOffice }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Bank }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.ContactOffice }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Declaration }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Error }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Status }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseFunctionCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseFunctionalReferenceIDType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseIssueDateTimeType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }


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
     *         <element name="StatementCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *         <element name="StatementDescription" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
     *         <element name="LimitDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
     *         <element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
     *         <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "statementCode",
        "statementDescription",
        "limitDateTime",
        "statementTypeCode",
        "pointer"
    })
    public static class AdditionalInformation {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4441&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FreeText.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Statement. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationStatementCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatementCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4367&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "StatementCode")
        protected AdditionalInformationStatementCodeType statementCode;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4440&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FreeText.Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Statement Description. Text&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationStatementDescriptionTextType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatementDescription&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4368&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "StatementDescription")
        protected AdditionalInformationStatementDescriptionTextType statementDescription;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2380&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Date Or Time Or Period. Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Limit. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationLimitDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;LimitDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;829&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "LimitDateTime")
        protected AdditionalInformationLimitDateTimeType limitDateTime;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4451&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Free Text. Subject.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Statement Type. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationStatementTypeCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatementTypeCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4369&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "StatementTypeCode")
        protected AdditionalInformationStatementTypeCodeType statementTypeCode;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "Pointer")
        protected List<Response.AdditionalInformation.Pointer> pointer;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4441&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FreeText.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Statement. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationStatementCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatementCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4367&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link AdditionalInformationStatementCodeType }
         *     
         */
        public AdditionalInformationStatementCodeType getStatementCode() {
            return statementCode;
        }

        /**
         * Sets the value of the statementCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalInformationStatementCodeType }
         *     
         * @see #getStatementCode()
         */
        public void setStatementCode(AdditionalInformationStatementCodeType value) {
            this.statementCode = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4440&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FreeText.Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Statement Description. Text&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationStatementDescriptionTextType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatementDescription&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4368&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link AdditionalInformationStatementDescriptionTextType }
         *     
         */
        public AdditionalInformationStatementDescriptionTextType getStatementDescription() {
            return statementDescription;
        }

        /**
         * Sets the value of the statementDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalInformationStatementDescriptionTextType }
         *     
         * @see #getStatementDescription()
         */
        public void setStatementDescription(AdditionalInformationStatementDescriptionTextType value) {
            this.statementDescription = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2380&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Date Or Time Or Period. Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Limit. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationLimitDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;LimitDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;829&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link AdditionalInformationLimitDateTimeType }
         *     
         */
        public AdditionalInformationLimitDateTimeType getLimitDateTime() {
            return limitDateTime;
        }

        /**
         * Sets the value of the limitDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalInformationLimitDateTimeType }
         *     
         * @see #getLimitDateTime()
         */
        public void setLimitDateTime(AdditionalInformationLimitDateTimeType value) {
            this.limitDateTime = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4451&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Free Text. Subject.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Additional Information. Statement Type. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdditionalInformationStatementTypeCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatementTypeCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4369&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link AdditionalInformationStatementTypeCodeType }
         *     
         */
        public AdditionalInformationStatementTypeCodeType getStatementTypeCode() {
            return statementTypeCode;
        }

        /**
         * Sets the value of the statementTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalInformationStatementTypeCodeType }
         *     
         * @see #getStatementTypeCode()
         */
        public void setStatementTypeCode(AdditionalInformationStatementTypeCodeType value) {
            this.statementTypeCode = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * Gets the value of the pointer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.AdditionalInformation.Pointer }
         * </p>
         * 
         * 
         * @return
         *     The value of the pointer property.
         */
        public List<Response.AdditionalInformation.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<>();
            }
            return this.pointer;
        }


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
         *         <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;424&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;425&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;426&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;424&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSequenceNumeric() {
                return sequenceNumeric;
            }

            /**
             * Sets the value of the sequenceNumeric property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSequenceNumeric()
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;425&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             */
            public PointerDocumentSectionCodeType getDocumentSectionCode() {
                return documentSectionCode;
            }

            /**
             * Sets the value of the documentSectionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             * @see #getDocumentSectionCode()
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;426&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerTagIDType }
             *     
             */
            public PointerTagIDType getTagID() {
                return tagID;
            }

            /**
             * Sets the value of the tagID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerTagIDType }
             *     
             * @see #getTagID()
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }


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
     *         <element name="ChangeReasonCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AmendmentChangeReasonCodeType" minOccurs="0"/>
     *         <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "changeReasonCode",
        "pointer"
    })
    public static class Amendment {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4295&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Change.Reason.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Amendment. Change Reason. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AmendmentChangeReasonCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ChangeReasonCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;427&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ChangeReasonCode")
        protected AmendmentChangeReasonCodeType changeReasonCode;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "Pointer")
        protected List<Response.Amendment.Pointer> pointer;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4295&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Change.Reason.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Amendment. Change Reason. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AmendmentChangeReasonCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ChangeReasonCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;427&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link AmendmentChangeReasonCodeType }
         *     
         */
        public AmendmentChangeReasonCodeType getChangeReasonCode() {
            return changeReasonCode;
        }

        /**
         * Sets the value of the changeReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmendmentChangeReasonCodeType }
         *     
         * @see #getChangeReasonCode()
         */
        public void setChangeReasonCode(AmendmentChangeReasonCodeType value) {
            this.changeReasonCode = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * Gets the value of the pointer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Amendment.Pointer }
         * </p>
         * 
         * 
         * @return
         *     The value of the pointer property.
         */
        public List<Response.Amendment.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<>();
            }
            return this.pointer;
        }


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
         *         <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;428&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;429&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;430&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;428&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSequenceNumeric() {
                return sequenceNumeric;
            }

            /**
             * Sets the value of the sequenceNumeric property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSequenceNumeric()
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;429&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             */
            public PointerDocumentSectionCodeType getDocumentSectionCode() {
                return documentSectionCode;
            }

            /**
             * Sets the value of the documentSectionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             * @see #getDocumentSectionCode()
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;430&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerTagIDType }
             *     
             */
            public PointerTagIDType getTagID() {
                return tagID;
            }

            /**
             * Sets the value of the tagID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerTagIDType }
             *     
             * @see #getTagID()
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }


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
     *         <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AppealOfficeIdentificationIDType" minOccurs="0"/>
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
        "id"
    })
    public static class AppealOffice {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3225&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Location.Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Appeal Office. Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AppealOfficeIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4312&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ID")
        protected AppealOfficeIdentificationIDType id;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3225&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Location.Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Appeal Office. Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AppealOfficeIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4312&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link AppealOfficeIdentificationIDType }
         *     
         */
        public AppealOfficeIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealOfficeIdentificationIDType }
         *     
         * @see #getID()
         */
        public void setID(AppealOfficeIdentificationIDType value) {
            this.id = value;
        }

    }


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
     *         <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankReferenceIDType" minOccurs="0"/>
     *         <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankAccountIdentificationIDType" minOccurs="0"/>
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
        "referenceID",
        "id"
    })
    public static class Bank {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3039&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Party. Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Bank. Reference. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;BankReferenceIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReferenceID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4321&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ReferenceID")
        protected BankReferenceIDType referenceID;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IBAN /SWIFT /BIC Codes&lt;/WCOCodeRemarks&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1147&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Account. Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Bank. Account Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;BankAccountIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AccountID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4322&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ID")
        protected BankAccountIdentificationIDType id;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3039&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Party. Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Bank. Reference. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;BankReferenceIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReferenceID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4321&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link BankReferenceIDType }
         *     
         */
        public BankReferenceIDType getReferenceID() {
            return referenceID;
        }

        /**
         * Sets the value of the referenceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankReferenceIDType }
         *     
         * @see #getReferenceID()
         */
        public void setReferenceID(BankReferenceIDType value) {
            this.referenceID = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOCodeRemarks xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IBAN /SWIFT /BIC Codes&lt;/WCOCodeRemarks&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1147&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Account. Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Bank. Account Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;BankAccountIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AccountID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4322&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link BankAccountIdentificationIDType }
         *     
         */
        public BankAccountIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAccountIdentificationIDType }
         *     
         * @see #getID()
         */
        public void setID(BankAccountIdentificationIDType value) {
            this.id = value;
        }

    }


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
     *         <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ContactOfficeIdentificationIDType" minOccurs="0"/>
     *         <element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                   <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "id",
        "communication"
    })
    public static class ContactOffice {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3225&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Location.Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Contact Office. Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ContactOfficeIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4323&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ID")
        protected ContactOfficeIdentificationIDType id;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "Communication")
        protected List<Response.ContactOffice.Communication> communication;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3225&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Location.Identifier&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Contact Office. Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ContactOfficeIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4323&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link ContactOfficeIdentificationIDType }
         *     
         */
        public ContactOfficeIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactOfficeIdentificationIDType }
         *     
         * @see #getID()
         */
        public void setID(ContactOfficeIdentificationIDType value) {
            this.id = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * Gets the value of the communication property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the communication property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCommunication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.ContactOffice.Communication }
         * </p>
         * 
         * 
         * @return
         *     The value of the communication property.
         */
        public List<Response.ContactOffice.Communication> getCommunication() {
            if (communication == null) {
                communication = new ArrayList<>();
            }
            return this.communication;
        }


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
         *         <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *         <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
            "id",
            "typeCode"
        })
        public static class Communication {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3148&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication.Address.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication. Identification. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CommunicationIdentificationIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4327&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "ID")
            protected CommunicationIdentificationIDType id;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3155&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication.MeansType.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication. Type. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CommunicationTypeCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TypeCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4328&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "TypeCode")
            protected CommunicationTypeCodeType typeCode;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3148&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication.Address.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication. Identification. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CommunicationIdentificationIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4327&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link CommunicationIdentificationIDType }
             *     
             */
            public CommunicationIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommunicationIdentificationIDType }
             *     
             * @see #getID()
             */
            public void setID(CommunicationIdentificationIDType value) {
                this.id = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3155&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication.MeansType.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Communication. Type. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CommunicationTypeCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TypeCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4328&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link CommunicationTypeCodeType }
             *     
             */
            public CommunicationTypeCodeType getTypeCode() {
                return typeCode;
            }

            /**
             * Sets the value of the typeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommunicationTypeCodeType }
             *     
             * @see #getTypeCode()
             */
            public void setTypeCode(CommunicationTypeCodeType value) {
                this.typeCode = value;
            }

        }

    }


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
     *         <element name="AcceptanceDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationAcceptanceDateTimeType" minOccurs="0"/>
     *         <element name="CancellationDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationCancellationDateTimeType" minOccurs="0"/>
     *         <element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationFunctionalReferenceIDType" minOccurs="0"/>
     *         <element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationIdentificationIDType" minOccurs="0"/>
     *         <element name="RejectionDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationRejectionDateTimeType" minOccurs="0"/>
     *         <element name="VersionID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationVersionIDType" minOccurs="0"/>
     *         <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Payment" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
     *                             <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
     *                             <element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
     *                             <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
     *                             <element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="GoodsShipment" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
     *                             <element name="Commodity" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <sequence>
     *                                                 <element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
     *                                                 <element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
     *                                                 <element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
     *                                                 <element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
     *                                                 <element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
     *                                                 <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
     *                                                 <element name="Payment" minOccurs="0">
     *                                                   <complexType>
     *                                                     <complexContent>
     *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         <sequence>
     *                                                           <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
     *                                                           <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
     *                                                         </sequence>
     *                                                       </restriction>
     *                                                     </complexContent>
     *                                                   </complexType>
     *                                                 </element>
     *                                               </sequence>
     *                                             </restriction>
     *                                           </complexContent>
     *                                         </complexType>
     *                                       </element>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "acceptanceDateTime",
        "cancellationDateTime",
        "functionalReferenceID",
        "id",
        "rejectionDateTime",
        "versionID",
        "dutyTaxFee",
        "goodsShipment"
    })
    public static class Declaration {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Acceptance. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationAcceptanceDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AcceptanceDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;339&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "AcceptanceDateTime")
        protected DeclarationAcceptanceDateTimeType acceptanceDateTime;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Cancellation. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationCancellationDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CancellationDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;349&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "CancellationDateTime")
        protected DeclarationCancellationDateTimeType cancellationDateTime;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Functional Reference. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationFunctionalReferenceIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FunctionalReferenceID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;338&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRI xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRI&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRE xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRE&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCONV xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCONV&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationTRT xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationTRT&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "FunctionalReferenceID")
        protected DeclarationFunctionalReferenceIDType functionalReferenceID;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;336&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRI xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRI&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRE xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRE&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCONV xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCONV&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationTRT xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationTRT&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ID")
        protected DeclarationIdentificationIDType id;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Rejection. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationRejectionDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RejectionDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;350&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "RejectionDateTime")
        protected DeclarationRejectionDateTimeType rejectionDateTime;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Version. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationVersionIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;VersionID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationTRT xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationTRT&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;10289&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "VersionID")
        protected DeclarationVersionIDType versionID;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCONV xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCONV&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "DutyTaxFee")
        protected List<Response.Declaration.DutyTaxFee> dutyTaxFee;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "GoodsShipment")
        protected Response.Declaration.GoodsShipment goodsShipment;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Acceptance. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationAcceptanceDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AcceptanceDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;339&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link DeclarationAcceptanceDateTimeType }
         *     
         */
        public DeclarationAcceptanceDateTimeType getAcceptanceDateTime() {
            return acceptanceDateTime;
        }

        /**
         * Sets the value of the acceptanceDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationAcceptanceDateTimeType }
         *     
         * @see #getAcceptanceDateTime()
         */
        public void setAcceptanceDateTime(DeclarationAcceptanceDateTimeType value) {
            this.acceptanceDateTime = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Cancellation. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationCancellationDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CancellationDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;349&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link DeclarationCancellationDateTimeType }
         *     
         */
        public DeclarationCancellationDateTimeType getCancellationDateTime() {
            return cancellationDateTime;
        }

        /**
         * Sets the value of the cancellationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationCancellationDateTimeType }
         *     
         * @see #getCancellationDateTime()
         */
        public void setCancellationDateTime(DeclarationCancellationDateTimeType value) {
            this.cancellationDateTime = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Functional Reference. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationFunctionalReferenceIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FunctionalReferenceID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;338&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRI xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRI&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRE xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRE&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCONV xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCONV&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationTRT xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationTRT&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link DeclarationFunctionalReferenceIDType }
         *     
         */
        public DeclarationFunctionalReferenceIDType getFunctionalReferenceID() {
            return functionalReferenceID;
        }

        /**
         * Sets the value of the functionalReferenceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationFunctionalReferenceIDType }
         *     
         * @see #getFunctionalReferenceID()
         */
        public void setFunctionalReferenceID(DeclarationFunctionalReferenceIDType value) {
            this.functionalReferenceID = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Identification. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationIdentificationIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;336&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRI xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRI&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCRE xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCRE&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCONV xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCONV&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationTRT xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationTRT&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link DeclarationIdentificationIDType }
         *     
         */
        public DeclarationIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationIdentificationIDType }
         *     
         * @see #getID()
         */
        public void setID(DeclarationIdentificationIDType value) {
            this.id = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Rejection. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationRejectionDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RejectionDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;350&lt;/UniquePositionID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link DeclarationRejectionDateTimeType }
         *     
         */
        public DeclarationRejectionDateTimeType getRejectionDateTime() {
            return rejectionDateTime;
        }

        /**
         * Sets the value of the rejectionDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationRejectionDateTimeType }
         *     
         * @see #getRejectionDateTime()
         */
        public void setRejectionDateTime(DeclarationRejectionDateTimeType value) {
            this.rejectionDateTime = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Declaration. Version. Identifier&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeclarationVersionIDType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;VersionID&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationTRT xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationTRT&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;10289&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link DeclarationVersionIDType }
         *     
         */
        public DeclarationVersionIDType getVersionID() {
            return versionID;
        }

        /**
         * Sets the value of the versionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationVersionIDType }
         *     
         * @see #getVersionID()
         */
        public void setVersionID(DeclarationVersionIDType value) {
            this.versionID = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationCONV xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationCONV&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * Gets the value of the dutyTaxFee property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dutyTaxFee property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDutyTaxFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Declaration.DutyTaxFee }
         * </p>
         * 
         * 
         * @return
         *     The value of the dutyTaxFee property.
         */
        public List<Response.Declaration.DutyTaxFee> getDutyTaxFee() {
            if (dutyTaxFee == null) {
                dutyTaxFee = new ArrayList<>();
            }
            return this.dutyTaxFee;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link Response.Declaration.GoodsShipment }
         *     
         */
        public Response.Declaration.GoodsShipment getGoodsShipment() {
            return goodsShipment;
        }

        /**
         * Sets the value of the goodsShipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Declaration.GoodsShipment }
         *     
         * @see #getGoodsShipment()
         */
        public void setGoodsShipment(Response.Declaration.GoodsShipment value) {
            this.goodsShipment = value;
        }


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
         *         <element name="Payment" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
         *                   <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
         *                   <element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
         *                   <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
         *                   <element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "payment"
        })
        public static class DutyTaxFee {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "Payment")
            protected Response.Declaration.DutyTaxFee.Payment payment;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link Response.Declaration.DutyTaxFee.Payment }
             *     
             */
            public Response.Declaration.DutyTaxFee.Payment getPayment() {
                return payment;
            }

            /**
             * Sets the value of the payment property.
             * 
             * @param value
             *     allowed object is
             *     {@link Response.Declaration.DutyTaxFee.Payment }
             *     
             * @see #getPayment()
             */
            public void setPayment(Response.Declaration.DutyTaxFee.Payment value) {
                this.payment = value;
            }


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
             *         <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
             *         <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
             *         <element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
             *         <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
             *         <element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
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
                "referenceID",
                "taxAssessedAmount",
                "dueDateTime",
                "paymentAmount",
                "obligationGuarantee"
            })
            public static class Payment {

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1168&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Tax. Payment.Identifier&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Reference. Identifier&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentReferenceIDType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReferenceID&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;460&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "ReferenceID")
                protected PaymentReferenceIDType referenceID;
                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5504&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Assessed.Amount&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Tax Assessed. Amount&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentTaxAssessedAmountType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxAssessedAmount&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3776&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "TaxAssessedAmount")
                protected PaymentTaxAssessedAmountType taxAssessedAmount;
                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2480&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Due.Date Time&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Due. Date Time&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentDueDateTimeType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DueDateTime&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;462&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "DueDateTime")
                protected PaymentDueDateTimeType dueDateTime;
                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5082&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Amount&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Payment. Amount&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentPaymentAmountType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentAmount&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;463&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "PaymentAmount")
                protected PaymentPaymentAmountType paymentAmount;
                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;90A&lt;/WCOID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ObligationGuarantee&lt;/WCOName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCODescription xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Details regarding undertaking given in cash, bond or as a written guarantee to ensure that an obligation will be fulfilled, e.g. under a transit
                 *                                   procedure&lt;/WCODescription&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "ObligationGuarantee")
                protected List<Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee> obligationGuarantee;

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1168&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Tax. Payment.Identifier&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Reference. Identifier&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentReferenceIDType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReferenceID&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;460&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 * @return
                 *     possible object is
                 *     {@link PaymentReferenceIDType }
                 *     
                 */
                public PaymentReferenceIDType getReferenceID() {
                    return referenceID;
                }

                /**
                 * Sets the value of the referenceID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PaymentReferenceIDType }
                 *     
                 * @see #getReferenceID()
                 */
                public void setReferenceID(PaymentReferenceIDType value) {
                    this.referenceID = value;
                }

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5504&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Assessed.Amount&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Tax Assessed. Amount&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentTaxAssessedAmountType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxAssessedAmount&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3776&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 * @return
                 *     possible object is
                 *     {@link PaymentTaxAssessedAmountType }
                 *     
                 */
                public PaymentTaxAssessedAmountType getTaxAssessedAmount() {
                    return taxAssessedAmount;
                }

                /**
                 * Sets the value of the taxAssessedAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PaymentTaxAssessedAmountType }
                 *     
                 * @see #getTaxAssessedAmount()
                 */
                public void setTaxAssessedAmount(PaymentTaxAssessedAmountType value) {
                    this.taxAssessedAmount = value;
                }

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2480&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Due.Date Time&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Due. Date Time&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentDueDateTimeType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DueDateTime&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;462&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                 * </pre>
                 * 
                 * @return
                 *     possible object is
                 *     {@link PaymentDueDateTimeType }
                 *     
                 */
                public PaymentDueDateTimeType getDueDateTime() {
                    return dueDateTime;
                }

                /**
                 * Sets the value of the dueDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PaymentDueDateTimeType }
                 *     
                 * @see #getDueDateTime()
                 */
                public void setDueDateTime(PaymentDueDateTimeType value) {
                    this.dueDateTime = value;
                }

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5082&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Amount&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Payment. Amount&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentPaymentAmountType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentAmount&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;463&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                 * </pre>
                 * 
                 * @return
                 *     possible object is
                 *     {@link PaymentPaymentAmountType }
                 *     
                 */
                public PaymentPaymentAmountType getPaymentAmount() {
                    return paymentAmount;
                }

                /**
                 * Sets the value of the paymentAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PaymentPaymentAmountType }
                 *     
                 * @see #getPaymentAmount()
                 */
                public void setPaymentAmount(PaymentPaymentAmountType value) {
                    this.paymentAmount = value;
                }

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;90A&lt;/WCOID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ObligationGuarantee&lt;/WCOName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCODescription xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Details regarding undertaking given in cash, bond or as a written guarantee to ensure that an obligation will be fulfilled, e.g. under a transit
                 *                                   procedure&lt;/WCODescription&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                 * </pre>
                 * 
                 * Gets the value of the obligationGuarantee property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the obligationGuarantee property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getObligationGuarantee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the obligationGuarantee property.
                 */
                public List<Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee> getObligationGuarantee() {
                    if (obligationGuarantee == null) {
                        obligationGuarantee = new ArrayList<>();
                    }
                    return this.obligationGuarantee;
                }


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
                 *         <element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
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
                    "referenceID"
                })
                public static class ObligationGuarantee {

                    /**
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1154&lt;/TDEDUID&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Reference. Identifier&lt;/TDEDName&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Obligation Guarantee. Reference. Identifier&lt;/DictionaryEntryName&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ObligationGuaranteeReferenceIDType&lt;/NamedComplexType&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReferenceID&lt;/XMLTag&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;464&lt;/UniquePositionID&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                     * </pre>
                     * 
                     */
                    @XmlElement(name = "ReferenceID")
                    protected ObligationGuaranteeReferenceIDType referenceID;

                    /**
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1154&lt;/TDEDUID&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Reference. Identifier&lt;/TDEDName&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Obligation Guarantee. Reference. Identifier&lt;/DictionaryEntryName&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ObligationGuaranteeReferenceIDType&lt;/NamedComplexType&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReferenceID&lt;/XMLTag&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;464&lt;/UniquePositionID&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
                     * </pre>
                     * 
                     * @return
                     *     possible object is
                     *     {@link ObligationGuaranteeReferenceIDType }
                     *     
                     */
                    public ObligationGuaranteeReferenceIDType getReferenceID() {
                        return referenceID;
                    }

                    /**
                     * Sets the value of the referenceID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ObligationGuaranteeReferenceIDType }
                     *     
                     * @see #getReferenceID()
                     */
                    public void setReferenceID(ObligationGuaranteeReferenceIDType value) {
                        this.referenceID = value;
                    }

                }

            }

        }


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
         *         <element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
         *                   <element name="Commodity" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <sequence>
         *                                       <element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
         *                                       <element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
         *                                       <element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
         *                                       <element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
         *                                       <element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
         *                                       <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
         *                                       <element name="Payment" minOccurs="0">
         *                                         <complexType>
         *                                           <complexContent>
         *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               <sequence>
         *                                                 <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
         *                                                 <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
         *                                               </sequence>
         *                                             </restriction>
         *                                           </complexContent>
         *                                         </complexType>
         *                                       </element>
         *                                     </sequence>
         *                                   </restriction>
         *                                 </complexContent>
         *                               </complexType>
         *                             </element>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "governmentAgencyGoodsItem"
        })
        public static class GoodsShipment {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "GovernmentAgencyGoodsItem")
            protected List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
             * </pre>
             * 
             * Gets the value of the governmentAgencyGoodsItem property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the governmentAgencyGoodsItem property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getGovernmentAgencyGoodsItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem }
             * </p>
             * 
             * 
             * @return
             *     The value of the governmentAgencyGoodsItem property.
             */
            public List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
                if (governmentAgencyGoodsItem == null) {
                    governmentAgencyGoodsItem = new ArrayList<>();
                }
                return this.governmentAgencyGoodsItem;
            }


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
             *         <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
             *         <element name="Commodity" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <sequence>
             *                             <element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
             *                             <element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
             *                             <element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
             *                             <element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
             *                             <element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
             *                             <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
             *                             <element name="Payment" minOccurs="0">
             *                               <complexType>
             *                                 <complexContent>
             *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     <sequence>
             *                                       <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
             *                                       <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
             *                                     </sequence>
             *                                   </restriction>
             *                                 </complexContent>
             *                               </complexType>
             *                             </element>
             *                           </sequence>
             *                         </restriction>
             *                       </complexContent>
             *                     </complexType>
             *                   </element>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
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
                "sequenceNumeric",
                "commodity"
            })
            public static class GovernmentAgencyGoodsItem {

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Government Agency Goods Item. Sequence. Numeric&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;GovernmentAgencyGoodsItemSequenceNumericType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3509&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "SequenceNumeric", required = true)
                protected BigDecimal sequenceNumeric;
                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                 * </pre>
                 * 
                 */
                @XmlElement(name = "Commodity")
                protected Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity commodity;

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Government Agency Goods Item. Sequence. Numeric&lt;/DictionaryEntryName&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;GovernmentAgencyGoodsItemSequenceNumericType&lt;/NamedComplexType&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3509&lt;/UniquePositionID&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                 * </pre>
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSequenceNumeric() {
                    return sequenceNumeric;
                }

                /**
                 * Sets the value of the sequenceNumeric property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getSequenceNumeric()
                 */
                public void setSequenceNumeric(BigDecimal value) {
                    this.sequenceNumeric = value;
                }

                /**
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                 * </pre>
                 * 
                 *                                 
                 * <pre>
                 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                 * </pre>
                 * 
                 * @return
                 *     possible object is
                 *     {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
                 *     
                 */
                public Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity getCommodity() {
                    return commodity;
                }

                /**
                 * Sets the value of the commodity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
                 *     
                 * @see #getCommodity()
                 */
                public void setCommodity(Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity value) {
                    this.commodity = value;
                }


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
                 *         <element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <sequence>
                 *                   <element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
                 *                   <element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
                 *                   <element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
                 *                   <element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
                 *                   <element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
                 *                   <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
                 *                   <element name="Payment" minOccurs="0">
                 *                     <complexType>
                 *                       <complexContent>
                 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           <sequence>
                 *                             <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                 *                             <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
                 *                           </sequence>
                 *                         </restriction>
                 *                       </complexContent>
                 *                     </complexType>
                 *                   </element>
                 *                 </sequence>
                 *               </restriction>
                 *             </complexContent>
                 *           </complexType>
                 *         </element>
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
                    "dutyTaxFee"
                })
                public static class Commodity {

                    /**
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                     * </pre>
                     * 
                     */
                    @XmlElement(name = "DutyTaxFee")
                    protected List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee> dutyTaxFee;

                    /**
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                     * </pre>
                     * 
                     *                                       
                     * <pre>
                     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                     * </pre>
                     * 
                     * Gets the value of the dutyTaxFee property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the dutyTaxFee property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getDutyTaxFee().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the dutyTaxFee property.
                     */
                    public List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee> getDutyTaxFee() {
                        if (dutyTaxFee == null) {
                            dutyTaxFee = new ArrayList<>();
                        }
                        return this.dutyTaxFee;
                    }


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
                     *         <element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
                     *         <element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
                     *         <element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
                     *         <element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
                     *         <element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
                     *         <element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
                     *         <element name="Payment" minOccurs="0">
                     *           <complexType>
                     *             <complexContent>
                     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 <sequence>
                     *                   <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                     *                   <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
                     *                 </sequence>
                     *               </restriction>
                     *             </complexContent>
                     *           </complexType>
                     *         </element>
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
                        "adValoremTaxBaseAmount",
                        "deductAmount",
                        "dutyRegimeCode",
                        "specificTaxBaseQuantity",
                        "taxRateNumeric",
                        "typeCode",
                        "payment"
                    })
                    public static class DutyTaxFee {

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5286&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.AssessmentBasis.Amount&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. AdValorem Tax Base. Amount&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeAdValoremTaxBaseAmountType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdValoremTaxBaseAmount&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3765&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "AdValoremTaxBaseAmount")
                        protected DutyTaxFeeAdValoremTaxBaseAmountType adValoremTaxBaseAmount;
                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5074&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Tax.Deduction.Amount&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Deduct. Amount&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeDeductAmountType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeductAmount&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3766&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "DeductAmount")
                        protected DutyTaxFeeDeductAmountType deductAmount;
                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9213&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty.Regime.Code&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Duty Regime. Code&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeDutyRegimeCodeType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyRegimeCode&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3768&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "DutyRegimeCode")
                        protected DutyTaxFeeDutyRegimeCodeType dutyRegimeCode;
                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;6090&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.AssessmentBasis.Quantity&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Specific Tax Base. Quantity&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeSpecificTaxBaseQuantityType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SpecificTaxBaseQuantity&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3769&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "SpecificTaxBaseQuantity")
                        protected DutyTaxFeeSpecificTaxBaseQuantityType specificTaxBaseQuantity;
                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5278&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Rate.Text&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Tax Rate. Numeric&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeTaxRateNumericType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxRateNumeric&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3770&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "TaxRateNumeric")
                        protected BigDecimal taxRateNumeric;
                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5153&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Type.Code&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Type. Code&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeTypeCodeType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TypeCode&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3771&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "TypeCode")
                        protected DutyTaxFeeTypeCodeType typeCode;
                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         */
                        @XmlElement(name = "Payment")
                        protected Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment payment;

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5286&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.AssessmentBasis.Amount&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. AdValorem Tax Base. Amount&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeAdValoremTaxBaseAmountType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AdValoremTaxBaseAmount&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3765&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link DutyTaxFeeAdValoremTaxBaseAmountType }
                         *     
                         */
                        public DutyTaxFeeAdValoremTaxBaseAmountType getAdValoremTaxBaseAmount() {
                            return adValoremTaxBaseAmount;
                        }

                        /**
                         * Sets the value of the adValoremTaxBaseAmount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DutyTaxFeeAdValoremTaxBaseAmountType }
                         *     
                         * @see #getAdValoremTaxBaseAmount()
                         */
                        public void setAdValoremTaxBaseAmount(DutyTaxFeeAdValoremTaxBaseAmountType value) {
                            this.adValoremTaxBaseAmount = value;
                        }

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5074&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Tax.Deduction.Amount&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Deduct. Amount&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeDeductAmountType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DeductAmount&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3766&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link DutyTaxFeeDeductAmountType }
                         *     
                         */
                        public DutyTaxFeeDeductAmountType getDeductAmount() {
                            return deductAmount;
                        }

                        /**
                         * Sets the value of the deductAmount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DutyTaxFeeDeductAmountType }
                         *     
                         * @see #getDeductAmount()
                         */
                        public void setDeductAmount(DutyTaxFeeDeductAmountType value) {
                            this.deductAmount = value;
                        }

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9213&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty.Regime.Code&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Duty Regime. Code&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeDutyRegimeCodeType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyRegimeCode&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageUPU xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageUPU&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3768&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link DutyTaxFeeDutyRegimeCodeType }
                         *     
                         */
                        public DutyTaxFeeDutyRegimeCodeType getDutyRegimeCode() {
                            return dutyRegimeCode;
                        }

                        /**
                         * Sets the value of the dutyRegimeCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DutyTaxFeeDutyRegimeCodeType }
                         *     
                         * @see #getDutyRegimeCode()
                         */
                        public void setDutyRegimeCode(DutyTaxFeeDutyRegimeCodeType value) {
                            this.dutyRegimeCode = value;
                        }

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;6090&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.AssessmentBasis.Quantity&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Specific Tax Base. Quantity&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeSpecificTaxBaseQuantityType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SpecificTaxBaseQuantity&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3769&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link DutyTaxFeeSpecificTaxBaseQuantityType }
                         *     
                         */
                        public DutyTaxFeeSpecificTaxBaseQuantityType getSpecificTaxBaseQuantity() {
                            return specificTaxBaseQuantity;
                        }

                        /**
                         * Sets the value of the specificTaxBaseQuantity property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DutyTaxFeeSpecificTaxBaseQuantityType }
                         *     
                         * @see #getSpecificTaxBaseQuantity()
                         */
                        public void setSpecificTaxBaseQuantity(DutyTaxFeeSpecificTaxBaseQuantityType value) {
                            this.specificTaxBaseQuantity = value;
                        }

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5278&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Rate.Text&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Tax Rate. Numeric&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeTaxRateNumericType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxRateNumeric&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3770&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getTaxRateNumeric() {
                            return taxRateNumeric;
                        }

                        /**
                         * Sets the value of the taxRateNumeric property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getTaxRateNumeric()
                         */
                        public void setTaxRateNumeric(BigDecimal value) {
                            this.taxRateNumeric = value;
                        }

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5153&lt;/TDEDUID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Type.Code&lt;/TDEDName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Duty Tax Fee. Type. Code&lt;/DictionaryEntryName&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DutyTaxFeeTypeCodeType&lt;/NamedComplexType&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TypeCode&lt;/XMLTag&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3771&lt;/UniquePositionID&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         *                                             
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationEX xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationEX&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link DutyTaxFeeTypeCodeType }
                         *     
                         */
                        public DutyTaxFeeTypeCodeType getTypeCode() {
                            return typeCode;
                        }

                        /**
                         * Sets the value of the typeCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DutyTaxFeeTypeCodeType }
                         *     
                         * @see #getTypeCode()
                         */
                        public void setTypeCode(DutyTaxFeeTypeCodeType value) {
                            this.typeCode = value;
                        }

                        /**
                         * <pre>
                         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                         * </pre>
                         * 
                         * @return
                         *     possible object is
                         *     {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
                         *     
                         */
                        public Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment getPayment() {
                            return payment;
                        }

                        /**
                         * Sets the value of the payment property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
                         *     
                         * @see #getPayment()
                         */
                        public void setPayment(Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment value) {
                            this.payment = value;
                        }


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
                         *         <element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                         *         <element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
                            "taxAssessedAmount",
                            "paymentAmount"
                        })
                        public static class Payment {

                            /**
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5504&lt;/TDEDUID&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Assessed.Amount&lt;/TDEDName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Tax Assessed. Amount&lt;/DictionaryEntryName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentTaxAssessedAmountType&lt;/NamedComplexType&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxAssessedAmount&lt;/XMLTag&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3776&lt;/UniquePositionID&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                             * </pre>
                             * 
                             */
                            @XmlElement(name = "TaxAssessedAmount")
                            protected PaymentTaxAssessedAmountType taxAssessedAmount;
                            /**
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5082&lt;/TDEDUID&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Amount&lt;/TDEDName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Payment. Amount&lt;/DictionaryEntryName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentPaymentAmountType&lt;/NamedComplexType&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentAmount&lt;/XMLTag&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3778&lt;/UniquePositionID&gt;
                             * </pre>
                             * 
                             */
                            @XmlElement(name = "PaymentAmount")
                            protected PaymentPaymentAmountType paymentAmount;

                            /**
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5504&lt;/TDEDUID&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxOrFee.Assessed.Amount&lt;/TDEDName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Tax Assessed. Amount&lt;/DictionaryEntryName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentTaxAssessedAmountType&lt;/NamedComplexType&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TaxAssessedAmount&lt;/XMLTag&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3776&lt;/UniquePositionID&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageDeclarationIM xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageDeclarationIM&gt;
                             * </pre>
                             * 
                             * @return
                             *     possible object is
                             *     {@link PaymentTaxAssessedAmountType }
                             *     
                             */
                            public PaymentTaxAssessedAmountType getTaxAssessedAmount() {
                                return taxAssessedAmount;
                            }

                            /**
                             * Sets the value of the taxAssessedAmount property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link PaymentTaxAssessedAmountType }
                             *     
                             * @see #getTaxAssessedAmount()
                             */
                            public void setTaxAssessedAmount(PaymentTaxAssessedAmountType value) {
                                this.taxAssessedAmount = value;
                            }

                            /**
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;5082&lt;/TDEDUID&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Amount&lt;/TDEDName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Payment. Payment. Amount&lt;/DictionaryEntryName&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentPaymentAmountType&lt;/NamedComplexType&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentAmount&lt;/XMLTag&gt;
                             * </pre>
                             * 
                             *                                                   
                             * <pre>
                             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;3778&lt;/UniquePositionID&gt;
                             * </pre>
                             * 
                             * @return
                             *     possible object is
                             *     {@link PaymentPaymentAmountType }
                             *     
                             */
                            public PaymentPaymentAmountType getPaymentAmount() {
                                return paymentAmount;
                            }

                            /**
                             * Sets the value of the paymentAmount property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link PaymentPaymentAmountType }
                             *     
                             * @see #getPaymentAmount()
                             */
                            public void setPaymentAmount(PaymentPaymentAmountType value) {
                                this.paymentAmount = value;
                            }

                        }

                    }

                }

            }

        }

    }


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
     *         <element name="Description" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorDescriptionTextType" minOccurs="0"/>
     *         <element name="ValidationCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorValidationCodeType" minOccurs="0"/>
     *         <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "description",
        "validationCode",
        "pointer"
    })
    public static class Error {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4440&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FreeText.Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Error. Description. Text&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ErrorDescriptionTextType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Description&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;7218&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "Description")
        protected ErrorDescriptionTextType description;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9321&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Application. Error.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Error. Validation. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ErrorValidationCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ValidationCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4329&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ValidationCode")
        protected ErrorValidationCodeType validationCode;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "Pointer")
        protected List<Response.Error.Pointer> pointer;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4440&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;FreeText.Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Error. Description. Text&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ErrorDescriptionTextType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Description&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;7218&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link ErrorDescriptionTextType }
         *     
         */
        public ErrorDescriptionTextType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorDescriptionTextType }
         *     
         * @see #getDescription()
         */
        public void setDescription(ErrorDescriptionTextType value) {
            this.description = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9321&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Application. Error.Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Error. Validation. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ErrorValidationCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ValidationCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4329&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link ErrorValidationCodeType }
         *     
         */
        public ErrorValidationCodeType getValidationCode() {
            return validationCode;
        }

        /**
         * Sets the value of the validationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorValidationCodeType }
         *     
         * @see #getValidationCode()
         */
        public void setValidationCode(ErrorValidationCodeType value) {
            this.validationCode = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * Gets the value of the pointer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Error.Pointer }
         * </p>
         * 
         * 
         * @return
         *     The value of the pointer property.
         */
        public List<Response.Error.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<>();
            }
            return this.pointer;
        }


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
         *         <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4332&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4331&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4330&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4332&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSequenceNumeric() {
                return sequenceNumeric;
            }

            /**
             * Sets the value of the sequenceNumeric property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSequenceNumeric()
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4331&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             */
            public PointerDocumentSectionCodeType getDocumentSectionCode() {
                return documentSectionCode;
            }

            /**
             * Sets the value of the documentSectionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             * @see #getDocumentSectionCode()
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4330&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerTagIDType }
             *     
             */
            public PointerTagIDType getTagID() {
                return tagID;
            }

            /**
             * Sets the value of the tagID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerTagIDType }
             *     
             * @see #getTagID()
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }


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
     *         <element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusEffectiveDateTimeType" minOccurs="0"/>
     *         <element name="NameCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusNameCodeType" minOccurs="0"/>
     *         <element name="ReleaseDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusReleaseDateTimeType" minOccurs="0"/>
     *         <element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "effectiveDateTime",
        "nameCode",
        "releaseDateTime",
        "pointer"
    })
    public static class Status {

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2069&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event. Effective Start.Date Time&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageSafe xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageSafe&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Effective. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatusEffectiveDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EffectiveDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4333&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "EffectiveDateTime")
        protected StatusEffectiveDateTimeType effectiveDateTime;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4405&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Name. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatusNameCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;NameCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4334&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "NameCode")
        protected StatusNameCodeType nameCode;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2380&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Date Or Time Or Period. Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Release. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatusReleaseDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReleaseDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4344&lt;/UniquePositionID&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "ReleaseDateTime")
        protected StatusReleaseDateTimeType releaseDateTime;
        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         */
        @XmlElement(name = "Pointer")
        protected List<Response.Status.Pointer> pointer;

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2069&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event. Effective Start.Date Time&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsageSafe xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsageSafe&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Effective. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatusEffectiveDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EffectiveDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4333&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link StatusEffectiveDateTimeType }
         *     
         */
        public StatusEffectiveDateTimeType getEffectiveDateTime() {
            return effectiveDateTime;
        }

        /**
         * Sets the value of the effectiveDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusEffectiveDateTimeType }
         *     
         * @see #getEffectiveDateTime()
         */
        public void setEffectiveDateTime(StatusEffectiveDateTimeType value) {
            this.effectiveDateTime = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4405&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Code&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Name. Code&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatusNameCodeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;NameCode&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4334&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link StatusNameCodeType }
         *     
         */
        public StatusNameCodeType getNameCode() {
            return nameCode;
        }

        /**
         * Sets the value of the nameCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusNameCodeType }
         *     
         * @see #getNameCode()
         */
        public void setNameCode(StatusNameCodeType value) {
            this.nameCode = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;2380&lt;/TDEDUID&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Date Or Time Or Period. Text&lt;/TDEDName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Status. Release. Date Time&lt;/DictionaryEntryName&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;StatusReleaseDateTimeType&lt;/NamedComplexType&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ReleaseDateTime&lt;/XMLTag&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         *                     
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4344&lt;/UniquePositionID&gt;
         * </pre>
         * 
         * @return
         *     possible object is
         *     {@link StatusReleaseDateTimeType }
         *     
         */
        public StatusReleaseDateTimeType getReleaseDateTime() {
            return releaseDateTime;
        }

        /**
         * Sets the value of the releaseDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusReleaseDateTimeType }
         *     
         * @see #getReleaseDateTime()
         */
        public void setReleaseDateTime(StatusReleaseDateTimeType value) {
            this.releaseDateTime = value;
        }

        /**
         * <pre>
         * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
         * </pre>
         * 
         * Gets the value of the pointer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Status.Pointer }
         * </p>
         * 
         * 
         * @return
         *     The value of the pointer property.
         */
        public List<Response.Status.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<>();
            }
            return this.pointer;
        }


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
         *         <element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         <element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         <element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4337&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4335&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4336&lt;/UniquePositionID&gt;
             * </pre>
             * 
             */
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1050&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Sequence. Position.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Sequence. Numeric&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerSequenceNumericType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SequenceNumeric&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4337&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSequenceNumeric() {
                return sequenceNumeric;
            }

            /**
             * Sets the value of the sequenceNumeric property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSequenceNumeric()
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;1049&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Document. Section.Code&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Document Section. Code&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerDocumentSectionCodeType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DocumentSectionCode&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4335&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             */
            public PointerDocumentSectionCodeType getDocumentSectionCode() {
                return documentSectionCode;
            }

            /**
             * Sets the value of the documentSectionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerDocumentSectionCodeType }
             *     
             * @see #getDocumentSectionCode()
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDUID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;9162&lt;/TDEDUID&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;TDEDName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Data Element. Tag.Identifier&lt;/TDEDName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;DictionaryEntryName xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Pointer. Tag. Identifier&lt;/DictionaryEntryName&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;NamedComplexType xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PointerTagIDType&lt;/NamedComplexType&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;XMLTag xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TagID&lt;/XMLTag&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOUsage_Response xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;X&lt;/WCOUsage_Response&gt;
             * </pre>
             * 
             *                           
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;UniquePositionID xmlns="urn:wco:datamodel:WCO:RES-DMS:2" xmlns:ds="urn:wco:datamodel:WCO:Response_DS:DMS:2" xmlns:od="urn:wco:datamodel:WCO:DEC-DMS:2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;4336&lt;/UniquePositionID&gt;
             * </pre>
             * 
             * @return
             *     possible object is
             *     {@link PointerTagIDType }
             *     
             */
            public PointerTagIDType getTagID() {
                return tagID;
            }

            /**
             * Sets the value of the tagID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PointerTagIDType }
             *     
             * @see #getTagID()
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }

}
