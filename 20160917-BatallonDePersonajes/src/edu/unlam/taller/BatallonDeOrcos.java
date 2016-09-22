package edu.unlam.taller;

public class BatallonDeOrcos extends Batallon {

	private int ultimoIndice = -1;
	
	@Override
	public void atacar(Batallon otro) {
		Atacable victima = otro.obtenerProximaVictima();
		for (Personaje atacante : batallon) {
			atacante.atacar(victima);
		}
	}

	public boolean agregar(Orco personaje) {
		return batallon.add(personaje);
	}
	
	@Override
	public Atacable obtenerProximaVictima() {
		depurarBatallon();
		if(batallon.isEmpty()) {
			throw new RuntimeException("El batallón está vacío");
		}
		this.ultimoIndice  = (this.ultimoIndice + 1) % this.batallon.size();
		return batallon.get(this.ultimoIndice);
	}
}
