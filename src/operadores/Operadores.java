package operadores;
//Exemplo de uso de operadores
public class Operadores {
	//operadores==> 
	public static void main(String[] args) {
		//exemplo operando sao o valores que serao divididos, adicionados, subtraidos ectt
		//operadores e o sinal
		
		//exemplo
		int a, b;
		
		a = 3;
		b = 4;
		
		System.out.println(a-b);
		// -2 operador unirio porque somente faz a operacao com um numero
		//binario 2+2
		//ternario true? "sim": "nao"
		
		int x = 4 + 3;
		System.out.println("Operador binario "+ x);
		System.out.println("Operador unario " + -x);
		
		//usando para concatenar String
		String c = "6" + "7";
		System.out.println(c);
		
		//verificando Precedencia
		double y = 7-4 + 3 * 2;
		System.out.println(y);
		
		//Primeiro parentizes
		double yy = (7-4 + 3) * 2;
		System.out.println(yy);
		
	}

}
