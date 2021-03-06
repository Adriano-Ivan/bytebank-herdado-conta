
package br.com.bytebank.banco.modelo;

import java.io.Serializable;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{

	private double acumuladorTributo;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		if(valor > 0) {
	        super.saldo += valor;
	        this.acumuladorTributo=20;
		}
    }

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.acumuladorTributo;
	}
	
	@Override
	public String toString() {
		return super.toString().replace("TIPO", "Conta Corrente");
		
	}
}
