# Write your MySQL query statement below
select u.name,
CASE 
    WHEN SUM(r.distance) is null THEN 0 
    ELSE SUM(r.distance) 
END as travelled_distance from Users u
left join Rides r on u.id=r.user_id 
group by r.user_id
order by travelled_distance desc,u.name asc