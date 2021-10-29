-- Obtener el total de precios del stock de productos

SELECT sum(precio_actual*stock) AS 'valor total'
FROM productos