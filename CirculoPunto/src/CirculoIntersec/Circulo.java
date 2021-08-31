package CirculoIntersec;

public class Circulo {

	// atributos: centro y radio
	private double radio;
	private Punto centro;

	// constructor
	public Circulo(Punto punto, double radio) {
		this.radio = radio;
		this.centro = punto;
	}

	// getter para el radio
	public double getRadio() {
		return this.radio;
	}

	// getter para el centro
	public Punto getCentro() {
		return this.centro;
	}

	// setter para el radio
	public void setRadio(double nuevoRadio) {
		this.radio = nuevoRadio;
	}

	// setter para el centro
	public void setCentro(Punto nuevoPunto) {
		this.centro = nuevoPunto;
	}

	// funcion para ver si el objeto intersecta con otro circulo
	public boolean intersectaCon(Circulo nuevoCirculo) {

		return this.centro.hipotenusa(nuevoCirculo.centro) < this.getRadio() + nuevoCirculo.getRadio();

		// Esto es un primer intento de codigo, lo dejo como recordatorio de como no
		// hacerlo
		/*
		 * return ((this.centro.distanciaEntreCentros(nuevoCirculo.centro) == 0 &&
		 * this.getRadio() == nuevoCirculo.getRadio())
		 *
		 * || (this.centro.distanciaEntreCentros(nuevoCirculo.centro) < (this.getRadio()
		 * + nuevoCirculo.getRadio()) &&
		 * this.centro.distanciaEntreCentros(nuevoCirculo.centro) < this.getRadio() -
		 * nuevoCirculo.getRadio()) ||
		 * (this.centro.distanciaEntreCentros(nuevoCirculo.centro) == (this.getRadio() -
		 * nuevoCirculo.getRadio())) ||
		 * this.centro.distanciaEntreCentros(nuevoCirculo.centro) == this.getRadio() +
		 * nuevoCirculo.getRadio());
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circuloUno = new Circulo(new Punto(5, 0), 1);
		Circulo circuloDos = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(circuloUno.intersectaCon(circuloDos));

		// esto era probando, no le des importancia
		// System.out.println(circuloUno.centro.hipotenusa(circuloDos.centro));
		// System.out.println(circuloUno.centro.esElOrigen());
		// System.out.println(circuloDos.centro.esElOrigen());

	}
}