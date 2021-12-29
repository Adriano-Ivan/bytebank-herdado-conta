package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(
			String[] args) {
		System.out
				.println();
		System.out
				.println(38);
		System.out
				.println("EITA");
		System.out
				.println(false);
		
		ContaCorrente cc = new ContaCorrente(234,2883);
		ContaPoupanca cp = new ContaPoupanca(23,232);
		
		System.out
				.println(cc+" "+ cp);
	}
	
	static void println() {
		
	}
	static void println(Integer i) {
		
	}
	static void println(Boolean b) {
		
	}
	static void println(String s) {
		
	}
	static void println(Object o) {
		System.out
				.println(o);
	}
}
