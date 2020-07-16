/*
 * Copyright 2020 HM Revenue & Customs
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

package uk.gov.hmrc.wco.dec.input

import uk.gov.hmrc.wco.dec.ResponseSpec._

object ResponseSpecInputXMLProvider {

  def provideTestXMLFor(testName: String): String =
    metaDataOpeningTag + testXMLContentMap(testName) + metaDataClosingTag

  private val metaDataOpeningTag =
    "<MetaData xmlns=\"urn:wco:datamodel:WCO:DocumentMetaData-DMS:2\" " +
              "xmlns:response=\"urn:wco:datamodel:WCO:RES-DMS:2\" " +
              "xmlns:responseDs=\"urn:wco:datamodel:WCO:Response_DS:DMS:2\">"
  private val metaDataClosingTag = "</MetaData>"

  private val responseOpeningTag = "<response:Response>"
  private val responseClosingTag = "</response:Response>"
  private val responseFunctionCodeTag = "<response:FunctionCode>" + functionCode + "</response:FunctionCode>"
  private val validExemplaryResponse = responseOpeningTag + responseFunctionCodeTag + responseClosingTag
  private val responseDateTimeString =
    "<responseDs:DateTimeString formatCode=\"" + dateTimeFormatCode + "\">" + dateTime + "</responseDs:DateTimeString>"
  private val responsePointer =
    "<response:Pointer>" +
      "<response:SequenceNumeric>" + sequenceNumeric + "</response:SequenceNumeric>" +
      "<response:DocumentSectionCode>" + documentSectionCode + "</response:DocumentSectionCode>" +
      "<response:TagID>" + tagId + "</response:TagID>" +
    "</response:Pointer>"


  private val testNoTagForOptionalField = validExemplaryResponse

  private val testNoTagForOptionalSequence = validExemplaryResponse

  private val testNoTagForNestedOptionalSequence =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Declaration>" +
        "<response:DutyTaxFee>" +
          "<response:Payment>" +
            "<response:ReferenceID/>" +
          "</response:Payment>" +
        "</response:DutyTaxFee>" +
      "</response:Declaration>" +
    responseClosingTag

  private val testEmptyOptionalField =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:IssueDateTime/>" +
    responseClosingTag

  private val testEmptyOptionalSequence =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:AdditionalInformation/>" +
    responseClosingTag

  private val testEmptyNestedOptionalSequence =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Declaration>" +
        "<response:DutyTaxFee>" +
          "<response:Payment>" +
            "<response:ObligationGuarantee/>" +
          "</response:Payment>" +
        "</response:DutyTaxFee>" +
      "</response:Declaration>" +
    responseClosingTag


  private val testWCODataModelVersionCode =
    "<WCODataModelVersionCode>" + wcoDataModelVersionCode + "</WCODataModelVersionCode>" +
    validExemplaryResponse

  private val testWCOTypeName =
    "<WCOTypeName>" + wcoTypeName + "</WCOTypeName>" +
    validExemplaryResponse

  private val testResponsibleCountryCode =
    "<ResponsibleCountryCode>" + responsibleCountryCode + "</ResponsibleCountryCode>" +
    validExemplaryResponse

  private val testResponsibleAgencyName =
    "<ResponsibleAgencyName>" + responsibleAgencyName + "</ResponsibleAgencyName>" +
    validExemplaryResponse

  private val testAgencyAssignedCustomizationCode =
    "<AgencyAssignedCustomizationCode>" + agencyAssignedCustomizationCode + "</AgencyAssignedCustomizationCode>" +
    validExemplaryResponse

  private val testAgencyAssignedCustomizationVersionCode =
    "<AgencyAssignedCustomizationVersionCode>" + agencyAssignedCustomizationVersionCode +
      "</AgencyAssignedCustomizationVersionCode>" +
    validExemplaryResponse


  private val testResponseFunctionCode =
    responseOpeningTag +
      "<response:FunctionCode>" + functionCode + "</response:FunctionCode>" +
    responseClosingTag

  private val testResponseFunctionalId =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:FunctionalReferenceID>" + functionalReferenceId + "</response:FunctionalReferenceID>" +
    responseClosingTag

  private val testResponseIssueDateTime =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:IssueDateTime>" +
        responseDateTimeString +
      "</response:IssueDateTime>" +
    responseClosingTag

  private val testResponseAdditionalInformation =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:AdditionalInformation>" +
        "<response:StatementCode>" + statementCode + "</response:StatementCode>" +
        "<response:StatementDescription>" + statementDescription + "</response:StatementDescription>" +
        "<response:LimitDateTime>" +
          responseDateTimeString +
        "</response:LimitDateTime>" +
        "<response:StatementTypeCode>" + statementTypeCode + "</response:StatementTypeCode>" +
        responsePointer +
      "</response:AdditionalInformation>" +
    responseClosingTag

  private val testResponseAmendments =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Amendment>" +
        "<response:ChangeReasonCode>" + changeReasonCode + "</response:ChangeReasonCode>" +
        responsePointer +
      "</response:Amendment>" +
    responseClosingTag

  private val testResponseAppealOffice =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:AppealOffice>" +
        "<response:ID>" + appealOfficeId + "</response:ID>" +
      "</response:AppealOffice>" +
    responseClosingTag

  private val testResponseBank =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Bank>" +
        "<response:ReferenceID>" + bankReferenceId + "</response:ReferenceID>" +
        "<response:ID>" + bankId + "</response:ID>" +
      "</response:Bank>" +
    responseClosingTag

  private val testResponseContactOffice =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:ContactOffice>" +
        "<response:ID>" + contactOfficeId + "</response:ID>" +
        "<response:Communication>" +
          "<response:ID>" + contactOfficeCommunicationId + "</response:ID>" +
          "<response:TypeCode>" + contactOfficeCommunicationTypeCode + "</response:TypeCode>" +
        "</response:Communication>" +
      "</response:ContactOffice>" +
    responseClosingTag

  private val testResponseError =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Error>" +
        "<response:Description>" + errorDescription + "</response:Description>" +
        "<response:ValidationCode>" + errorValidationCode + "</response:ValidationCode>" +
        responsePointer +
      "</response:Error>" +
    responseClosingTag

  private val testResponseStatus =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Status>" +
        "<response:EffectiveDateTime>" +
          responseDateTimeString +
        "</response:EffectiveDateTime>" +
        "<response:NameCode>" + nameCode + "</response:NameCode>" +
        "<response:ReleaseDateTime>" +
          responseDateTimeString +
        "</response:ReleaseDateTime>" +
        responsePointer +
      "</response:Status>" +
    responseClosingTag

  private val testResponseDeclaration =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Declaration>" +
        "<response:AcceptanceDateTime>" +
          responseDateTimeString +
        "</response:AcceptanceDateTime>" +
        "<response:CancellationDateTime>" +
          responseDateTimeString +
        "</response:CancellationDateTime>" +
        "<response:FunctionalReferenceID>" + functionalReferenceId + "</response:FunctionalReferenceID>" +
        "<response:ID>" + declarationId + "</response:ID>" +
        "<response:RejectionDateTime>" +
          responseDateTimeString +
        "</response:RejectionDateTime>" +
        "<response:VersionID>" + declarationVersionId + "</response:VersionID>" +
      "</response:Declaration>" +
    responseClosingTag

  private val testResponseDutyTaxFee =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Declaration>" +
        "<response:DutyTaxFee>" +
          "<response:Payment>" +
            "<response:ReferenceID>" + refId + "</response:ReferenceID>" +
            "<response:TaxAssessedAmount currencyID=\"" + currencyId + "\">" + amountValue +
              "</response:TaxAssessedAmount>" +
            "<response:DueDateTime>" +
              responseDateTimeString +
            "</response:DueDateTime>" +
            "<response:PaymentAmount currencyID=\"" + currencyId + "\">" + amountValue + "</response:PaymentAmount>" +
            "<response:ObligationGuarantee>" +
              "<response:ReferenceID>" + refId + "</response:ReferenceID>" +
            "</response:ObligationGuarantee>" +
          "</response:Payment>" +
        "</response:DutyTaxFee>" +
      "</response:Declaration>" +
    responseClosingTag

  private val testResponseGoodsShipment =
    responseOpeningTag +
      responseFunctionCodeTag +
      "<response:Declaration>" +
        "<response:GoodsShipment>" +
          "<response:GovernmentAgencyGoodsItem>" +
            "<response:SequenceNumeric>" + sequenceNumeric + "</response:SequenceNumeric>" +
            "<response:Commodity>" +
              "<response:DutyTaxFee>" +
                "<response:AdValoremTaxBaseAmount currencyID=\"" + currencyId + "\">" + amountValue +
                  "</response:AdValoremTaxBaseAmount>" +
                "<response:DeductAmount currencyID=\"" + currencyId + "\">" + amountValue +
                  "</response:DeductAmount>" +
                "<response:DutyRegimeCode>" + dutyRegimeCode + "</response:DutyRegimeCode>" +
                "<response:SpecificTaxBaseQuantity unitCode=\"" + unitCode + "\">" + measureValue +
                  "</response:SpecificTaxBaseQuantity>" +
                "<response:TaxRateNumeric>" + taxRateNumeric + "</response:TaxRateNumeric>" +
                "<response:TypeCode>" + typeCode + "</response:TypeCode>" +
                "<response:Payment>" +
                  "<response:TaxAssessedAmount currencyID=\"" + currencyId + "\">" + amountValue +
                    "</response:TaxAssessedAmount>" +
                  "<response:PaymentAmount currencyID=\"" + currencyId + "\">" + amountValue +
                    "</response:PaymentAmount>" +
                "</response:Payment>" +
              "</response:DutyTaxFee>" +
            "</response:Commodity>" +
          "</response:GovernmentAgencyGoodsItem>" +
        "</response:GoodsShipment>" +
      "</response:Declaration>" +
    responseClosingTag


  private val testXMLContentMap: Map[String, String] = Map(
    "TestNoTagForOptionalField" -> testNoTagForOptionalField,
    "TestNoTagForOptionalSequence" -> testNoTagForOptionalSequence,
    "TestNoTagForOptionalNestedSequence" -> testNoTagForNestedOptionalSequence,
    "TestNoValueForOptionalField" -> testEmptyOptionalField,
    "TestNoValueForOptionalSequence" -> testEmptyOptionalSequence,
    "TestNoValueForOptionalNestedSequence"-> testEmptyNestedOptionalSequence,

    "TestWCODataModelVersionCode" -> testWCODataModelVersionCode,
    "TestWCOTypeName" -> testWCOTypeName,
    "TestResponsibleCountryCode" -> testResponsibleCountryCode,
    "TestResponsibleAgencyName" -> testResponsibleAgencyName,
    "TestAgencyAssignedCustomizationCode" -> testAgencyAssignedCustomizationCode,
    "TestAgencyAssignedCustomizationVersionCode" -> testAgencyAssignedCustomizationVersionCode,

    "TestFunctionCode" -> testResponseFunctionCode,
    "TestFunctionalReferenceID" -> testResponseFunctionalId,
    "TestIssueDateTime" -> testResponseIssueDateTime,
    "TestAdditionalInformation" -> testResponseAdditionalInformation,
    "TestAmendment" -> testResponseAmendments,
    "TestAppealOffice" -> testResponseAppealOffice,
    "TestBank" -> testResponseBank,
    "TestContactOffice" -> testResponseContactOffice,
    "TestError" -> testResponseError,
    "TestStatus" -> testResponseStatus,
    "TestRespDeclaration" -> testResponseDeclaration,
    "TestRespDeclarationDutyTaxFee" -> testResponseDutyTaxFee,
    "TestRespDeclarationGoodsShipment" -> testResponseGoodsShipment
  )
}
