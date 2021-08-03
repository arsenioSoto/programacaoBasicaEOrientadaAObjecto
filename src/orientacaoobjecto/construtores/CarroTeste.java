package orientacaoobjecto.construtores;

public class CarroTeste {

	public static void main(String[] args) {
		
		//Inicializando um construtor sem parametros
		Carro ferrari = new Carro();
		ferrari.modelo ="Ferrari_Enzo";
		ferrari.velocidadeMaxima = 368;
		ferrari.segundosZeroACem = 3.2;
		
		System.out.println(ferrari.modelo);
		
		//inicializacao de um construtor com parametros
		Carro koenigsegg =new Carro("Koenigsegg ccxr", 682, 4.3);
		
		System.out.println(koenigsegg.modelo);
		
		
	}

}
