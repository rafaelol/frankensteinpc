package br.ufrj.dcc.arq.modelo;

public class Registrador {
	public static short r0;
	public static short r1;
	public static short r2;
	public static short r3;
	public static short r4;
	public static short rx;
	public static short ry;
	public static short pc;
	public static short rdados;
	public static short rend;
	public static short ri;

	private int id;
	private Bit sinal;
	
	public Registrador(int c) {
		this.id = c;
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
			
}
