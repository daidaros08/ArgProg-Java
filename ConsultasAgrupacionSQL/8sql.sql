-- Precio de venta por mes donde la cantidad de ventas
SELECT strftime('%Y-%m', ventas.fecha) AS 'mes', sum(ventas.total) AS 'total'
FROM ventas
GROUP BY mes
HAVING count(*) <10
ORDER BY mes