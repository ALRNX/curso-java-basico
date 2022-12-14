package aula12;

import java.util.Scanner;

public class DadosTecladoExe {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome, sua idade e se faz faculdade: ");
		String nome = scan.next();
		int idade = scan.nextInt();
		boolean fazFacul = scan.nextBoolean();
		
		System.out.println("Você digitou as seguintes informações:");
		System.out.println("Seu nome é: " + nome);
		System.out.println("Você tem " + idade + " anos");
		System.out.println("Você faz faculdade ? " + fazFacul);
		
	}

}
