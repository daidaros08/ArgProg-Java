# Cuentas Bancarias

La siguiente práctica tiene como objetivo visitar y profundizar en los conceptos de **Programación Orientada a Objetos**. Se anima a los estudiantes a explorar el ejemplo, agregando conceptos propios así como también sugiriendo mejoras o alternativas. Mediante la exploración es que se lograrán los aprendizajes más profundos, se debe tomar esta guía como un mapa: marca el camino, pero si nos desviamos para descubrir nuevas áreas, siempre podemos retomar sendero gracias a él.
 
## Parte 1

### Capítulo I: Estructuras de Datos

Una Cuenta posee un saldo. Se puede agregar dinero a la Cuenta, incrementando el saldo. También se puede retirar dinero de la Cuenta, decrementando dicho saldo.
Debe poderse resolver la siguiente secuencia de acciones:

Creación de una Cuenta nueva, saldo == 0.
Acreditación de $ 1000, saldo == 1000.
Retiro de $ 550, saldo == 450.

    // main
    Cuenta miCuenta = new Cuenta();
    System.out.println(miCuenta.saldo); // 0

    miCuenta.saldo += 1000;
    System.out.println(miCuenta.saldo); // 1000

    miCuenta.saldo -= 550;
    System.out.println(miCuenta.saldo); // 450

**Preguntas para profundizar**
- ¿Qué tipo de dato se utilizó para el saldo? ¿Es el más apropiado?
- ¿Qué visibilidad tiene el atributo saldo de la Cuenta? ¿Es correcto?
- Si extraigo más dinero del disponible en saldo, seguramente pueda hacerlo. ¿Está bien que así sea?





## Parte 2


La siguiente práctica tiene como objetivo visitar y profundizar en los conceptos de Programación Orientada a Objetos. Se anima a los estudiantes a explorar el ejemplo, agregando conceptos propios así como también sugiriendo mejoras o alternativas. Mediante la exploración es que se lograrán los aprendizajes más profundos, se debe tomar esta guía como un mapa: marca el camino, pero si nos desviamos para descubrir nuevas áreas, siempre podemos retomar sendero gracias a él.

### Capítulo II: Encapsulamiento

Hemos visto las falencias del diseño anterior, y luego de investigar un poco nos encontramos con el concepto de Encapsulamiento. ¡Es una buena ocasión para incorporarlo!
Se pide que utilicemos este concepto para asegurarnos de las siguientes restricciones del dominio del problema:

- No puedo extraer dinero que no poseo
- No puedo extraer ni depositar dinero negativo
- El saldo no puede afectarse más allá que por depósitos o extracciones

**Preguntas para profundizar**

- ¿Qué ventaja representó la incorporación del Encapsulamiento en el problema?
- ¿Qué desventaja podríamos encontrar?
- ¿Es realmente Programación Orientada a Objetos? ¿Cómo puedo saberlo?
- ¿Qué acciones se utilizaron para prevenir la realización de operaciones no válidas?





## Parte 3

### Capítulo III: Abriendo el juego
Es común transferir dinero entre cuentas bancarias. Para ello, debemos dotar a nuestro modelo con dicha funcionalidad. Cuando querramos transferir un monto, deberá verificarse que la operación puede realizarse, y deberá acreditarse directamente en la cuenta destino. El código para dicha operación se verá similar a este:

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

- Al interactuar con objetos del mismo tipo, es importante distinguir entre parámetros y atributos. ¿Cómo puede hacerse para evitar confusiones?
- ¿Es correcto el orden de los parámetros para el método transferir? ¿Qué cambiarías?
- Dentro del código de transferir, ¿utilizaste los métodos preexistentes o repetiste lógica que ya existía? ¿Cuál es la ventaja de cada una de las aproximaciones?
- ¿Qué pasaría si la operación de transferir se ve interrumpida a la mitad de su ejecución? ¿Cómo se podría prevenir esto?






## Parte 4
### Capítulo IV: Se agranda la familia

Esta vez necesitamos modelar dos nuevos tipos de cuenta:

- **CuentaDeAhorros**, que permite reservar parte del saldo para que no esté disponible, en una especie de saldo secundario. Se puede disponer de ese saldo normalmente una vez que se reintegre (a pedido del cliente) al saldo total de la cuenta.
- **CuentaCorriente**, que permite retirar todo lo disponible, y un descubierto de hasta cierta cantidad de dinero extra. El monto “en descubierto” se establece al momento de la apertura de la cuenta.

**Preguntas para profundizar**
- ¿Hubo alguna funcionalidad que pudiera reutilizarse?
- ¿Qué método tuvo que rehacerse?
- ¿Cómo se manejan transferencias entre tipos de cuenta diferentes?
