package edu.unlam.taller;

public class Fibonacci {

	public static int de(int n) {
		
		if (n == 0) throw new RuntimeException("No se puede calcular el Fibonacci de cero");
		
		if (n>=3) return de(n - 1) + de(n - 2);
		return 1;
	}

}
