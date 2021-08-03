package arrayssimples;

import java.util.Random;

public class ArraysMultContinuacao {
	//aplicativo para selecionar carata de um baralho lusofono aleatoriamente
	public static void main(String[] args) {
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		//para selecionar aleatoriamente uma carta exemplo manual
		//String carta = faces[0] + " " +nipes[0];
		//System.out.println(carta);
		
		Random r = new Random();
		 
		//int iniceFace = r.nextInt(faces.length);
		String face = faces[r.nextInt(faces.length)];
		
		int iniceNipe = r.nextInt(nipes.length);
		String nipe = nipes[iniceNipe];
		
		String carta = face + " " +nipe;
		System.out.println(carta);
	}

}
