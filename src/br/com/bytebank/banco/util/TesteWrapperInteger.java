package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(
			String[] args) {
		
		List<Integer> listIntegers = new ArrayList<Integer>();
		
		List numeros = new ArrayList();
		numeros.add(87);
		
		List<Double> listDoubles = new ArrayList<Double>();
		
		Integer i = Integer.valueOf(89);
		System.out
				.println(i.compareTo(89));
		
		String s = args[0];
		System.out
				.println(Integer.valueOf(s));
		
		int n = Integer.parseInt(s);
		System.out
				.println(n);
		System.out
				.println(i.doubleValue());
		
		System.out
				.println(Integer.MAX_VALUE);
		System.out
				.println(Integer.MIN_VALUE);
		System.out
				.println(Integer.BYTES);
		System.out
				.println(Integer.SIZE);
		
		int tst = Integer.valueOf("23");
		System.out
				.println(tst);
		int tst2=Integer.parseInt("87");
		System.out
				.println(tst2);
	}
}