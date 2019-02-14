/*
 * Copyright 2019 HM Revenue & Customs
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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

case class ResponseDateTimeElement(
  @JacksonXmlProperty(localName = "DateTimeString", namespace = NS.rs)
  dateTimeString: DateTimeString
)

case class ResponsePointer(
  @JacksonXmlProperty(localName = "SequenceNumeric", namespace = NS.res)
  @JsonDeserialize(contentAs = classOf[java.lang.Integer])
  sequenceNumeric: Option[Int] = None, // max 5 chars

  @JacksonXmlProperty(localName = "DocumentSectionCode", namespace = NS.res)
  documentSectionCode: Option[String] = None, // max 3 chars

  @JacksonXmlProperty(localName = "TagID", namespace = NS.res)
  tagId: Option[String] = None // max 4 chars
)

case class ResponseAmendment(
  @JacksonXmlProperty(localName = "ChangeReasonCode", namespace = NS.res)
  changeReasonCode: Option[String] = None, // max 3 chars

  @JacksonXmlProperty(localName = "Pointer", namespace = NS.res)
  pointers: Seq[ResponsePointer] = Seq.empty
)

case class Response(
  @JacksonXmlProperty(localName = "FunctionCode", namespace = NS.res)
  functionCode: String, // numeric max 2

  @JacksonXmlProperty(localName = "FunctionalReferenceID", namespace = NS.res)
  functionalReferenceId: Option[String] = None, // max 35 chars

  @JacksonXmlProperty(localName = "IssueDateTime", namespace = NS.res)
  issueDateTime: Option[ResponseDateTimeElement] = None, // max 35 chars

  @JacksonXmlProperty(localName = "AdditionalInformation", namespace = NS.res)
  additionalInformation: Seq[ResponseAdditionalInformation] = Seq.empty,

  @JacksonXmlProperty(localName = "Amendment", namespace = NS.res)
  amendments: Seq[ResponseAmendment] = Seq.empty,

  @JacksonXmlProperty(localName = "AppealOffice", namespace = NS.res)
  appealOffice: Option[ResponseAppealOffice] = None,

  @JacksonXmlProperty(localName = "Bank", namespace = NS.res)
  bank: Option[ResponseBank] = None,

  @JacksonXmlProperty(localName = "ContactOffice", namespace = NS.res)
  contactOffices: Seq[ResponseContactOffice] = Seq.empty,

  @JacksonXmlProperty(localName = "Error", namespace = NS.res)
  errors: Seq[ResponseError] = Seq.empty,

  @JacksonXmlProperty(localName = "Status", namespace = NS.res)
  status: Seq[ResponseStatus] = Seq.empty,

  @JacksonXmlProperty(localName = "Declaration", namespace = NS.res)
  declaration: Option[ResponseDeclaration] = None
)

case class ResponseAdditionalInformation(
  @JacksonXmlProperty(localName = "StatementCode", namespace = NS.res)
  statementCode: Option[String] = None, // max 17 chars

  @JacksonXmlProperty(localName = "StatementDescription", namespace = NS.res)
  statementDescription: Option[String] = None, // max 512 chars

  @JacksonXmlProperty(localName = "LimitDateTime", namespace = NS.res)
  limitDateTime: Option[ResponseDateTimeElement] = None, // alphanumeric max 35 chars

  @JacksonXmlProperty(localName = "StatementTypeCode", namespace = NS.res)
  statementTypeCode: Option[String] = None, // max 3 chars

  @JacksonXmlProperty(localName = "Pointer", namespace = NS.res)
  pointers: Seq[ResponsePointer] = Seq.empty
)

case class ResponseAppealOffice(
  @JacksonXmlProperty(localName = "ID", namespace = NS.res)
  id: Option[String] = None // max 17 chars
)

case class ResponseBank(
  @JacksonXmlProperty(localName = "ReferenceID", namespace = NS.res)
  referenceID: Option[String] = None, // max 17 chars

  @JacksonXmlProperty(localName = "ID", namespace = NS.res)
  id: Option[String] = None // max 17 chars
)

case class ResponseContactOffice(
  @JacksonXmlProperty(localName = "ID", namespace = NS.res)
  id: Option[String] = None, // max 17 chars

  @JacksonXmlProperty(localName = "Communication", namespace = NS.res)
  communications: Seq[ResponseCommunication] = Seq.empty
)

case class ResponseCommunication(
  @JacksonXmlProperty(localName = "ID", namespace = NS.res)
  id: Option[String] = None, // max 50 chars

  @JacksonXmlProperty(localName = "TypeCode", namespace = NS.res)
  typeCode: Option[String] = None // max 3 chars
)


case class ResponseError(
  @JacksonXmlProperty(localName = "Description", namespace = NS.res)
  description: Option[String] = None, // max 512 chars

  @JacksonXmlProperty(localName = "ValidationCode", namespace = NS.res)
  validationCode: Option[String] = None, // max 8 chars

  @JacksonXmlProperty(localName = "Pointer", namespace = NS.res)
  pointers: Seq[ResponsePointer] = Seq.empty
)

case class ResponseStatus(
  @JacksonXmlProperty(localName = "EffectiveDateTime", namespace = NS.res)
  effectiveDateTime: Option[ResponseDateTimeElement] = None,

  @JacksonXmlProperty(localName = "NameCode", namespace = NS.res)
  nameCode: Option[String] = None, //maxLength value="3"

  @JacksonXmlProperty(localName = "ReleaseDateTime", namespace = NS.res)
  releaseDateTime: Option[ResponseDateTimeElement] = None, // alphanumeric max 35 chars

  @JacksonXmlProperty(localName = "Pointer", namespace = NS.res)
  pointers: Seq[ResponsePointer] = Seq.empty
)

case class ResponseDeclaration(
  @JacksonXmlProperty(localName = "AcceptanceDateTime", namespace = NS.res)
  acceptanceDateTime: Option[ResponseDateTimeElement] = None, // alphanumeric max 35 chars

  @JacksonXmlProperty(localName = "CancellationDateTime", namespace = NS.res)
  cancellationDateTime: Option[ResponseDateTimeElement] = None,

  @JacksonXmlProperty(localName = "FunctionalReferenceID", namespace = NS.res)
  functionalReferenceId: Option[String] = None, // max 35 chars

  @JacksonXmlProperty(localName = "ID", namespace = NS.res)
  id: Option[String] = None, // max 35 chars

  @JacksonXmlProperty(localName = "RejectionDateTime", namespace = NS.res)
  rejectionDateTime: Option[ResponseDateTimeElement] = None,

  @JacksonXmlProperty(localName = "VersionID", namespace = NS.res)
  versionID: Option[String] = None, // max 9 chars

  @JacksonXmlProperty(localName = "DutyTaxFee", namespace = NS.res)
  dutyTaxFees: Seq[ResponseDutyTaxFee] = Seq.empty,

  @JacksonXmlProperty(localName = "GoodsShipment", namespace = NS.res)
  goodsShipment: Option[ResponseGoodsShipment] = None
)

case class ResponseDutyTaxFee(
  @JacksonXmlProperty(localName = "Payment", namespace = NS.res)
  payment: Option[ResponsePayment] = None
)

case class ResponsePayment(
  @JacksonXmlProperty(localName = "ReferenceID", namespace = NS.res)
  referenceId: Option[String] = None, // max 35 chars)

  @JacksonXmlProperty(localName = "TaxAssessedAmount", namespace = NS.res)
  taxAssessedAmount: Option[Amount] = None,

  @JacksonXmlProperty(localName = "DueDateTime", namespace = NS.res)
  dueDateTime: Option[ResponseDateTimeElement] = None,

  @JacksonXmlProperty(localName = "PaymentAmount", namespace = NS.res)
  paymentAmount: Option[Amount] = None,

  @JacksonXmlProperty(localName = "ObligationGuarantee", namespace = NS.res)
  obligationGuarantees: Seq[ResponseObligationGuarantee] = Seq.empty
)

case class ResponseObligationGuarantee(
  @JacksonXmlProperty(localName = "ReferenceID", namespace = NS.res)
  referenceId: Option[String] = None // max 35 chars
)

case class ResponseGoodsShipment(
  @JacksonXmlProperty(localName = "GovernmentAgencyGoodsItem", namespace = NS.res)
  governmentAgencyGoodsItems: Seq[ResponseGovernmentAgencyGoodsItem] = Seq.empty
)

case class ResponseGovernmentAgencyGoodsItem(
  @JacksonXmlProperty(localName = "SequenceNumeric", namespace = NS.res)
  sequenceNumeric: Int, // max 5 chars

  @JacksonXmlProperty(localName = "Commodity", namespace = NS.res)
  commodity: Option[ResponseCommodity] = None
)

case class ResponseCommodity(
  @JacksonXmlProperty(localName = "DutyTaxFee", namespace = NS.res)
  dutyTaxFees: Seq[ResponseCommodityDutyTaxFee] = Seq.empty
)

case class ResponseCommodityDutyTaxFee(
  @JacksonXmlProperty(localName = "AdValoremTaxBaseAmount", namespace = NS.res)
  adValoremTaxBaseAmount: Option[Amount] = None,

  @JacksonXmlProperty(localName = "DeductAmount", namespace = NS.res)
  deductAmount: Option[Amount] = None,

  @JacksonXmlProperty(localName = "DutyRegimeCode", namespace = NS.res)
  dutyRegimeCode: Option[String] = None, // max 3 chars

  @JacksonXmlProperty(localName = "SpecificTaxBaseQuantity", namespace = NS.res)
  specificTaxBaseQuantity: Option[Measure] = None,

  @JacksonXmlProperty(localName = "TaxRateNumeric", namespace = NS.res)
  taxRateNumeric: Option[BigDecimal] = None, // scale 17 precision 3

  @JacksonXmlProperty(localName = "TypeCode", namespace = NS.res)
  typeCode: Option[String] = None, // max 3 chars

  @JacksonXmlProperty(localName = "Payment", namespace = NS.res)
  payment: Option[ResponseDutyTaxFeePayment] = None
)

case class ResponseDutyTaxFeePayment(
  @JacksonXmlProperty(localName = "TaxAssessedAmount", namespace = NS.res)
  taxAssessedAmount: Option[Amount] = None,

  @JacksonXmlProperty(localName = "PaymentAmount", namespace = NS.res)
  paymentAmount: Option[Amount] = None
)