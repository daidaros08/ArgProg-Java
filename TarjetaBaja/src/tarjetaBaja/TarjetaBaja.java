package tarjetaBaja;

public class TarjetaBaja {
	private double saldo;
	private int viajes;
	private int viajesColectivo;
	private int viajesSubte;
	private final double PASAJE_COLECTIVO = 21.50;
	private final double PASAJE_SUBTE = 19.50;

	public TarjetaBaja(double saldoInicial) {
		this.setSaldo(saldoInicial);
		this.viajes = 0;
		this.viajesColectivo = 0;
		this.viajesSubte = 0;
	}

	public double obtenerSaldo() {
		return this.saldo;
	}

	public void cargarSaldo(double monto) {
		this.saldo += monto;
	}

	public void pagarViajeEnColectivo() {
		if (this.obtenerSaldo() >= this.PASAJE_COLECTIVO) {
			this.saldo -= this.PASAJE_COLECTIVO;
			this.viajes++;
			this.viajesColectivo++;
		} else {
			System.out.println("Saldo Insuficiente");
		}

	}

	public void pagarViajeEnSubte() {
		if (this.saldo >= this.PASAJE_SUBTE) {
			this.saldo -= this.PASAJE_SUBTE;
			this.viajes++;
			this.viajesSubte++;
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

	public int contarViajes() {
		return this.viajes;
	}

	public int contarViajesEnColectivos() {
		return this.viajesColectivo;
	}

	public int contarViajesEnSubte() {
		return this.viajesSubte;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
