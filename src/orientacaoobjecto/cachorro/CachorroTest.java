package orientacaoobjecto.cachorro;

public class CachorroTest {
	
	public static void main(String[] args) {
		
		Cachorro pitbul = new Cachorro();
		pitbul.raca = "Pit Bull";
		pitbul.tamanho = 40;
		pitbul.latir();
		
		Cachorro viralata = new Cachorro();
		viralata.raca = "Vira Lata";
		viralata.tamanho = 30;
		viralata.latir();
		
		//criamos doobjectos usando uma unica classe
		//criamos duas instancia cachoros apartir da classe Cachorro
	}

}
