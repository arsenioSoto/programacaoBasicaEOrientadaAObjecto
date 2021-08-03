package orientacaoobjecto.sobrecargademetodos;

public class Media {
	
	//metodos com o mesmo nome e fazem amesma operacao com 
	//parametros diferentes chama se sobrecarga de metodos
	
	double media(int x, int y) {
		return (x+y)/2;
	}
	
	double media(String x, String y) {
		int ix =Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy)/2;
	}
	
	double soma(double ...numeros) {
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	//metodos que recebe numeros ilimitados via parametros
	
	double media (double ... numeros) {
		return this.soma(numeros)/numeros.length; 
	}

}
