package tratamentosdeexcecoes.erros;

public class SenhaTeste {

	public static void autenticar(String senha) throws SenhaInvalida {
		
		
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		}else {
			//senha incorrecta
			throw new SenhaInvalida("Senha Incorrecta");
		}
	}
	public static void main(String[] args) {
		
		
		try {
			autenticar("1232");//setatndo senha
		} catch (SenhaInvalida e) {
			e.printStackTrace();//imprimindo apilha de erros
			System.out.println(e.getMessage());//mostrando ao usuario qual foi o errro, usnado o getMessage para pegar o erro
		}

	}

}
