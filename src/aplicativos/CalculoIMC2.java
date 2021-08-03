package aplicativos;

import javax.swing.JOptionPane;

// classe responsavel por calcular o indice de massa corporal
// imc = pesoKg/(altura*altura)
public class CalculoIMC2 {
	
	public static void main(String[] args) {
		
		System.out.println("-------------Calulo de IMC -----------");
		String peso = JOptionPane.showInputDialog("Qual e o seu peso em KG: ");
		String altura = JOptionPane.showInputDialog("Qual e o seu altura em Metros: ");
		
		//variavel responsalve por receber a conversao 
		double pesoEmQulilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQulilogramas/(alturaEmMetros*alturaEmMetros);
		
		//usando operador ternario para verificar se o imc esta dentro de peso idael
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal " : " Fora do Peso ideal";
		msg = "IMC " + imc + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);
		
		System.out.println("IMC " + imc);
		System.out.println(msg);
		
	}

}
