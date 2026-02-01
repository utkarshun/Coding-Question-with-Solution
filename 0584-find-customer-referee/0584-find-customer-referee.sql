-- SELECT name
-- FROM Customer
-- WHERE referee_id is null or referee_id!=2;
-- SELECT name
-- FROM Customer
-- where referee_id!=2 or referee_id is null;
select name
from Customer
where referee_id is null or referee_id!=2;
