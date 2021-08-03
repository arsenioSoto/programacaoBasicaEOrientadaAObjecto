package orientacaoobjecto.metodoscomparametros.raizquadrada;

public class RaizQuadrada {
	
	
	//Equacao de pell
	// calculano a rai quadrada
	//Exemplo de funcionamanto equacao de pell
	//raz de 27
	//27 menos o primeiro numero impar 27-1 =26
	//26-3 = 23, 23-5=18, 18-7=11, 11-9=2;
	// o ultimo numero sera 2-13 visto que nao restara nada
	//assumimos que raiz de 27 e igual a 5, porque fizemos ate 
	//cinco subtracoes
	
	
	int raiz(int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2; //proximo numero impar
			++raiz;
		}
		
		return raiz;
	}

}
