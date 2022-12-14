package com.loiane.cursojava.exe17;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		boolean infoIguais = false;
		String usuario;
		String senha;
		
		do {
			
			out.println("Digite o nome de usuário");
			usuario = scan.next();
			out.println("Digite a senha do usuário");
			senha = scan.next();
			
			if (!usuario.equalsIgnoreCase(senha)) { 
				infoIguais = false;
				out.println("Usuário top Rogerinho");
				break;
			} else {
				infoIguais = true;
				out.println("Digite a senha diferente do nome de usuario");
			}
		} while (!infoIguais);
	}

}
