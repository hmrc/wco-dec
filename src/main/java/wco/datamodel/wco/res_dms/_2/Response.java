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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ResponseFunctionCodeType"/>
 *         &lt;element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ResponseFunctionalReferenceIDType" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ResponseIssueDateTimeType" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
 *                   &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
 *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
 *                   &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amendment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChangeReasonCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AmendmentChangeReasonCodeType" minOccurs="0"/>
 *                   &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AppealOffice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AppealOfficeIdentificationIDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bank" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankReferenceIDType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankAccountIdentificationIDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContactOffice" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ContactOfficeIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Error" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorDescriptionTextType" minOccurs="0"/>
 *                   &lt;element name="ValidationCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorValidationCodeType" minOccurs="0"/>
 *                   &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusEffectiveDateTimeType" minOccurs="0"/>
 *                   &lt;element name="NameCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusNameCodeType" minOccurs="0"/>
 *                   &lt;element name="ReleaseDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusReleaseDateTimeType" minOccurs="0"/>
 *                   &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Declaration">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptanceDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationAcceptanceDateTimeType" minOccurs="0"/>
 *                   &lt;element name="CancellationDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationCancellationDateTimeType" minOccurs="0"/>
 *                   &lt;element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationFunctionalReferenceIDType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="RejectionDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationRejectionDateTimeType" minOccurs="0"/>
 *                   &lt;element name="VersionID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationVersionIDType" minOccurs="0"/>
 *                   &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Payment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
 *                                       &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
 *                                       &lt;element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
 *                                       &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
 *                                       &lt;element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GoodsShipment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
 *                                       &lt;element name="Commodity" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
 *                                                           &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
 *                                                           &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
 *                                                           &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
 *                                                           &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
 *                                                           &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
 *                                                           &lt;element name="Payment" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
 *                                                                     &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{urn:wco:datamodel:WCO:DEC-DMS:2}Declaration" minOccurs="0"/>
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
    "content"
})
@XmlRootElement(name = "Response")
public class Response {

