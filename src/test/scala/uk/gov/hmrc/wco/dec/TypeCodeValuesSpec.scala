/*
 * Copyright 2022 HM Revenue & Customs
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

class TypeCodeValuesSpec extends WcoSpec {

  "load" should {

    "throw given non-existent type code list name" in {
      an [IllegalArgumentException] must be thrownBy TypeCodeValues.load("this does not, nor could it ever, exist as a type code value list name")
    }

    "parse airport-codes" in {
      TypeCodeValues.load("airport-codes").filter(_.value == "ABR").head.display must be("Aberdeen Regional");
      TypeCodeValues.load("airport-codes").filter(_.value == "ABR").head.additionalDisplay must be(Some("Aberdeen, United States"))
    }

    "parse allowed-additional-documents" in {
      TypeCodeValues.load("allowed-additional-documents").filter(_.value == "A004").head.display must be("Certificate of authenticity Tobacco. EC Reg 1031/2008 amending Annex 1 to Council Regulation 2658/87.")
    }

    "parse commodity-classification-type" in {
      TypeCodeValues.load("commodity-classification-type").filter(_.value == "GN").head.display must be("National product group code")
    }

    "parse country-codes" in {
      TypeCodeValues.load("country-codes").filter(_.value == "AQ").head.display must be("Antarctica")
    }

    "parse country-region-sub-role-types" in {
      TypeCodeValues.load("country-region-sub-role-types").filter(_.value == "2").head.display must be("Preferential origin")
    }

    "parse currency-codes" in {
      TypeCodeValues.load("currency-codes").filter(_.value == "XCD").head.display must be("East Caribbean Dollar")
    }

    "parse customs-offices" in {
      TypeCodeValues.load("customs-offices").filter(_.value == "GBABD001").head.display must be("Aberdeen, Ruby House")
    }

    "parse customs-warehouse-types" in {
      TypeCodeValues.load("customs-warehouse-types").filter(_.value == "S").head.display must be("Public customs warehouse type II")
    }

    "parse declaration-types" in {
      TypeCodeValues.load("declaration-types").filter(_.value == "Z").head.display must be("Supplementary declarations for Entry in Declarants Records")
    }

    "parse declared-guarantee-types" in {
      TypeCodeValues.load("declared-guarantee-types").filter(_.value == "1").head.display must be("For comprehensive guarantee (Article 89(5) of the Code")
    }

    "parse document-category" in {
      TypeCodeValues.load("document-category").filter(_.value == "X").head.display must be("Temporary storage")
    }

    "parse duty-tax-fee-types" in {
      TypeCodeValues.load("duty-tax-fee-types").filter(_.value == "A30").head.display must be("Definitive anti-dumping duties (ADD)")
    }

    "parse eu-countries" in {
      TypeCodeValues.load("eu-countries").filter(_.value == "AT").head.display must be("Austria")
    }

    "parse goods-item-valuation-adjustment-types" in {
      TypeCodeValues.load("goods-item-valuation-adjustment-types").filter(_.value == "AF").head.display must be("Tools, dies, moulds and similar items used in the production of the imported goods, declared as a monetary amount")
    }

    "parse government-procedure-types" in {
      TypeCodeValues.load("government-procedure-types").filter(_.value == "01").head.display must be("01")
    }

    "parse header-valuation-adjustment-types" in {
      TypeCodeValues.load("header-valuation-adjustment-types").filter(_.value == "AG").head.display must be("Materials consumed in the production of the imported goods")
    }

    "parse import-previous-documents" in {
      TypeCodeValues.load("import-previous-documents").filter(_.value == "T2F").head.display must be("Internal Union Transit Declaration - Article 227 of the code")
    }

    "parse import-previous-procedures" in {
      TypeCodeValues.load("import-previous-procedures").filter(_.value == "00").head.display must be("Release to a customs warehouse where the goods have not been subject to any previous procedure")
    }

    "parse incoterm-codes" in {
      TypeCodeValues.load("incoterm-codes").filter(_.value == "CFR").head.display must be("Cost and freight")
    }

    "parse location-types" in {
      TypeCodeValues.load("location-types").filter(_.value == "C").head.display must be("Certificate of Agreement Airfields")
    }

    "parse measure-unit-types" in {
      TypeCodeValues.load("measure-unit-types").filter(_.value == "DTN#E").head.display must be("Hectokilogram net of drained weight")
    }

    "parse non-third-countries" in {
      TypeCodeValues.load("non-third-countries").filter(_.value == "AD").head.display must be("Andorra")
    }

    "parse package-types" in {
      TypeCodeValues.load("package-types").filter(_.value == "1D").head.display must be("Drum, plywood")
    }

    "parse party-role-authorization-types" in {
      TypeCodeValues.load("party-role-authorization-types").filter(_.value == "ACR").head.display must be("Authorised consignor for Union transit")
    }

    "parse party-sub-role-types" in {
      TypeCodeValues.load("party-sub-role-types").filter(_.value == "WH").head.display must be("Warehouse Keeper")
    }

    "parse party-role-status-types" in {
      TypeCodeValues.load("party-role-status-types").filter(_.value == "3").head.display must be("Indirect representation")
    }

    "parse payment-method-types" in {
      TypeCodeValues.load("payment-method-types").filter(_.value == "B").head.display must be("Immediate payment by corporate credit card")
    }

    "parse preference-types" in {
      TypeCodeValues.load("preference-types").filter(_.value == "118").head.display must be("Tariff suspension subject to the production of a special certificate.")
    }

    "parse special-mention-types" in {
      TypeCodeValues.load("special-mention-types").filter(_.value == "10200").head.display must be("Full authorisation holders only: discharge of Inward Processing (Article 241(1) EU reg. number 2015/2446 (DA)).")
    }

    "parse special-procedure-types" in {
      TypeCodeValues.load("special-procedure-types").filter(_.value == "B06").head.display must be("Processed products returning - VAT only")
    }

    "parse trade-movement-types" in {
      TypeCodeValues.load("trade-movement-types").filter(_.value == "CO").head.display must be("All the goods being declared are from a Special Fiscal Territory of the EU or a country with which the EU has formed a Customs Union.")
    }

    "parse transaction-nature-types-a-man" in {
      TypeCodeValues.load("transaction-nature-types-a-man").filter(_.value == "2").head.display must be("Return and replacement of goods free of charge after registration of the original transaction")
    }

    "parse transaction-nature-types-b-opt" in {
      TypeCodeValues.load("transaction-nature-types-b-opt").filter(_.value == "11").head.display must be("Outright purchase/sale")
    }

    "parse transport-means-identification-types" in {
      TypeCodeValues.load("transport-means-identification-types").filter(_.value == "10").head.display must be("IMO ship identification number")
    }

    "parse transport-mode-types" in {
      TypeCodeValues.load("transport-mode-types").filter(_.value == "2").head.display must be("Rail transport")
    }

    "parse valuation-indicator-types" in {
      TypeCodeValues.load("valuation-indicator-types").filter(_.value == "1").head.display must be("Party relationship, whether there is price influence or not.")
    }

    "parse valuation-method-types" in {
      TypeCodeValues.load("valuation-method-types").filter(_.value == "3").head.display must be("Valuation Method 3 - Transaction value of similar goods");
      TypeCodeValues.load("valuation-method-types").filter(_.value == "3").head.additionalDisplay must be(Some("N934 if instructed to complete a form DV1 by Customs, otherwise not applicable"))
    }
  }
}
