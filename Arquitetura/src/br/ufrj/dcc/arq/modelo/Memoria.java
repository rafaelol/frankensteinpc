package br.ufrj.dcc.arq.modelo;

public class Memoria {
	public static final int TAM_MEM = 65536;
	public static final int LEIT = 0;
	public static final int ESC  = 0;
	
	private short mem[];
	private int id;
	private Bit sinal;
	
	public Memoria() {
		mem = new short[TAM_MEM];
		sinal = new Bit((short)LEIT);
		id = Uc.X;
		
		for(int i=0; i< mem.length; i++) mem[i] = 0;
	}
	
	public void setMemPos(int p, short v) {
		this.mem[p] = v;
	}
	
	public short getMemPos(int p) {
		return this.mem[p];
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bit getSinal() {
		return sinal;
	}

	public void setSinal(Bit sinal) {
		this.sinal = sinal;
	}

}
