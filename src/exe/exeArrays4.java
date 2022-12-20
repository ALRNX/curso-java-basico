package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exeArrays4 {

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out, true, UTF_8);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.println("Digite os valores do vetor A " + cont);
			vetorA[cont] = scan.nextInt();
			
			vetorB[cont] = Math.sqrt(vetorA[cont]);
		}
		
		out.print("Valores vetor A = ");
		for(int cont = 0; cont < vetorA.length; cont++) {
			out.print(vetorA[cont] + " ");
		}
		
		out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		out.print("Valores vetor B = ");
		for(int cont = 0; cont < vetorB.length; cont++) {
			out.print(df.format(vetorB[cont]) + " ");
		}
	}

}
