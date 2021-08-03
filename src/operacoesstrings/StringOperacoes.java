package operacoesstrings;

public class StringOperacoes {
	
	public static void main(String[] args) {
		
		
		//maneiras de inicializar uma string
		String s1 = "Escreva";
		String s2 = s1 + "Run Anywhere";
		
		String s3 = new String ("Java Virtual Machine");
		
		char[] array = {'J','A','V','A'};
		String s4 = new String(array);
		
		//operacoers basicas
		//length vai retornar o numero de carracter de uma string
		
		int tamanho = s1.length();
		//localizar o numero de umd determinado cararactyer dentro de uma string
		//o objecto . metodo \char at(posicao do caracater)
		char letra = s1.charAt(0);
		
		//metodo que retorna a representacao0 do proprio texto
		String texto = s1.toString();
		
		//metodod index of retorna a posicao onde esta localizadom o caracter e ou styring dentro do meu texto
		//exempo java vrtua machine quero retornar oindice j
		
		int posicao = s3.indexOf("Virtual");// vai trazer a posicao onde incicia a palavra
		
		//encontar a ultima ocorrencia
		int car = s3.lastIndexOf('a');
		
		//metodo para retornar se esta vazio ou nao
		
		boolean vazia = s3.isEmpty();
		
		//metodos de comparacao de strings
		
		String var = "XTI";
		
		boolean x = var.equals("XTI"); //equals metodo para comparar objectos
		
		System.out.println(x);
		//independetimente se escreve em maiusculo ou minusculo
		boolean xx = var.equalsIgnoreCase("xti");
		System.out.println(xx);
		//para saber se o testo inicia com as duas ou mais primeiras letras
		boolean xxx = var.startsWith("XT");
		System.out.println(xxx);
		
		//sabendo se uma string e maior ou menor doque outra
		
		int c ="amor".compareTo("bola");// tipo a <> b logo retorna um numero menor doque 0 -1
		int cc = "bola".compareTo("amor"); //maior doque 0
		System.out.println(c);
		System.out.println(cc);
		
		String so = "Olhe, olhe";
		//                         //true ignora letyras maiusculas ou minusculas
		boolean o = so.regionMatches(6, "Olhe", 0, 4);
		System.out.println(o); 
		
		//metodos de extracao de dados dentro de uma string
		
		String l = "Mocambique e Lindo";//pegando os caracteres restantes a partir do numero informado por parametro
		String sl = l.substring(11);
		
		//metodo sobreCaregados de substrings
		String sll = l.substring(2, 8);
		System.out.println(sll);//pegando somente oque estiver dentro de paramentros ou seja o pedaco que inicia da posicao 2 ate aposicao 8
		
		//operacoes de modificacao de strings
		
		//concatenar uma string ou seja juntar
		
		String ss = l.concat(" que Maravilha");
		System.out.println(ss);
		
		//trocando expressoes dentro de uma astrinmg
		
		sl = l.replace('e', 'i');
		
		//trocando o primeiro espaco em branco
		sl = l.replaceFirst(" " , "X");
		//para trocar todos os espacos poer X
		sl = l.replaceAll(" ", " X ");
		
		//metodo responsavel por colocar todo texto em maiusculos
		
		sl = l.toUpperCase();//nao recebe parametro
		//para colocar em minusculos
		sl = l.toLowerCase();
		
		//metodo que lim[pa os espacos e, branco antes e depois
		
		System.out.println(" Arsenio ".trim());
	}

}
