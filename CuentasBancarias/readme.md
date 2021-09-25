# Cuentas Bancarias

La siguiente pr�ctica tiene como objetivo visitar y profundizar en los conceptos de **Programaci�n Orientada a Objetos**. Se anima a los estudiantes a explorar el ejemplo, agregando conceptos propios as� como tambi�n sugiriendo mejoras o alternativas. Mediante la exploraci�n es que se lograr�n los aprendizajes m�s profundos, se debe tomar esta gu�a como un mapa: marca el camino, pero si nos desviamos para descubrir nuevas �reas, siempre podemos retomar sendero gracias a �l.
 
## Parte 1

### Cap�tulo I: Estructuras de Datos

Una Cuenta posee un saldo. Se puede agregar dinero a la Cuenta, incrementando el saldo. Tambi�n se puede retirar dinero de la Cuenta, decrementando dicho saldo.
Debe poderse resolver la siguiente secuencia de acciones:

Creaci�n de una Cuenta nueva, saldo == 0.
Acreditaci�n de $ 1000, saldo == 1000.
Retiro de $ 550, saldo == 450.

    // main
    Cuenta miCuenta = new Cuenta();
    System.out.println(miCuenta.saldo); // 0

    miCuenta.saldo += 1000;
    System.out.println(miCuenta.saldo); // 1000

    miCuenta.saldo -= 550;
    System.out.println(miCuenta.saldo); // 450

**Preguntas para profundizar**
- �Qu� tipo de dato se utiliz� para el saldo? �Es el m�s apropiado?
- �Qu� visibilidad tiene el atributo saldo de la Cuenta? �Es correcto?
- Si extraigo m�s dinero del disponible en saldo, seguramente pueda hacerlo. �Est� bien que as� sea?





## Parte 2


La siguiente pr�ctica tiene como objetivo visitar y profundizar en los conceptos de Programaci�n Orientada a Objetos. Se anima a los estudiantes a explorar el ejemplo, agregando conceptos propios as� como tambi�n sugiriendo mejoras o alternativas. Mediante la exploraci�n es que se lograr�n los aprendizajes m�s profundos, se debe tomar esta gu�a como un mapa: marca el camino, pero si nos desviamos para descubrir nuevas �reas, siempre podemos retomar sendero gracias a �l.

### Cap�tulo II: Encapsulamiento

Hemos visto las falencias del dise�o anterior, y luego de investigar un poco nos encontramos con el concepto de Encapsulamiento. �Es una buena ocasi�n para incorporarlo!
Se pide que utilicemos este concepto para asegurarnos de las siguientes restricciones del dominio del problema:

- No puedo extraer dinero que no poseo
- No puedo extraer ni depositar dinero negativo
- El saldo no puede afectarse m�s all� que por dep�sitos o extracciones

**Preguntas para profundizar**

- �Qu� ventaja represent� la incorporaci�n del Encapsulamiento en el problema?
- �Qu� desventaja podr�amos encontrar?
- �Es realmente Programaci�n Orientada a Objetos? �C�mo puedo saberlo?
- �Qu� acciones se utilizaron para prevenir la realizaci�n de operaciones no v�lidas?





## Parte 3

### Cap�tulo III: Abriendo el juego
Es com�n transferir dinero entre cuentas bancarias. Para ello, debemos dotar a nuestro modelo con dicha funcionalidad. Cuando querramos transferir un monto, deber� verificarse que la operaci�n puede realizarse, y deber� acreditarse directamente en la cuenta destino. El c�digo para dicha operaci�n se ver� similar a este:

    // main
    Cuenta cuentaOrigen = new Cuenta();
    cuentaOrigen.depositar(10000);
    System.out.println(cuentaOrigen.consultarSaldo()); // 10000

    Cuenta cuentaDestino = new Cuenta();
    System.out.println(cuentaDestino.consultarSaldo()); // 0

    cuentaOrigen.transferir(550, cuentaDestino);
    System.out.println(cuentaOrigen.consultarSaldo()); // 9450
    System.out.println(cuentaDestino.consultarSaldo()); // 550

**Preguntas para profundizar**

- Al interactuar con objetos del mismo tipo, es importante distinguir entre par�metros y atributos. �C�mo puede hacerse para evitar confusiones?
- �Es correcto el orden de los par�metros para el m�todo transferir? �Qu� cambiar�as?
- Dentro del c�digo de transferir, �utilizaste los m�todos preexistentes o repetiste l�gica que ya exist�a? �Cu�l es la ventaja de cada una de las aproximaciones?
- �Qu� pasar�a si la operaci�n de transferir se ve interrumpida a la mitad de su ejecuci�n? �C�mo se podr�a prevenir esto?






## Parte 4
### Cap�tulo IV: Se agranda la familia

Esta vez necesitamos modelar dos nuevos tipos de cuenta:

- **CuentaDeAhorros**, que permite reservar parte del saldo para que no est� disponible, en una especie de saldo secundario. Se puede disponer de ese saldo normalmente una vez que se reintegre (a pedido del cliente) al saldo total de la cuenta.
- **CuentaCorriente**, que permite retirar todo lo disponible, y un descubierto de hasta cierta cantidad de dinero extra. El monto �en descubierto� se establece al momento de la apertura de la cuenta.

**Preguntas para profundizar**
- �Hubo alguna funcionalidad que pudiera reutilizarse?
- �Qu� m�todo tuvo que rehacerse?
- �C�mo se manejan transferencias entre tipos de cuenta diferentes?
