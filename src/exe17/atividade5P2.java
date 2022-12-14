package exe17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class atividade5P2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		double populacaoA;
		double populacaoB;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		int cont = 0;
		
		boolean infoValida = false;
		
		do {
			
			out.println("Digite a quantidade de indíviduos existentes na população A");
			populacaoA = scan.nextDouble();
			
			if (populacaoA > 0) {
				infoValida = true;
			} else {
				out.println("População A precisa ser maior que 0");
			}
			
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			out.println("Digite a quantidade de indíviduos existentes na população B");
			populacaoB = scan.nextDouble();
			
			if (populacaoB > 0) {
				infoValida = true;
			} else {
				out.println("População B precisa ser maior que 0");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			 
			out.println("Digite a taxa de crescimento da população A");
			taxaCrescimentoA = scan.nextDouble();
			
			if (taxaCrescimentoA <= 100) {
				infoValida = true;
			} else {
				out.println("A taxa de crescimento precisa estar entre 0 a 100 porcento");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			 
			out.println("Digite a taxa de crescimento da população B");
			taxaCrescimentoB = scan.nextDouble();
			
			if (taxaCrescimentoA <= 100) {
				infoValida = true;
			} else {
				out.println("A taxa de crescimento precisa estar entre 0 a 100 porcento");
			}
		} while (!infoValida);
		
		
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
