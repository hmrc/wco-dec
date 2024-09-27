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

package wco.datamodel.wco.dec_dms._2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wco.datamodel.wco.dec_dms._2 package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Declaration_QNAME = new QName("urn:wco:datamodel:WCO:DEC-DMS:2", "Declaration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wco.datamodel.wco.dec_dms._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Declaration }
     * 
     * @return
     *     the new instance of {@link Declaration }
     */
    public Declaration createDeclaration() {
        return new Declaration();
    }

    /**
     * Create an instance of {@link Declaration.ObligationGuarantee }
     * 
     * @return
     *     the new instance of {@link Declaration.ObligationGuarantee }
     */
    public Declaration.ObligationGuarantee createDeclarationObligationGuarantee() {
        return new Declaration.ObligationGuarantee();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment }
     */
    public Declaration.GoodsShipment createDeclarationGoodsShipment() {
        return new Declaration.GoodsShipment();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Surety }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Surety }
     */
    public Declaration.GoodsShipment.Surety createDeclarationGoodsShipmentSurety() {
        return new Declaration.GoodsShipment.Surety();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Seller }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Seller }
     */
    public Declaration.GoodsShipment.Seller createDeclarationGoodsShipmentSeller() {
        return new Declaration.GoodsShipment.Seller();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Payer }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Payer }
     */
    public Declaration.GoodsShipment.Payer createDeclarationGoodsShipmentPayer() {
        return new Declaration.GoodsShipment.Payer();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Importer }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Importer }
     */
    public Declaration.GoodsShipment.Importer createDeclarationGoodsShipmentImporter() {
        return new Declaration.GoodsShipment.Importer();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem createDeclarationGoodsShipmentGovernmentAgencyGoodsItem() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller createDeclarationGoodsShipmentGovernmentAgencyGoodsItemSeller() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCustomsValuation() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor createDeclarationGoodsShipmentGovernmentAgencyGoodsItemConsignor() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee createDeclarationGoodsShipmentGovernmentAgencyGoodsItemConsignee() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodity() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityDutyTaxFee() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer createDeclarationGoodsShipmentGovernmentAgencyGoodsItemBuyer() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument createDeclarationGoodsShipmentGovernmentAgencyGoodsItemAdditionalDocument() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.CustomsValuation }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.CustomsValuation }
     */
    public Declaration.GoodsShipment.CustomsValuation createDeclarationGoodsShipmentCustomsValuation() {
        return new Declaration.GoodsShipment.CustomsValuation();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignor }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignor }
     */
    public Declaration.GoodsShipment.Consignor createDeclarationGoodsShipmentConsignor() {
        return new Declaration.GoodsShipment.Consignor();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment }
     */
    public Declaration.GoodsShipment.Consignment createDeclarationGoodsShipmentConsignment() {
        return new Declaration.GoodsShipment.Consignment();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.TransportEquipment }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.TransportEquipment }
     */
    public Declaration.GoodsShipment.Consignment.TransportEquipment createDeclarationGoodsShipmentConsignmentTransportEquipment() {
        return new Declaration.GoodsShipment.Consignment.TransportEquipment();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.GoodsLocation }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.GoodsLocation }
     */
    public Declaration.GoodsShipment.Consignment.GoodsLocation createDeclarationGoodsShipmentConsignmentGoodsLocation() {
        return new Declaration.GoodsShipment.Consignment.GoodsLocation();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignee }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignee }
     */
    public Declaration.GoodsShipment.Consignee createDeclarationGoodsShipmentConsignee() {
        return new Declaration.GoodsShipment.Consignee();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Buyer }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Buyer }
     */
    public Declaration.GoodsShipment.Buyer createDeclarationGoodsShipmentBuyer() {
        return new Declaration.GoodsShipment.Buyer();
    }

    /**
     * Create an instance of {@link Declaration.Exporter }
     * 
     * @return
     *     the new instance of {@link Declaration.Exporter }
     */
    public Declaration.Exporter createDeclarationExporter() {
        return new Declaration.Exporter();
    }

    /**
     * Create an instance of {@link Declaration.Declarant }
     * 
     * @return
     *     the new instance of {@link Declaration.Declarant }
     */
    public Declaration.Declarant createDeclarationDeclarant() {
        return new Declaration.Declarant();
    }

    /**
     * Create an instance of {@link Declaration.Consignment }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment }
     */
    public Declaration.Consignment createDeclarationConsignment() {
        return new Declaration.Consignment();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Consignor }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Consignor }
     */
    public Declaration.Consignment.Consignor createDeclarationConsignmentConsignor() {
        return new Declaration.Consignment.Consignor();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.ConsignmentItem }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.ConsignmentItem }
     */
    public Declaration.Consignment.ConsignmentItem createDeclarationConsignmentConsignmentItem() {
        return new Declaration.Consignment.ConsignmentItem();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.ConsignmentItem.Consignor }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.ConsignmentItem.Consignor }
     */
    public Declaration.Consignment.ConsignmentItem.Consignor createDeclarationConsignmentConsignmentItemConsignor() {
        return new Declaration.Consignment.ConsignmentItem.Consignor();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Carrier }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Carrier }
     */
    public Declaration.Consignment.Carrier createDeclarationConsignmentCarrier() {
        return new Declaration.Consignment.Carrier();
    }

    /**
     * Create an instance of {@link Declaration.Amendment }
     * 
     * @return
     *     the new instance of {@link Declaration.Amendment }
     */
    public Declaration.Amendment createDeclarationAmendment() {
        return new Declaration.Amendment();
    }

    /**
     * Create an instance of {@link Declaration.Agent }
     * 
     * @return
     *     the new instance of {@link Declaration.Agent }
     */
    public Declaration.Agent createDeclarationAgent() {
        return new Declaration.Agent();
    }

    /**
     * Create an instance of {@link Declaration.AdditionalInformation }
     * 
     * @return
     *     the new instance of {@link Declaration.AdditionalInformation }
     */
    public Declaration.AdditionalInformation createDeclarationAdditionalInformation() {
        return new Declaration.AdditionalInformation();
    }

    /**
     * Create an instance of {@link Declaration.Submitter }
     * 
     * @return
     *     the new instance of {@link Declaration.Submitter }
     */
    public Declaration.Submitter createDeclarationSubmitter() {
        return new Declaration.Submitter();
    }

    /**
     * Create an instance of {@link Declaration.Authentication }
     * 
     * @return
     *     the new instance of {@link Declaration.Authentication }
     */
    public Declaration.Authentication createDeclarationAuthentication() {
        return new Declaration.Authentication();
    }

    /**
     * Create an instance of {@link Declaration.AdditionalDocument }
     * 
     * @return
     *     the new instance of {@link Declaration.AdditionalDocument }
     */
    public Declaration.AdditionalDocument createDeclarationAdditionalDocument() {
        return new Declaration.AdditionalDocument();
    }

    /**
     * Create an instance of {@link Declaration.AuthorisationHolder }
     * 
     * @return
     *     the new instance of {@link Declaration.AuthorisationHolder }
     */
    public Declaration.AuthorisationHolder createDeclarationAuthorisationHolder() {
        return new Declaration.AuthorisationHolder();
    }

    /**
     * Create an instance of {@link Declaration.BorderTransportMeans }
     * 
     * @return
     *     the new instance of {@link Declaration.BorderTransportMeans }
     */
    public Declaration.BorderTransportMeans createDeclarationBorderTransportMeans() {
        return new Declaration.BorderTransportMeans();
    }

    /**
     * Create an instance of {@link Declaration.CurrencyExchange }
     * 
     * @return
     *     the new instance of {@link Declaration.CurrencyExchange }
     */
    public Declaration.CurrencyExchange createDeclarationCurrencyExchange() {
        return new Declaration.CurrencyExchange();
    }

    /**
     * Create an instance of {@link Declaration.ExitOffice }
     * 
     * @return
     *     the new instance of {@link Declaration.ExitOffice }
     */
    public Declaration.ExitOffice createDeclarationExitOffice() {
        return new Declaration.ExitOffice();
    }

    /**
     * Create an instance of {@link Declaration.PresentationOffice }
     * 
     * @return
     *     the new instance of {@link Declaration.PresentationOffice }
     */
    public Declaration.PresentationOffice createDeclarationPresentationOffice() {
        return new Declaration.PresentationOffice();
    }

    /**
     * Create an instance of {@link Declaration.SupervisingOffice }
     * 
     * @return
     *     the new instance of {@link Declaration.SupervisingOffice }
     */
    public Declaration.SupervisingOffice createDeclarationSupervisingOffice() {
        return new Declaration.SupervisingOffice();
    }

    /**
     * Create an instance of {@link Declaration.ObligationGuarantee.GuaranteeOffice }
     * 
     * @return
     *     the new instance of {@link Declaration.ObligationGuarantee.GuaranteeOffice }
     */
    public Declaration.ObligationGuarantee.GuaranteeOffice createDeclarationObligationGuaranteeGuaranteeOffice() {
        return new Declaration.ObligationGuarantee.GuaranteeOffice();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.AEOMutualRecognitionParty }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.AEOMutualRecognitionParty }
     */
    public Declaration.GoodsShipment.AEOMutualRecognitionParty createDeclarationGoodsShipmentAEOMutualRecognitionParty() {
        return new Declaration.GoodsShipment.AEOMutualRecognitionParty();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Destination }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Destination }
     */
    public Declaration.GoodsShipment.Destination createDeclarationGoodsShipmentDestination() {
        return new Declaration.GoodsShipment.Destination();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.DomesticDutyTaxParty }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.DomesticDutyTaxParty }
     */
    public Declaration.GoodsShipment.DomesticDutyTaxParty createDeclarationGoodsShipmentDomesticDutyTaxParty() {
        return new Declaration.GoodsShipment.DomesticDutyTaxParty();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.ExportCountry }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.ExportCountry }
     */
    public Declaration.GoodsShipment.ExportCountry createDeclarationGoodsShipmentExportCountry() {
        return new Declaration.GoodsShipment.ExportCountry();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Invoice }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Invoice }
     */
    public Declaration.GoodsShipment.Invoice createDeclarationGoodsShipmentInvoice() {
        return new Declaration.GoodsShipment.Invoice();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.PreviousDocument }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.PreviousDocument }
     */
    public Declaration.GoodsShipment.PreviousDocument createDeclarationGoodsShipmentPreviousDocument() {
        return new Declaration.GoodsShipment.PreviousDocument();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.TradeTerms }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.TradeTerms }
     */
    public Declaration.GoodsShipment.TradeTerms createDeclarationGoodsShipmentTradeTerms() {
        return new Declaration.GoodsShipment.TradeTerms();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.UCR }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.UCR }
     */
    public Declaration.GoodsShipment.UCR createDeclarationGoodsShipmentUCR() {
        return new Declaration.GoodsShipment.UCR();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Warehouse }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Warehouse }
     */
    public Declaration.GoodsShipment.Warehouse createDeclarationGoodsShipmentWarehouse() {
        return new Declaration.GoodsShipment.Warehouse();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Surety.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Surety.Address }
     */
    public Declaration.GoodsShipment.Surety.Address createDeclarationGoodsShipmentSuretyAddress() {
        return new Declaration.GoodsShipment.Surety.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Seller.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Seller.Address }
     */
    public Declaration.GoodsShipment.Seller.Address createDeclarationGoodsShipmentSellerAddress() {
        return new Declaration.GoodsShipment.Seller.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Seller.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Seller.Contact }
     */
    public Declaration.GoodsShipment.Seller.Contact createDeclarationGoodsShipmentSellerContact() {
        return new Declaration.GoodsShipment.Seller.Contact();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Seller.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Seller.Communication }
     */
    public Declaration.GoodsShipment.Seller.Communication createDeclarationGoodsShipmentSellerCommunication() {
        return new Declaration.GoodsShipment.Seller.Communication();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Payer.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Payer.Address }
     */
    public Declaration.GoodsShipment.Payer.Address createDeclarationGoodsShipmentPayerAddress() {
        return new Declaration.GoodsShipment.Payer.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Importer.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Importer.Address }
     */
    public Declaration.GoodsShipment.Importer.Address createDeclarationGoodsShipmentImporterAddress() {
        return new Declaration.GoodsShipment.Importer.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Importer.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Importer.Contact }
     */
    public Declaration.GoodsShipment.Importer.Contact createDeclarationGoodsShipmentImporterContact() {
        return new Declaration.GoodsShipment.Importer.Contact();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Importer.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Importer.Communication }
     */
    public Declaration.GoodsShipment.Importer.Communication createDeclarationGoodsShipmentImporterCommunication() {
        return new Declaration.GoodsShipment.Importer.Communication();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation createDeclarationGoodsShipmentGovernmentAgencyGoodsItemAdditionalInformation() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty createDeclarationGoodsShipmentGovernmentAgencyGoodsItemAEOMutualRecognitionParty() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AEOMutualRecognitionParty();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination createDeclarationGoodsShipmentGovernmentAgencyGoodsItemDestination() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Destination();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty createDeclarationGoodsShipmentGovernmentAgencyGoodsItemDomesticDutyTaxParty() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.DomesticDutyTaxParty();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry createDeclarationGoodsShipmentGovernmentAgencyGoodsItemExportCountry() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ExportCountry();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure createDeclarationGoodsShipmentGovernmentAgencyGoodsItemGovernmentProcedure() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin createDeclarationGoodsShipmentGovernmentAgencyGoodsItemOrigin() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Origin();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging createDeclarationGoodsShipmentGovernmentAgencyGoodsItemPackaging() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Packaging();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument createDeclarationGoodsShipmentGovernmentAgencyGoodsItemPreviousDocument() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR createDeclarationGoodsShipmentGovernmentAgencyGoodsItemUCR() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.UCR();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment createDeclarationGoodsShipmentGovernmentAgencyGoodsItemValuationAdjustment() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address createDeclarationGoodsShipmentGovernmentAgencyGoodsItemSellerAddress() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact createDeclarationGoodsShipmentGovernmentAgencyGoodsItemSellerContact() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Contact();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication createDeclarationGoodsShipmentGovernmentAgencyGoodsItemSellerCommunication() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Seller.Communication();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCustomsValuationChargeDeduction() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.CustomsValuation.ChargeDeduction();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address createDeclarationGoodsShipmentGovernmentAgencyGoodsItemConsignorAddress() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignor.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address createDeclarationGoodsShipmentGovernmentAgencyGoodsItemConsigneeAddress() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Consignee.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityClassification() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityDangerousGoods() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DangerousGoods();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityGoodsMeasure() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityInvoiceLine() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityTransportEquipment() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.TransportEquipment();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment createDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityDutyTaxFeePayment() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address createDeclarationGoodsShipmentGovernmentAgencyGoodsItemBuyerAddress() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact createDeclarationGoodsShipmentGovernmentAgencyGoodsItemBuyerContact() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Contact();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication createDeclarationGoodsShipmentGovernmentAgencyGoodsItemBuyerCommunication() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Buyer.Communication();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter createDeclarationGoodsShipmentGovernmentAgencyGoodsItemAdditionalDocumentSubmitter() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Submitter();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff }
     */
    public Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff createDeclarationGoodsShipmentGovernmentAgencyGoodsItemAdditionalDocumentWriteOff() {
        return new Declaration.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.WriteOff();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.CustomsValuation.ChargeDeduction }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.CustomsValuation.ChargeDeduction }
     */
    public Declaration.GoodsShipment.CustomsValuation.ChargeDeduction createDeclarationGoodsShipmentCustomsValuationChargeDeduction() {
        return new Declaration.GoodsShipment.CustomsValuation.ChargeDeduction();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignor.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignor.Address }
     */
    public Declaration.GoodsShipment.Consignor.Address createDeclarationGoodsShipmentConsignorAddress() {
        return new Declaration.GoodsShipment.Consignor.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.ArrivalTransportMeans }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.ArrivalTransportMeans }
     */
    public Declaration.GoodsShipment.Consignment.ArrivalTransportMeans createDeclarationGoodsShipmentConsignmentArrivalTransportMeans() {
        return new Declaration.GoodsShipment.Consignment.ArrivalTransportMeans();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.DepartureTransportMeans }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.DepartureTransportMeans }
     */
    public Declaration.GoodsShipment.Consignment.DepartureTransportMeans createDeclarationGoodsShipmentConsignmentDepartureTransportMeans() {
        return new Declaration.GoodsShipment.Consignment.DepartureTransportMeans();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.LoadingLocation }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.LoadingLocation }
     */
    public Declaration.GoodsShipment.Consignment.LoadingLocation createDeclarationGoodsShipmentConsignmentLoadingLocation() {
        return new Declaration.GoodsShipment.Consignment.LoadingLocation();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.TransportEquipment.Seal }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.TransportEquipment.Seal }
     */
    public Declaration.GoodsShipment.Consignment.TransportEquipment.Seal createDeclarationGoodsShipmentConsignmentTransportEquipmentSeal() {
        return new Declaration.GoodsShipment.Consignment.TransportEquipment.Seal();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignment.GoodsLocation.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignment.GoodsLocation.Address }
     */
    public Declaration.GoodsShipment.Consignment.GoodsLocation.Address createDeclarationGoodsShipmentConsignmentGoodsLocationAddress() {
        return new Declaration.GoodsShipment.Consignment.GoodsLocation.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Consignee.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Consignee.Address }
     */
    public Declaration.GoodsShipment.Consignee.Address createDeclarationGoodsShipmentConsigneeAddress() {
        return new Declaration.GoodsShipment.Consignee.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Buyer.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Buyer.Address }
     */
    public Declaration.GoodsShipment.Buyer.Address createDeclarationGoodsShipmentBuyerAddress() {
        return new Declaration.GoodsShipment.Buyer.Address();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Buyer.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Buyer.Contact }
     */
    public Declaration.GoodsShipment.Buyer.Contact createDeclarationGoodsShipmentBuyerContact() {
        return new Declaration.GoodsShipment.Buyer.Contact();
    }

    /**
     * Create an instance of {@link Declaration.GoodsShipment.Buyer.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.GoodsShipment.Buyer.Communication }
     */
    public Declaration.GoodsShipment.Buyer.Communication createDeclarationGoodsShipmentBuyerCommunication() {
        return new Declaration.GoodsShipment.Buyer.Communication();
    }

    /**
     * Create an instance of {@link Declaration.Exporter.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Exporter.Address }
     */
    public Declaration.Exporter.Address createDeclarationExporterAddress() {
        return new Declaration.Exporter.Address();
    }

    /**
     * Create an instance of {@link Declaration.Exporter.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.Exporter.Contact }
     */
    public Declaration.Exporter.Contact createDeclarationExporterContact() {
        return new Declaration.Exporter.Contact();
    }

    /**
     * Create an instance of {@link Declaration.Exporter.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.Exporter.Communication }
     */
    public Declaration.Exporter.Communication createDeclarationExporterCommunication() {
        return new Declaration.Exporter.Communication();
    }

    /**
     * Create an instance of {@link Declaration.Declarant.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Declarant.Address }
     */
    public Declaration.Declarant.Address createDeclarationDeclarantAddress() {
        return new Declaration.Declarant.Address();
    }

    /**
     * Create an instance of {@link Declaration.Declarant.Contact }
     * 
     * @return
     *     the new instance of {@link Declaration.Declarant.Contact }
     */
    public Declaration.Declarant.Contact createDeclarationDeclarantContact() {
        return new Declaration.Declarant.Contact();
    }

    /**
     * Create an instance of {@link Declaration.Declarant.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.Declarant.Communication }
     */
    public Declaration.Declarant.Communication createDeclarationDeclarantCommunication() {
        return new Declaration.Declarant.Communication();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Freight }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Freight }
     */
    public Declaration.Consignment.Freight createDeclarationConsignmentFreight() {
        return new Declaration.Consignment.Freight();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Itinerary }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Itinerary }
     */
    public Declaration.Consignment.Itinerary createDeclarationConsignmentItinerary() {
        return new Declaration.Consignment.Itinerary();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Consignor.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Consignor.Address }
     */
    public Declaration.Consignment.Consignor.Address createDeclarationConsignmentConsignorAddress() {
        return new Declaration.Consignment.Consignor.Address();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.ConsignmentItem.Freight }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.ConsignmentItem.Freight }
     */
    public Declaration.Consignment.ConsignmentItem.Freight createDeclarationConsignmentConsignmentItemFreight() {
        return new Declaration.Consignment.ConsignmentItem.Freight();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.ConsignmentItem.Consignor.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.ConsignmentItem.Consignor.Address }
     */
    public Declaration.Consignment.ConsignmentItem.Consignor.Address createDeclarationConsignmentConsignmentItemConsignorAddress() {
        return new Declaration.Consignment.ConsignmentItem.Consignor.Address();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Carrier.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Carrier.Address }
     */
    public Declaration.Consignment.Carrier.Address createDeclarationConsignmentCarrierAddress() {
        return new Declaration.Consignment.Carrier.Address();
    }

    /**
     * Create an instance of {@link Declaration.Consignment.Carrier.Communication }
     * 
     * @return
     *     the new instance of {@link Declaration.Consignment.Carrier.Communication }
     */
    public Declaration.Consignment.Carrier.Communication createDeclarationConsignmentCarrierCommunication() {
        return new Declaration.Consignment.Carrier.Communication();
    }

    /**
     * Create an instance of {@link Declaration.Amendment.Pointer }
     * 
     * @return
     *     the new instance of {@link Declaration.Amendment.Pointer }
     */
    public Declaration.Amendment.Pointer createDeclarationAmendmentPointer() {
        return new Declaration.Amendment.Pointer();
    }

    /**
     * Create an instance of {@link Declaration.Agent.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Agent.Address }
     */
    public Declaration.Agent.Address createDeclarationAgentAddress() {
        return new Declaration.Agent.Address();
    }

    /**
     * Create an instance of {@link Declaration.AdditionalInformation.Pointer }
     * 
     * @return
     *     the new instance of {@link Declaration.AdditionalInformation.Pointer }
     */
    public Declaration.AdditionalInformation.Pointer createDeclarationAdditionalInformationPointer() {
        return new Declaration.AdditionalInformation.Pointer();
    }

    /**
     * Create an instance of {@link Declaration.Submitter.Address }
     * 
     * @return
     *     the new instance of {@link Declaration.Submitter.Address }
     */
    public Declaration.Submitter.Address createDeclarationSubmitterAddress() {
        return new Declaration.Submitter.Address();
    }

    /**
     * Create an instance of {@link Declaration.Authentication.Authenticator }
     * 
     * @return
     *     the new instance of {@link Declaration.Authentication.Authenticator }
     */
    public Declaration.Authentication.Authenticator createDeclarationAuthenticationAuthenticator() {
        return new Declaration.Authentication.Authenticator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Declaration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Declaration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:DEC-DMS:2", name = "Declaration")
    public JAXBElement<Declaration> createDeclaration(Declaration value) {
        return new JAXBElement<>(_Declaration_QNAME, Declaration.class, null, value);
    }

}
