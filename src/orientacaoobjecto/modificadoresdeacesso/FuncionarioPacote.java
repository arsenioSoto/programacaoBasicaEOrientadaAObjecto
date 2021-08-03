package orientacaoobjecto.modificadoresdeacesso;

import orientacaoobjecto.modificadoresdeacesso.funcionario.Funcionario;

public class FuncionarioPacote {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		//func.n //precisa dar visibilidade
		//func.numero //precisa dar aceeso
		func.cell =3234;
		func.getNome();
		//fora do pacote somete pegamos as visisbilidade publicas 

	}

}
