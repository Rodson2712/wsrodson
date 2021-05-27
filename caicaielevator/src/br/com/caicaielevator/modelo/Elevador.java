package br.com.caicaielevator.modelo;

public class Elevador {

	private String nome;
	private String resumo;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;
	
	public void entrar(int qtde) {
		int resultado = qtdePessoas + qtde;
		if(resultado<=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}
	
	public void sair(int qtde) {
		int resultado = qtdePessoas - qtde;
		if(resultado>0) {
			qtdePessoas-=qtde;
		}
	}
	
	public void sair() {
		if(qtdePessoas>0) {
			qtdePessoas--;
		}
	}
	
	public String subir() {
		if(andarAtual==andarMaximo) {
			return "Já está no ultimo andar";
		}else
		andarAtual++;
			return "Subindo";
	}
	
	public String descer() {
		if(andarAtual==andarMinimo) {
			return "Já está no andar minimo";
		}else
		andarAtual--;
			return "Descendo";
	}
	
	public String retornarResumo() {
		return
				"Nome.................: " + nome + "\n" +
				"Andar................: " + andarAtual + "\n" +
				"Quantidade de pessoas: " + qtdePessoas;
	}
	
	public void inicializar(int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas= pCapPessoas;
	}
	public void preencherNome(String param) {
		nome=param;
	}
	public String retornarNome() {
		return nome;
	}
}
