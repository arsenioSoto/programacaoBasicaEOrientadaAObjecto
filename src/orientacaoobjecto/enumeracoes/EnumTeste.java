package orientacaoobjecto.enumeracoes;

public class EnumTeste {
//exemplo de criacao de uma constante
	
	public static final double PI = 3.14;
//public para ela ser accessada
//static	para ele pertencer somente a esta class
//final para ela nao poder ser alterarda
// e os eu tipo de dado
// o seu identificador
// e o seu valor
	
	public static void andar(Medida medida, int total) {
		if(medida == medida.M) {
			System.out.println("Andado");
		}
	}
	
	public static void main(String[] args) {
		
		//para usar as constantes no sistema
		 System.out.println(PecasXadrez.BISPO);
		 
		 System.out.println(Medida.M.titulo);
		 
		 //percorrendo as constantes dentro de um enum
		 
		 for (Medida m: Medida.values()) {
			 System.out.println("Percorrendo as contantes ");
			 System.out.println(m + " " + m.titulo);
		 }
		 
		 andar(Medida.M, 100);
	}

}
