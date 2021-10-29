-- stock de productos vendidos por nombre de productos 
SELECT productos.nombre, sum(ventas_productos.cantidad) AS 'cantidad' 
FROM ventas_productos
JOIN productos ON productos.id = ventas_productos.id_producto 
GROUP BY productos.id
ORDER BY productos.nombre