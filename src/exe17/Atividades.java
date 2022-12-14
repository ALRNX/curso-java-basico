package exe17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class Atividades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush

		boolean notaValida = false;
		
		do {
			
			out.println("Digite uma nota:");
			
			double nota = scan.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				out.println("Você digitou: " + nota);
			} else {
				//notaValida = false;
				out.println("Nota inválida, digite novamente.");
			}
			
		} while (!notaValida);
		
		
	}

}
