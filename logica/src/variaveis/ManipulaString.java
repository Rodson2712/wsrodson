package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "Rodson.meNdeS1@gmail.Com";
		
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiusculo:" + email.toUpperCase()); 
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posicao do arroba: " + email.indexOf("@"));
		System.out.println("Quantidade de caracteres: " + email.length());
		System.out.println("Mostrar do segunda ao quinto caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usuario do email: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Servidor de email: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
		System.out.println("Primeiro Caracter: " + email.charAt(0));
	
		
		
	
		
		
		
		
	}
}
