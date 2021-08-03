package orientacaoobjecto.polimorfismo.matematica;

public class OperacaoTeste {

	public static void calcule(OperacaoMatematica o, double x, double y) {
			 System.out.println(o.calcular(x, y));
	}
	
	public static void calculeSemPolimorfismo(OperacaoMatematica o, double x, double y) {
		if(o.equals("Soma")) {
			System.out.println(x+y);
		} else if(o.equals("Multiplicacao")) {
			System.out.println(x*y);
		}
		
		System.out.println(o.calcular(x, y));
}
	
	public static void main(String[] args) {
		
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
		
		calculeSemPolimorfismo(new Soma(), 2, 5);
		calculeSemPolimorfismo(new Multiplicacao(), 2, 5);
	}

}
