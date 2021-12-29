package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeObjetos;

public class TesteGuardadorDeReferencias {

	public static void main(
			String[] args) {
		GuardadorDeObjetos go = new GuardadorDeObjetos();
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(23,38);
		guardador.adicionar(cc);
		go.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(29,31);
		guardador.adicionar(cc2);
		go.adicionar(cc2);
		
		Cliente cl= new Cliente();
		cl.setNome("Hans");
		go.adicionar(cl);
		
		int tamanho = guardador.getTamanhoDoArray();
		
		Cliente refCl = (Cliente) go.getElement(2);
		
		System.out
				.println(refCl.getNome());
		
		System.out
				.println(tamanho);
		
		Conta ref = guardador.getElement(0);
		System.out
				.println(ref.getNumero());
	}
}