    @XmlElementRefs({
        @XmlElementRef(name = "AdditionalInformation", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ContactOffice", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AppealOffice", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Declaration", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FunctionalReferenceID", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Amendment", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Error", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Declaration", namespace = "urn:wco:datamodel:WCO:DEC-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FunctionCode", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IssueDateTime", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bank", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Status", namespace = "urn:wco:datamodel:WCO:RES-DMS:2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Declaration" is used by two different parts of a schema. See: 
     * line 1426 of file:/home/tim/Development/hmrc/wco-dec/updateSchema/customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
     * line 832 of file:/home/tim/Development/hmrc/wco-dec/updateSchema/customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Response.AdditionalInformation }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.ContactOffice }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.AppealOffice }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Declaration }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseFunctionalReferenceIDType }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Amendment }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Error }{@code >}
     * {@link JAXBElement }{@code <}{@link wco.datamodel.wco.dec_dms._2.Declaration }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseFunctionCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseIssueDateTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Bank }{@code >}
     * {@link JAXBElement }{@code <}{@link Response.Status }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }


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
     *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
     *         &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
     *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
     *         &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "statementCode",
        "statementDescription",
        "limitDateTime",
        "statementTypeCode",
        "pointer"
    })
    public static class AdditionalInformation {

        @XmlElement(name = "StatementCode")
        protected AdditionalInformationStatementCodeType statementCode;
        @XmlElement(name = "StatementDescription")
        protected AdditionalInformationStatementDescriptionTextType statementDescription;
        @XmlElement(name = "LimitDateTime")
        protected AdditionalInformationLimitDateTimeType limitDateTime;
        @XmlElement(name = "StatementTypeCode")
        protected AdditionalInformationStatementTypeCodeType statementTypeCode;
        @XmlElement(name = "Pointer")
        protected List<Response.AdditionalInformation.Pointer> pointer;

        /**
         * Gets the value of the statementCode property.
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
         */
        public void setStatementCode(AdditionalInformationStatementCodeType value) {
            this.statementCode = value;
        }

        /**
         * Gets the value of the statementDescription property.
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
         */
        public void setStatementDescription(AdditionalInformationStatementDescriptionTextType value) {
            this.statementDescription = value;
        }

        /**
         * Gets the value of the limitDateTime property.
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
         */
        public void setLimitDateTime(AdditionalInformationLimitDateTimeType value) {
            this.limitDateTime = value;
        }

        /**
         * Gets the value of the statementTypeCode property.
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
         */
        public void setStatementTypeCode(AdditionalInformationStatementTypeCodeType value) {
            this.statementTypeCode = value;
        }

        /**
         * Gets the value of the pointer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.AdditionalInformation.Pointer }
         * 
         * 
         */
        public List<Response.AdditionalInformation.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<Response.AdditionalInformation.Pointer>();
            }
            return this.pointer;
        }


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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * Gets the value of the sequenceNumeric property.
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
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * Gets the value of the documentSectionCode property.
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
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * Gets the value of the tagID property.
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
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }


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
     *         &lt;element name="ChangeReasonCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AmendmentChangeReasonCodeType" minOccurs="0"/>
     *         &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "changeReasonCode",
        "pointer"
    })
    public static class Amendment {

        @XmlElement(name = "ChangeReasonCode")
        protected AmendmentChangeReasonCodeType changeReasonCode;
        @XmlElement(name = "Pointer")
        protected List<Response.Amendment.Pointer> pointer;

        /**
         * Gets the value of the changeReasonCode property.
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
         */
        public void setChangeReasonCode(AmendmentChangeReasonCodeType value) {
            this.changeReasonCode = value;
        }

        /**
         * Gets the value of the pointer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Amendment.Pointer }
         * 
         * 
         */
        public List<Response.Amendment.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<Response.Amendment.Pointer>();
            }
            return this.pointer;
        }


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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * Gets the value of the sequenceNumeric property.
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
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * Gets the value of the documentSectionCode property.
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
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * Gets the value of the tagID property.
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
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }


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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}AppealOfficeIdentificationIDType" minOccurs="0"/>
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
        "id"
    })
    public static class AppealOffice {

        @XmlElement(name = "ID")
        protected AppealOfficeIdentificationIDType id;

        /**
         * Gets the value of the id property.
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
         */
        public void setID(AppealOfficeIdentificationIDType value) {
            this.id = value;
        }

    }


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
     *         &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankReferenceIDType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}BankAccountIdentificationIDType" minOccurs="0"/>
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
        "referenceID",
        "id"
    })
    public static class Bank {

        @XmlElement(name = "ReferenceID")
        protected BankReferenceIDType referenceID;
        @XmlElement(name = "ID")
        protected BankAccountIdentificationIDType id;

        /**
         * Gets the value of the referenceID property.
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
         */
        public void setReferenceID(BankReferenceIDType value) {
            this.referenceID = value;
        }

        /**
         * Gets the value of the id property.
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
         */
        public void setID(BankAccountIdentificationIDType value) {
            this.id = value;
        }

    }


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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ContactOfficeIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "id",
        "communication"
    })
    public static class ContactOffice {

        @XmlElement(name = "ID")
        protected ContactOfficeIdentificationIDType id;
        @XmlElement(name = "Communication")
        protected List<Response.ContactOffice.Communication> communication;

        /**
         * Gets the value of the id property.
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
         */
        public void setID(ContactOfficeIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the communication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the communication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommunication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.ContactOffice.Communication }
         * 
         * 
         */
        public List<Response.ContactOffice.Communication> getCommunication() {
            if (communication == null) {
                communication = new ArrayList<Response.ContactOffice.Communication>();
            }
            return this.communication;
        }


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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
            "id",
            "typeCode"
        })
        public static class Communication {

            @XmlElement(name = "ID")
            protected CommunicationIdentificationIDType id;
            @XmlElement(name = "TypeCode")
            protected CommunicationTypeCodeType typeCode;

            /**
             * Gets the value of the id property.
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
             */
            public void setID(CommunicationIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the typeCode property.
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
             */
            public void setTypeCode(CommunicationTypeCodeType value) {
                this.typeCode = value;
            }

        }

    }


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
     *         &lt;element name="AcceptanceDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationAcceptanceDateTimeType" minOccurs="0"/>
     *         &lt;element name="CancellationDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationCancellationDateTimeType" minOccurs="0"/>
     *         &lt;element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationFunctionalReferenceIDType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="RejectionDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationRejectionDateTimeType" minOccurs="0"/>
     *         &lt;element name="VersionID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DeclarationVersionIDType" minOccurs="0"/>
     *         &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Payment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
     *                             &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
     *                             &lt;element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
     *                             &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
     *                             &lt;element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GoodsShipment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
     *                             &lt;element name="Commodity" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
     *                                                 &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
     *                                                 &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
     *                                                 &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
     *                                                 &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
     *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
     *                                                 &lt;element name="Payment" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
     *                                                           &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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

        @XmlElement(name = "AcceptanceDateTime")
        protected DeclarationAcceptanceDateTimeType acceptanceDateTime;
        @XmlElement(name = "CancellationDateTime")
        protected DeclarationCancellationDateTimeType cancellationDateTime;
        @XmlElement(name = "FunctionalReferenceID")
        protected DeclarationFunctionalReferenceIDType functionalReferenceID;
        @XmlElement(name = "ID")
        protected DeclarationIdentificationIDType id;
        @XmlElement(name = "RejectionDateTime")
        protected DeclarationRejectionDateTimeType rejectionDateTime;
        @XmlElement(name = "VersionID")
        protected DeclarationVersionIDType versionID;
        @XmlElement(name = "DutyTaxFee")
        protected List<Response.Declaration.DutyTaxFee> dutyTaxFee;
        @XmlElement(name = "GoodsShipment")
        protected Response.Declaration.GoodsShipment goodsShipment;

        /**
         * Gets the value of the acceptanceDateTime property.
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
         */
        public void setAcceptanceDateTime(DeclarationAcceptanceDateTimeType value) {
            this.acceptanceDateTime = value;
        }

        /**
         * Gets the value of the cancellationDateTime property.
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
         */
        public void setCancellationDateTime(DeclarationCancellationDateTimeType value) {
            this.cancellationDateTime = value;
        }

        /**
         * Gets the value of the functionalReferenceID property.
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
         */
        public void setFunctionalReferenceID(DeclarationFunctionalReferenceIDType value) {
            this.functionalReferenceID = value;
        }

        /**
         * Gets the value of the id property.
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
         */
        public void setID(DeclarationIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the rejectionDateTime property.
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
         */
        public void setRejectionDateTime(DeclarationRejectionDateTimeType value) {
            this.rejectionDateTime = value;
        }

        /**
         * Gets the value of the versionID property.
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
         */
        public void setVersionID(DeclarationVersionIDType value) {
            this.versionID = value;
        }

        /**
         * Gets the value of the dutyTaxFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dutyTaxFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDutyTaxFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Declaration.DutyTaxFee }
         * 
         * 
         */
        public List<Response.Declaration.DutyTaxFee> getDutyTaxFee() {
            if (dutyTaxFee == null) {
                dutyTaxFee = new ArrayList<Response.Declaration.DutyTaxFee>();
            }
            return this.dutyTaxFee;
        }

        /**
         * Gets the value of the goodsShipment property.
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
         */
        public void setGoodsShipment(Response.Declaration.GoodsShipment value) {
            this.goodsShipment = value;
        }


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
         *         &lt;element name="Payment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
         *                   &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
         *                   &lt;element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
         *                   &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
         *                   &lt;element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "payment"
        })
        public static class DutyTaxFee {

            @XmlElement(name = "Payment")
            protected Response.Declaration.DutyTaxFee.Payment payment;

            /**
             * Gets the value of the payment property.
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
             */
            public void setPayment(Response.Declaration.DutyTaxFee.Payment value) {
                this.payment = value;
            }


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
             *         &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentReferenceIDType" minOccurs="0"/>
             *         &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
             *         &lt;element name="DueDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentDueDateTimeType" minOccurs="0"/>
             *         &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
             *         &lt;element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "referenceID",
                "taxAssessedAmount",
                "dueDateTime",
                "paymentAmount",
                "obligationGuarantee"
            })
            public static class Payment {

                @XmlElement(name = "ReferenceID")
                protected PaymentReferenceIDType referenceID;
                @XmlElement(name = "TaxAssessedAmount")
                protected PaymentTaxAssessedAmountType taxAssessedAmount;
                @XmlElement(name = "DueDateTime")
                protected PaymentDueDateTimeType dueDateTime;
                @XmlElement(name = "PaymentAmount")
                protected PaymentPaymentAmountType paymentAmount;
                @XmlElement(name = "ObligationGuarantee")
                protected List<Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee> obligationGuarantee;

                /**
                 * Gets the value of the referenceID property.
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
                 */
                public void setReferenceID(PaymentReferenceIDType value) {
                    this.referenceID = value;
                }

                /**
                 * Gets the value of the taxAssessedAmount property.
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
                 */
                public void setTaxAssessedAmount(PaymentTaxAssessedAmountType value) {
                    this.taxAssessedAmount = value;
                }

                /**
                 * Gets the value of the dueDateTime property.
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
                 */
                public void setDueDateTime(PaymentDueDateTimeType value) {
                    this.dueDateTime = value;
                }

                /**
                 * Gets the value of the paymentAmount property.
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
                 */
                public void setPaymentAmount(PaymentPaymentAmountType value) {
                    this.paymentAmount = value;
                }

                /**
                 * Gets the value of the obligationGuarantee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the obligationGuarantee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getObligationGuarantee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee }
                 * 
                 * 
                 */
                public List<Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee> getObligationGuarantee() {
                    if (obligationGuarantee == null) {
                        obligationGuarantee = new ArrayList<Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee>();
                    }
                    return this.obligationGuarantee;
                }


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
                 *         &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
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
                    "referenceID"
                })
                public static class ObligationGuarantee {

                    @XmlElement(name = "ReferenceID")
                    protected ObligationGuaranteeReferenceIDType referenceID;

                    /**
                     * Gets the value of the referenceID property.
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
                     */
                    public void setReferenceID(ObligationGuaranteeReferenceIDType value) {
                        this.referenceID = value;
                    }

                }

            }

        }


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
         *         &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
         *                   &lt;element name="Commodity" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
         *                                       &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
         *                                       &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
         *                                       &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
         *                                       &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
         *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
         *                                       &lt;element name="Payment" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
         *                                                 &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "governmentAgencyGoodsItem"
        })
        public static class GoodsShipment {

            @XmlElement(name = "GovernmentAgencyGoodsItem")
            protected List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;

            /**
             * Gets the value of the governmentAgencyGoodsItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the governmentAgencyGoodsItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGovernmentAgencyGoodsItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem }
             * 
             * 
             */
            public List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
                if (governmentAgencyGoodsItem == null) {
                    governmentAgencyGoodsItem = new ArrayList<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem>();
                }
                return this.governmentAgencyGoodsItem;
            }


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
             *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
             *         &lt;element name="Commodity" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
             *                             &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
             *                             &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
             *                             &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
             *                             &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
             *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
             *                             &lt;element name="Payment" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
             *                                       &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "sequenceNumeric",
                "commodity"
            })
            public static class GovernmentAgencyGoodsItem {

                @XmlElement(name = "SequenceNumeric", required = true)
                protected BigDecimal sequenceNumeric;
                @XmlElement(name = "Commodity")
                protected Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity commodity;

                /**
                 * Gets the value of the sequenceNumeric property.
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
                 */
                public void setSequenceNumeric(BigDecimal value) {
                    this.sequenceNumeric = value;
                }

                /**
                 * Gets the value of the commodity property.
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
                 */
                public void setCommodity(Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity value) {
                    this.commodity = value;
                }


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
                 *         &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
                 *                   &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
                 *                   &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
                 *                   &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
                 *                   &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
                 *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
                 *                   &lt;element name="Payment" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                 *                             &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                    "dutyTaxFee"
                })
                public static class Commodity {

                    @XmlElement(name = "DutyTaxFee")
                    protected List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee> dutyTaxFee;

                    /**
                     * Gets the value of the dutyTaxFee property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the dutyTaxFee property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDutyTaxFee().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee }
                     * 
                     * 
                     */
                    public List<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee> getDutyTaxFee() {
                        if (dutyTaxFee == null) {
                            dutyTaxFee = new ArrayList<Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee>();
                        }
                        return this.dutyTaxFee;
                    }


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
                     *         &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
                     *         &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
                     *         &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
                     *         &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
                     *         &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
                     *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
                     *         &lt;element name="Payment" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                     *                   &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
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
                        "adValoremTaxBaseAmount",
                        "deductAmount",
                        "dutyRegimeCode",
                        "specificTaxBaseQuantity",
                        "taxRateNumeric",
                        "typeCode",
                        "payment"
                    })
                    public static class DutyTaxFee {

                        @XmlElement(name = "AdValoremTaxBaseAmount")
                        protected DutyTaxFeeAdValoremTaxBaseAmountType adValoremTaxBaseAmount;
                        @XmlElement(name = "DeductAmount")
                        protected DutyTaxFeeDeductAmountType deductAmount;
                        @XmlElement(name = "DutyRegimeCode")
                        protected DutyTaxFeeDutyRegimeCodeType dutyRegimeCode;
                        @XmlElement(name = "SpecificTaxBaseQuantity")
                        protected DutyTaxFeeSpecificTaxBaseQuantityType specificTaxBaseQuantity;
                        @XmlElement(name = "TaxRateNumeric")
                        protected BigDecimal taxRateNumeric;
                        @XmlElement(name = "TypeCode")
                        protected DutyTaxFeeTypeCodeType typeCode;
                        @XmlElement(name = "Payment")
                        protected Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment payment;

                        /**
                         * Gets the value of the adValoremTaxBaseAmount property.
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
                         */
                        public void setAdValoremTaxBaseAmount(DutyTaxFeeAdValoremTaxBaseAmountType value) {
                            this.adValoremTaxBaseAmount = value;
                        }

                        /**
                         * Gets the value of the deductAmount property.
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
                         */
                        public void setDeductAmount(DutyTaxFeeDeductAmountType value) {
                            this.deductAmount = value;
                        }

                        /**
                         * Gets the value of the dutyRegimeCode property.
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
                         */
                        public void setDutyRegimeCode(DutyTaxFeeDutyRegimeCodeType value) {
                            this.dutyRegimeCode = value;
                        }

                        /**
                         * Gets the value of the specificTaxBaseQuantity property.
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
                         */
                        public void setSpecificTaxBaseQuantity(DutyTaxFeeSpecificTaxBaseQuantityType value) {
                            this.specificTaxBaseQuantity = value;
                        }

                        /**
                         * Gets the value of the taxRateNumeric property.
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
                         */
                        public void setTaxRateNumeric(BigDecimal value) {
                            this.taxRateNumeric = value;
                        }

                        /**
                         * Gets the value of the typeCode property.
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
                         */
                        public void setTypeCode(DutyTaxFeeTypeCodeType value) {
                            this.typeCode = value;
                        }

                        /**
                         * Gets the value of the payment property.
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
                         */
                        public void setPayment(Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment value) {
                            this.payment = value;
                        }


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
                         *         &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                         *         &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
                            "taxAssessedAmount",
                            "paymentAmount"
                        })
                        public static class Payment {

                            @XmlElement(name = "TaxAssessedAmount")
                            protected PaymentTaxAssessedAmountType taxAssessedAmount;
                            @XmlElement(name = "PaymentAmount")
                            protected PaymentPaymentAmountType paymentAmount;

                            /**
                             * Gets the value of the taxAssessedAmount property.
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
                             */
                            public void setTaxAssessedAmount(PaymentTaxAssessedAmountType value) {
                                this.taxAssessedAmount = value;
                            }

                            /**
                             * Gets the value of the paymentAmount property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorDescriptionTextType" minOccurs="0"/>
     *         &lt;element name="ValidationCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}ErrorValidationCodeType" minOccurs="0"/>
     *         &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "description",
        "validationCode",
        "pointer"
    })
    public static class Error {

        @XmlElement(name = "Description")
        protected ErrorDescriptionTextType description;
        @XmlElement(name = "ValidationCode")
        protected ErrorValidationCodeType validationCode;
        @XmlElement(name = "Pointer")
        protected List<Response.Error.Pointer> pointer;

        /**
         * Gets the value of the description property.
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
         */
        public void setDescription(ErrorDescriptionTextType value) {
            this.description = value;
        }

        /**
         * Gets the value of the validationCode property.
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
         */
        public void setValidationCode(ErrorValidationCodeType value) {
            this.validationCode = value;
        }

        /**
         * Gets the value of the pointer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Error.Pointer }
         * 
         * 
         */
        public List<Response.Error.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<Response.Error.Pointer>();
            }
            return this.pointer;
        }


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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * Gets the value of the sequenceNumeric property.
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
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * Gets the value of the documentSectionCode property.
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
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * Gets the value of the tagID property.
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
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }


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
     *         &lt;element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusEffectiveDateTimeType" minOccurs="0"/>
     *         &lt;element name="NameCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusNameCodeType" minOccurs="0"/>
     *         &lt;element name="ReleaseDateTime" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}StatusReleaseDateTimeType" minOccurs="0"/>
     *         &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "effectiveDateTime",
        "nameCode",
        "releaseDateTime",
        "pointer"
    })
    public static class Status {

        @XmlElement(name = "EffectiveDateTime")
        protected StatusEffectiveDateTimeType effectiveDateTime;
        @XmlElement(name = "NameCode")
        protected StatusNameCodeType nameCode;
        @XmlElement(name = "ReleaseDateTime")
        protected StatusReleaseDateTimeType releaseDateTime;
        @XmlElement(name = "Pointer")
        protected List<Response.Status.Pointer> pointer;

        /**
         * Gets the value of the effectiveDateTime property.
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
         */
        public void setEffectiveDateTime(StatusEffectiveDateTimeType value) {
            this.effectiveDateTime = value;
        }

        /**
         * Gets the value of the nameCode property.
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
         */
        public void setNameCode(StatusNameCodeType value) {
            this.nameCode = value;
        }

        /**
         * Gets the value of the releaseDateTime property.
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
         */
        public void setReleaseDateTime(StatusReleaseDateTimeType value) {
            this.releaseDateTime = value;
        }

        /**
         * Gets the value of the pointer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Status.Pointer }
         * 
         * 
         */
        public List<Response.Status.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<Response.Status.Pointer>();
            }
            return this.pointer;
        }


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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Response_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
            "sequenceNumeric",
            "documentSectionCode",
            "tagID"
        })
        public static class Pointer {

            @XmlElement(name = "SequenceNumeric")
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "DocumentSectionCode")
            protected PointerDocumentSectionCodeType documentSectionCode;
            @XmlElement(name = "TagID")
            protected PointerTagIDType tagID;

            /**
             * Gets the value of the sequenceNumeric property.
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
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * Gets the value of the documentSectionCode property.
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
             */
            public void setDocumentSectionCode(PointerDocumentSectionCodeType value) {
                this.documentSectionCode = value;
            }

            /**
             * Gets the value of the tagID property.
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
             */
            public void setTagID(PointerTagIDType value) {
                this.tagID = value;
            }

        }

    }

}
