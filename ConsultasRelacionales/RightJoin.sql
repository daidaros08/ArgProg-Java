--RIGHT JOIN
SELECT * FROM estudiantes
RIGHT OUTER JOIN cursos ON cursos.id_curso = estudiantes.id_curso


-- SQLite no implementa este JOIN por lo que no se puede aplicar con la sintaxis estandar,
-- sin embargo hay otras maneras de lograr estos resultados:
-- implementamos un LEFT JOIN al reves, modificando el orden de las tablas (en el anterior usamos estudiantes
-- como referencia), aqui tomamos cursos

SELECT * FROM cursos
LEFT OUTER JOIN estudiantes ON estudiantes.id_curso = cursos.id_curso
--agrego la exclusion
WHERE estudiantes.id_curso IS NULL