package fluxocondicional;

public class For {
	
	public static void main(String[] args) {
		
		String texto =" ";
		//for(int i = 10; i>0; i--){texto +=1 + " , "} decrementado
		for(int i = 0; i<10; i++) {
			texto += i + " , ";
		}
		System.out.println("Contador " + texto);
	}

}
