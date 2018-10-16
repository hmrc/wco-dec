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

class ResponseSpec extends WcoSpec with XmlBehaviours {

  val version = randomString(6)
  val refId = "functionalRefId1"
  val expectedCode = randomDeclarationFunctionCode
  val formatCode = randomDateTimeFormatCode
  val dateTime = randomDateTimeString
  val issueTime = Some(ResponseDateTimeElement(DateTimeString(formatCode, dateTime)))

  val sequenceNumeric = random0To9
  val documentSectionCode = 1.toString
  val tagId = randomString(4)
  val responsePointer = ResponsePointer(Some(sequenceNumeric), Some(documentSectionCode), Some(tagId))

  val functionalReferenceId = randomString(35)
  val id = randomString(70)
  val versionId = randomString(9)

  val referenceId = randomString(35)
  val currencyId = "GBP"
  val amountValue = randomBigDecimal(100)
  val amount = Amount(Some(currencyId), Some(amountValue))
  val obligationGuarantee = ResponseObligationGuarantee(Some(referenceId))
  val responsePayment = ResponsePayment(Some(referenceId), Some(amount), issueTime, Some(amount), Some(Seq(obligationGuarantee)))

  val responseDutyTaxFee = ResponseDutyTaxFee(Some(responsePayment))

  val dutyRegimeCode = randomString(3)
  val unitCode = randomString(5)
  val measureValue = randomBigDecimal(100)
  val measure = Measure(Some(unitCode), Some(measureValue))
  val taxRateNumeric = randomBigDecimal(100)
  val typeCode = randomString(3)
  val payment = ResponseDutyTaxFeePayment(Some(amount), Some(amount))

  val commodityDutyTaxFees = ResponseCommodityDutyTaxFee(Some(amount), Some(amount), Some(dutyRegimeCode), Some(measure),
    Some(taxRateNumeric), Some(typeCode), Some(payment))
  val responseCommodity = ResponseCommodity(Some(Seq(commodityDutyTaxFees)))
  val responseGovernmentAgencyGoodsItem = ResponseGovernmentAgencyGoodsItem(sequenceNumeric=sequenceNumeric, Some(responseCommodity))

  val governmentAgencyGoodsItems = Some(Seq(responseGovernmentAgencyGoodsItem))

  val responseGoodsShipment = ResponseGoodsShipment(governmentAgencyGoodsItems)

  "to XML" should {
    "include WCODataModelVersionCode" in validResponseXmlScenario() {
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = List(randomValidResponse))
      hasExpectedOutput(meta, version) { xml =>
        (xml \ "WCODataModelVersionCode").text.trim
      }
    }

