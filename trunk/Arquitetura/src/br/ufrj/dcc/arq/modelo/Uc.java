package br.ufrj.dcc.arq.modelo;

public class Uc {
	public static final int A = 0;
	public static final int B = 1;
	public static final int C = 2;
	public static final int D = 3;
	public static final int E = 4;
	public static final int F = 5;
	public static final int G = 6;
	public static final int H = 7;
	public static final int I = 8;
	public static final int J = 9;
	public static final int K = 10;
	public static final int L = 11;
	public static final int M = 12;
	public static final int N = 13;
	public static final int O = 14;
	public static final int P = 15;
	public static final int Q = 16;
	public static final int R = 17;
	public static final int S = 18;
	public static final int T = 19;
	public static final int U = 20;
	public static final int V = 21;
	public static final int W = 22;
	public static final int X = 23;
	
	private int rendUC;
	public static MemoriaControle memCtrl;
	public static Bit sinais[] = new Bit[MicroInstrucoes.TAM_CTRL];

	/****************************************************/
	/****************************************************/
	
	public Uc() {
		for(int i=0; i < MicroInstrucoes.TAM_CTRL; i++) {
			sinais[A+i] = new Bit((short)0);
		}
		
		rendUC = 0;
		
		memCtrl = new MemoriaControle();
	}
	
	/****************************************************/
	/****************************************************/
	
	public void setRendUC(int rendUC) {
		this.rendUC = rendUC;
	}
	
	public int getRendUC() {
		return rendUC;
	}
	
	/**********************************/
	
	public Bit[] getSinais() {
		return sinais;
	}

	public void setSinais(Bit[] sinais) {
		this.sinais = sinais;
	}
	
	/**********************************/
	
	public void setMemCtrl(MemoriaControle memCtrl) {
		this.memCtrl = memCtrl;
	}

	public MemoriaControle getMemCtrl() {
		return memCtrl;
	}

	/**********************************/
	
	public Bit getSinal(int c) {
		return sinais[c];
	}

	public void setSinal(int c, Bit b) {
		this.sinais[c] = b;
	}

	
}
