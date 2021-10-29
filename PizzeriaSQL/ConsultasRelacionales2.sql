--2) Listar todos los gustos de pizzas que comen las personas mayores de edad (mayor o igual a 18 años)

SELECT come.nombre, come.pizza, persona.edad AS "edad" FROM come
LEFT OUTER JOIN persona ON come.nombre = persona.nombre
WHERE persona.edad >= 18