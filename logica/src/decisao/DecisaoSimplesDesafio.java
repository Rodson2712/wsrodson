package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	public static void main(String[] args) {
	
		// Capture o nome e a idade
		// De acordo com as leis eleitorais, apresente uma das mensagens abaixo
		// Seu voto é obrigatorio
		// Seu voto é facultativo
		// Voce não pode votar
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
		
		if(idade>= 18 && idade<70) {
			System.out.println(nome + ", seu voto é obrigatório.");
		}
		
		
		if(idade< 16) {
			System.out.println(nome + ", voce não pode votar.");
		}
		
		if(idade== 16 || idade==18 || idade>=70) {
			System.out.println(nome + ",seu voto é facultativo.");
		}
		
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	}
}
