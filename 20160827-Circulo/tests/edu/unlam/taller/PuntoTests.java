package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

public class PuntoTests {

	@Test
	public void queCalculaCorrectamenteLaDistanciaVertical() {
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(1,4);
		
		Assert.assertEquals(3, p1.distanciaCon(p2), 0.0);
	}
	
	@Test
	public void queCalculaDistanciaDiagonal() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(1,1);
		
		Assert.assertEquals(Math.sqrt(2), p1.distanciaCon(p2), 0.0);
	}
}
