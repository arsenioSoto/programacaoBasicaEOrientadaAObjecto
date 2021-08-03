package operadores;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		int x = 6;
		//retorna verdadeiro se e se somente se elas forem veradaaddeiras
		System.out.println((x >= 1) && (x <= 10));
		
		//retorna verdadeiro se uma ou outra for veradadeiro
		System.out.println((x >= 1) || (x <= 5));
		
		//retorna sempre verdade se o resultado for falso e a negacao transforma em veradade ou vice-versa
		System.out.println(!(x >= 1));
	}

}
