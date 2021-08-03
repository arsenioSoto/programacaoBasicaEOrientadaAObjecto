package entradadedadoscomclassescanner;

import java.util.Scanner;

public class Entrada {
	
	public static void main(String[] args) {
		
		//Interacao   com o usuario
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu Nome: ");
		String nome = s.nextLine();
		System.out.println("Digite a sua Idade: ");
		int idade = s.nextInt();
		System.out.println("Bem vindo "+ nome + " conforme digitado voce tem: " + idade);
	}

}
