package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

public static void main(String[] args) {
	
	//Miss?o1 =  O Jogador 1 digita um numero inteiro, a partir dai o jogador 2 deve adivinhar o numero
	//Somente quando ele acertar devera aparecer a msg Parabens, voce acertou!
	
	//Miss?o2 = Acrescente dica para o Jogador 2 informando se o numero que ele deve adivinhar ? maior ou menor 
	
	//acrescente um contador de tentativas e mostre no final ao jogador 2 quando ele 
	//acertar. parabens voce acertou ap?s X tentativas
	//terao que criar uma variavel para contar

	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n?mero: "));
	int num2 = 0;
	int cont = 0;
	do {
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n?mero: "));
		cont = cont+1;
		if(num2>num1) {
			JOptionPane.showMessageDialog(null, "Chute um numero menor....");
		}
		if(num2<num1) {
			JOptionPane.showMessageDialog(null, "Chute um numero maior....");
		}
		
	}while(num2!= num1);
	
	if(num2==num1) {
		JOptionPane.showMessageDialog(null, "Parabens, Voce acertou apos " + cont + " tentaivas.");
	}
	
	
	
}
}
