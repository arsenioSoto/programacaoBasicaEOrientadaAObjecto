package orientacaoobjecto.heranca.animal;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha galo = new Galinha();
		galo.comida = "Farelo";
		galo.dormir();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		System.out.println(toto.equals(galo));
		System.out.println(toto.hashCode());
		System.out.println(toto.getClass());
		System.out.println(toto.toString());

	}

}
