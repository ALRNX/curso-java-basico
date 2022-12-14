package aula14;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class condicionaisIfElse {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		Scanner scan = new Scanner(System.in);
		
		/*out.println("Digite sua idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			out.println("é maior de idade");
		} else {
			out.println("é menor de idade");
		}*/
		
		//barato <= 10
		//10 < valor <15 -  pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= muito caro
		
		out.println("Digite o preço do item");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			out.println("Pode comprar, está barato");
		} else if (valor > 10 && valor < 15) {
			out.println("Você pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			out.println("Pode pesquisar mais!");
		} else { //valor >= 17
			out.println("Muito caro, corra!! RUN LITTLE GIRL");
		}
		
	}

}
