package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//* Exercicio 3:
			// * Receba o valor do sal?rio bruto, o nome de um colaborador e 
			// * a qtde de faltas.
			// * Se n?o houver faltas o salario bruto receber? um aumento de 2%.
			// * Calcule o valor do INSS sobre o sal?rio bruto.
			// * Exiba no final o sal?rio bruto, e o sal?rio liquido (retirando
			// * o INSS e 8% do FGTS)
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Valor do salario bruto: "));
		double faltas = Double.parseDouble(JOptionPane.showInputDialog("Quantas faltas: "));
		if (faltas==0) {
			salario = salario * (float) 0.02 + salario;
			System.out.println("Salario bruto com assiduidade: " + salario);
		}	
		if (salario<=1.100) {
			float liquido = salario - (salario * (float) 0.075) - (salario * (float) 0.08) ;
			System.out.println("Salario liquido: " + liquido);
		}else if (salario>=6.400){
			float liquido = salario - (salario * (float) 0.17) - (salario * (float) 0.08) ;
			System.out.println("Salario liquido: " + liquido);
		}else if(salario>1.100 && salario<2.200) {
			float liquido = salario - (salario * (float) 0.12) - (salario * (float) 0.08) ;
			System.out.println("Salario liquido: " + liquido);
		}else {
			float liquido = salario - (salario * (float) 0.14) - (salario * (float) 0.08) ;
			System.out.println("Salario liquido: " + liquido);
		}
		
		
		
	}
	
}
