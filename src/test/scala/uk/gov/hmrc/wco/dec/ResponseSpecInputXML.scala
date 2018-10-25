/*
 * Copyright 2018 HM Revenue & Customs
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

package uk.gov.hmrc.wco.dec

import uk.gov.hmrc.wco.dec.ResponseSpec._

object ResponseSpecInputXML {

  lazy val testNoTagForOptionalField = ""

  lazy val testNoTagForOptionalSequence = ""

  lazy val testNoTagForNestedOptionalSequence = ""

  lazy val testEmptyOptionalField = ""

  lazy val testEmptyOptionalSequence = ""

  lazy val testEmptyNestedOptionalSequence = ""


  lazy val testWCODataModelVersionCode =
    "<MetaData xmlns=\"urn:wco:datamodel:WCO:DocumentMetaData-DMS:2\">" +
      "<WCODataModelVersionCode>" + wcoDataModelVersionCode + "</WCODataModelVersionCode>" +
      exemplaryValidResponse +
    "</MetaData>"

  lazy val testWCOTypeName = ""

  lazy val testResponsibleCountryCode = ""

  lazy val testResponsibleAgencyName = ""

  lazy val testAgencyAssignedCustomizationCode = ""

  lazy val testAgencyAssignedCustomizationVersionCode = ""


  lazy val testResponseMandatoryFields = ""

  lazy val testResponseIssueDateTime = ""

  lazy val testResponseAdditionalInformation = ""

  lazy val testResponseAmendments = ""

  lazy val testResponseAppealOffice = ""

  lazy val testResponseBank = ""

  lazy val testResponseContactOffice = ""

  lazy val testResponseErrors = ""

  lazy val testResponseStatus = ""

  lazy val testResponseDeclaration = ""

  lazy val testResponseDutyTaxFees =  "<MetaData xmlns=\"urn:wco:datamodel:WCO:DocumentMetaData-DMS:2\">" +
                                        "<wstxns1:Response xmlns:wstxns1=\"urn:wco:datamodel:WCO:RES-DMS:2\">" +
                                          "<wstxns1:FunctionCode>" + functionCode + "</wstxns1:FunctionCode>" +
                                          "<wstxns1:Declaration>" +
                                            "<wstxns1:GoodsShipment>" +
                                              "<wstxns1:GovernmentAgencyGoodsItem>" +
                                                "<wstxns1:SequenceNumeric>" + responseGovernmentAgencyGoodsItem.sequenceNumeric + "</wstxns1:SequenceNumeric>" +
                                                "<wstxns1:Commodity>" +
                                                  "<wstxns1:DutyTaxFee>" +
                                                    "<wstxns1:AdValoremTaxBaseAmount currencyID=\"GBP\">" + amountValue + "</wstxns1:AdValoremTaxBaseAmount>" +
                                                    "<wstxns1:DeductAmount currencyID=\"GBP\">" + amountValue + "</wstxns1:DeductAmount>" +
                                                    "<wstxns1:DutyRegimeCode>" + dutyRegimeCode + "</wstxns1:DutyRegimeCode>" +
                                                    "<wstxns1:SpecificTaxBaseQuantity unitCode=\"" + unitCode + "\">" + measureValue + "</wstxns1:SpecificTaxBaseQuantity>" +
                                                    "<wstxns1:TaxRateNumeric>" + taxRateNumeric + "</wstxns1:TaxRateNumeric>" +
                                                    "<wstxns1:TypeCode>" + typeCode + "</wstxns1:TypeCode>" +
                                                    "<wstxns1:Payment>" +
                                                      "<wstxns1:TaxAssessedAmount currencyID=\"GBP\">" + amountValue + "</wstxns1:TaxAssessedAmount>" +
                                                      "<wstxns1:PaymentAmount currencyID=\"GBP\">" + amountValue + "</wstxns1:PaymentAmount>" +
                                                    "</wstxns1:Payment>" +
                                                  "</wstxns1:DutyTaxFee>" +
                                                "</wstxns1:Commodity>" +
                                              "</wstxns1:GovernmentAgencyGoodsItem>" +
                                            "</wstxns1:GoodsShipment>" +
                                          "</wstxns1:Declaration>" +
                                        "</wstxns1:Response>" +
                                      "</MetaData>"

  lazy val testResponseGoodsShipment = ""


  private lazy val exemplaryValidResponse = "<wstxns1:Response xmlns:wstxns1=\"urn:wco:datamodel:WCO:RES-DMS:2\">" +
                                              "<wstxns1:FunctionCode>" + functionCode + "</wstxns1:FunctionCode>" +
                                              "<wstxns1:FunctionalReferenceID>" + functionalReferenceId + "</wstxns1:FunctionalReferenceID>" +
                                              "<wstxns1:Declaration/>" +
                                            "</wstxns1:Response>"
}
