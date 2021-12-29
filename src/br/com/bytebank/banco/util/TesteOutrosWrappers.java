package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(
			String[] args) {
		
		Double d =Double.valueOf(88);
		Character c = Character.valueOf('d');
		
		System.out
				.println(d.doubleValue());
		System.out
				.println(d.intValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out
				.println(bRef.booleanValue());
		
		Number numero = Integer.valueOf(87);
		System.out
				.println(numero);
		
		Number n2=Double.valueOf(879);
		
		List<Number> numeros = new ArrayList<>();
		
		numeros.add(87);
		numeros.add(87.23);
		numeros.add(23.23f);
		numeros.add(8382378);
		
		System.out
				.println("----------");
		for(Number n:numeros) {
			System.out
					.println(n);
		}
	}
}
