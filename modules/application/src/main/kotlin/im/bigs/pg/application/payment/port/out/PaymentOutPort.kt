package im.bigs.pg.application.payment.port.out

import im.bigs.pg.domain.payment.Payment
import java.time.LocalDateTime

/**
 * 영속성 어댑터가 구현할 출력 포트.
 * - 조회 결과는 `createdAt desc, id desc` 정렬을 전제로 합니다.
 */
interface PaymentOutPort {
    fun save(payment: Payment): Payment

    fun findBy(query: PaymentQuery): PaymentPage

    fun summary(filter: PaymentSummaryFilter): PaymentSummaryProjection

    fun findByPartnerApprovalOnDay(filter: ApprovalLookupFilter): Payment?
}
