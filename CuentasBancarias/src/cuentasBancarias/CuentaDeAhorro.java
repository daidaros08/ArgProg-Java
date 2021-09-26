package cuentasBancarias;

public class CuentaDeAhorro extends Cuenta {
	private double saldoReservado;

	public CuentaDeAhorro() {
		super();
	}

	public CuentaDeAhorro(double saldo, double ahorro) {
		super(saldo);
		this.ahorrar(ahorro);
	}

	public void ahorrar(double ahorro) {
		if (this.transaccionValida(ahorro) &&
				this.getSaldo()>=ahorro) {
			this.saldoReservado = ahorro;
			this.setSaldo(this.getSaldo()-this.getAhorro());
		} else {
			System.out.println("Ingreso inválido");
		}

	}

	public void modificarAhorro(double dinero) {
		if (this.transaccionValida(dinero)&&
				this.hayAhorro()&&
				this.getAhorro()>=dinero) {
			this.setSaldo(dinero);
			this.ahorrar(this.getAhorro() - dinero);
		} else {
			System.out.println("Ingreso inválido");
		}
	}

	public double getAhorro() {
		return this.saldoReservado;
	}
	
	public boolean hayAhorro() {
		return this.getAhorro()>0;
	}
}
