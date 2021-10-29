-- cantidad de vendedores que ingresaron por año

SELECT COUNT (*),strftime('%Y', fecha_ingreso) AS 'anio_ingreso' FROM vendedores
GROUP BY "anio_ingreso"