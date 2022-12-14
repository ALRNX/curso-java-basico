package com.loiane.cursojava.exe17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		boolean infoValidas = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do {
			out.println("Digite um nome");
			nome = scan.next();
			
			if (nome.length() >= 3) {
				infoValidas = true;
				out.println("Nome válido");
				//break;
			} else {
				out.println("Nome com mínimo 3 caracteres");
			}
		} while (!infoValidas);
		
		
		infoValidas = false; 
		
		do {
			out.println("Digite a idade");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValidas = true;
				out.println("Idade válida");
				//break;
			} else {
				out.println("Digite uma idade válida entre 0 e 150 seu ancião");
			}
		} while (!infoValidas);
		
		infoValidas = false; 
		
		do {
			out.println("Quanto você deseja ganhar meu caminhão carregado de argamassa");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValidas = true;
				out.println("Meu fi quer dinheiro");
			} else {
				out.println("Digite um sálario maior que 0");
			}
		} while (!infoValidas);
		
		infoValidas = false; 
		
		do {
			out.println("Qual seu sexo?");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				infoValidas = true;
			} else {
				out.println("Para escolher o sexo digite 'M' ou 'F'");
			}
		} while (!infoValidas);
		
		infoValidas = false; 
		
		do {
			out.println("Qual seu estado civil no momento");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
				infoValidas = true;
			} else {
				out.println("Para escolher o sexo digite 'S', 'D', 'V' ou 'C'.");
			}
		} while (!infoValidas);
		
		out.println("Sua informações foram coletadas com sucesso!");
		out.println("Nome " + nome);
		out.println("Idade " + idade);
		out.println("Salário " + salario);
		out.println("Sexo " + sexo);
		out.println("Estado Civil " + estadoCivil);
	}

}
