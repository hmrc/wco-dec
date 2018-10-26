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

import uk.gov.hmrc.wco.dec.input._

object ResponseSpec extends WcoSpec {
  val wcoDataModelVersionCode: String = randomString(6)
  val wcoTypeName: String = randomString(72)
  val responsibleCountryCode: String = randomISO3166Alpha2CountryCode
  val responsibleAgencyName: String = randomString(70)
  val agencyAssignedCustomizationCode: String = randomString(6)
  val agencyAssignedCustomizationVersionCode: String = randomString(3)

  val functionCode: Int = randomDeclarationFunctionCode
  val functionalReferenceId: String = "functionalRefId1"

  val dateTimeFormatCode: String = randomDateTimeFormatCode
  val dateTime: String = randomDateTimeString
  val issueTime: ResponseDateTimeElement = ResponseDateTimeElement(DateTimeString(dateTimeFormatCode, dateTime))

  val statementCode: String = randomString(10)
  val statementDescription: String = randomString(10)
  val statementTypeCode: String = randomString(3)

  val sequenceNumeric: Int = random0To9
  val documentSectionCode: String = 1.toString
  val tagId: String = randomString(4)
  val responsePointer: ResponsePointer = ResponsePointer(Some(sequenceNumeric), Some(documentSectionCode), Some(tagId))

  val changeReasonCode: String = randomString(3)
  val appealOfficeId: String = randomString(17)
  val bankReferenceId: String = randomString(17)
  val bankId: String = randomString(17)
  val contactOfficeId: String = randomString(17)
  val contactOfficeCommunicationId: String = randomString(50)
  val contactOfficeCommunicationTypeCode: String = randomString(3)
  val errorDescription: String = randomString(10)
  val errorValidationCode: String = randomString(8)
  val nameCode: String = randomString(3)

  val declarationId: String = randomString(70)
  val declarationVersionId: String = randomString(9)

  val refId: String = randomString(35)
  val currencyId: String = "GBP"
  val amountValue: BigDecimal = randomBigDecimal(100)
  val amount: Amount = Amount(Some(currencyId), Some(amountValue))

  val dutyRegimeCode: String = randomString(3)
  val unitCode: String = randomString(5)
  val measureValue: BigDecimal = randomBigDecimal(100)
  val measure: Measure = Measure(Some(unitCode), Some(measureValue))

  val taxRateNumeric: BigDecimal = randomBigDecimal(100)
  val typeCode: String = randomString(3)

  val exemplaryValidResponse = Response(functionCode, Some(functionalReferenceId))
}

class ResponseSpec extends WcoSpec with XmlBehaviours {
  import ResponseSpec._

