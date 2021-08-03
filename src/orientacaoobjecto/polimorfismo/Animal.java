package orientacaoobjecto.polimorfismo;

public abstract class Animal {
	
	private int serial;
	double peso;
	String comida;
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	public Animal() {
		
	}
	
	void dormir() {
		System.out.println("Dorminiu");
	}
	abstract void fazerBarulho();

}
