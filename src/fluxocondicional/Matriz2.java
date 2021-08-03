package fluxocondicional;

public class Matriz2 {
	
	public static void main(String[] args) {
		
		boolean [][] matrix = {
				{false,true, false, false, false},
				{false, false, false, false, false}
		};
		//fazendo uma bisca
		busca://usando rotulos, ele somente para quando encontra valores pesquisados, 
			//nb para todos em ambos arrays
		//eaae for serve para imprimir os arrays ou seja percorrere os arrays  
		for(int a = 0; a< matrix.length; a++) {
			System.out.println("A ");
			//cada elemento E dito como A, A
		//eese for serve para percorrer os elementos dentro do arrays, 
			//para cada elemento, ou seja dentro primeiro arrays{a} vou percorrer todos
			//os elemoentos dentro dele
		
		for(int b = 0; b < matrix[a].length; b++) {
			//localizando um elemento
			//quando encontra escreve Verdade
			if(matrix[a][b]) {
				System.out.println("TRUE ");
				break busca;// para o programa para somente se for a encontar
			}
			System.out.println("B ");
		}
		}
	}

}
