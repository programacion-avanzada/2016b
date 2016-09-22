package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

public class BatallonTests {

	@Test
	public void queOrcosSeTurnanParaRecibirPaliza() {
		
		BatallonDeHumanos humanos = new BatallonDeHumanos();
		Humano primerHumano = new Humano();
		humanos.agregar(primerHumano);
		
		BatallonDeOrcos orcos = new BatallonDeOrcos();
		Orco primerOrco = new Orco();
		orcos.agregar(primerOrco);
		Orco segundoOrco = new Orco();
		orcos.agregar(segundoOrco);
		
		Assert.assertEquals(100, primerOrco.getSalud());
		Assert.assertEquals(100, segundoOrco.getSalud());
		
		humanos.atacar(orcos);
		
		Assert.assertEquals(90, primerOrco.getSalud());
		Assert.assertEquals(100, segundoOrco.getSalud());
		
		humanos.atacar(orcos);
		
		Assert.assertEquals(90, primerOrco.getSalud());
		Assert.assertEquals(90, segundoOrco.getSalud());
	}
	
	@Test
	public void queHumanosSeRecibirPalizaDeAUno() {
		
		BatallonDeOrcos orcos = new BatallonDeOrcos();
		Orco primerOrco = new Orco();
		orcos.agregar(primerOrco);
		
		BatallonDeHumanos humanos = new BatallonDeHumanos();
		Humano primerHumano = new Humano();
		humanos.agregar(primerHumano);
		Humano segundoHumano = new Humano();
		humanos.agregar(segundoHumano);
		
		Assert.assertEquals(100, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		orcos.atacar(humanos);
		
		Assert.assertEquals(90, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		orcos.atacar(humanos);
		
		Assert.assertEquals(79, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
	}
}
