package aula13;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush
		
		int resultado = 1 + 2;
		out.println(resultado);
		
		resultado = resultado - 1;
		out.println(resultado);
		
		resultado = resultado * 2;
		out.println(resultado);
		
		resultado = resultado / 2;
		out.println(resultado);
		
		resultado = resultado + 8;
		out.println(resultado);
		
		resultado = resultado % 7;
		out.println(resultado);
		
		String primeiroNome = "Está é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		out.println(terceiroNome);
		
		resultado = resultado + 1;
		out.println(resultado);
		
		resultado++;
		out.println(resultado);
		
		//5
		out.println(resultado++);
		//mesma coisa que 
		//out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
	
		
		out.println(++resultado);
		//mesma coisa que
		//resultado += 1;
		//out.println(resultado);
		
		resultado--;
		out.println(resultado);
		
		out.println(resultado--);
		out.println(--resultado);
	}

}
