--4) Listar todos los gustos de la base de datos (puede ser necesario tener que unir más de una consulta)

SELECT come.pizza FROM come
UNION
SELECT sirve.pizza FROM sirve