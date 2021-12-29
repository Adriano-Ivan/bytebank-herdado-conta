package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private Integer posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias=new Conta[10];
		this.posicaoLivre=0;
	}
	
	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre++]=ref;
	}

	public int getTamanhoDoArray() {
		return this.posicaoLivre;
	}

	public Conta getElement(int pos) {
		if(pos <= this.posicaoLivre && pos >=0) {
			return this.referencias[pos];
		}
		return null;
	}
}
