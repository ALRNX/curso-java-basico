package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

public class exArrays5 {

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out, true, UTF_8);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.println("Digite os valores do vetor A");
			vetorA[cont] = scan.nextInt();
			
			vetorB[cont] = vetorA[cont] * cont;
		}
		
		out.print("Valores do vetor A ");
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.print(vetorA[cont] + " ");
		}

		out.println();
		
		out.print("Valores do vetor B ");
		for(int cont = 0; cont < vetorB.length; cont++) {
			out.print(vetorB[cont] + " ");
		}
	}

}
