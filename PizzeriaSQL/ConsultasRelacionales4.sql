--4) Listar el nombre de todas las mujeres que comen al menos un gusto de pizza que sirve 'Straw Hat'
SELECT persona.nombre, frecuenta.pizzeria FROM persona
LEFT JOIN frecuenta ON frecuenta.nombre = persona.nombre
WHERE persona.sexo LIKE "femenino" AND frecuenta.pizzeria LIKE 'Straw Hat'