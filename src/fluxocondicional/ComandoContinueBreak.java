package fluxocondicional;

public class ComandoContinueBreak {
	
	public static void main(String[] args) {
		//estruturas auxiliares
		//Break-> encerea um loop inteiro
		//Continue -> encerrra a condicao actual
		//Rotulos-> serbem para voce indicar em qual loop voce que parar ou continuar
		//    true
		//wile
		for(int i=0; i<10; i++) {
			//System.out.println("Entrou");
			//break;
			
			if(i ==5) {
				//break;		//para somente se i for igual a 5
				continue; // ira pular para o proximo numero 6
			
			}
			System.out.println(i);
		}
	}

}
