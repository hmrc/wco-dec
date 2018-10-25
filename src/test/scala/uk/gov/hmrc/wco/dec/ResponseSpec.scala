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

object ResponseSpec extends WcoSpec {
  val wcoDataModelVersionCode = randomString(6)
  val wcoTypeName = randomString(72)
  val responsibleCountryCode = randomISO3166Alpha2CountryCode
  val responsibleAgencyName = randomString(70)
  val agencyAssignedCustomizationCode = randomString(6)
  val agencyAssignedCustomizationVersionCode = randomString(3)


  val functionCode = randomDeclarationFunctionCode
  val functionalReferenceId = "functionalRefId1"

  val dateTimeFormatCode = randomDateTimeFormatCode
  val dateTime = randomDateTimeString
  val issueTime = Some(ResponseDateTimeElement(DateTimeString(dateTimeFormatCode, dateTime)))

  val statementCode = randomString(10)
  val statementDescription = randomString(10)
  val statementTypeCode = randomString(3)

  val sequenceNumeric = random0To9
  val documentSectionCode = 1.toString
  val tagId = randomString(4)
  val responsePointer = ResponsePointer(Some(sequenceNumeric), Some(documentSectionCode), Some(tagId))

  val changeReasonCode = randomString(3)
  val appealOfficeId = randomString(17)
  val bankReferenceId = randomString(17)
  val bankId = randomString(17)
  val contactOfficeId = randomString(17)
  val contactOfficeCommunicationId = randomString(50)
  val contactOfficeCommunicationTypeCode = randomString(3)
  val errorDescription = randomString(10)
  val errorValidationCode = randomString(8)
  val nameCode = randomString(3)


  val id = randomString(70)
  val versionId = randomString(9)

  val referenceId = randomString(35)
  val currencyId = "GBP"
  val amountValue = randomBigDecimal(100)
  val amount = Amount(Some(currencyId), Some(amountValue))
  val obligationGuarantee = ResponseObligationGuarantee(Some(referenceId))
  val responsePayment = ResponsePayment(Some(referenceId), Some(amount), issueTime, Some(amount), Seq(obligationGuarantee))
  val responseDutyTaxFee = ResponseDutyTaxFee(Some(responsePayment))

  val dutyRegimeCode = randomString(3)
  val unitCode = randomString(5)
  val measureValue = randomBigDecimal(100)
  val taxRateNumeric = randomBigDecimal(100)
  val typeCode = randomString(3)
  val payment = ResponseDutyTaxFeePayment(Some(amount), Some(amount))

