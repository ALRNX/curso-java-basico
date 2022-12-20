package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class exeArrays1 {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int cont = 0; cont < vetorA.length; cont++) {
			
			out.println("Digite o valor da posição " + cont);
			vetorA[cont] = scan.nextInt();
			
			vetorB[cont] = vetorA[cont];
		}
		
//		for (int cont = 0; cont < vetorA.length; cont++) {
//			vetorB[cont] = vetorA[cont];
//			
//		}
		out.print("Vetor A = ");
		for (int cont = 0; cont < vetorA.length; cont++) {
			out.print(vetorA[cont] + " ");
		}
		out.println();
		
		out.print("Vetor B = ");
		for (int cont = 0; cont < vetorB.length; cont++) {
			out.print(vetorB[cont] + " ");
		}
	}

}