  "to XML" should {
    "include WCODataModelVersionCode" in validResponseXmlScenario() {
      val meta = MetaData(wcoDataModelVersionCode = Some(wcoDataModelVersionCode), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, wcoDataModelVersionCode) { xml =>
        (xml \ "WCODataModelVersionCode").text.trim
      }
    }

    "include WCOTypeName" in validResponseXmlScenario() {
      val meta = MetaData(wcoTypeName = Some(wcoTypeName), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, wcoTypeName) { xml =>
        (xml \ "WCOTypeName").text.trim
      }
    }

    "include ResponsibleCountryCode" in validResponseXmlScenario() {
      val meta = MetaData(responsibleCountryCode = Some(responsibleCountryCode), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, responsibleCountryCode) { xml =>
        (xml \ "ResponsibleCountryCode").text.trim
      }
    }

    "include ResponsibleAgencyName" in validResponseXmlScenario() {
      val meta = MetaData(responsibleAgencyName = Some(responsibleAgencyName), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, responsibleAgencyName) { xml =>
        (xml \ "ResponsibleAgencyName").text.trim
      }
    }

    "include AgencyAssignedCustomizationCode" in validResponseXmlScenario() {
      val meta = MetaData(agencyAssignedCustomizationCode = Some(agencyAssignedCustomizationCode), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, agencyAssignedCustomizationCode) { xml =>
        (xml \ "AgencyAssignedCustomizationCode").text.trim
      }
    }

    "include AgencyAssignedCustomizationVersionCode" in validResponseXmlScenario() {
      val meta = MetaData(agencyAssignedCustomizationVersionCode = Some(agencyAssignedCustomizationVersionCode), response = Seq(randomValidResponse))
      hasExpectedOutput(meta, agencyAssignedCustomizationVersionCode) { xml =>
        (xml \ "AgencyAssignedCustomizationVersionCode").text.trim
      }
    }

    "include FunctionCode" in validResponseXmlScenario() {
      val meta = MetaData(response = Seq(
        Response(functionCode, Some(functionalReferenceId), declaration = Some(ResponseDeclaration()))
      ))

      hasExpectedOutput(meta, functionCode) { xml =>
        (xml \ "Response" \ "FunctionCode").text.trim.toInt
      }
    }

    "include FunctionalReferenceID" in validResponseXmlScenario() {
      val meta = MetaData(response = Seq(
        Response(functionCode, Some(functionalReferenceId), declaration = Some(ResponseDeclaration()))
      ))

      hasExpectedOutput(meta, functionalReferenceId) { xml =>
        (xml \ "Response" \ "FunctionCode").text.trim.toInt
        (xml \ "Response" \ "FunctionalReferenceID").text.trim
      }
    }

    "include IssueDateTime" in validResponseXmlScenario() {
      val meta = MetaData(response = Seq(
        Response(functionCode, Some(functionalReferenceId), Some(issueTime), declaration = Some(ResponseDeclaration()))
      ))

      hasExpectedOutput(meta, Seq(dateTimeFormatCode, dateTime)) { xml =>
        Seq(
          (xml \ "Response" \ "IssueDateTime" \ "DateTimeString" \ "@formatCode").text.trim,
          (xml \ "Response" \ "IssueDateTime" \ "DateTimeString").text.trim
        )
      }
    }

    "include ResponseAdditionalInformation" in validResponseXmlScenario() {
      val responseAdditionalInformation = ResponseAdditionalInformation(Some(statementCode),
        Some(statementDescription), Some(issueTime), Some(statementTypeCode), Seq(responsePointer))

      val meta = MetaData(response = Seq(
        Response(functionCode, additionalInformation = Seq(responseAdditionalInformation),
          declaration = Some(ResponseDeclaration()))
      ))

      val expectedResponseAdditionalInformation: Seq[String] =
        Seq(statementCode, statementDescription, dateTime, statementTypeCode, sequenceNumeric.toString, documentSectionCode, tagId)

      hasExpectedOutput(meta, expectedResponseAdditionalInformation) { xml =>
        Seq(
          (xml \ "Response" \ "AdditionalInformation" \ "StatementCode").text.trim,
          (xml \ "Response" \ "AdditionalInformation" \ "StatementDescription").text.trim,
          (xml \ "Response" \ "AdditionalInformation" \ "LimitDateTime").text.trim,
          (xml \ "Response" \ "AdditionalInformation" \ "StatementTypeCode").text.trim,
          (xml \ "Response" \ "AdditionalInformation" \ "Pointer" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "AdditionalInformation" \ "Pointer" \ "DocumentSectionCode").text.trim,
          (xml \ "Response" \ "AdditionalInformation" \ "Pointer" \ "TagID").text.trim
        )
      }
    }

    "include ResponseAmendments" in validResponseXmlScenario() {
      val responseAmendments: Seq[ResponseAmendment] = Seq(ResponseAmendment(Some(changeReasonCode), Seq(responsePointer)))

      val meta = MetaData(response = Seq(
        Response(functionCode, amendments = responseAmendments, declaration = Some(ResponseDeclaration())))
      )

      val expectedResponseAmendment: Seq[String] =
        Seq(changeReasonCode, sequenceNumeric.toString, documentSectionCode, tagId)

      hasExpectedOutput(meta, expectedResponseAmendment) { xml =>
        Seq(
          (xml \ "Response" \ "Amendment" \ "ChangeReasonCode").text.trim,
          (xml \ "Response" \ "Amendment" \ "Pointer" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "Amendment" \ "Pointer" \ "DocumentSectionCode").text.trim,
          (xml \ "Response" \ "Amendment" \ "Pointer" \ "TagID").text.trim
        )
      }
    }

    "include AppealOffice" in validResponseXmlScenario() {
      val appealOffice = ResponseAppealOffice(Some(appealOfficeId))

      val meta = MetaData(response = Seq(
        Response(functionCode, appealOffice = Some(appealOffice), declaration = Some(ResponseDeclaration())))
      )

      hasExpectedOutput(meta, appealOfficeId) { xml =>
        (xml \ "Response" \ "AppealOffice" \ "ID").text.trim
      }
    }

    "include Bank" in validResponseXmlScenario() {
      val bank = ResponseBank(Some(bankReferenceId), Some(bankId))

      val meta = MetaData(response = Seq(
        Response(functionCode, bank = Some(bank), declaration = Some(ResponseDeclaration())))
      )

      val expectedResponseBank: Seq[String] = Seq(bankReferenceId, bankId)

      hasExpectedOutput(meta, expectedResponseBank) { xml =>
        Seq(
          (xml \ "Response" \ "Bank" \ "ReferenceID").text.trim,
          (xml \ "Response" \ "Bank" \ "ID").text.trim
        )
      }
    }

    "include ContactOffice" in validResponseXmlScenario() {
      val communication = ResponseCommunication(Some(contactOfficeCommunicationId), Some(contactOfficeCommunicationTypeCode))
      val contactOffice = ResponseContactOffice(Some(contactOfficeId), Seq(communication))

      val meta = MetaData(response = Seq(
        Response(functionCode, contactOffices = Seq(contactOffice), declaration = Some(ResponseDeclaration())))
      )

      val expectedContactOffice: Seq[String] = Seq(contactOfficeId, contactOfficeCommunicationId, contactOfficeCommunicationTypeCode)

      hasExpectedOutput(meta, expectedContactOffice) { xml =>
        Seq(
          (xml \ "Response" \ "ContactOffice" \ "ID").text.trim,
          (xml \ "Response" \ "ContactOffice" \ "Communication" \ "ID").text.trim,
          (xml \ "Response" \ "ContactOffice" \ "Communication" \ "TypeCode").text.trim
        )
      }
    }

    "include Error" in validResponseXmlScenario() {
      val error: ResponseError = ResponseError(Some(errorDescription), Some(errorValidationCode), Seq(responsePointer))

      val meta = MetaData(response = Seq(
        Response(functionCode, errors = Seq(error), declaration = Some(ResponseDeclaration())))
      )

      val expectedError: Seq[String] = Seq(errorDescription, errorValidationCode, responsePointer.sequenceNumeric.get.toString,
        responsePointer.documentSectionCode.get, responsePointer.tagId.get)

      hasExpectedOutput(meta, expectedError) { xml =>
        Seq(
          (xml \ "Response" \ "Error" \ "Description").text.trim,
          (xml \ "Response" \ "Error" \ "ValidationCode").text.trim,
          (xml \ "Response" \ "Error" \ "Pointer" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "Error" \ "Pointer" \ "DocumentSectionCode").text.trim,
          (xml \ "Response" \ "Error" \ "Pointer" \ "TagID").text.trim
        )
      }
    }

    "include Status" in validResponseXmlScenario() {
      val status: ResponseStatus = ResponseStatus(Some(issueTime), Some(nameCode), Some(issueTime), Seq(responsePointer))

      val meta = MetaData(response = Seq(
        Response(functionCode, status = Seq(status), declaration = Some(ResponseDeclaration())))
      )

      val expectedStatus: Seq[String] = Seq(dateTime, nameCode, dateTime, responsePointer.sequenceNumeric.get.toString,
        responsePointer.documentSectionCode.get, responsePointer.tagId.get)

      hasExpectedOutput(meta, expectedStatus) { xml =>
        Seq(
          (xml \ "Response" \ "Status" \ "EffectiveDateTime").text.trim,
          (xml \ "Response" \ "Status" \ "NameCode").text.trim,
          (xml \ "Response" \ "Status" \ "ReleaseDateTime").text.trim,
          (xml \ "Response" \ "Status" \ "Pointer" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "Status" \ "Pointer" \ "DocumentSectionCode").text.trim,
          (xml \ "Response" \ "Status" \ "Pointer" \ "TagID").text.trim
        )
      }
    }

    "include ResponseDeclaration" in validResponseXmlScenario() {
      val responseDeclaration: ResponseDeclaration = ResponseDeclaration(
        acceptanceDateTime = Some(issueTime),
        cancellationDateTime = Some(issueTime),
        functionalReferenceId = Some(functionalReferenceId),
        id = Some(declarationId),
        rejectionDateTime = Some(issueTime),
        versionID = Some(declarationVersionId)
      )

      val meta = MetaData(response = Seq(
        Response(functionCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: Seq[String] =
        Seq(dateTime, dateTime, functionalReferenceId, declarationId, dateTime, declarationVersionId)

      hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        Seq(
          (xml \ "Response" \ "Declaration" \ "AcceptanceDateTime").text.trim,
          (xml \ "Response" \ "Declaration" \ "CancellationDateTime").text.trim,
          (xml \ "Response" \ "Declaration" \ "FunctionalReferenceID").text.trim,
          (xml \ "Response" \ "Declaration" \ "ID").text.trim,
          (xml \ "Response" \ "Declaration" \ "RejectionDateTime").text.trim,
          (xml \ "Response" \ "Declaration" \ "VersionID").text.trim
        )
      }
    }

    "include DutyTaxFee" in validResponseXmlScenario() {
      val obligationGuarantee = ResponseObligationGuarantee(Some(refId))
      val responsePayment = ResponsePayment(Some(refId), Some(amount), Some(issueTime), Some(amount), Seq(obligationGuarantee))
      val responseDutyTaxFee = ResponseDutyTaxFee(Some(responsePayment))

      val responseDeclaration: ResponseDeclaration = ResponseDeclaration(
        dutyTaxFees = Seq(responseDutyTaxFee)
      )

      val meta = MetaData(response = Seq(
        Response(functionCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: Seq[String] =
        Seq(refId, amountValue.toString, dateTime, amountValue.toString, refId)

      hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        Seq(
          (xml \ "Response" \ "Declaration" \ "DutyTaxFee" \ "Payment" \ "ReferenceID").text.trim,
          (xml \ "Response" \ "Declaration" \ "DutyTaxFee" \ "Payment" \ "TaxAssessedAmount").text.trim,
          (xml \ "Response" \ "Declaration" \ "DutyTaxFee" \ "Payment" \ "DueDateTime").text.trim,
          (xml \ "Response" \ "Declaration" \ "DutyTaxFee" \ "Payment" \ "PaymentAmount").text.trim,
          (xml \ "Response" \ "Declaration" \ "DutyTaxFee" \ "Payment" \ "ObligationGuarantee" \ "ReferenceID").text.trim
        )
      }
    }

    "include GoodsShipment" in validResponseXmlScenario() {
      val payment = ResponseDutyTaxFeePayment(Some(amount), Some(amount))
      val commodityDutyTaxFees = ResponseCommodityDutyTaxFee(
        Some(amount), Some(amount), Some(dutyRegimeCode), Some(measure), Some(taxRateNumeric), Some(typeCode),
        Some(payment))
      val responseCommodity = ResponseCommodity(Seq(commodityDutyTaxFees))
      val responseGovernmentAgencyGoodsItem = ResponseGovernmentAgencyGoodsItem(sequenceNumeric, Some(responseCommodity))
      val responseGoodsShipment = ResponseGoodsShipment(Seq(responseGovernmentAgencyGoodsItem))

      val responseDeclaration = ResponseDeclaration(
        goodsShipment = Some(responseGoodsShipment)
      )

      val meta = MetaData(response = Seq(
        Response(functionCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: Seq[String] = Seq(sequenceNumeric.toString, amountValue.toString,
        amountValue.toString, dutyRegimeCode, measureValue.toString, taxRateNumeric.toString, typeCode,
        amountValue.toString, amountValue.toString)

      hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        Seq(
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "AdValoremTaxBaseAmount").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "DeductAmount").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "DutyRegimeCode").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "SpecificTaxBaseQuantity").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "TaxRateNumeric").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "TypeCode").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "Payment" \ "TaxAssessedAmount").text.trim,
          (xml \ "Response" \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "DutyTaxFee" \ "Payment" \ "PaymentAmount").text.trim
        )
      }
    }
  }

  "fromXml" when {
    "no tag present" should {
      "fill optional field with None" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestNoTagForOptionalField)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.issueDateTime must be(None)
      }

      "fill optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestNoTagForOptionalSequence)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.additionalInformation must be(empty)
      }

      "fill nested optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestNoTagForOptionalNestedSequence)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.declaration mustNot be(empty)
        val dutyTaxFees = actualMetaData.response.head.declaration.get.dutyTaxFees
        dutyTaxFees mustNot be(empty)
        dutyTaxFees.head.payment must be(defined)
        dutyTaxFees.head.payment.get.obligationGuarantees must be(empty)
      }
    }

    "value is not provided" should {
      "fill optional field with None" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestNoValueForOptionalField)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.issueDateTime must be(None)
      }

      "fill optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestNoValueForOptionalSequence)
        val expectedAdditionalInformation = ResponseAdditionalInformation()
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.additionalInformation mustNot be(empty)
        actualMetaData.response.head.additionalInformation.head must equal(expectedAdditionalInformation)
      }

      "fill nested optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestNoValueForOptionalNestedSequence)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.declaration mustNot be(empty)
        val dutyTaxFees = actualMetaData.response.head.declaration.get.dutyTaxFees
        dutyTaxFees mustNot be(empty)
        dutyTaxFees.head.payment must be(defined)
        dutyTaxFees.head.payment.get.obligationGuarantees mustNot be(empty)
        dutyTaxFees.head.payment.get.obligationGuarantees.head must equal(ResponseObligationGuarantee())
      }
    }

    "value is provided" should {
      "fill WCODataModelVersionCode" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestWCODataModelVersionCode)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.wcoDataModelVersionCode must be(defined)
        actualMetaData.wcoDataModelVersionCode.get must equal(wcoDataModelVersionCode)
      }

      "fill WCOTypeName" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestWCOTypeName)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.wcoTypeName must be(defined)
        actualMetaData.wcoTypeName.get must equal(wcoTypeName)
      }

      "fill ResponsibleCountryCode" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestResponsibleCountryCode)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.responsibleCountryCode must be(defined)
        actualMetaData.responsibleCountryCode.get must equal(responsibleCountryCode)

      }

      "fill ResponsibleAgencyName" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestResponsibleAgencyName)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.responsibleAgencyName must be(defined)
        actualMetaData.responsibleAgencyName.get must equal(responsibleAgencyName)
      }

      "fill AgencyAssignedCustomizationCode" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestAgencyAssignedCustomizationCode)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.agencyAssignedCustomizationCode must be(defined)
        actualMetaData.agencyAssignedCustomizationCode.get must equal(agencyAssignedCustomizationCode)
      }

      "fill AgencyAssignedCustomizationVersionCode" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestAgencyAssignedCustomizationVersionCode)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.agencyAssignedCustomizationVersionCode must be(defined)
        actualMetaData.agencyAssignedCustomizationVersionCode.get must equal(agencyAssignedCustomizationVersionCode)
      }

      "fill Response/FunctionCode" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestFunctionCode)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.functionCode must equal(functionCode)
      }

      "fill Response/FunctionalReferenceID" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestFunctionalReferenceID)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.functionalReferenceId mustNot be(empty)
        actualMetaData.response.head.functionalReferenceId.get must equal(functionalReferenceId)
      }

      "fill Response/IssueDateTime" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestIssueDateTime)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.issueDateTime mustNot be(empty)
        actualMetaData.response.head.issueDateTime.get must equal(issueTime)
      }

      "fill Response/AdditionalInformation" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestAdditionalInformation)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.additionalInformation mustNot be(empty)
        actualMetaData.response.head.additionalInformation.head.statementCode must be(defined)
        actualMetaData.response.head.additionalInformation.head.statementCode.get must equal(statementCode)
        actualMetaData.response.head.additionalInformation.head.statementDescription must be(defined)
        actualMetaData.response.head.additionalInformation.head.statementDescription.get must equal(statementDescription)
        actualMetaData.response.head.additionalInformation.head.limitDateTime.get must equal(issueTime)
        actualMetaData.response.head.additionalInformation.head.statementTypeCode must be(defined)
        actualMetaData.response.head.additionalInformation.head.statementTypeCode.get must equal(statementTypeCode)
        actualMetaData.response.head.additionalInformation.head.pointers mustNot be(empty)
        val actualPointer = actualMetaData.response.head.additionalInformation.head.pointers.head
        assertResponsePointers(responsePointer, actualPointer)
      }

      "fill Response/Amendment" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestAmendment)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.amendments mustNot be(empty)
        actualMetaData.response.head.amendments.head.changeReasonCode must be(defined)
        actualMetaData.response.head.amendments.head.changeReasonCode.get must equal(changeReasonCode)
        actualMetaData.response.head.amendments.head.pointers mustNot be(empty)
        val actualPointer = actualMetaData.response.head.amendments.head.pointers.head
        assertResponsePointers(responsePointer, actualPointer)
      }

      "fill Response/AppealOffice" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestAppealOffice)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.appealOffice must be(defined)
        actualMetaData.response.head.appealOffice.get.id must be(defined)
        actualMetaData.response.head.appealOffice.get.id.get must equal(appealOfficeId)
      }

      "fill Response/Bank" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestBank)
        val actualMetaData = MetaData.fromXml(inputXML)

        val expectedResponseBank = ResponseBank(Some(bankReferenceId), Some(bankId))

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.bank must be(defined)
        actualMetaData.response.head.bank.get must equal(expectedResponseBank)
      }

      "fill Response/ContactOffice" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestContactOffice)
        val actualMetaData = MetaData.fromXml(inputXML)

        val expectedResponseContactOffice = ResponseContactOffice(
          Some(contactOfficeId),
          Seq(ResponseCommunication(Some(contactOfficeCommunicationId), Some(contactOfficeCommunicationTypeCode)))
        )

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.contactOffices mustNot be(empty)
        actualMetaData.response.head.contactOffices.head must equal(expectedResponseContactOffice)
      }

      "fill Response/Error" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestError)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.errors mustNot be(empty)
        actualMetaData.response.head.errors.head.description must be(defined)
        actualMetaData.response.head.errors.head.description.get must equal(errorDescription)
        actualMetaData.response.head.errors.head.validationCode must be(defined)
        actualMetaData.response.head.errors.head.validationCode.get must equal(errorValidationCode)
        actualMetaData.response.head.errors.head.pointers mustNot be(empty)
        val actualPointer = actualMetaData.response.head.errors.head.pointers.head
        assertResponsePointers(responsePointer, actualPointer)
      }

      "fill Response/Status" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestStatus)
        val actualMetaData = MetaData.fromXml(inputXML)

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.status mustNot be(empty)
        actualMetaData.response.head.status.head.effectiveDateTime mustNot be(empty)
        actualMetaData.response.head.status.head.effectiveDateTime.get must equal(issueTime)
        actualMetaData.response.head.status.head.nameCode mustNot be(empty)
        actualMetaData.response.head.status.head.nameCode.get must equal(nameCode)
        actualMetaData.response.head.status.head.releaseDateTime mustNot be(empty)
        actualMetaData.response.head.status.head.releaseDateTime.get must equal(issueTime)
        actualMetaData.response.head.status.head.pointers mustNot be(empty)
        val actualPointer = actualMetaData.response.head.status.head.pointers.head
        assertResponsePointers(responsePointer, actualPointer)
      }

      "fill Response/Declaration without DutyTaxFee and GoodsShipment" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestRespDeclaration)
        val actualMetaData = MetaData.fromXml(inputXML)

        val expectedResponseDeclaration = ResponseDeclaration(
          acceptanceDateTime = Some(issueTime),
          cancellationDateTime = Some(issueTime),
          functionalReferenceId = Some(functionalReferenceId),
          id = Some(declarationId),
          rejectionDateTime = Some(issueTime),
          versionID = Some(declarationVersionId)
        )

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.declaration must be(defined)
        actualMetaData.response.head.declaration.get must equal(expectedResponseDeclaration)
      }

      "fill Response/Declaration/DutyTaxFee" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestRespDeclarationDutyTaxFee)
        val actualMetaData = MetaData.fromXml(inputXML)

        val expectedResponseDutyTaxFee = ResponseDutyTaxFee(
          Some(ResponsePayment(
            referenceId = Some(refId),
            taxAssessedAmount = Some(amount),
            dueDateTime = Some(issueTime),
            paymentAmount = Some(amount),
            obligationGuarantees = Seq(ResponseObligationGuarantee(
              referenceId = Some(refId)
            ))
          ))
        )

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.declaration must be(defined)
        actualMetaData.response.head.declaration.get.dutyTaxFees mustNot be(empty)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head must equal(expectedResponseDutyTaxFee)
      }

      "fill Response/Declaration/GoodsShipment" in {
        val inputXML = ResponseSpecInputXMLProvider.provideTestXMLFor(TestRespDeclarationGoodsShipment)
        val actualMetaData = MetaData.fromXml(inputXML)

        val expectedResponseGoodsShipment = ResponseGoodsShipment(
          Seq(ResponseGovernmentAgencyGoodsItem(
            sequenceNumeric = sequenceNumeric,
            Some(ResponseCommodity(
              Seq(ResponseCommodityDutyTaxFee(
                adValoremTaxBaseAmount = Some(amount),
                deductAmount = Some(amount),
                dutyRegimeCode = Some(dutyRegimeCode),
                specificTaxBaseQuantity = Some(measure),
                taxRateNumeric = Some(taxRateNumeric),
                typeCode = Some(typeCode),
                payment = Some(ResponseDutyTaxFeePayment(
                  taxAssessedAmount = Some(amount),
                  paymentAmount = Some(amount)
                ))
              ))
            ))
          ))
        )

        actualMetaData.response mustNot be(empty)
        actualMetaData.response.head.declaration must be(defined)
        actualMetaData.response.head.declaration.get.goodsShipment must be(defined)
        actualMetaData.response.head.declaration.get.goodsShipment.get must equal(expectedResponseGoodsShipment)
      }
    }
  }

  private def assertResponsePointers(expected: ResponsePointer, actual: ResponsePointer): Unit = {
    actual.sequenceNumeric mustNot be(empty)

    actual.sequenceNumeric.get must equal(expected.sequenceNumeric.get.toString)

    actual.documentSectionCode mustNot be(empty)
    actual.documentSectionCode.get must equal(expected.documentSectionCode.get)
    actual.tagId mustNot be(empty)
    actual.tagId.get must equal(expected.tagId.get)
  }
}
