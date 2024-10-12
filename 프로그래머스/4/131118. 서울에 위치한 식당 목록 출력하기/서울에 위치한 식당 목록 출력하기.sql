select rest_id, rest_name, food_type, favorites, address, round(avg(review_score), 2) as score
from rest_info natural join rest_review
where address like '서울%'
group by rest_name
order by score desc, favorites desc
