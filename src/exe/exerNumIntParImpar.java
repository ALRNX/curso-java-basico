package exe;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class exerNumIntParImpar {

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush

		Scanner scan = new Scanner(System.in);

		
		out.println("Digite um número");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			out.println("é um número par");
		} else {
			out.println("é um número ímpar");
		}
	}
}
