-- 파트너 (id=1 활성)
INSERT INTO partner (id, code, name, active)
VALUES (1, 'P1', '테스트파트너', TRUE);

-- 수수료 정책: 2024-01-01부터 유효 (2.35% + 100원)
INSERT INTO partner_fee_policy (partner_id, effective_from, percentage, fixed_fee)
VALUES (1, TIMESTAMP '2024-01-01 00:00:00', 0.0235, 100);

INSERT INTO partner_fee_policy (partner_id, effective_from, percentage, fixed_fee)
VALUES (1, TIMESTAMP '2025-01-01 00:00:00', 0.0300, 0);