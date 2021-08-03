package operadores;

public class OperadoresEspecias {
	
	public static void main (String[] args) {
	//operador ternario aceita tres operandos
		
		int idade = 6;
		//	variavel para receber o resultado , operador ternario ?
		//recebe a condicao, se for veradade ira mostra a primeira expressao 
		String x = (idade >= 18 ) ? "Maior de idade" : "Menor de idade";
		System.out.println(x);
		
		//operador de separacao ,
		String sexo = "M", pais = "Mocambique";
		
		
		//efetuando calco de diaamentro de um circulo fr/ diametro = 2*r
		
		double raio = 10; //dez centimentros
		double diametro = 2*raio;
		
		System.out.println("o raio da circuferencia desse raio e: " + diametro);
		
		
		//calculando a circuferencia de um raio 2 PI r
		double pi = Math.PI;
		double circuferencia = 2 * pi*raio;
		System.out.println("Circuferencia: " + circuferencia);
		
		//calculando a area de um circulo
		// area Pi * r2
		
		double area = pi * (raio*raio);
		System.out.println("Area: "+ area);
		
		
		
	}

}
