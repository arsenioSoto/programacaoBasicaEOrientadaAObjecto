package aplicativos;
// classe responsavel por calcular o indice de massa corporal
// imc = pesoKg/(altura*altura)
public class CalculoIMC {
	
	public static void main(String[] args) {
		
		System.out.println("-------------Calulo de IMC -----------");
		
		double pesoEmQulilogramas = 70;
		double alturaEmMetros = 1.70;
		double imc = pesoEmQulilogramas/(alturaEmMetros*alturaEmMetros);
		
		//usando operador ternario para verificar se o imc esta dentro de peso idael
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal " : " Fora do Peso ideal";
		
		
		System.out.println("IMC " + imc);
		System.out.println(msg);
		
	}

}
