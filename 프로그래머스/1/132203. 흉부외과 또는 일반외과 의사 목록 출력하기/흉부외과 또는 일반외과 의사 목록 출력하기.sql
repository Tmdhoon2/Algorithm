select dr_name, dr_id, mcdp_cd, substr(hire_ymd, 1, 10)
from doctor
where mcdp_cd = 'CS' or mcdp_cd = 'GS'
order by hire_ymd desc, dr_name asc