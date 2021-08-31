package eraDeImperios;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class UnidadAbstracta {
	private static final int ORO_INICIAL = 100;
	private Posicion posicion;
	private int salud;
	private int danio = 0;
	protected int oro;

	// Constructor 2 parametros
	public UnidadAbstracta(Posicion posicionInicial, int salud) {
		this.posicion = posicionInicial;
		this.setSalud(salud);
		this.oro = UnidadAbstracta.ORO_INICIAL;
	}

	// Constructor 1 parametro
	public UnidadAbstracta(Posicion posicionInicial) {
		this.posicion = posicionInicial;
		this.oro = UnidadAbstracta.ORO_INICIAL;
	}

	// Constructor por defecto
	public UnidadAbstracta() {
		this.posicion = new Posicion(0, 0);
		this.oro = UnidadAbstracta.ORO_INICIAL;
	}

	// Setter Salud
	private void setSalud(int salud) {
		this.salud = salud;
	}
	
	public void setOro (int Oro) {
		this.oro= Oro;
		}

	// Getter Salud
	public int getSalud() {
		return this.salud;
	}

	// Calcula distancia entre unidades
	public double getdistanciaCon(UnidadAbstracta otraUnidad) {
		return sqrt(pow(otraUnidad.posicion.getCoordenadaX() - this.posicion.getCoordenadaX(), 2)
				+ pow(otraUnidad.posicion.getCoordenadaY() - this.posicion.getCoordenadaY(), 2));
	}

	public int getOro() {
		return this.oro;
	}

	// Boolean para saber si puede atacar: debe ser un objeto diferente al que ataca
	// (de la misma clase) y debe estar vivo (ambos)
	public abstract boolean puedeAtacar(UnidadAbstracta oponente);

	// ataca, la definen las subclases
	public abstract void atacar(UnidadAbstracta oponente);
	
	public void robarOro (UnidadAbstracta oponente) {
		this.oro += oponente.getOro();
		oponente.setOro(0);
	}

	public void recibirDanio(UnidadAbstracta oponente) {
		this.salud -= oponente.getDanio();
	}

	public abstract int getDanio();
	
	public void setPosicion(int x, int y) {
		this.posicion.setCoordenadaX(x);
		this.posicion.setCoordenadaY(y);
	}
	
	public int getPosicionY () {
		return this.posicion.getCoordenadaY();
	}
	
	public int getPosicionX () {
		return this.posicion.getCoordenadaX();
	}

	public abstract void reiniciar();

	// Devuelve True si la vida del objeto esta por encima de 0
	public boolean estaVivo() {
		return this.salud > 0;
	}

}
