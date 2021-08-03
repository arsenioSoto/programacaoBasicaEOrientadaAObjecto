package orientacaoobjecto.heranca.animal;

public class Animal {
	
	private int serial;
	double peso;
	String comida;
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir() {
		System.out.println("Dorminiu");
	}
	void fazerBarulho() {
		System.out.println("Fazer barrulho! ");
	}

}
