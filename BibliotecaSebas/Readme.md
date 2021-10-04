
#Biblioteca de Yael
Este ejercicio est� pensado para comenzarse durante la clase pr�ctica.

Yael ama los libros, y est� aprendiendo a programar en Java. Quiere poner en pr�ctica todos los conceptos aprendidos en clase, y decidi� unir esto con su pasi�n: desea tener un archivo digital de su biblioteca. Para ello:
1. Quiere guardar los libros, y poder ordenarlos seg�n distintos criterios.

    - De m�s largo a m�s breve
    - Por apellido del autor
    - Por t�tulo
    - Por t�tulo normalizado ("El ingenioso hidalgo don Quijote de la Mancha" -> "ingenioso hidalgo don Quijote de la Mancha, El". Los art�culos que inician el nombre de un libro, se colocan al final separados por una coma. "El Secreto -> Secreto, El")
    - Por a�o de publicaci�n
    
2. Quiere saber si compr� dos veces el mismo libro, y como pueden ser distintas ediciones, le basta con que el t�tulo del libro y el autor coincidan para considerar que es el mismo libro.

3. Quiere asignarle un g�nero literario a cada libro (Ficci�n, Divulgaci�n, Autoayuda, Infantil, etc).

4. Quiere recortar los t�tulos a un largo determinado (200 caracteres, por ejemplo). Pero este l�mite quiere conservarlo en una constante, que puede cambiar en pr�ximas ejecuciones del programa.

5. Quiere visualizar los libros en formato APA: "Becquer, G. A. (2018). Rimas"

6. Quiere contar cu�ntos libros tiene de cada g�nero.

Por supuesto, quiere **comprobar todos y cada uno de estos hecho con pruebas en JUnit**. �Yael est� feliz por poder practicar tantos conceptos con algo que despierta su pasi�n!

Como sabemos, va a utilizar cada uno de estos conceptos en su programa:
- final
- static
- package
- Annotations
- String
- toString
- clone
- equals
- hashCode
- Comparable
- Comparator
- enum
