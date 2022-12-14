package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 20;
		String nome = "Allan";
		String nomeDoMeuCachorro = "Tunica";
		
		//aceito, mas não é utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String nomedomeucachorro;
		String nomeDOMEUcacahorro;
		
		idade = 29;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		
		//má prática
		int a = 10;
		String b = "Loiane";
	}

}
