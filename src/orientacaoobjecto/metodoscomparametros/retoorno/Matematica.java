package orientacaoobjecto.metodoscomparametros.retoorno;

public class Matematica {
	
	/**
	 * um
	 * dois
	 * return do maior dos dois numeros
	 *
	 * */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {
			return dois;
		}
	}
	
	/**
	 * metodo com retorno para soma dois numeros inseridos
	 * via parametro
	 * */
	double soma(double um, double dois) {
		return um + dois;
	}
	
	double mult(double um, double dois) {
		return um * dois;
	}
	
	String resto(double valor) {
		if(valor % 2 == 0) {
			return "Par";
		}else {
			return "Impar";
		}
	}
}
