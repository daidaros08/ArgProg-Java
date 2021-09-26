package cuentasBancarias;

public class CuentaCorriente extends Cuenta {
	private double saldoDescubierto;
	
	public CuentaCorriente(double saldoExtra) {
		super();
		this.setSaldoDescubierto(saldoExtra);
	}
	public CuentaCorriente (double saldo, double saldoExtra) {
		super(saldo);
		this.setSaldoDescubierto(saldoExtra);
	}
	public void setSaldoDescubierto(double saldo) {
		this.saldoDescubierto=saldo;
	}
	@Override
	public void retirar(double retiro) {
		if (this.puedoRetirar(retiro) &&
				this.transaccionValida(retiro)) {
			this.setSaldo(this.getSaldo()-retiro);
		} else {
			System.out.println("No tiene fondos suficientes");
		}
	}
	@Override
	public boolean puedoRetirar(double retiro) {
		return this.getSaldo()+this.getSaldoDescubierto()>= retiro;
	}
	private double getSaldoDescubierto() {
		return this.saldoDescubierto;
	}
}
