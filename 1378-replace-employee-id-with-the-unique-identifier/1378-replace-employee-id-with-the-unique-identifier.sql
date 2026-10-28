# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees as e1
left join EmployeeUNI as e2
ON e1.id= e2.id