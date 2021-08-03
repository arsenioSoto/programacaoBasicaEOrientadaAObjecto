package operadores;

import java.util.Scanner;

public class OperadoresEspecias2 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("informe  o raio");
		double raio = s.nextDouble();
		
		//efetuando calco de diaamentro de um circulo fr/ diametro = 2*r
		
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
