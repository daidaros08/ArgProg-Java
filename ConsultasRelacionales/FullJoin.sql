--FULL JOIN
SELECT * FROM estudiantes
FULL OUTER JOIN cursos ON cursos.id_curso = estudiantes.id_curso

-- SQLite no implementa este JOIN por lo que no se puede aplicar con la sintaxis estandar,
-- sin embargo hay otras maneras de lograr estos resultados:
-- usamos un LEFT JOIN de estudiantes y mediante UNION realizamos un LEFT JOIN inverso (cursos)

SELECT estudiantes.*, cursos.* FROM estudiantes
LEFT JOIN cursos ON cursos.id_curso = estudiantes.id_curso
UNION ALL
SELECT * FROM cursos
LEFT OUTER JOIN estudiantes ON estudiantes.id_curso = cursos.id_curso
--agrego exclusion
WHERE estudiantes.id_curso IS NULL
ORDER BY cursos.id_curso, estudiantes.id_curso