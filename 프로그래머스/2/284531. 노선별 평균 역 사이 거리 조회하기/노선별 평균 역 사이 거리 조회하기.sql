-- 코드를 작성해주세요
SELECT route as ROUTE,
        CONCAT(ROUND(sum(d_between_dist),1),'km') as TOTAL_DISTANCE,
        CONCAT(ROUND(avg(d_between_dist),2),'km') as AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY route
ORDER BY ROUND(sum(d_between_dist),1) desc