-- 코드를 작성해주세요
SELECT count(month(time)) as FISH_COUNT
        ,month(time) as MONTH
FROM FISH_INFO
GROUP BY month(time) 
ORDER BY month(time) asc
