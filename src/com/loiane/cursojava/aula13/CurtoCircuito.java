package com.loiane.cursojava.aula13;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;
		boolean resultado2 = falso && 
				verdadeiro;
		out.println(resultado1);
		out.println(resultado2);
		
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		out.println(resultado);
		
		int resultado001 = 1 + 1 - 1 + 1 * 1 / 1;
		out.println(resultado001);

	}

}
