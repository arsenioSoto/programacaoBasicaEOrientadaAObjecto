import java.util.Iterator;

public class StringToken {

	public static void main(String[] args) {
		//String s = "XHTML; CSS; JAvaScrip; jquery; java";
		
		
		
		String s = "Venha trabalha na universiodade";
								//; , '' qualquer coisa caracter string etc...
		String[] tokens =s.split(" ");//ira imprimir de acordo com o separador ; arrays
		System.out.println(tokens.length + "tokens ");
		for(String token : tokens) {
			System.out.println(token);
		}
	}
}
