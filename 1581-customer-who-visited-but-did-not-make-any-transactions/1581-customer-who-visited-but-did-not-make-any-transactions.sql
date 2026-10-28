# Write your MySQL query statement below
SELECT e1.customer_id, COUNT(e1.visit_id) as count_no_trans
FROM Visits as e1
left join Transactions as e2
ON e1.visit_id= e2.visit_id
WHERE e2.transaction_id is NULL
GROUP BY e1.customer_id;
