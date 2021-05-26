package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {

	public static void main(String[] args) {
	
	
	//nome do produto, quantidade, valor unitario, 
		// exibir no final: Nome do produto, valor total, valor do imposto 17% sobre o total
	
	
		String produto = JOptionPane.showInputDialog("Produto:");
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:")); 
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor:"));

		float total = (valor * qtd);
		
		System.out.println("Nome do produto: " + produto);
		System.out.println("Valor Total: " + total);
		System.out.println("Valor Imposto: " + (total*0.17));
		
}
}
