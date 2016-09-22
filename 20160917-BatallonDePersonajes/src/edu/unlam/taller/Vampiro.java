package edu.unlam.taller;

public class Vampiro extends Personaje {
	
	int ataquesRecibidos;
	
	@Override
	protected void despuesDeAtacar() {
		salud++;
	}
	
	@Override
	protected int calcularPuntosDeAtaque() {
		return 10 + ataquesRecibidos;
	}

	@Override
	protected boolean puedeAtacar() {
		return energia >= calcularPuntosDeAtaque();
	}

	@Override
	public void serAtacado(int daño) {
		super.serAtacado(daño);
		this.ataquesRecibidos++;
	}
}
