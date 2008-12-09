package br.ufrj.dcc.arq.modelo;

public class Processador {
	
	public static final int QTD_REGS = 7;
	
	public static final int R0 = 0;
	public static final int R1 = 1;
	public static final int R2 = 2;
	public static final int R3 = 3;
	public static final int R4 = 4;
	public static final int RX = 5;
	public static final int RY = 6;
	
	private Uc uc;
	private Ula ula;
	private Registrador pc; /* ------\                                      */
	private Registrador ir; /* --------- Precisam ser unsigned!!!!!!!!!!    */
	private Registrador rend; /* ----/                                      */
	private Registrador rdados;
	private Registrador regs[] = new Registrador[7];
	private Memoria mem;

	/****************************************************/
	/****************************************************/
	
	public Processador() {
		uc     = new Uc();
		ula    = new Ula();
		pc     = new Registrador(Uc.A);
		ir     = new Registrador(Uc.K);
		rend   = new Registrador(Uc.J);
		rdados = new Registrador(Uc.B);
		mem    = new Memoria();
		
		regs[R0] = new Registrador(Uc.C);
		regs[R1] = new Registrador(Uc.D);
		regs[R2] = new Registrador(Uc.E);
		regs[R3] = new Registrador(Uc.F);
		regs[R4] = new Registrador(Uc.G);
		regs[RX] = new Registrador(Uc.H);
		regs[RY] = new Registrador(Uc.I);

	}
	
	/****************************************************/
	/****************************************************/
	
	public Memoria getMem() {
		return mem;
	}

	public void setMem(Memoria mem) {
		this.mem = mem;
	}
	
	/**********************************/

	public void setUc(Uc uc) {
		this.uc = uc;
	}
	
	public Uc getUc() {
		return this.uc;
	}
	
	/**********************************/

	public void setUla(Ula ula) {
		this.ula = ula;
	}
	
	public Ula getUla() {
		return this.ula;
	}

	/**********************************/

	public void setPc(Registrador pc) {
		this.pc = pc;
	}
	 
	public Registrador getPc() {
		return this.pc;
	}

	/**********************************/
	
	public void setIr(Registrador ir) {
		this.ir = ir;
	}
	 
	public Registrador getIr() {
		return this.ir;
	}
	
	/**********************************/

	public void setRend(Registrador rend) {
		this.rend = rend;
	}
	 
	public Registrador getRend() {
		return this.rend;
	}

	/**********************************/
	
	public void setRdados(Registrador rdados) {
		this.rdados = rdados;
	}
	 
	public Registrador getRdados() {
		return this.rdados;
	}

	/**********************************/

	public void setReg(Registrador nreg, int pos) {
		this.regs[pos] = nreg;
	}
	 
	public Registrador getReg(int pos) {
		return this.regs[pos];
	}
	 
}
