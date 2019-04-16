
package wco.datamodel.wco.dec_dms._2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import wco.datamodel.wco.declaration_ds.dms._2.AEOMutualRecognitionPartyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AEOMutualRecognitionPartyRoleCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentCategoryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentEffectiveDateTimeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentLPCOExemptionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalDocumentTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AdditionalInformationStatementTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCityNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountrySubDivisionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressCountrySubDivisionNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressLineTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressPostcodeIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AddressTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentFunctionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.AgentNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AmendmentChangeReasonCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansModeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ArrivalTransportMeansTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthenticationAuthenticationTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthenticatorNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthorisationHolderCategoryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.AuthorisationHolderIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansModeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansRegistrationNationalityCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BorderTransportMeansTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.BuyerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.BuyerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.CarrierIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.CarrierNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ChargeDeductionChargesTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ChargeDeductionOtherChargeDeductionAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.ClassificationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ClassificationIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.CommodityDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.CommunicationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.CommunicationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsigneeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsigneeNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsignmentContainerCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsignorIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ConsignorNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ContactNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.CurrencyExchangeCurrencyTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.CustomsValuationFreightChargeAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.CustomsValuationMethodCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DangerousGoodsUNDGIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarantIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarantNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationAcceptanceDateTimeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationDeclarationOfficeIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationFunctionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationFunctionalReferenceIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationGoodsItemQuantityType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationInvoiceAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationIssueDateTimeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationIssueLocationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationLoadingListQuantityType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationSpecificCircumstancesCodeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationTotalGrossMassMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationTotalPackageQuantityType;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansIdentificationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansModeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.DepartureTransportMeansTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DestinationCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DestinationRegionIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DomesticDutyTaxPartyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DomesticDutyTaxPartyRoleCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeAdValoremTaxBaseAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeDeductAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeDutyRegimeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeQuotaOrderIDType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeSpecificTaxBaseQuantityType;
import wco.datamodel.wco.declaration_ds.dms._2.DutyTaxFeeTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ExitOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ExportCountryCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ExporterIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ExporterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.FreightPaymentMethodCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsLocationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsLocationNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsLocationTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureGrossMassMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureNetNetWeightMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureTariffQuantityType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsShipmentExitDateTimeType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsShipmentTransactionNatureCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemCustomsValueAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemStatisticalValueAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentAgencyGoodsItemTransactionNatureCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentProcedureCurrentCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GovernmentProcedurePreviousCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.GuaranteeOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ImporterIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ImporterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.InvoiceIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.InvoiceIssueDateTimeType;
import wco.datamodel.wco.declaration_ds.dms._2.InvoiceLineItemChargeAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.ItineraryRoutingCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.LoadingLocationIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.LoadingLocationNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ManufacturerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ManufacturerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeAccessCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeAmountAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeReferenceIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ObligationGuaranteeSecurityDetailsCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.OriginCountryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.OriginRegionIDType;
import wco.datamodel.wco.declaration_ds.dms._2.OriginTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingHeightMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingLengthMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingMarksNumbersIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingPackingMaterialDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingQuantityQuantityType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingVolumeMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingWidthMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PayerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PayerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.PaymentMethodCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PaymentPaymentAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.PaymentTaxAssessedAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.PointerDocumentSectionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PointerTagIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PresentationOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PreviousDocumentCategoryCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.PreviousDocumentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.PreviousDocumentTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.RefundRecipientPartyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.RefundRecipientPartyNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SealIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SellerIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SellerNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.SubmitterRoleCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.SupervisingOfficeIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SuretyIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.SuretyNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsConditionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsCountryRelationshipCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsDescriptionTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsLocationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.TradeTermsLocationNameTextType;
import wco.datamodel.wco.declaration_ds.dms._2.TransportEquipmentIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.UCRIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.UCRTraderAssignedReferenceIDType;
import wco.datamodel.wco.declaration_ds.dms._2.ValuationAdjustmentAdditionCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.WarehouseIdentificationIDType;
import wco.datamodel.wco.declaration_ds.dms._2.WarehouseTypeCodeType;
import wco.datamodel.wco.declaration_ds.dms._2.WriteOffAmountAmountType;
import wco.datamodel.wco.declaration_ds.dms._2.WriteOffQuantityQuantityType;


