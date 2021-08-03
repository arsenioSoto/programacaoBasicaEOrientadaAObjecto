package fluxocondicional;

public class Idade {
	
	public static void main(String[] args) {
		
		int idade = 20;
		if(idade <= 18) {
			System.out.println("crianca");
		}else if(idade >11 && idade <= 18){
			System.out.println("Adolescente");
		}else if (idade > 18 && idade <= 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Melhor idade");
		}
	}

}
