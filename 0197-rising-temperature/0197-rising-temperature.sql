# Write your MySQL query statement below
SELECT A.id
FROM Weather A INNER JOIN Weather B 
ON DATEDIFF(A.recordDate , B.recordDate) = 1 AND A.temperature > B.temperature;