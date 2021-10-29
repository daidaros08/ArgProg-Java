--cantidad de ventas por cada vendedor por cada sucursal
SELECT sucursales.nombre AS 'sucursal', vendedores.nombre AS 'vendedor', count(*) AS 'cantidad_ventas' 
FROM ventas
JOIN vendedores ON vendedores.id = ventas.id_vendedor
JOIN sucursales ON sucursales.id = vendedores.sucursal
GROUP BY vendedores.id
ORDER BY sucursales.id