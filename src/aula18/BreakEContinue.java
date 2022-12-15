package aula18;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
//		Scanner scan = new Scanner(System.in);
//		
//		out.println("Digite um número");
//		int numero = scan.nextInt();
//		
//		out.println("Digite um número limite");
//		int numMaximo = scan.nextInt();
//		
//		for (int cont = numero; cont < numMaximo; cont++) {
//			
//			if (cont % 7 == 0) {
//				out.println("O valor de cont é: " + cont);
//				break;
//			}
//			
//		}
		
//		for (int cont = 0; cont <= 4; cont++) {
//			rotulo1: {
//				rotulo2:{
//					rotulo3:{
//						if (cont == 1) {
//							break rotulo1;
//						}
//						if (cont == 2) {
//							break rotulo2;
//						}
//						if (cont == 3) {
//							break rotulo3;
//						}
//						out.println("rotulo3");
//					}
//					out.println("rotulo2");
//				}
//				out.println("rotulo1");
//			}
//			out.println(cont);
//		}
		
		Scanner scan = new Scanner(System.in);
		
		out.println("Digite um número");
		int numero = scan.nextInt();
		
		out.println("Digite um número limite");
		int numMaximo = scan.nextInt();
		
		for (int cont = numero; cont < numMaximo; cont++) {
			if (cont % 7 == 0) {
				continue;
			}
			
			//out.println("O valor de cont é: " + cont);
			out.println("O valor de cont é: " + cont);
		}
		
		
	}

}
