-- CROSS JOIN
-- realiza un producto cartesiano donde agarra la primera fila de estudiantes y las relaciona con cada fila de cursos,
--luego pasa a la segunda y hace lo mismo y asi sucesivamente. 
--el resultado es 6600 filas que surgen del calculo de estudiantes.filas*cursos.filas 
-- 300*22 = 6600
SELECT COUNT (*) FROM estudiantes --devuelve cantidad de filas = 6600
CROSS JOIN cursos


SELECT * FROM estudiantes --devuelve cada una de las 6600 filas
CROSS JOIN cursos
