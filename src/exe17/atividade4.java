package exe17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
		
		while(populacaoA <= populacaoB) {
			
			populacaoA += (populacaoA/100) * 3;
			populacaoB += (populacaoB/100) * 1.5;
			cont++;
		}
		
		out.println("População A: " + populacaoA);
		out.println("População B: " + populacaoB);
		out.println("Quantidade anos:    " + cont);
	}

}
