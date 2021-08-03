package fluxocondicional;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int anterior = 0;
		int proximo = 1;
		
		System.out.println(anterior);
		System.out.println(proximo);
		//1=1+0 ==1
		
		
		while(proximo < 100) {
			System.out.print(" "+ proximo + " ");
			proximo = proximo + anterior;//proximo numero fibbnacci
			anterior = proximo - anterior;//actualizando o numero anterior = soma - anterior
		}
		
		
	}

}
