-- Write your query below
SELECT
    customers.customer_id,
    customer_name
FROM customers
LEFT JOIN orders
ON customers.customer_id = orders.customer_id
GROUP BY customers.customer_id, customer_name
HAVING 
    SUM(CASE WHEN product_name = 'A' then 1 else 0 END )>0 AND
    SUM(CASE WHEN product_name = 'B' then 1 else 0 END )>0 AND
    SUM(CASE WHEN product_name = 'C' then 1 else 0 END )<1 
ORDER BY customer_name