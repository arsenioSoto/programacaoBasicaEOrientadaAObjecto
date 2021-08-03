package orientacaoobjecto.enumeracoes;

public enum Medida {
	//enumeracoes recebendo paramentros
	MM("Millimetros"), CM("Centimetros"), M("Metros");
	
	//criando um atributo, responsavel por receber o titulo das constantes
	
	public String titulo;
	
	//criando o construtor para inicializar o bjecto neste caso asmediadas
	Medida(String titulo){
		this.titulo = titulo;
	}

}
