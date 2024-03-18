-- 코드를 입력하세요
SELECT count(joined > '2021-01-01' and joined < '2021-12-31'
        and age between 20 and 29 ) as USERS
FROM USER_INFO
WHERE joined > '2021-01-01' and joined < '2021-12-31'
        and age between 20 and 29 