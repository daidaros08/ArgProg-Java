package cuentasBancarias;

public class Cuenta {
	private double saldo;

	public Cuenta() {
		this.setSaldo(0);
	}
	
	public Cuenta(double saldo) {
		this.setSaldo(saldo);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void retirar(double retiro) {
		if (this.puedoRetirar(retiro) && this.transaccionValida(retiro)) {
			this.setSaldo(this.getSaldo()-retiro);
		} else {
			System.out.println("No tiene fondos suficientes");
		}
	}

	public boolean puedoRetirar(double retiro) {
		return this.getSaldo() >= retiro;
	}

	public boolean transaccionValida(double dineroTransaccionado) {
		return dineroTransaccionado > 0;
	}

	public void depositar(double deposito) {
		if (this.transaccionValida(deposito)) {
			this.saldo += deposito;
		} else {
			System.out.println("Dinero ingresado no válido");
		}
	}

	public void transferir(double dineroATransferir, Cuenta cuentaDestino) {
		if (this.getSaldo() >= dineroATransferir && this.transaccionValida(dineroATransferir)) {
			this.setSaldo(this.getSaldo()-dineroATransferir);
			cuentaDestino.setSaldo(cuentaDestino.getSaldo()+dineroATransferir);
		} else {
			System.out.println("No se pudo realizar la tranferencia");
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
