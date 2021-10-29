--7) Listar el top 3 de pizzas más baratas
SELECT SIRVE.pizzeria, sirve.pizza, sirve.precio FROM sirve
ORDER BY sirve.precio ASC
LIMIT 3
