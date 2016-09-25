package edu.unlam.taller.items;

import edu.unlam.taller.Personaje;
import edu.unlam.taller.PersonajeEquipado;

public class ConEscudoSvalinn extends PersonajeEquipado {

	public ConEscudoSvalinn(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return super.obtenerPuntosDeDefensa() + 10;
	}
}
