package aula13;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		int valor1 = 1;
		int valor2 = 2;
		
		out.println("valor1 = valor2 " + (valor1 == valor2));
		out.println("valor1 != valor2: " + (valor1 != valor2));
		out.println("valor1 > valor2: " + (valor1 > valor2));
		out.println("valor1 >= valor2: " + (valor1 >= valor2));
		out.println("valor1 < valor2: " + (valor1 < valor2));
		out.println("valor1 <= valor2: " + (valor1 <= valor2));

	}

}
