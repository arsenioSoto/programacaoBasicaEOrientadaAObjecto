package orientacaoobjecto.metodoscomparametros.retoorno;

public class MatematicaTeste {

	public static void main(String[] args) {
		Matematica m =new Matematica();
		int ma = m.maior(20, 10);
		System.out.println(ma);
		
		double so = m.soma(10, 10);
		System.out.println(so);
		
		//instrucao para soma o maior numero impar e maior numero impar
		//primeiro faz a comparacao de marioridade
		int pares = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double soo = m.soma(pares, impar);
		System.out.println(soo);

	}

}
