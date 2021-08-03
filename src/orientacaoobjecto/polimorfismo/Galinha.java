package orientacaoobjecto.polimorfismo;

public class Galinha extends Animal{
	
	public Galinha() {
		super(12, "Far");
		
	}

	@Override
	void fazerBarulho() {
		// TODO Auto-generated method stub
		System.out.println("Co, Co, Rhogoo!");
	}

}
