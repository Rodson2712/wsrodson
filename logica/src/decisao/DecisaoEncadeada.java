package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas: "));

		if (faltas>20){
			System.out.println("Reprovado pro falta!!!!");
		}else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
			float media = (nota1 + nota2) /2;

			if(media>= 6) {
				System.out.println("Parab�ns!!!!!");
			}

			else if(media< 4) {
				System.out.println("Reprovado!!!!!");
			}

			else {
				System.out.println("Recupera��o!!!!!");
			}

			System.out.println("Sua nota de media para a disciplina " + disciplina + " foi: " + media);
		}










	}
}
