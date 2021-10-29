--9) Listar todas las pizzas que son comidas por personas cuyo nombre termine con "s" o empiece con "a" 
--(sin tener en cuenta mayúsculas y minúsculas).
--Nota: Para no tener pizzas duplicadas, se les recomienda consultar por la palabra clave DISTINCT de SELECT

SELECT DISTINCT * FROM come
WHERE come.nombre LIKE "%S" OR "a&"