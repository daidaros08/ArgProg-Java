package eraDeImperios;

public class Arquero extends UnidadAbstracta {
	private static final int DANIO = 7;
	private static final int CANTIDAD_FLECHAS = 30;
	private int flechas;
	private int danio;
	

	public Arquero(Posicion posicion, int salud) {
		super();
		this.flechas = Arquero.CANTIDAD_FLECHAS;
		this.danio = Arquero.DANIO;
	}

	public Arquero(Posicion posicion) {
		super();
		this.flechas = Arquero.CANTIDAD_FLECHAS;
		this.danio = Arquero.DANIO;
	}

	public Arquero() {
		super();
		this.flechas = Arquero.CANTIDAD_FLECHAS;
		this.danio = Arquero.DANIO;
	}

	@Override
	public void atacar(UnidadAbstracta oponente) {
		if (this.puedeAtacar(oponente)) {
			oponente.recibirDanio(this);
			this.flechas -= 1;
		}
		else if (!oponente.estaVivo()) {
			this.robarOro(oponente);
			
		}
		else if (this.getFlechas()<1){
			this.reiniciar ();
		}
		
	}



	@Override
	public boolean puedeAtacar(UnidadAbstracta oponente) {
		return this != oponente && this.estaVivo() && oponente.estaVivo() && this.getdistanciaCon(oponente) >= 5
				&& this.getdistanciaCon(oponente) <= 25 && this.getFlechas()>=1;

	}

	@Override
	public int getDanio() {
		return this.danio;
	}
	
	public int getFlechas () {
		return this.flechas;
	}
	
	public void reiniciar() {
		this.flechas = Arquero.CANTIDAD_FLECHAS;	
	}
}
