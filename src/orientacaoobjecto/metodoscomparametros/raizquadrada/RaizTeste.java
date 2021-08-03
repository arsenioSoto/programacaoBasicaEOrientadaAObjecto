package orientacaoobjecto.metodoscomparametros.raizquadrada;

public class RaizTeste {

	public static void main(String[] args) {
		
		RaizQuadrada raiz = new RaizQuadrada();
		int valor = raiz.raiz(27);
		System.out.println("Usando o Metodo com retorno" + valor);
		
		//usnado a class Math
		System.out.println("Usando a classe Math: " + Math.sqrt(27));

	}

}
