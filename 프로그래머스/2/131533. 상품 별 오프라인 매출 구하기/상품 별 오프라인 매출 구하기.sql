-- 코드를 입력하세요
SELECT product_code as PRODUCT_CODE,
        sum(price * sales_amount) as SALES
FROM PRODUCT p JOIN OFFLINE_SALE o
ON p.product_id = o.product_id
GROUP BY product_code
ORDER BY SALES desc, product_code asc;