package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(
			String[] args) {
		String[] strs = new String[23];
		strs[0]="eita";
		
		Object[] referencias = new Object[4];
		
		ContaCorrente cc = new ContaCorrente(23,88);
		ContaCorrente cc2=new ContaCorrente(18,20);
		ContaPoupanca cp=new ContaPoupanca(23,23);
		
		referencias[2]=cp;
		referencias[1]=cc2;
		referencias[0]=cc;
		
		Object refEx=referencias[0];
		
		ContaPoupanca refEx2 = (ContaPoupanca) referencias[2];
		
		Conta c = (Conta) referencias[1];
		Conta c2=(Conta) referencias[0];
		System.out
				.println(c.getAgencia());
		System.out
				.println(c2.getAgencia());
	}
}
