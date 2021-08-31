package CirculoIntersec;

public class Punto {
	// atributos del Punto: un eje x y un eje y
	private int ejeX;
	private int ejeY;

	// constructor de objeto
	public Punto(int X, int Y) {
		this.ejeX = X;
		this.ejeY = Y;
	}

	// getter para coordenadas
	public String getCoordenadas() {
		return "las coordenadas son: " + this.ejeX + ", " + this.ejeY;
	}

	// getter para eje Y
	public int getEjeY() {
		return this.ejeY;
	}

	// getter para eje X
	public int getEjeX() {
		return this.ejeX;
	}

	// setter para eje Y
	public void setEjeY(int eje) {
		this.ejeY = eje;
	}

	// setter para eje X
	public void setEjeX(int eje) {
		this.ejeX = eje;
	}

	// saber si el punto esta sobre eje Y
	public boolean estaSobreEjeY() {
		return this.ejeY == 0;
	}

	// saber si el punto está sobre el eje X
	public boolean estaSobreEjeX() {
		return this.ejeX == 0;
	}

	// saber si el punto es el origen de las coordenadas
	public boolean esElOrigen() {
		return this.ejeX == 0 && this.ejeY == 0;
	}

	/*
	 * A partir de aca van un conjunto de funciones que permiten calcular la
	 * distancia entre dos puntos. Las funciones estan segmentadas en funciones mas
	 * pequeñas Todas las funciones toman como parámetro dos objetos. Punto1 y
	 * punto2 (siendo punto 1 el objeto que ejecuta la funcion
	 */

	// Funcion que permite, dado dos puntos, calcular la base (Pitagoras tu me
	// escuchas?)

	public double base(Punto otroPunto) {
		double base = 0.0;
		if (this.getEjeX() > otroPunto.getEjeX()) {
			base = this.getEjeX() - otroPunto.getEjeX();
		} else if (this.getEjeX() < otroPunto.getEjeX()) {
			base = otroPunto.getEjeX() - this.getEjeX();
		}
		return base;
	}

	// funcion que permite, dado dos puntos, calcular la altura

	public double altura(Punto otroPunto) {
		double altura = 0.0;
		if (this.getEjeY() > otroPunto.getEjeY()) {
			altura = this.getEjeY() - otroPunto.getEjeY();
		} else if (this.getEjeY() < otroPunto.getEjeY()) {
			altura = otroPunto.getEjeY() - this.getEjeY();
		}
		return altura;
	}

	// funcion para saber la distancia entre los centros de dos circulos... aka
	// hipotenusa

	public double hipotenusa(Punto otroPunto) {
		double hipotenusa = Math.sqrt((Math.pow(this.base(otroPunto), 2)) + (Math.pow(this.altura(otroPunto), 2)));
		return hipotenusa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto Punto1 = new Punto(3, 1);
		Punto Punto2 = new Punto(1, 3);
		System.out.println("la base es: " + Punto1.base(Punto2));
		System.out.println("la hipotenusa es: " + Punto1.hipotenusa(Punto2));
		System.out.println(Punto1.getCoordenadas());
	}
}
