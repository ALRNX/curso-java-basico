package aula13;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1= (valor1 == 1) && (valor2 == 2);
		out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);
		
		boolean resultado2= (valor1 == 1) || (valor2 == 2);
		out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso= false;
		out.println(verdadeiro && falso);
		out.println(verdadeiro || falso);
		out.println(verdadeiro ^ falso);
		out.println(!verdadeiro && falso);
		
	}

}
