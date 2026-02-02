-- select unique_id,name
-- FROM Employees e
-- LEFT JOIN EmployeeUNI em
-- on e.id=em.id;


SELECT unique_id,name
from Employees e
LEFT join EmployeeUNI eu
on e.id=eu.id;