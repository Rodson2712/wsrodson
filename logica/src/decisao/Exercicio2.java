package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// * Exercicio 2:
		// * Considere receber a quantidade de di?rias de um hotel e o valor
		 //* da di?ria. Sobre a di?ria haver? uma taxa que depende da quantidade
		// * de di?rias.
		// * Se a quantidade de di?rias for maior que 10 a taxa ser? de 5%
		// * Se a quantidade estiver entre 5 e 10 a taxa ser? de 8%
		// * Se a quantidade de diarias for menor que 5 a taxa ser? de 10%
		// * Exiba o valor final.
		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Quantas diarias:"));
		float valordiaria = Float.parseFloat(JOptionPane.showInputDialog("Valor da diaria:"));
		
		if(diarias > 10) {
			float taxa = (float) 0.05;
			System.out.println("Taxa ser?: " + taxa);
			System.out.println("Valor final: " + (valordiaria*diarias)*taxa+(valordiaria*diarias));
		}
		else if(diarias >=5 && diarias<=10) {
			float taxa = (float) 0.08;
			System.out.println("Taxa ser?: " + taxa);
			System.out.println("Valor final: " + (valordiaria*diarias)*taxa+(valordiaria*diarias));
		}
		else if(diarias < 5) {
			float taxa = (float) 0.10;
			System.out.println("Taxa ser?: " + taxa);
			System.out.println("Valor final: " + (valordiaria*diarias)*taxa+(valordiaria*diarias));
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
