# Write your MySQL query statement below
SELECT 
    t.request_at AS Day,
    ROUND(
        SUM(CASE WHEN t.status != 'completed' THEN 1 ELSE 0 END) / COUNT(*), 
        2
    ) AS 'Cancellation Rate'
FROM Trips t

