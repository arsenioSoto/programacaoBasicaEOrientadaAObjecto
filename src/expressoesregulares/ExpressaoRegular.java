package expressoesregulares;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		//espressoes regulares ao pafdreos de pesqyisas e usamos para
		//validar espressoes dentro de textos
		
		String padrao= "java";
		String texto = "java";
		
		boolean b = texto.matches(padrao);
		System.out.println(b);
		
		//ou podemos
		boolean a = "java".matches("java");
		System.out.println(a);
		
		//usando modificadores para expressoes regulares
		// ?i ignora minus e maiusc
		
		b = "java".matches("(?i)JAVA");
		System.out.println(b);
		
		// ocorrencia de um caracter qualquer usamos
		b = "@".matches(".");
		System.out.println(b);

	}

}
