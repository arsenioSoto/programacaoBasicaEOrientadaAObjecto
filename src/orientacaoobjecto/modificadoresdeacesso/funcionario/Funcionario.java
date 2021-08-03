package orientacaoobjecto.modificadoresdeacesso.funcionario;

public class Funcionario {
	
	private String nome;//somente dentro da class
	int numero;//somento os filhos da classs
	public int cell;//em qualque outro lugar
	
	
	public String getNome() {
		return nome;
	}
	
	
	
	
	
	public static void main(String[] args) {
	//tudo pode ser acessado abaixo 	
	Funcionario func = new Funcionario();
	func.nome = "junior";
	}
}
