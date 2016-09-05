package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTests {

	@Test
	public void queNoIntersectan() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(10, 10), 1);
		
		Assert.assertFalse(c1.intersectaCon(c2));
	}
	
	@Test
	public void queIntersectan() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(0, 0.5), 1);
		
		Assert.assertTrue(c1.intersectaCon(c2));
	}
	
	@Test
	public void queIntersectanEnElLimite() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(0, 2), 1);
		
		Assert.assertTrue(c1.intersectaCon(c2));
	}
	
	

}
