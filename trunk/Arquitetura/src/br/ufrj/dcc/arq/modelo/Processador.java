package br.ufrj.dcc.arq.modelo;

/**
 * Classe que irah instanciar toda a Arquitetura do Programa
 */

public class Processador {
	
	public boolean executa_programa;
	
	public static final int QTD_REGS = 7;
	
	public static final int R0 = 0;
	public static final int R1 = 1;
	public static final int R2 = 2;
	public static final int R3 = 3;
	public static final int R4 = 4;
	public static final int RX = 5;
	public static final int RY = 6;
	
	public Uc 				uc;
	public Ula 				ula;
	public Memoria 			memoria;
	public MemoriaControle 	memoriacontrole;
	public Registrador 		registrador;
	public Multiplex2E		mux2;
	public Multiplex4E		mux4;
	public Multiplex5E		mux5;

	public Registrador 	pc; /* ------\                                      */
	public Registrador 	ir; /* --------- Precisam ser unsigned!!!!!!!!!!    */
	public Registrador 	rend; /* ----/                                      */
	public Registrador 	rdados;
	public Registrador 	regs[] = new Registrador[7];
	
	public Processador() {
		uc     				= new Uc();
		ula    				= new Ula();
		memoria				= new Memoria();
		registrador 		= new Registrador();
		mux2				= new Multiplex2E();
		mux4 				= new Multiplex4E();
		mux5				= new Multiplex5E();
		memoriacontrole 	= new MemoriaControle();
		
		executa_programa 	= true;
	}

}