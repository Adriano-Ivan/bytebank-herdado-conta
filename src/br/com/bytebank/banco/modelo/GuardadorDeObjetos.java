package br.com.bytebank.banco.modelo;

public class GuardadorDeObjetos {

	private Object[] referencias;
	private Integer posicaoLivre;
	
	public GuardadorDeObjetos() {
		this.referencias=new Object[10];
		this.posicaoLivre=0;
	}
	public void adicionar(Object ref) {
		this.referencias[this.posicaoLivre++]=ref;
	}

	public int getTamanhoDoArray() {
		return this.posicaoLivre;
	}

	public Object getElement(int pos) {
		if(pos <= this.posicaoLivre && pos >=0) {
			return this.referencias[pos];
		}
		return null;
	}
}
