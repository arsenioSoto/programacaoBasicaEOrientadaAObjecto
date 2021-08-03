package fluxocondicional;

public class Switch {
	
	public static void main(String[] args) {
		
		
		char sexo = 'M';
		
		switch(sexo) {
		case 'M':
			System.out.println("Masculino");
			break;
		case 'F':
			System.out.println("Feminino");
			break;
			default:
				System.out.println("Nao existe");
			
		}
		
		System.out.println("Terminei ");
	}

}
