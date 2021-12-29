package br.com.bytebank.banco.teste;

import java.lang.*;
import br.com.bytebank.banco.especial.ContaSalario;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
	public static void main(String[] args) {
		ContaSalario cs = new ContaSalario(123,328);
		//cs.saldo;
		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.00);
		
		try {
			cc.transfere(10.00,cp);
		} catch(SaldoInsuficienteException e) {
			System.out
					.println(e.getMessage());
		}
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
