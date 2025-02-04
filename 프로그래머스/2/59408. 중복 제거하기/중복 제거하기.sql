select count(name) from (
    select name from animal_ins group by name
) A