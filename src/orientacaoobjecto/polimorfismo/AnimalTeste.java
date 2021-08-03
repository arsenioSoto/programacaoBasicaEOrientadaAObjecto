package orientacaoobjecto.polimorfismo;

public class AnimalTeste {

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void barulhoSemPolimorfismo(String string) {
		if(string.equals("Cachorro")) {
			System.out.println("Au, au");
		}else if(string.equals("Galinha")){
			System.out.println("Co, Co");
		}
	}
	
	public static void main(String[] args) {
		//
		//Animal generico = new Animal(0, null);
		
		//Cachorro toto = new Cachorro();
	
		Galinha galo = new Galinha();
	
		
		//generico.fazerBarulho();
		//toto.fazerBariho();
		//galo.fazerBariho();
		
		//barulho(toto);
		//barulho(galo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}

}
