package edu.unlam.taller;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class Batallon {

	protected List<Personaje> batallon = new LinkedList<Personaje>();
	
	public abstract void atacar(Batallon otro);
	public abstract Atacable obtenerProximaVictima();
	
	public final void depurarBatallon() {
		Iterator<Personaje> iter = batallon.iterator();
		while(iter.hasNext()){
		    if(!iter.next().estaVivo()) iter.remove();
		}
	}
}
