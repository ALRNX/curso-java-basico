package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class exeAnoBissexto {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		Scanner scan = new Scanner(System.in);

		out.println("Digite algum ano");
		
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0 )) {
			
			out.println("É um ano bissexto");
		} else {
			out.println("Não é um ano bissexto");
		}
		
	}

}
