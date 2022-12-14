package aula15;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		Scanner scan = new Scanner(System.in);
		
		out.println("Digite um dia da semana de (1 a 7)");
		
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1) {
			out.println("Domingo");
		} else if (diaSemana == 2) {
			out.println("Segunda");
		} else if (diaSemana == 3) {
			out.println("Terça");
		} else if (diaSemana == 4) {
			out.println("Quarta");
		} else if (diaSemana == 5) {
			out.println("Quinta");
		} if (diaSemana == 6) {
			out.println("Sexta");
		} if (diaSemana == 7) {
			out.println("Sábado");
		} else {
			out.println("A semana não tem mais de 7 dias seu burro");
		}*/
		
		
		/*switch(diaSemana) {
		
		case 1: out.println("Domingo"); break;
		case 2: out.println("Segunda"); break;
		case 3: out.println("Terça"); break;
		case 4: out.println("Quarta"); break;
		case 5: out.println("Quinta"); break;
		case 6: out.println("Sexta"); break;
		case 7: out.println("Sábado"); break;
		default: out.println("A semana não tem mais que 7 dias seu burro");
		}*/
		
		//break serve para quebrar a linha de código dps que o valor for encontrado
		
		switch(diaSemana) {
		
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: out.println("Dia útil"); break;
		case 1:
		case 7: out.println("Fim de semana"); break;
		default: out.println("A semana não tem mais que 7 dias seu burro");
		}
	}

}
