package orientacaoobjecto.construtores.relacionamentotemum;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//estalinha abaixo criamos um objecto carro
		Carro toyota = new Carro("Toyota", 123, 2.8);
		
		//Esta linha abaixo criamos o objecto motor
		Motor v12 = new Motor("V12", 666);
		
		//esta linha a baixo adicionamos o objecto motor ao carro criado
		toyota.motor = v12; //
		
		System.out.println(toyota.modelo);
		
		//criando uma nova instancia sem parametros
		Carro mercedes = new Carro();
		mercedes.modelo = "Mercedes Bz";
		mercedes.velocidadeMaxima = 5272;
		mercedes.segundosZeroACem = 5.9;
		
		Motor v76 = new Motor();
		v76.potencia = 769;
		v76.tipo = "v76";
		
		mercedes.motor = v76;
		
		System.out.println(mercedes.modelo);
		
		//acessando propriedades de um objectos, atraves de um outro 
		
		System.out.println(mercedes.motor.potencia);
		System.out.println(mercedes.motor.tipo);
		
		//Relacao carro motor relacinamento Tem um
		Carro bugati = new Carro("Bugatti", 678, 3.3, new Motor("w12", 1272));
	}

}
