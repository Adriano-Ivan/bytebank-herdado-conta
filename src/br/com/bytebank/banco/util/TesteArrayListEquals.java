package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(
			String[] args) {
		
		//List arrEx = new ArrayList(26);

		List<Conta> arr = new LinkedList<>();
		
		Conta cc = new ContaCorrente(23,38);
		arr.add(cc);
		
		Conta cc2 = new ContaCorrente(29,31);
		arr.add(cc2);
	
		Conta cc3 = new ContaCorrente(29,31);
		
		boolean existe = arr.contains(cc3);
		System.out
				.println("Arr contém cc3: "+existe);
		
//		for(Conta c:arr) {
//			System.out
//					.println(c);
//		}
		
		
		//List arrEx2 = new ArrayList(arr);
	}
}