/**
 * <p>Java class for Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptanceDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationAcceptanceDateTimeType" minOccurs="0"/>
 *         &lt;element name="FunctionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationFunctionCodeType"/>
 *         &lt;element name="FunctionalReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationFunctionalReferenceIDType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationIdentificationIDType" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationIssueDateTimeType" minOccurs="0"/>
 *         &lt;element name="IssueLocationID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationIssueLocationIdentificationIDType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationTypeCodeType" minOccurs="0"/>
 *         &lt;element name="GoodsItemQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationGoodsItemQuantityType" minOccurs="0"/>
 *         &lt;element name="DeclarationOfficeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationDeclarationOfficeIDType" minOccurs="0"/>
 *         &lt;element name="InvoiceAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationInvoiceAmountType" minOccurs="0"/>
 *         &lt;element name="LoadingListQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationLoadingListQuantityType" minOccurs="0"/>
 *         &lt;element name="TotalGrossMassMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationTotalGrossMassMeasureType" minOccurs="0"/>
 *         &lt;element name="TotalPackageQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationTotalPackageQuantityType" minOccurs="0"/>
 *         &lt;element name="SpecificCircumstancesCodeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarationSpecificCircumstancesCodeCodeType" minOccurs="0"/>
 *         &lt;element name="Authentication" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Authentication" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthenticationAuthenticationTextType" minOccurs="0"/>
 *                   &lt;element name="Authenticator" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthenticatorNameTextType" minOccurs="0"/>
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
 *         &lt;element name="Submitter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *         &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentTypeCodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
 *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
 *                   &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
 *         &lt;element name="Agent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AgentNameTextType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AgentIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="FunctionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AgentFunctionCodeType" minOccurs="0"/>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="ChangeReasonCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AmendmentChangeReasonCodeType" minOccurs="0"/>
 *                   &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
 *                             &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
 *                             &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
 *         &lt;element name="AuthorisationHolder" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthorisationHolderIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthorisationHolderCategoryCodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BorderTransportMeans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansNameTextType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
 *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansTypeCodeType" minOccurs="0"/>
 *                   &lt;element name="RegistrationNationalityCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansRegistrationNationalityCodeType" minOccurs="0"/>
 *                   &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansModeCodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Consignment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Carrier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CarrierNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CarrierIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="ConsignmentItem" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignmentItemSequenceNumericType"/>
 *                             &lt;element name="Consignor" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                             &lt;element name="Freight" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
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
 *                   &lt;element name="Consignor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="Freight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Itinerary" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ItinerarySequenceNumericType"/>
 *                             &lt;element name="RoutingCountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ItineraryRoutingCountryCodeType" minOccurs="0"/>
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
 *         &lt;element name="CurrencyExchange" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrencyTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CurrencyExchangeCurrencyTypeCodeType" minOccurs="0"/>
 *                   &lt;element name="RateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CurrencyExchangeRateNumericType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Declarant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarantNameTextType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarantIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *         &lt;element name="ExitOffice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExitOfficeIdentificationIDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Exporter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExporterNameTextType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExporterIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *                   &lt;element name="ExitDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsShipmentExitDateTimeType" minOccurs="0"/>
 *                   &lt;element name="TransactionNatureCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsShipmentTransactionNatureCodeType" minOccurs="0"/>
 *                   &lt;element name="AEOMutualRecognitionParty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Buyer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *                   &lt;element name="Consignee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="Consignment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContainerCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignmentContainerCodeType" minOccurs="0"/>
 *                             &lt;element name="ArrivalTransportMeans" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansModeCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DepartureTransportMeans" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansModeCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GoodsLocation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                             &lt;element name="LoadingLocation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationIdentificationIDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Seal" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealSequenceNumericType"/>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealIdentificationIDType" minOccurs="0"/>
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
 *                   &lt;element name="Consignor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="CustomsValuation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FreightChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationFreightChargeAmountType" minOccurs="0"/>
 *                             &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
 *                   &lt;element name="Destination" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
 *                             &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DomesticDutyTaxParty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ExportCountry" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
 *                             &lt;element name="StatisticalValueAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemStatisticalValueAmountType" minOccurs="0"/>
 *                             &lt;element name="TransactionNatureCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemTransactionNatureCodeType" minOccurs="0"/>
 *                             &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
 *                                       &lt;element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentEffectiveDateTimeType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentNameTextType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="LPCOExemptionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentLPCOExemptionCodeType" minOccurs="0"/>
 *                                       &lt;element name="Submitter" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterRoleCodeType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="WriteOff" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffQuantityQuantityType" minOccurs="0"/>
 *                                                 &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffAmountAmountType" minOccurs="0"/>
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
 *                             &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                                       &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
 *                                       &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AEOMutualRecognitionParty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Buyer" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *                             &lt;element name="Commodity" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommodityDescriptionTextType" minOccurs="0"/>
 *                                       &lt;element name="Classification" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationIDType" minOccurs="0"/>
 *                                                 &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationTypeCodeType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DangerousGoods" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UNDGID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DangerousGoodsUNDGIDType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
 *                                                 &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
 *                                                 &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
 *                                                 &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
 *                                                 &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
 *                                                 &lt;element name="QuotaOrderID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeQuotaOrderIDType" minOccurs="0"/>
 *                                                 &lt;element name="Payment" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentMethodCodeType" minOccurs="0"/>
 *                                                           &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
 *                                                           &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
 *                                       &lt;element name="GoodsMeasure" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="GrossMassMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureGrossMassMeasureType" minOccurs="0"/>
 *                                                 &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureNetNetWeightMeasureType" minOccurs="0"/>
 *                                                 &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureTariffQuantityType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="InvoiceLine" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ItemChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceLineItemChargeAmountType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
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
 *                             &lt;element name="Consignee" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                             &lt;element name="Consignor" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                             &lt;element name="CustomsValuation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationMethodCodeType" minOccurs="0"/>
 *                                       &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
 *                                                 &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
 *                             &lt;element name="Destination" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DomesticDutyTaxParty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ExportCountry" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GovernmentProcedure" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedureCurrentCodeType" minOccurs="0"/>
 *                                       &lt;element name="PreviousCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedurePreviousCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Manufacturer" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                             &lt;element name="Origin" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginRegionIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginTypeCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Packaging" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingSequenceNumericType" minOccurs="0"/>
 *                                       &lt;element name="MarksNumbersID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingMarksNumbersIDType" minOccurs="0"/>
 *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingQuantityQuantityType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="PackingMaterialDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingPackingMaterialDescriptionTextType" minOccurs="0"/>
 *                                       &lt;element name="LengthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingLengthMeasureType" minOccurs="0"/>
 *                                       &lt;element name="WidthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingWidthMeasureType" minOccurs="0"/>
 *                                       &lt;element name="HeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingHeightMeasureType" minOccurs="0"/>
 *                                       &lt;element name="VolumeMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingVolumeMeasureType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
 *                                       &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RefundRecipientParty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                             &lt;element name="Seller" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="Address" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                                 &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                                 &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                                 &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *                             &lt;element name="UCR" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ValuationAdjustment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ValuationAdjustmentAdditionCodeType" minOccurs="0"/>
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
 *                   &lt;element name="Importer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ImporterNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ImporterIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *                   &lt;element name="Invoice" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceIssueDateTimeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Payer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PayerNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PayerIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
 *                             &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Seller" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
 *                   &lt;element name="Surety" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SuretyNameTextType" minOccurs="0"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SuretyIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
 *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
 *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
 *                   &lt;element name="TradeTerms" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsConditionCodeType" minOccurs="0"/>
 *                             &lt;element name="CountryRelationshipCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsCountryRelationshipCodeType" minOccurs="0"/>
 *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsDescriptionTextType" minOccurs="0"/>
 *                             &lt;element name="LocationID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsLocationIDType" minOccurs="0"/>
 *                             &lt;element name="LocationName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsLocationNameTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UCR" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Warehouse" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WarehouseIdentificationIDType" minOccurs="0"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WarehouseTypeCodeType" minOccurs="0"/>
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
 *         &lt;element name="ObligationGuarantee" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeAmountAmountType" minOccurs="0"/>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeIdentificationIDType" minOccurs="0"/>
 *                   &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
 *                   &lt;element name="SecurityDetailsCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeSecurityDetailsCodeType" minOccurs="0"/>
 *                   &lt;element name="AccessCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeAccessCodeType" minOccurs="0"/>
 *                   &lt;element name="GuaranteeOffice" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GuaranteeOfficeIdentificationIDType" minOccurs="0"/>
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
 *         &lt;element name="PresentationOffice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PresentationOfficeIdentificationIDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupervisingOffice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SupervisingOfficeIdentificationIDType" minOccurs="0"/>
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
@XmlType(name = "Declaration", propOrder = {
    "acceptanceDateTime",
    "functionCode",
    "functionalReferenceID",
    "id",
    "issueDateTime",
    "issueLocationID",
    "typeCode",
    "goodsItemQuantity",
    "declarationOfficeID",
    "invoiceAmount",
    "loadingListQuantity",
    "totalGrossMassMeasure",
    "totalPackageQuantity",
    "specificCircumstancesCodeCode",
    "authentication",
    "submitter",
    "additionalDocument",
    "additionalInformation",
    "agent",
    "amendment",
    "authorisationHolder",
    "borderTransportMeans",
    "consignment",
    "currencyExchange",
    "declarant",
    "exitOffice",
    "exporter",
    "goodsShipment",
    "obligationGuarantee",
    "presentationOffice",
    "supervisingOffice"
})
public class Declaration {

    @XmlElement(name = "AcceptanceDateTime")
    protected DeclarationAcceptanceDateTimeType acceptanceDateTime;
    @XmlElement(name = "FunctionCode", required = true)
    protected DeclarationFunctionCodeType functionCode;
    @XmlElement(name = "FunctionalReferenceID")
    protected DeclarationFunctionalReferenceIDType functionalReferenceID;
    @XmlElement(name = "ID")
    protected DeclarationIdentificationIDType id;
    @XmlElement(name = "IssueDateTime")
    protected DeclarationIssueDateTimeType issueDateTime;
    @XmlElement(name = "IssueLocationID")
    protected DeclarationIssueLocationIdentificationIDType issueLocationID;
    @XmlElement(name = "TypeCode")
    protected DeclarationTypeCodeType typeCode;
    @XmlElement(name = "GoodsItemQuantity")
    protected DeclarationGoodsItemQuantityType goodsItemQuantity;
    @XmlElement(name = "DeclarationOfficeID")
    protected DeclarationDeclarationOfficeIDType declarationOfficeID;
    @XmlElement(name = "InvoiceAmount")
    protected DeclarationInvoiceAmountType invoiceAmount;
    @XmlElement(name = "LoadingListQuantity")
    protected DeclarationLoadingListQuantityType loadingListQuantity;
    @XmlElement(name = "TotalGrossMassMeasure")
    protected DeclarationTotalGrossMassMeasureType totalGrossMassMeasure;
    @XmlElement(name = "TotalPackageQuantity")
    protected DeclarationTotalPackageQuantityType totalPackageQuantity;
    @XmlElement(name = "SpecificCircumstancesCodeCode")
    protected DeclarationSpecificCircumstancesCodeCodeType specificCircumstancesCodeCode;
    @XmlElement(name = "Authentication")
    protected Declaration.Authentication authentication;
    @XmlElement(name = "Submitter")
    protected Declaration.Submitter submitter;
    @XmlElement(name = "AdditionalDocument")
    protected List<Declaration.AdditionalDocument> additionalDocument;
    @XmlElement(name = "AdditionalInformation")
    protected List<Declaration.AdditionalInformation> additionalInformation;
    @XmlElement(name = "Agent")
    protected Declaration.Agent agent;
    @XmlElement(name = "Amendment")
    protected List<Declaration.Amendment> amendment;
    @XmlElement(name = "AuthorisationHolder")
    protected List<Declaration.AuthorisationHolder> authorisationHolder;
    @XmlElement(name = "BorderTransportMeans")
    protected Declaration.BorderTransportMeans borderTransportMeans;
    @XmlElement(name = "Consignment")
    protected Declaration.Consignment consignment;
    @XmlElement(name = "CurrencyExchange")
    protected List<Declaration.CurrencyExchange> currencyExchange;
    @XmlElement(name = "Declarant")
    protected Declaration.Declarant declarant;
    @XmlElement(name = "ExitOffice")
    protected Declaration.ExitOffice exitOffice;
    @XmlElement(name = "Exporter")
    protected Declaration.Exporter exporter;
    @XmlElement(name = "GoodsShipment")
    protected Declaration.GoodsShipment goodsShipment;
    @XmlElement(name = "ObligationGuarantee")
    protected List<Declaration.ObligationGuarantee> obligationGuarantee;
    @XmlElement(name = "PresentationOffice")
    protected Declaration.PresentationOffice presentationOffice;
    @XmlElement(name = "SupervisingOffice")
    protected Declaration.SupervisingOffice supervisingOffice;

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
     * Gets the value of the functionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationFunctionCodeType }
     *     
     */
    public DeclarationFunctionCodeType getFunctionCode() {
        return functionCode;
    }

    /**
     * Sets the value of the functionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationFunctionCodeType }
     *     
     */
    public void setFunctionCode(DeclarationFunctionCodeType value) {
        this.functionCode = value;
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
     * Gets the value of the issueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationIssueDateTimeType }
     *     
     */
    public DeclarationIssueDateTimeType getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Sets the value of the issueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationIssueDateTimeType }
     *     
     */
    public void setIssueDateTime(DeclarationIssueDateTimeType value) {
        this.issueDateTime = value;
    }

    /**
     * Gets the value of the issueLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationIssueLocationIdentificationIDType }
     *     
     */
    public DeclarationIssueLocationIdentificationIDType getIssueLocationID() {
        return issueLocationID;
    }

    /**
     * Sets the value of the issueLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationIssueLocationIdentificationIDType }
     *     
     */
    public void setIssueLocationID(DeclarationIssueLocationIdentificationIDType value) {
        this.issueLocationID = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTypeCodeType }
     *     
     */
    public DeclarationTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTypeCodeType }
     *     
     */
    public void setTypeCode(DeclarationTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the goodsItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationGoodsItemQuantityType }
     *     
     */
    public DeclarationGoodsItemQuantityType getGoodsItemQuantity() {
        return goodsItemQuantity;
    }

    /**
     * Sets the value of the goodsItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationGoodsItemQuantityType }
     *     
     */
    public void setGoodsItemQuantity(DeclarationGoodsItemQuantityType value) {
        this.goodsItemQuantity = value;
    }

    /**
     * Gets the value of the declarationOfficeID property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationDeclarationOfficeIDType }
     *     
     */
    public DeclarationDeclarationOfficeIDType getDeclarationOfficeID() {
        return declarationOfficeID;
    }

    /**
     * Sets the value of the declarationOfficeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationDeclarationOfficeIDType }
     *     
     */
    public void setDeclarationOfficeID(DeclarationDeclarationOfficeIDType value) {
        this.declarationOfficeID = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationInvoiceAmountType }
     *     
     */
    public DeclarationInvoiceAmountType getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets the value of the invoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationInvoiceAmountType }
     *     
     */
    public void setInvoiceAmount(DeclarationInvoiceAmountType value) {
        this.invoiceAmount = value;
    }

    /**
     * Gets the value of the loadingListQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationLoadingListQuantityType }
     *     
     */
    public DeclarationLoadingListQuantityType getLoadingListQuantity() {
        return loadingListQuantity;
    }

    /**
     * Sets the value of the loadingListQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationLoadingListQuantityType }
     *     
     */
    public void setLoadingListQuantity(DeclarationLoadingListQuantityType value) {
        this.loadingListQuantity = value;
    }

    /**
     * Gets the value of the totalGrossMassMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTotalGrossMassMeasureType }
     *     
     */
    public DeclarationTotalGrossMassMeasureType getTotalGrossMassMeasure() {
        return totalGrossMassMeasure;
    }

    /**
     * Sets the value of the totalGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTotalGrossMassMeasureType }
     *     
     */
    public void setTotalGrossMassMeasure(DeclarationTotalGrossMassMeasureType value) {
        this.totalGrossMassMeasure = value;
    }

    /**
     * Gets the value of the totalPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTotalPackageQuantityType }
     *     
     */
    public DeclarationTotalPackageQuantityType getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /**
     * Sets the value of the totalPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTotalPackageQuantityType }
     *     
     */
    public void setTotalPackageQuantity(DeclarationTotalPackageQuantityType value) {
        this.totalPackageQuantity = value;
    }

    /**
     * Gets the value of the specificCircumstancesCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationSpecificCircumstancesCodeCodeType }
     *     
     */
    public DeclarationSpecificCircumstancesCodeCodeType getSpecificCircumstancesCodeCode() {
        return specificCircumstancesCodeCode;
    }

    /**
     * Sets the value of the specificCircumstancesCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationSpecificCircumstancesCodeCodeType }
     *     
     */
    public void setSpecificCircumstancesCodeCode(DeclarationSpecificCircumstancesCodeCodeType value) {
        this.specificCircumstancesCodeCode = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.Authentication }
     *     
     */
    public Declaration.Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.Authentication }
     *     
     */
    public void setAuthentication(Declaration.Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.Submitter }
     *     
     */
    public Declaration.Submitter getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.Submitter }
     *     
     */
    public void setSubmitter(Declaration.Submitter value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the additionalDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration.AdditionalDocument }
     * 
     * 
     */
    public List<Declaration.AdditionalDocument> getAdditionalDocument() {
        if (additionalDocument == null) {
            additionalDocument = new ArrayList<Declaration.AdditionalDocument>();
        }
        return this.additionalDocument;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration.AdditionalInformation }
     * 
     * 
     */
    public List<Declaration.AdditionalInformation> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<Declaration.AdditionalInformation>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.Agent }
     *     
     */
    public Declaration.Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.Agent }
     *     
     */
    public void setAgent(Declaration.Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration.Amendment }
     * 
     * 
     */
    public List<Declaration.Amendment> getAmendment() {
        if (amendment == null) {
            amendment = new ArrayList<Declaration.Amendment>();
        }
        return this.amendment;
    }

    /**
     * Gets the value of the authorisationHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorisationHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorisationHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration.AuthorisationHolder }
     * 
     * 
     */
    public List<Declaration.AuthorisationHolder> getAuthorisationHolder() {
        if (authorisationHolder == null) {
            authorisationHolder = new ArrayList<Declaration.AuthorisationHolder>();
        }
        return this.authorisationHolder;
    }

    /**
     * Gets the value of the borderTransportMeans property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.BorderTransportMeans }
     *     
     */
    public Declaration.BorderTransportMeans getBorderTransportMeans() {
        return borderTransportMeans;
    }

    /**
     * Sets the value of the borderTransportMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.BorderTransportMeans }
     *     
     */
    public void setBorderTransportMeans(Declaration.BorderTransportMeans value) {
        this.borderTransportMeans = value;
    }

    /**
     * Gets the value of the consignment property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.Consignment }
     *     
     */
    public Declaration.Consignment getConsignment() {
        return consignment;
    }

    /**
     * Sets the value of the consignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.Consignment }
     *     
     */
    public void setConsignment(Declaration.Consignment value) {
        this.consignment = value;
    }

    /**
     * Gets the value of the currencyExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration.CurrencyExchange }
     * 
     * 
     */
    public List<Declaration.CurrencyExchange> getCurrencyExchange() {
        if (currencyExchange == null) {
            currencyExchange = new ArrayList<Declaration.CurrencyExchange>();
        }
        return this.currencyExchange;
    }

    /**
     * Gets the value of the declarant property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.Declarant }
     *     
     */
    public Declaration.Declarant getDeclarant() {
        return declarant;
    }

    /**
     * Sets the value of the declarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.Declarant }
     *     
     */
    public void setDeclarant(Declaration.Declarant value) {
        this.declarant = value;
    }

    /**
     * Gets the value of the exitOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.ExitOffice }
     *     
     */
    public Declaration.ExitOffice getExitOffice() {
        return exitOffice;
    }

    /**
     * Sets the value of the exitOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.ExitOffice }
     *     
     */
    public void setExitOffice(Declaration.ExitOffice value) {
        this.exitOffice = value;
    }

    /**
     * Gets the value of the exporter property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.Exporter }
     *     
     */
    public Declaration.Exporter getExporter() {
        return exporter;
    }

    /**
     * Sets the value of the exporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.Exporter }
     *     
     */
    public void setExporter(Declaration.Exporter value) {
        this.exporter = value;
    }

    /**
     * Gets the value of the goodsShipment property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.GoodsShipment }
     *     
     */
    public Declaration.GoodsShipment getGoodsShipment() {
        return goodsShipment;
    }

    /**
     * Sets the value of the goodsShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.GoodsShipment }
     *     
     */
    public void setGoodsShipment(Declaration.GoodsShipment value) {
        this.goodsShipment = value;
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
     * {@link Declaration.ObligationGuarantee }
     * 
     * 
     */
    public List<Declaration.ObligationGuarantee> getObligationGuarantee() {
        if (obligationGuarantee == null) {
            obligationGuarantee = new ArrayList<Declaration.ObligationGuarantee>();
        }
        return this.obligationGuarantee;
    }

    /**
     * Gets the value of the presentationOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.PresentationOffice }
     *     
     */
    public Declaration.PresentationOffice getPresentationOffice() {
        return presentationOffice;
    }

    /**
     * Sets the value of the presentationOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.PresentationOffice }
     *     
     */
    public void setPresentationOffice(Declaration.PresentationOffice value) {
        this.presentationOffice = value;
    }

    /**
     * Gets the value of the supervisingOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Declaration.SupervisingOffice }
     *     
     */
    public Declaration.SupervisingOffice getSupervisingOffice() {
        return supervisingOffice;
    }

    /**
     * Sets the value of the supervisingOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Declaration.SupervisingOffice }
     *     
     */
    public void setSupervisingOffice(Declaration.SupervisingOffice value) {
        this.supervisingOffice = value;
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
     *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentTypeCodeType" minOccurs="0"/>
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
        "categoryCode",
        "id",
        "typeCode"
    })
    public static class AdditionalDocument {

        @XmlElement(name = "CategoryCode")
        protected AdditionalDocumentCategoryCodeType categoryCode;
        @XmlElement(name = "ID")
        protected AdditionalDocumentIdentificationIDType id;
        @XmlElement(name = "TypeCode")
        protected AdditionalDocumentTypeCodeType typeCode;

        /**
         * Gets the value of the categoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalDocumentCategoryCodeType }
         *     
         */
        public AdditionalDocumentCategoryCodeType getCategoryCode() {
            return categoryCode;
        }

        /**
         * Sets the value of the categoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalDocumentCategoryCodeType }
         *     
         */
        public void setCategoryCode(AdditionalDocumentCategoryCodeType value) {
            this.categoryCode = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalDocumentIdentificationIDType }
         *     
         */
        public AdditionalDocumentIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalDocumentIdentificationIDType }
         *     
         */
        public void setID(AdditionalDocumentIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the typeCode property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalDocumentTypeCodeType }
         *     
         */
        public AdditionalDocumentTypeCodeType getTypeCode() {
            return typeCode;
        }

        /**
         * Sets the value of the typeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalDocumentTypeCodeType }
         *     
         */
        public void setTypeCode(AdditionalDocumentTypeCodeType value) {
            this.typeCode = value;
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
     *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
     *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
     *         &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
        "statementTypeCode",
        "pointer"
    })
    public static class AdditionalInformation {

        @XmlElement(name = "StatementCode")
        protected AdditionalInformationStatementCodeType statementCode;
        @XmlElement(name = "StatementDescription")
        protected AdditionalInformationStatementDescriptionTextType statementDescription;
        @XmlElement(name = "StatementTypeCode")
        protected AdditionalInformationStatementTypeCodeType statementTypeCode;
        @XmlElement(name = "Pointer")
        protected List<Declaration.AdditionalInformation.Pointer> pointer;

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
         * {@link Declaration.AdditionalInformation.Pointer }
         * 
         * 
         */
        public List<Declaration.AdditionalInformation.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<Declaration.AdditionalInformation.Pointer>();
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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
     *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AgentNameTextType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AgentIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="FunctionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AgentFunctionCodeType" minOccurs="0"/>
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
        "name",
        "id",
        "functionCode",
        "address"
    })
    public static class Agent {

        @XmlElement(name = "Name")
        protected AgentNameTextType name;
        @XmlElement(name = "ID")
        protected AgentIdentificationIDType id;
        @XmlElement(name = "FunctionCode")
        protected AgentFunctionCodeType functionCode;
        @XmlElement(name = "Address")
        protected Declaration.Agent.Address address;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link AgentNameTextType }
         *     
         */
        public AgentNameTextType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentNameTextType }
         *     
         */
        public void setName(AgentNameTextType value) {
            this.name = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link AgentIdentificationIDType }
         *     
         */
        public AgentIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentIdentificationIDType }
         *     
         */
        public void setID(AgentIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the functionCode property.
         * 
         * @return
         *     possible object is
         *     {@link AgentFunctionCodeType }
         *     
         */
        public AgentFunctionCodeType getFunctionCode() {
            return functionCode;
        }

        /**
         * Sets the value of the functionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentFunctionCodeType }
         *     
         */
        public void setFunctionCode(AgentFunctionCodeType value) {
            this.functionCode = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Agent.Address }
         *     
         */
        public Declaration.Agent.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Agent.Address }
         *     
         */
        public void setAddress(Declaration.Agent.Address value) {
            this.address = value;
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
         *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "cityName",
            "countryCode",
            "countrySubDivisionCode",
            "countrySubDivisionName",
            "line",
            "postcodeID"
        })
        public static class Address {

            @XmlElement(name = "CityName")
            protected AddressCityNameTextType cityName;
            @XmlElement(name = "CountryCode")
            protected AddressCountryCodeType countryCode;
            @XmlElement(name = "CountrySubDivisionCode")
            protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
            @XmlElement(name = "CountrySubDivisionName")
            protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
            @XmlElement(name = "Line")
            protected AddressLineTextType line;
            @XmlElement(name = "PostcodeID")
            protected AddressPostcodeIDType postcodeID;

            /**
             * Gets the value of the cityName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public AddressCityNameTextType getCityName() {
                return cityName;
            }

            /**
             * Sets the value of the cityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public void setCityName(AddressCityNameTextType value) {
                this.cityName = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public AddressCountryCodeType getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public void setCountryCode(AddressCountryCodeType value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                return countrySubDivisionCode;
            }

            /**
             * Sets the value of the countrySubDivisionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                this.countrySubDivisionCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                return countrySubDivisionName;
            }

            /**
             * Sets the value of the countrySubDivisionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                this.countrySubDivisionName = value;
            }

            /**
             * Gets the value of the line property.
             * 
             * @return
             *     possible object is
             *     {@link AddressLineTextType }
             *     
             */
            public AddressLineTextType getLine() {
                return line;
            }

            /**
             * Sets the value of the line property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressLineTextType }
             *     
             */
            public void setLine(AddressLineTextType value) {
                this.line = value;
            }

            /**
             * Gets the value of the postcodeID property.
             * 
             * @return
             *     possible object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public AddressPostcodeIDType getPostcodeID() {
                return postcodeID;
            }

            /**
             * Sets the value of the postcodeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public void setPostcodeID(AddressPostcodeIDType value) {
                this.postcodeID = value;
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
     *         &lt;element name="ChangeReasonCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AmendmentChangeReasonCodeType" minOccurs="0"/>
     *         &lt;element name="Pointer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
     *                   &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
     *                   &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
        protected List<Declaration.Amendment.Pointer> pointer;

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
         * {@link Declaration.Amendment.Pointer }
         * 
         * 
         */
        public List<Declaration.Amendment.Pointer> getPointer() {
            if (pointer == null) {
                pointer = new ArrayList<Declaration.Amendment.Pointer>();
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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerSequenceNumericType" minOccurs="0"/>
         *         &lt;element name="DocumentSectionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerDocumentSectionCodeType" minOccurs="0"/>
         *         &lt;element name="TagID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PointerTagIDType" minOccurs="0"/>
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
     *         &lt;element name="Authentication" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthenticationAuthenticationTextType" minOccurs="0"/>
     *         &lt;element name="Authenticator" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthenticatorNameTextType" minOccurs="0"/>
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
        "authentication",
        "authenticator"
    })
    public static class Authentication {

        @XmlElement(name = "Authentication")
        protected AuthenticationAuthenticationTextType authentication;
        @XmlElement(name = "Authenticator")
        protected Declaration.Authentication.Authenticator authenticator;

        /**
         * Gets the value of the authentication property.
         * 
         * @return
         *     possible object is
         *     {@link AuthenticationAuthenticationTextType }
         *     
         */
        public AuthenticationAuthenticationTextType getAuthentication() {
            return authentication;
        }

        /**
         * Sets the value of the authentication property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthenticationAuthenticationTextType }
         *     
         */
        public void setAuthentication(AuthenticationAuthenticationTextType value) {
            this.authentication = value;
        }

        /**
         * Gets the value of the authenticator property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Authentication.Authenticator }
         *     
         */
        public Declaration.Authentication.Authenticator getAuthenticator() {
            return authenticator;
        }

        /**
         * Sets the value of the authenticator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Authentication.Authenticator }
         *     
         */
        public void setAuthenticator(Declaration.Authentication.Authenticator value) {
            this.authenticator = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthenticatorNameTextType" minOccurs="0"/>
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
            "name"
        })
        public static class Authenticator {

            @XmlElement(name = "Name")
            protected AuthenticatorNameTextType name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link AuthenticatorNameTextType }
             *     
             */
            public AuthenticatorNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link AuthenticatorNameTextType }
             *     
             */
            public void setName(AuthenticatorNameTextType value) {
                this.name = value;
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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthorisationHolderIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AuthorisationHolderCategoryCodeType" minOccurs="0"/>
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
        "categoryCode"
    })
    public static class AuthorisationHolder {

        @XmlElement(name = "ID")
        protected AuthorisationHolderIdentificationIDType id;
        @XmlElement(name = "CategoryCode")
        protected AuthorisationHolderCategoryCodeType categoryCode;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link AuthorisationHolderIdentificationIDType }
         *     
         */
        public AuthorisationHolderIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthorisationHolderIdentificationIDType }
         *     
         */
        public void setID(AuthorisationHolderIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the categoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link AuthorisationHolderCategoryCodeType }
         *     
         */
        public AuthorisationHolderCategoryCodeType getCategoryCode() {
            return categoryCode;
        }

        /**
         * Sets the value of the categoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthorisationHolderCategoryCodeType }
         *     
         */
        public void setCategoryCode(AuthorisationHolderCategoryCodeType value) {
            this.categoryCode = value;
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
     *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansNameTextType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
     *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansTypeCodeType" minOccurs="0"/>
     *         &lt;element name="RegistrationNationalityCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansRegistrationNationalityCodeType" minOccurs="0"/>
     *         &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BorderTransportMeansModeCodeType" minOccurs="0"/>
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
        "name",
        "id",
        "identificationTypeCode",
        "typeCode",
        "registrationNationalityCode",
        "modeCode"
    })
    public static class BorderTransportMeans {

        @XmlElement(name = "Name")
        protected BorderTransportMeansNameTextType name;
        @XmlElement(name = "ID")
        protected BorderTransportMeansIdentificationIDType id;
        @XmlElement(name = "IdentificationTypeCode")
        protected BorderTransportMeansIdentificationTypeCodeType identificationTypeCode;
        @XmlElement(name = "TypeCode")
        protected BorderTransportMeansTypeCodeType typeCode;
        @XmlElement(name = "RegistrationNationalityCode")
        protected BorderTransportMeansRegistrationNationalityCodeType registrationNationalityCode;
        @XmlElement(name = "ModeCode")
        protected BorderTransportMeansModeCodeType modeCode;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link BorderTransportMeansNameTextType }
         *     
         */
        public BorderTransportMeansNameTextType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorderTransportMeansNameTextType }
         *     
         */
        public void setName(BorderTransportMeansNameTextType value) {
            this.name = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BorderTransportMeansIdentificationIDType }
         *     
         */
        public BorderTransportMeansIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorderTransportMeansIdentificationIDType }
         *     
         */
        public void setID(BorderTransportMeansIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the identificationTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link BorderTransportMeansIdentificationTypeCodeType }
         *     
         */
        public BorderTransportMeansIdentificationTypeCodeType getIdentificationTypeCode() {
            return identificationTypeCode;
        }

        /**
         * Sets the value of the identificationTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorderTransportMeansIdentificationTypeCodeType }
         *     
         */
        public void setIdentificationTypeCode(BorderTransportMeansIdentificationTypeCodeType value) {
            this.identificationTypeCode = value;
        }

        /**
         * Gets the value of the typeCode property.
         * 
         * @return
         *     possible object is
         *     {@link BorderTransportMeansTypeCodeType }
         *     
         */
        public BorderTransportMeansTypeCodeType getTypeCode() {
            return typeCode;
        }

        /**
         * Sets the value of the typeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorderTransportMeansTypeCodeType }
         *     
         */
        public void setTypeCode(BorderTransportMeansTypeCodeType value) {
            this.typeCode = value;
        }

        /**
         * Gets the value of the registrationNationalityCode property.
         * 
         * @return
         *     possible object is
         *     {@link BorderTransportMeansRegistrationNationalityCodeType }
         *     
         */
        public BorderTransportMeansRegistrationNationalityCodeType getRegistrationNationalityCode() {
            return registrationNationalityCode;
        }

        /**
         * Sets the value of the registrationNationalityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorderTransportMeansRegistrationNationalityCodeType }
         *     
         */
        public void setRegistrationNationalityCode(BorderTransportMeansRegistrationNationalityCodeType value) {
            this.registrationNationalityCode = value;
        }

        /**
         * Gets the value of the modeCode property.
         * 
         * @return
         *     possible object is
         *     {@link BorderTransportMeansModeCodeType }
         *     
         */
        public BorderTransportMeansModeCodeType getModeCode() {
            return modeCode;
        }

        /**
         * Sets the value of the modeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorderTransportMeansModeCodeType }
         *     
         */
        public void setModeCode(BorderTransportMeansModeCodeType value) {
            this.modeCode = value;
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
     *         &lt;element name="Carrier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CarrierNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CarrierIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *         &lt;element name="ConsignmentItem" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignmentItemSequenceNumericType"/>
     *                   &lt;element name="Consignor" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *                   &lt;element name="Freight" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
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
     *         &lt;element name="Consignor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *         &lt;element name="Freight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Itinerary" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ItinerarySequenceNumericType"/>
     *                   &lt;element name="RoutingCountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ItineraryRoutingCountryCodeType" minOccurs="0"/>
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
        "carrier",
        "consignmentItem",
        "consignor",
        "freight",
        "itinerary"
    })
    public static class Consignment {

        @XmlElement(name = "Carrier")
        protected Declaration.Consignment.Carrier carrier;
        @XmlElement(name = "ConsignmentItem")
        protected List<Declaration.Consignment.ConsignmentItem> consignmentItem;
        @XmlElement(name = "Consignor")
        protected Declaration.Consignment.Consignor consignor;
        @XmlElement(name = "Freight")
        protected Declaration.Consignment.Freight freight;
        @XmlElement(name = "Itinerary")
        protected List<Declaration.Consignment.Itinerary> itinerary;

        /**
         * Gets the value of the carrier property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Consignment.Carrier }
         *     
         */
        public Declaration.Consignment.Carrier getCarrier() {
            return carrier;
        }

        /**
         * Sets the value of the carrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Consignment.Carrier }
         *     
         */
        public void setCarrier(Declaration.Consignment.Carrier value) {
            this.carrier = value;
        }

        /**
         * Gets the value of the consignmentItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consignmentItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConsignmentItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.Consignment.ConsignmentItem }
         * 
         * 
         */
        public List<Declaration.Consignment.ConsignmentItem> getConsignmentItem() {
            if (consignmentItem == null) {
                consignmentItem = new ArrayList<Declaration.Consignment.ConsignmentItem>();
            }
            return this.consignmentItem;
        }

        /**
         * Gets the value of the consignor property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Consignment.Consignor }
         *     
         */
        public Declaration.Consignment.Consignor getConsignor() {
            return consignor;
        }

        /**
         * Sets the value of the consignor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Consignment.Consignor }
         *     
         */
        public void setConsignor(Declaration.Consignment.Consignor value) {
            this.consignor = value;
        }

        /**
         * Gets the value of the freight property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Consignment.Freight }
         *     
         */
        public Declaration.Consignment.Freight getFreight() {
            return freight;
        }

        /**
         * Sets the value of the freight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Consignment.Freight }
         *     
         */
        public void setFreight(Declaration.Consignment.Freight value) {
            this.freight = value;
        }

        /**
         * Gets the value of the itinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.Consignment.Itinerary }
         * 
         * 
         */
        public List<Declaration.Consignment.Itinerary> getItinerary() {
            if (itinerary == null) {
                itinerary = new ArrayList<Declaration.Consignment.Itinerary>();
            }
            return this.itinerary;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CarrierNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CarrierIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "name",
            "id",
            "address"
        })
        public static class Carrier {

            @XmlElement(name = "Name")
            protected CarrierNameTextType name;
            @XmlElement(name = "ID")
            protected CarrierIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.Consignment.Carrier.Address address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link CarrierNameTextType }
             *     
             */
            public CarrierNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarrierNameTextType }
             *     
             */
            public void setName(CarrierNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link CarrierIdentificationIDType }
             *     
             */
            public CarrierIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarrierIdentificationIDType }
             *     
             */
            public void setID(CarrierIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.Consignment.Carrier.Address }
             *     
             */
            public Declaration.Consignment.Carrier.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.Consignment.Carrier.Address }
             *     
             */
            public void setAddress(Declaration.Consignment.Carrier.Address value) {
                this.address = value;
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignmentItemSequenceNumericType"/>
         *         &lt;element name="Consignor" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
         *         &lt;element name="Freight" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
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
            "consignor",
            "freight"
        })
        public static class ConsignmentItem {

            @XmlElement(name = "SequenceNumeric", required = true)
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "Consignor")
            protected Declaration.Consignment.ConsignmentItem.Consignor consignor;
            @XmlElement(name = "Freight")
            protected Declaration.Consignment.ConsignmentItem.Freight freight;

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
             * Gets the value of the consignor property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.Consignment.ConsignmentItem.Consignor }
             *     
             */
            public Declaration.Consignment.ConsignmentItem.Consignor getConsignor() {
                return consignor;
            }

            /**
             * Sets the value of the consignor property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.Consignment.ConsignmentItem.Consignor }
             *     
             */
            public void setConsignor(Declaration.Consignment.ConsignmentItem.Consignor value) {
                this.consignor = value;
            }

            /**
             * Gets the value of the freight property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.Consignment.ConsignmentItem.Freight }
             *     
             */
            public Declaration.Consignment.ConsignmentItem.Freight getFreight() {
                return freight;
            }

            /**
             * Sets the value of the freight property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.Consignment.ConsignmentItem.Freight }
             *     
             */
            public void setFreight(Declaration.Consignment.ConsignmentItem.Freight value) {
                this.freight = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "name",
                "id",
                "address"
            })
            public static class Consignor {

                @XmlElement(name = "Name")
                protected ConsignorNameTextType name;
                @XmlElement(name = "ID")
                protected ConsignorIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.Consignment.ConsignmentItem.Consignor.Address address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsignorNameTextType }
                 *     
                 */
                public ConsignorNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsignorNameTextType }
                 *     
                 */
                public void setName(ConsignorNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsignorIdentificationIDType }
                 *     
                 */
                public ConsignorIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsignorIdentificationIDType }
                 *     
                 */
                public void setID(ConsignorIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.Consignment.ConsignmentItem.Consignor.Address }
                 *     
                 */
                public Declaration.Consignment.ConsignmentItem.Consignor.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.Consignment.ConsignmentItem.Consignor.Address }
                 *     
                 */
                public void setAddress(Declaration.Consignment.ConsignmentItem.Consignor.Address value) {
                    this.address = value;
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
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "typeCode",
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "TypeCode")
                    protected AddressTypeCodeType typeCode;
                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the typeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressTypeCodeType }
                     *     
                     */
                    public AddressTypeCodeType getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * Sets the value of the typeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressTypeCodeType }
                     *     
                     */
                    public void setTypeCode(AddressTypeCodeType value) {
                        this.typeCode = value;
                    }

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
             *         &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
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
                "paymentMethodCode"
            })
            public static class Freight {

                @XmlElement(name = "PaymentMethodCode")
                protected FreightPaymentMethodCodeType paymentMethodCode;

                /**
                 * Gets the value of the paymentMethodCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreightPaymentMethodCodeType }
                 *     
                 */
                public FreightPaymentMethodCodeType getPaymentMethodCode() {
                    return paymentMethodCode;
                }

                /**
                 * Sets the value of the paymentMethodCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreightPaymentMethodCodeType }
                 *     
                 */
                public void setPaymentMethodCode(FreightPaymentMethodCodeType value) {
                    this.paymentMethodCode = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "name",
            "id",
            "address"
        })
        public static class Consignor {

            @XmlElement(name = "Name")
            protected ConsignorNameTextType name;
            @XmlElement(name = "ID")
            protected ConsignorIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.Consignment.Consignor.Address address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ConsignorNameTextType }
             *     
             */
            public ConsignorNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsignorNameTextType }
             *     
             */
            public void setName(ConsignorNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ConsignorIdentificationIDType }
             *     
             */
            public ConsignorIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsignorIdentificationIDType }
             *     
             */
            public void setID(ConsignorIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.Consignment.Consignor.Address }
             *     
             */
            public Declaration.Consignment.Consignor.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.Consignment.Consignor.Address }
             *     
             */
            public void setAddress(Declaration.Consignment.Consignor.Address value) {
                this.address = value;
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
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "typeCode",
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "TypeCode")
                protected AddressTypeCodeType typeCode;
                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressTypeCodeType }
                 *     
                 */
                public AddressTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressTypeCodeType }
                 *     
                 */
                public void setTypeCode(AddressTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
         *         &lt;element name="PaymentMethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}FreightPaymentMethodCodeType" minOccurs="0"/>
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
            "paymentMethodCode"
        })
        public static class Freight {

            @XmlElement(name = "PaymentMethodCode")
            protected FreightPaymentMethodCodeType paymentMethodCode;

            /**
             * Gets the value of the paymentMethodCode property.
             * 
             * @return
             *     possible object is
             *     {@link FreightPaymentMethodCodeType }
             *     
             */
            public FreightPaymentMethodCodeType getPaymentMethodCode() {
                return paymentMethodCode;
            }

            /**
             * Sets the value of the paymentMethodCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreightPaymentMethodCodeType }
             *     
             */
            public void setPaymentMethodCode(FreightPaymentMethodCodeType value) {
                this.paymentMethodCode = value;
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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ItinerarySequenceNumericType"/>
         *         &lt;element name="RoutingCountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ItineraryRoutingCountryCodeType" minOccurs="0"/>
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
            "routingCountryCode"
        })
        public static class Itinerary {

            @XmlElement(name = "SequenceNumeric", required = true)
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "RoutingCountryCode")
            protected ItineraryRoutingCountryCodeType routingCountryCode;

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
             * Gets the value of the routingCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link ItineraryRoutingCountryCodeType }
             *     
             */
            public ItineraryRoutingCountryCodeType getRoutingCountryCode() {
                return routingCountryCode;
            }

            /**
             * Sets the value of the routingCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItineraryRoutingCountryCodeType }
             *     
             */
            public void setRoutingCountryCode(ItineraryRoutingCountryCodeType value) {
                this.routingCountryCode = value;
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
     *         &lt;element name="CurrencyTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CurrencyExchangeCurrencyTypeCodeType" minOccurs="0"/>
     *         &lt;element name="RateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CurrencyExchangeRateNumericType" minOccurs="0"/>
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
        "currencyTypeCode",
        "rateNumeric"
    })
    public static class CurrencyExchange {

        @XmlElement(name = "CurrencyTypeCode")
        protected CurrencyExchangeCurrencyTypeCodeType currencyTypeCode;
        @XmlElement(name = "RateNumeric")
        protected BigDecimal rateNumeric;

        /**
         * Gets the value of the currencyTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyExchangeCurrencyTypeCodeType }
         *     
         */
        public CurrencyExchangeCurrencyTypeCodeType getCurrencyTypeCode() {
            return currencyTypeCode;
        }

        /**
         * Sets the value of the currencyTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyExchangeCurrencyTypeCodeType }
         *     
         */
        public void setCurrencyTypeCode(CurrencyExchangeCurrencyTypeCodeType value) {
            this.currencyTypeCode = value;
        }

        /**
         * Gets the value of the rateNumeric property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRateNumeric() {
            return rateNumeric;
        }

        /**
         * Sets the value of the rateNumeric property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRateNumeric(BigDecimal value) {
            this.rateNumeric = value;
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
     *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarantNameTextType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DeclarantIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
        "name",
        "id",
        "address",
        "contact",
        "communication"
    })
    public static class Declarant {

        @XmlElement(name = "Name")
        protected DeclarantNameTextType name;
        @XmlElement(name = "ID")
        protected DeclarantIdentificationIDType id;
        @XmlElement(name = "Address")
        protected Declaration.Declarant.Address address;
        @XmlElement(name = "Contact")
        protected List<Declaration.Declarant.Contact> contact;
        @XmlElement(name = "Communication")
        protected List<Declaration.Declarant.Communication> communication;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link DeclarantNameTextType }
         *     
         */
        public DeclarantNameTextType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarantNameTextType }
         *     
         */
        public void setName(DeclarantNameTextType value) {
            this.name = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link DeclarantIdentificationIDType }
         *     
         */
        public DeclarantIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarantIdentificationIDType }
         *     
         */
        public void setID(DeclarantIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Declarant.Address }
         *     
         */
        public Declaration.Declarant.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Declarant.Address }
         *     
         */
        public void setAddress(Declaration.Declarant.Address value) {
            this.address = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.Declarant.Contact }
         * 
         * 
         */
        public List<Declaration.Declarant.Contact> getContact() {
            if (contact == null) {
                contact = new ArrayList<Declaration.Declarant.Contact>();
            }
            return this.contact;
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
         * {@link Declaration.Declarant.Communication }
         * 
         * 
         */
        public List<Declaration.Declarant.Communication> getCommunication() {
            if (communication == null) {
                communication = new ArrayList<Declaration.Declarant.Communication>();
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
         *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "cityName",
            "countryCode",
            "countrySubDivisionCode",
            "countrySubDivisionName",
            "line",
            "postcodeID"
        })
        public static class Address {

            @XmlElement(name = "CityName")
            protected AddressCityNameTextType cityName;
            @XmlElement(name = "CountryCode")
            protected AddressCountryCodeType countryCode;
            @XmlElement(name = "CountrySubDivisionCode")
            protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
            @XmlElement(name = "CountrySubDivisionName")
            protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
            @XmlElement(name = "Line")
            protected AddressLineTextType line;
            @XmlElement(name = "PostcodeID")
            protected AddressPostcodeIDType postcodeID;

            /**
             * Gets the value of the cityName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public AddressCityNameTextType getCityName() {
                return cityName;
            }

            /**
             * Sets the value of the cityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public void setCityName(AddressCityNameTextType value) {
                this.cityName = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public AddressCountryCodeType getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public void setCountryCode(AddressCountryCodeType value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                return countrySubDivisionCode;
            }

            /**
             * Sets the value of the countrySubDivisionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                this.countrySubDivisionCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                return countrySubDivisionName;
            }

            /**
             * Sets the value of the countrySubDivisionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                this.countrySubDivisionName = value;
            }

            /**
             * Gets the value of the line property.
             * 
             * @return
             *     possible object is
             *     {@link AddressLineTextType }
             *     
             */
            public AddressLineTextType getLine() {
                return line;
            }

            /**
             * Sets the value of the line property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressLineTextType }
             *     
             */
            public void setLine(AddressLineTextType value) {
                this.line = value;
            }

            /**
             * Gets the value of the postcodeID property.
             * 
             * @return
             *     possible object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public AddressPostcodeIDType getPostcodeID() {
                return postcodeID;
            }

            /**
             * Sets the value of the postcodeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public void setPostcodeID(AddressPostcodeIDType value) {
                this.postcodeID = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
            "name"
        })
        public static class Contact {

            @XmlElement(name = "Name")
            protected ContactNameTextType name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ContactNameTextType }
             *     
             */
            public ContactNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactNameTextType }
             *     
             */
            public void setName(ContactNameTextType value) {
                this.name = value;
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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExitOfficeIdentificationIDType" minOccurs="0"/>
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
    public static class ExitOffice {

        @XmlElement(name = "ID")
        protected ExitOfficeIdentificationIDType id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link ExitOfficeIdentificationIDType }
         *     
         */
        public ExitOfficeIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExitOfficeIdentificationIDType }
         *     
         */
        public void setID(ExitOfficeIdentificationIDType value) {
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
     *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExporterNameTextType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExporterIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
        "name",
        "id",
        "address",
        "contact",
        "communication"
    })
    public static class Exporter {

        @XmlElement(name = "Name")
        protected ExporterNameTextType name;
        @XmlElement(name = "ID")
        protected ExporterIdentificationIDType id;
        @XmlElement(name = "Address")
        protected Declaration.Exporter.Address address;
        @XmlElement(name = "Contact")
        protected List<Declaration.Exporter.Contact> contact;
        @XmlElement(name = "Communication")
        protected List<Declaration.Exporter.Communication> communication;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ExporterNameTextType }
         *     
         */
        public ExporterNameTextType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExporterNameTextType }
         *     
         */
        public void setName(ExporterNameTextType value) {
            this.name = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link ExporterIdentificationIDType }
         *     
         */
        public ExporterIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExporterIdentificationIDType }
         *     
         */
        public void setID(ExporterIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Exporter.Address }
         *     
         */
        public Declaration.Exporter.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Exporter.Address }
         *     
         */
        public void setAddress(Declaration.Exporter.Address value) {
            this.address = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.Exporter.Contact }
         * 
         * 
         */
        public List<Declaration.Exporter.Contact> getContact() {
            if (contact == null) {
                contact = new ArrayList<Declaration.Exporter.Contact>();
            }
            return this.contact;
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
         * {@link Declaration.Exporter.Communication }
         * 
         * 
         */
        public List<Declaration.Exporter.Communication> getCommunication() {
            if (communication == null) {
                communication = new ArrayList<Declaration.Exporter.Communication>();
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
         *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "cityName",
            "countryCode",
            "countrySubDivisionCode",
            "countrySubDivisionName",
            "line",
            "postcodeID"
        })
        public static class Address {

            @XmlElement(name = "CityName")
            protected AddressCityNameTextType cityName;
            @XmlElement(name = "CountryCode")
            protected AddressCountryCodeType countryCode;
            @XmlElement(name = "CountrySubDivisionCode")
            protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
            @XmlElement(name = "CountrySubDivisionName")
            protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
            @XmlElement(name = "Line")
            protected AddressLineTextType line;
            @XmlElement(name = "PostcodeID")
            protected AddressPostcodeIDType postcodeID;

            /**
             * Gets the value of the cityName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public AddressCityNameTextType getCityName() {
                return cityName;
            }

            /**
             * Sets the value of the cityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public void setCityName(AddressCityNameTextType value) {
                this.cityName = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public AddressCountryCodeType getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public void setCountryCode(AddressCountryCodeType value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                return countrySubDivisionCode;
            }

            /**
             * Sets the value of the countrySubDivisionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                this.countrySubDivisionCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                return countrySubDivisionName;
            }

            /**
             * Sets the value of the countrySubDivisionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                this.countrySubDivisionName = value;
            }

            /**
             * Gets the value of the line property.
             * 
             * @return
             *     possible object is
             *     {@link AddressLineTextType }
             *     
             */
            public AddressLineTextType getLine() {
                return line;
            }

            /**
             * Sets the value of the line property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressLineTextType }
             *     
             */
            public void setLine(AddressLineTextType value) {
                this.line = value;
            }

            /**
             * Gets the value of the postcodeID property.
             * 
             * @return
             *     possible object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public AddressPostcodeIDType getPostcodeID() {
                return postcodeID;
            }

            /**
             * Sets the value of the postcodeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public void setPostcodeID(AddressPostcodeIDType value) {
                this.postcodeID = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
            "name"
        })
        public static class Contact {

            @XmlElement(name = "Name")
            protected ContactNameTextType name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ContactNameTextType }
             *     
             */
            public ContactNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactNameTextType }
             *     
             */
            public void setName(ContactNameTextType value) {
                this.name = value;
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
     *         &lt;element name="ExitDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsShipmentExitDateTimeType" minOccurs="0"/>
     *         &lt;element name="TransactionNatureCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsShipmentTransactionNatureCodeType" minOccurs="0"/>
     *         &lt;element name="AEOMutualRecognitionParty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Buyer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
     *         &lt;element name="Consignee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *         &lt;element name="Consignment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContainerCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignmentContainerCodeType" minOccurs="0"/>
     *                   &lt;element name="ArrivalTransportMeans" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansModeCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DepartureTransportMeans" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansModeCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GoodsLocation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *                   &lt;element name="LoadingLocation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationIdentificationIDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Seal" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealSequenceNumericType"/>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealIdentificationIDType" minOccurs="0"/>
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
     *         &lt;element name="Consignor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *         &lt;element name="CustomsValuation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FreightChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationFreightChargeAmountType" minOccurs="0"/>
     *                   &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
     *         &lt;element name="Destination" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
     *                   &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DomesticDutyTaxParty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExportCountry" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
     *                   &lt;element name="StatisticalValueAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemStatisticalValueAmountType" minOccurs="0"/>
     *                   &lt;element name="TransactionNatureCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemTransactionNatureCodeType" minOccurs="0"/>
     *                   &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
     *                             &lt;element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentEffectiveDateTimeType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentNameTextType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="LPCOExemptionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentLPCOExemptionCodeType" minOccurs="0"/>
     *                             &lt;element name="Submitter" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
     *                                       &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterRoleCodeType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="WriteOff" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffQuantityQuantityType" minOccurs="0"/>
     *                                       &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffAmountAmountType" minOccurs="0"/>
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
     *                   &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *                             &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
     *                             &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AEOMutualRecognitionParty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Buyer" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
     *                   &lt;element name="Commodity" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommodityDescriptionTextType" minOccurs="0"/>
     *                             &lt;element name="Classification" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationIDType" minOccurs="0"/>
     *                                       &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationTypeCodeType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DangerousGoods" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="UNDGID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DangerousGoodsUNDGIDType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
     *                                       &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
     *                                       &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
     *                                       &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
     *                                       &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
     *                                       &lt;element name="QuotaOrderID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeQuotaOrderIDType" minOccurs="0"/>
     *                                       &lt;element name="Payment" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentMethodCodeType" minOccurs="0"/>
     *                                                 &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
     *                                                 &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
     *                             &lt;element name="GoodsMeasure" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="GrossMassMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureGrossMassMeasureType" minOccurs="0"/>
     *                                       &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureNetNetWeightMeasureType" minOccurs="0"/>
     *                                       &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureTariffQuantityType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="InvoiceLine" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ItemChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceLineItemChargeAmountType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
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
     *                   &lt;element name="Consignee" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *                   &lt;element name="Consignor" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *                   &lt;element name="CustomsValuation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationMethodCodeType" minOccurs="0"/>
     *                             &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
     *                                       &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
     *                   &lt;element name="Destination" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DomesticDutyTaxParty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ExportCountry" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GovernmentProcedure" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedureCurrentCodeType" minOccurs="0"/>
     *                             &lt;element name="PreviousCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedurePreviousCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Manufacturer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *                   &lt;element name="Origin" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginRegionIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginTypeCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Packaging" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingSequenceNumericType" minOccurs="0"/>
     *                             &lt;element name="MarksNumbersID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingMarksNumbersIDType" minOccurs="0"/>
     *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingQuantityQuantityType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="PackingMaterialDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingPackingMaterialDescriptionTextType" minOccurs="0"/>
     *                             &lt;element name="LengthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingLengthMeasureType" minOccurs="0"/>
     *                             &lt;element name="WidthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingWidthMeasureType" minOccurs="0"/>
     *                             &lt;element name="HeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingHeightMeasureType" minOccurs="0"/>
     *                             &lt;element name="VolumeMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingVolumeMeasureType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
     *                             &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RefundRecipientParty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *                   &lt;element name="Seller" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="Address" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                                       &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                                       &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
     *                   &lt;element name="UCR" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ValuationAdjustment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ValuationAdjustmentAdditionCodeType" minOccurs="0"/>
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
     *         &lt;element name="Importer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ImporterNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ImporterIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
     *         &lt;element name="Invoice" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceIssueDateTimeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Payer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PayerNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PayerIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *         &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
     *                   &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Seller" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
     *         &lt;element name="Surety" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SuretyNameTextType" minOccurs="0"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SuretyIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
     *         &lt;element name="TradeTerms" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsConditionCodeType" minOccurs="0"/>
     *                   &lt;element name="CountryRelationshipCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsCountryRelationshipCodeType" minOccurs="0"/>
     *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsDescriptionTextType" minOccurs="0"/>
     *                   &lt;element name="LocationID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsLocationIDType" minOccurs="0"/>
     *                   &lt;element name="LocationName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsLocationNameTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UCR" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Warehouse" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WarehouseIdentificationIDType" minOccurs="0"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WarehouseTypeCodeType" minOccurs="0"/>
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
        "exitDateTime",
        "transactionNatureCode",
        "aeoMutualRecognitionParty",
        "buyer",
        "consignee",
        "consignment",
        "consignor",
        "customsValuation",
        "destination",
        "domesticDutyTaxParty",
        "exportCountry",
        "governmentAgencyGoodsItem",
        "importer",
        "invoice",
        "payer",
        "previousDocument",
        "seller",
        "surety",
        "tradeTerms",
        "ucr",
        "warehouse"
    })
    public static class GoodsShipment {

        @XmlElement(name = "ExitDateTime")
        protected GoodsShipmentExitDateTimeType exitDateTime;
        @XmlElement(name = "TransactionNatureCode")
        protected GoodsShipmentTransactionNatureCodeType transactionNatureCode;
        @XmlElement(name = "AEOMutualRecognitionParty")
        protected List<Declaration.GoodsShipment.AEOMutualRecognitionParty> aeoMutualRecognitionParty;
        @XmlElement(name = "Buyer")
        protected Declaration.GoodsShipment.Buyer buyer;
        @XmlElement(name = "Consignee")
        protected Declaration.GoodsShipment.Consignee consignee;
        @XmlElement(name = "Consignment")
        protected Declaration.GoodsShipment.Consignment consignment;
        @XmlElement(name = "Consignor")
        protected Declaration.GoodsShipment.Consignor consignor;
        @XmlElement(name = "CustomsValuation")
        protected Declaration.GoodsShipment.CustomsValuation customsValuation;
        @XmlElement(name = "Destination")
        protected Declaration.GoodsShipment.Destination destination;
        @XmlElement(name = "DomesticDutyTaxParty")
        protected List<Declaration.GoodsShipment.DomesticDutyTaxParty> domesticDutyTaxParty;
        @XmlElement(name = "ExportCountry")
        protected Declaration.GoodsShipment.ExportCountry exportCountry;
        @XmlElement(name = "GovernmentAgencyGoodsItem")
        protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;
        @XmlElement(name = "Importer")
        protected Declaration.GoodsShipment.Importer importer;
        @XmlElement(name = "Invoice")
        protected Declaration.GoodsShipment.Invoice invoice;
        @XmlElement(name = "Payer")
        protected List<Declaration.GoodsShipment.Payer> payer;
        @XmlElement(name = "PreviousDocument")
        protected List<Declaration.GoodsShipment.PreviousDocument> previousDocument;
        @XmlElement(name = "Seller")
        protected Declaration.GoodsShipment.Seller seller;
        @XmlElement(name = "Surety")
        protected List<Declaration.GoodsShipment.Surety> surety;
        @XmlElement(name = "TradeTerms")
        protected Declaration.GoodsShipment.TradeTerms tradeTerms;
        @XmlElement(name = "UCR")
        protected Declaration.GoodsShipment.UCR ucr;
        @XmlElement(name = "Warehouse")
        protected Declaration.GoodsShipment.Warehouse warehouse;

        /**
         * Gets the value of the exitDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link GoodsShipmentExitDateTimeType }
         *     
         */
        public GoodsShipmentExitDateTimeType getExitDateTime() {
            return exitDateTime;
        }

        /**
         * Sets the value of the exitDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link GoodsShipmentExitDateTimeType }
         *     
         */
        public void setExitDateTime(GoodsShipmentExitDateTimeType value) {
            this.exitDateTime = value;
        }

        /**
         * Gets the value of the transactionNatureCode property.
         * 
         * @return
         *     possible object is
         *     {@link GoodsShipmentTransactionNatureCodeType }
         *     
         */
        public GoodsShipmentTransactionNatureCodeType getTransactionNatureCode() {
            return transactionNatureCode;
        }

        /**
         * Sets the value of the transactionNatureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link GoodsShipmentTransactionNatureCodeType }
         *     
         */
        public void setTransactionNatureCode(GoodsShipmentTransactionNatureCodeType value) {
            this.transactionNatureCode = value;
        }

        /**
         * Gets the value of the aeoMutualRecognitionParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aeoMutualRecognitionParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAEOMutualRecognitionParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.GoodsShipment.AEOMutualRecognitionParty }
         * 
         * 
         */
        public List<Declaration.GoodsShipment.AEOMutualRecognitionParty> getAEOMutualRecognitionParty() {
            if (aeoMutualRecognitionParty == null) {
                aeoMutualRecognitionParty = new ArrayList<Declaration.GoodsShipment.AEOMutualRecognitionParty>();
            }
            return this.aeoMutualRecognitionParty;
        }

        /**
         * Gets the value of the buyer property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Buyer }
         *     
         */
        public Declaration.GoodsShipment.Buyer getBuyer() {
            return buyer;
        }

        /**
         * Sets the value of the buyer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Buyer }
         *     
         */
        public void setBuyer(Declaration.GoodsShipment.Buyer value) {
            this.buyer = value;
        }

        /**
         * Gets the value of the consignee property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Consignee }
         *     
         */
        public Declaration.GoodsShipment.Consignee getConsignee() {
            return consignee;
        }

        /**
         * Sets the value of the consignee property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Consignee }
         *     
         */
        public void setConsignee(Declaration.GoodsShipment.Consignee value) {
            this.consignee = value;
        }

        /**
         * Gets the value of the consignment property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Consignment }
         *     
         */
        public Declaration.GoodsShipment.Consignment getConsignment() {
            return consignment;
        }

        /**
         * Sets the value of the consignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Consignment }
         *     
         */
        public void setConsignment(Declaration.GoodsShipment.Consignment value) {
            this.consignment = value;
        }

        /**
         * Gets the value of the consignor property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Consignor }
         *     
         */
        public Declaration.GoodsShipment.Consignor getConsignor() {
            return consignor;
        }

        /**
         * Sets the value of the consignor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Consignor }
         *     
         */
        public void setConsignor(Declaration.GoodsShipment.Consignor value) {
            this.consignor = value;
        }

        /**
         * Gets the value of the customsValuation property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.CustomsValuation }
         *     
         */
        public Declaration.GoodsShipment.CustomsValuation getCustomsValuation() {
            return customsValuation;
        }

        /**
         * Sets the value of the customsValuation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.CustomsValuation }
         *     
         */
        public void setCustomsValuation(Declaration.GoodsShipment.CustomsValuation value) {
            this.customsValuation = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Destination }
         *     
         */
        public Declaration.GoodsShipment.Destination getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Destination }
         *     
         */
        public void setDestination(Declaration.GoodsShipment.Destination value) {
            this.destination = value;
        }

        /**
         * Gets the value of the domesticDutyTaxParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the domesticDutyTaxParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDomesticDutyTaxParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.GoodsShipment.DomesticDutyTaxParty }
         * 
         * 
         */
        public List<Declaration.GoodsShipment.DomesticDutyTaxParty> getDomesticDutyTaxParty() {
            if (domesticDutyTaxParty == null) {
                domesticDutyTaxParty = new ArrayList<Declaration.GoodsShipment.DomesticDutyTaxParty>();
            }
            return this.domesticDutyTaxParty;
        }

        /**
         * Gets the value of the exportCountry property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.ExportCountry }
         *     
         */
        public Declaration.GoodsShipment.ExportCountry getExportCountry() {
            return exportCountry;
        }

        /**
         * Sets the value of the exportCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.ExportCountry }
         *     
         */
        public void setExportCountry(Declaration.GoodsShipment.ExportCountry value) {
            this.exportCountry = value;
        }

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
         * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem }
         * 
         * 
         */
        public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
            if (governmentAgencyGoodsItem == null) {
                governmentAgencyGoodsItem = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem>();
            }
            return this.governmentAgencyGoodsItem;
        }

        /**
         * Gets the value of the importer property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Importer }
         *     
         */
        public Declaration.GoodsShipment.Importer getImporter() {
            return importer;
        }

        /**
         * Sets the value of the importer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Importer }
         *     
         */
        public void setImporter(Declaration.GoodsShipment.Importer value) {
            this.importer = value;
        }

        /**
         * Gets the value of the invoice property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Invoice }
         *     
         */
        public Declaration.GoodsShipment.Invoice getInvoice() {
            return invoice;
        }

        /**
         * Sets the value of the invoice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Invoice }
         *     
         */
        public void setInvoice(Declaration.GoodsShipment.Invoice value) {
            this.invoice = value;
        }

        /**
         * Gets the value of the payer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.GoodsShipment.Payer }
         * 
         * 
         */
        public List<Declaration.GoodsShipment.Payer> getPayer() {
            if (payer == null) {
                payer = new ArrayList<Declaration.GoodsShipment.Payer>();
            }
            return this.payer;
        }

        /**
         * Gets the value of the previousDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.GoodsShipment.PreviousDocument }
         * 
         * 
         */
        public List<Declaration.GoodsShipment.PreviousDocument> getPreviousDocument() {
            if (previousDocument == null) {
                previousDocument = new ArrayList<Declaration.GoodsShipment.PreviousDocument>();
            }
            return this.previousDocument;
        }

        /**
         * Gets the value of the seller property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Seller }
         *     
         */
        public Declaration.GoodsShipment.Seller getSeller() {
            return seller;
        }

        /**
         * Sets the value of the seller property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Seller }
         *     
         */
        public void setSeller(Declaration.GoodsShipment.Seller value) {
            this.seller = value;
        }

        /**
         * Gets the value of the surety property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surety property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurety().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Declaration.GoodsShipment.Surety }
         * 
         * 
         */
        public List<Declaration.GoodsShipment.Surety> getSurety() {
            if (surety == null) {
                surety = new ArrayList<Declaration.GoodsShipment.Surety>();
            }
            return this.surety;
        }

        /**
         * Gets the value of the tradeTerms property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.TradeTerms }
         *     
         */
        public Declaration.GoodsShipment.TradeTerms getTradeTerms() {
            return tradeTerms;
        }

        /**
         * Sets the value of the tradeTerms property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.TradeTerms }
         *     
         */
        public void setTradeTerms(Declaration.GoodsShipment.TradeTerms value) {
            this.tradeTerms = value;
        }

        /**
         * Gets the value of the ucr property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.UCR }
         *     
         */
        public Declaration.GoodsShipment.UCR getUCR() {
            return ucr;
        }

        /**
         * Sets the value of the ucr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.UCR }
         *     
         */
        public void setUCR(Declaration.GoodsShipment.UCR value) {
            this.ucr = value;
        }

        /**
         * Gets the value of the warehouse property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.GoodsShipment.Warehouse }
         *     
         */
        public Declaration.GoodsShipment.Warehouse getWarehouse() {
            return warehouse;
        }

        /**
         * Sets the value of the warehouse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.GoodsShipment.Warehouse }
         *     
         */
        public void setWarehouse(Declaration.GoodsShipment.Warehouse value) {
            this.warehouse = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
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
            "roleCode"
        })
        public static class AEOMutualRecognitionParty {

            @XmlElement(name = "ID")
            protected AEOMutualRecognitionPartyIdentificationIDType id;
            @XmlElement(name = "RoleCode")
            protected AEOMutualRecognitionPartyRoleCodeType roleCode;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link AEOMutualRecognitionPartyIdentificationIDType }
             *     
             */
            public AEOMutualRecognitionPartyIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link AEOMutualRecognitionPartyIdentificationIDType }
             *     
             */
            public void setID(AEOMutualRecognitionPartyIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the roleCode property.
             * 
             * @return
             *     possible object is
             *     {@link AEOMutualRecognitionPartyRoleCodeType }
             *     
             */
            public AEOMutualRecognitionPartyRoleCodeType getRoleCode() {
                return roleCode;
            }

            /**
             * Sets the value of the roleCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AEOMutualRecognitionPartyRoleCodeType }
             *     
             */
            public void setRoleCode(AEOMutualRecognitionPartyRoleCodeType value) {
                this.roleCode = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
            "name",
            "id",
            "address",
            "contact",
            "communication"
        })
        public static class Buyer {

            @XmlElement(name = "Name")
            protected BuyerNameTextType name;
            @XmlElement(name = "ID")
            protected BuyerIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Buyer.Address address;
            @XmlElement(name = "Contact")
            protected List<Declaration.GoodsShipment.Buyer.Contact> contact;
            @XmlElement(name = "Communication")
            protected List<Declaration.GoodsShipment.Buyer.Communication> communication;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link BuyerNameTextType }
             *     
             */
            public BuyerNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link BuyerNameTextType }
             *     
             */
            public void setName(BuyerNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BuyerIdentificationIDType }
             *     
             */
            public BuyerIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BuyerIdentificationIDType }
             *     
             */
            public void setID(BuyerIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Buyer.Address }
             *     
             */
            public Declaration.GoodsShipment.Buyer.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Buyer.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Buyer.Address value) {
                this.address = value;
            }

            /**
             * Gets the value of the contact property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contact property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContact().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.Buyer.Contact }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Buyer.Contact> getContact() {
                if (contact == null) {
                    contact = new ArrayList<Declaration.GoodsShipment.Buyer.Contact>();
                }
                return this.contact;
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
             * {@link Declaration.GoodsShipment.Buyer.Communication }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Buyer.Communication> getCommunication() {
                if (communication == null) {
                    communication = new ArrayList<Declaration.GoodsShipment.Buyer.Communication>();
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
                "name"
            })
            public static class Contact {

                @XmlElement(name = "Name")
                protected ContactNameTextType name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ContactNameTextType }
                 *     
                 */
                public ContactNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ContactNameTextType }
                 *     
                 */
                public void setName(ContactNameTextType value) {
                    this.name = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "name",
            "id",
            "address"
        })
        public static class Consignee {

            @XmlElement(name = "Name")
            protected ConsigneeNameTextType name;
            @XmlElement(name = "ID")
            protected ConsigneeIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Consignee.Address address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ConsigneeNameTextType }
             *     
             */
            public ConsigneeNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsigneeNameTextType }
             *     
             */
            public void setName(ConsigneeNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ConsigneeIdentificationIDType }
             *     
             */
            public ConsigneeIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsigneeIdentificationIDType }
             *     
             */
            public void setID(ConsigneeIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Consignee.Address }
             *     
             */
            public Declaration.GoodsShipment.Consignee.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Consignee.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Consignee.Address value) {
                this.address = value;
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
         *         &lt;element name="ContainerCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignmentContainerCodeType" minOccurs="0"/>
         *         &lt;element name="ArrivalTransportMeans" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansModeCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DepartureTransportMeans" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansModeCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GoodsLocation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
         *         &lt;element name="LoadingLocation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationIdentificationIDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Seal" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealSequenceNumericType"/>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealIdentificationIDType" minOccurs="0"/>
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
            "containerCode",
            "arrivalTransportMeans",
            "departureTransportMeans",
            "goodsLocation",
            "loadingLocation",
            "transportEquipment"
        })
        public static class Consignment {

            @XmlElement(name = "ContainerCode")
            protected ConsignmentContainerCodeType containerCode;
            @XmlElement(name = "ArrivalTransportMeans")
            protected Declaration.GoodsShipment.Consignment.ArrivalTransportMeans arrivalTransportMeans;
            @XmlElement(name = "DepartureTransportMeans")
            protected Declaration.GoodsShipment.Consignment.DepartureTransportMeans departureTransportMeans;
            @XmlElement(name = "GoodsLocation")
            protected Declaration.GoodsShipment.Consignment.GoodsLocation goodsLocation;
            @XmlElement(name = "LoadingLocation")
            protected Declaration.GoodsShipment.Consignment.LoadingLocation loadingLocation;
            @XmlElement(name = "TransportEquipment")
            protected List<Declaration.GoodsShipment.Consignment.TransportEquipment> transportEquipment;

            /**
             * Gets the value of the containerCode property.
             * 
             * @return
             *     possible object is
             *     {@link ConsignmentContainerCodeType }
             *     
             */
            public ConsignmentContainerCodeType getContainerCode() {
                return containerCode;
            }

            /**
             * Sets the value of the containerCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsignmentContainerCodeType }
             *     
             */
            public void setContainerCode(ConsignmentContainerCodeType value) {
                this.containerCode = value;
            }

            /**
             * Gets the value of the arrivalTransportMeans property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Consignment.ArrivalTransportMeans }
             *     
             */
            public Declaration.GoodsShipment.Consignment.ArrivalTransportMeans getArrivalTransportMeans() {
                return arrivalTransportMeans;
            }

            /**
             * Sets the value of the arrivalTransportMeans property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Consignment.ArrivalTransportMeans }
             *     
             */
            public void setArrivalTransportMeans(Declaration.GoodsShipment.Consignment.ArrivalTransportMeans value) {
                this.arrivalTransportMeans = value;
            }

            /**
             * Gets the value of the departureTransportMeans property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Consignment.DepartureTransportMeans }
             *     
             */
            public Declaration.GoodsShipment.Consignment.DepartureTransportMeans getDepartureTransportMeans() {
                return departureTransportMeans;
            }

            /**
             * Sets the value of the departureTransportMeans property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Consignment.DepartureTransportMeans }
             *     
             */
            public void setDepartureTransportMeans(Declaration.GoodsShipment.Consignment.DepartureTransportMeans value) {
                this.departureTransportMeans = value;
            }

            /**
             * Gets the value of the goodsLocation property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Consignment.GoodsLocation }
             *     
             */
            public Declaration.GoodsShipment.Consignment.GoodsLocation getGoodsLocation() {
                return goodsLocation;
            }

            /**
             * Sets the value of the goodsLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Consignment.GoodsLocation }
             *     
             */
            public void setGoodsLocation(Declaration.GoodsShipment.Consignment.GoodsLocation value) {
                this.goodsLocation = value;
            }

            /**
             * Gets the value of the loadingLocation property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Consignment.LoadingLocation }
             *     
             */
            public Declaration.GoodsShipment.Consignment.LoadingLocation getLoadingLocation() {
                return loadingLocation;
            }

            /**
             * Sets the value of the loadingLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Consignment.LoadingLocation }
             *     
             */
            public void setLoadingLocation(Declaration.GoodsShipment.Consignment.LoadingLocation value) {
                this.loadingLocation = value;
            }

            /**
             * Gets the value of the transportEquipment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransportEquipment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.Consignment.TransportEquipment }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Consignment.TransportEquipment> getTransportEquipment() {
                if (transportEquipment == null) {
                    transportEquipment = new ArrayList<Declaration.GoodsShipment.Consignment.TransportEquipment>();
                }
                return this.transportEquipment;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansTypeCodeType" minOccurs="0"/>
             *         &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ArrivalTransportMeansModeCodeType" minOccurs="0"/>
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
                "name",
                "id",
                "identificationTypeCode",
                "typeCode",
                "modeCode"
            })
            public static class ArrivalTransportMeans {

                @XmlElement(name = "Name")
                protected ArrivalTransportMeansNameTextType name;
                @XmlElement(name = "ID")
                protected ArrivalTransportMeansIdentificationIDType id;
                @XmlElement(name = "IdentificationTypeCode")
                protected ArrivalTransportMeansIdentificationTypeCodeType identificationTypeCode;
                @XmlElement(name = "TypeCode")
                protected ArrivalTransportMeansTypeCodeType typeCode;
                @XmlElement(name = "ModeCode")
                protected ArrivalTransportMeansModeCodeType modeCode;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrivalTransportMeansNameTextType }
                 *     
                 */
                public ArrivalTransportMeansNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrivalTransportMeansNameTextType }
                 *     
                 */
                public void setName(ArrivalTransportMeansNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrivalTransportMeansIdentificationIDType }
                 *     
                 */
                public ArrivalTransportMeansIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrivalTransportMeansIdentificationIDType }
                 *     
                 */
                public void setID(ArrivalTransportMeansIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the identificationTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrivalTransportMeansIdentificationTypeCodeType }
                 *     
                 */
                public ArrivalTransportMeansIdentificationTypeCodeType getIdentificationTypeCode() {
                    return identificationTypeCode;
                }

                /**
                 * Sets the value of the identificationTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrivalTransportMeansIdentificationTypeCodeType }
                 *     
                 */
                public void setIdentificationTypeCode(ArrivalTransportMeansIdentificationTypeCodeType value) {
                    this.identificationTypeCode = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrivalTransportMeansTypeCodeType }
                 *     
                 */
                public ArrivalTransportMeansTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrivalTransportMeansTypeCodeType }
                 *     
                 */
                public void setTypeCode(ArrivalTransportMeansTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the modeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrivalTransportMeansModeCodeType }
                 *     
                 */
                public ArrivalTransportMeansModeCodeType getModeCode() {
                    return modeCode;
                }

                /**
                 * Sets the value of the modeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrivalTransportMeansModeCodeType }
                 *     
                 */
                public void setModeCode(ArrivalTransportMeansModeCodeType value) {
                    this.modeCode = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansIdentificationTypeCodeType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansTypeCodeType" minOccurs="0"/>
             *         &lt;element name="ModeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DepartureTransportMeansModeCodeType" minOccurs="0"/>
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
                "name",
                "id",
                "identificationTypeCode",
                "typeCode",
                "modeCode"
            })
            public static class DepartureTransportMeans {

                @XmlElement(name = "Name")
                protected DepartureTransportMeansNameTextType name;
                @XmlElement(name = "ID")
                protected DepartureTransportMeansIdentificationIDType id;
                @XmlElement(name = "IdentificationTypeCode")
                protected DepartureTransportMeansIdentificationTypeCodeType identificationTypeCode;
                @XmlElement(name = "TypeCode")
                protected DepartureTransportMeansTypeCodeType typeCode;
                @XmlElement(name = "ModeCode")
                protected DepartureTransportMeansModeCodeType modeCode;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureTransportMeansNameTextType }
                 *     
                 */
                public DepartureTransportMeansNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureTransportMeansNameTextType }
                 *     
                 */
                public void setName(DepartureTransportMeansNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureTransportMeansIdentificationIDType }
                 *     
                 */
                public DepartureTransportMeansIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureTransportMeansIdentificationIDType }
                 *     
                 */
                public void setID(DepartureTransportMeansIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the identificationTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureTransportMeansIdentificationTypeCodeType }
                 *     
                 */
                public DepartureTransportMeansIdentificationTypeCodeType getIdentificationTypeCode() {
                    return identificationTypeCode;
                }

                /**
                 * Sets the value of the identificationTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureTransportMeansIdentificationTypeCodeType }
                 *     
                 */
                public void setIdentificationTypeCode(DepartureTransportMeansIdentificationTypeCodeType value) {
                    this.identificationTypeCode = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureTransportMeansTypeCodeType }
                 *     
                 */
                public DepartureTransportMeansTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureTransportMeansTypeCodeType }
                 *     
                 */
                public void setTypeCode(DepartureTransportMeansTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the modeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureTransportMeansModeCodeType }
                 *     
                 */
                public DepartureTransportMeansModeCodeType getModeCode() {
                    return modeCode;
                }

                /**
                 * Sets the value of the modeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureTransportMeansModeCodeType }
                 *     
                 */
                public void setModeCode(DepartureTransportMeansModeCodeType value) {
                    this.modeCode = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsLocationTypeCodeType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "name",
                "id",
                "typeCode",
                "address"
            })
            public static class GoodsLocation {

                @XmlElement(name = "Name")
                protected GoodsLocationNameTextType name;
                @XmlElement(name = "ID")
                protected GoodsLocationIdentificationIDType id;
                @XmlElement(name = "TypeCode")
                protected GoodsLocationTypeCodeType typeCode;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.Consignment.GoodsLocation.Address address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodsLocationNameTextType }
                 *     
                 */
                public GoodsLocationNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodsLocationNameTextType }
                 *     
                 */
                public void setName(GoodsLocationNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodsLocationIdentificationIDType }
                 *     
                 */
                public GoodsLocationIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodsLocationIdentificationIDType }
                 *     
                 */
                public void setID(GoodsLocationIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodsLocationTypeCodeType }
                 *     
                 */
                public GoodsLocationTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodsLocationTypeCodeType }
                 *     
                 */
                public void setTypeCode(GoodsLocationTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.Consignment.GoodsLocation.Address }
                 *     
                 */
                public Declaration.GoodsShipment.Consignment.GoodsLocation.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.Consignment.GoodsLocation.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.Consignment.GoodsLocation.Address value) {
                    this.address = value;
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
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressTypeCodeType" minOccurs="0"/>
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "typeCode",
                    "cityName",
                    "countryCode",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "TypeCode")
                    protected AddressTypeCodeType typeCode;
                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the typeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressTypeCodeType }
                     *     
                     */
                    public AddressTypeCodeType getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * Sets the value of the typeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressTypeCodeType }
                     *     
                     */
                    public void setTypeCode(AddressTypeCodeType value) {
                        this.typeCode = value;
                    }

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}LoadingLocationIdentificationIDType" minOccurs="0"/>
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
                "name",
                "id"
            })
            public static class LoadingLocation {

                @XmlElement(name = "Name")
                protected LoadingLocationNameTextType name;
                @XmlElement(name = "ID")
                protected LoadingLocationIdentificationIDType id;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoadingLocationNameTextType }
                 *     
                 */
                public LoadingLocationNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoadingLocationNameTextType }
                 *     
                 */
                public void setName(LoadingLocationNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LoadingLocationIdentificationIDType }
                 *     
                 */
                public LoadingLocationIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LoadingLocationIdentificationIDType }
                 *     
                 */
                public void setID(LoadingLocationIdentificationIDType value) {
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
             *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Seal" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealSequenceNumericType"/>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealIdentificationIDType" minOccurs="0"/>
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
                "id",
                "seal"
            })
            public static class TransportEquipment {

                @XmlElement(name = "SequenceNumeric", required = true)
                protected BigDecimal sequenceNumeric;
                @XmlElement(name = "ID")
                protected TransportEquipmentIdentificationIDType id;
                @XmlElement(name = "Seal")
                protected List<Declaration.GoodsShipment.Consignment.TransportEquipment.Seal> seal;

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
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransportEquipmentIdentificationIDType }
                 *     
                 */
                public TransportEquipmentIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransportEquipmentIdentificationIDType }
                 *     
                 */
                public void setID(TransportEquipmentIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the seal property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the seal property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSeal().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.Consignment.TransportEquipment.Seal }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.Consignment.TransportEquipment.Seal> getSeal() {
                    if (seal == null) {
                        seal = new ArrayList<Declaration.GoodsShipment.Consignment.TransportEquipment.Seal>();
                    }
                    return this.seal;
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
                 *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealSequenceNumericType"/>
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SealIdentificationIDType" minOccurs="0"/>
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
                    "id"
                })
                public static class Seal {

                    @XmlElement(name = "SequenceNumeric", required = true)
                    protected BigDecimal sequenceNumeric;
                    @XmlElement(name = "ID")
                    protected SealIdentificationIDType id;

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
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SealIdentificationIDType }
                     *     
                     */
                    public SealIdentificationIDType getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SealIdentificationIDType }
                     *     
                     */
                    public void setID(SealIdentificationIDType value) {
                        this.id = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "name",
            "id",
            "address"
        })
        public static class Consignor {

            @XmlElement(name = "Name")
            protected ConsignorNameTextType name;
            @XmlElement(name = "ID")
            protected ConsignorIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Consignor.Address address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ConsignorNameTextType }
             *     
             */
            public ConsignorNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsignorNameTextType }
             *     
             */
            public void setName(ConsignorNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ConsignorIdentificationIDType }
             *     
             */
            public ConsignorIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsignorIdentificationIDType }
             *     
             */
            public void setID(ConsignorIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Consignor.Address }
             *     
             */
            public Declaration.GoodsShipment.Consignor.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Consignor.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Consignor.Address value) {
                this.address = value;
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
         *         &lt;element name="FreightChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationFreightChargeAmountType" minOccurs="0"/>
         *         &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
            "freightChargeAmount",
            "chargeDeduction"
        })
        public static class CustomsValuation {

            @XmlElement(name = "FreightChargeAmount")
            protected CustomsValuationFreightChargeAmountType freightChargeAmount;
            @XmlElement(name = "ChargeDeduction")
            protected List<Declaration.GoodsShipment.CustomsValuation.ChargeDeduction> chargeDeduction;

            /**
             * Gets the value of the freightChargeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link CustomsValuationFreightChargeAmountType }
             *     
             */
            public CustomsValuationFreightChargeAmountType getFreightChargeAmount() {
                return freightChargeAmount;
            }

            /**
             * Sets the value of the freightChargeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustomsValuationFreightChargeAmountType }
             *     
             */
            public void setFreightChargeAmount(CustomsValuationFreightChargeAmountType value) {
                this.freightChargeAmount = value;
            }

            /**
             * Gets the value of the chargeDeduction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the chargeDeduction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChargeDeduction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.CustomsValuation.ChargeDeduction }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.CustomsValuation.ChargeDeduction> getChargeDeduction() {
                if (chargeDeduction == null) {
                    chargeDeduction = new ArrayList<Declaration.GoodsShipment.CustomsValuation.ChargeDeduction>();
                }
                return this.chargeDeduction;
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
             *         &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
             *         &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
                "chargesTypeCode",
                "otherChargeDeductionAmount"
            })
            public static class ChargeDeduction {

                @XmlElement(name = "ChargesTypeCode")
                protected ChargeDeductionChargesTypeCodeType chargesTypeCode;
                @XmlElement(name = "OtherChargeDeductionAmount")
                protected ChargeDeductionOtherChargeDeductionAmountType otherChargeDeductionAmount;

                /**
                 * Gets the value of the chargesTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ChargeDeductionChargesTypeCodeType }
                 *     
                 */
                public ChargeDeductionChargesTypeCodeType getChargesTypeCode() {
                    return chargesTypeCode;
                }

                /**
                 * Sets the value of the chargesTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ChargeDeductionChargesTypeCodeType }
                 *     
                 */
                public void setChargesTypeCode(ChargeDeductionChargesTypeCodeType value) {
                    this.chargesTypeCode = value;
                }

                /**
                 * Gets the value of the otherChargeDeductionAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ChargeDeductionOtherChargeDeductionAmountType }
                 *     
                 */
                public ChargeDeductionOtherChargeDeductionAmountType getOtherChargeDeductionAmount() {
                    return otherChargeDeductionAmount;
                }

                /**
                 * Sets the value of the otherChargeDeductionAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ChargeDeductionOtherChargeDeductionAmountType }
                 *     
                 */
                public void setOtherChargeDeductionAmount(ChargeDeductionOtherChargeDeductionAmountType value) {
                    this.otherChargeDeductionAmount = value;
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
         *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
         *         &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
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
            "countryCode",
            "regionID"
        })
        public static class Destination {

            @XmlElement(name = "CountryCode")
            protected DestinationCountryCodeType countryCode;
            @XmlElement(name = "RegionID")
            protected DestinationRegionIDType regionID;

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link DestinationCountryCodeType }
             *     
             */
            public DestinationCountryCodeType getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link DestinationCountryCodeType }
             *     
             */
            public void setCountryCode(DestinationCountryCodeType value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the regionID property.
             * 
             * @return
             *     possible object is
             *     {@link DestinationRegionIDType }
             *     
             */
            public DestinationRegionIDType getRegionID() {
                return regionID;
            }

            /**
             * Sets the value of the regionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link DestinationRegionIDType }
             *     
             */
            public void setRegionID(DestinationRegionIDType value) {
                this.regionID = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
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
            "roleCode"
        })
        public static class DomesticDutyTaxParty {

            @XmlElement(name = "ID")
            protected DomesticDutyTaxPartyIdentificationIDType id;
            @XmlElement(name = "RoleCode")
            protected DomesticDutyTaxPartyRoleCodeType roleCode;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link DomesticDutyTaxPartyIdentificationIDType }
             *     
             */
            public DomesticDutyTaxPartyIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link DomesticDutyTaxPartyIdentificationIDType }
             *     
             */
            public void setID(DomesticDutyTaxPartyIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the roleCode property.
             * 
             * @return
             *     possible object is
             *     {@link DomesticDutyTaxPartyRoleCodeType }
             *     
             */
            public DomesticDutyTaxPartyRoleCodeType getRoleCode() {
                return roleCode;
            }

            /**
             * Sets the value of the roleCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link DomesticDutyTaxPartyRoleCodeType }
             *     
             */
            public void setRoleCode(DomesticDutyTaxPartyRoleCodeType value) {
                this.roleCode = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
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
        public static class ExportCountry {

            @XmlElement(name = "ID")
            protected ExportCountryCountryCodeType id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ExportCountryCountryCodeType }
             *     
             */
            public ExportCountryCountryCodeType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportCountryCountryCodeType }
             *     
             */
            public void setID(ExportCountryCountryCodeType value) {
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
         *         &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/>
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemSequenceNumericType"/>
         *         &lt;element name="StatisticalValueAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemStatisticalValueAmountType" minOccurs="0"/>
         *         &lt;element name="TransactionNatureCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentAgencyGoodsItemTransactionNatureCodeType" minOccurs="0"/>
         *         &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
         *                   &lt;element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentEffectiveDateTimeType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentNameTextType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="LPCOExemptionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentLPCOExemptionCodeType" minOccurs="0"/>
         *                   &lt;element name="Submitter" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
         *                             &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterRoleCodeType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="WriteOff" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffQuantityQuantityType" minOccurs="0"/>
         *                             &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffAmountAmountType" minOccurs="0"/>
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
         *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
         *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
         *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AEOMutualRecognitionParty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Buyer" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
         *         &lt;element name="Commodity" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommodityDescriptionTextType" minOccurs="0"/>
         *                   &lt;element name="Classification" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationIDType" minOccurs="0"/>
         *                             &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationTypeCodeType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DangerousGoods" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="UNDGID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DangerousGoodsUNDGIDType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
         *                             &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
         *                             &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
         *                             &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
         *                             &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
         *                             &lt;element name="QuotaOrderID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeQuotaOrderIDType" minOccurs="0"/>
         *                             &lt;element name="Payment" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentMethodCodeType" minOccurs="0"/>
         *                                       &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
         *                                       &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
         *                   &lt;element name="GoodsMeasure" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="GrossMassMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureGrossMassMeasureType" minOccurs="0"/>
         *                             &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureNetNetWeightMeasureType" minOccurs="0"/>
         *                             &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureTariffQuantityType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="InvoiceLine" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ItemChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceLineItemChargeAmountType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
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
         *         &lt;element name="Consignee" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
         *         &lt;element name="Consignor" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
         *         &lt;element name="CustomsValuation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationMethodCodeType" minOccurs="0"/>
         *                   &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
         *                             &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
         *         &lt;element name="Destination" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DomesticDutyTaxParty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ExportCountry" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GovernmentProcedure" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedureCurrentCodeType" minOccurs="0"/>
         *                   &lt;element name="PreviousCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedurePreviousCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Manufacturer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
         *         &lt;element name="Origin" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginRegionIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginTypeCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Packaging" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingSequenceNumericType" minOccurs="0"/>
         *                   &lt;element name="MarksNumbersID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingMarksNumbersIDType" minOccurs="0"/>
         *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingQuantityQuantityType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="PackingMaterialDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingPackingMaterialDescriptionTextType" minOccurs="0"/>
         *                   &lt;element name="LengthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingLengthMeasureType" minOccurs="0"/>
         *                   &lt;element name="WidthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingWidthMeasureType" minOccurs="0"/>
         *                   &lt;element name="HeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingHeightMeasureType" minOccurs="0"/>
         *                   &lt;element name="VolumeMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingVolumeMeasureType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
         *                   &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RefundRecipientParty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
         *         &lt;element name="Seller" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="Address" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                             &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                             &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
         *         &lt;element name="UCR" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ValuationAdjustment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ValuationAdjustmentAdditionCodeType" minOccurs="0"/>
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
            "customsValueAmount",
            "sequenceNumeric",
            "statisticalValueAmount",
            "transactionNatureCode",
            "additionalDocument",
            "additionalInformation",
            "aeoMutualRecognitionParty",
            "buyer",
            "commodity",
            "consignee",
            "consignor",
            "customsValuation",
            "destination",
            "domesticDutyTaxParty",
            "exportCountry",
            "governmentProcedure",
            "manufacturer",
            "origin",
            "packaging",
            "previousDocument",
            "refundRecipientParty",
            "seller",
            "ucr",
            "valuationAdjustment"
        })
        public static class GovernmentAgencyGoodsItem {

            @XmlElement(name = "CustomsValueAmount")
            protected GovernmentAgencyGoodsItemCustomsValueAmountType customsValueAmount;
            @XmlElement(name = "SequenceNumeric", required = true)
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "StatisticalValueAmount")
            protected GovernmentAgencyGoodsItemStatisticalValueAmountType statisticalValueAmount;
            @XmlElement(name = "TransactionNatureCode")
            protected GovernmentAgencyGoodsItemTransactionNatureCodeType transactionNatureCode;
            @XmlElement(name = "AdditionalDocument")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> additionalDocument;
            @XmlElement(name = "AdditionalInformation")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> additionalInformation;
            @XmlElement(name = "AEOMutualRecognitionParty")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty> aeoMutualRecognitionParty;
            @XmlElement(name = "Buyer")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer buyer;
            @XmlElement(name = "Commodity")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity commodity;
            @XmlElement(name = "Consignee")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee consignee;
            @XmlElement(name = "Consignor")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor consignor;
            @XmlElement(name = "CustomsValuation")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation customsValuation;
            @XmlElement(name = "Destination")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination destination;
            @XmlElement(name = "DomesticDutyTaxParty")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty> domesticDutyTaxParty;
            @XmlElement(name = "ExportCountry")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry exportCountry;
            @XmlElement(name = "GovernmentProcedure")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> governmentProcedure;
            @XmlElement(name = "Manufacturer")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer> manufacturer;
            @XmlElement(name = "Origin")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin> origin;
            @XmlElement(name = "Packaging")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging> packaging;
            @XmlElement(name = "PreviousDocument")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> previousDocument;
            @XmlElement(name = "RefundRecipientParty")
            protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty> refundRecipientParty;
            @XmlElement(name = "Seller")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller seller;
            @XmlElement(name = "UCR")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR ucr;
            @XmlElement(name = "ValuationAdjustment")
            protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment valuationAdjustment;

            /**
             * Gets the value of the customsValueAmount property.
             * 
             * @return
             *     possible object is
             *     {@link GovernmentAgencyGoodsItemCustomsValueAmountType }
             *     
             */
            public GovernmentAgencyGoodsItemCustomsValueAmountType getCustomsValueAmount() {
                return customsValueAmount;
            }

            /**
             * Sets the value of the customsValueAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link GovernmentAgencyGoodsItemCustomsValueAmountType }
             *     
             */
            public void setCustomsValueAmount(GovernmentAgencyGoodsItemCustomsValueAmountType value) {
                this.customsValueAmount = value;
            }

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
             * Gets the value of the statisticalValueAmount property.
             * 
             * @return
             *     possible object is
             *     {@link GovernmentAgencyGoodsItemStatisticalValueAmountType }
             *     
             */
            public GovernmentAgencyGoodsItemStatisticalValueAmountType getStatisticalValueAmount() {
                return statisticalValueAmount;
            }

            /**
             * Sets the value of the statisticalValueAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link GovernmentAgencyGoodsItemStatisticalValueAmountType }
             *     
             */
            public void setStatisticalValueAmount(GovernmentAgencyGoodsItemStatisticalValueAmountType value) {
                this.statisticalValueAmount = value;
            }

            /**
             * Gets the value of the transactionNatureCode property.
             * 
             * @return
             *     possible object is
             *     {@link GovernmentAgencyGoodsItemTransactionNatureCodeType }
             *     
             */
            public GovernmentAgencyGoodsItemTransactionNatureCodeType getTransactionNatureCode() {
                return transactionNatureCode;
            }

            /**
             * Sets the value of the transactionNatureCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link GovernmentAgencyGoodsItemTransactionNatureCodeType }
             *     
             */
            public void setTransactionNatureCode(GovernmentAgencyGoodsItemTransactionNatureCodeType value) {
                this.transactionNatureCode = value;
            }

            /**
             * Gets the value of the additionalDocument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalDocument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> getAdditionalDocument() {
                if (additionalDocument == null) {
                    additionalDocument = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument>();
                }
                return this.additionalDocument;
            }

            /**
             * Gets the value of the additionalInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> getAdditionalInformation() {
                if (additionalInformation == null) {
                    additionalInformation = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation>();
                }
                return this.additionalInformation;
            }

            /**
             * Gets the value of the aeoMutualRecognitionParty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the aeoMutualRecognitionParty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAEOMutualRecognitionParty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty> getAEOMutualRecognitionParty() {
                if (aeoMutualRecognitionParty == null) {
                    aeoMutualRecognitionParty = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty>();
                }
                return this.aeoMutualRecognitionParty;
            }

            /**
             * Gets the value of the buyer property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer getBuyer() {
                return buyer;
            }

            /**
             * Sets the value of the buyer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer }
             *     
             */
            public void setBuyer(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer value) {
                this.buyer = value;
            }

            /**
             * Gets the value of the commodity property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity getCommodity() {
                return commodity;
            }

            /**
             * Sets the value of the commodity property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
             *     
             */
            public void setCommodity(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity value) {
                this.commodity = value;
            }

            /**
             * Gets the value of the consignee property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee getConsignee() {
                return consignee;
            }

            /**
             * Sets the value of the consignee property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee }
             *     
             */
            public void setConsignee(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee value) {
                this.consignee = value;
            }

            /**
             * Gets the value of the consignor property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor getConsignor() {
                return consignor;
            }

            /**
             * Sets the value of the consignor property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor }
             *     
             */
            public void setConsignor(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor value) {
                this.consignor = value;
            }

            /**
             * Gets the value of the customsValuation property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation getCustomsValuation() {
                return customsValuation;
            }

            /**
             * Sets the value of the customsValuation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation }
             *     
             */
            public void setCustomsValuation(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation value) {
                this.customsValuation = value;
            }

            /**
             * Gets the value of the destination property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination getDestination() {
                return destination;
            }

            /**
             * Sets the value of the destination property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination }
             *     
             */
            public void setDestination(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination value) {
                this.destination = value;
            }

            /**
             * Gets the value of the domesticDutyTaxParty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the domesticDutyTaxParty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDomesticDutyTaxParty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty> getDomesticDutyTaxParty() {
                if (domesticDutyTaxParty == null) {
                    domesticDutyTaxParty = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty>();
                }
                return this.domesticDutyTaxParty;
            }

            /**
             * Gets the value of the exportCountry property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry getExportCountry() {
                return exportCountry;
            }

            /**
             * Sets the value of the exportCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry }
             *     
             */
            public void setExportCountry(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry value) {
                this.exportCountry = value;
            }

            /**
             * Gets the value of the governmentProcedure property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the governmentProcedure property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGovernmentProcedure().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> getGovernmentProcedure() {
                if (governmentProcedure == null) {
                    governmentProcedure = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure>();
                }
                return this.governmentProcedure;
            }

            /**
             * Gets the value of the manufacturer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the manufacturer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getManufacturer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer> getManufacturer() {
                if (manufacturer == null) {
                    manufacturer = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer>();
                }
                return this.manufacturer;
            }

            /**
             * Gets the value of the origin property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the origin property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrigin().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin> getOrigin() {
                if (origin == null) {
                    origin = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin>();
                }
                return this.origin;
            }

            /**
             * Gets the value of the packaging property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the packaging property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPackaging().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging> getPackaging() {
                if (packaging == null) {
                    packaging = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging>();
                }
                return this.packaging;
            }

            /**
             * Gets the value of the previousDocument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the previousDocument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPreviousDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> getPreviousDocument() {
                if (previousDocument == null) {
                    previousDocument = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument>();
                }
                return this.previousDocument;
            }

            /**
             * Gets the value of the refundRecipientParty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the refundRecipientParty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefundRecipientParty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty> getRefundRecipientParty() {
                if (refundRecipientParty == null) {
                    refundRecipientParty = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty>();
                }
                return this.refundRecipientParty;
            }

            /**
             * Gets the value of the seller property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller getSeller() {
                return seller;
            }

            /**
             * Sets the value of the seller property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller }
             *     
             */
            public void setSeller(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller value) {
                this.seller = value;
            }

            /**
             * Gets the value of the ucr property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR getUCR() {
                return ucr;
            }

            /**
             * Sets the value of the ucr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR }
             *     
             */
            public void setUCR(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR value) {
                this.ucr = value;
            }

            /**
             * Gets the value of the valuationAdjustment property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
             *     
             */
            public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment getValuationAdjustment() {
                return valuationAdjustment;
            }

            /**
             * Sets the value of the valuationAdjustment property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
             *     
             */
            public void setValuationAdjustment(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment value) {
                this.valuationAdjustment = value;
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
             *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
             *         &lt;element name="EffectiveDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentEffectiveDateTimeType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentNameTextType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentTypeCodeType" minOccurs="0"/>
             *         &lt;element name="LPCOExemptionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalDocumentLPCOExemptionCodeType" minOccurs="0"/>
             *         &lt;element name="Submitter" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
             *                   &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterRoleCodeType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="WriteOff" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffQuantityQuantityType" minOccurs="0"/>
             *                   &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffAmountAmountType" minOccurs="0"/>
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
                "categoryCode",
                "effectiveDateTime",
                "id",
                "name",
                "typeCode",
                "lpcoExemptionCode",
                "submitter",
                "writeOff"
            })
            public static class AdditionalDocument {

                @XmlElement(name = "CategoryCode")
                protected AdditionalDocumentCategoryCodeType categoryCode;
                @XmlElement(name = "EffectiveDateTime")
                protected AdditionalDocumentEffectiveDateTimeType effectiveDateTime;
                @XmlElement(name = "ID")
                protected AdditionalDocumentIdentificationIDType id;
                @XmlElement(name = "Name")
                protected AdditionalDocumentNameTextType name;
                @XmlElement(name = "TypeCode")
                protected AdditionalDocumentTypeCodeType typeCode;
                @XmlElement(name = "LPCOExemptionCode")
                protected AdditionalDocumentLPCOExemptionCodeType lpcoExemptionCode;
                @XmlElement(name = "Submitter")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter submitter;
                @XmlElement(name = "WriteOff")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff writeOff;

                /**
                 * Gets the value of the categoryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentCategoryCodeType }
                 *     
                 */
                public AdditionalDocumentCategoryCodeType getCategoryCode() {
                    return categoryCode;
                }

                /**
                 * Sets the value of the categoryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentCategoryCodeType }
                 *     
                 */
                public void setCategoryCode(AdditionalDocumentCategoryCodeType value) {
                    this.categoryCode = value;
                }

                /**
                 * Gets the value of the effectiveDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentEffectiveDateTimeType }
                 *     
                 */
                public AdditionalDocumentEffectiveDateTimeType getEffectiveDateTime() {
                    return effectiveDateTime;
                }

                /**
                 * Sets the value of the effectiveDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentEffectiveDateTimeType }
                 *     
                 */
                public void setEffectiveDateTime(AdditionalDocumentEffectiveDateTimeType value) {
                    this.effectiveDateTime = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentIdentificationIDType }
                 *     
                 */
                public AdditionalDocumentIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentIdentificationIDType }
                 *     
                 */
                public void setID(AdditionalDocumentIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentNameTextType }
                 *     
                 */
                public AdditionalDocumentNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentNameTextType }
                 *     
                 */
                public void setName(AdditionalDocumentNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentTypeCodeType }
                 *     
                 */
                public AdditionalDocumentTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentTypeCodeType }
                 *     
                 */
                public void setTypeCode(AdditionalDocumentTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the lpcoExemptionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentLPCOExemptionCodeType }
                 *     
                 */
                public AdditionalDocumentLPCOExemptionCodeType getLPCOExemptionCode() {
                    return lpcoExemptionCode;
                }

                /**
                 * Sets the value of the lpcoExemptionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentLPCOExemptionCodeType }
                 *     
                 */
                public void setLPCOExemptionCode(AdditionalDocumentLPCOExemptionCodeType value) {
                    this.lpcoExemptionCode = value;
                }

                /**
                 * Gets the value of the submitter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter getSubmitter() {
                    return submitter;
                }

                /**
                 * Sets the value of the submitter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter }
                 *     
                 */
                public void setSubmitter(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter value) {
                    this.submitter = value;
                }

                /**
                 * Gets the value of the writeOff property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff getWriteOff() {
                    return writeOff;
                }

                /**
                 * Sets the value of the writeOff property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff }
                 *     
                 */
                public void setWriteOff(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff value) {
                    this.writeOff = value;
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
                 *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
                 *         &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterRoleCodeType" minOccurs="0"/>
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
                    "name",
                    "roleCode"
                })
                public static class Submitter {

                    @XmlElement(name = "Name")
                    protected SubmitterNameTextType name;
                    @XmlElement(name = "RoleCode")
                    protected SubmitterRoleCodeType roleCode;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SubmitterNameTextType }
                     *     
                     */
                    public SubmitterNameTextType getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SubmitterNameTextType }
                     *     
                     */
                    public void setName(SubmitterNameTextType value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the roleCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SubmitterRoleCodeType }
                     *     
                     */
                    public SubmitterRoleCodeType getRoleCode() {
                        return roleCode;
                    }

                    /**
                     * Sets the value of the roleCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SubmitterRoleCodeType }
                     *     
                     */
                    public void setRoleCode(SubmitterRoleCodeType value) {
                        this.roleCode = value;
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
                 *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffQuantityQuantityType" minOccurs="0"/>
                 *         &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WriteOffAmountAmountType" minOccurs="0"/>
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
                    "quantityQuantity",
                    "amountAmount"
                })
                public static class WriteOff {

                    @XmlElement(name = "QuantityQuantity")
                    protected WriteOffQuantityQuantityType quantityQuantity;
                    @XmlElement(name = "AmountAmount")
                    protected WriteOffAmountAmountType amountAmount;

                    /**
                     * Gets the value of the quantityQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link WriteOffQuantityQuantityType }
                     *     
                     */
                    public WriteOffQuantityQuantityType getQuantityQuantity() {
                        return quantityQuantity;
                    }

                    /**
                     * Sets the value of the quantityQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link WriteOffQuantityQuantityType }
                     *     
                     */
                    public void setQuantityQuantity(WriteOffQuantityQuantityType value) {
                        this.quantityQuantity = value;
                    }

                    /**
                     * Gets the value of the amountAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link WriteOffAmountAmountType }
                     *     
                     */
                    public WriteOffAmountAmountType getAmountAmount() {
                        return amountAmount;
                    }

                    /**
                     * Sets the value of the amountAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link WriteOffAmountAmountType }
                     *     
                     */
                    public void setAmountAmount(WriteOffAmountAmountType value) {
                        this.amountAmount = value;
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
             *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementCodeType" minOccurs="0"/>
             *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
             *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
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
                "statementTypeCode"
            })
            public static class AdditionalInformation {

                @XmlElement(name = "StatementCode")
                protected AdditionalInformationStatementCodeType statementCode;
                @XmlElement(name = "StatementDescription")
                protected AdditionalInformationStatementDescriptionTextType statementDescription;
                @XmlElement(name = "StatementTypeCode")
                protected AdditionalInformationStatementTypeCodeType statementTypeCode;

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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AEOMutualRecognitionPartyRoleCodeType" minOccurs="0"/>
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
                "roleCode"
            })
            public static class AEOMutualRecognitionParty {

                @XmlElement(name = "ID")
                protected AEOMutualRecognitionPartyIdentificationIDType id;
                @XmlElement(name = "RoleCode")
                protected AEOMutualRecognitionPartyRoleCodeType roleCode;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AEOMutualRecognitionPartyIdentificationIDType }
                 *     
                 */
                public AEOMutualRecognitionPartyIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AEOMutualRecognitionPartyIdentificationIDType }
                 *     
                 */
                public void setID(AEOMutualRecognitionPartyIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the roleCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AEOMutualRecognitionPartyRoleCodeType }
                 *     
                 */
                public AEOMutualRecognitionPartyRoleCodeType getRoleCode() {
                    return roleCode;
                }

                /**
                 * Sets the value of the roleCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AEOMutualRecognitionPartyRoleCodeType }
                 *     
                 */
                public void setRoleCode(AEOMutualRecognitionPartyRoleCodeType value) {
                    this.roleCode = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}BuyerIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
                "name",
                "id",
                "address",
                "contact",
                "communication"
            })
            public static class Buyer {

                @XmlElement(name = "Name")
                protected BuyerNameTextType name;
                @XmlElement(name = "ID")
                protected BuyerIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address address;
                @XmlElement(name = "Contact")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact> contact;
                @XmlElement(name = "Communication")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication> communication;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BuyerNameTextType }
                 *     
                 */
                public BuyerNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BuyerNameTextType }
                 *     
                 */
                public void setName(BuyerNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BuyerIdentificationIDType }
                 *     
                 */
                public BuyerIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BuyerIdentificationIDType }
                 *     
                 */
                public void setID(BuyerIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the contact property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contact property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContact().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact> getContact() {
                    if (contact == null) {
                        contact = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact>();
                    }
                    return this.contact;
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
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication> getCommunication() {
                    if (communication == null) {
                        communication = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication>();
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
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
                 *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
                    "name"
                })
                public static class Contact {

                    @XmlElement(name = "Name")
                    protected ContactNameTextType name;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ContactNameTextType }
                     *     
                     */
                    public ContactNameTextType getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ContactNameTextType }
                     *     
                     */
                    public void setName(ContactNameTextType value) {
                        this.name = value;
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
             *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommodityDescriptionTextType" minOccurs="0"/>
             *         &lt;element name="Classification" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationIDType" minOccurs="0"/>
             *                   &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationTypeCodeType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DangerousGoods" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="UNDGID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DangerousGoodsUNDGIDType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DutyTaxFee" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
             *                   &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
             *                   &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
             *                   &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
             *                   &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
             *                   &lt;element name="QuotaOrderID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeQuotaOrderIDType" minOccurs="0"/>
             *                   &lt;element name="Payment" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentMethodCodeType" minOccurs="0"/>
             *                             &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
             *                             &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
             *         &lt;element name="GoodsMeasure" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="GrossMassMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureGrossMassMeasureType" minOccurs="0"/>
             *                   &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureNetNetWeightMeasureType" minOccurs="0"/>
             *                   &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureTariffQuantityType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="InvoiceLine" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ItemChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceLineItemChargeAmountType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TransportEquipment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
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
                "classification",
                "dangerousGoods",
                "dutyTaxFee",
                "goodsMeasure",
                "invoiceLine",
                "transportEquipment"
            })
            public static class Commodity {

                @XmlElement(name = "Description")
                protected CommodityDescriptionTextType description;
                @XmlElement(name = "Classification")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification> classification;
                @XmlElement(name = "DangerousGoods")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods> dangerousGoods;
                @XmlElement(name = "DutyTaxFee")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee> dutyTaxFee;
                @XmlElement(name = "GoodsMeasure")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure goodsMeasure;
                @XmlElement(name = "InvoiceLine")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine invoiceLine;
                @XmlElement(name = "TransportEquipment")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment> transportEquipment;

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommodityDescriptionTextType }
                 *     
                 */
                public CommodityDescriptionTextType getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommodityDescriptionTextType }
                 *     
                 */
                public void setDescription(CommodityDescriptionTextType value) {
                    this.description = value;
                }

                /**
                 * Gets the value of the classification property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the classification property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getClassification().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification> getClassification() {
                    if (classification == null) {
                        classification = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification>();
                    }
                    return this.classification;
                }

                /**
                 * Gets the value of the dangerousGoods property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dangerousGoods property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDangerousGoods().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods> getDangerousGoods() {
                    if (dangerousGoods == null) {
                        dangerousGoods = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods>();
                    }
                    return this.dangerousGoods;
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
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee> getDutyTaxFee() {
                    if (dutyTaxFee == null) {
                        dutyTaxFee = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee>();
                    }
                    return this.dutyTaxFee;
                }

                /**
                 * Gets the value of the goodsMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure getGoodsMeasure() {
                    return goodsMeasure;
                }

                /**
                 * Sets the value of the goodsMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure }
                 *     
                 */
                public void setGoodsMeasure(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure value) {
                    this.goodsMeasure = value;
                }

                /**
                 * Gets the value of the invoiceLine property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine getInvoiceLine() {
                    return invoiceLine;
                }

                /**
                 * Sets the value of the invoiceLine property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine }
                 *     
                 */
                public void setInvoiceLine(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine value) {
                    this.invoiceLine = value;
                }

                /**
                 * Gets the value of the transportEquipment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTransportEquipment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment> getTransportEquipment() {
                    if (transportEquipment == null) {
                        transportEquipment = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment>();
                    }
                    return this.transportEquipment;
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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationIDType" minOccurs="0"/>
                 *         &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ClassificationIdentificationTypeCodeType" minOccurs="0"/>
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
                    "identificationTypeCode"
                })
                public static class Classification {

                    @XmlElement(name = "ID")
                    protected ClassificationIdentificationIDType id;
                    @XmlElement(name = "IdentificationTypeCode")
                    protected ClassificationIdentificationTypeCodeType identificationTypeCode;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ClassificationIdentificationIDType }
                     *     
                     */
                    public ClassificationIdentificationIDType getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ClassificationIdentificationIDType }
                     *     
                     */
                    public void setID(ClassificationIdentificationIDType value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the identificationTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ClassificationIdentificationTypeCodeType }
                     *     
                     */
                    public ClassificationIdentificationTypeCodeType getIdentificationTypeCode() {
                        return identificationTypeCode;
                    }

                    /**
                     * Sets the value of the identificationTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ClassificationIdentificationTypeCodeType }
                     *     
                     */
                    public void setIdentificationTypeCode(ClassificationIdentificationTypeCodeType value) {
                        this.identificationTypeCode = value;
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
                 *         &lt;element name="UNDGID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DangerousGoodsUNDGIDType" minOccurs="0"/>
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
                    "undgid"
                })
                public static class DangerousGoods {

                    @XmlElement(name = "UNDGID")
                    protected DangerousGoodsUNDGIDType undgid;

                    /**
                     * Gets the value of the undgid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DangerousGoodsUNDGIDType }
                     *     
                     */
                    public DangerousGoodsUNDGIDType getUNDGID() {
                        return undgid;
                    }

                    /**
                     * Sets the value of the undgid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DangerousGoodsUNDGIDType }
                     *     
                     */
                    public void setUNDGID(DangerousGoodsUNDGIDType value) {
                        this.undgid = value;
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
                 *         &lt;element name="AdValoremTaxBaseAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeAdValoremTaxBaseAmountType" minOccurs="0"/>
                 *         &lt;element name="DeductAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDeductAmountType" minOccurs="0"/>
                 *         &lt;element name="DutyRegimeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeDutyRegimeCodeType" minOccurs="0"/>
                 *         &lt;element name="SpecificTaxBaseQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeSpecificTaxBaseQuantityType" minOccurs="0"/>
                 *         &lt;element name="TaxRateNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTaxRateNumericType" minOccurs="0"/>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeTypeCodeType" minOccurs="0"/>
                 *         &lt;element name="QuotaOrderID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DutyTaxFeeQuotaOrderIDType" minOccurs="0"/>
                 *         &lt;element name="Payment" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentMethodCodeType" minOccurs="0"/>
                 *                   &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                 *                   &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
                    "quotaOrderID",
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
                    @XmlElement(name = "QuotaOrderID")
                    protected DutyTaxFeeQuotaOrderIDType quotaOrderID;
                    @XmlElement(name = "Payment")
                    protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment payment;

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
                     * Gets the value of the quotaOrderID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DutyTaxFeeQuotaOrderIDType }
                     *     
                     */
                    public DutyTaxFeeQuotaOrderIDType getQuotaOrderID() {
                        return quotaOrderID;
                    }

                    /**
                     * Sets the value of the quotaOrderID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DutyTaxFeeQuotaOrderIDType }
                     *     
                     */
                    public void setQuotaOrderID(DutyTaxFeeQuotaOrderIDType value) {
                        this.quotaOrderID = value;
                    }

                    /**
                     * Gets the value of the payment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
                     *     
                     */
                    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment getPayment() {
                        return payment;
                    }

                    /**
                     * Sets the value of the payment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
                     *     
                     */
                    public void setPayment(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment value) {
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
                     *         &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentMethodCodeType" minOccurs="0"/>
                     *         &lt;element name="TaxAssessedAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentTaxAssessedAmountType" minOccurs="0"/>
                     *         &lt;element name="PaymentAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PaymentPaymentAmountType" minOccurs="0"/>
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
                        "methodCode",
                        "taxAssessedAmount",
                        "paymentAmount"
                    })
                    public static class Payment {

                        @XmlElement(name = "MethodCode")
                        protected PaymentMethodCodeType methodCode;
                        @XmlElement(name = "TaxAssessedAmount")
                        protected PaymentTaxAssessedAmountType taxAssessedAmount;
                        @XmlElement(name = "PaymentAmount")
                        protected PaymentPaymentAmountType paymentAmount;

                        /**
                         * Gets the value of the methodCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PaymentMethodCodeType }
                         *     
                         */
                        public PaymentMethodCodeType getMethodCode() {
                            return methodCode;
                        }

                        /**
                         * Sets the value of the methodCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PaymentMethodCodeType }
                         *     
                         */
                        public void setMethodCode(PaymentMethodCodeType value) {
                            this.methodCode = value;
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
                 *         &lt;element name="GrossMassMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureGrossMassMeasureType" minOccurs="0"/>
                 *         &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureNetNetWeightMeasureType" minOccurs="0"/>
                 *         &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GoodsMeasureTariffQuantityType" minOccurs="0"/>
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
                    "grossMassMeasure",
                    "netNetWeightMeasure",
                    "tariffQuantity"
                })
                public static class GoodsMeasure {

                    @XmlElement(name = "GrossMassMeasure")
                    protected GoodsMeasureGrossMassMeasureType grossMassMeasure;
                    @XmlElement(name = "NetNetWeightMeasure")
                    protected GoodsMeasureNetNetWeightMeasureType netNetWeightMeasure;
                    @XmlElement(name = "TariffQuantity")
                    protected GoodsMeasureTariffQuantityType tariffQuantity;

                    /**
                     * Gets the value of the grossMassMeasure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodsMeasureGrossMassMeasureType }
                     *     
                     */
                    public GoodsMeasureGrossMassMeasureType getGrossMassMeasure() {
                        return grossMassMeasure;
                    }

                    /**
                     * Sets the value of the grossMassMeasure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodsMeasureGrossMassMeasureType }
                     *     
                     */
                    public void setGrossMassMeasure(GoodsMeasureGrossMassMeasureType value) {
                        this.grossMassMeasure = value;
                    }

                    /**
                     * Gets the value of the netNetWeightMeasure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodsMeasureNetNetWeightMeasureType }
                     *     
                     */
                    public GoodsMeasureNetNetWeightMeasureType getNetNetWeightMeasure() {
                        return netNetWeightMeasure;
                    }

                    /**
                     * Sets the value of the netNetWeightMeasure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodsMeasureNetNetWeightMeasureType }
                     *     
                     */
                    public void setNetNetWeightMeasure(GoodsMeasureNetNetWeightMeasureType value) {
                        this.netNetWeightMeasure = value;
                    }

                    /**
                     * Gets the value of the tariffQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodsMeasureTariffQuantityType }
                     *     
                     */
                    public GoodsMeasureTariffQuantityType getTariffQuantity() {
                        return tariffQuantity;
                    }

                    /**
                     * Sets the value of the tariffQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodsMeasureTariffQuantityType }
                     *     
                     */
                    public void setTariffQuantity(GoodsMeasureTariffQuantityType value) {
                        this.tariffQuantity = value;
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
                 *         &lt;element name="ItemChargeAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceLineItemChargeAmountType" minOccurs="0"/>
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
                    "itemChargeAmount"
                })
                public static class InvoiceLine {

                    @XmlElement(name = "ItemChargeAmount")
                    protected InvoiceLineItemChargeAmountType itemChargeAmount;

                    /**
                     * Gets the value of the itemChargeAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InvoiceLineItemChargeAmountType }
                     *     
                     */
                    public InvoiceLineItemChargeAmountType getItemChargeAmount() {
                        return itemChargeAmount;
                    }

                    /**
                     * Sets the value of the itemChargeAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InvoiceLineItemChargeAmountType }
                     *     
                     */
                    public void setItemChargeAmount(InvoiceLineItemChargeAmountType value) {
                        this.itemChargeAmount = value;
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
                 *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentSequenceNumericType"/>
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TransportEquipmentIdentificationIDType" minOccurs="0"/>
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
                    "id"
                })
                public static class TransportEquipment {

                    @XmlElement(name = "SequenceNumeric", required = true)
                    protected BigDecimal sequenceNumeric;
                    @XmlElement(name = "ID")
                    protected TransportEquipmentIdentificationIDType id;

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
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TransportEquipmentIdentificationIDType }
                     *     
                     */
                    public TransportEquipmentIdentificationIDType getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TransportEquipmentIdentificationIDType }
                     *     
                     */
                    public void setID(TransportEquipmentIdentificationIDType value) {
                        this.id = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsigneeIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "name",
                "id",
                "address"
            })
            public static class Consignee {

                @XmlElement(name = "Name")
                protected ConsigneeNameTextType name;
                @XmlElement(name = "ID")
                protected ConsigneeIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsigneeNameTextType }
                 *     
                 */
                public ConsigneeNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsigneeNameTextType }
                 *     
                 */
                public void setName(ConsigneeNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsigneeIdentificationIDType }
                 *     
                 */
                public ConsigneeIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsigneeIdentificationIDType }
                 *     
                 */
                public void setID(ConsigneeIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address value) {
                    this.address = value;
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
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ConsignorIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "name",
                "id",
                "address"
            })
            public static class Consignor {

                @XmlElement(name = "Name")
                protected ConsignorNameTextType name;
                @XmlElement(name = "ID")
                protected ConsignorIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsignorNameTextType }
                 *     
                 */
                public ConsignorNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsignorNameTextType }
                 *     
                 */
                public void setName(ConsignorNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsignorIdentificationIDType }
                 *     
                 */
                public ConsignorIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsignorIdentificationIDType }
                 *     
                 */
                public void setID(ConsignorIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address value) {
                    this.address = value;
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
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
             *         &lt;element name="MethodCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CustomsValuationMethodCodeType" minOccurs="0"/>
             *         &lt;element name="ChargeDeduction" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
             *                   &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
                "methodCode",
                "chargeDeduction"
            })
            public static class CustomsValuation {

                @XmlElement(name = "MethodCode")
                protected CustomsValuationMethodCodeType methodCode;
                @XmlElement(name = "ChargeDeduction")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction> chargeDeduction;

                /**
                 * Gets the value of the methodCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CustomsValuationMethodCodeType }
                 *     
                 */
                public CustomsValuationMethodCodeType getMethodCode() {
                    return methodCode;
                }

                /**
                 * Sets the value of the methodCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CustomsValuationMethodCodeType }
                 *     
                 */
                public void setMethodCode(CustomsValuationMethodCodeType value) {
                    this.methodCode = value;
                }

                /**
                 * Gets the value of the chargeDeduction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chargeDeduction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChargeDeduction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction> getChargeDeduction() {
                    if (chargeDeduction == null) {
                        chargeDeduction = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction>();
                    }
                    return this.chargeDeduction;
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
                 *         &lt;element name="ChargesTypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionChargesTypeCodeType" minOccurs="0"/>
                 *         &lt;element name="OtherChargeDeductionAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ChargeDeductionOtherChargeDeductionAmountType" minOccurs="0"/>
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
                    "chargesTypeCode",
                    "otherChargeDeductionAmount"
                })
                public static class ChargeDeduction {

                    @XmlElement(name = "ChargesTypeCode")
                    protected ChargeDeductionChargesTypeCodeType chargesTypeCode;
                    @XmlElement(name = "OtherChargeDeductionAmount")
                    protected ChargeDeductionOtherChargeDeductionAmountType otherChargeDeductionAmount;

                    /**
                     * Gets the value of the chargesTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ChargeDeductionChargesTypeCodeType }
                     *     
                     */
                    public ChargeDeductionChargesTypeCodeType getChargesTypeCode() {
                        return chargesTypeCode;
                    }

                    /**
                     * Sets the value of the chargesTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ChargeDeductionChargesTypeCodeType }
                     *     
                     */
                    public void setChargesTypeCode(ChargeDeductionChargesTypeCodeType value) {
                        this.chargesTypeCode = value;
                    }

                    /**
                     * Gets the value of the otherChargeDeductionAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ChargeDeductionOtherChargeDeductionAmountType }
                     *     
                     */
                    public ChargeDeductionOtherChargeDeductionAmountType getOtherChargeDeductionAmount() {
                        return otherChargeDeductionAmount;
                    }

                    /**
                     * Sets the value of the otherChargeDeductionAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ChargeDeductionOtherChargeDeductionAmountType }
                     *     
                     */
                    public void setOtherChargeDeductionAmount(ChargeDeductionOtherChargeDeductionAmountType value) {
                        this.otherChargeDeductionAmount = value;
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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationCountryCodeType" minOccurs="0"/>
             *         &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DestinationRegionIDType" minOccurs="0"/>
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
                "countryCode",
                "regionID"
            })
            public static class Destination {

                @XmlElement(name = "CountryCode")
                protected DestinationCountryCodeType countryCode;
                @XmlElement(name = "RegionID")
                protected DestinationRegionIDType regionID;

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DestinationCountryCodeType }
                 *     
                 */
                public DestinationCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DestinationCountryCodeType }
                 *     
                 */
                public void setCountryCode(DestinationCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the regionID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DestinationRegionIDType }
                 *     
                 */
                public DestinationRegionIDType getRegionID() {
                    return regionID;
                }

                /**
                 * Sets the value of the regionID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DestinationRegionIDType }
                 *     
                 */
                public void setRegionID(DestinationRegionIDType value) {
                    this.regionID = value;
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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="RoleCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}DomesticDutyTaxPartyRoleCodeType" minOccurs="0"/>
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
                "roleCode"
            })
            public static class DomesticDutyTaxParty {

                @XmlElement(name = "ID")
                protected DomesticDutyTaxPartyIdentificationIDType id;
                @XmlElement(name = "RoleCode")
                protected DomesticDutyTaxPartyRoleCodeType roleCode;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DomesticDutyTaxPartyIdentificationIDType }
                 *     
                 */
                public DomesticDutyTaxPartyIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DomesticDutyTaxPartyIdentificationIDType }
                 *     
                 */
                public void setID(DomesticDutyTaxPartyIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the roleCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DomesticDutyTaxPartyRoleCodeType }
                 *     
                 */
                public DomesticDutyTaxPartyRoleCodeType getRoleCode() {
                    return roleCode;
                }

                /**
                 * Sets the value of the roleCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DomesticDutyTaxPartyRoleCodeType }
                 *     
                 */
                public void setRoleCode(DomesticDutyTaxPartyRoleCodeType value) {
                    this.roleCode = value;
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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ExportCountryCountryCodeType" minOccurs="0"/>
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
            public static class ExportCountry {

                @XmlElement(name = "ID")
                protected ExportCountryCountryCodeType id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ExportCountryCountryCodeType }
                 *     
                 */
                public ExportCountryCountryCodeType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExportCountryCountryCodeType }
                 *     
                 */
                public void setID(ExportCountryCountryCodeType value) {
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
             *         &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedureCurrentCodeType" minOccurs="0"/>
             *         &lt;element name="PreviousCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GovernmentProcedurePreviousCodeType" minOccurs="0"/>
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
                "currentCode",
                "previousCode"
            })
            public static class GovernmentProcedure {

                @XmlElement(name = "CurrentCode")
                protected GovernmentProcedureCurrentCodeType currentCode;
                @XmlElement(name = "PreviousCode")
                protected GovernmentProcedurePreviousCodeType previousCode;

                /**
                 * Gets the value of the currentCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GovernmentProcedureCurrentCodeType }
                 *     
                 */
                public GovernmentProcedureCurrentCodeType getCurrentCode() {
                    return currentCode;
                }

                /**
                 * Sets the value of the currentCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GovernmentProcedureCurrentCodeType }
                 *     
                 */
                public void setCurrentCode(GovernmentProcedureCurrentCodeType value) {
                    this.currentCode = value;
                }

                /**
                 * Gets the value of the previousCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GovernmentProcedurePreviousCodeType }
                 *     
                 */
                public GovernmentProcedurePreviousCodeType getPreviousCode() {
                    return previousCode;
                }

                /**
                 * Sets the value of the previousCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GovernmentProcedurePreviousCodeType }
                 *     
                 */
                public void setPreviousCode(GovernmentProcedurePreviousCodeType value) {
                    this.previousCode = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ManufacturerIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "name",
                "id",
                "address"
            })
            public static class Manufacturer {

                @XmlElement(name = "Name")
                protected ManufacturerNameTextType name;
                @XmlElement(name = "ID")
                protected ManufacturerIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer.Address address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ManufacturerNameTextType }
                 *     
                 */
                public ManufacturerNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ManufacturerNameTextType }
                 *     
                 */
                public void setName(ManufacturerNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ManufacturerIdentificationIDType }
                 *     
                 */
                public ManufacturerIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ManufacturerIdentificationIDType }
                 *     
                 */
                public void setID(ManufacturerIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer.Address }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Manufacturer.Address value) {
                    this.address = value;
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
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginCountryCodeType" minOccurs="0"/>
             *         &lt;element name="RegionID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginRegionIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}OriginTypeCodeType" minOccurs="0"/>
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
                "countryCode",
                "regionID",
                "typeCode"
            })
            public static class Origin {

                @XmlElement(name = "CountryCode")
                protected OriginCountryCodeType countryCode;
                @XmlElement(name = "RegionID")
                protected OriginRegionIDType regionID;
                @XmlElement(name = "TypeCode")
                protected OriginTypeCodeType typeCode;

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginCountryCodeType }
                 *     
                 */
                public OriginCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginCountryCodeType }
                 *     
                 */
                public void setCountryCode(OriginCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the regionID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginRegionIDType }
                 *     
                 */
                public OriginRegionIDType getRegionID() {
                    return regionID;
                }

                /**
                 * Sets the value of the regionID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginRegionIDType }
                 *     
                 */
                public void setRegionID(OriginRegionIDType value) {
                    this.regionID = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginTypeCodeType }
                 *     
                 */
                public OriginTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginTypeCodeType }
                 *     
                 */
                public void setTypeCode(OriginTypeCodeType value) {
                    this.typeCode = value;
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
             *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingSequenceNumericType" minOccurs="0"/>
             *         &lt;element name="MarksNumbersID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingMarksNumbersIDType" minOccurs="0"/>
             *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingQuantityQuantityType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingTypeCodeType" minOccurs="0"/>
             *         &lt;element name="PackingMaterialDescription" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingPackingMaterialDescriptionTextType" minOccurs="0"/>
             *         &lt;element name="LengthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingLengthMeasureType" minOccurs="0"/>
             *         &lt;element name="WidthMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingWidthMeasureType" minOccurs="0"/>
             *         &lt;element name="HeightMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingHeightMeasureType" minOccurs="0"/>
             *         &lt;element name="VolumeMeasure" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PackagingVolumeMeasureType" minOccurs="0"/>
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
                "marksNumbersID",
                "quantityQuantity",
                "typeCode",
                "packingMaterialDescription",
                "lengthMeasure",
                "widthMeasure",
                "heightMeasure",
                "volumeMeasure"
            })
            public static class Packaging {

                @XmlElement(name = "SequenceNumeric")
                protected BigDecimal sequenceNumeric;
                @XmlElement(name = "MarksNumbersID")
                protected PackagingMarksNumbersIDType marksNumbersID;
                @XmlElement(name = "QuantityQuantity")
                protected PackagingQuantityQuantityType quantityQuantity;
                @XmlElement(name = "TypeCode")
                protected PackagingTypeCodeType typeCode;
                @XmlElement(name = "PackingMaterialDescription")
                protected PackagingPackingMaterialDescriptionTextType packingMaterialDescription;
                @XmlElement(name = "LengthMeasure")
                protected PackagingLengthMeasureType lengthMeasure;
                @XmlElement(name = "WidthMeasure")
                protected PackagingWidthMeasureType widthMeasure;
                @XmlElement(name = "HeightMeasure")
                protected PackagingHeightMeasureType heightMeasure;
                @XmlElement(name = "VolumeMeasure")
                protected PackagingVolumeMeasureType volumeMeasure;

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
                 * Gets the value of the marksNumbersID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingMarksNumbersIDType }
                 *     
                 */
                public PackagingMarksNumbersIDType getMarksNumbersID() {
                    return marksNumbersID;
                }

                /**
                 * Sets the value of the marksNumbersID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingMarksNumbersIDType }
                 *     
                 */
                public void setMarksNumbersID(PackagingMarksNumbersIDType value) {
                    this.marksNumbersID = value;
                }

                /**
                 * Gets the value of the quantityQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingQuantityQuantityType }
                 *     
                 */
                public PackagingQuantityQuantityType getQuantityQuantity() {
                    return quantityQuantity;
                }

                /**
                 * Sets the value of the quantityQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingQuantityQuantityType }
                 *     
                 */
                public void setQuantityQuantity(PackagingQuantityQuantityType value) {
                    this.quantityQuantity = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingTypeCodeType }
                 *     
                 */
                public PackagingTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingTypeCodeType }
                 *     
                 */
                public void setTypeCode(PackagingTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the packingMaterialDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingPackingMaterialDescriptionTextType }
                 *     
                 */
                public PackagingPackingMaterialDescriptionTextType getPackingMaterialDescription() {
                    return packingMaterialDescription;
                }

                /**
                 * Sets the value of the packingMaterialDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingPackingMaterialDescriptionTextType }
                 *     
                 */
                public void setPackingMaterialDescription(PackagingPackingMaterialDescriptionTextType value) {
                    this.packingMaterialDescription = value;
                }

                /**
                 * Gets the value of the lengthMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingLengthMeasureType }
                 *     
                 */
                public PackagingLengthMeasureType getLengthMeasure() {
                    return lengthMeasure;
                }

                /**
                 * Sets the value of the lengthMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingLengthMeasureType }
                 *     
                 */
                public void setLengthMeasure(PackagingLengthMeasureType value) {
                    this.lengthMeasure = value;
                }

                /**
                 * Gets the value of the widthMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingWidthMeasureType }
                 *     
                 */
                public PackagingWidthMeasureType getWidthMeasure() {
                    return widthMeasure;
                }

                /**
                 * Sets the value of the widthMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingWidthMeasureType }
                 *     
                 */
                public void setWidthMeasure(PackagingWidthMeasureType value) {
                    this.widthMeasure = value;
                }

                /**
                 * Gets the value of the heightMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingHeightMeasureType }
                 *     
                 */
                public PackagingHeightMeasureType getHeightMeasure() {
                    return heightMeasure;
                }

                /**
                 * Sets the value of the heightMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingHeightMeasureType }
                 *     
                 */
                public void setHeightMeasure(PackagingHeightMeasureType value) {
                    this.heightMeasure = value;
                }

                /**
                 * Gets the value of the volumeMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackagingVolumeMeasureType }
                 *     
                 */
                public PackagingVolumeMeasureType getVolumeMeasure() {
                    return volumeMeasure;
                }

                /**
                 * Sets the value of the volumeMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackagingVolumeMeasureType }
                 *     
                 */
                public void setVolumeMeasure(PackagingVolumeMeasureType value) {
                    this.volumeMeasure = value;
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
             *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
             *         &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
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
                "categoryCode",
                "id",
                "typeCode",
                "lineNumeric"
            })
            public static class PreviousDocument {

                @XmlElement(name = "CategoryCode")
                protected PreviousDocumentCategoryCodeType categoryCode;
                @XmlElement(name = "ID")
                protected PreviousDocumentIdentificationIDType id;
                @XmlElement(name = "TypeCode")
                protected PreviousDocumentTypeCodeType typeCode;
                @XmlElement(name = "LineNumeric")
                protected BigDecimal lineNumeric;

                /**
                 * Gets the value of the categoryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PreviousDocumentCategoryCodeType }
                 *     
                 */
                public PreviousDocumentCategoryCodeType getCategoryCode() {
                    return categoryCode;
                }

                /**
                 * Sets the value of the categoryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PreviousDocumentCategoryCodeType }
                 *     
                 */
                public void setCategoryCode(PreviousDocumentCategoryCodeType value) {
                    this.categoryCode = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PreviousDocumentIdentificationIDType }
                 *     
                 */
                public PreviousDocumentIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PreviousDocumentIdentificationIDType }
                 *     
                 */
                public void setID(PreviousDocumentIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the typeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PreviousDocumentTypeCodeType }
                 *     
                 */
                public PreviousDocumentTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Sets the value of the typeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PreviousDocumentTypeCodeType }
                 *     
                 */
                public void setTypeCode(PreviousDocumentTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Gets the value of the lineNumeric property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLineNumeric() {
                    return lineNumeric;
                }

                /**
                 * Sets the value of the lineNumeric property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLineNumeric(BigDecimal value) {
                    this.lineNumeric = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}RefundRecipientPartyIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "name",
                "id",
                "address"
            })
            public static class RefundRecipientParty {

                @XmlElement(name = "Name")
                protected RefundRecipientPartyNameTextType name;
                @XmlElement(name = "ID")
                protected RefundRecipientPartyIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty.Address address;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RefundRecipientPartyNameTextType }
                 *     
                 */
                public RefundRecipientPartyNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RefundRecipientPartyNameTextType }
                 *     
                 */
                public void setName(RefundRecipientPartyNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RefundRecipientPartyIdentificationIDType }
                 *     
                 */
                public RefundRecipientPartyIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RefundRecipientPartyIdentificationIDType }
                 *     
                 */
                public void setID(RefundRecipientPartyIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty.Address }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.RefundRecipientParty.Address value) {
                    this.address = value;
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
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="Address" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
                "name",
                "id",
                "address",
                "contact",
                "communication"
            })
            public static class Seller {

                @XmlElement(name = "Name")
                protected SellerNameTextType name;
                @XmlElement(name = "ID")
                protected SellerIdentificationIDType id;
                @XmlElement(name = "Address")
                protected Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address address;
                @XmlElement(name = "Contact")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact> contact;
                @XmlElement(name = "Communication")
                protected List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication> communication;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SellerNameTextType }
                 *     
                 */
                public SellerNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SellerNameTextType }
                 *     
                 */
                public void setName(SellerNameTextType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SellerIdentificationIDType }
                 *     
                 */
                public SellerIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SellerIdentificationIDType }
                 *     
                 */
                public void setID(SellerIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address }
                 *     
                 */
                public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address }
                 *     
                 */
                public void setAddress(Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the contact property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contact property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContact().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact> getContact() {
                    if (contact == null) {
                        contact = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact>();
                    }
                    return this.contact;
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
                 * {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication }
                 * 
                 * 
                 */
                public List<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication> getCommunication() {
                    if (communication == null) {
                        communication = new ArrayList<Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication>();
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
                 *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
                 *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
                 *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
                 *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                    "cityName",
                    "countryCode",
                    "countrySubDivisionCode",
                    "countrySubDivisionName",
                    "line",
                    "postcodeID"
                })
                public static class Address {

                    @XmlElement(name = "CityName")
                    protected AddressCityNameTextType cityName;
                    @XmlElement(name = "CountryCode")
                    protected AddressCountryCodeType countryCode;
                    @XmlElement(name = "CountrySubDivisionCode")
                    protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                    @XmlElement(name = "CountrySubDivisionName")
                    protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                    @XmlElement(name = "Line")
                    protected AddressLineTextType line;
                    @XmlElement(name = "PostcodeID")
                    protected AddressPostcodeIDType postcodeID;

                    /**
                     * Gets the value of the cityName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public AddressCityNameTextType getCityName() {
                        return cityName;
                    }

                    /**
                     * Sets the value of the cityName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCityNameTextType }
                     *     
                     */
                    public void setCityName(AddressCityNameTextType value) {
                        this.cityName = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public AddressCountryCodeType getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountryCodeType }
                     *     
                     */
                    public void setCountryCode(AddressCountryCodeType value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                        return countrySubDivisionCode;
                    }

                    /**
                     * Sets the value of the countrySubDivisionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionCodeType }
                     *     
                     */
                    public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                        this.countrySubDivisionCode = value;
                    }

                    /**
                     * Gets the value of the countrySubDivisionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                        return countrySubDivisionName;
                    }

                    /**
                     * Sets the value of the countrySubDivisionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressCountrySubDivisionNameTextType }
                     *     
                     */
                    public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                        this.countrySubDivisionName = value;
                    }

                    /**
                     * Gets the value of the line property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public AddressLineTextType getLine() {
                        return line;
                    }

                    /**
                     * Sets the value of the line property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressLineTextType }
                     *     
                     */
                    public void setLine(AddressLineTextType value) {
                        this.line = value;
                    }

                    /**
                     * Gets the value of the postcodeID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public AddressPostcodeIDType getPostcodeID() {
                        return postcodeID;
                    }

                    /**
                     * Sets the value of the postcodeID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressPostcodeIDType }
                     *     
                     */
                    public void setPostcodeID(AddressPostcodeIDType value) {
                        this.postcodeID = value;
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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
                 *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
                    "name"
                })
                public static class Contact {

                    @XmlElement(name = "Name")
                    protected ContactNameTextType name;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ContactNameTextType }
                     *     
                     */
                    public ContactNameTextType getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ContactNameTextType }
                     *     
                     */
                    public void setName(ContactNameTextType value) {
                        this.name = value;
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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
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
                "traderAssignedReferenceID"
            })
            public static class UCR {

                @XmlElement(name = "ID")
                protected UCRIdentificationIDType id;
                @XmlElement(name = "TraderAssignedReferenceID")
                protected UCRTraderAssignedReferenceIDType traderAssignedReferenceID;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UCRIdentificationIDType }
                 *     
                 */
                public UCRIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UCRIdentificationIDType }
                 *     
                 */
                public void setID(UCRIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the traderAssignedReferenceID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UCRTraderAssignedReferenceIDType }
                 *     
                 */
                public UCRTraderAssignedReferenceIDType getTraderAssignedReferenceID() {
                    return traderAssignedReferenceID;
                }

                /**
                 * Sets the value of the traderAssignedReferenceID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UCRTraderAssignedReferenceIDType }
                 *     
                 */
                public void setTraderAssignedReferenceID(UCRTraderAssignedReferenceIDType value) {
                    this.traderAssignedReferenceID = value;
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
             *         &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ValuationAdjustmentAdditionCodeType" minOccurs="0"/>
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
                "additionCode"
            })
            public static class ValuationAdjustment {

                @XmlElement(name = "AdditionCode")
                protected ValuationAdjustmentAdditionCodeType additionCode;

                /**
                 * Gets the value of the additionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ValuationAdjustmentAdditionCodeType }
                 *     
                 */
                public ValuationAdjustmentAdditionCodeType getAdditionCode() {
                    return additionCode;
                }

                /**
                 * Sets the value of the additionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ValuationAdjustmentAdditionCodeType }
                 *     
                 */
                public void setAdditionCode(ValuationAdjustmentAdditionCodeType value) {
                    this.additionCode = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ImporterNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ImporterIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
            "name",
            "id",
            "address",
            "contact",
            "communication"
        })
        public static class Importer {

            @XmlElement(name = "Name")
            protected ImporterNameTextType name;
            @XmlElement(name = "ID")
            protected ImporterIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Importer.Address address;
            @XmlElement(name = "Contact")
            protected List<Declaration.GoodsShipment.Importer.Contact> contact;
            @XmlElement(name = "Communication")
            protected List<Declaration.GoodsShipment.Importer.Communication> communication;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ImporterNameTextType }
             *     
             */
            public ImporterNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImporterNameTextType }
             *     
             */
            public void setName(ImporterNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link ImporterIdentificationIDType }
             *     
             */
            public ImporterIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImporterIdentificationIDType }
             *     
             */
            public void setID(ImporterIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Importer.Address }
             *     
             */
            public Declaration.GoodsShipment.Importer.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Importer.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Importer.Address value) {
                this.address = value;
            }

            /**
             * Gets the value of the contact property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contact property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContact().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.Importer.Contact }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Importer.Contact> getContact() {
                if (contact == null) {
                    contact = new ArrayList<Declaration.GoodsShipment.Importer.Contact>();
                }
                return this.contact;
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
             * {@link Declaration.GoodsShipment.Importer.Communication }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Importer.Communication> getCommunication() {
                if (communication == null) {
                    communication = new ArrayList<Declaration.GoodsShipment.Importer.Communication>();
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
                "name"
            })
            public static class Contact {

                @XmlElement(name = "Name")
                protected ContactNameTextType name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ContactNameTextType }
                 *     
                 */
                public ContactNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ContactNameTextType }
                 *     
                 */
                public void setName(ContactNameTextType value) {
                    this.name = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}InvoiceIssueDateTimeType" minOccurs="0"/>
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
            "issueDateTime"
        })
        public static class Invoice {

            @XmlElement(name = "ID")
            protected InvoiceIdentificationIDType id;
            @XmlElement(name = "IssueDateTime")
            protected InvoiceIssueDateTimeType issueDateTime;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link InvoiceIdentificationIDType }
             *     
             */
            public InvoiceIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvoiceIdentificationIDType }
             *     
             */
            public void setID(InvoiceIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the issueDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link InvoiceIssueDateTimeType }
             *     
             */
            public InvoiceIssueDateTimeType getIssueDateTime() {
                return issueDateTime;
            }

            /**
             * Sets the value of the issueDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvoiceIssueDateTimeType }
             *     
             */
            public void setIssueDateTime(InvoiceIssueDateTimeType value) {
                this.issueDateTime = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PayerNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PayerIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "name",
            "id",
            "address"
        })
        public static class Payer {

            @XmlElement(name = "Name")
            protected PayerNameTextType name;
            @XmlElement(name = "ID")
            protected PayerIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Payer.Address address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link PayerNameTextType }
             *     
             */
            public PayerNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link PayerNameTextType }
             *     
             */
            public void setName(PayerNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link PayerIdentificationIDType }
             *     
             */
            public PayerIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link PayerIdentificationIDType }
             *     
             */
            public void setID(PayerIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Payer.Address }
             *     
             */
            public Declaration.GoodsShipment.Payer.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Payer.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Payer.Address value) {
                this.address = value;
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
         *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentCategoryCodeType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentTypeCodeType" minOccurs="0"/>
         *         &lt;element name="LineNumeric" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PreviousDocumentLineNumericType" minOccurs="0"/>
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
            "categoryCode",
            "id",
            "typeCode",
            "lineNumeric"
        })
        public static class PreviousDocument {

            @XmlElement(name = "CategoryCode")
            protected PreviousDocumentCategoryCodeType categoryCode;
            @XmlElement(name = "ID")
            protected PreviousDocumentIdentificationIDType id;
            @XmlElement(name = "TypeCode")
            protected PreviousDocumentTypeCodeType typeCode;
            @XmlElement(name = "LineNumeric")
            protected BigDecimal lineNumeric;

            /**
             * Gets the value of the categoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link PreviousDocumentCategoryCodeType }
             *     
             */
            public PreviousDocumentCategoryCodeType getCategoryCode() {
                return categoryCode;
            }

            /**
             * Sets the value of the categoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PreviousDocumentCategoryCodeType }
             *     
             */
            public void setCategoryCode(PreviousDocumentCategoryCodeType value) {
                this.categoryCode = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link PreviousDocumentIdentificationIDType }
             *     
             */
            public PreviousDocumentIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link PreviousDocumentIdentificationIDType }
             *     
             */
            public void setID(PreviousDocumentIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the typeCode property.
             * 
             * @return
             *     possible object is
             *     {@link PreviousDocumentTypeCodeType }
             *     
             */
            public PreviousDocumentTypeCodeType getTypeCode() {
                return typeCode;
            }

            /**
             * Sets the value of the typeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PreviousDocumentTypeCodeType }
             *     
             */
            public void setTypeCode(PreviousDocumentTypeCodeType value) {
                this.typeCode = value;
            }

            /**
             * Gets the value of the lineNumeric property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLineNumeric() {
                return lineNumeric;
            }

            /**
             * Sets the value of the lineNumeric property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLineNumeric(BigDecimal value) {
                this.lineNumeric = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SellerIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Contact" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
            "name",
            "id",
            "address",
            "contact",
            "communication"
        })
        public static class Seller {

            @XmlElement(name = "Name")
            protected SellerNameTextType name;
            @XmlElement(name = "ID")
            protected SellerIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Seller.Address address;
            @XmlElement(name = "Contact")
            protected List<Declaration.GoodsShipment.Seller.Contact> contact;
            @XmlElement(name = "Communication")
            protected List<Declaration.GoodsShipment.Seller.Communication> communication;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link SellerNameTextType }
             *     
             */
            public SellerNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link SellerNameTextType }
             *     
             */
            public void setName(SellerNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link SellerIdentificationIDType }
             *     
             */
            public SellerIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link SellerIdentificationIDType }
             *     
             */
            public void setID(SellerIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Seller.Address }
             *     
             */
            public Declaration.GoodsShipment.Seller.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Seller.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Seller.Address value) {
                this.address = value;
            }

            /**
             * Gets the value of the contact property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contact property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContact().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Declaration.GoodsShipment.Seller.Contact }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Seller.Contact> getContact() {
                if (contact == null) {
                    contact = new ArrayList<Declaration.GoodsShipment.Seller.Contact>();
                }
                return this.contact;
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
             * {@link Declaration.GoodsShipment.Seller.Communication }
             * 
             * 
             */
            public List<Declaration.GoodsShipment.Seller.Communication> getCommunication() {
                if (communication == null) {
                    communication = new ArrayList<Declaration.GoodsShipment.Seller.Communication>();
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}CommunicationTypeCodeType" minOccurs="0"/>
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
             *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ContactNameTextType" minOccurs="0"/>
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
                "name"
            })
            public static class Contact {

                @XmlElement(name = "Name")
                protected ContactNameTextType name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ContactNameTextType }
                 *     
                 */
                public ContactNameTextType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ContactNameTextType }
                 *     
                 */
                public void setName(ContactNameTextType value) {
                    this.name = value;
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SuretyNameTextType" minOccurs="0"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SuretyIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "name",
            "id",
            "address"
        })
        public static class Surety {

            @XmlElement(name = "Name")
            protected SuretyNameTextType name;
            @XmlElement(name = "ID")
            protected SuretyIdentificationIDType id;
            @XmlElement(name = "Address")
            protected Declaration.GoodsShipment.Surety.Address address;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link SuretyNameTextType }
             *     
             */
            public SuretyNameTextType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link SuretyNameTextType }
             *     
             */
            public void setName(SuretyNameTextType value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link SuretyIdentificationIDType }
             *     
             */
            public SuretyIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link SuretyIdentificationIDType }
             *     
             */
            public void setID(SuretyIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Declaration.GoodsShipment.Surety.Address }
             *     
             */
            public Declaration.GoodsShipment.Surety.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Declaration.GoodsShipment.Surety.Address }
             *     
             */
            public void setAddress(Declaration.GoodsShipment.Surety.Address value) {
                this.address = value;
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
             *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
             *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
             *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
                "cityName",
                "countryCode",
                "countrySubDivisionCode",
                "countrySubDivisionName",
                "line",
                "postcodeID"
            })
            public static class Address {

                @XmlElement(name = "CityName")
                protected AddressCityNameTextType cityName;
                @XmlElement(name = "CountryCode")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "CountrySubDivisionName")
                protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
                @XmlElement(name = "Line")
                protected AddressLineTextType line;
                @XmlElement(name = "PostcodeID")
                protected AddressPostcodeIDType postcodeID;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public AddressCityNameTextType getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCityNameTextType }
                 *     
                 */
                public void setCityName(AddressCityNameTextType value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Sets the value of the countrySubDivisionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

                /**
                 * Gets the value of the countrySubDivisionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                    return countrySubDivisionName;
                }

                /**
                 * Sets the value of the countrySubDivisionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionNameTextType }
                 *     
                 */
                public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                    this.countrySubDivisionName = value;
                }

                /**
                 * Gets the value of the line property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Sets the value of the line property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

                /**
                 * Gets the value of the postcodeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public AddressPostcodeIDType getPostcodeID() {
                    return postcodeID;
                }

                /**
                 * Sets the value of the postcodeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressPostcodeIDType }
                 *     
                 */
                public void setPostcodeID(AddressPostcodeIDType value) {
                    this.postcodeID = value;
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
         *         &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsConditionCodeType" minOccurs="0"/>
         *         &lt;element name="CountryRelationshipCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsCountryRelationshipCodeType" minOccurs="0"/>
         *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsDescriptionTextType" minOccurs="0"/>
         *         &lt;element name="LocationID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsLocationIDType" minOccurs="0"/>
         *         &lt;element name="LocationName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}TradeTermsLocationNameTextType" minOccurs="0"/>
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
            "conditionCode",
            "countryRelationshipCode",
            "description",
            "locationID",
            "locationName"
        })
        public static class TradeTerms {

            @XmlElement(name = "ConditionCode")
            protected TradeTermsConditionCodeType conditionCode;
            @XmlElement(name = "CountryRelationshipCode")
            protected TradeTermsCountryRelationshipCodeType countryRelationshipCode;
            @XmlElement(name = "Description")
            protected TradeTermsDescriptionTextType description;
            @XmlElement(name = "LocationID")
            protected TradeTermsLocationIDType locationID;
            @XmlElement(name = "LocationName")
            protected TradeTermsLocationNameTextType locationName;

            /**
             * Gets the value of the conditionCode property.
             * 
             * @return
             *     possible object is
             *     {@link TradeTermsConditionCodeType }
             *     
             */
            public TradeTermsConditionCodeType getConditionCode() {
                return conditionCode;
            }

            /**
             * Sets the value of the conditionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link TradeTermsConditionCodeType }
             *     
             */
            public void setConditionCode(TradeTermsConditionCodeType value) {
                this.conditionCode = value;
            }

            /**
             * Gets the value of the countryRelationshipCode property.
             * 
             * @return
             *     possible object is
             *     {@link TradeTermsCountryRelationshipCodeType }
             *     
             */
            public TradeTermsCountryRelationshipCodeType getCountryRelationshipCode() {
                return countryRelationshipCode;
            }

            /**
             * Sets the value of the countryRelationshipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link TradeTermsCountryRelationshipCodeType }
             *     
             */
            public void setCountryRelationshipCode(TradeTermsCountryRelationshipCodeType value) {
                this.countryRelationshipCode = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link TradeTermsDescriptionTextType }
             *     
             */
            public TradeTermsDescriptionTextType getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link TradeTermsDescriptionTextType }
             *     
             */
            public void setDescription(TradeTermsDescriptionTextType value) {
                this.description = value;
            }

            /**
             * Gets the value of the locationID property.
             * 
             * @return
             *     possible object is
             *     {@link TradeTermsLocationIDType }
             *     
             */
            public TradeTermsLocationIDType getLocationID() {
                return locationID;
            }

            /**
             * Sets the value of the locationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link TradeTermsLocationIDType }
             *     
             */
            public void setLocationID(TradeTermsLocationIDType value) {
                this.locationID = value;
            }

            /**
             * Gets the value of the locationName property.
             * 
             * @return
             *     possible object is
             *     {@link TradeTermsLocationNameTextType }
             *     
             */
            public TradeTermsLocationNameTextType getLocationName() {
                return locationName;
            }

            /**
             * Sets the value of the locationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link TradeTermsLocationNameTextType }
             *     
             */
            public void setLocationName(TradeTermsLocationNameTextType value) {
                this.locationName = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}UCRTraderAssignedReferenceIDType" minOccurs="0"/>
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
            "traderAssignedReferenceID"
        })
        public static class UCR {

            @XmlElement(name = "ID")
            protected UCRIdentificationIDType id;
            @XmlElement(name = "TraderAssignedReferenceID")
            protected UCRTraderAssignedReferenceIDType traderAssignedReferenceID;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link UCRIdentificationIDType }
             *     
             */
            public UCRIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link UCRIdentificationIDType }
             *     
             */
            public void setID(UCRIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the traderAssignedReferenceID property.
             * 
             * @return
             *     possible object is
             *     {@link UCRTraderAssignedReferenceIDType }
             *     
             */
            public UCRTraderAssignedReferenceIDType getTraderAssignedReferenceID() {
                return traderAssignedReferenceID;
            }

            /**
             * Sets the value of the traderAssignedReferenceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link UCRTraderAssignedReferenceIDType }
             *     
             */
            public void setTraderAssignedReferenceID(UCRTraderAssignedReferenceIDType value) {
                this.traderAssignedReferenceID = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WarehouseIdentificationIDType" minOccurs="0"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}WarehouseTypeCodeType" minOccurs="0"/>
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
        public static class Warehouse {

            @XmlElement(name = "ID")
            protected WarehouseIdentificationIDType id;
            @XmlElement(name = "TypeCode")
            protected WarehouseTypeCodeType typeCode;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link WarehouseIdentificationIDType }
             *     
             */
            public WarehouseIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link WarehouseIdentificationIDType }
             *     
             */
            public void setID(WarehouseIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Gets the value of the typeCode property.
             * 
             * @return
             *     possible object is
             *     {@link WarehouseTypeCodeType }
             *     
             */
            public WarehouseTypeCodeType getTypeCode() {
                return typeCode;
            }

            /**
             * Sets the value of the typeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link WarehouseTypeCodeType }
             *     
             */
            public void setTypeCode(WarehouseTypeCodeType value) {
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
     *         &lt;element name="AmountAmount" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeAmountAmountType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="ReferenceID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeReferenceIDType" minOccurs="0"/>
     *         &lt;element name="SecurityDetailsCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeSecurityDetailsCodeType" minOccurs="0"/>
     *         &lt;element name="AccessCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}ObligationGuaranteeAccessCodeType" minOccurs="0"/>
     *         &lt;element name="GuaranteeOffice" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GuaranteeOfficeIdentificationIDType" minOccurs="0"/>
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
        "amountAmount",
        "id",
        "referenceID",
        "securityDetailsCode",
        "accessCode",
        "guaranteeOffice"
    })
    public static class ObligationGuarantee {

        @XmlElement(name = "AmountAmount")
        protected ObligationGuaranteeAmountAmountType amountAmount;
        @XmlElement(name = "ID")
        protected ObligationGuaranteeIdentificationIDType id;
        @XmlElement(name = "ReferenceID")
        protected ObligationGuaranteeReferenceIDType referenceID;
        @XmlElement(name = "SecurityDetailsCode")
        protected ObligationGuaranteeSecurityDetailsCodeType securityDetailsCode;
        @XmlElement(name = "AccessCode")
        protected ObligationGuaranteeAccessCodeType accessCode;
        @XmlElement(name = "GuaranteeOffice")
        protected Declaration.ObligationGuarantee.GuaranteeOffice guaranteeOffice;

        /**
         * Gets the value of the amountAmount property.
         * 
         * @return
         *     possible object is
         *     {@link ObligationGuaranteeAmountAmountType }
         *     
         */
        public ObligationGuaranteeAmountAmountType getAmountAmount() {
            return amountAmount;
        }

        /**
         * Sets the value of the amountAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObligationGuaranteeAmountAmountType }
         *     
         */
        public void setAmountAmount(ObligationGuaranteeAmountAmountType value) {
            this.amountAmount = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link ObligationGuaranteeIdentificationIDType }
         *     
         */
        public ObligationGuaranteeIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObligationGuaranteeIdentificationIDType }
         *     
         */
        public void setID(ObligationGuaranteeIdentificationIDType value) {
            this.id = value;
        }

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

        /**
         * Gets the value of the securityDetailsCode property.
         * 
         * @return
         *     possible object is
         *     {@link ObligationGuaranteeSecurityDetailsCodeType }
         *     
         */
        public ObligationGuaranteeSecurityDetailsCodeType getSecurityDetailsCode() {
            return securityDetailsCode;
        }

        /**
         * Sets the value of the securityDetailsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObligationGuaranteeSecurityDetailsCodeType }
         *     
         */
        public void setSecurityDetailsCode(ObligationGuaranteeSecurityDetailsCodeType value) {
            this.securityDetailsCode = value;
        }

        /**
         * Gets the value of the accessCode property.
         * 
         * @return
         *     possible object is
         *     {@link ObligationGuaranteeAccessCodeType }
         *     
         */
        public ObligationGuaranteeAccessCodeType getAccessCode() {
            return accessCode;
        }

        /**
         * Sets the value of the accessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObligationGuaranteeAccessCodeType }
         *     
         */
        public void setAccessCode(ObligationGuaranteeAccessCodeType value) {
            this.accessCode = value;
        }

        /**
         * Gets the value of the guaranteeOffice property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.ObligationGuarantee.GuaranteeOffice }
         *     
         */
        public Declaration.ObligationGuarantee.GuaranteeOffice getGuaranteeOffice() {
            return guaranteeOffice;
        }

        /**
         * Sets the value of the guaranteeOffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.ObligationGuarantee.GuaranteeOffice }
         *     
         */
        public void setGuaranteeOffice(Declaration.ObligationGuarantee.GuaranteeOffice value) {
            this.guaranteeOffice = value;
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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}GuaranteeOfficeIdentificationIDType" minOccurs="0"/>
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
        public static class GuaranteeOffice {

            @XmlElement(name = "ID")
            protected GuaranteeOfficeIdentificationIDType id;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link GuaranteeOfficeIdentificationIDType }
             *     
             */
            public GuaranteeOfficeIdentificationIDType getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link GuaranteeOfficeIdentificationIDType }
             *     
             */
            public void setID(GuaranteeOfficeIdentificationIDType value) {
                this.id = value;
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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}PresentationOfficeIdentificationIDType" minOccurs="0"/>
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
    public static class PresentationOffice {

        @XmlElement(name = "ID")
        protected PresentationOfficeIdentificationIDType id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link PresentationOfficeIdentificationIDType }
         *     
         */
        public PresentationOfficeIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link PresentationOfficeIdentificationIDType }
         *     
         */
        public void setID(PresentationOfficeIdentificationIDType value) {
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
     *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterNameTextType" minOccurs="0"/>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SubmitterIdentificationIDType" minOccurs="0"/>
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
     *                   &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
     *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
     *                   &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
        "name",
        "id",
        "address"
    })
    public static class Submitter {

        @XmlElement(name = "Name")
        protected SubmitterNameTextType name;
        @XmlElement(name = "ID")
        protected SubmitterIdentificationIDType id;
        @XmlElement(name = "Address")
        protected Declaration.Submitter.Address address;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link SubmitterNameTextType }
         *     
         */
        public SubmitterNameTextType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubmitterNameTextType }
         *     
         */
        public void setName(SubmitterNameTextType value) {
            this.name = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link SubmitterIdentificationIDType }
         *     
         */
        public SubmitterIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubmitterIdentificationIDType }
         *     
         */
        public void setID(SubmitterIdentificationIDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link Declaration.Submitter.Address }
         *     
         */
        public Declaration.Submitter.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link Declaration.Submitter.Address }
         *     
         */
        public void setAddress(Declaration.Submitter.Address value) {
            this.address = value;
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
         *         &lt;element name="CityName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCityNameTextType" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountryCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionCodeType" minOccurs="0"/>
         *         &lt;element name="CountrySubDivisionName" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressCountrySubDivisionNameTextType" minOccurs="0"/>
         *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressLineTextType" minOccurs="0"/>
         *         &lt;element name="PostcodeID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}AddressPostcodeIDType" minOccurs="0"/>
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
            "cityName",
            "countryCode",
            "countrySubDivisionCode",
            "countrySubDivisionName",
            "line",
            "postcodeID"
        })
        public static class Address {

            @XmlElement(name = "CityName")
            protected AddressCityNameTextType cityName;
            @XmlElement(name = "CountryCode")
            protected AddressCountryCodeType countryCode;
            @XmlElement(name = "CountrySubDivisionCode")
            protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
            @XmlElement(name = "CountrySubDivisionName")
            protected AddressCountrySubDivisionNameTextType countrySubDivisionName;
            @XmlElement(name = "Line")
            protected AddressLineTextType line;
            @XmlElement(name = "PostcodeID")
            protected AddressPostcodeIDType postcodeID;

            /**
             * Gets the value of the cityName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public AddressCityNameTextType getCityName() {
                return cityName;
            }

            /**
             * Sets the value of the cityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCityNameTextType }
             *     
             */
            public void setCityName(AddressCityNameTextType value) {
                this.cityName = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public AddressCountryCodeType getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountryCodeType }
             *     
             */
            public void setCountryCode(AddressCountryCodeType value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionCode property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                return countrySubDivisionCode;
            }

            /**
             * Sets the value of the countrySubDivisionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionCodeType }
             *     
             */
            public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                this.countrySubDivisionCode = value;
            }

            /**
             * Gets the value of the countrySubDivisionName property.
             * 
             * @return
             *     possible object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public AddressCountrySubDivisionNameTextType getCountrySubDivisionName() {
                return countrySubDivisionName;
            }

            /**
             * Sets the value of the countrySubDivisionName property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressCountrySubDivisionNameTextType }
             *     
             */
            public void setCountrySubDivisionName(AddressCountrySubDivisionNameTextType value) {
                this.countrySubDivisionName = value;
            }

            /**
             * Gets the value of the line property.
             * 
             * @return
             *     possible object is
             *     {@link AddressLineTextType }
             *     
             */
            public AddressLineTextType getLine() {
                return line;
            }

            /**
             * Sets the value of the line property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressLineTextType }
             *     
             */
            public void setLine(AddressLineTextType value) {
                this.line = value;
            }

            /**
             * Gets the value of the postcodeID property.
             * 
             * @return
             *     possible object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public AddressPostcodeIDType getPostcodeID() {
                return postcodeID;
            }

            /**
             * Sets the value of the postcodeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressPostcodeIDType }
             *     
             */
            public void setPostcodeID(AddressPostcodeIDType value) {
                this.postcodeID = value;
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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:Declaration_DS:DMS:2}SupervisingOfficeIdentificationIDType" minOccurs="0"/>
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
    public static class SupervisingOffice {

        @XmlElement(name = "ID")
        protected SupervisingOfficeIdentificationIDType id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link SupervisingOfficeIdentificationIDType }
         *     
         */
        public SupervisingOfficeIdentificationIDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link SupervisingOfficeIdentificationIDType }
         *     
         */
        public void setID(SupervisingOfficeIdentificationIDType value) {
            this.id = value;
        }

    }

}
