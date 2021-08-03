package interfacegrafica;

import javax.swing.JOptionPane;

public class InterfaceGrafica {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		System.out.println(nome);//mostra na console
		JOptionPane.showMessageDialog(null, nome);//mostra numa outra janela
		
	}

}
