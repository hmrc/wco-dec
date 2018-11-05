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

sealed trait ResponseSpecTestName
case object TestNoTagForOptionalField extends ResponseSpecTestName
case object TestNoTagForOptionalSequence extends ResponseSpecTestName
case object TestNoTagForOptionalNestedSequence extends ResponseSpecTestName
case object TestNoValueForOptionalField extends ResponseSpecTestName
case object TestNoValueForOptionalSequence extends ResponseSpecTestName
case object TestNoValueForOptionalNestedSequence extends ResponseSpecTestName

case object TestWCODataModelVersionCode extends ResponseSpecTestName
case object TestWCOTypeName extends ResponseSpecTestName
case object TestResponsibleCountryCode extends ResponseSpecTestName
case object TestResponsibleAgencyName extends ResponseSpecTestName
case object TestAgencyAssignedCustomizationCode extends ResponseSpecTestName
case object TestAgencyAssignedCustomizationVersionCode extends ResponseSpecTestName

case object TestFunctionCode extends ResponseSpecTestName
case object TestFunctionalReferenceID extends ResponseSpecTestName
case object TestIssueDateTime extends ResponseSpecTestName
case object TestAdditionalInformation extends ResponseSpecTestName
case object TestAmendment extends ResponseSpecTestName
case object TestAppealOffice extends ResponseSpecTestName
case object TestBank extends ResponseSpecTestName
case object TestContactOffice extends ResponseSpecTestName
case object TestError extends ResponseSpecTestName
case object TestStatus extends ResponseSpecTestName
case object TestRespDeclaration extends ResponseSpecTestName
case object TestRespDeclarationDutyTaxFee extends ResponseSpecTestName
case object TestRespDeclarationGoodsShipment extends ResponseSpecTestName
