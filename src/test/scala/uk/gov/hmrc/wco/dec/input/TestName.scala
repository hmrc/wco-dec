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

package uk.gov.hmrc.wco.dec.input

sealed trait TestName
case object TestNoTagForOptionalField extends TestName
case object TestNoTagForOptionalSequence extends TestName
case object TestNoTagForOptionalNestedSequence extends TestName
case object TestNoValueForOptionalField extends TestName
case object TestNoValueForOptionalSequence extends TestName
case object TestNoValueForOptionalNestedSequence extends TestName

case object TestWCODataModelVersionCode extends TestName
case object TestWCOTypeName extends TestName
case object TestResponsibleCountryCode extends TestName
case object TestResponsibleAgencyName extends TestName
case object TestAgencyAssignedCustomizationCode extends TestName
case object TestAgencyAssignedCustomizationVersionCode extends TestName

case object TestFunctionCode extends TestName
case object TestFunctionalReferenceID extends TestName
case object TestIssueDateTime extends TestName
case object TestAdditionalInformation extends TestName
case object TestAmendment extends TestName
case object TestAppealOffice extends TestName
case object TestBank extends TestName
case object TestContactOffice extends TestName
case object TestError extends TestName
case object TestStatus extends TestName
case object TestRespDeclaration extends TestName
case object TestRespDeclarationDutyTaxFee extends TestName
case object TestRespDeclarationGoodsShipment extends TestName
