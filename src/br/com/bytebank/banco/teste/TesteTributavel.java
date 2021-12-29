package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.AcaoBolsa;
import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(
			String[] args) {
		CalculadorImposto ci=new CalculadorImposto();
		
		ContaCorrente cc = new ContaCorrente(1234,12345899);
		AcaoBolsa ab = new AcaoBolsa();
		SeguroDeVida sdv= new SeguroDeVida();
		
		cc.deposita(80);
		ab.opera(87);
		sdv.opera(90);
		
		ci.registra(cc);
		ci.registra(ab);
		ci.registra(sdv);
	}
}
