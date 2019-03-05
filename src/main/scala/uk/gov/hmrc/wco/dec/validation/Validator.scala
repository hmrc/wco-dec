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

package uk.gov.hmrc.wco.dec.validation
import uk.gov.hmrc.wco.dec.{MetaData, ProcedureCategory}

sealed trait ValidationScenario

case object ImportDeclarationSubmission extends ValidationScenario
case object ImportDeclarationCancellation extends ValidationScenario
case object ImportDeclarationAmendment extends ValidationScenario
case object ImportDeclarationArrival extends ValidationScenario

case object ExportDeclarationSubmission extends ValidationScenario

sealed trait ValidationFailure

case class ValidationReport(failures: Seq[ValidationFailure] = Seq.empty)

trait ValidationRule {

  val applicableScenarios: Set[ValidationScenario]

  def applyTo(meta: MetaData): Seq[ValidationFailure]

}

abstract class ProcedureCategoryValidationRule(procedureCategory: ProcedureCategory) extends ValidationRule {

  override def applyTo(meta: MetaData): Seq[ValidationFailure] =
    if (meta.procedureCategories.contains(procedureCategory)) applyProcedureCategoryRule(meta)
    else Seq.empty

  def applyProcedureCategoryRule(meta: MetaData): Seq[ValidationFailure]

}

class Validator(rules: Set[ValidationRule]) {

  def validate(meta: MetaData, scenario: ValidationScenario): ValidationReport =
    ValidationReport(
      rules
        .filter(_.applicableScenarios.contains(scenario))
        .flatMap(_.applyTo(meta))
        .toSeq
    )

}
