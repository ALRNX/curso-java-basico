package aula19;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		Scanner scan = new Scanner(System.in);
		
//		double tempDia001 = 31.3;
//		double tempDia002 = 32;
//		double tempDia003 = 33.7;
//		double tempDia004 = 34;
//		double tempDia005 = 33.1;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 31.3;
		
		out.println("O valor da temperatura do dia um é: " + temperaturas[0]);
		
		out.println("O tamanho total do array: " + temperaturas.length);
		
		//out.println("Valores do array: " + temperaturas);
		
		for (int cont = 0; cont < temperaturas.length; cont++) {
			out.println("O valor da temperatura do dia " + (cont+1) + " é: " + temperaturas[cont]);
		}
			
		for (double temp : temperaturas) {
			out.println(temp);
		}
		
	}

}
