package com.loiane.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647;
		
		int var2 = 100;
		
		System.out.println(var1 + var2);
		
		//os números no Java funcionam igual uma roleta, quando determinada função atinge seu valor máximo, o valor incrementado reseta para o valor mínimo + ele
		//retorno da operação -2147483549
		//no momento que adiciono alguma no número limite, ele retorna pros números negativos
		
	}

}
