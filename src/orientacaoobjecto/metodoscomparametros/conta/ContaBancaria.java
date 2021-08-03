package orientacaoobjecto.metodoscomparametros.conta;

public class ContaBancaria {
	
	String cliente;
	double saldo;
	
	//metodo sem parametro
	void exibeSaldo() {
		System.out.println(cliente+ " seu saldo eh "+ saldo);
	}
	
	//metodo com parametro
	void saca (double valor) {
		this.saldo = saldo -valor;
		//saldo -=valor;
	}
	
	//metod que recebe parametro
	void deposita (double valor) {
		this.saldo += valor;
	}
	
	//metod que recebe dois parametros
	void transferePara(ContaBancaria destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}

}
