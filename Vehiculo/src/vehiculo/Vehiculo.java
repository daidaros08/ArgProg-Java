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
		try {
			this.chofer = chofer;
		}catch (Exception e) {
			System.out.println("Ya existe un chofer");
			
		}
	}
	public String getChofer() {
		return this.chofer.getNombre();
	}

	public double getKmRecorrido() {
		return this.kmRecorrido;
	}

}
