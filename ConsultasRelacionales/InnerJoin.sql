--INNER JOIN
-- Relaciono dos tablas (estudiantes y cursos) donde el id_curso sea el mismo
--Esta tabla excluye a los estudiantes que no se unieron a ningun curso

SELECT estudiantes.apellido, estudiantes.nombre, cursos.nombre_curso 
FROM estudiantes
INNER JOIN cursos ON cursos.id_curso = estudiantes.id_curso
