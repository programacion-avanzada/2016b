package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.taller.items.ConAnilloDraupnir;
import edu.unlam.taller.items.ConEscudoSvalinn;
import edu.unlam.taller.items.ConEspadaSkofnung;

public class ItemTests {
	
	/*
	 * Especificación de Items
	 * ~~~~~~~~~~~~~~~~~~~~~~~
	 * ConEspadaSkofnung: Esta espada aumenta en 5 pts el ataque
	 * ConEscudoSvalinn: Este escudo otorga 10 pts de defensa
	 * ConAnilloDraupnir: Este anillo multiplica el ataque x2
	 */
	
	@Test
	public void quePuedoAgregarItemDeAtaque() {

		Personaje sigmund = new Humano();
		Assert.assertEquals(10, sigmund.obtenerPuntosDeAtaque());

		// agrego item de ataque
		sigmund = new ConEspadaSkofnung(sigmund);
		Assert.assertEquals(5 + 10, sigmund.obtenerPuntosDeAtaque());
	}

	@Test
	public void quePuedoAgregarAmbosItems() {

		Personaje sigmund = new Humano();
		Assert.assertEquals(10, sigmund.obtenerPuntosDeAtaque());

		// agrego item de ataque
		sigmund = new ConEspadaSkofnung(sigmund);
		Assert.assertEquals(5 + 10, sigmund.obtenerPuntosDeAtaque());

		Assert.assertEquals(0, sigmund.obtenerPuntosDeDefensa());
		sigmund = new ConEscudoSvalinn(sigmund);
		// agrego defensa
		Assert.assertEquals(10 + 0, sigmund.obtenerPuntosDeDefensa());
		// y no pierdo ataque
		Assert.assertEquals(5 + 10, sigmund.obtenerPuntosDeAtaque());
	}

	@Test
	public void quePuedoAgregarDosTiposDeItem() {
		Personaje sigmund = new Humano();
		Assert.assertEquals(10, sigmund.obtenerPuntosDeAtaque());

		// agrego item de ataque
		sigmund = new ConEspadaSkofnung(sigmund);
		Assert.assertEquals(5 + 10, sigmund.obtenerPuntosDeAtaque());

		// agrego anillo multiplicador (x2)
		sigmund = new ConAnilloDraupnir(sigmund);
		Assert.assertEquals((5 + 10) * 2, sigmund.obtenerPuntosDeAtaque());
	}
	
	@Test
	public void quePuedoQuitarUnItem() {
		Personaje sigmund = new Humano();
		sigmund = new ConEspadaSkofnung(sigmund);
		sigmund = new ConAnilloDraupnir(sigmund);
		sigmund = new ConEscudoSvalinn(sigmund);
		
		Assert.assertTrue(sigmund.tiene(ConAnilloDraupnir.class));
		sigmund = sigmund.desequipar(ConAnilloDraupnir.class);
		Assert.assertFalse(sigmund.tiene(ConAnilloDraupnir.class));
		
		Assert.assertTrue(sigmund.tiene(ConEspadaSkofnung.class));
		sigmund = sigmund.desequipar(ConEspadaSkofnung.class);
		Assert.assertFalse(sigmund.tiene(ConEspadaSkofnung.class));
	}
}
