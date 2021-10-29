--NATURAL JOIN
-- Selecciono todos los elementos de la tabla estudiantes que tengan el mismo estudiantes.id_curso
--con todos los elementos de la tabla cursos que tengan el mismo cursos.id_curso
-- Pido que muestre solo los apellidos, nombres de los estudiantes y el nombre del curso
SELECT estudiantes.apellido, estudiantes.nombre, cursos.nombre_curso 
FROM estudiantes
NATURAL JOIN cursos