package edu.unlam.taller;

public class Humano extends Personaje {
	
	@Override
	protected int calcularPuntosDeAtaque() {
		return 10;
	}

	@Override
	protected boolean puedeAtacar() {
		return energia >= 10;
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return 0;
	}
}
