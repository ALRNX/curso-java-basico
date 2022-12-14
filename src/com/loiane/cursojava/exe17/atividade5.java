package com.loiane.cursojava.exe17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		
		
		int populacaoA;
		int populacaoB;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		int cont = 0;
		
		out.println("Digite a quantidade de indíviduos existentes na população A");
		populacaoA = scan.nextInt();
		out.println("Digite a taxa de crescimento da população A");
		taxaCrescimentoA = scan.nextDouble();
		
		out.println("Digite a quantidade de indíviduos existentes na população B");
		populacaoB = scan.nextInt();
		out.println("Digite a taxa de crescimento da população B");
		taxaCrescimentoB = scan.nextDouble();
		
		while(populacaoA <= populacaoB) {
			
			populacaoA += (populacaoA/100) * taxaCrescimentoA;
			populacaoB += (populacaoB/100) * taxaCrescimentoB;
			cont++;
		}
		
		out.println("População A: " + populacaoA);
		out.println("População B: " + populacaoB);
		out.println("Quantidade anos:    " + cont);

	}

}
