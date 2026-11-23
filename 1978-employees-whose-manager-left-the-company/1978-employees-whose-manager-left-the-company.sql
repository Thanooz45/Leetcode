# Write your MySQL query statement below
select e.employee_id 
from Employees e left join Employees e1 on e.manager_id=e1.employee_id
where e.salary<30000 and e1.employee_id is null and e.manager_id is not null
order by e.employee_id;