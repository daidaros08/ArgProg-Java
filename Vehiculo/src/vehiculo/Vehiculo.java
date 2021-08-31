package vehiculo;

public abstract class Vehiculo {
	private Persona chofer;
	private double kmRecorrido;

	public Vehiculo (Persona chofer) {
		this.setChofer(chofer);
		this.kmRecorrido = 0;
	}
	
	
	public abstract void cambiarChofer(Persona chofer);

	protected void setChofer(Persona chofer) {
		this.chofer = chofer;
	}
	public String getChofer() {
		return this.chofer.getNombre();
	}

	public double getKmRecorrido() {
		return this.kmRecorrido;
	}

}
