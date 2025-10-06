package im.bigs.pg.application.payment.port.out

import java.time.LocalDate


data class ApprovalLookupFilter(
    val partnerId: Long,
    val approvalCode: String,
    val approvedDateUtc: LocalDate
)
