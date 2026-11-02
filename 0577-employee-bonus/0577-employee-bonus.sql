# Write your MySQL query statement below
SELECT A.name, B.bonus
FROM Employee as A
Left Join Bonus as B 
ON A.empId= B.empId
WHERE bonus < 1000 OR Bonus IS NULL