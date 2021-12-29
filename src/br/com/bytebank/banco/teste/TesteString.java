package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(
			String[] args) {
		String nome = "Adriano Ivan";//literal object
		
		//String outra = nome.toLowerCase().replace("a", "T");
//		String outra = nome.toLowerCase();
//		System.out
//				.println(outra);
//		
//		System.out
//				.println(outra.replace('a', 'A'));
//		System.out
//				.println(outra.replace("ano", "ANO"));
//		System.out
//				.println(nome.indexOf("dri"));
//		System.out
//				.println(nome.charAt(2));
		
//		System.out
//				.println(nome.substring(0,5));
//		
//		System.err
//				.println(nome.isEmpty());
//		System.out
//				.println(nome.length());
//		
//		System.out
//				.println("".isEmpty());
//		System.out
//				.println(" ".trim().isEmpty());
//		System.out
//				.println(nome.contains("ian"));
//		for(int i = 0; i<nome.length();i++) {
//			System.out
//					.println(nome.charAt(i));
//		}
		StringBuilder cs = new StringBuilder("Testando");
		cs.append(" concatenação ");
		cs.append("de");
		cs.append(" strings");
		cs.append(".");
		System.out
				.println(cs);
	}
}
