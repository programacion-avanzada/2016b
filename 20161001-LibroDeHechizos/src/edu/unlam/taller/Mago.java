package edu.unlam.taller;

import java.util.HashMap;
import java.util.Map;

public class Mago extends Personaje {

	private Map<String, Hechizo> hechizos = new HashMap<String, Hechizo>();
	
	public void agregarHechizo(String conjuro, Hechizo hechizo) {
		this.hechizos.put(conjuro, hechizo);
	}
	
	public int getCantidadDeHechizos() {
		return this.hechizos.size();
	}

	public void hechizar(String conjuro, Personaje personaje) {
		this.hechizos.get(conjuro).afectar(personaje);
		
	}
}
