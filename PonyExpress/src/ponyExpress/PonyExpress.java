package ponyExpress;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PonyExpress {
	private Caballo caballo;
	
	public PonyExpress (Caballo caballo) {
		this.caballo = caballo;
	}
	public int caballos (int[] distancias) {
		int numCaballos = 0;
		for (int distancia:distancias) {
			if (this.getCaballo().getMillasRecorridas()+distancia < 100) {
				this.getCaballo().agregarMillas(distancia);
				
			}
			else {
				numCaballos++;
				this.setCaballo (new Caballo (distancia));
				
			}
		}
		
		return numCaballos;
	}
	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
	public Caballo getCaballo () {
		return this.caballo;
	}
	public static void main(String[] args) {
		PonyExpress pony1 = new PonyExpress (new Caballo (0));
		/*System.out.println(pony1.getCaballo().getMillasRecorridas());
		//pony1.getCaballo().agregarMillas(50);
		System.out.println(pony1.getCaballo().getMillasRecorridas());
		int[] distancias = new int[]{ 18, 15 };
		for (int distancia:distancias) {
			pony1.getCaballo().agregarMillas(distancia);
		}
		
		System.out.println(pony1.getCaballo().getMillasRecorridas());*/
		System.out.println(pony1.caballos(new int[] { 18, 15 }));
		System.out.println(pony1.caballos(new int[] { 43, 23, 40, 13 }));
		System.out.println(pony1.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		System.out.println(pony1.caballos(new int[] { 51, 51, 51 }));
		System.out.println(pony1.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}
}
