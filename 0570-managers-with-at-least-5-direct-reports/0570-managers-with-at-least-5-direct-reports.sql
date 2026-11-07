# Write your MySQL query statement below
SELECT A.Name 
FROM Employee AS A
INNER JOIN Employee AS B
ON A.id= B.managerId 
GROUP BY B.managerId
HAVING COUNT(B.managerId) >= 5;
