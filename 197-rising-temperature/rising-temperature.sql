SELECT o.id
FROM Weather o
JOIN Weather i
    ON i.recordDate = DATE_SUB(o.recordDate, INTERVAL 1 DAY)
WHERE o.temperature > i.temperature;