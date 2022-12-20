package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class exeArrays2 {

	public static void main(String[] args) {
		

		PrintStream out = new PrintStream(System.out, true, UTF_8);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.println("Digite os valores do vetor A " + cont);
			vetorA[cont] = scan.nextInt();
			
			vetorB[cont] = vetorA[cont] * 2;
		}
		
		out.print("Valores vetor A = ");
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.print(vetorA[cont] + " ");
		}
		
		out.println();
		
		out.print("Valores vetor B = ");
		for(int cont = 0; cont < vetorB.length; cont++) {
			out.print(vetorB[cont] + " ");
		}
		
	}

}
