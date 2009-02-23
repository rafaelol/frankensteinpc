package br.ufrj.dcc.arq.modelo;

public class Memoria {
	public static final int TAM_MEM = 65536;
	public static final int LEIT = 0;
	public static final int ESC  = 1;
	
	public static final int QTD_SINAIS = 1;

	public static final int X = 0;
	
	public static short dadoLido;
	
	private short mem[];
	private Bit sinal;
	
	/** ======================================= */
	
	public Memoria() {
		mem = new short[TAM_MEM];
		sinal = new Bit((short)LEIT);
		
		for(int i=0; i< mem.length; i++) mem[i] = 0;
	}

	/** ======================================= */

	public void setMemPos(int p, short v) {
		this.mem[p] = v;
	}
	
	public short getMemPos(int p) {
		return this.mem[p];
	}
	
	public Bit getSinal() {
		return sinal;
	}

	public void setSinal(Bit sinal) {
		this.sinal = sinal;
	}

	/** ======================================= */

	public void escreve() {
		this.mem[Registrador.rend] = Registrador.rdados;
	}
	
	public void le() {
		dadoLido = this.mem[Registrador.rend];
	}
	
	public void opera() {
		this.sinal = Uc.sinais[Uc.X];
		
		if(sinal.getValor() == ESC) {
			this.escreve();
		}
		else if (sinal.getValor() == LEIT) {
			this.le();
		}
	}
}
