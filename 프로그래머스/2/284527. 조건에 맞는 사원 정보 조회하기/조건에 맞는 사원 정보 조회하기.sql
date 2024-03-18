
SELECT SUM(score) as SCORE,
        emp.emp_no as EMP_NO,
        emp.emp_name as EMP_NAME,
        position as POSITION, 
        email as EMAIL
FROM HR_EMPLOYEES emp JOIN HR_GRADE gr
ON emp.emp_no = gr.emp_no
GROUP BY emp.emp_no
HAVING SUM(score)
ORDER BY SCORE desc
LIMIT 1



/*
max(score) as SCORE,
    emp.emp_no as EMP_NO,
    emp.emp_name as EMP_NAME,
    position as POSITION, 
    email as EMAIL
*/

