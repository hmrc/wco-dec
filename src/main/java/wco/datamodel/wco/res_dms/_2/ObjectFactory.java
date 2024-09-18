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

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import wco.datamodel.wco.response_ds.dms._2.ResponseFunctionCodeType;
import wco.datamodel.wco.response_ds.dms._2.ResponseFunctionalReferenceIDType;
import wco.datamodel.wco.response_ds.dms._2.ResponseIssueDateTimeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wco.datamodel.wco.res_dms._2 package. 
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

    private final static QName _ResponseDeclaration_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "Declaration");
    private final static QName _ResponseFunctionCode_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "FunctionCode");
    private final static QName _ResponseIssueDateTime_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "IssueDateTime");
    private final static QName _ResponseError_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "Error");
    private final static QName _ResponseAmendment_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "Amendment");
    private final static QName _ResponseAppealOffice_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "AppealOffice");
    private final static QName _ResponseContactOffice_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "ContactOffice");
    private final static QName _ResponseFunctionalReferenceID_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "FunctionalReferenceID");
    private final static QName _ResponseBank_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "Bank");
    private final static QName _ResponseAdditionalInformation_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "AdditionalInformation");
    private final static QName _ResponseStatus_QNAME = new QName("urn:wco:datamodel:WCO:RES-DMS:2", "Status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wco.datamodel.wco.res_dms._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Response.Declaration }
     * 
     */
    public Response.Declaration createResponseDeclaration() {
        return new Response.Declaration();
    }

    /**
     * Create an instance of {@link Response.Declaration.GoodsShipment }
     * 
     */
    public Response.Declaration.GoodsShipment createResponseDeclarationGoodsShipment() {
        return new Response.Declaration.GoodsShipment();
    }

    /**
     * Create an instance of {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem }
     * 
     */
    public Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem createResponseDeclarationGoodsShipmentGovernmentAgencyGoodsItem() {
        return new Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem();
    }

    /**
     * Create an instance of {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
     * 
     */
    public Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity createResponseDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodity() {
        return new Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity();
    }

    /**
     * Create an instance of {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee }
     * 
     */
    public Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee createResponseDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityDutyTaxFee() {
        return new Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee();
    }

    /**
     * Create an instance of {@link Response.Declaration.DutyTaxFee }
     * 
     */
    public Response.Declaration.DutyTaxFee createResponseDeclarationDutyTaxFee() {
        return new Response.Declaration.DutyTaxFee();
    }

    /**
     * Create an instance of {@link Response.Declaration.DutyTaxFee.Payment }
     * 
     */
    public Response.Declaration.DutyTaxFee.Payment createResponseDeclarationDutyTaxFeePayment() {
        return new Response.Declaration.DutyTaxFee.Payment();
    }

    /**
     * Create an instance of {@link Response.Status }
     * 
     */
    public Response.Status createResponseStatus() {
        return new Response.Status();
    }

    /**
     * Create an instance of {@link Response.Error }
     * 
     */
    public Response.Error createResponseError() {
        return new Response.Error();
    }

    /**
     * Create an instance of {@link Response.ContactOffice }
     * 
     */
    public Response.ContactOffice createResponseContactOffice() {
        return new Response.ContactOffice();
    }

    /**
     * Create an instance of {@link Response.Amendment }
     * 
     */
    public Response.Amendment createResponseAmendment() {
        return new Response.Amendment();
    }

    /**
     * Create an instance of {@link Response.AdditionalInformation }
     * 
     */
    public Response.AdditionalInformation createResponseAdditionalInformation() {
        return new Response.AdditionalInformation();
    }

    /**
     * Create an instance of {@link Response.AppealOffice }
     * 
     */
    public Response.AppealOffice createResponseAppealOffice() {
        return new Response.AppealOffice();
    }

    /**
     * Create an instance of {@link Response.Bank }
     * 
     */
    public Response.Bank createResponseBank() {
        return new Response.Bank();
    }

    /**
     * Create an instance of {@link Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment }
     * 
     */
    public Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment createResponseDeclarationGoodsShipmentGovernmentAgencyGoodsItemCommodityDutyTaxFeePayment() {
        return new Response.Declaration.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.DutyTaxFee.Payment();
    }

    /**
     * Create an instance of {@link Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee }
     * 
     */
    public Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee createResponseDeclarationDutyTaxFeePaymentObligationGuarantee() {
        return new Response.Declaration.DutyTaxFee.Payment.ObligationGuarantee();
    }

    /**
     * Create an instance of {@link Response.Status.Pointer }
     * 
     */
    public Response.Status.Pointer createResponseStatusPointer() {
        return new Response.Status.Pointer();
    }

    /**
     * Create an instance of {@link Response.Error.Pointer }
     * 
     */
    public Response.Error.Pointer createResponseErrorPointer() {
        return new Response.Error.Pointer();
    }

    /**
     * Create an instance of {@link Response.ContactOffice.Communication }
     * 
     */
    public Response.ContactOffice.Communication createResponseContactOfficeCommunication() {
        return new Response.ContactOffice.Communication();
    }

    /**
     * Create an instance of {@link Response.Amendment.Pointer }
     * 
     */
    public Response.Amendment.Pointer createResponseAmendmentPointer() {
        return new Response.Amendment.Pointer();
    }

    /**
     * Create an instance of {@link Response.AdditionalInformation.Pointer }
     * 
     */
    public Response.AdditionalInformation.Pointer createResponseAdditionalInformationPointer() {
        return new Response.AdditionalInformation.Pointer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.Declaration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "Declaration", scope = Response.class)
    public JAXBElement<Response.Declaration> createResponseDeclaration(Response.Declaration value) {
        return new JAXBElement<Response.Declaration>(_ResponseDeclaration_QNAME, Response.Declaration.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseFunctionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "FunctionCode", scope = Response.class)
    public JAXBElement<ResponseFunctionCodeType> createResponseFunctionCode(ResponseFunctionCodeType value) {
        return new JAXBElement<ResponseFunctionCodeType>(_ResponseFunctionCode_QNAME, ResponseFunctionCodeType.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseIssueDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "IssueDateTime", scope = Response.class)
    public JAXBElement<ResponseIssueDateTimeType> createResponseIssueDateTime(ResponseIssueDateTimeType value) {
        return new JAXBElement<ResponseIssueDateTimeType>(_ResponseIssueDateTime_QNAME, ResponseIssueDateTimeType.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "Error", scope = Response.class)
    public JAXBElement<Response.Error> createResponseError(Response.Error value) {
        return new JAXBElement<Response.Error>(_ResponseError_QNAME, Response.Error.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.Amendment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "Amendment", scope = Response.class)
    public JAXBElement<Response.Amendment> createResponseAmendment(Response.Amendment value) {
        return new JAXBElement<Response.Amendment>(_ResponseAmendment_QNAME, Response.Amendment.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.AppealOffice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "AppealOffice", scope = Response.class)
    public JAXBElement<Response.AppealOffice> createResponseAppealOffice(Response.AppealOffice value) {
        return new JAXBElement<Response.AppealOffice>(_ResponseAppealOffice_QNAME, Response.AppealOffice.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.ContactOffice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "ContactOffice", scope = Response.class)
    public JAXBElement<Response.ContactOffice> createResponseContactOffice(Response.ContactOffice value) {
        return new JAXBElement<Response.ContactOffice>(_ResponseContactOffice_QNAME, Response.ContactOffice.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseFunctionalReferenceIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "FunctionalReferenceID", scope = Response.class)
    public JAXBElement<ResponseFunctionalReferenceIDType> createResponseFunctionalReferenceID(ResponseFunctionalReferenceIDType value) {
        return new JAXBElement<ResponseFunctionalReferenceIDType>(_ResponseFunctionalReferenceID_QNAME, ResponseFunctionalReferenceIDType.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.Bank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "Bank", scope = Response.class)
    public JAXBElement<Response.Bank> createResponseBank(Response.Bank value) {
        return new JAXBElement<Response.Bank>(_ResponseBank_QNAME, Response.Bank.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.AdditionalInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "AdditionalInformation", scope = Response.class)
    public JAXBElement<Response.AdditionalInformation> createResponseAdditionalInformation(Response.AdditionalInformation value) {
        return new JAXBElement<Response.AdditionalInformation>(_ResponseAdditionalInformation_QNAME, Response.AdditionalInformation.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response.Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:wco:datamodel:WCO:RES-DMS:2", name = "Status", scope = Response.class)
    public JAXBElement<Response.Status> createResponseStatus(Response.Status value) {
        return new JAXBElement<Response.Status>(_ResponseStatus_QNAME, Response.Status.class, Response.class, value);
    }

}
