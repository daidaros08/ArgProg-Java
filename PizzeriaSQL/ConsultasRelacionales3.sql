--3) Listar todas las pizzas comidas por al menos una mujer de más de 20 años
SELECT persona.nombre, persona.edad, come.pizza FROM persona
LEFT JOIN come ON persona.nombre = come.nombre
WHERE persona.edad >20 AND persona.sexo="femenino"