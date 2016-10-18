/*
 * Copyright 2016 HM Revenue & Customs
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

package uk.gov.hmrc.hmrcemailrenderer.templates.tamc

import uk.gov.hmrc.hmrcemailrenderer.domain.MessageTemplate
import uk.gov.hmrc.hmrcemailrenderer.templates.ServiceIdentifier.TaxAllowanceForMarriedCouples
import uk.gov.hmrc.hmrcemailrenderer.templates.FromAddress.govUkTeamAddress

object TamcTemplates {
  val templates = Seq(
    MessageTemplate.create(
      templateId = "tamc_confirmation_template_id",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your application for Marriage Allowance",
      plainTemplate = txt.tamcConfirmationEmail.f,
      htmlTemplate = html.tamcConfirmationEmail.f),
    MessageTemplate.create(
      templateId = "tamc_confirmation_pta",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your application for Marriage Allowance",
      plainTemplate = txt.tamcConfirmationPtaEmail.f,
      htmlTemplate = html.tamcConfirmationPtaEmail.f),
    MessageTemplate.create(
      templateId = "tamc_update_cancel",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcUpdateCancel.f,
      htmlTemplate = html.tamcUpdateCancel.f),
    MessageTemplate.create(
      templateId = "tamc_update_reject",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcUpdateReject.f,
      htmlTemplate = html.tamcUpdateReject.f),
    MessageTemplate.create(
      templateId = "tamc_update_divorce_transferor_boy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcUpdateDivorceTransBoy.f,
      htmlTemplate = html.tamcUpdateDivorceTransBoy.f),
    MessageTemplate.create(
      templateId = "tamc_update_divorce_recipient_eoy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcUpdateDivorceRecEoy.f,
      htmlTemplate = html.tamcUpdateDivorceRecEoy.f),
    MessageTemplate.create(
      templateId = "tamc_current_year",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your application for Marriage Allowance",
      plainTemplate = txt.tamcCurrentYrApplicationEmail.f,
      htmlTemplate = html.tamcCurrentYrApplicationEmail.f),
    MessageTemplate.create(
      templateId = "tamc_retro_year",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your application for Marriage Allowance",
      plainTemplate = txt.tamcRetroYrApplicationEmail.f,
      htmlTemplate = html.tamcRetroYrApplicationEmail.f),
    MessageTemplate.create(
      templateId = "tamc_current_retro_year",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your application for Marriage Allowance",
      plainTemplate = txt.tamcCurrentRetroYrApplicationEmail.f,
      htmlTemplate = html.tamcCurrentRetroYrApplicationEmail.f),
    MessageTemplate.create(
      templateId = "tamc_transferor_divorce_previous_yr",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcTransferorDivorcePreviousYrEmail.f,
      htmlTemplate = html.tamcTransferorDivorcePreviousYrEmail.f),
    MessageTemplate.create(
      templateId = "tamc_recipient_divorce_previous_yr",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcRecipientDivorcePreviousYrEmail.f,
      htmlTemplate = html.tamcRecipientDivorcePreviousYrEmail.f),
    MessageTemplate.create(
      templateId = "tamc_transferor_divorce_current_yr",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcTransferorDivorceCurrentYr.f,
      htmlTemplate = html.tamcTransferorDivorceCurrentYr.f),
    MessageTemplate.create(
      templateId = "tamc_recipient_rejects_retro_yr",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your change to Marriage Allowance",
      plainTemplate = txt.tamcRecipientRejectsRetroYrEmail.f,
      htmlTemplate = html.tamcRecipientRejectsRetroYrEmail.f),
    MessageTemplate.create(
      templateId = "tamc_update_cancel_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcUpdateCancelCy.f,
      htmlTemplate = html.tamcUpdateCancelCy.f),
    MessageTemplate.create(
      templateId = "tamc_update_reject_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcUpdateRejectCy.f,
      htmlTemplate = html.tamcUpdateRejectCy.f),
    MessageTemplate.create(
      templateId = "tamc_update_divorce_transferor_boy_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcUpdateDivorceTransBoyCy.f,
      htmlTemplate = html.tamcUpdateDivorceTransBoyCy.f),
    MessageTemplate.create(
      templateId = "tamc_update_divorce_recipient_eoy_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcUpdateDivorceRecEoyCy.f,
      htmlTemplate = html.tamcUpdateDivorceRecEoyCy.f),
    MessageTemplate.create(
      templateId = "tamc_current_year_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich cais am Lwfans Priodas",
      plainTemplate = txt.tamcCurrentYrApplicationEmailCy.f,
      htmlTemplate = html.tamcCurrentYrApplicationEmailCy.f),
    MessageTemplate.create(
      templateId = "tamc_retro_year_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich cais am Lwfans Priodas",
      plainTemplate = txt.tamcRetroYrApplicationEmailCy.f,
      htmlTemplate = html.tamcRetroYrApplicationEmailCy.f),
    MessageTemplate.create(
      templateId = "tamc_current_retro_year_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich cais am Lwfans Priodas",
      plainTemplate = txt.tamcCurrentRetroYrApplicationEmailCy.f,
      htmlTemplate = html.tamcCurrentRetroYrApplicationEmailCy.f),
    MessageTemplate.create(
      templateId = "tamc_transferor_divorce_previous_yr_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcTransferorDivorcePreviousYrEmailCy.f,
      htmlTemplate = html.tamcTransferorDivorcePreviousYrEmailCy.f),
    MessageTemplate.create(
      templateId = "tamc_recipient_divorce_previous_yr_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcRecipientDivorcePreviousYrEmailCy.f,
      htmlTemplate = html.tamcRecipientDivorcePreviousYrEmailCy.f),
    MessageTemplate.create(
      templateId = "tamc_transferor_divorce_current_yr_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcTransferorDivorceCurrentYrCy.f,
      htmlTemplate = html.tamcTransferorDivorceCurrentYrCy.f),
    MessageTemplate.create(
      templateId = "tamc_recipient_rejects_retro_yr_cy",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Eich newid i Lwfans Priodas",
      plainTemplate = txt.tamcRecipientRejectsRetroYrEmailCy.f,
      htmlTemplate = html.tamcRecipientRejectsRetroYrEmailCy.f),
    MessageTemplate.create(
      templateId = "tamc_access_invitation_template_id",
      fromAddress = govUkTeamAddress,
      service = TaxAllowanceForMarriedCouples,
      subject = "Your HMRC Marriage Allowance link",
      plainTemplate = txt.tamcVerificationEmail.f,
      htmlTemplate = html.tamcVerificationEmail.f)

  )
}
