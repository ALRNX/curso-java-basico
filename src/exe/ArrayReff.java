package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class ArrayReff {

	public static void main(String[] args) {
		

		PrintStream out = new PrintStream(System.out, true, UTF_8);
		Scanner scan = new Scanner(System.in);
		
		int[] reffA = new int[5];
		int[] segReffA = new int[5];
		
		for(int cont = 0; cont <reffA.length; cont++) {
			
			out.println("Digite os valores da Reff A " + cont);
			reffA[cont] = scan.nextInt();
			
			segReffA[cont] = reffA[cont];
		}
		
		out.print("Reff A valores = ");
		for(int cont = 0; cont <reffA.length; cont++) {
			out.print(reffA[cont] + " ");
		}
		
		out.println();
		
		out.print("SegReffA valores = ");
		for(int cont = 0; cont <segReffA.length; cont++) {
			out.print(segReffA[cont] + " ");
		}
	}

}
