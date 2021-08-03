package fluxocondicional;
//Criando contador com arrays list, usando metodod add e estruturas condicionais para verificar as condicoes.
import java.util.ArrayList;

public class ForeachContinuacao {
	
	public static void main(String[] args) {
		
		
		//aprendendo foreach
		//criamos uma novo objecto do tipo ArraysList inteiro
		// e inserimos valores dentro do objecto criado\
		//com o metodo add do arraysList
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<10; i++) {
			list.add(i);
		}
		
		//usando for aprimorado para imprimir os dados inseridos
		for(Integer numero: list) {
			System.out.println(numero);
		}
		
	}

}
