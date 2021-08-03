package tiposprimitivos;
/**
 *Apresentado os Conceitos dos tipos Primitivos 
 * @autor Arsenio Jose Soto Junior
 * Ano 01-01-2021
 */
public class TiposPrimitivos {
	//dado primitivo e um valor
	//int, byte, short
	//long float double
	//char void boolean
	
	public static void main (String[] args) {
		
		int idade = 21;
		double preco = 12.23;
		char sexo = 'M';
		boolean casado = false;
		
		byte b = 127; //suporta ate 127 nao ultrapassa
		short s = 32_68; //suporta ate 
		int i =  2_000_000_000; //podemos representar 32 bits de espacos 2bilhoes
		long l = 9_000_000_000_000_000_000L; //podemos representar ate 9quitilhoes
		
		double d = 1.7976931348623157E+308; //pdrao define IEEE 754
		float f = 123F;
		//Nota: todos esses numeros serao convertidos para o sistema binario
		//entao tambem podemos representar os numeros acima em sistema binario
		//exemplo
		byte bb = 0b01010101; //8bits de informacao ou 1 byte
		short ss = 0b0101010101010101;//16 bits 2byte
		int ii = 0b01010101010101010101010101010101;
		
		//podemos colocar valores dentro de um tipo se for maior que o outro exemplo:
		//um inteiro pode entrar em um double
		
		i = s;
		System.out.println(i);//chamado de cast implicito
		
		//Nota somente e possivel convereter se usarmo o typeCaste
		i = (int) l; //Cast explicito
		System.out.println(i);		
		System.out.println(bb);
		System.out.println(l);
	}

}
