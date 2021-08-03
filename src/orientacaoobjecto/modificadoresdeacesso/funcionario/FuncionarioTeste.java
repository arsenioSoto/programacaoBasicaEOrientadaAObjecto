package orientacaoobjecto.modificadoresdeacesso.funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		//func.nome = "arse"; precisa dar visibilide
		func.numero = 12;
		func.cell = 22312;
		func.getNome();
		//dentro do pacote pegamos aas visobilidade publicas e protecteds
	}

}
