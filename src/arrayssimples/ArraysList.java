package arrayssimples;

import java.util.ArrayList;

public class ArraysList {
	
	public static void main(String[] args) {
		//criacao de objecto e o tipo de dado
		ArrayList<String> cores = new ArrayList<>();
		
		//para adicionar elemetons usamaos
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Castanho");
		//definindo aposicao do arrays
		cores.add(0, "Verde");
		
		
		System.out.println(cores.toString());
		
		//sabendo aquantidade de elementos no nosso arrays
		System.out.println("Tamanhho " + cores.size());
		
		//recuperar qualquer elemento dentro do arrayslist Nome do array.metodo get para acessar e o numero da posiscao 
		System.out.println("elementos no indice: "+ cores.get(2));
		
		//fazendo uma pesquisa para descobrir o indice de um elemento
		//									nome do array.metodo indexof dentro do parametro o nome do objecto								
		System.out.println("Indice de cor= "+ cores.indexOf("Castanho"));
		
		//metodo para remover dentro do array
		System.out.println(cores.remove("Azul"));
		
		//pequisa de um array retorna verdadeiro ou falso
		System.out.println(" Tem cor Vermelho" + cores.contains("Vermelho"));
	
		
		//
	} 

}
