package edu.unlam.taller.items;

import edu.unlam.taller.Personaje;
import edu.unlam.taller.PersonajeEquipado;

public class ConAnilloDraupnir extends PersonajeEquipado {

	public ConAnilloDraupnir(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() * 2;
	}
	
}
