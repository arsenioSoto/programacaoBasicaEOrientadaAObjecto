package tratamentosdeexcecoes.erros;

public class ExcecoesComuns {
	// static int [] arrayNull; array null
	
	static int [] arrayNull = new int[0];
	
	public static void main(String[] args) {
	//	
		//erro de null poit tentando acessar array vazio que nao existe
		//System.out.println(arrayNull.length);
		
		//tentando acessar uma posicao que nao existe
		System.out.println(arrayNull[1]);
		
	}

}
