package vehiculo;

public class Motocicleta extends Vehiculo {

	private Persona acompaniante;
	

	public Motocicleta(Persona chofer) {
		super(chofer);
	}

	public Motocicleta(Persona chofer, Persona Acompaniante) {
		super(chofer);
		this.agregarAcompaniante(acompaniante);
	}

	public Persona getAcompaniante() {
		return this.acompaniante;
	}

	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}
	
	

	public void agregarAcompaniante(Persona acompaniante) {
		this.setAcompaniante(acompaniante);

	}

	@Override
	public void cambiarChofer(Persona chofer) {
		if (this.getAcompaniante() == null) {
			this.setChofer(chofer);
		}
		else {
			throw new Error("No se puede cambiar de chofer, hay un acompañiante");
		}

	}
	public static void main(String[] args) {
		Motocicleta moto1 = new Motocicleta (new Persona ("Jorge"));
		System.out.println(moto1.getChofer());
		moto1.cambiarChofer(new Persona ("hola"));
		System.out.println(moto1.getAcompaniante());
		moto1.agregarAcompaniante(new Persona ("Carlos"));
		System.out.println(moto1.getAcompaniante().getNombre());
		System.out.println(moto1.getChofer());
		moto1.cambiarChofer(new Persona ("maria"));
	}
}
