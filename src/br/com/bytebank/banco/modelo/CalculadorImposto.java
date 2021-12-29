package br.com.bytebank.banco.modelo;
public class CalculadorImposto {

	private double acumulador;
	
	public void registra(Tributavel t) {
		this.acumulador+=t.getValorImposto();
		System.out
				.println("TOTAL: "+this.acumulador);
	}
}
