--cantidad de ventas por sucursal
SELECT sucursales.nombre, 	COUNT(*) AS 'cantidad_ventas'
FROM ventas
JOIN vendedores ON vendedores.id = ventas.id_vendedor
JOIN sucursales ON sucursales.id = vendedores.sucursal
GROUP BY sucursales.id