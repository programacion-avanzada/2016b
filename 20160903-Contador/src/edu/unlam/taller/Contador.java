package edu.unlam.taller;

public class Contador {

	private int valor;
	
	void contar(){
		this.valor++;
		if (this.valor == 10000) {
			this.valor = 0;
		}
	}
	void reset(){
		this.valor = 0;
	}
	int mostrar(){
		return this.valor;
	}
	public void descontar() {
		this.valor--;
	}
	
}
