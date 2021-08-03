package tratamentosdeexcecoes.multicatchstacktracethrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisor {
	
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException
	
	{
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int d = s.nextInt();
		
		System.out.println(a/d);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				
				dividir(s);
				continua = false;
				
			} catch (ArithmeticException | InputMismatchException e1) {
				System.err.println("Numeros inseridos invalidos");
				//e1.printStackTrace();//esse metodo imprime todos os erros encontrados na execucao
				//e1.getMessage();//esse metodod retorna uma
				
				s.nextLine();
			}
			finally {
				System.out.println("Terminado com sucesso........");
			}
			
		}while(continua);
		
	}

}
