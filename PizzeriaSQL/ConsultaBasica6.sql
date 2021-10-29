-- 6) Listar todos los gustos de pizzas servidos por todas las pizzerías de mayor a menor precio.
-- Si su precio es el mismo, ordenar alfabéticamente primero por pizzería y luego por gusto.

SELECT sirve.pizzeria, sirve.pizza, sirve.precio FROM sirve
ORDER BY sirve.precio DESC, sirve.pizzeria, sirve.pizza