package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

public class ContadorTests {

	@Test
	public void testBasicoDelUsoDelContador() {
		Contador c = new Contador();
		Assert.assertEquals(0, c.mostrar());
		c.contar();
		Assert.assertEquals(1, c.mostrar());
		c.reset();
		Assert.assertEquals(0, c.mostrar());
	}
	
	@Test
	public void queDecrementa() {
		Contador c = new Contador();
		c.contar();
		Assert.assertEquals(1, c.mostrar());
		c.descontar();
		Assert.assertEquals(0, c.mostrar());
	}

	@Test
	public void testDeEjecucionesSubsiguientesDelContador() {
		Contador c = new Contador();
		for (int i = 0; i < 100; i++) {
			c.contar();
		}
		Assert.assertEquals(100, c.mostrar());
	}

	@Test
	public void testQueResteaEn9999() {
		Contador c = new Contador();
		for (int i = 0; i < 9999; i++) {
			c.contar();
		}
		Assert.assertEquals(9999, c.mostrar());
		c.contar();
		Assert.assertEquals(0, c.mostrar());
	}

}
