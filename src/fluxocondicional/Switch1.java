package fluxocondicional;
//switc compara ate encontar o valor insierido, para somnte quando encontra o valor selecionadao
public class Switch1 {
	
	public static void main(String[] args) {
		
		String tecnologia = "Mysql";
		switch(tecnologia) {
		
		case "Java":
		case "C++":
		case "cobol":
			System.out.println("Linguagem de programacao");
			break;
		case "Oracle":
		case "sqlServer":
		case "postgreal":
		case "Mysql":
			System.out.println("Banco de dados");
			break;
		default:
			System.out.println("Tecnologia desconhecida");
			
		}
	}

}
