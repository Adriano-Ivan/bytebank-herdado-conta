package br.com.bytebank.banco.modelo;
public class SeguroDeVida implements Tributavel {

	private double saldo;
	private double acumuladorTributo;
	
	public void opera(double valor) {
		if(valor > 0) {
	        saldo += valor;
	        acumuladorTributo=20;
		}
    }
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.acumuladorTributo;
	}

}
