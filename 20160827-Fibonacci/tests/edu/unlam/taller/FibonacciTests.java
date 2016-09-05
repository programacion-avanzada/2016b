package edu.unlam.taller;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTests {

	@Test(expected=RuntimeException.class)
	public void pruebasDeCasosExcepcionales() {
		Fibonacci.de(0);
	}
	
	@Test
	public void pruebasDeLaSucesion() {
		
		Assert.assertEquals(1, Fibonacci.de(1));
		Assert.assertEquals(1, Fibonacci.de(2));
		Assert.assertEquals(2, Fibonacci.de(3));
		Assert.assertEquals(3, Fibonacci.de(4));
		Assert.assertEquals(5, Fibonacci.de(5));
		Assert.assertEquals(8, Fibonacci.de(6));
		
		Assert.assertEquals(13, Fibonacci.de(7));
		Assert.assertEquals(21, Fibonacci.de(8));
		Assert.assertEquals(34, Fibonacci.de(9));
		
	}
	
}
