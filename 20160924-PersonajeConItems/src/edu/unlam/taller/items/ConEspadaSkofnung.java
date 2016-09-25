package edu.unlam.taller.items;

import edu.unlam.taller.Personaje;
import edu.unlam.taller.PersonajeEquipado;

public class ConEspadaSkofnung extends PersonajeEquipado {

	public ConEspadaSkofnung(Personaje personajeDecorado) {
		super(personajeDecorado);
	}
	
	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() + 5;
	}

}
