-- cantidad de vendedores por sucursal
SELECT sucursales.nombre, count(*) AS 'cantidad_vendedores'
 FROM vendedores
JOIN sucursales ON sucursales.id = vendedores.sucursal
GROUP BY sucursal