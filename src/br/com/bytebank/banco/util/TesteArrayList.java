package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(
			String[] args) {
		
		//List arrEx = new ArrayList(26);
		
		List<Conta> arr = new ArrayList<>();
		
		Conta cc = new ContaCorrente(23,38);
		arr.add(cc);
		
		Conta cc2 = new ContaCorrente(29,31);
		arr.add(cc2);
		
		Conta cc3 = new ContaCorrente(32,11);
		arr.add(cc3);
		
		System.out
				.println(arr.size());
		
		System.out
				.println(arr.get(0));
		
		arr.remove(2);
		System.out
				.println(arr.size());
		
		Conta cc4 = new ContaCorrente(30,18);
		arr.add(cc4);
		
		System.out
				.println("\n*---------*--------*-------*");
		for(Conta c:arr) {
			System.out
					.println(c);
		}
		
		
		//List arrEx2 = new ArrayList(arr);
	}
}
