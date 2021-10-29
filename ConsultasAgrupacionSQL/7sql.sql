--calcular totales de ventas
SELECT ventas.id,  sum(productos.precio_actual * ventas_productos.cantidad) AS 'total'
FROM ventas_productos
JOIN productos ON productos.id = ventas_productos.id_producto
JOIN ventas ON ventas.id = ventas_productos.id_venta
GROUP BY ventas.id


-- actualizar los datos partir de la consulta anterior
UPDATE ventas
SET total = total_venta
FROM (SELECT ventas.id AS 'id_venta',  sum(productos.precio_actual * ventas_productos.cantidad) AS 'total_venta'
FROM ventas_productos
JOIN productos ON productos.id = ventas_productos.id_producto
JOIN ventas ON ventas.id = ventas_productos.id_venta
GROUP BY ventas.id
)
WHERE id = id_venta