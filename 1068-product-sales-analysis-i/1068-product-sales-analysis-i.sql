# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales as e1
Left join Product as e2
ON e1.product_id= e2.product_id