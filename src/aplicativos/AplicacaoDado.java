package aplicativos;

import java.util.Random;
import java.util.Scanner;

public class AplicacaoDado {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Qual e o seu palpite?: ");
		int palpite = s.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1;// = 0 ate 5
		
		
		System.out.println("Palpite = "+ palpite);
		System.out.println("Dado = " + dado);
		
		if(palpite == dado) {
			System.out.println("Acertou");
		}else {
			System.out.println("Errou");
		}
	}

}
