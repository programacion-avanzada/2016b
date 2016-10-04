package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

public class HechizosTests {

	@Test
	public void quePuedoHechizar() {
		Personaje gimli = new Enano();
		Assert.assertEquals(120, gimli.getAltura());
		new Engorgio().afectar(gimli);
		Assert.assertEquals(240, gimli.getAltura());
	}
	
	@Test
	public void quePuedoAgregarHechizos() {
		Mago gandalf = new Mago();
		Assert.assertEquals(0, gandalf.getCantidadDeHechizos());
		gandalf.agregarHechizo("engorgio", new Engorgio());
		Assert.assertEquals(1, gandalf.getCantidadDeHechizos());
	}

	@Test
	public void queUnPersonajePuedeHechizarPorNombre() {
		Mago gandalf = new Mago();
		gandalf.agregarHechizo("engorgio", new Engorgio());
		Personaje gimli = new Enano();
		Assert.assertEquals(120, gimli.getAltura());
		gandalf.hechizar("engorgio", gimli);
		Assert.assertEquals(240, gimli.getAltura());
	}
	
}