  val measure = Measure(Some(unitCode), Some(measureValue))
  val commodityDutyTaxFees = ResponseCommodityDutyTaxFee(Some(amount), Some(amount), Some(dutyRegimeCode), Some(measure),
    Some(taxRateNumeric), Some(typeCode), Some(payment))
  val responseCommodity = ResponseCommodity(Seq(commodityDutyTaxFees))
  val responseGovernmentAgencyGoodsItem = ResponseGovernmentAgencyGoodsItem(sequenceNumeric, Some(responseCommodity))
  val governmentAgencyGoodsItems = Seq(responseGovernmentAgencyGoodsItem)
  val responseGoodsShipment = ResponseGoodsShipment(governmentAgencyGoodsItems)

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
        Response(functionCode, Some(functionalReferenceId), issueTime, declaration = Some(ResponseDeclaration()))
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
        Some(statementDescription), issueTime, Some(statementTypeCode), Seq(responsePointer))

      val meta = MetaData(response = Seq(
        Response(functionCode, additionalInformation = Seq(responseAdditionalInformation),
          declaration = Some(ResponseDeclaration()))
      ))

      val expectedResponseAdditionalInformation: Seq[String] =
        Seq(statementCode, statementDescription, dateTime, statementTypeCode, sequenceNumeric.toString(), documentSectionCode, tagId)

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
      val status: ResponseStatus = ResponseStatus(issueTime, Some(nameCode), issueTime, Seq(responsePointer))

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
        acceptanceDateTime = issueTime,
        cancellationDateTime = issueTime,
        functionalReferenceId = Some(functionalReferenceId),
        id = Some(id),
        rejectionDateTime = issueTime,
        versionID = Some(versionId)
      )

      val meta = MetaData(response = Seq(
        Response(functionCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: Seq[String] =
        Seq(dateTime, dateTime, functionalReferenceId, id, dateTime, versionId)

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
      val responseDeclaration: ResponseDeclaration = ResponseDeclaration(
        dutyTaxFees = Seq(responseDutyTaxFee)
      )

      val meta = MetaData(response = Seq(
        Response(functionCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: Seq[String] =
        Seq(referenceId, amountValue.toString, dateTime, amountValue.toString, referenceId)

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
        val inputXML = ResponseSpecInputXML.testNoTagForOptionalField
        val actualMetaData = MetaData.fromXml(inputXML)
        actualMetaData.response.nonEmpty must be(true)
        actualMetaData.response.head.issueDateTime must be (None)
      }

      "fill optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXML.testEmptyOptionalSequence
        val actualMetaData = MetaData.fromXml(inputXML)
        actualMetaData.response.nonEmpty must be(true)
        actualMetaData.response.head.additionalInformation must be (Seq.empty)
      }

      "fill nested optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXML.testEmptyNestedOptionalSequence
        val actualMetaData = MetaData.fromXml(inputXML)
        actualMetaData.response.nonEmpty must be(true)
        actualMetaData.response.head.declaration.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head.payment.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head.payment.head.obligationGuarantees.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head.payment.head.obligationGuarantees must be(Seq.empty)
      }
    }

    "value is not provided" should {
      "fill optional field with None" in {
        val inputXML = ResponseSpecInputXML.testEmptyOptionalField
        val actualMetaData = MetaData.fromXml(inputXML)
        actualMetaData.response.nonEmpty must be(true)
        actualMetaData.response.head.functionalReferenceId must be (None)
      }

      "fill optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXML.testEmptyOptionalSequence
        val actualMetaData = MetaData.fromXml(inputXML)
        actualMetaData.response.nonEmpty must be(true)
        actualMetaData.response.head.functionalReferenceId must be (None)
      }

      "fill nested optional sequence field with empty sequence" in {
        val inputXML = ResponseSpecInputXML.testEmptyNestedOptionalSequence
        val actualMetaData = MetaData.fromXml(inputXML)
        actualMetaData.response.nonEmpty must be(true)
        actualMetaData.response.head.declaration.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head.payment.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head.payment.head.obligationGuarantees.nonEmpty must be(true)
        actualMetaData.response.head.declaration.get.dutyTaxFees.head.payment.head.obligationGuarantees must be(Seq.empty)
      }
    }

    "value is provided" should {
      "read WCODataModelVersionCode" in {
        val inputXML = ResponseSpecInputXML.testWCODataModelVersionCode
        val metaDataResponse = Seq(exemplaryValidResponse)
        val expectedMetaData =
          MetaData(wcoDataModelVersionCode = Some(wcoDataModelVersionCode), response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read WCOTypeName" in {
        val inputXML = ResponseSpecInputXML.testWCOTypeName
        val metaDataResponse = Seq(exemplaryValidResponse)
        val expectedMetaData = MetaData(wcoTypeName = Some(wcoTypeName), response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read ResponsibleCountryCode" in {
        val inputXML = ResponseSpecInputXML.testResponsibleCountryCode
        val metaDataResponse = Seq(exemplaryValidResponse)
        val expectedMetaData =
          MetaData(responsibleCountryCode = Some(responsibleCountryCode), response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read ResponsibleAgencyName" in {
        val inputXML = ResponseSpecInputXML.testResponsibleAgencyName
        val metaDataResponse = Seq(exemplaryValidResponse)
        val expectedMetaData =
          MetaData(responsibleAgencyName = Some(responsibleAgencyName), response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read AgencyAssignedCustomizationCode" in {
        val inputXML = ResponseSpecInputXML.testAgencyAssignedCustomizationCode
        val metaDataResponse = Seq(exemplaryValidResponse)
        val expectedMetaData = MetaData(
          agencyAssignedCustomizationCode = Some(agencyAssignedCustomizationCode), response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read AgencyAssignedCustomizationVersionCode" in {
        val inputXML = ResponseSpecInputXML.testAgencyAssignedCustomizationVersionCode
        val metaDataResponse = Seq(exemplaryValidResponse)
        val expectedMetaData = MetaData(
          agencyAssignedCustomizationVersionCode = Some(agencyAssignedCustomizationVersionCode),
          response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response mandatory fields" in {
        val inputXML = ResponseSpecInputXML.testResponseMandatoryFields
        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId), declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/IssueDateTime" in {
        val inputXML = ResponseSpecInputXML.testResponseIssueDateTime
        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId), issueTime, declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/AdditionalInformation" in {
        val inputXML = ResponseSpecInputXML.testResponseAdditionalInformation
        val responseAdditionalInformation = ResponseAdditionalInformation(
          Some(statementCode), Some(statementDescription), issueTime, Some(statementTypeCode), Seq(responsePointer))

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            additionalInformation = Seq(responseAdditionalInformation),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/Amendment" in {
        val inputXML = ResponseSpecInputXML.testResponseAmendments
        val responseAmendment = ResponseAmendment(Some(changeReasonCode), Seq(responsePointer))

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            amendments = Seq(responseAmendment),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/AppealOffice" in {
        val inputXML = ResponseSpecInputXML.testResponseAppealOffice
        val responseAppealOffice = ResponseAppealOffice(Some(appealOfficeId))

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            appealOffice = Some(responseAppealOffice),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/Bank" in {
        val inputXML = ResponseSpecInputXML.testResponseBank
        val responseBank= ResponseBank(Some(bankReferenceId), Some(bankId))

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            bank = Some(responseBank),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/ContactOffice" in {
        val inputXML = ResponseSpecInputXML.testResponseContactOffice
        val responseContactOffice = ResponseContactOffice(
          Some(contactOfficeId),
          Seq(ResponseCommunication(Some(contactOfficeCommunicationId), Some(contactOfficeCommunicationTypeCode)))
        )

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            contactOffices = Seq(responseContactOffice),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/Error" in {
        val inputXML = ResponseSpecInputXML.testResponseErrors
        val responseError = ResponseError(Some(errorDescription), Some(errorValidationCode), Seq(responsePointer))

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            errors = Seq(responseError),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/Status" in {
        val inputXML = ResponseSpecInputXML.testResponseStatus
        val responseStatus = ResponseStatus(issueTime, Some(nameCode), issueTime, Seq(responsePointer))

        val metaDataResponse = Seq(
          Response(functionCode, Some(functionalReferenceId),
            status = Seq(responseStatus),
            declaration = Some(ResponseDeclaration()))
        )
        val expectedMetaData = MetaData(response = metaDataResponse)

        MetaData.fromXml(inputXML) must be(expectedMetaData)
      }

      "read Response/Declaration without DutyTaxFee and GoodsShipment" in {

      }

      "read Response/Declaration/DutyTaxFee" in {

      }

      "read Response/Declaration/GoodsShipment" in {

      }

    }
  }
}
