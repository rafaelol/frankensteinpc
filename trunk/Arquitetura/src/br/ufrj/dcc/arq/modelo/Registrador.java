package br.ufrj.dcc.arq.modelo;

public class Registrador {
	
	public static final int PALAVRA_DADOS = 16;

	private int id;
	private short dado;
	private Bit sinal;
	
	public Registrador(int c) {
		this.id = c;
		this.dado = 0;
		this.sinal = new Bit((short)0);
	}
	
	public Bit getSinal() {
		return this.sinal;
	}

	public void setSinal(Bit sinal) {
		this.sinal = sinal;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public short getDado() {
		return this.dado;
	}
	
	public void setDado(short dado) {
		this.dado = dado;
	}
			
}
