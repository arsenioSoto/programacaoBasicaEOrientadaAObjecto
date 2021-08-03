package orientacaoobjecto.construtores.relacionamentotemum;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	//construtor com parametros e inicializacao do objectos
	public Carro (String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	//construtor sem parametros
	public Carro() {
		
	}
	
	//contrutor que recebe para metros de uma outra class e a sua inicializacao
	public Carro (String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}

}
