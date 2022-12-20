package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class exeArrays6 {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.println("Digite os valores do vetor A da posição" + cont);
			vetorA[cont] = scan.nextInt();
			

		}
		
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.println("Digite os valores do vetor B da posição" + cont);
			vetorB[cont] = scan.nextInt();
			
			vetorC[cont] = vetorA[cont] + vetorB[cont];
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

		out.println();
		
		out.print("Valores do vetor C ");
		for(int cont = 0; cont < vetorC.length; cont++) {
			out.print(vetorC[cont] + " ");
		}
	}

}
