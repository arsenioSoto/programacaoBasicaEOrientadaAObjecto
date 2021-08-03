package orientacaoobjecto.sobrecargademetodos;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m = new Media();
		double md = m.media(10, 10);
		double mds = m.media("12", "10");
		
		double mdm = m.media(10, 9, 80, 9, 2, 20);
		
		System.out.println("Quaisquer Argumentos  " + mdm);
		System.out.println("Em string " + mds);
		System.out.println("A media eh " + md);

	}

}
