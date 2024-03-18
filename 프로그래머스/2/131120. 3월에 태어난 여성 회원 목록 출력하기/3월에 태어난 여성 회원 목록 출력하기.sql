-- 코드를 입력하세요
SELECT member_id as MEMBER_ID,
        member_name as MEMBER_NAME,
        gender as GENDER,
        DATE_FORMAT(date_of_birth, '%Y-%m-%d') as DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE MONTH(date_of_birth) = '03' and TLNO is not null and gender = 'W'
ORDER BY member_id