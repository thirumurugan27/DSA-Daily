# Write your MySQL query statement below
SELECT 
    CASE
        When (id %2 = 0) THEN id-1
        When (id%2 = 1) AND id + 1 IN (SELECT id from Seat) THEN id+1
    ELSE id
    END as id,
    student
FROM Seat
Order By id asc;