package orientacaoobjecto.metodoscomparametros.conta;

public class ContaTeste {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.cliente = "Arsenio jose";
		conta.saldo = 231;
		//conta.exibeSaldo();
		conta.saca(31);
		//conta.exibeSaldo();
		conta.deposita(100);
		conta.exibeSaldo();
		
		ContaBancaria destino = new ContaBancaria();
		destino.cliente = "Soto";
		destino.saldo = 1000;
		
		destino.exibeSaldo();
		
		conta.transferePara(destino, 200);
		destino.exibeSaldo();
		conta.exibeSaldo();

	}

}
