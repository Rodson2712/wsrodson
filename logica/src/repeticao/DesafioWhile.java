package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
public static void main(String[] args) {
	///capture separadamente dia, mes e ano
	///para o dia somente quantidade de acordo com o mes (lembrar fev = max 29 dias
	///para mes, somnte valor entre 1 e 12
	///pra ano somente entre 2003 e 1920
	///no final exibir data completa
	
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano entre 1920 e 2003: "));
	while(ano<1920 || ano>2003) {
		ano =  Integer.parseInt(JOptionPane.showInputDialog("Digite um ano valido: "));
	}
	
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um Mes entre 1 e 12: "));
	while(mes<1 || mes>12) {
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes valido: "));
	}
	
	int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
	
	if(mes== 4 || mes==6 || mes==9 || mes==11) {
		while(dia<1 || dia>30) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia valido para este mes: "));
		}
	}
	
	if(mes== 2) {
		while(dia<1 || dia>29) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia valido para este mes: "));
		}
	}else {
		while(dia<1 || dia>31) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia valido para este mes: "));
		}
	}
	System.out.println("Data: " + ano + '/' + mes + '/' + dia);

	
	
	
}
}
