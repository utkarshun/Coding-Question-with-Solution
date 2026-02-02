# Write your MySQL query statement below
-- SELECT customer_id,COUNT(*) as count_no_trans
-- FROM Visits v
-- LEFT JOIN Transactions t
-- on v.visit_id=t.visit_id
-- where t.transaction_id is null
-- GROUP BY v.customer_id;

-- SELECT customer_id,COUNT(*) as count_no_trans
-- FROM Visits v
-- LEFT JOIN Transactions t
-- on v.visit_id=t.visit_id
-- WHERE t.transaction_id is null
-- GROUP BY v.customer_id;

SELECT customer_id,COUNT(*) AS count_no_trans FROM visits v
LEFT JOIN Transactions t
ON v.visit_id=t.visit_id
WHERE t.transaction_id is null
GROUP BY v.customer_id;



