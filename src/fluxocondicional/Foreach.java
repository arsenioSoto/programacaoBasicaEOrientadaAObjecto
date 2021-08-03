package fluxocondicional;

public class Foreach {
	
	public static void main(String[] agrs) {
		
		//for
		//apresentar os numeros usando estrutura de repeticao 
		//para percorrer todos os elementods dentro de um arrays
		//ele recupera todos os numeros dentro daquele arrys, e por fim ele impreme o resultado
	//	int[] pares = {2,3,2,1};
		//for(int i = 0; i<pares.length; i++) {
			//int par = pares[i];
			//System.out.println(par);
		//}
		
		//funcinamento de for aprimorado
		//ele percorre a todos os elemetos dentro de uma arrays ou arraylist
		
		//primeiro a condicao, segundo o tipo de elemento que voce tem dentro da arraysList
		//segundo percorre cada elemento dentro da arrays list
		// e por fim podemos imprimir os elemtos 
		
		//foreach nao temos acesso ao i
		int[] pares = {2,4,6,8};
		for(int par : pares) {
			System.out.println(par);
		}
	}

}
