package classeswrepars;

public class ClassesWrapperInvolocro {

	public static void main(String[] args) {
		
		Integer idade = new Integer(23);
		Double preco = new Double(12.32);
		double d = preco.doubleValue();
		int i = preco.intValue();
		//conversoes de valores usando as classes involocras
		
		char sexo = 'M';
		boolean casado = new Boolean("false");
		
		
		
		//conversao estatica
		
		double d1 = Double.parseDouble("123.23");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("23.12F");
		
		//metodos dentro da classe wrappers
		//valeuof permite a insersao e conversao de numeros decimal ou binario ocatl etc... 
		int i2 = Integer.valueOf("101011", 2);//
		System.out.println(i2);
		
	}
}
