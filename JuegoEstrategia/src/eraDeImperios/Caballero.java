package eraDeImperios;

public class Caballero extends UnidadAbstracta {
	private static final int DANIO = 30;
	private static final int ATAQUES = 0;
	private int danio;
	private int ataques;
	
	public Caballero (Posicion posicionInicial, int salud) {
		super ();
		this.danio =Caballero.DANIO;
		this.setAtaques (Caballero.ATAQUES);
	}
	
	public Caballero (Posicion posicionIncial) {
		super ();
		this.danio =Caballero.DANIO;
		this.setAtaques (Caballero.ATAQUES);
	}
	
	public Caballero () {
		super ();
		this.danio =Caballero.DANIO;
		this.setAtaques (Caballero.ATAQUES);
	}



	@Override
	public boolean puedeAtacar(UnidadAbstracta oponente) {
		return this != oponente && this.estaVivo() && oponente.estaVivo() && this.getdistanciaCon(oponente) >= 1
				&& this.getdistanciaCon(oponente) <= 5 && !this.asustado();
	}

	private boolean asustado() {
		return ataques >= 3;
	}

	@Override
	public void atacar(UnidadAbstracta oponente) {
		if (this.puedeAtacar(oponente)) {
			oponente.recibirDanio(this);
			this.ataques +=1;
		}
		else if (!oponente.estaVivo()) {
			this.robarOro(oponente);
		} else if (this.asustado()) {
			this.reiniciar();
		}

	}

	@Override
	public int getDanio() {
		return this.danio;
	}
	private void setAtaques(int ataques2) {
		this.ataques = ataques2;
		
	}

	@Override
	public void reiniciar() {
		this.setPosicion (this.getPosicionX()-1, this.getPosicionY()+1);

	}

}
