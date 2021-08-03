package fluxocondicional;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaQueColectaUmaListaDeProdutosInformadosPeloTeclado {
	
	public static void main(String[] args) {
		
		//Fluxo de repeticao
		
		ArrayList<String> produtos = new ArrayList<String>();
		//criando um objectos
		Scanner s = new Scanner(System.in);
		
		System.out.println("Liste seus produtos: para sair ");
		
		String produto;
		//colecatando produtos dogitados peleo usuario
		
		//caso o produto seja diferente de apalavra fim
		//atribuo oque vem digitado na variavel s na variavel produto
		// e faco a comparacao, se acomparacao for negativa addiciomno na alista senao saio
		while(!"FIM".equals(produto = s.nextLine())) {
			produtos.add(produto);
		}
		
		System.out.println(produtos.toString());
	}

}
