package orientacaoobjecto.interfaces;
//interface determina como os sistema iara funcionar entre els
//exemplo, na radio usam se botoes, controlo de voz, mudar estacao,
//
public class Quadrado implements AreaCalculavel {

	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		
		return lado * lado;
	}

}
