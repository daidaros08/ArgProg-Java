-- 	FAIL

CREATE TABLE "ventas2"(
"id"	INTEGER PRIMARY KEY ON CONFLICT FAIL, 
"id_vendedor" INTEGER,
"total" REAL CHECK ("total">=0),
"fecha" TEXT);

--INSERTA SOLAMENTE HASTA QUE SE EJECUTA EL ERROR:
-- INGRESA EL ID 2, EL 1 SE REPITE Y POR LO TANTO FALLA, EL 3 NO LLEGA A EJECUTARSE
-- EL FAIL INSERTA TODOS LOS DATOS ANTERIORES AL ERROR Y DESCARTA TODOS LOS POSTERIORES
INSERT INTO ventas2 (id, total) 
VALUES (2,200),(1,200), (3,200);