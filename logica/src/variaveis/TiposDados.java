 package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// Chave de igni??o --- Start de toda app java
	public static void main(String[] args) {
	
		// Sitaxe para criar variavel: <Tipo> <Nome> = <Dado>;
		//
		//
		//Alfanumerico: Texto, parte de texto, ou numero que nao sera utilizado em operacao matematica
		//
		//Numerico: Dado que pode ser utilizado em operacao matematica ou ? critico
		//
		//- int => Numeros inteiros
		//- double => Numeros com casas decimais
		//
		String nome = JOptionPane.showInputDialog("Digite o seu nome:"); 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")); 
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:")); 
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:")); 
		double imc = peso / (altura * altura);
		System.out.println("Nome..: "+nome);
		System.out.println("Idade.: "+idade);
		System.out.println("Altura: "+altura + "cm");
		System.out.println("Peso: "+peso + "kg");
		System.out.println("Seu IMC ?: "+imc);
		
		
		
		
		
		
		
		
		
}
}
