package orientacaoobjecto.atributosemetodosestaticos;

public class Galinha {
	
	public static int ovosDaGranja;// criando variavel global, e somente crianda uma vez
	//pertence a classe galinha e nao ao objecto galinha
	
	public int ovos; //total de ovos do objeto galinha
	
	//instrucao parapermitir que o objeto criado chame
	// os metodos na mesma linha, usando
	// O tipo de dado com o nome da classe 
	// o metodo e retornando o this, esta classe
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;//intramos na classe e vamos pegar a variavel que pertence a class
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}

}
