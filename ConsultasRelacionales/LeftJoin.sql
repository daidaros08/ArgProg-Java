--LEFT JOIN
--selecciono todos los elementos de la tabla estudiantes y los uno con la tabla cursos,
-- en los casos donde los estudiantes no tengan id cursos toda la parte de cursos quedará como NULL.
-- Tomo todo estudiantes e incluyo la relacion con de estudiantes con cursos
SELECT * FROM estudiantes
LEFT OUTER JOIN cursos ON cursos.id_curso = estudiantes.id_curso
--agrego la exclusion
WHERE cursos.id_curso IS NULL