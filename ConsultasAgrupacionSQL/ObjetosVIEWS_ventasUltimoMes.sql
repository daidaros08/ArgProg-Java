DROP VIEW "main"."ventas_ultimo_mes";
CREATE VIEW ventas_ultimo_mes AS
SELECT vendedores.nombre, count(*) AS 'cantidad_ventas'
FROM ventas
JOIN vendedores ON vendedores.id=ventas.id_vendedor
WHERE ventas.fecha > date ('now','-1 month')
GROUP BY vendedores.id