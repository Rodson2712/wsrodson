package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//Solicite o nome do cliente e o email, pergunte a ele se deseja adicionar
		// itens para sua compra, e enquanto ele responder que sim, pe�a:
		// nome do produto, valor e qtde. 
		// Exiba para cada produto o total de cada um.
		// Quando terminar de adicionar produtos exiba no final o total da conta.
		
		String nomeuser = JOptionPane.showInputDialog("Digite o seu nome: ").toUpperCase();
		String email = JOptionPane.showInputDialog("Digite o seu email: ").toLowerCase();
	
		
		float total = 0;
		float valoritem = 0;
		String produto = " ";
		double quantidade = 0;
		
		
		System.out.println("Nome do cliente: " + nomeuser);
		System.out.println("Email do cliente: " + email);
		
		do {
			produto = JOptionPane.showInputDialog("Digite o produto: ").toUpperCase();
			
			valoritem = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: "));
			
			quantidade = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade: "));
			
			System.out.println("Qtd: " + quantidade + " Item: " + produto + " - " + "Valor unitario: " + valoritem + " Valor: " + (valoritem * quantidade));

			total = (float) (total + (valoritem * quantidade));
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar item?", "Continuar", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("Total de sua compra: " + total);
		
		
		
		
		
		
		
		
		
		
	}
	
}
