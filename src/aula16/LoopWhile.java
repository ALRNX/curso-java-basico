package aula16;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush

		Scanner scan = new Scanner(System.in);
		
		int i = 0; //count ou cont
		int max = 10;
		
		out.println("Contando até " + max);
		
		while (i <= max) {
			
			out.println("Valor de i: " + i);
			i++; // i = i + 1; || i += 1
			
		}
		
		out.println(i); //valor de 11
		
		do {
			i++;
			out.println("Valor e i: " + i);
		} while (i < 13);
		
		out.println(i);
	}
	
	

}
