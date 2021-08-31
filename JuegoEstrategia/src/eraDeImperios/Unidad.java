package eraDeImperios;

import static java.lang.Math.*;

public class Unidad {
	private Posicion posicion;
	private int salud = 100;

	// Constructor 2 parametros
	public Unidad(Posicion posicionInicial, int salud) {
		this.posicion = posicionInicial;
		this.setSalud(salud);
	}
	
	//Constructor 1 parametro
	public Unidad (Posicion posicionInicial) {
		this.posicion = posicionInicial;
	}
	
	//Constructor por defecto
	public Unidad () {
		this.posicion = new Posicion (0,0);
	}
	
	//Setter Salud
	private void setSalud(int salud) {
		this.salud= salud;
				
	}

	// Getter Salud
	public int getSalud() {
		return this.salud;
	}

	// Boolean para saber si puede atacar: debe ser un objeto diferente al que ataca
	// (de la misma clase), debe estar a menos de 2 metros y debe estar vivo (ambos)
	public boolean puedeAtacar(Unidad otraUnidad) {
		return this != otraUnidad && this.getdistanciaCon(otraUnidad) < 2 && this.estaVivo() && otraUnidad.estaVivo();
	}

	// ataca y quita 10 de vida
	public void atacar(Unidad otraUnidad) {
		if (this.puedeAtacar(otraUnidad)) {
			otraUnidad.salud -= 10;
		}
	}

	// Devuelve True si la vida del objeto esta por encima de 0
	public boolean estaVivo() {
		return this.salud > 0;
	}

	// Calcula distancia entre unidades
	public double getdistanciaCon(Unidad otraUnidad) {
		return sqrt(pow(otraUnidad.posicion.getCoordenadaX() - this.posicion.getCoordenadaX(), 2)
				+ pow(otraUnidad.posicion.getCoordenadaY() - this.posicion.getCoordenadaY(), 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unidad unidad1 = new Unidad(new Posicion(1, 1));
		Unidad unidad2 = new Unidad(new Posicion(2, 2));
		System.out.println(unidad1.getSalud());
		unidad2.atacar(unidad1);
		System.out.println(unidad1.salud);

	}
}
