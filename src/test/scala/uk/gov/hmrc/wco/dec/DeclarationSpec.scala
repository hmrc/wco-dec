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

class DeclarationSpec extends WcoSpec with XmlBehaviours {

  val cancellation: MetaData = randomCancelDeclaration

  "to XML" should {

    "include WCODataModelVersionCode" in validDeclarationXmlScenario() {
      val version = randomString(6)
      val meta = MetaData(wcoDataModelVersionCode = Some(version), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, version) { xml =>
        (xml \ "WCODataModelVersionCode").text.trim
      }
    }

    "include WCOTypeName" in validDeclarationXmlScenario() {
      val name = randomString(712)
      val meta = MetaData(wcoTypeName = Some(name), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "WCOTypeName").text.trim
      }
    }

    "include ResponsibleCountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(responsibleCountryCode = Some(code), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "ResponsibleCountryCode").text.trim
      }
    }

    "include ResponsibleAgencyName" in validDeclarationXmlScenario() {
      val agency = randomString(70)
      val meta = MetaData(responsibleAgencyName = Some(agency), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, agency) { xml =>
        (xml \ "ResponsibleAgencyName").text.trim
      }
    }

    "include AgencyAssignedCustomizationCode" in validDeclarationXmlScenario() {
      val code = randomString(6)
      val meta = MetaData(agencyAssignedCustomizationCode = Some(code), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "AgencyAssignedCustomizationCode").text.trim
      }
    }

    "include AgencyAssignedCustomizationVersionCode" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(agencyAssignedCustomizationVersionCode = Some(code), declaration = randomValidDeclaration)
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "AgencyAssignedCustomizationVersionCode").text.trim
      }
    }

    "include AcceptanceDateTime" in validDeclarationXmlScenario() {
      val formatCode = randomDateTimeFormatCode
      val dateTime = randomDateTimeString
      val meta = MetaData(declaration = Some(Declaration(
        acceptanceDateTime = Some(DateTimeElement(DateTimeString(formatCode, dateTime)))
      )))
      hasExpectedOutput(meta, Seq(formatCode, dateTime)) { xml =>
        Seq(
          (xml \ "Declaration" \ "AcceptanceDateTime" \ "DateTimeString" \ "@formatCode").text.trim,
          (xml \ "Declaration" \ "AcceptanceDateTime" \ "DateTimeString").text.trim
        )
      }
    }

    "include FunctionCode" in validDeclarationXmlScenario() {
      val code = randomDeclarationFunctionCode
      val meta = MetaData(declaration = Some(Declaration(
        functionCode = Some(code)
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "FunctionCode").text.trim.toInt
      }
    }

    "include FunctionalReferenceID" in validDeclarationXmlScenario() {
      val id = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        functionalReferenceId = Some(id)
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "FunctionalReferenceID").text.trim
      }
    }

    "include ID" in validDeclarationXmlScenario() {
      val id = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        id = Some(id)
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "ID").text.trim
      }
    }

    "include IssueDateTime" in validDeclarationXmlScenario() {
      val formatCode = randomDateTimeFormatCode
      val dateTime = randomDateTimeString
      val meta = MetaData(declaration = Some(Declaration(
        issueDateTime = Some(DateTimeElement(DateTimeString(formatCode, dateTime))))
      ))
      hasExpectedOutput(meta, Seq(formatCode, dateTime)) { xml =>
        Seq(
          (xml \ "Declaration" \ "IssueDateTime" \ "DateTimeString" \ "@formatCode").text.trim,
          (xml \ "Declaration" \ "IssueDateTime" \ "DateTimeString").text.trim
        )
      }
    }

    "include IssueLocationID" in validDeclarationXmlScenario() {
      val id = randomString(5)
      val meta = MetaData(declaration = Some(Declaration(
        issueLocationId = Some(id)
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "IssueLocationID").text.trim
      }
    }

    "include TypeCode" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        typeCode = Some(code)
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "TypeCode").text.trim
      }
    }

    "include GoodsItemQuantity" in validDeclarationXmlScenario() {
      val quantity = randomInt(100000)
      val meta = MetaData(declaration = Some(Declaration(
        goodsItemQuantity = Some(quantity)
      )))
      hasExpectedOutput(meta, quantity) { xml =>
        (xml \ "Declaration" \ "GoodsItemQuantity").text.trim.toInt
      }
    }

    "include DeclarationOfficeID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        declarationOfficeId = Some(id)
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "DeclarationOfficeID").text.trim
      }
    }

    "include InvoiceAmount without currencyID attribute" in validDeclarationXmlScenario() {
      val amount = randomBigDecimal
      val meta = MetaData(declaration = Some(Declaration(
        invoiceAmount = Some(Amount(value = Some(amount)))
      )))
      hasExpectedOutput(meta, amount.toString) { xml =>
        (xml \ "Declaration" \ "InvoiceAmount").text.trim
      }
    }

    "include InvoiceAmount with currencyID attribute" in validDeclarationXmlScenario() {
      val amount = randomBigDecimal
      val currency = randomISO4217CurrencyCode
      val meta = MetaData(declaration = Some(Declaration(
        invoiceAmount = Some(Amount(Some(currency), Some(amount))))
      ))
      hasExpectedOutput(meta, Seq(currency, amount.toString)) { xml =>
        Seq(
          (xml \ "Declaration" \ "InvoiceAmount" \ "@currencyID").text.trim,
          (xml \ "Declaration" \ "InvoiceAmount").text.trim
        )
      }
    }

    "include LoadingListQuantiy" in validDeclarationXmlScenario() {
      val quantity = randomInt(100000)
      val meta = MetaData(declaration = Some(Declaration(
        loadingListQuantity = Some(quantity)
      )))
      hasExpectedOutput(meta, quantity) { xml =>
        (xml \ "Declaration" \ "LoadingListQuantity").text.trim.toInt
      }
    }

    "include TotalGrossMassMeasure" in validDeclarationXmlScenario() {
      val total = randomBigDecimal
      val meta = MetaData(declaration = Some(Declaration(
        totalGrossMassMeasure = Some(Measure(value = Some(total))))
      ))
      hasExpectedOutput(meta, total.toString) { xml =>
        (xml \ "Declaration" \ "TotalGrossMassMeasure").text.trim
      }
    }

    "include total gross mass measure unit code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        totalGrossMassMeasure = Some(Measure(Some(code), Some(randomBigDecimal))))
      ))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "TotalGrossMassMeasure" \ "@unitCode").text.trim
      }
    }

    "include TotalPackageQuantity" in validDeclarationXmlScenario() {
      val total = randomInt(100000000)
      val meta = MetaData(declaration = Some(Declaration(
        totalPackageQuantity = Some(total)
      )))
      hasExpectedOutput(meta, total) { xml =>
        (xml \ "Declaration" \ "TotalPackageQuantity").text.trim.toInt
      }
    }

    "include SpecificCircumstancesCodeCode" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        specificCircumstancesCode = Some(code)
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "SpecificCircumstancesCodeCode").text.trim
      }
    }

    "include Authentication Authentication" in validDeclarationXmlScenario() {
      val auth = randomString(255)
      val meta = MetaData(declaration = Some(Declaration(
        authentication = Some(Authentication(
          authentication = Some(auth)
        ))
      )))
      hasExpectedOutput(meta, auth) { xml =>
        (xml \ "Declaration" \ "Authentication" \ "Authentication").text.trim
      }
    }

    "include Authentication Authenticator Name" in validDeclarationXmlScenario() {
      val auth = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        authentication = Some(Authentication(
          authenticator = Some(Authenticator(
            name = Some(auth)
          ))
        ))
      )))
      hasExpectedOutput(meta, auth) { xml =>
        (xml \ "Declaration" \ "Authentication" \ "Authenticator" \ "Name").text.trim
      }
    }

    "include Submitter Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          name = Some(name)
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Name").text.trim
      }
    }

    "include Submitter ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "ID").text.trim
      }
    }

    "include Submitter Address CityName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          address = Some(Address(
            cityName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Address" \ "CityName").text.trim
      }
    }

    "include Submitter Address CountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          address = Some(Address(
            countryCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Address" \ "CountryCode").text.trim
      }
    }

    "include Submitter Address CountrySubDivisionCode" in validDeclarationXmlScenario() {
      val code = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          address = Some(Address(
            countrySubDivisionCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Address" \ "CountrySubDivisionCode").text.trim
      }
    }

    "include Submitter Address CountrySubDivisionName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          address = Some(Address(
            countrySubDivisionName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Address" \ "CountrySubDivisionName").text.trim
      }
    }

    "include Submitter Address Line" in validDeclarationXmlScenario() {
      val line = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          address = Some(Address(
            line = Some(line)
          ))
        ))
      )))
      hasExpectedOutput(meta, line) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Address" \ "Line").text.trim
      }
    }

    "include Submitter Address PostcodeID" in validDeclarationXmlScenario() {
      val id = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        submitter = Some(NamedEntityWithAddress(
          address = Some(Address(
            postcodeId = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Submitter" \ "Address" \ "PostcodeID").text.trim
      }
    }

    "include Additional Document ID" in validDeclarationXmlScenario() {
      val id = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        additionalDocuments = Seq(AdditionalDocument(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "AdditionalDocument" \ "ID").text.trim
      }
    }

    "include Additional Document CategoryCode" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        additionalDocuments = Seq(AdditionalDocument(
          categoryCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "AdditionalDocument" \ "CategoryCode").text.trim
      }
    }

    "include Additional Document TypeCode" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        additionalDocuments = Seq(AdditionalDocument(
          typeCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "AdditionalDocument" \ "TypeCode").text.trim
      }
    }

    "include Additional Information Statement Code" in validDeclarationXmlScenario() {
      val code = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        additionalInformations = Seq(AdditionalInformation(
          statementCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "StatementCode").text.trim
      }
    }

    "include Additional Information Statement Description" in validDeclarationXmlScenario() {
      val description = randomString(512)
      val meta = MetaData(declaration = Some(Declaration(
        additionalInformations = Seq(AdditionalInformation(
          statementDescription = Some(description)
        ))
      )))
      hasExpectedOutput(meta, description) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "StatementDescription").text.trim
      }
    }

    "include Additional Information Statement Type Code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        additionalInformations = Seq(AdditionalInformation(
          statementTypeCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "StatementTypeCode").text.trim
      }
    }

    "include Additional Information Pointer Sequence Numeric" in validDeclarationXmlScenario() {
      val num = randomInt(100000)
      val meta = MetaData(declaration = Some(Declaration(
        additionalInformations = Seq(AdditionalInformation(
          pointers = Seq(Pointer(
            sequenceNumeric = Some(num)
          ))
        ))
      )))
      hasExpectedOutput(meta, num) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "Pointer" \ "SequenceNumeric").text.trim.toInt
      }
    }

    "include Additional Information Pointer Document Section Code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        additionalInformations = Seq(AdditionalInformation(
          pointers = Seq(Pointer(
            documentSectionCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "Pointer" \ "DocumentSectionCode").text.trim
      }
    }

    "include Additional Information Pointer Tag ID" in validDeclarationXmlScenario() {
      val id = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        additionalInformations = Seq(AdditionalInformation(
          pointers = Seq(Pointer(
            tagId = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "Pointer" \ "TagID").text.trim
      }
    }

    "include Agent name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          name = Some(name)
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Name").text.trim
      }
    }

    "include Agent id" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Agent" \ "ID").text.trim
      }
    }

    "include Agent function code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          functionCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Agent" \ "FunctionCode").text.trim
      }
    }

    "include Agent Address CityName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          address = Some(Address(
            cityName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Address" \ "CityName").text.trim
      }
    }

    "include Agent Address CountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          address = Some(Address(
            countryCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Address" \ "CountryCode").text.trim
      }
    }

    "include Agent Address CountrySubDivisionCode" in validDeclarationXmlScenario() {
      val code = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          address = Some(Address(
            countrySubDivisionCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Address" \ "CountrySubDivisionCode").text.trim
      }
    }

    "include Agent Address CountrySubDivisionName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          address = Some(Address(
            countrySubDivisionName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Address" \ "CountrySubDivisionName").text.trim
      }
    }

    "include Agent Address Line" in validDeclarationXmlScenario() {
      val line = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          address = Some(Address(
            line = Some(line)
          ))
        ))
      )))
      hasExpectedOutput(meta, line) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Address" \ "Line").text.trim
      }
    }

    "include Agent Address PostcodeID" in validDeclarationXmlScenario() {
      val id = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        agent = Some(Agent(
          address = Some(Address(
            postcodeId = Some(id)
          )))
        ))))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Agent" \ "Address" \ "PostcodeID").text.trim
      }
    }

    "include Authorisation Holder ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        authorisationHolders = Seq(AuthorisationHolder(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "AuthorisationHolder" \ "ID").text.trim
      }
    }

    "include Authorisation Holder category code" in validDeclarationXmlScenario() {
      val code = randomString(4)
      val meta = MetaData(declaration = Some(Declaration(
        authorisationHolders = Seq(AuthorisationHolder(
          categoryCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "AuthorisationHolder" \ "CategoryCode").text.trim
      }
    }

    "include Border Transport Means name" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        borderTransportMeans = Some(BorderTransportMeans(
          name = Some(name)
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "BorderTransportMeans" \ "Name").text.trim
      }
    }

    "include Border Transport Means id" in validDeclarationXmlScenario() {
      val id = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        borderTransportMeans = Some(BorderTransportMeans(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "BorderTransportMeans" \ "ID").text.trim
      }
    }

    "include Border Transport Means identification type code" in validDeclarationXmlScenario() {
      val code = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        borderTransportMeans = Some(BorderTransportMeans(
          identificationTypeCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "BorderTransportMeans" \ "IdentificationTypeCode").text.trim
      }
    }

    "include Border Transport Means registration nationality code" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        borderTransportMeans = Some(BorderTransportMeans(
          registrationNationalityCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "BorderTransportMeans" \ "RegistrationNationalityCode").text.trim
      }
    }

    "include Border Transport Means mode code" in validDeclarationXmlScenario() {
      val code = random0To9
      val meta = MetaData(declaration = Some(Declaration(
        borderTransportMeans = Some(BorderTransportMeans(
          modeCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "BorderTransportMeans" \ "ModeCode").text.trim.toInt
      }
    }

    "include Currency Exchange currency type code" in validDeclarationXmlScenario() {
      val code = randomISO4217CurrencyCode
      val meta = MetaData(declaration = Some(Declaration(
        currencyExchanges = Seq(CurrencyExchange(
          currencyTypeCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "CurrencyExchange" \ "CurrencyTypeCode").text.trim
      }
    }

    "include Currency Exchange rate numeric" in validDeclarationXmlScenario() {
      val rate = randomBigDecimal
      val meta = MetaData(declaration = Some(Declaration(
        currencyExchanges = Seq(CurrencyExchange(
          rateNumeric = Some(rate)
        ))
      )))
      hasExpectedOutput(meta, rate.toString) { xml =>
        (xml \ "Declaration" \ "CurrencyExchange" \ "RateNumeric").text.trim
      }
    }

    "Include Declarant Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(
        declaration = Some(Declaration(
          declarant = Some(ImportExportParty(
            name = Some(name)
          ))
        )
      ))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Name").text.trim
      }
    }

    "Include Declarant ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(
        declaration = Some(Declaration(
          declarant = Some(ImportExportParty(
            id = Some(id)
          ))
        )
      ))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "ID").text.trim
      }
    }

    "include Declarant Address CityName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          address = Some(Address(
            cityName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Address" \ "CityName").text.trim
      }
    }

    "include Declarant Address CountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          address = Some(Address(
            countryCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Address" \ "CountryCode").text.trim
      }
    }

    "include Declarant Address CountrySubDivisionCode" in validDeclarationXmlScenario() {
      val code = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          address = Some(Address(
            countrySubDivisionCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Address" \ "CountrySubDivisionCode").text.trim
      }
    }

    "include Declarant Address CountrySubDivisionName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          address = Some(Address(
            countrySubDivisionName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Address" \ "CountrySubDivisionName").text.trim
      }
    }

    "include Declarant Address Line" in validDeclarationXmlScenario() {
      val line = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          address = Some(Address(
            line = Some(line)
          ))
        ))
      )))
      hasExpectedOutput(meta, line) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Address" \ "Line").text.trim
      }
    }

    "include Declarant Address PostcodeID" in validDeclarationXmlScenario() {
      val id = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          address = Some(Address(
            postcodeId = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Address" \ "PostcodeID").text.trim
      }
    }

    "include Declarant Contact Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          contacts = Seq(Contact(
            name = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Contact" \ "Name").text.trim
      }
    }

    "include Declarant Communication ID" in validDeclarationXmlScenario() {
      val id = randomString(50)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          communications = Seq(Communication(
            id = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Communication" \ "ID").text.trim
      }
    }

    "include Declarant Communication Type Code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        declarant = Some(ImportExportParty(
          communications = Seq(Communication(
            typeCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Declarant" \ "Communication" \ "TypeCode").text.trim
      }
    }

    "include Exit Office ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        exitOffice = Some(Office(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "ExitOffice" \ "ID").text.trim
      }
    }

    "include Exporter Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          name = Some(name)
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Name").text.trim
      }
    }

    "include Exporter ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "ID").text.trim
      }
    }

    "include Exporter Address CityName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          address = Some(Address(
            cityName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Address" \ "CityName").text.trim
      }
    }

    "include Exporter Address CountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          address = Some(Address(
            countryCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Address" \ "CountryCode").text.trim
      }
    }

    "include Exporter Address CountrySubDivisionCode" in validDeclarationXmlScenario() {
      val code = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          address = Some(Address(
            countrySubDivisionCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Address" \ "CountrySubDivisionCode").text.trim
      }
    }

    "include Exporter Address CountrySubDivisionName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          address = Some(Address(
            countrySubDivisionName = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Address" \ "CountrySubDivisionName").text.trim
      }
    }

    "include Exporter Address Line" in validDeclarationXmlScenario() {
      val line = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          address = Some(Address(
            line = Some(line)
          ))
        ))
      )))
      hasExpectedOutput(meta, line) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Address" \ "Line").text.trim
      }
    }

    "include Exporter Address PostcodeID" in validDeclarationXmlScenario() {
      val id = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          address = Some(Address(
            postcodeId = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Address" \ "PostcodeID").text.trim
      }
    }

    "include Exporter Contact Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          contacts = Seq(Contact(
            name = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Contact" \ "Name").text.trim
      }
    }

    "include Exporter Communication ID" in validDeclarationXmlScenario() {
      val id = randomString(50)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          communications = Seq(Communication(
            id = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Communication" \ "ID").text.trim
      }
    }

    "include Exporter Communication Type Code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        exporter = Some(ImportExportParty(
          communications = Seq(Communication(
            typeCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "Exporter" \ "Communication" \ "TypeCode").text.trim
      }
    }

    "include Obligation Guarantee Amount" in validDeclarationXmlScenario() {
      val amount = randomBigDecimal
      val meta = MetaData(declaration = Some(Declaration(
        obligationGuarantees = Seq(ObligationGuarantee(
          amount = Some(amount)
        ))
      )))
      hasExpectedOutput(meta, amount.toString) { xml =>
        (xml \ "Declaration" \ "ObligationGuarantee" \ "AmountAmount").text.trim
      }
    }

    "include Obligation Guarantee ID" in validDeclarationXmlScenario() {
      val id = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        obligationGuarantees = Seq(ObligationGuarantee(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "ObligationGuarantee" \ "ID").text.trim
      }
    }

    "include Obligation Guarantee Reference ID" in validDeclarationXmlScenario() {
      val id = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        obligationGuarantees = Seq(ObligationGuarantee(
          referenceId = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "ObligationGuarantee" \ "ReferenceID").text.trim
      }
    }

    "include Obligation Guarantee Security Details Code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        obligationGuarantees = Seq(ObligationGuarantee(
          securityDetailsCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "ObligationGuarantee" \ "SecurityDetailsCode").text.trim
      }
    }

    "include Obligation Guarantee Access Code" in validDeclarationXmlScenario() {
      val code = randomString(4)
      val meta = MetaData(declaration = Some(Declaration(
        obligationGuarantees = Seq(ObligationGuarantee(
          accessCode = Some(code)
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "ObligationGuarantee" \ "AccessCode").text.trim
      }
    }

    "include Obligation Guarantee Guarantee Office ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        obligationGuarantees = Seq(ObligationGuarantee(
          guaranteeOffice = Some(Office(
            id = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "ObligationGuarantee" \ "GuaranteeOffice" \ "ID").text.trim
      }
    }

    "include Presentation Office ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        presentationOffice = Some(Office(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "PresentationOffice" \ "ID").text.trim
      }
    }

    "include Supervising Office ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        supervisingOffice = Some(Office(
          id = Some(id)
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "SupervisingOffice" \ "ID").text.trim
      }
    }

    "include Goods Shipment Exit Date Time" in validDeclarationXmlScenario() {
      val formatCode = randomDateTimeFormatCode
      val dateTime = randomDateTimeString
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          exitDateTime = Some(DateTimeElement(
            DateTimeString(formatCode, dateTime)
          ))
        ))
      )))
      hasExpectedOutput(meta, Seq(formatCode, dateTime)) { xml =>
        Seq(
          (xml \ "Declaration" \ "GoodsShipment" \ "ExitDateTime" \ "DateTimeString" \ "@formatCode").text.trim,
          (xml \ "Declaration" \ "GoodsShipment" \ "ExitDateTime" \ "DateTimeString").text.trim
        )
      }
    }

    "include goods shipment transaction nature code" in validDeclarationXmlScenario() {
      val code = randomInt(100)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          transactionNatureCode = Some(code)
        )))
      ))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "TransactionNatureCode").text.trim.toInt
      }
    }

    "include goods shipment AEO mutual recognition party id" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          aeoMutualRecognitionParties = Seq(RoleBasedParty(
            id = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "AEOMutualRecognitionParty" \ "ID").text.trim
      }
    }

    "include goods shipment AEO mutual recognition party role code" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          aeoMutualRecognitionParties = Seq(RoleBasedParty(
            roleCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "AEOMutualRecognitionParty" \ "RoleCode").text.trim
      }
    }

    "include goods shipment buyer name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            name = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Name").text.trim
      }
    }

    "include goods shipment buyer id" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            id = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "ID").text.trim
      }
    }

    "include GoodsShipment Buyer Address CityName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            address = Some(Address(
              cityName = Some(name)
            )))
          )))
        )
      ))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Address" \ "CityName").text.trim
      }
    }

    "include GoodsShipment Buyer Address CountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            address = Some(Address(
              countryCode = Some(code)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Address" \ "CountryCode").text.trim
      }
    }

    "include GoodsShipment Buyer Address CountrySubDivisionCode" in validDeclarationXmlScenario() {
      val code = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            address = Some(Address(
              countrySubDivisionCode = Some(code)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Address" \ "CountrySubDivisionCode").text.trim
      }
    }

    "include GoodsShipment Buyer Address CountrySubDivisionName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            address = Some(Address(
              countrySubDivisionName = Some(name)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Address" \ "CountrySubDivisionName").text.trim
      }
    }

    "include GoodsShipment Buyer Address Line" in validDeclarationXmlScenario() {
      val line = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            address = Some(Address(
              line = Some(line)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, line) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Address" \ "Line").text.trim
      }
    }

    "include GoodsShipment Buyer Address PostcodeID" in validDeclarationXmlScenario() {
      val id = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            address = Some(Address(
              postcodeId = Some(id)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Address" \ "PostcodeID").text.trim
      }
    }

    "include GoodsShipment Buyer Contact Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            contacts = Seq(Contact(
              name = Some(name)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Contact" \ "Name").text.trim
      }
    }

    "include GoodsShipment Buyer Communication ID" in validDeclarationXmlScenario() {
      val id = randomString(50)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            communications = Seq(Communication(
              id = Some(id)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Communication" \ "ID").text.trim
      }
    }

    "include GoodsShipment Buyer Communication TypeCode" in validDeclarationXmlScenario() {
      val code = randomString(3)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          buyer = Some(ImportExportParty(
            communications = Seq(Communication(
              typeCode = Some(code)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Buyer" \ "Communication" \ "TypeCode").text.trim
      }
    }

    "include GoodsShipment Consignee Name" in validDeclarationXmlScenario() {
      val name = randomString(70)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            name = Some(name)
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Name").text.trim
      }
    }

    "include GoodsShipment Consignee ID" in validDeclarationXmlScenario() {
      val id = randomString(17)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            id = Some(id)
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "ID").text.trim
      }
    }

    "include GoodsShipment Consignee Address CityName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            address = Some(Address(
              cityName = Some(name)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Address" \ "CityName").text.trim
      }
    }

    "include GoodsShipment Consignee Address CountryCode" in validDeclarationXmlScenario() {
      val code = randomISO3166Alpha2CountryCode
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            address = Some(Address(
              countryCode = Some(code)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Address" \ "CountryCode").text.trim
      }
    }

    "include GoodsShipment Consignee Address CountrySubDivisionCode" in validDeclarationXmlScenario() {
      val code = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            address = Some(Address(
              countrySubDivisionCode = Some(code)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Address" \ "CountrySubDivisionCode").text.trim
      }
    }

    "include GoodsShipment Consignee Address CountrySubDivisionName" in validDeclarationXmlScenario() {
      val name = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            address = Some(Address(
              countrySubDivisionName = Some(name)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, name) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Address" \ "CountrySubDivisionName").text.trim
      }
    }

    "include GoodsShipment Consignee Address Line" in validDeclarationXmlScenario() {
      val line = randomString(35)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            address = Some(Address(
              line = Some(line)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, line) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Address" \ "Line").text.trim
      }
    }

    "include GoodsShipment Consignee Address PostcodeID" in validDeclarationXmlScenario() {
      val id = randomString(9)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignee = Some(NamedEntityWithAddress(
            address = Some(Address(
              postcodeId = Some(id)
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, id) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignee" \ "Address" \ "PostcodeID").text.trim
      }
    }

    "include goods shipment consignment container code" in validDeclarationXmlScenario() {
      val code = randomInt(2).toString
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          consignment = Some(Consignment(
            containerCode = Some(code)
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "Consignment" \ "ContainerCode").text.trim
      }
    }

    "include government agency goods item additional document write off quantity unit code" in validDeclarationXmlScenario() {
      val code = randomString(5)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          governmentAgencyGoodsItems = Seq(GovernmentAgencyGoodsItem(
            sequenceNumeric = 1,
            additionalDocuments = Seq(GovernmentAgencyGoodsItemAdditionalDocument(
              writeOff = Some(WriteOff(
                quantity = Some(Measure(
                  unitCode = Some(code),
                  value = Some(randomBigDecimal(99999))
                ))
              ))
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, code) { xml =>
        (xml \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "AdditionalDocument" \ "WriteOff" \ "QuantityQuantity" \ "@unitCode").text.trim
      }
    }

    "include goods measure net weight measure" in validDeclarationXmlScenario() {
      val measure = randomBigDecimal(99999999)
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          governmentAgencyGoodsItems = Seq(GovernmentAgencyGoodsItem(
            sequenceNumeric = 1,
            commodity = Some(Commodity(
              goodsMeasure = Some(GoodsMeasure(
                netWeightMeasure = Some(Measure(
                  value = Some(measure)
                ))
              ))
            ))
          ))
        ))
      )))
      hasExpectedOutput(meta, measure) { xml =>
        BigDecimal((xml \ "Declaration" \ "GoodsShipment" \ "GovernmentAgencyGoodsItem" \ "Commodity" \ "GoodsMeasure" \ "NetNetWeightMeasure").text)
      }
    }

    "include Declaration AdditionalInformation Statement Description for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.declaration.get.additionalInformations(0).statementDescription.get) { xml =>
        (xml \ "Declaration" \ "AdditionalInformation" \ "StatementDescription").text.trim
      }
    }

    "include Declaration Amendment Change Reason Code for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.declaration.get.amendments(0).changeReasonCode.get) { xml =>
        (xml \ "Declaration" \ "Amendment" \ "ChangeReasonCode").text.trim
      }
    }

    "include Declaration ID for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.declaration.get.id.get) { xml =>
        (xml \ "Declaration" \ "ID").text.trim
      }
    }

    "include Declaration functional reference ID for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.declaration.get.functionalReferenceId.get) { xml =>
        (xml \ "Declaration" \ "FunctionalReferenceID").text.trim
      }
    }

    "include Declaration function code for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.declaration.get.functionCode.get) { xml =>
        (xml \ "Declaration" \ "FunctionCode").text.trim.toInt
      }
    }

    "include WCODataModelVersionCode for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.wcoDataModelVersionCode.get) { xml =>
        (xml \ "WCODataModelVersionCode").text.trim
      }
    }

    "include WCOTypeName for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.wcoTypeName.get) { xml =>
        (xml \ "WCOTypeName").text.trim
      }
    }

    "include AgencyAssignedCustomizationVersionCode for cancellation" in validCancellationDeclarationXml() {
      hasExpectedOutput(cancellation, cancellation.agencyAssignedCustomizationVersionCode.get) { xml =>
        (xml \ "AgencyAssignedCustomizationVersionCode").text.trim
      }
    }

  }

  "from XML" should {

    "read WCO data model version code" in {
      val code: Option[String] = Some(randomString(6))
      val meta = MetaData(wcoDataModelVersionCode = code)
      hasExpectedInput(meta, code) { m =>
        m.wcoDataModelVersionCode
      }
    }

    "read measure" in {
      val measure: Option[Measure] = Some(Measure(
        unitCode = Some(randomString(5)),
        value = Some(randomBigDecimal)
      ))
      val meta = MetaData(declaration = Some(Declaration(
        totalGrossMassMeasure = measure
      )))
      hasExpectedInput(meta, measure) { m =>
        m.declaration.get.totalGrossMassMeasure
      }
    }

    "read measure without unit code" in {
      val measure: Option[Measure] = Some(Measure(
        unitCode = None,
        value = Some(randomBigDecimal)
      ))
      val meta = MetaData(declaration = Some(Declaration(
        totalGrossMassMeasure = measure
      )))
      hasExpectedInput(meta, measure) { m =>
        m.declaration.get.totalGrossMassMeasure
      }
    }

    "read null collections as empty" in {
      val meta = MetaData()
      val xml = meta.toXml
      val deserialized = MetaData.fromXml(xml)

      deserialized.response.isEmpty must be(true)
    }

    "read packaging sequence numeric" in {
      val meta = MetaData(declaration = Some(Declaration(
        goodsShipment = Some(GoodsShipment(
          governmentAgencyGoodsItems = Seq(GovernmentAgencyGoodsItem(
            sequenceNumeric = 42,
            packagings = Seq(Packaging(
              sequenceNumeric = Some(24)
            ))
          ))
        ))
      )))
      val xml = meta.toXml
      val deserialized = MetaData.fromXml(xml)
      deserialized.declaration.get.goodsShipment.get.governmentAgencyGoodsItems.head.packagings.head.sequenceNumeric.get must be(24)
    }

  }

  "from properties" should {

    "read WCO data model version code" in {
      val code = Some(randomString(6))
      val props = Map("wcoDataModelVersionCode" -> code.get)
      MetaData.fromProperties(props).wcoDataModelVersionCode must be(code)
    }

    "read declaration additional documents id" in {
      val id = Some(randomString(70))
      val props = Map("declaration.additionalDocuments[0].id" -> id.get)
      MetaData.fromProperties(props).declaration.get.additionalDocuments.head.id must be(id)
    }

    "deserialize commodity gross mass measure from property path expression" in {
      val props = Map("declaration.goodsShipment.governmentAgencyGoodsItems[0].commodity.goodsMeasure.grossMassMeasure.value" -> "24")
      val meta = MetaData.fromProperties(props)
      meta.declaration.get.goodsShipment.get.governmentAgencyGoodsItems.head.commodity.get.goodsMeasure.get.grossMassMeasure.get.value.get must be(BigDecimal("24"))
    }

  }

  val v = randomInt(99).toString

  // collection of property path expressions to explicitly test for reversibility of deserialization and re-serialization
  val paths = Map(
    "declaration.goodsShipment.governmentAgencyGoodsItems[0].commodity.invoiceLine.itemChargeAmount.currencyId" -> v,
    "declaration.additionalDocuments[0].typeCode" -> v,
    "declaration.goodsShipment.importer.address.postcodeId" -> v,
    "declaration.goodsShipment.governmentAgencyGoodsItems[0].commodity.dutyTaxFees[0].quotaOrderId" -> v,
    "declaration.typeCode" -> ""
  )

  paths.foreach { entry =>
    s"${entry._1}" should {
      "be deserializable and serializable as properties" in {
        val meta = MetaData.fromProperties(Map(entry))
        val map = meta.toProperties
        withClue(entry._1) {
          map(entry._1) must be(entry._2)
        }
      }
    }
  }

  val dateWithooutZoneFormat = "102"
  val dateWithZoneFormat = "304"
  val year = "2019"
  val month = "02"
  val day = "25"
  val hour = "07"
  val minute = "56"
  val second = "23"

  "Date Time Formatter" should {
    "accept and recognize 102 date format" in {
      val date = DateTimeString(dateWithooutZoneFormat, year + month + day)
      val parsedDate = date.time

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
    }

    "accept and recognize 304 date format with Z" in {
      val zone = "Z"
      val time = year + month + day + hour + minute + second + zone

      val date = DateTimeString(dateWithZoneFormat, time)
      val parsedDate = date.time

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }

    "accept and recognize 304 date format with zone (+)" in {
      val zone = "+01"
      val time = year + month + day + hour + minute + second + zone

      val date = DateTimeString(dateWithZoneFormat, time)
      val parsedDate = date.time

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }

    "accept and recognize 304 date format with zone (-)" in {
      val zone = "-01"
      val time = year + month + day + hour + minute + second + zone

      val date = DateTimeString(dateWithZoneFormat, time)
      val parsedDate = date.time

      parsedDate.getYear must be(year.toInt)
      parsedDate.getMonthValue must be(month.toInt)
      parsedDate.getDayOfMonth must be(day.toInt)
      parsedDate.getHour must be(hour.toInt)
      parsedDate.getMinute must be(minute.toInt)
      parsedDate.getSecond must be(second.toInt)
    }
  }
}
