package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {
	public static void main(String[] args) {

		do {
			String nome = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();

			float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("altura: "));
			float imc = peso / (altura * altura);
			System.out.printf("%s Seu IMC ?: %.2f\n", nome, imc);
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);	




	}
}
