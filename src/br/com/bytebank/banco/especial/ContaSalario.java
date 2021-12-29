package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaSalario
		extends Conta {

	public ContaSalario(int agencia,int numero) {
		super(agencia,numero);
	}
	@Override
	public void deposita(double valor) {
		super.saldo=valor;

	}

}
