package edu.unlam.taller;

public class PersonajeEquipado extends Personaje {

	Personaje personajeDecorado;

	public PersonajeEquipado(Personaje personajeDecorado) {
		this.personajeDecorado = personajeDecorado;
	}

	@Override
	protected boolean puedeAtacar() {
		return this.personajeDecorado.puedeAtacar();
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return this.personajeDecorado.obtenerPuntosDeAtaque();
	}

	@Override
	protected int calcularPuntosDeAtaque() {
		return this.personajeDecorado.calcularPuntosDeAtaque();
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return this.personajeDecorado.obtenerPuntosDeDefensa();
	}

	@Override
	public boolean tiene(Class decorado) {
		return this.getClass() == decorado || this.personajeDecorado.tiene(decorado);
	}

	@Override
	public Personaje desequipar(Class decorado) {
		return this.desequiparEste(decorado);
	}

	private Personaje desequiparEste(Class decorado) {
		if (this.getClass() == decorado)
			return this.personajeDecorado;
		return this.personajeDecorado.desequipar(decorado);
	}

}
