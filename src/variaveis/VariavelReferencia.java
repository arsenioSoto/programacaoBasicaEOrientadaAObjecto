package variaveis;
/**
 *Apresentado os Conceitos de variavel de referencia
 * @autor Arsenio Jose Soto Junior
 * Ano 01-01-2021
 */
public class VariavelReferencia {
	
	public static void main(String[] args) {
		
		//Variavel primitiva
		int x = 7; //exemplo dentro do valor x conte numeros binarios que representa o valor 7
		//se fizermos isso
		x = 9;
		//ele ira substituir o nosso valor
		
		//variavel de referencia e toda aquela variavel que aponta para umobjecto
		//Exemplo
		String y = "Aulas"; //Exemplo enquanto que aqui existe um apontador onde para acessar entramos na referencia e de seguida podemos acessar a nosssa variavel
		//se fizermos
		y = "aluas";// criamos um outro objecto enquanto que o antigo esta namemoria armazenada nao substitui somente cria um outro objecto
		
		y = null; // para limpar a memoria, tanto o valor antigo como se quiser dar uma limpeza no incio quem faz issso e o Garbag Collector
	}

}