    "include WCOTypeName" in validResponseXmlScenario() {
      val name = randomString(72)
      val meta = MetaData(wcoTypeName = Some(name), response = List(randomValidResponse))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "WCOTypeName").text.trim
      }
    }

    "include ResponsibleCountryCode" in validResponseXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(responsibleCountryCode = Some(code), response = List(randomValidResponse))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "ResponsibleCountryCode").text.trim
      }
    }

    "include ResponsibleAgencyName" in validResponseXmlScenario() {
      val agency = randomString(70)
      val meta = MetaData(responsibleAgencyName = Some(agency), response = List(randomValidResponse))
      hasExpectedOutput(meta, agency) { xml =>
        (xml \ "ResponsibleAgencyName").text.trim
      }
    }

    "include AgencyAssignedCustomizationCode" in validResponseXmlScenario() {
      val code = randomString(6)
      val meta = MetaData(agencyAssignedCustomizationCode = Some(code), response = List(randomValidResponse))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "AgencyAssignedCustomizationCode").text.trim
      }
    }

    "include AgencyAssignedCustomizationVersionCode" in validResponseXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(agencyAssignedCustomizationVersionCode = Some(code), response = List(randomValidResponse))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "AgencyAssignedCustomizationVersionCode").text.trim
      }
    }

    "include FunctionCode" in validResponseXmlScenario() {
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = List(
        Response(expectedCode, Some("functionalRefId1"), declaration = Some(ResponseDeclaration()))
      ))

      hasExpectedOutput(meta, expectedCode) { xml =>
        (xml \ "Response" \ "FunctionCode").text.trim.toInt
      }
    }

    "include FunctionalReferenceID" in validResponseXmlScenario() {
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = List(
        Response(expectedCode, Some(refId), declaration = Some(ResponseDeclaration()))
      ))

      hasExpectedOutput(meta, refId) { xml =>
        (xml \ "Response" \ "FunctionCode").text.trim.toInt
        (xml \ "Response" \ "FunctionalReferenceID").text.trim
      }
    }

    "include IssueDateTime" in validResponseXmlScenario() {
      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = List(
        Response(expectedCode, Some(refId), issueTime, declaration = Some(ResponseDeclaration()))
      ))

      hasExpectedOutput(meta, List(formatCode, dateTime)) { xml =>
        List(
          (xml \ "Response" \ "IssueDateTime" \ "DateTimeString" \ "@formatCode").text.trim,
          (xml \ "Response" \ "IssueDateTime" \ "DateTimeString").text.trim
        )
      }
    }

    "include ResponseAdditionalInformation" in validResponseXmlScenario() {
      val sequenceNumeric = 1
      val sectionCode = randomString(3)
      val tagId = randomString(4)
      val statementCode = randomString(10)
      val statementDescription = randomString(10)
      val statementTypeCode = randomString(3)
      val responsePointer = ResponsePointer(Some(sequenceNumeric), Some(sectionCode), Some(tagId))
      val responseAdditionalInformation = ResponseAdditionalInformation(Some(statementCode),
        Some(statementDescription), issueTime, Some(statementTypeCode), Some(Seq(responsePointer)))

      val meta = MetaData(wcoDataModelVersionCode = Some(version), response = List(
        Response(expectedCode, additionalInformations = Some(List(responseAdditionalInformation)),
          declaration = Some(ResponseDeclaration()))
      ))

      val expectedResponseAdditionalInformation: List[String] =
        List(statementCode, statementDescription, dateTime, statementTypeCode, sequenceNumeric.toString(), sectionCode, tagId)

      hasExpectedOutput(meta, expectedResponseAdditionalInformation) { xml =>
        List(
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
      val changeReasonCode = randomString(3)
      val responseAmendments  = Some(Seq(ResponseAmendment(Some(changeReasonCode), Some(Seq(responsePointer)))))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, amendments = responseAmendments, declaration = Some(ResponseDeclaration())))
      )

      val expectedResponseAmendment: List[String] =
        List(changeReasonCode, sequenceNumeric.toString, documentSectionCode, tagId)

      hasExpectedOutput(meta, expectedResponseAmendment) { xml =>
        List(
          (xml \ "Response" \ "Amendment" \ "ChangeReasonCode").text.trim,
          (xml \ "Response" \ "Amendment" \ "Pointer" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "Amendment" \ "Pointer" \ "DocumentSectionCode").text.trim,
          (xml \ "Response" \ "Amendment" \ "Pointer" \ "TagID").text.trim
        )
      }
    }

    "include AppealOffice" in validResponseXmlScenario() {
      val id = randomString(17)
      val appealOffice = ResponseAppealOffice(Some(id))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, appealOffice = Some(appealOffice), declaration = Some(ResponseDeclaration())))
      )

      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Response" \ "AppealOffice" \ "ID").text.trim
      }
    }

    "include Bank" in validResponseXmlScenario() {
      val referenceId = randomString(17)
      val id = randomString(17)
      val bank = ResponseBank(Some(referenceId), Some(id))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, bank = Some(bank), declaration = Some(ResponseDeclaration())))
      )

      val expectedResponseBank: List[String] = List(referenceId, id)

      hasExpectedOutput(meta, expectedResponseBank) { xml =>
        List(
          (xml \ "Response" \ "Bank" \ "ReferenceID").text.trim,
          (xml \ "Response" \ "Bank" \ "ID").text.trim
        )
      }
    }

    "include ContactOffice" in validResponseXmlScenario() {
      val officeId = randomString(17)
      val communicationId = randomString(50)
      val typeCode = randomString(3)
      val communication = ResponseCommunication(Some(communicationId), Some(typeCode))
      val contactOffice = Some(Seq(ResponseContactOffice(Some(officeId), Some(Seq(communication)))))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, contactOffices = contactOffice, declaration = Some(ResponseDeclaration())))
      )

      val expectedContactOffice: List[String] = List(officeId, communicationId, typeCode)

      hasExpectedOutput(meta, expectedContactOffice) { xml =>
        List(
          (xml \ "Response" \ "ContactOffice" \ "ID").text.trim,
          (xml \ "Response" \ "ContactOffice" \ "Communication" \ "ID").text.trim,
          (xml \ "Response" \ "ContactOffice" \ "Communication" \ "TypeCode").text.trim
        )
      }
    }

    "include Error" in validResponseXmlScenario() {
      val description = randomString(10)
      val validationCode = randomString(8)
      val errors = Some(Seq(ResponseError(Some(description), Some(validationCode), Some(Seq(responsePointer)))))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, errors = errors, declaration = Some(ResponseDeclaration())))
      )

      val expectedError: List[String] = List(description, validationCode, responsePointer.sequenceNumeric.get.toString,
        responsePointer.documentSectionCode.get, responsePointer.tagId.get)

      hasExpectedOutput(meta, expectedError) { xml =>
        List(
          (xml \ "Response" \ "Error" \ "Description").text.trim,
          (xml \ "Response" \ "Error" \ "ValidationCode").text.trim,
          (xml \ "Response" \ "Error" \ "Pointer" \ "SequenceNumeric").text.trim,
          (xml \ "Response" \ "Error" \ "Pointer" \ "DocumentSectionCode").text.trim,
          (xml \ "Response" \ "Error" \ "Pointer" \ "TagID").text.trim
        )
      }
    }

    "include Status" in validResponseXmlScenario() {
      val nameCode = randomString(3)
      val status = Some(Seq(ResponseStatus(issueTime, Some(nameCode), issueTime, Some(Seq(responsePointer)))))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, status = status, declaration = Some(ResponseDeclaration())))
      )

      val expectedStatus: List[String] = List(dateTime, nameCode, dateTime, responsePointer.sequenceNumeric.get.toString,
        responsePointer.documentSectionCode.get, responsePointer.tagId.get)

      hasExpectedOutput(meta, expectedStatus) { xml =>
        List(
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

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: List[String] =
        List(dateTime, dateTime, functionalReferenceId, id, dateTime, versionId)

      hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        List(
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
        dutyTaxFees = Some(Seq(responseDutyTaxFee))
      )

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: List[String] =
        List(referenceId, amountValue.toString, dateTime, amountValue.toString, referenceId)

      hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        List(
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

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: List[String] = List(sequenceNumeric.toString, amountValue.toString,
        amountValue.toString, dutyRegimeCode, measureValue.toString, taxRateNumeric.toString, typeCode,
        amountValue.toString, amountValue.toString)

      hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        List(
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

  "fromXml" should {
    " create Metadata Object" in {

      val responseDeclaration = ResponseDeclaration(goodsShipment = Some(responseGoodsShipment))

      val meta = MetaData(
        wcoDataModelVersionCode = Some(version),
        response = List(Response(expectedCode, declaration = Some(responseDeclaration)))
      )

      val expectedResponseDeclaration: List[String] = List(sequenceNumeric.toString, amountValue.toString,
        amountValue.toString, dutyRegimeCode, measureValue.toString, taxRateNumeric.toString, typeCode,
        amountValue.toString, amountValue.toString)

     val xml =  hasExpectedOutput(meta, expectedResponseDeclaration) { xml =>
        List(
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

      println(xml)
     val expected = MetaData.fromXml(xml.toString)

      hasExpectedInput(meta, meta) { result => result}

    }
  }
}
