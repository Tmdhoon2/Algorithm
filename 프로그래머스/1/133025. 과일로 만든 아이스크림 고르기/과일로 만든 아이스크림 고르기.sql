select flavor
from first_half
natural join icecream_info
where total_order > 3000 and ingredient_type = 'fruit_based'
order by total_order desc
