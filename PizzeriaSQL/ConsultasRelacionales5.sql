--5) Listar todas las pizzerías que sirven al menos una pizza por menos de $10
-- y que al menos Ana o Florencia coman
SELECT sirve.pizzeria, sirve.precio, frecuenta.nombre FROM sirve
LEFT JOIN frecuenta ON frecuenta.pizzeria = sirve.pizzeria
WHERE (frecuenta.nombre LIKE 'Ana' OR frecuenta.nombre LIKE 'Florencia') AND sirve.precio < 10