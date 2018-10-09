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

class TypeCodeValuesSpec extends WcoSpec {

  "load" should {

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
      TypeCodeValues.load("import-previous-procedures").filter(_.value == "00").head.display must be("00")
    }

    "parse incoterm-codes" in {
      TypeCodeValues.load("incoterm-codes").filter(_.value == "CFR").head.display must be("Cost and freight")
    }

    "parse location-types" in {
      TypeCodeValues.load("location-types").filter(_.value == "C").head.display must be("Certificate of Agreement Airfields")
    }

    "parse party-sub-role-types" in {
      TypeCodeValues.load("party-sub-role-types").filter(_.value == "WH").head.display must be("Warehouse Keeper")
    }

    "parse representative-status-codes" in {
      TypeCodeValues.load("representative-status-codes").filter(_.value == "3").head.display must be("Indirect representation")
    }

    "parse trade-movement-types" in {
      TypeCodeValues.load("trade-movement-types").filter(_.value == "CO").head.display must be("?")
    }

    "parse transport-mode-types" in {
      TypeCodeValues.load("transport-mode-types").filter(_.value == "2").head.display must be("Rail transport")
    }
  }
}
