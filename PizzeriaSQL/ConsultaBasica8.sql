--8) Listar del precio más bajo al más alto, las pizzerías que vendan pizza "pepperoni"

SELECT * FROM sirve
WHERE sirve.pizza = "pepperoni"
ORDER BY sirve.precio ASC