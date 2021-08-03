package fluxocondicional;
//programa para verifica quantos numeros pares existem dentro de um determinado numero
public class VerificadoNumerosPares {
	
	public static void main(String[] args) {
		
		String texto= " ";
		for(int i = 0; i <= 20; i++) {
			if(i % 2 ==0 ) {
				texto += i + " , ";
			}
		}
		System.out.println("Imprimindo somente numeros pares " + "\n "+ texto);
	}

}
