package bibliotecaMusical;

import java.util.LinkedList;

import bibliotecaMusical.Cancion;

public class Musicoteca {
private LinkedList <Cancion> canciones;
	
	public Musicoteca() {
		this.canciones= new LinkedList<Cancion>();
	}
	public void agregarCancion(Cancion cancionnueva) {
		this.canciones.add(cancionnueva);
	}
	
	@Override
	public String toString() {
		return "Canciones:  "+ canciones;
	}

}
