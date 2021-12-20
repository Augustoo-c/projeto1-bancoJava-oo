package br.com.bytebank.banco.teste;

public class TestaString {
	public static void main (String[] args) {
		String nome = "Alura";
		String outro = new String("Alura");
		
		
		//String novo = nome.replace('A', 'a');
		String novo = nome.toUpperCase();
		novo = nome.toLowerCase();
		System.out.println(nome);
		System.out.println(novo);
		
		for(int i=0; i < nome.length();i++) {
			System.out.println(nome.charAt(i));
			
		}
	}

}
