package operadores;

public class Operador1 {
	
	public static void main(String[] args) {
		//operador de multiplicacao
		double x = 7 * 4;
		System.out.println(x);
		
		//operador de adicao
		String y = "oi programador " + " Java";
		System.out.println(y);
		
		//operador modulo
		double m = 4 % 2;
		System.out.println(m);
		
		//operador Unario positivo
		double p = +2;
		System.out.println(p);
		
		//operador Unario negativo
		double pp = -2;
		System.out.println(pp);
		
		//operador Unario positivo
		double ppp = -(+2);
		System.out.println(ppp);
		
		
		
		// operadores de incremento e decrementok
		
		int xx = 6;
		int yy = ++ xx;//pre-incremento
		System.out.println("Antes   xx: " + xx);
		System.out.println("Depois  YY: " + yy);
		
		
		int po = 6;
		int pos = po++;//pos-incremento
		System.out.println("Antes    xx: " + po);
		System.out.println("Depois   YY: " + pos);
		
		
		int xxx = 6;
		int yyy = -- xxx;//pre-incremento
		System.out.println("Antes   xx: " + xxx);
		System.out.println("Depois  YY: " + yyy);
		
		
		int poo = 6;
		int poss = po--;//pos-incremento
		System.out.println("Antes    xx: " + poo);
		System.out.println("Depois   YY: " + poss);
	}

}
