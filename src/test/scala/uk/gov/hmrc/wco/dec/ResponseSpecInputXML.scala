package uk.gov.hmrc.wco.dec

import uk.gov.hmrc.wco.dec.ResponseSpec._

object ResponseSpecInputXML {

  lazy val noTagForOptionalField = ""

  lazy val noTagForOptionalSequence = ""

  lazy val noTagForNestedOptionalSequence = ""

  lazy val emptyOptionalField = ""

  lazy val emptyOptionalSequence = ""

  lazy val emptyNestedOptionalSequence = ""


  lazy val wcoDataModelVersionCode =  "<MetaData xmlns=\"urn:wco:datamodel:WCO:DocumentMetaData-DMS:2\">" +
                                        "<WCODataModelVersionCode>" + version + "</WCODataModelVersionCode>" +
                                        exemplaryValidResponse +
                                      "</MetaData>"

  lazy val wcoTypeName = ""

  lazy val responsibleCountryCode = ""

  lazy val responsibleAgencyName = ""

  lazy val agencyAssignedCustomizationCode = ""

  lazy val agencyAssignedCustomizationVersionCode = ""


  lazy val responseFunctionCode = ""

  lazy val responseFunctionalReferenceID = ""

  lazy val responseIssueDateTime = ""

  lazy val responseAdditionalInformation = ""

  lazy val responseAmendments = ""

  lazy val responseAppealOffice = ""

  lazy val responseBank = ""

  lazy val responseContactOffices = ""

  lazy val responseErrors = ""

  lazy val responseStatus = ""

  lazy val responseDeclaration = ""

  lazy val responseDutyTaxFees =  "<MetaData xmlns=\"urn:wco:datamodel:WCO:DocumentMetaData-DMS:2\">" +
                                    "<wstxns1:Response xmlns:wstxns1=\"urn:wco:datamodel:WCO:RES-DMS:2\">" +
                                      "<wstxns1:FunctionCode>" + declarationFunctionCode + "</wstxns1:FunctionCode>" +
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

  lazy val responseGoodsShipment = ""


  private lazy val exemplaryValidResponse = "<wstxns1:Response xmlns:wstxns1=\"urn:wco:datamodel:WCO:RES-DMS:2\">" +
                                              "<wstxns1:FunctionCode>" + declarationFunctionCode + "</wstxns1:FunctionCode>" +
                                              "<wstxns1:FunctionalReferenceID>" + refId + "</wstxns1:FunctionalReferenceID>" +
                                              "<wstxns1:Declaration/>" +
                                            "</wstxns1:Response>"
}
