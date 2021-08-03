package arrayssimples;
//Arrays mult demensionais
public class ArraysMultiDemensionais {
	
	public static void main(String[] args) {
		
		//arrays de uma demensao
		String[] uma = {"Arsenio", "soto"};
		//acesssar um elemento de uma dada posiscao
		System.out.println(uma[0]);
		
		
		//arrays de uma demensao
		String [][] duas = {{"Arsenio","M", "DF"},{"Junior","M","DG"}};
		//acessando o proimeiro elemento da minhaprimeira posicao
		//primeiro parentizes o valor da demensao
		//segundo indica a posicao
		System.out.println(duas[0][0]);
		
		
		//acessando o primeiro elemento da segunda posicao
		System.out.println(duas[1][0]);
		
		
		//descobrir os elementos do arrays
		System.out.println(duas.length);
		
		//saber quantas demensoes tem os arrays internos
		//o nome do arrays e no numero da demensao
		//nome 0 sexo 1 dd 2
		System.out.println(duas[0].length);
		
		
		//alterando valores dentro de um arrays
		duas[1][0] = "Soto";
		System.out.println(duas[1][0]);
	} 

}
