-- Mejor y peor mes de ventas en precio
SELECT periodo, max(total)AS 'total'
FROM (
	SELECT strftime('%Y-%m', ventas.fecha) AS 'periodo', sum (total) AS 'total'
	FROM ventas
	GROUP BY periodo)
	
UNION ALL

SELECT periodo, min(total)AS 'total'
FROM (
	SELECT strftime('%Y-%m', ventas.fecha) AS 'periodo', sum (total) AS 'total'
	FROM ventas
	GROUP BY periodo)
ORDER BY total



