package eraDeImperios;

public class Soldado extends UnidadAbstracta {
	private static final int DANIO = 20;
	private int danio;
	private int ataques;

	public Soldado(Posicion posicion, int salud) {
		super();
		this.danio = Soldado.DANIO;
		this.ataques = 0;
	}

	public Soldado(Posicion posicion) {
		super();
		this.danio = Soldado.DANIO;
		this.ataques = 0;
	}

	public Soldado() {
		super();
		this.danio = Soldado.DANIO;
		this.ataques = 0;
	}

	public int getAtaques() {
		return this.ataques;
	}

	public void setAtaques(int ataque) {
		this.ataques = ataque;
	}

	@Override
	public boolean puedeAtacar(UnidadAbstracta oponente) {
		return this != oponente && this.estaVivo() && oponente.estaVivo() && this.getdistanciaCon(oponente) < 1.5
				&& !this.cansado();

	}

	@Override
	public void atacar(UnidadAbstracta oponente) {
		if (this.puedeAtacar(oponente)) {
			oponente.recibirDanio(this);
			this.ataques += 1;
		} else if (!oponente.estaVivo()) {
			this.robarOro(oponente);
		} else if (this.cansado()) {
			this.reiniciar();
		}

	}

	@Override
	public int getDanio () {
		return this.danio;
	}

	@Override
	public void reiniciar() {
		this.setAtaques(0);

	}

	public boolean cansado() {
		return this.getAtaques() >= 7;
	}

}
