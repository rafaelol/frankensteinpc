package br.ufrj.dcc.arq.modelo;

/**
 * Classe que contem os Registradores da Arquitetura
 */

public class Registrador {
	public short r0;
	public short r1;
	public short r2;
	public short r3;
	public short r4;
	public short rx;
	public short ry;
	public short pc;
	public short rdados;
	public short rend;
	public short ri;

	private Bit sinal;
	
	public Registrador(int c) {
		this.sinal = new Bit((short)0);
	}
	
	public Registrador() {
		r0 = r1 = r2 = r3 = r4 = rx = ry = pc = rdados = rend = ri = 0;
	}
	
	public Bit getSinal() {
		return this.sinal;
	}

	public void setSinal(Bit sinal) {
		this.sinal = sinal;
	}
	
}
