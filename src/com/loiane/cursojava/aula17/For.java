package com.loiane.cursojava.aula17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush

		Scanner scan = new Scanner(System.in);
		
		for (int cont = 2; cont <= 5; cont++) {
			
			out.println("cont tem valor: " + cont);
		}
		
		for (int cont = 5; cont >= 0; cont--) {
			
			out.println("cont tem valor: " + cont);
		}
		
		for (int cont = 0, j = 10 ; cont <= j ; cont++, j--) {
			
			out.println("cont = " + cont  + "; j = " + j);
		}
		
		//PARTES AUSENTES
		
		int count = 0;
		for( ; count < 60 ; ) {
			out.println("valor de cont: " + count);
			count += 2;
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			out.println("valor de cont: " + cont);
		}
		
		
		int soma = 0;
		for( int cont = 0; cont <5 ; soma+= cont++);
			
			out.println("o valor da soma é " + soma);
			
		
			
	}

}
