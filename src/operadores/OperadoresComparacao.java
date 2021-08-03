package operadores;

public class OperadoresComparacao {
	
	public static void main(String[] args) {
		
		int x = 6;
		//Fazendo a comaparacao
							//7, 8, 9,10, 11,etc....
		System.out.println(x == 6);
		System.out.println(x == 7);
		
		//o perado0r para verificar se um valor e diferente de outro
		
		System.out.println(x !=6);
		
		//operador maior que
		
		System.out.println(x > 7);
		System.out.println(x < 7);
		System.out.println(x >= 6); //<=
		
		//operador instanceoff
		//esse operador compara tipos de dados, mais ela somente compara objectos
		Integer xx = 6;
		System.out.println(xx instanceof Integer);
	}

}
