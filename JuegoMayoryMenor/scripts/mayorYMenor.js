let mazoDeCartas;
let cartaActual;
let cantidadDeIntentos;
const contenedorDeMensajes = document.querySelector("#mensajes");
const entradaDeUsuario = document.querySelector("#entradaUsuario");

function comenzarJuego(){
    mazoDeCartas = [1,2,3,4,5,6,7,8,9,10];
    cartaActual=sacarCarta();
    cantidadDeIntentos=0;
    contenedorDeMensajes.textContent="";
    document.querySelector("#intentosIncorrectos").textContent="0";
    entradaDeUsuario.value="";
}

function sacarCarta(){
    let posicion = Math.floor(Math.random()*mazoDeCartas.length);
    return mazoDeCartas.splice(posicion,1)[0];
}

function aumentarIntentosIncorrectos(){
    cantidadDeIntentos++;
    document.querySelector("#intentosIncorrectos").textContent=cantidadDeIntentos;
}

function adivina (numero){
    if(numero==cartaActual){
        contenedorDeMensajes.textContent="Adivinaste!!!. "+"Cartas restantes= "+ mazoDeCartas.length;
        if(mazoDeCartas.length==0){
            finDeJuego();
        }
        else{
            cartaActual=sacarCarta();
        }
    }
    else{
        aumentarIntentosIncorrectos();
        if(numero<cartaActual){
            contenedorDeMensajes.textContent="El numero que buscas es mayor";
        }
        else{
            contenedorDeMensajes.textContent="El numero que buscas es menor";   
        }
    }
}

function finDeJuego(){
    alert(`Fin del juego, tu puntaje total es de: ${cantidadDeIntentos}`);
    let response=confirm("¿Deseas iniciar un juego nuevo?");
    if (response){
        comenzarJuego();
    }
}
const botonAdivinar=document.querySelector("#botonAdivinar");

botonAdivinar.addEventListener("click", function() {
	
	if (entradaDeUsuario.value % 1 == 0 && entradaDeUsuario.value >= 1 && entradaDeUsuario.value <= 10) {
		adivina(entradaDeUsuario.value);
	} else {
		contenedorMensajes.textContent = "El número es incorrecto";
	}
}); 
comenzarJuego();