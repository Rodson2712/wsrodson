package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Pedir para o user digitar numero da tabuada que ele deseja ver
		//Monte o la�o para que apresente o resultado da seguinte forma:
		//Numero X 0 = resultado
		//Numero X 1 = resultado
		//Numero X 100 = resultado
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int cont = 0;
		System.out.println(num1 + " X " + cont + " = " + cont);
		do {
			
			cont = cont+1;
			
			System.out.println(num1 + " X " + cont + " = " + (num1 * cont));
			
		}while(cont==0 || cont<100);
		
		
		
		
		
		
		
		
	}
	
}
