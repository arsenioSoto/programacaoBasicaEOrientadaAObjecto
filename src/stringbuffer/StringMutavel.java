package stringbuffer;

public class StringMutavel {

	public static void main(String[] args) {
		
		
		StringBuffer s1 = new StringBuffer();
		StringBuilder s2 = new StringBuilder("Arsenio");
		
		 
		
		System.out.println(s2.toString());
		//retorna a tamanhho
		System.out.println(s1.length());
		//metodo que informa a capacidade de elementos desse objecto sem alocar mais memoria
		System.out.println(s1.capacity());
		//metodo para inverter a ordem deste caractere
		System.out.println(s1.reverse());
		//metodo que permite incluir ou concatenar novos conteudos ha um valor ja existente
		s1.append(" Tamanho ");
		System.out.println(s1);
		
		
		String s = "Oi"+" Como "+"vai Voce";
		String sb = new StringBuilder("oi").append(" Como ").append("Vai voce?").toString();
		
		String url = new StringBuilder("www.mz.com.soto").delete(0, 4).toString();//metodo que deleta as strings de inicio (inicio ate o fim)

	}

}
