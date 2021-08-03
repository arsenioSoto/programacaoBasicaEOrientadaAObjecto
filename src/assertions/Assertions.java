package assertions;

import java.util.Scanner;

public class Assertions {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("informe um numerio de zero a dez: ");
		int numero = s.nextInt();
		
		//usamos o assert para testar a nossa condicao
		//assert(numero >= 0 && numero <= 10);
		//usamos de oitra forma
		assert (numero >= 0 && numero <= 10) : " Numero Invalido " +numero;
		//habilitando uma assertion
		//run config = arguments = segundo campo de mensagem -ea depois run
		
		
		System.out.println("Voce errou: " + numero);
	}
	
	

}
