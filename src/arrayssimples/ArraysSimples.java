package arrayssimples;

import java.sql.Array;
import java.util.Arrays;

public class ArraysSimples {
	
	public static void main(String[] args) {
		
		String[] paises = {"Moz","Bra","Indi","China"};
		//relacao de chave valor chamamos de indexacao
		//ou seja indice {valo, valor}
		
		//para acessar o array
		System.out.println(paises[0]);
		
		//alterando elemento 
		
		paises[0] = "Mozam";
		System.out.println(paises[0]);
		
		//criando um arrays de inteiro e inicializando o arrays com 
		//5 posicoes iniciando de 0:
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		//descobrindo quantasposicoes tem o meu arrays
		
		System.out.println(paises.length);
		System.out.println(impares.length);
		
		//listando os elementos do array
		System.out.println(Arrays.toString(paises));
		
		//realizando pesquisa dentro do meu arrays
		
		int posicao = Arrays.binarySearch(paises, "Indi");
		System.out.println("Mostrando o numero da posicao: " + posicao);
		
		//ordenar o array com o metodod sort
		// dos elementos que vao da posicao 0 ate o ultimo elemento
		Arrays.sort(paises , 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		
		Double[] valores = {12.12,232.21};
		System.out.println(valores[0].doubleValue());
		
	}

}
