--1) Listar las publicaciones
SELECT contenido FROM publicacion


--2) Mostrar la publicación con menos visitas
SELECT contenido, visitas FROM publicacion
ORDER BY visitas 
LIMIT 1


--3) Mostrar la publicación con mas visitas
SELECT contenido, visitas FROM publicacion
ORDER BY visitas DESC
LIMIT 1


--4) Mostrar la cantidad de favoritos
SELECT COUNT(*) FROM favoritos


--5) Listar los id de las publicaciones que fueron agregadas a favoritos
SELECT DISTINCT favoritos.p_id FROM favoritos
ORDER BY favoritos.p_id


--6) Listar los alias de los usuarios que agregaron a favoritos
SELECT DISTINCT favoritos.u_nombre FROM favoritos
ORDER BY favoritos.p_id


-- 7) Listar los usuarios formateando las fechas a formato DIA-MES-ANIO
SELECT nombre, strftime('%d-%m-%Y %H:%M:%S',f_nacimiento) as "f_nac", strftime('%d-%m-%Y %H:%M:%S',f_registro) as "f_reg" 
FROM usuario


-- 8)Listar las publicaciones que tengan mas de 100 visitas, mostrando primero las mas recientes
SELECT publicacion.contenido, f_publicacion From publicacion
WHERE publicacion.visitas >100
ORDER BY publicacion.f_publicacion DESC


--9) Listar las publicaciones que tengan mas de 100 visitas y sean del ultimo año, mostrando primero las mas recientes
SELECT publicacion.contenido, f_publicacion From publicacion
WHERE publicacion.visitas >100 AND (f_publicacion > date('2021-01-01 00:00:00'))
ORDER BY publicacion.f_publicacion DESC


--10) Listar las publicaciones que tengan mas de 100 visitas y sean de los últimos 6 meses, mostrando primero las mas recientes
SELECT publicacion.contenido, f_publicacion From publicacion
WHERE publicacion.visitas >100 AND (f_publicacion < date('now') AND f_publicacion > date('now','-6 month'))
ORDER BY publicacion.f_publicacion DESC


--11) Mostrar la cantidad de visitas de las publicaciones de los últimos 6 meses
SELECT sum(publicacion.visitas) From publicacion
WHERE(f_publicacion < date('now') AND f_publicacion > date('now','-6 month'))
ORDER BY publicacion.f_publicacion DESC


--12)Listar el alias, fecha de nacimiento y edad de los usuarios
SELECT usuario.alias,usuario.f_nacimiento, datetime('now')- f_nacimiento  AS "edad" FROM usuario
ORDER BY "edad"


--13)Mostrar el promedio de edades de los usuarios
SELECT sum(datetime('now')- f_nacimiento) / Count(usuario.nombre) FROM usuario


--14)Listar los usuarios mayores de edad, ordenándolos de menor a mayor edad
SELECT usuario.alias, datetime('now')- f_nacimiento  AS "edad" FROM usuario
WHERE "edad" >=18
ORDER BY "edad"


--15)Listar los 10 usuarios mas chicos(en edad), ordenados por genero, y si su genero es el mismo por su nombre
SELECT usuario.nombre,usuario.genero, datetime('now')- f_nacimiento  AS "edad" FROM usuario
ORDER BY "edad" ASC, genero, nombre
limit 10


--16)Listar los usuarios llamados 'Juan'
SELECT usuario.nombre FROM usuario
WHERE nombre LIKE "Juan %"


--17) Listar los usuarios que hayan creado una publicación y su alias comience con 'a', el alias debe mostrarse en mayúscula
SELECT DISTINCT upper(creador) FROM publicacion
WHERE publicacion.contenido IS NOT NULL AND publicacion.creador LIKE 'a%'


--18)Listar las publicaciones con un contenido de menos de 20 caracteres
SELECT contenido FROM publicacion
WHERE length(contenido) < 20


--19) Listar las publicaciones recortando el contenido a 20 caracteres
SELECT substr(contenido,0,20) FROM publicacion
