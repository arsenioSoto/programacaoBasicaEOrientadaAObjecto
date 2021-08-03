package tratamentosdeexcecoes.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {	
				
				System.out.println("Numero: ");
				int a = s.nextInt();
				System.out.println("Divisor");
				int b = s.nextInt();
				int d = a/b;
				System.out.println("Resultado: " + d);
				continua = false;
				
			} catch(InputMismatchException e1) {
				System.out.println("Digite valores inteiros");
				s.nextLine();//descarta a entradaque deu erro e libera novamente para o usuario
			} catch(ArithmeticException  e2) {
				System.out.println("O Divisor deve ser diferente de zero");
			}
			finally {
				System.out.println("Executado com sucecsso......");
			}
	} while(continua);
		
	
		
		//InputMismatchException  --> quando inserir caracteres ao inves de numeros
		//ArithmeticException ---> Quando inserir valor zero no divisor
	}

}
