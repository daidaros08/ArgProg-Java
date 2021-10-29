--1) Listar aquellas personas que sean menores de edad (menor a 18 años),
-- junto con todos los gustos de pizzas que comen

SELECT come.* FROM come
INNER JOIN persona ON come.nombre = persona.nombre
WHERE persona.edad < 18