package br.ufrj.dcc.arq.modelo;

/***
 * Classe responsavel pelas MicroInstrucoes da UC
 */
public class MemoriaControle {
	public static final int TAM_END = 6;
	public static final int TAM_CTRL = 24;
	public static final short[] NULOV = {-1};
	public static final short NULO = -1;

	/**
	 * ORDEM: MUX2, MUX4, MUX5, ULA, OP1, OP2, RDEST
	 */ 

	public static final short LE[]							= cria_Vetor(Multiplex2E.PASSAMEM, NULOV, NULOV, NULOV, Uc.J, NULO, Uc.B);
	public static final short ESCREVE[]						= cria_Vetor(NULOV, NULOV, NULOV, NULOV, Uc.B, Uc.J, Uc.X);

	public static final short PC_REC_PCMAIS1[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAPC, Ula.INCB, NULO, Uc.A, Uc.A);
	public static final short IR_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO , Uc.K);
	public static final short REND_REC_PC[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAPC, Ula.PASSAB, Uc.A, NULO, Uc.J);
	public static final short REND_REC_R0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.J);
	public static final short REND_REC_R1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.J);
	public static final short REND_REC_R2[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.J);
	public static final short REND_REC_R3[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.J);
	public static final short REND_REC_R4[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.J);
	public static final short RY_REC_RDADOS[]	 			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.I);
	public static final short RY_REC_R0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.I);
	public static final short RY_REC_R1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.I);
	public static final short RX_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.H);
	public static final short RX_REC_R2[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.H);
	public static final short RX_REC_R3[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.H);
	public static final short RX_REC_R4[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.H);
	public static final short RDADOS_REC_INFLIDA[] 			= cria_Vetor(Multiplex2E.PASSAMEM, NULOV, NULOV, NULOV, NULO, NULO, Uc.B);
	public static final short RDADOS_REC_RDADOSMAISRY[] 	= cria_Vetor(Multiplex2E.PASSASULA,Multiplex4E.PASSARDADOS, Multiplex5E.PASSARY, Ula.ADD, Uc.B, Uc.I, Uc.B);
	public static final short RDADOS_REC_R0MAISRY[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.ADD, Uc.C, Uc.I, Uc.B);
	public static final short RDADOS_REC_R1MAISRY[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.ADD, Uc.D, Uc.I, Uc.B);
	public static final short RDADOS_REC_R2MAISRX[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.ADD, Uc.E, Uc.H, Uc.B);
	public static final short RDADOS_REC_R3MAISRX[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.ADD, Uc.F, Uc.H, Uc.B);
	public static final short RDADOS_REC_R4MAISRX[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.ADD, Uc.G, Uc.H, Uc.B);
	public static final short RDADOS_REC_RYMENOSRDADOS[] 	= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, Multiplex5E.PASSARY, Ula.SUBAB, Uc.I, Uc.B, Uc.B);
	public static final short RDADOS_REC_R0MENOSRY[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.SUBBA, Uc.C, Uc.I, Uc.B);
	public static final short RDADOS_REC_R1MENOSRY[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.SUBBA, Uc.D, Uc.I, Uc.B); 
	public static final short RDADOS_REC_R2MENOSRX[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.SUBAB, Uc.E, Uc.H, Uc.B);
	public static final short RDADOS_REC_R3MENOSRX[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.SUBAB, Uc.F, Uc.H, Uc.B);
	public static final short RDADOS_REC_R4MENOSRX[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.SUBAB, Uc.G, Uc.H, Uc.B);
	public static final short RDADOS_REC_RY[] 				= cria_Vetor(Multiplex2E.PASSASULA, NULOV, Multiplex5E.PASSARY, Ula.PASSAB, Uc.I, NULO, Uc.B);
	public static final short RDADOS_REC_R0[] 				= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.B);
	public static final short RDADOS_REC_R1[] 				= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.B);
	public static final short RDADOS_REC_R2[] 				= cria_Vetor(Multiplex2E.PASSASULA, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.B);
	public static final short RDADOS_REC_R3[] 				= cria_Vetor(Multiplex2E.PASSASULA, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.B);
	public static final short RDADOS_REC_R4[] 				= cria_Vetor(Multiplex2E.PASSASULA, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.B);
	public static final short RDADOS_REC_RDADOSANDRY[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, Multiplex5E.PASSARY, Ula.AND, Uc.B, Uc.I, Uc.B);
	public static final short RDADOS_REC_R0ANDRY[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.AND, Uc.C, Uc.I, Uc.B);
	public static final short RDADOS_REC_R1ANDRY[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.AND, Uc.D, Uc.I, Uc.B);
	public static final short RDADOS_REC_R2ANDRX[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.H, Uc.B);
	public static final short RDADOS_REC_R3ANDRX[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.AND, Uc.F, Uc.H, Uc.B);
	public static final short RDADOS_REC_R4ANDRX[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.AND, Uc.G, Uc.H, Uc.B);
	public static final short RDADOS_REC_RDADOSORRY[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, Multiplex5E.PASSARY, Ula.OR, Uc.B, Uc.I, Uc.B);
	public static final short RDADOS_REC_R0ORRY[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.OR, Uc.C, Uc.I, Uc.B);
	public static final short RDADOS_REC_R1ORRY[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.OR, Uc.D, Uc.I, Uc.B);
	public static final short RDADOS_REC_R2ORRX[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.OR, Uc.E, Uc.H, Uc.B);
	public static final short RDADOS_REC_R3ORRX[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.OR, Uc.F, Uc.H, Uc.B);
	public static final short RDADOS_REC_R4ORRX[] 			= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.OR, Uc.G, Uc.H, Uc.B);
	public static final short RDADOS_REC_NOTRDADOS[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, NULOV, Ula.NOTA, Uc.B, NULO, Uc.B);
	public static final short RDADOS_REC_NEGRDADOS[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, NULOV, Ula.NEGA, Uc.B, NULO, Uc.B);
	public static final short RDADOS_REC_0[] 				= cria_Vetor(Multiplex2E.PASSASULA, NULOV, NULOV, Ula.PASSAZERO, NULO, NULO, Uc.B);
	public static final short RDADOS_REC_SHLRDADOS[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, NULOV, Ula.SHLA, Uc.B, NULO, Uc.B);
	public static final short RDADOS_REC_SHRRDADOS[] 		= cria_Vetor(Multiplex2E.PASSASULA, Multiplex4E.PASSARDADOS, NULOV, Ula.SHRA, Uc.B, NULO, Uc.B);
	public static final short R0_REC_R0ANDRY[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.AND, Uc.C, Uc.I, Uc.C);
	public static final short R0_REC_R0ANDR2[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.AND, Uc.C, Uc.E, Uc.C);
	public static final short R0_REC_R0ANDR3[]				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.AND, Uc.C, Uc.F, Uc.C);
	public static final short R0_REC_R0ANDR4[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.AND, Uc.C, Uc.G, Uc.C);
	public static final short R0_REC_R0ORRY[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.OR, Uc.C, Uc.I, Uc.C);
	public static final short R0_REC_R0ORR2[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.OR, Uc.C, Uc.E, Uc.C);
	public static final short R0_REC_R0ORR3[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.OR, Uc.C, Uc.F, Uc.C);
	public static final short R0_REC_R0ORR4[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.OR, Uc.C, Uc.G, Uc.C);
	public static final short R0_REC_R0MAISRY[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.ADD, Uc.C, Uc.I, Uc.C);
	public static final short R0_REC_R0MAISR2[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.ADD, Uc.C, Uc.E, Uc.C);
	public static final short R0_REC_R0MAISR3[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.ADD, Uc.C, Uc.F, Uc.C);
	public static final short R0_REC_R0MAISR4[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.ADD, Uc.C, Uc.G, Uc.C);
	public static final short R0_REC_RYMENOSR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.SUBAB, Uc.I, Uc.C, Uc.C);
	public static final short R0_REC_R2MENOSR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.SUBAB, Uc.E, Uc.C, Uc.C);
	public static final short R0_REC_R3MENOSR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.SUBAB, Uc.F, Uc.C, Uc.C);
	public static final short R0_REC_R4MENOSR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.SUBAB, Uc.G, Uc.C, Uc.C);
	public static final short R0_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.C);
	public static final short R0_REC_R1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.C);
	public static final short R0_REC_R2[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.C);
	public static final short R0_REC_R3[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.C);
	public static final short R0_REC_R4[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.C);
	public static final short R0_REC_NOTR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.NOTA, Uc.C, NULO, Uc.C);
	public static final short R0_REC_NEGR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.NEGA, Uc.C, NULO, Uc.C);
	public static final short R0_REC_0[] 					= cria_Vetor(NULOV, NULOV, NULOV, Ula.PASSAZERO, NULO, NULO, Uc.C);
	public static final short R0_REC_SHLR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.SHLA, Uc.C, NULO, Uc.C);
	public static final short R0_REC_SHRR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.SHRA, Uc.C, NULO, Uc.C);
	public static final short R1_REC_R1ANDRY[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.AND, Uc.D, Uc.I, Uc.D);
	public static final short R1_REC_R1ANDR2[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.AND, Uc.D, Uc.E, Uc.D);
	public static final short R1_REC_R1ANDR3[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.AND, Uc.D, Uc.F, Uc.D);
	public static final short R1_REC_R1ANDR4[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.AND, Uc.D, Uc.G, Uc.D);
	public static final short R1_REC_R1ORRY[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.OR, Uc.D, Uc.I, Uc.D);
	public static final short R1_REC_R1ORR2[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.OR, Uc.D, Uc.E, Uc.D);
	public static final short R1_REC_R1ORR3[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.OR, Uc.D, Uc.F, Uc.D);
	public static final short R1_REC_R1ORR4[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.OR, Uc.D, Uc.G, Uc.D);
	public static final short R1_REC_R1MAISRY[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.ADD, Uc.D, Uc.I, Uc.D);
	public static final short R1_REC_R1MAISR2[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.ADD, Uc.D, Uc.E, Uc.D);
	public static final short R1_REC_R1MAISR3[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.ADD, Uc.D,Uc.F, Uc.D);
	public static final short R1_REC_R1MAISR4[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.ADD, Uc.D,Uc.G, Uc.D);
	public static final short R1_REC_RYMENOSR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.SUBAB, Uc.I, Uc.D, Uc.D);
	public static final short R1_REC_R2MENOSR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.SUBAB, Uc.E, Uc.D, Uc.D);
	public static final short R1_REC_R3MENOSR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.SUBAB, Uc.F, Uc.D, Uc.D);
	public static final short R1_REC_R4MENOSR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.SUBAB, Uc.G, Uc.D, Uc.D);
	public static final short R1_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.D);
	public static final short R1_REC_R0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.D);
	public static final short R1_REC_R2[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.D);
	public static final short R1_REC_R3[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.D);
	public static final short R1_REC_R4[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.D);
	public static final short R1_REC_NOTR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.NOTA, Uc.D, NULO, Uc.D);
	public static final short R1_REC_NEGR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.NEGA, Uc.D, NULO, Uc.D);
	public static final short R1_REC_0[] 					= cria_Vetor(NULOV, NULOV, NULOV, Ula.PASSAZERO, NULO, NULO, Uc.D);
	public static final short R1_REC_SHLR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.SHLA, Uc.D, NULO, Uc.D);
	public static final short R1_REC_SHRR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.SHRA, Uc.D, NULO, Uc.D);
	public static final short R2_REC_R2ANDRDADOS[]			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.B, Uc.E);
	public static final short R2_REC_R2ANDR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.C, Uc.E);
	public static final short R2_REC_R2ANDR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.D, Uc.E);
	public static final short R2_REC_R2ANDRX[]				= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.H, Uc.E);
	public static final short R2_REC_R2ORRDADOS[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR2, Ula.OR, Uc.E, Uc.B, Uc.E);
	public static final short R2_REC_R2ORR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.OR, Uc.E, Uc.C, Uc.E);
	public static final short R2_REC_R2ORR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.OR, Uc.E, Uc.D, Uc.E);
	public static final short R2_REC_R2ORRX[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.OR, Uc.E, Uc.H, Uc.E);
	public static final short R2_REC_R2MAISRDADOS[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR2, Ula.ADD, Uc.E, Uc.B, Uc.E);
	public static final short R2_REC_R2MAISRX[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.ADD, Uc.E, Uc.H, Uc.E);
	public static final short R2_REC_R2MAISR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.ADD, Uc.E, Uc.C, Uc.E);
	public static final short R2_REC_R2MAISR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.ADD, Uc.E, Uc.D, Uc.E);
	public static final short R2_REC_RDADOSMENOSR2[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.B, Uc.E, Uc.E);
	public static final short R2_REC_RXMENOSR2[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.H, Uc.E, Uc.E);
	public static final short R2_REC_R0MENOSR2[]			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.C, Uc.E, Uc.E);
	public static final short R2_REC_R1MENOSR2[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.D, Uc.E, Uc.E);
	public static final short R2_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.E);
	public static final short R2_REC_R0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.E);
	public static final short R2_REC_R1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.E);
	public static final short R2_REC_R3[]					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.E);
	public static final short R2_REC_R4[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.E);
	public static final short R2_REC_NOTR2[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.NOTB, Uc.E, NULO, Uc.E);
	public static final short R2_REC_NEGR2[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.NEGB, Uc.E, NULO, Uc.E);
	public static final short R2_REC_0[] 					= cria_Vetor(NULOV, NULOV, NULOV, Ula.PASSAZERO, NULO, NULO, Uc.E);
	public static final short R2_REC_SHLR2[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.SHLB, Uc.E, NULO, Uc.E);
	public static final short R2_REC_SHRR2[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2,Ula.SHRB, Uc.E, NULO, Uc.E);
	public static final short R3_REC_R3ANDRDADOS[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR3, Ula.AND, Uc.F, Uc.B, Uc.F);
	public static final short R3_REC_R3ANDR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.AND, Uc.F, Uc.C, Uc.F);
	public static final short R3_REC_R3ANDR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.AND, Uc.F, Uc.D, Uc.F);
	public static final short R3_REC_R3ANDRX[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.AND, Uc.F, Uc.H, Uc.F);
	public static final short R3_REC_R3ORRDADOS[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR3, Ula.OR, Uc.F, Uc.B, Uc.F);
	public static final short R3_REC_R3ORR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.OR, Uc.F, Uc.C, Uc.F);
	public static final short R3_REC_R3ORR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.OR, Uc.F, Uc.D, Uc.F);
	public static final short R3_REC_R3ORRX[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.OR, Uc.F, Uc.H, Uc.F);
	public static final short R3_REC_R3MAISRDADOS[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR3, Ula.ADD, Uc.F, Uc.B, Uc.F);
	public static final short R3_REC_R3MAISRX[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.ADD, Uc.F, Uc.H, Uc.F);
	public static final short R3_REC_R3MAISR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.ADD, Uc.F, Uc.C, Uc.F);
	public static final short R3_REC_R3MAISR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.ADD, Uc.F, Uc.D, Uc.F);
	public static final short R3_REC_RDADOSMENOSR3[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.B, Uc.F, Uc.F);
	public static final short R3_REC_RXMENOSR3[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.H, Uc.F, Uc.F);
	public static final short R3_REC_R0MENOSR3[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.C, Uc.F, Uc.F);
	public static final short R3_REC_R1MENOSR3[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.D, Uc.F, Uc.F);
	public static final short R3_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.F);
	public static final short R3_REC_R0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.F);
	public static final short R3_REC_R1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.F);
	public static final short R3_REC_R2[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.F);
	public static final short R3_REC_R4[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.PASSAB, Uc.G, NULO, Uc.F);
	public static final short R3_REC_NOTR3[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.NOTB, Uc.F, NULO, Uc.F);
	public static final short R3_REC_NEGR3[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.NEGB, Uc.F, NULO, Uc.F);
	public static final short R3_REC_0[] 					= cria_Vetor(NULOV, NULOV, NULOV, Ula.PASSAZERO, NULO, NULO, Uc.F);
	public static final short R3_REC_SHLR3[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.SHLB, Uc.F, NULO, Uc.F);
	public static final short R3_REC_SHRR3[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.SHRB, Uc.F, NULO, Uc.F);
	public static final short R4_REC_R4ANDRDADOS[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR4, Ula.AND, Uc.G, Uc.B, Uc.G);
	public static final short R4_REC_R4ANDR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.AND, Uc.G, Uc.C, Uc.G);
	public static final short R4_REC_R4ANDR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.AND, Uc.G, Uc.D, Uc.G);
	public static final short R4_REC_R4ANDRX[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.AND, Uc.G, Uc.H, Uc.G);
	public static final short R4_REC_R4ORRDADOS[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR4, Ula.OR, Uc.G, Uc.B, Uc.G);
	public static final short R4_REC_R4ORR0[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.OR, Uc.G, Uc.C, Uc.G);
	public static final short R4_REC_R4ORR1[] 				= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.OR, Uc.G, Uc.D, Uc.G);
	public static final short R4_REC_R4ORRX[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.OR, Uc.G, Uc.H, Uc.G);
	public static final short R4_REC_R4MAISRDADOS[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR4, Ula.ADD, Uc.G, Uc.B, Uc.G);
	public static final short R4_REC_R4MAISRX[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.ADD, Uc.G, Uc.H, Uc.G);
	public static final short R4_REC_R4MAISR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.ADD, Uc.G, Uc.C, Uc.G);
	public static final short R4_REC_R4MAISR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.ADD, Uc.G, Uc.D, Uc.G);
	public static final short R4_REC_RDADOSMENOSR4[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.B, Uc.G, Uc.G);
	public static final short R4_REC_RXMENOSR4[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.H, Uc.G, Uc.G);
	public static final short R4_REC_R0MENOSR4[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.C, Uc.G, Uc.G);
	public static final short R4_REC_R1MENOSR4[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.D, Uc.G, Uc.G);
	public static final short R4_REC_RDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, NULOV, Ula.PASSAA, Uc.B, NULO, Uc.G);
	public static final short R4_REC_R0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, NULOV, Ula.PASSAA, Uc.C, NULO, Uc.G);
	public static final short R4_REC_R1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, NULOV, Ula.PASSAA, Uc.D, NULO, Uc.G);
	public static final short R4_REC_R2[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR2, Ula.PASSAB, Uc.E, NULO, Uc.G);
	public static final short R4_REC_R3[] 					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR3, Ula.PASSAB, Uc.F, NULO, Uc.G);
	public static final short R4_REC_NOTR4[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.NOTB, Uc.G, NULO, Uc.G);
	public static final short R4_REC_NEGR4[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.NEGB, Uc.G, NULO, Uc.G);
	public static final short R4_REC_0[] 					= cria_Vetor(NULOV, NULOV, NULOV, Ula.PASSAZERO, NULO, NULO, Uc.G);
	public static final short R4_REC_SHLR4[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.SHLB, Uc.G, NULO, Uc.G);
	public static final short R4_REC_SHRR4[] 				= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAR4, Ula.SHRB, Uc.G, NULO, Uc.G);
	public static final short RYMENOSR0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.SUBAB, Uc.I, Uc.C, NULO);
	public static final short R2MENOSR0[]		 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.SUBAB, Uc.E, Uc.C, NULO);
	public static final short R3MENOSR0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.SUBAB, Uc.F, Uc.C, NULO);
	public static final short R4MENOSR0[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.SUBAB, Uc.G, Uc.C, NULO);
	public static final short RYMENOSR1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.SUBAB, Uc.I, Uc.D, NULO);
	public static final short R2MENOSR1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.SUBAB, Uc.E, Uc.D, NULO);
	public static final short R3MENOSR1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.SUBAB, Uc.F, Uc.D, NULO);
	public static final short R4MENOSR1[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.SUBAB, Uc.G, Uc.D, NULO);
	public static final short RDADOSMENOSR2[]		 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.B, Uc.E, NULO);
	public static final short RXMENOSR2[] 					= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.H, Uc.E, NULO);
	public static final short R0MENOSR2[]					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.C, Uc.E, NULO);
	public static final short R1MENOSR2[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.SUBBA, Uc.D, Uc.E, NULO);
	public static final short RDADOSMENOSR3[]		 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.B, Uc.F, NULO);
	public static final short RXMENOSR3[] 					= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.H, Uc.F, NULO);
	public static final short R0MENOSR3[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.C, Uc.F, NULO);
	public static final short R1MENOSR3[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR3, Ula.SUBBA, Uc.D, Uc.F, NULO);
	public static final short RDADOSMENOSR4[]		 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.B, Uc.G, NULO);
	public static final short RXMENOSR4[] 					= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.H, Uc.G, NULO);
	public static final short R0MENOSR4[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.C, Uc.G, NULO);
	public static final short R1MENOSR4[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR4, Ula.SUBBA, Uc.D, Uc.G, NULO);
	public static final short RYMENOSRDADOS[] 				= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSARY, Ula.SUBBA, Uc.I, Uc.B, NULO);
	public static final short R0MENOSRY[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSARY, Ula.SUBBA, Uc.C, Uc.I, NULO);
	public static final short R1MENOSRY[] 					= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSARY, Ula.SUBBA, Uc.D, Uc.I, NULO);
	public static final short R2MENOSRX[] 					= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.SUBAB, Uc.E, Uc.H, NULO);
	public static final short R3MENOSRX[] 					= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR3, Ula.SUBAB, Uc.F, Uc.H, NULO);
	public static final short R4MENOSRX[] 					= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR4, Ula.SUBAB, Uc.G, Uc.H, NULO);
	public static final short RY_REC_PC[]					= cria_Vetor(NULOV, NULOV, Multiplex5E.PASSAPC, Ula.PASSAB, Uc.A, NULO, Uc.I);
	public static final short PC_REC_RYMAISRDADOS[]			= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSARY, Ula.ADD, Uc.B, Uc.I, Uc.A);
	
	
	public void Operar(Processador proc) {
		proc.memoria.opera(proc);
		proc.mux2.opera(proc);
		proc.mux4.opera(proc);
		proc.mux5.opera(proc);
		proc.ula.opera(proc);
	}

	/**
	 * NOMENCLATURA DAS MICROINSTRUCOES:
	 * rec => recebe
	 */

	/** 
	 * Instrucoes Le e Escreve
	 */
	public void Le(Processador proc) {
		proc.uc.setSinais(LE);		 
		this.Operar(proc); 
	}
	
	public void Escreve(Processador proc) {
		proc.uc.setSinais(ESCREVE);
		this.Operar(proc);
	}

	/** 
	 * Instrucoes PC recebe algo
	 */
	public void PC_rec_PCmais1(Processador proc) {
		proc.uc.setSinais(PC_REC_PCMAIS1);
		 
		this.Operar(proc);
		proc.registrador.pc = proc.ula.s;
	}

	public void PC_rec_RYmaisRDados(Processador proc) {
		proc.uc.setSinais(PC_REC_RYMAISRDADOS);
		this.Operar(proc);
		proc.registrador.pc = proc.ula.s;
	}
	
	/** 
	 * Instrucoes IR recebe algo
	 */
	public void IR_rec_RDados(Processador proc) {
		proc.uc.setSinais(IR_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.ri = proc.ula.s;
	}

	/** 
	 * Instrucoes REnd recebe algo
	 */
	public void REnd_rec_PC(Processador proc) {
		proc.uc.setSinais(REND_REC_PC);
		this.Operar(proc);
		proc.registrador.rend = proc.ula.s;
	}
	public void REnd_rec_R0(Processador proc) {
		proc.uc.setSinais(REND_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.rend = proc.ula.s;
	}
	public void REnd_rec_R1(Processador proc) {
		proc.uc.setSinais(REND_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.rend = proc.ula.s;
	}
	public void REnd_rec_R2(Processador proc) {
		proc.uc.setSinais(REND_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.rend = proc.ula.s;
	}
	public void REnd_rec_R3(Processador proc) {
		proc.uc.setSinais(REND_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.rend = proc.ula.s;
	}
	public void REnd_rec_R4(Processador proc) {
		proc.uc.setSinais(REND_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.rend = proc.ula.s;
	}
	/** 
	 * Instrucoes RY recebe algo
	 */
	public void RY_rec_RDados(Processador proc) {
		proc.uc.setSinais(RY_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.ry = proc.ula.s;
	}
	public void RY_rec_R0(Processador proc) {
		proc.uc.setSinais(RY_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.ry = proc.ula.s;
	}
	public void RY_rec_R1(Processador proc) {
		proc.uc.setSinais(RY_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.ry = proc.ula.s;
	}
	
	public void RY_rec_PC(Processador proc) {
		proc.uc.setSinais(RY_REC_PC);
		 
		this.Operar(proc);
		proc.registrador.ry = proc.ula.s;
	}
	
	/** 
	 * Instrucoes RX recebe algo
	 */
	public void RX_rec_RDados(Processador proc) {
		proc.uc.setSinais(RX_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.rx = proc.ula.s;
	}
	public void RX_rec_R2(Processador proc) {
		proc.uc.setSinais(RX_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.rx = proc.ula.s;
	}
	public void RX_rec_R3(Processador proc) {
		proc.uc.setSinais(RX_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.rx = proc.ula.s;
	}
	public void RX_rec_R4(Processador proc) {
		proc.uc.setSinais(RX_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.rx = proc.ula.s;
	}
	/** 
	 * Instrucoes RDados recebe algo
	 */
	public void RDados_rec_Inflida(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_INFLIDA);
		this.Operar(proc);
		proc.registrador.rdados = proc.mux2.s;
	}
	public void RDados_rec_RDadosmaisRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_RDADOSMAISRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R0maisRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R0MAISRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R1maisRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R1MAISRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R2maisRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R2MAISRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R3maisRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R3MAISRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R4maisRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R4MAISRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_RYmenosRDados(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_RYMENOSRDADOS);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R0menosRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R0MENOSRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R1menosRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R1MENOSRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R2menosRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R2MENOSRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R3menosRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R3MENOSRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R4menosRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R4MENOSRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_RY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_RY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R0(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R1(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R2(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R3(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R4(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_RDadosandRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_RDADOSANDRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R0andRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R0ANDRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R1andRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R1ANDRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R2andRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R2ANDRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R3andRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R3ANDRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R4andRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R4ANDRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_RDadosorRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_RDADOSORRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R0orRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R0ORRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R1orRY(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R1ORRY);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R2orRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R2ORRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R3orRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R3ORRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_R4orRX(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_R4ORRX);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_notRDados(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_NOTRDADOS);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_negRDados(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_NEGRDADOS);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_0(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_0);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_shlRDados(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_SHLRDADOS);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	public void RDados_rec_shrRDados(Processador proc) {
		proc.uc.setSinais(RDADOS_REC_SHRRDADOS);
		 
		this.Operar(proc);
		proc.registrador.rdados = proc.ula.s;
	}
	/** 
	 * Instrucoes R0 recebe algo
	 */
	public void R0_rec_R0andRY(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ANDRY);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0andR2(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ANDR2);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0andR3(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ANDR3);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0andR4(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ANDR4);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0orRY(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ORRY);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0orR2(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ORR2);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0orR3(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ORR3);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0orR4(Processador proc) {
		proc.uc.setSinais(R0_REC_R0ORR4);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0maisRY(Processador proc) {
		proc.uc.setSinais(R0_REC_R0MAISRY);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0maisR2(Processador proc) {
		proc.uc.setSinais(R0_REC_R0MAISR2);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0maisR3(Processador proc) {
		proc.uc.setSinais(R0_REC_R0MAISR3);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R0maisR4(Processador proc) {
		proc.uc.setSinais(R0_REC_R0MAISR4);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_RYmenosR0(Processador proc) {
		proc.uc.setSinais(R0_REC_RYMENOSR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R2menosR0(Processador proc) {
		proc.uc.setSinais(R0_REC_R2MENOSR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R3menosR0(Processador proc) {
		proc.uc.setSinais(R0_REC_R3MENOSR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R4menosR0(Processador proc) {
		proc.uc.setSinais(R0_REC_R4MENOSR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_RDados(Processador proc) {
		proc.uc.setSinais(R0_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R1(Processador proc) {
		proc.uc.setSinais(R0_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R2(Processador proc) {
		proc.uc.setSinais(R0_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R3(Processador proc) {
		proc.uc.setSinais(R0_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_R4(Processador proc) {
		proc.uc.setSinais(R0_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_notR0(Processador proc) {
		proc.uc.setSinais(R0_REC_NOTR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_negR0(Processador proc) {
		proc.uc.setSinais(R0_REC_NEGR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_0(Processador proc) {
		proc.uc.setSinais(R0_REC_0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_shlR0(Processador proc) {
		proc.uc.setSinais(R0_REC_SHLR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	public void R0_rec_shrR0(Processador proc) {
		proc.uc.setSinais(R0_REC_SHRR0);
		 
		this.Operar(proc);
		proc.registrador.r0 = proc.ula.s;
	}
	/** 
	 * Instrucoes R1 recebe algo
	 */
	public void R1_rec_R1andRY(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ANDRY);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1andR2(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ANDR2);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1andR3(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ANDR3);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1andR4(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ANDR4);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1orRY(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ORRY);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1orR2(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ORR2);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1orR3(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ORR3);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1orR4(Processador proc) {
		proc.uc.setSinais(R1_REC_R1ORR4);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1maisRY(Processador proc) {
		proc.uc.setSinais(R1_REC_R1MAISRY);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1maisR2(Processador proc) {
		proc.uc.setSinais(R1_REC_R1MAISR2);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1maisR3(Processador proc) {
		proc.uc.setSinais(R1_REC_R1MAISR3);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R1maisR4(Processador proc) {
		proc.uc.setSinais(R1_REC_R1MAISR4);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_RYmenosR1(Processador proc) {
		proc.uc.setSinais(R1_REC_RYMENOSR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R2menosR1(Processador proc) {
		proc.uc.setSinais(R1_REC_R2MENOSR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R3menosR1(Processador proc) {
		proc.uc.setSinais(R1_REC_R3MENOSR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R4menosR1(Processador proc) {
		proc.uc.setSinais(R1_REC_R4MENOSR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_RDados(Processador proc) {
		proc.uc.setSinais(R1_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R0(Processador proc) {
		proc.uc.setSinais(R1_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R2(Processador proc) {
		proc.uc.setSinais(R1_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R3(Processador proc) {
		proc.uc.setSinais(R1_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_R4(Processador proc) {
		proc.uc.setSinais(R1_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_notR1(Processador proc) {
		proc.uc.setSinais(R1_REC_NOTR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_negR1(Processador proc) {
		proc.uc.setSinais(R1_REC_NEGR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_0(Processador proc) {
		proc.uc.setSinais(R1_REC_0);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_shlR1(Processador proc) {
		proc.uc.setSinais(R1_REC_SHLR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	public void R1_rec_shrR1(Processador proc) {
		proc.uc.setSinais(R1_REC_SHRR1);
		 
		this.Operar(proc);
		proc.registrador.r1 = proc.ula.s;
	}
	/** 
	 * Instrucoes R2 recebe algo
	 */
	public void R2_rec_R2andRDados(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ANDRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2andR0(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ANDR0);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2andR1(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ANDR1);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2andRX(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ANDRX);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2orRDados(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ORRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2orR0(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ORR0);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2orR1(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ORR1);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2orRX(Processador proc) {
		proc.uc.setSinais(R2_REC_R2ORRX);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2maisRDados(Processador proc) {
		proc.uc.setSinais(R2_REC_R2MAISRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2maisRX(Processador proc) {
		proc.uc.setSinais(R2_REC_R2MAISRX);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2maisR0(Processador proc) {
		proc.uc.setSinais(R2_REC_R2MAISR0);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R2maisR1(Processador proc) {
		proc.uc.setSinais(R2_REC_R2MAISR1);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_RDadosmenosR2(Processador proc) {
		proc.uc.setSinais(R2_REC_RDADOSMENOSR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_RXmenosR2(Processador proc) {
		proc.uc.setSinais(R2_REC_RXMENOSR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R0menosR2(Processador proc) {
		proc.uc.setSinais(R2_REC_R0MENOSR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R1menosR2(Processador proc) {
		proc.uc.setSinais(R2_REC_R1MENOSR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_RDados(Processador proc) {
		proc.uc.setSinais(R2_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R0(Processador proc) {
		proc.uc.setSinais(R2_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R1(Processador proc) {
		proc.uc.setSinais(R2_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R3(Processador proc) {
		proc.uc.setSinais(R2_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_R4(Processador proc) {
		proc.uc.setSinais(R2_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_notR2(Processador proc) {
		proc.uc.setSinais(R2_REC_NOTR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_negR2(Processador proc) {
		proc.uc.setSinais(R2_REC_NEGR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_0(Processador proc) {
		proc.uc.setSinais(R2_REC_0);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_shlR2(Processador proc) {
		proc.uc.setSinais(R2_REC_SHLR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	public void R2_rec_shrR2(Processador proc) {
		proc.uc.setSinais(R2_REC_SHRR2);
		 
		this.Operar(proc);
		proc.registrador.r2 = proc.ula.s;
	}
	/** 
	 * Instrucoes R3 recebe algo
	 */
	public void R3_rec_R3andRDados(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ANDRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3andR0(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ANDR0);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3andR1(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ANDR1);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3andRX(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ANDRX);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3orRDados(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ORRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3orR0(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ORR0);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3orR1(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ORR1);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3orRX(Processador proc) {
		proc.uc.setSinais(R3_REC_R3ORRX);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3maisRDados(Processador proc) {
		proc.uc.setSinais(R3_REC_R3MAISRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3maisRX(Processador proc) {
		proc.uc.setSinais(R3_REC_R3MAISRX);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3maisR0(Processador proc) {
		proc.uc.setSinais(R3_REC_R3MAISR0);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R3maisR1(Processador proc) {
		proc.uc.setSinais(R3_REC_R3MAISR1);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_RDadosmenosR3(Processador proc) {
		proc.uc.setSinais(R3_REC_RDADOSMENOSR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_RXmenosR3(Processador proc) {
		proc.uc.setSinais(R3_REC_RXMENOSR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R0menosR3(Processador proc) {
		proc.uc.setSinais(R3_REC_R0MENOSR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R1menosR3(Processador proc) {
		proc.uc.setSinais(R3_REC_R1MENOSR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_RDados(Processador proc) {
		proc.uc.setSinais(R3_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R0(Processador proc) {
		proc.uc.setSinais(R3_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R1(Processador proc) {
		proc.uc.setSinais(R3_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R2(Processador proc) {
		proc.uc.setSinais(R3_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_R4(Processador proc) {
		proc.uc.setSinais(R3_REC_R4);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_notR3(Processador proc) {
		proc.uc.setSinais(R3_REC_NOTR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_negR3(Processador proc) {
		proc.uc.setSinais(R3_REC_NEGR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_0(Processador proc) {
		proc.uc.setSinais(R3_REC_0);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_shlR3(Processador proc) {
		proc.uc.setSinais(R3_REC_SHLR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	public void R3_rec_shrR3(Processador proc) {
		proc.uc.setSinais(R3_REC_SHRR3);
		 
		this.Operar(proc);
		proc.registrador.r3 = proc.ula.s;
	}
	/** 
	 * Instrucoes R4 recebe algo
	 */
	public void R4_rec_R4andRDados(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ANDRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4andR0(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ANDR0);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4andR1(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ANDR1);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4andRX(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ANDRX);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4orRDados(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ORRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4orR0(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ORR0);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4orR1(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ORR1);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4orRX(Processador proc) {
		proc.uc.setSinais(R4_REC_R4ORRX);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4maisRDados(Processador proc) {
		proc.uc.setSinais(R4_REC_R4MAISRDADOS);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4maisRX(Processador proc) {
		proc.uc.setSinais(R4_REC_R4MAISRX);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4maisR0(Processador proc) {
		proc.uc.setSinais(R4_REC_R4MAISR0);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R4maisR1(Processador proc) {
		proc.uc.setSinais(R4_REC_R4MAISR1);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_RDadosmenosR4(Processador proc) {
		proc.uc.setSinais(R4_REC_RDADOSMENOSR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_RXmenosR4(Processador proc) {
		proc.uc.setSinais(R4_REC_RXMENOSR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R0menosR4(Processador proc) {
		proc.uc.setSinais(R4_REC_R0MENOSR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R1menosR4(Processador proc) {
		proc.uc.setSinais(R4_REC_R1MENOSR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_RDados(Processador proc) {
		proc.uc.setSinais(R4_REC_RDADOS);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R0(Processador proc) {
		proc.uc.setSinais(R4_REC_R0);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R1(Processador proc) {
		proc.uc.setSinais(R4_REC_R1);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R2(Processador proc) {
		proc.uc.setSinais(R4_REC_R2);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_R3(Processador proc) {
		proc.uc.setSinais(R4_REC_R3);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_notR4(Processador proc) {
		proc.uc.setSinais(R4_REC_NOTR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_negR4(Processador proc) {
		proc.uc.setSinais(R4_REC_NEGR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_0(Processador proc) {
		proc.uc.setSinais(R4_REC_0);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_shlR4(Processador proc) {
		proc.uc.setSinais(R4_REC_SHLR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	public void R4_rec_shrR4(Processador proc) {
		proc.uc.setSinais(R4_REC_SHRR4);
		 
		this.Operar(proc);
		proc.registrador.r4 = proc.ula.s;
	}
	/** 
	 * Instrucoes sem recebe
	 */
	public void RYmenosR0(Processador proc) {
		proc.uc.setSinais(RYMENOSR0);
		 
		this.Operar(proc);
	}
	public void R2menosR0(Processador proc) {
		proc.uc.setSinais(R2MENOSR0);
		 
		this.Operar(proc);
	}
	public void R3menosR0(Processador proc) {
		proc.uc.setSinais(R3MENOSR0);
		 
		this.Operar(proc);
	}
	public void R4menosR0(Processador proc) {
		proc.uc.setSinais(R4MENOSR0);
		 
		this.Operar(proc);
	}
	public void RYmenosR1(Processador proc) {
		proc.uc.setSinais(RYMENOSR1);
		 
		this.Operar(proc);
	}
	public void R2menosR1(Processador proc) {
		proc.uc.setSinais(R2MENOSR1);
		 
		this.Operar(proc);
	}
	public void R3menosR1(Processador proc) {
		proc.uc.setSinais(R3MENOSR1);
		 
		this.Operar(proc);
	}
	public void R4menosR1(Processador proc) {
		proc.uc.setSinais(R4MENOSR1);
		 
		this.Operar(proc);
	}
	public void RDadosmenosR2(Processador proc) {
		proc.uc.setSinais(RDADOSMENOSR2);
		 
		this.Operar(proc);
	}
	public void RXmenosR2(Processador proc) {
		proc.uc.setSinais(RXMENOSR2);
		 
		this.Operar(proc);
	}
	public void R0menosR2(Processador proc) {
		proc.uc.setSinais(R0MENOSR2);
		 
		this.Operar(proc);
	}
	public void R1menosR2(Processador proc) {
		proc.uc.setSinais(R1MENOSR2);
		 
		this.Operar(proc);
	}
	public void RDadosmenosR3(Processador proc) {
		proc.uc.setSinais(RDADOSMENOSR3);
		 
		this.Operar(proc);
	}
	public void RXmenosR3(Processador proc) {
		proc.uc.setSinais(RXMENOSR3);
		 
		this.Operar(proc);
	}
	public void R0menosR3(Processador proc) {
		proc.uc.setSinais(R0MENOSR3);
		 
		this.Operar(proc);
	}
	public void R1menosR3(Processador proc) {
		proc.uc.setSinais(R1MENOSR3);
		 
		this.Operar(proc);
	}
	public void RDadosmenosR4(Processador proc) {
		proc.uc.setSinais(RDADOSMENOSR4);
		 
		this.Operar(proc);
	}
	public void RXmenosR4(Processador proc) {
		proc.uc.setSinais(RXMENOSR4);
		 
		this.Operar(proc);
	}
	public void R0menosR4(Processador proc) {
		proc.uc.setSinais(R0MENOSR4);
		 
		this.Operar(proc);
	}
	public void R1menosR4(Processador proc) {
		proc.uc.setSinais(R1MENOSR4);
		 
		this.Operar(proc);
	}
	public void RYmenosRDados(Processador proc) {
		proc.uc.setSinais(RYMENOSRDADOS);
		 
		this.Operar(proc);
	}
	public void R0menosRY(Processador proc) {
		proc.uc.setSinais(R0MENOSRY);
		 
		this.Operar(proc);
	}
	public void R1menosRY(Processador proc) {
		proc.uc.setSinais(R1MENOSRY);
		 
		this.Operar(proc);
	}
	public void R2menosRX(Processador proc) {
		proc.uc.setSinais(R2MENOSRX);
		 
		this.Operar(proc);
	}
	public void R3menosRX(Processador proc) {
		proc.uc.setSinais(R3MENOSRX);
		 
		this.Operar(proc);
	}
	public void R4menosRX(Processador proc) {
		proc.uc.setSinais(R4MENOSRX);
		 
		this.Operar(proc);
	}
	/******************
	 * Instruções GET 
	 *****************/
	/**
	 * Instrucoes PC recebe algo 
	 */
	public short Get_Endereco_PC_rec_PCmais1(Processador proc) {
		return 211;
	}
	public short Get_Endereco_PC_rec_RYmaisRDados(Processador proc) {
		return 213;
	}
	/**
	 *  Instrucoes IR recebe algo
	 */ 
	public short Get_Endereco_IR_rec_RDados(Processador proc) {
		return 212;
	}
	 /**
	  * Instrucoes REnd recebe algo
	  */ 
	public short Get_Endereco_REnd_rec_PC(Processador proc) {
		return 0;
	}
	public short Get_Endereco_REnd_rec_R0(Processador proc) {
		return 1;
	}
	public short Get_Endereco_REnd_rec_R1(Processador proc) {
		return 2;
	}
	public short Get_Endereco_REnd_rec_R2(Processador proc) {
		return 3;
	}
	public short Get_Endereco_REnd_rec_R3(Processador proc) {
		return 4;
	}
	public short Get_Endereco_REnd_rec_R4(Processador proc) {
		return 5;
	}
	 /**
	  * Instrucoes RY recebe algo
	  */ 
	public short Get_Endereco_RY_rec_RDados(Processador proc) {
		return 48;
	}
	public short Get_Endereco_RY_rec_R0(Processador proc) {
		return 49;
	}
	public short Get_Endereco_RY_rec_R1(Processador proc) {
		return 50;
	}
	public short Get_Endereco_RY_rec_PC(Processador proc) {
		return 214;
	}
	 /**
	  * Instrucoes RX recebe algo
	  */ 
	public short Get_Endereco_RX_rec_RDados(Processador proc) {
		return 51;
	}
	public short Get_Endereco_RX_rec_R2(Processador proc) {
		return 52;
	}
	public short Get_Endereco_RX_rec_R3(Processador proc) {
		return 53;
	}
	public short Get_Endereco_RX_rec_R4(Processador proc) {
		return 54;
	}
	 /**
	  * Instrucoes RDados recebe algo
	  */ 
	public short Get_Endereco_RDados_rec_Inflida(Processador proc) {
		return 6;
	}
	public short Get_Endereco_RDados_rec_RDadosmaisRY(Processador proc) {
		return 7;
	}
	public short Get_Endereco_RDados_rec_R0maisRY(Processador proc) {
		return 8;
	}
	public short Get_Endereco_RDados_rec_R1maisRY(Processador proc) {
		return 9;
	}
	public short Get_Endereco_RDados_rec_R2maisRX(Processador proc) {
		return 10;
	}
	public short Get_Endereco_RDados_rec_R3maisRX(Processador proc) {
		return 11;
	}
	public short Get_Endereco_RDados_rec_R4maisRX(Processador proc) {
		return 12;
	}
	public short Get_Endereco_RDados_rec_RYmenosRDados(Processador proc) {
		return 13;
	}
	public short Get_Endereco_RDados_rec_R0menosRY(Processador proc) {
		return 14;
	}
	public short Get_Endereco_RDados_rec_R1menosRY(Processador proc) {
		return 15;
	}
	public short Get_Endereco_RDados_rec_R2menosRX(Processador proc) {
		return 16;
	}
	public short Get_Endereco_RDados_rec_R3menosRX(Processador proc) {
		return 17;
	}
	public short Get_Endereco_RDados_rec_R4menosRX(Processador proc) {
		return 18;
	}
	public short Get_Endereco_RDados_rec_RY(Processador proc) {
		return 19;
	}
	public short Get_Endereco_RDados_rec_R0(Processador proc) {
		return 20;
	}
	public short Get_Endereco_RDados_rec_R1(Processador proc) {
		return 21;
	}
	public short Get_Endereco_RDados_rec_R2(Processador proc) {
		return 22;
	}
	public short Get_Endereco_RDados_rec_R3(Processador proc) {
		return 23;
	}
	public short Get_Endereco_RDados_rec_R4(Processador proc) {
		return 24;
	}
	public short Get_Endereco_RDados_rec_RDadosandRY(Processador proc) {
		return 31;
	}
	public short Get_Endereco_RDados_rec_R0andRY(Processador proc) {
		return 32;
	}
	public short Get_Endereco_RDados_rec_R1andRY(Processador proc) {
		return 33;
	}
	public short Get_Endereco_RDados_rec_R2andRX(Processador proc) {
		return 34;
	}
	public short Get_Endereco_RDados_rec_R3andRX(Processador proc) {
		return 35;
	}
	public short Get_Endereco_RDados_rec_R4andRX(Processador proc) {
		return 36;
	}
	public short Get_Endereco_RDados_rec_RDadosorRY(Processador proc) {
		return 37;
	}
	public short Get_Endereco_RDados_rec_R0orRY(Processador proc) {
		return 38;
	}
	public short Get_Endereco_RDados_rec_R1orRY(Processador proc) {
		return 39;
	}
	public short Get_Endereco_RDados_rec_R2orRX(Processador proc) {
		return 40;
	}
	public short Get_Endereco_RDados_rec_R3orRX(Processador proc) {
		return 41;
	}
	public short Get_Endereco_RDados_rec_R4orRX(Processador proc) {
		return 42;
	}
	public short Get_Endereco_RDados_rec_notRDados(Processador proc) {
		return 43;
	}
	public short Get_Endereco_RDados_rec_negRDados(Processador proc) {
		return 44;
	}
	public short Get_Endereco_RDados_rec_0(Processador proc) {
		return 45;
	}
	public short Get_Endereco_RDados_rec_shlRDados(Processador proc) {
		return 46;
	}
	public short Get_Endereco_RDados_rec_shrRDados(Processador proc) {
		return 47;
	}
	 /**
	  * Instrucoes R0 recebe algo
	  */ 
	public short Get_Endereco_R0_rec_R0andRY(Processador proc) {
		return 68;
	}
	public short Get_Endereco_R0_rec_R0andR2(Processador proc) {
		return 69;
	}
	public short Get_Endereco_R0_rec_R0andR3(Processador proc) {
		return 70;
	}
	public short Get_Endereco_R0_rec_R0andR4(Processador proc) {
		return 71;
	}
	public short Get_Endereco_R0_rec_R0orRY(Processador proc) {
		return 72;
	}
	public short Get_Endereco_R0_rec_R0orR2(Processador proc) {
		return 73;
	}
	public short Get_Endereco_R0_rec_R0orR3(Processador proc) {
		return 74;
	}
	public short Get_Endereco_R0_rec_R0orR4(Processador proc) {
		return 75;
	}
	public short Get_Endereco_R0_rec_R0maisRY(Processador proc) {
		return 55;
	}
	public short Get_Endereco_R0_rec_R0maisR2(Processador proc) {
		return 56;
	}
	public short Get_Endereco_R0_rec_R0maisR3(Processador proc) {
		return 57;
	}
	public short Get_Endereco_R0_rec_R0maisR4(Processador proc) {
		return 58;
	}
	public short Get_Endereco_R0_rec_RYmenosR0(Processador proc) {
		return 59;
	}
	public short Get_Endereco_R0_rec_R2menosR0(Processador proc) {
		return 60;
	}
	public short Get_Endereco_R0_rec_R3menosR0(Processador proc) {
		return 61;
	}
	public short Get_Endereco_R0_rec_R4menosR0(Processador proc) {
		return 62;
	}
	public short Get_Endereco_R0_rec_RDados(Processador proc) {
		return 63;
	}
	public short Get_Endereco_R0_rec_R1(Processador proc) {
		return 64;
	}
	public short Get_Endereco_R0_rec_R2(Processador proc) {
		return 65;
	}
	public short Get_Endereco_R0_rec_R3(Processador proc) {
		return 66;
	}
	public short Get_Endereco_R0_rec_R4(Processador proc) {
		return 67;
	}
	public short Get_Endereco_R0_rec_notR0(Processador proc) {
		return 76;
	}
	public short Get_Endereco_R0_rec_negR0(Processador proc) {
		return 77;
	}
	public short Get_Endereco_R0_rec_0(Processador proc) {
		return 78;
	}
	public short Get_Endereco_R0_rec_shlR0(Processador proc) {
		return 79;
	}
	public short Get_Endereco_R0_rec_shrR0(Processador proc) {
		return 80;
	}
	 /**
	  * Instrucoes R1 recebe algo
	  */ 
	public short Get_Endereco_R1_rec_R1andRY(Processador proc) {
		return 94;
	}
	public short Get_Endereco_R1_rec_R1andR2(Processador proc) {
		return 95;
	}
	public short Get_Endereco_R1_rec_R1andR3(Processador proc) {
		return 96;
	}
	public short Get_Endereco_R1_rec_R1andR4(Processador proc) {
		return 97;
	}
	public short Get_Endereco_R1_rec_R1orRY(Processador proc) {
		return 98;
	}
	public short Get_Endereco_R1_rec_R1orR2(Processador proc) {
		return 99;
	}
	public short Get_Endereco_R1_rec_R1orR3(Processador proc) {
		return 100;
	}
	public short Get_Endereco_R1_rec_R1orR4(Processador proc) {
		return 101;
	}
	public short Get_Endereco_R1_rec_R1maisRY(Processador proc) {
		return 81;
	}
	public short Get_Endereco_R1_rec_R1maisR2(Processador proc) {
		return 82;
	}
	public short Get_Endereco_R1_rec_R1maisR3(Processador proc) {
		return 83;
	}
	public short Get_Endereco_R1_rec_R1maisR4(Processador proc) {
		return 84;
	}
	public short Get_Endereco_R1_rec_RYmenosR1(Processador proc) {
		return 85;
	}
	public short Get_Endereco_R1_rec_R2menosR1(Processador proc) {
		return 86;
	}
	public short Get_Endereco_R1_rec_R3menosR1(Processador proc) {
		return 87;
	}
	public short Get_Endereco_R1_rec_R4menosR1(Processador proc) {
		return 88;
	}
	public short Get_Endereco_R1_rec_RDados(Processador proc) {
		return 89;
	}
	public short Get_Endereco_R1_rec_R0(Processador proc) {
		return 90;
	}
	public short Get_Endereco_R1_rec_R2(Processador proc) {
		return 91;
	}
	public short Get_Endereco_R1_rec_R3(Processador proc) {
		return 92;
	}
	public short Get_Endereco_R1_rec_R4(Processador proc) {
		return 93;
	}
	public short Get_Endereco_R1_rec_notR1(Processador proc) {
		return 102;
	}
	public short Get_Endereco_R1_rec_negR1(Processador proc) {
		return 103;
	}
	public short Get_Endereco_R1_rec_0(Processador proc) {
		return 104;
	}
	public short Get_Endereco_R1_rec_shlR1(Processador proc) {
		return 105;
	}
	public short Get_Endereco_R1_rec_shrR1(Processador proc) {
		return 106;
	}
	 /**
	  * Instrucoes R2 recebe algo
	  */  
	public short Get_Endereco_R2_rec_R2andRDados(Processador proc) {
		return 120;
	}
	public short Get_Endereco_R2_rec_R2andR0(Processador proc) {
		return 121;
	}
	public short Get_Endereco_R2_rec_R2andR1(Processador proc) {
		return 122;
	}
	public short Get_Endereco_R2_rec_R2andRX(Processador proc) {
		return 123;
	}
	public short Get_Endereco_R2_rec_R2orRDados(Processador proc) {
		return 124;
	}
	public short Get_Endereco_R2_rec_R2orR0(Processador proc) {
		return 125;
	}
	public short Get_Endereco_R2_rec_R2orR1(Processador proc) {
		return 126;
	}
	public short Get_Endereco_R2_rec_R2orRX(Processador proc) {
		return 127;
	}
	public short Get_Endereco_R2_rec_R2maisRDados(Processador proc) {
		return 107;
	}
	public short Get_Endereco_R2_rec_R2maisRX(Processador proc) {
		return 108;
	}
	public short Get_Endereco_R2_rec_R2maisR0(Processador proc) {
		return 109;
	}
	public short Get_Endereco_R2_rec_R2maisR1(Processador proc) {
		return 110;
	}
	public short Get_Endereco_R2_rec_RDadosmenosR2(Processador proc) {
		return 111;
	}
	public short Get_Endereco_R2_rec_RXmenosR2(Processador proc) {
		return 112;
	}
	public short Get_Endereco_R2_rec_R0menosR2(Processador proc) {
		return 113;
	}
	public short Get_Endereco_R2_rec_R1menosR2(Processador proc) {
		return 114;
	}
	public short Get_Endereco_R2_rec_RDados(Processador proc) {
		return 115;
	}
	public short Get_Endereco_R2_rec_R0(Processador proc) {
		return 116;
	}
	public short Get_Endereco_R2_rec_R1(Processador proc) {
		return 117;
	}
	public short Get_Endereco_R2_rec_R3(Processador proc) {
		return 118;
	}
	public short Get_Endereco_R2_rec_R4(Processador proc) {
		return 119;
	}
	public short Get_Endereco_R2_rec_notR2(Processador proc) {
		return 128;
	}
	public short Get_Endereco_R2_rec_negR2(Processador proc) {
		return 129;
	}
	public short Get_Endereco_R2_rec_0(Processador proc) {
		return 130;
	}
	public short Get_Endereco_R2_rec_shlR2(Processador proc) {
		return 131;
	}
	public short Get_Endereco_R2_rec_shrR2(Processador proc) {
		return 132;
	}
	 /**
	  * Instrucoes R3 recebe algo
	  */ 
	public short Get_Endereco_R3_rec_R3andRDados(Processador proc) {
		return 146;
	}
	public short Get_Endereco_R3_rec_R3andR0(Processador proc) {
		return 147;
	}
	public short Get_Endereco_R3_rec_R3andR1(Processador proc) {
		return 148;
	}
	public short Get_Endereco_R3_rec_R3andRX(Processador proc) {
		return 149;
	}
	public short Get_Endereco_R3_rec_R3orRDados(Processador proc) {
		return 150;
	}
	public short Get_Endereco_R3_rec_R3orR0(Processador proc) {
		return 151;
	}
	public short Get_Endereco_R3_rec_R3orR1(Processador proc) {
		return 152;
	}
	public short Get_Endereco_R3_rec_R3orRX(Processador proc) {
		return 153;
	}
	public short Get_Endereco_R3_rec_R3maisRDados(Processador proc) {
		return 133;
	}
	public short Get_Endereco_R3_rec_R3maisRX(Processador proc) {
		return 134;
	}
	public short Get_Endereco_R3_rec_R3maisR0(Processador proc) {
		return 135;
	}
	public short Get_Endereco_R3_rec_R3maisR1(Processador proc) {
		return 136;
	}
	public short Get_Endereco_R3_rec_RDadosmenosR3(Processador proc) {
		return 137;
	}
	public short Get_Endereco_R3_rec_RXmenosR3(Processador proc) {
		return 138;
	}
	public short Get_Endereco_R3_rec_R0menosR3(Processador proc) {
		return 139;
	}
	public short Get_Endereco_R3_rec_R1menosR3(Processador proc) {
		return 140;
	}
	public short Get_Endereco_R3_rec_RDados(Processador proc) {
		return 141;
	}
	public short Get_Endereco_R3_rec_R0(Processador proc) {
		return 142;
	}
	public short Get_Endereco_R3_rec_R1(Processador proc) {
		return 143;
	}
	public short Get_Endereco_R3_rec_R2(Processador proc) {
		return 144;
	}
	public short Get_Endereco_R3_rec_R4(Processador proc) {
		return 145;
	}
	public short Get_Endereco_R3_rec_notR3(Processador proc) {
		return 154;
	}
	public short Get_Endereco_R3_rec_negR3(Processador proc) {
		return 155;
	}
	public short Get_Endereco_R3_rec_0(Processador proc) {
		return 156;
	}
	public short Get_Endereco_R3_rec_shlR3(Processador proc) {
		return 157;
	}
	public short Get_Endereco_R3_rec_shrR3(Processador proc) {
		return 158;
	}
	 /**
	  * Instrucoes R4 recebe algo
	  */ 
	public short Get_Endereco_R4_rec_R4andRDados(Processador proc) {
		return 172;
	}
	public short Get_Endereco_R4_rec_R4andR0(Processador proc) {
		return 173;
	}
	public short Get_Endereco_R4_rec_R4andR1(Processador proc) {
		return 174;
	}
	public short Get_Endereco_R4_rec_R4andRX(Processador proc) {
		return 175;
	}
	public short Get_Endereco_R4_rec_R4orRDados(Processador proc) {
		return 176;
	}
	public short Get_Endereco_R4_rec_R4orR0(Processador proc) {
		return 177;
	}
	public short Get_Endereco_R4_rec_R4orR1(Processador proc) {
		return 178;
	}
	public short Get_Endereco_R4_rec_R4orRX(Processador proc) {
		return 179;
	}
	public short Get_Endereco_R4_rec_R4maisRDados(Processador proc) {
		return 159;
	}
	public short Get_Endereco_R4_rec_R4maisRX(Processador proc) {
		return 160;
	}
	public short Get_Endereco_R4_rec_R4maisR0(Processador proc) {
		return 161;
	}
	public short Get_Endereco_R4_rec_R4maisR1(Processador proc) {
		return 162;
	}
	public short Get_Endereco_R4_rec_RDadosmenosR4(Processador proc) {
		return 163;
	}
	public short Get_Endereco_R4_rec_RXmenosR4(Processador proc) {
		return 164;
	}
	public short Get_Endereco_R4_rec_R0menosR4(Processador proc) {
		return 165;
	}
	public short Get_Endereco_R4_rec_R1menosR4(Processador proc) {
		return 166;
	}
	public short Get_Endereco_R4_rec_RDados(Processador proc) {
		return 167;
	}
	public short Get_Endereco_R4_rec_R0(Processador proc) {
		return 168;
	}
	public short Get_Endereco_R4_rec_R1(Processador proc) {
		return 169;
	}
	public short Get_Endereco_R4_rec_R2(Processador proc) {
		return 170;
	}
	public short Get_Endereco_R4_rec_R3(Processador proc) {
		return 171;
	}
	public short Get_Endereco_R4_rec_notR4(Processador proc) {
		return 180;
	}
	public short Get_Endereco_R4_rec_negR4(Processador proc) {
		return 181;
	}
	public short Get_Endereco_R4_rec_0(Processador proc) {
		return 182;
	}
	public short Get_Endereco_R4_rec_shlR4(Processador proc) {
		return 183;
	}
	public short Get_Endereco_R4_rec_shrR4(Processador proc) {
		return 184;
	}
	 /**
	  * Instrucoes sem recebe
	  */ 
	public short Get_Endereco_RYmenosR0(Processador proc) {
		return 185;
	}
	public short Get_Endereco_R2menosR0(Processador proc) {
		return 186;
	}
	public short Get_Endereco_R3menosR0(Processador proc) {
		return 187;
	}
	public short Get_Endereco_R4menosR0(Processador proc) {
		return 188;
	}
	public short Get_Endereco_RYmenosR1(Processador proc) {
		return 189;
	}
	public short Get_Endereco_R2menosR1(Processador proc) {
		return 190;
	}
	public short Get_Endereco_R3menosR1(Processador proc) {
		return 191;
	}
	public short Get_Endereco_R4menosR1(Processador proc) {
		return 192;
	}
	public short Get_Endereco_RDadosmenosR2(Processador proc) {
		return 193;
	}
	public short Get_Endereco_RXmenosR2(Processador proc) {
		return 194;
	}
	public short Get_Endereco_R0menosR2(Processador proc) {
		return 195;
	}
	public short Get_Endereco_R1menosR2(Processador proc) {
		return 196;
	}
	public short Get_Endereco_RDadosmenosR3(Processador proc) {
		return 197;
	}
	public short Get_Endereco_RXmenosR3(Processador proc) {
		return 198;
	}
	public short Get_Endereco_R0menosR3(Processador proc) {
		return 199;
	}
	public short Get_Endereco_R1menosR3(Processador proc) {
		return 200;
	}
	public short Get_Endereco_RDadosmenosR4(Processador proc) {
		return 201;
	}
	public short Get_Endereco_RXmenosR4(Processador proc) {
		return 202;
	}
	public short Get_Endereco_R0menosR4(Processador proc) {
		return 203;
	}
	public short Get_Endereco_R1menosR4(Processador proc) {
		return 204;
	}
	public short Get_Endereco_RYmenosRDados(Processador proc) {
		return 205;
	}
	public short Get_Endereco_R0menosRY(Processador proc) {
		return 206;
	}
	public short Get_Endereco_R1menosRY(Processador proc) {
		return 207;
	}
	public short Get_Endereco_R2menosRX(Processador proc) {
		return 208;
	}
	public short Get_Endereco_R3menosRX(Processador proc) {
		return 209;
	}
	public short Get_Endereco_R4menosRX(Processador proc) {
		return 210;
	}

	private static short[] cria_Vetor(short mux2[], short mux4[], short mux5[], short ula[], short op1, short op2, short rdest) {
		short vetor[] = new short[TAM_CTRL];

		for (int i = 0; i < TAM_CTRL; i++) {
			vetor[i] = (short) 0;
		}

		if (mux2[0] != NULO) {
			vetor[Uc.L] = mux2[Multiplex2E.L];
		}

		if (mux4[0] != NULO) {
			vetor[Uc.M] = mux4[Multiplex4E.M];
			vetor[Uc.N] = mux4[Multiplex4E.N];	
		}

		if (mux5[0] != NULO) {
			vetor[Uc.O] = mux5[Multiplex5E.O];
			vetor[Uc.P] = mux5[Multiplex5E.P];
			vetor[Uc.Q] = mux5[Multiplex5E.Q];	
		}

		if (ula[0] != NULO) {
			vetor[Uc.R] = ula[Ula.R];
			vetor[Uc.S] = ula[Ula.S];
			vetor[Uc.T] = ula[Ula.T];
			vetor[Uc.U] = ula[Ula.U];
			vetor[Uc.V] = ula[Ula.V];
			vetor[Uc.W] = ula[Ula.W];	
		}

		if (op1 != NULO) {
			vetor[op1] = 1;
		}

		if (op2 != NULO) {
			vetor[op2] = 1;
		}

		if (rdest != NULO) {
			vetor[rdest] = 1;
		}

		return vetor;
	}

}
