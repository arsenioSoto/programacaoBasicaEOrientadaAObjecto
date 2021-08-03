package autoboxing;

public class AutoBoxing {
	
	public static void main(String[] args) {
		//antes para criar um tipo inteiro  e atribuir valores
		// e incrementar
		Integer x = new Integer(555);//empacotado
		int a = x.intValue();//desepacotando o valor
		a++;//ai sim podes incrementar
		x = new Integer(a);//rempacotar
		System.out.println(x.intValue());
		
		
		Integer y = 555;
		y++; //desempacota, incre,menta, reempacota
		System.out.println(y);
		
		//x.intValue();
		
		//antigamente se tivesse um boolean dentro de uma classe wrepaeer
		
		Boolean valor = new Boolean("true");
		if(valor) {
			System.out.println(valor);
		}
		
	}

}
