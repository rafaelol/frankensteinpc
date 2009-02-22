package br.ufrj.dcc.arq.modelo;

public class MemoriaControle {
	public static final int TAM_END = 6;
	public static final int TAM_CTRL = 24;
	public static final short[] NULOV = {-1};
	public static final short NULO = -1;

	/* ORDEM: MUX2, MUX4, MUX5, ULA, OP1, OP2, RDEST */

	public static final short LE[]							= cria_Vetor(Multiplex2E.PASSAMEM, NULOV, NULOV, NULOV, Uc.J, Uc.X, Uc.B);
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
	public static final short RDADOS_REC_INFLIDA[] 			= cria_Vetor(Multiplex2E.PASSAMEM, NULOV, NULOV, NULOV,Uc.X, NULO, Uc.B);
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
	public static final short RDADOS_REC_RY[] 				= cria_Vetor(Multiplex2E.PASSASULA, NULOV, Multiplex5E.PASSARY, Ula.PASSAA, Uc.I, NULO, Uc.B);
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
	public static final short R2_REC_R2MAISRDADOS[] 		= cria_Vetor(NULOV, Multiplex4E.PASSARDADOS, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.B, Uc.E);
	public static final short R2_REC_R2MAISRX[] 			= cria_Vetor(NULOV, Multiplex4E.PASSARX, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.H, Uc.E);
	public static final short R2_REC_R2MAISR0[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR0, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.C, Uc.E);
	public static final short R2_REC_R2MAISR1[] 			= cria_Vetor(NULOV, Multiplex4E.PASSAR1, Multiplex5E.PASSAR2, Ula.AND, Uc.E, Uc.D, Uc.E);
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

	public void Operar() {
		Multiplex2E mult2 = new Multiplex2E();
		Multiplex4E mult4 = new Multiplex4E();
		Multiplex5E mult5 = new Multiplex5E();
		Ula ula = new Ula();

		mult2.opera();
		mult4.opera();
		mult5.opera();
		ula.opera();
	}

	/*
	 * NOMENCLATURA DAS MICROINSTRUCOES:
	 * rec => recebe
	 */

	/* Instrucoes Le e Escreve */
	public static void Le() {
		Uc.setSinais(LE);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar(); //Acredito que o que vem de Mem do multiplex2E já pega direitinho a posicao da memoria. Se não for, tem que fazer aqui.
	}
	public static void Escreve() {
		Uc.setSinais(ESCREVE);
		// Chama memoria com Memoria.setMemPos(Registrador.rend, Registrador.rdados);
	}

	/* Primeira MicroInstrucao */
	public static void UC_rec_IR(boolean executa_por_micro) {
		Uc.decodificaEChama(Registrador.ri, executa_por_micro);
	}

	/* Instrucoes PC recebe algo */
	public static void PC_rec_PCmais1() {
		Uc.setSinais(PC_REC_PCMAIS1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.pc = Ula.s;
	}

	/* Instrucoes IR recebe algo */
	public static void IR_rec_RDados() {
		Uc.setSinais(IR_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.ri = Ula.s;
	}

	/* Instrucoes REnd recebe algo */
	public static void REnd_rec_PC() {
		Uc.setSinais(REND_REC_PC);
		System.out.println("Foi depois de 1");
		MemoriaControle mem = new MemoriaControle();
		System.out.println("Foi depois de 2");
		mem.Operar();
		System.out.println("Foi depois de 3");
		Registrador.rend = Ula.s;
	}
	public static void REnd_rec_R0() {
		Uc.setSinais(REND_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rend = Ula.s;
	}
	public static void REnd_rec_R1() {
		Uc.setSinais(REND_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rend = Ula.s;
	}
	public static void REnd_rec_R2() {
		Uc.setSinais(REND_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rend = Ula.s;
	}
	public static void REnd_rec_R3() {
		Uc.setSinais(REND_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rend = Ula.s;
	}
	public static void REnd_rec_R4() {
		Uc.setSinais(REND_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rend = Ula.s;
	}
	/* Instrucoes RY recebe algo */
	public static void RY_rec_RDados() {
		Uc.setSinais(RY_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.ry = Ula.s;
	}
	public static void RY_rec_R0() {
		Uc.setSinais(RY_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.ry = Ula.s;
	}
	public static void RY_rec_R1() {
		Uc.setSinais(RY_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.ry = Ula.s;
	}
	/* Instrucoes RX recebe algo */
	public static void RX_rec_RDados() {
		Uc.setSinais(RX_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rx = Ula.s;
	}
	public static void RX_rec_R2() {
		Uc.setSinais(RX_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rx = Ula.s;
	}
	public static void RX_rec_R3() {
		Uc.setSinais(RX_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rx = Ula.s;
	}
	public static void RX_rec_R4() {
		Uc.setSinais(RX_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rx = Ula.s;
	}
	/* Instrucoes RDados recebe algo */
	public static void RDados_rec_Inflida() {
		Uc.setSinais(RDADOS_REC_INFLIDA);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_RDadosmaisRY() {
		Uc.setSinais(RDADOS_REC_RDADOSMAISRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R0maisRY() {
		Uc.setSinais(RDADOS_REC_R0MAISRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R1maisRY() {
		Uc.setSinais(RDADOS_REC_R1MAISRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R2maisRX() {
		Uc.setSinais(RDADOS_REC_R2MAISRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R3maisRX() {
		Uc.setSinais(RDADOS_REC_R3MAISRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R4maisRX() {
		Uc.setSinais(RDADOS_REC_R4MAISRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_RYmenosRDados() {
		Uc.setSinais(RDADOS_REC_RYMENOSRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R0menosRY() {
		Uc.setSinais(RDADOS_REC_R0MENOSRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R1menosRY() {
		Uc.setSinais(RDADOS_REC_R1MENOSRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R2menosRX() {
		Uc.setSinais(RDADOS_REC_R2MENOSRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R3menosRX() {
		Uc.setSinais(RDADOS_REC_R3MENOSRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R4menosRX() {
		Uc.setSinais(RDADOS_REC_R4MENOSRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_RY() {
		Uc.setSinais(RDADOS_REC_RY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R0() {
		Uc.setSinais(RDADOS_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R1() {
		Uc.setSinais(RDADOS_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R2() {
		Uc.setSinais(RDADOS_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R3() {
		Uc.setSinais(RDADOS_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R4() {
		Uc.setSinais(RDADOS_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_RDadosandRY() {
		Uc.setSinais(RDADOS_REC_RDADOSANDRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R0andRY() {
		Uc.setSinais(RDADOS_REC_R0ANDRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R1andRY() {
		Uc.setSinais(RDADOS_REC_R1ANDRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R2andRX() {
		Uc.setSinais(RDADOS_REC_R2ANDRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R3andRX() {
		Uc.setSinais(RDADOS_REC_R3ANDRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R4andRX() {
		Uc.setSinais(RDADOS_REC_R4ANDRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_RDadosorRY() {
		Uc.setSinais(RDADOS_REC_RDADOSORRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R0orRY() {
		Uc.setSinais(RDADOS_REC_R0ORRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R1orRY() {
		Uc.setSinais(RDADOS_REC_R1ORRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R2orRX() {
		Uc.setSinais(RDADOS_REC_R2ORRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R3orRX() {
		Uc.setSinais(RDADOS_REC_R3ORRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_R4orRX() {
		Uc.setSinais(RDADOS_REC_R4ORRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_notRDados() {
		Uc.setSinais(RDADOS_REC_NOTRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_negRDados() {
		Uc.setSinais(RDADOS_REC_NEGRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_0() {
		Uc.setSinais(RDADOS_REC_0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_shlRDados() {
		Uc.setSinais(RDADOS_REC_SHLRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	public static void RDados_rec_shrRDados() {
		Uc.setSinais(RDADOS_REC_SHRRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.rdados = Ula.s;
	}
	/* Instrucoes R0 recebe algo */
	public static void R0_rec_R0andRY() {
		Uc.setSinais(R0_REC_R0ANDRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0andR2() {
		Uc.setSinais(R0_REC_R0ANDR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0andR3() {
		Uc.setSinais(R0_REC_R0ANDR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0andR4() {
		Uc.setSinais(R0_REC_R0ANDR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0orRY() {
		Uc.setSinais(R0_REC_R0ORRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0orR2() {
		Uc.setSinais(R0_REC_R0ORR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0orR3() {
		Uc.setSinais(R0_REC_R0ORR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0orR4() {
		Uc.setSinais(R0_REC_R0ORR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0maisRY() {
		Uc.setSinais(R0_REC_R0MAISRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0maisR2() {
		Uc.setSinais(R0_REC_R0MAISR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0maisR3() {
		Uc.setSinais(R0_REC_R0MAISR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R0maisR4() {
		Uc.setSinais(R0_REC_R0MAISR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_RYmenosR0() {
		Uc.setSinais(R0_REC_RYMENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R2menosR0() {
		Uc.setSinais(R0_REC_R2MENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R3menosR0() {
		Uc.setSinais(R0_REC_R3MENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R4menosR0() {
		Uc.setSinais(R0_REC_R4MENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_RDados() {
		Uc.setSinais(R0_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R1() {
		Uc.setSinais(R0_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R2() {
		Uc.setSinais(R0_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R3() {
		Uc.setSinais(R0_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_R4() {
		Uc.setSinais(R0_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_notR0() {
		Uc.setSinais(R0_REC_NOTR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_negR0() {
		Uc.setSinais(R0_REC_NEGR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_0() {
		Uc.setSinais(R0_REC_0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_shlR0() {
		Uc.setSinais(R0_REC_SHLR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	public static void R0_rec_shrR0() {
		Uc.setSinais(R0_REC_SHRR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r0 = Ula.s;
	}
	/* Instrucoes R1 recebe algo */
	public static void R1_rec_R1andRY() {
		Uc.setSinais(R1_REC_R1ANDRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1andR2() {
		Uc.setSinais(R1_REC_R1ANDR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1andR3() {
		Uc.setSinais(R1_REC_R1ANDR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1andR4() {
		Uc.setSinais(R1_REC_R1ANDR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1orRY() {
		Uc.setSinais(R1_REC_R1ORRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1orR2() {
		Uc.setSinais(R1_REC_R1ORR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1orR3() {
		Uc.setSinais(R1_REC_R1ORR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1orR4() {
		Uc.setSinais(R1_REC_R1ORR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1maisRY() {
		Uc.setSinais(R1_REC_R1MAISRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1maisR2() {
		Uc.setSinais(R1_REC_R1MAISR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1maisR3() {
		Uc.setSinais(R1_REC_R1MAISR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R1maisR4() {
		Uc.setSinais(R1_REC_R1MAISR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_RYmenosR1() {
		Uc.setSinais(R1_REC_RYMENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R2menosR1() {
		Uc.setSinais(R1_REC_R2MENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R3menosR1() {
		Uc.setSinais(R1_REC_R3MENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R4menosR1() {
		Uc.setSinais(R1_REC_R4MENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_RDados() {
		Uc.setSinais(R1_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R0() {
		Uc.setSinais(R1_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R2() {
		Uc.setSinais(R1_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R3() {
		Uc.setSinais(R1_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_R4() {
		Uc.setSinais(R1_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_notR1() {
		Uc.setSinais(R1_REC_NOTR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_negR1() {
		Uc.setSinais(R1_REC_NEGR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_0() {
		Uc.setSinais(R1_REC_0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_shlR1() {
		Uc.setSinais(R1_REC_SHLR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	public static void R1_rec_shrR1() {
		Uc.setSinais(R1_REC_SHRR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r1 = Ula.s;
	}
	/* Instrucoes R2 recebe algo  */
	public static void R2_rec_R2andRDados() {
		Uc.setSinais(R2_REC_R2ANDRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2andR0() {
		Uc.setSinais(R2_REC_R2ANDR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2andR1() {
		Uc.setSinais(R2_REC_R2ANDR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2andRX() {
		Uc.setSinais(R2_REC_R2ANDRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2orRDados() {
		Uc.setSinais(R2_REC_R2ORRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2orR0() {
		Uc.setSinais(R2_REC_R2ORR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2orR1() {
		Uc.setSinais(R2_REC_R2ORR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2orRX() {
		Uc.setSinais(R2_REC_R2ORRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2maisRDados() {
		Uc.setSinais(R2_REC_R2MAISRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2maisRX() {
		Uc.setSinais(R2_REC_R2MAISRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2maisR0() {
		Uc.setSinais(R2_REC_R2MAISR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R2maisR1() {
		Uc.setSinais(R2_REC_R2MAISR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_RDadosmenosR2() {
		Uc.setSinais(R2_REC_RDADOSMENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_RXmenosR2() {
		Uc.setSinais(R2_REC_RXMENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R0menosR2() {
		Uc.setSinais(R2_REC_R0MENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R1menosR2() {
		Uc.setSinais(R2_REC_R1MENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_RDados() {
		Uc.setSinais(R2_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R0() {
		Uc.setSinais(R2_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R1() {
		Uc.setSinais(R2_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R3() {
		Uc.setSinais(R2_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_R4() {
		Uc.setSinais(R2_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_notR2() {
		Uc.setSinais(R2_REC_NOTR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_negR2() {
		Uc.setSinais(R2_REC_NEGR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_0() {
		Uc.setSinais(R2_REC_0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_shlR2() {
		Uc.setSinais(R2_REC_SHLR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	public static void R2_rec_shrR2() {
		Uc.setSinais(R2_REC_SHRR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r2 = Ula.s;
	}
	/* Instrucoes R3 recebe algo */
	public static void R3_rec_R3andRDados() {
		Uc.setSinais(R3_REC_R3ANDRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3andR0() {
		Uc.setSinais(R3_REC_R3ANDR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3andR1() {
		Uc.setSinais(R3_REC_R3ANDR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3andRX() {
		Uc.setSinais(R3_REC_R3ANDRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3orRDados() {
		Uc.setSinais(R3_REC_R3ORRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3orR0() {
		Uc.setSinais(R3_REC_R3ORR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3orR1() {
		Uc.setSinais(R3_REC_R3ORR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3orRX() {
		Uc.setSinais(R3_REC_R3ORRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3maisRDados() {
		Uc.setSinais(R3_REC_R3MAISRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3maisRX() {
		Uc.setSinais(R3_REC_R3MAISRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3maisR0() {
		Uc.setSinais(R3_REC_R3MAISR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R3maisR1() {
		Uc.setSinais(R3_REC_R3MAISR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_RDadosmenosR3() {
		Uc.setSinais(R3_REC_RDADOSMENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_RXmenosR3() {
		Uc.setSinais(R3_REC_RXMENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R0menosR3() {
		Uc.setSinais(R3_REC_R0MENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R1menosR3() {
		Uc.setSinais(R3_REC_R1MENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_RDados() {
		Uc.setSinais(R3_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R0() {
		Uc.setSinais(R3_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R1() {
		Uc.setSinais(R3_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R2() {
		Uc.setSinais(R3_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_R4() {
		Uc.setSinais(R3_REC_R4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_notR3() {
		Uc.setSinais(R3_REC_NOTR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_negR3() {
		Uc.setSinais(R3_REC_NEGR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_0() {
		Uc.setSinais(R3_REC_0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_shlR3() {
		Uc.setSinais(R3_REC_SHLR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	public static void R3_rec_shrR3() {
		Uc.setSinais(R3_REC_SHRR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r3 = Ula.s;
	}
	/* Instrucoes R4 recebe algo */
	public static void R4_rec_R4andRDados() {
		Uc.setSinais(R4_REC_R4ANDRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4andR0() {
		Uc.setSinais(R4_REC_R4ANDR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4andR1() {
		Uc.setSinais(R4_REC_R4ANDR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4andRX() {
		Uc.setSinais(R4_REC_R4ANDRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4orRDados() {
		Uc.setSinais(R4_REC_R4ORRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4orR0() {
		Uc.setSinais(R4_REC_R4ORR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4orR1() {
		Uc.setSinais(R4_REC_R4ORR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4orRX() {
		Uc.setSinais(R4_REC_R4ORRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4maisRDados() {
		Uc.setSinais(R4_REC_R4MAISRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4maisRX() {
		Uc.setSinais(R4_REC_R4MAISRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4maisR0() {
		Uc.setSinais(R4_REC_R4MAISR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R4maisR1() {
		Uc.setSinais(R4_REC_R4MAISR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_RDadosmenosR4() {
		Uc.setSinais(R4_REC_RDADOSMENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_RXmenosR4() {
		Uc.setSinais(R4_REC_RXMENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R0menosR4() {
		Uc.setSinais(R4_REC_R0MENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R1menosR4() {
		Uc.setSinais(R4_REC_R1MENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_RDados() {
		Uc.setSinais(R4_REC_RDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R0() {
		Uc.setSinais(R4_REC_R0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R1() {
		Uc.setSinais(R4_REC_R1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R2() {
		Uc.setSinais(R4_REC_R2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_R3() {
		Uc.setSinais(R4_REC_R3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_notR4() {
		Uc.setSinais(R4_REC_NOTR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_negR4() {
		Uc.setSinais(R4_REC_NEGR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_0() {
		Uc.setSinais(R4_REC_0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_shlR4() {
		Uc.setSinais(R4_REC_SHLR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	public static void R4_rec_shrR4() {
		Uc.setSinais(R4_REC_SHRR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
		Registrador.r4 = Ula.s;
	}
	/* Instrucoes sem recebe */
	public static void RYmenosR0() {
		Uc.setSinais(RYMENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R2menosR0() {
		Uc.setSinais(R2MENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R3menosR0() {
		Uc.setSinais(R3MENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R4menosR0() {
		Uc.setSinais(R4MENOSR0);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RYmenosR1() {
		Uc.setSinais(RYMENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R2menosR1() {
		Uc.setSinais(R2MENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R3menosR1() {
		Uc.setSinais(R3MENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R4menosR1() {
		Uc.setSinais(R4MENOSR1);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RDadosmenosR2() {
		Uc.setSinais(RDADOSMENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RXmenosR2() {
		Uc.setSinais(RXMENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R0menosR2() {
		Uc.setSinais(R0MENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R1menosR2() {
		Uc.setSinais(R1MENOSR2);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RDadosmenosR3() {
		Uc.setSinais(RDADOSMENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RXmenosR3() {
		Uc.setSinais(RXMENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R0menosR3() {
		Uc.setSinais(R0MENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R1menosR3() {
		Uc.setSinais(R1MENOSR3);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RDadosmenosR4() {
		Uc.setSinais(RDADOSMENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RXmenosR4() {
		Uc.setSinais(RXMENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R0menosR4() {
		Uc.setSinais(R0MENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R1menosR4() {
		Uc.setSinais(R1MENOSR4);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void RYmenosRDados() {
		Uc.setSinais(RYMENOSRDADOS);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R0menosRY() {
		Uc.setSinais(R0MENOSRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R1menosRY() {
		Uc.setSinais(R1MENOSRY);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R2menosRX() {
		Uc.setSinais(R2MENOSRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R3menosRX() {
		Uc.setSinais(R3MENOSRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	public static void R4menosRX() {
		Uc.setSinais(R4MENOSRX);
		MemoriaControle mem = new MemoriaControle();
		mem.Operar();
	}
	/*****************
	 * Instruções GET 
	 *****************/
	/* Instrucoes PC recebe algo */
	public static short Get_Endereco_PC_rec_PCmais1() {
		return 211;
	}
	/* Instrucoes IR recebe algo */
	public static short Get_Endereco_IR_rec_RDados() {
		return 212;
	}
	/* Instrucoes REnd recebe algo */
	public static short Get_Endereco_REnd_rec_PC() {
		return 0;
	}
	public static short Get_Endereco_REnd_rec_R0() {
		return 1;
	}
	public static short Get_Endereco_REnd_rec_R1() {
		return 2;
	}
	public static short Get_Endereco_REnd_rec_R2() {
		return 3;
	}
	public static short Get_Endereco_REnd_rec_R3() {
		return 4;
	}
	public static short Get_Endereco_REnd_rec_R4() {
		return 5;
	}
	/* Instrucoes RY recebe algo */
	public static short Get_Endereco_RY_rec_RDados() {
		return 48;
	}
	public static short Get_Endereco_RY_rec_R0() {
		return 49;
	}
	public static short Get_Endereco_RY_rec_R1() {
		return 50;
	}
	/* Instrucoes RX recebe algo */
	public static short Get_Endereco_RX_rec_RDados() {
		return 51;
	}
	public static short Get_Endereco_RX_rec_R2() {
		return 52;
	}
	public static short Get_Endereco_RX_rec_R3() {
		return 53;
	}
	public static short Get_Endereco_RX_rec_R4() {
		return 54;
	}
	/* Instrucoes RDados recebe algo */
	public static short Get_Endereco_RDados_rec_Inflida() {
		return 6;
	}
	public static short Get_Endereco_RDados_rec_RDadosmaisRY() {
		return 7;
	}
	public static short Get_Endereco_RDados_rec_R0maisRY() {
		return 8;
	}
	public static short Get_Endereco_RDados_rec_R1maisRY() {
		return 9;
	}
	public static short Get_Endereco_RDados_rec_R2maisRX() {
		return 10;
	}
	public static short Get_Endereco_RDados_rec_R3maisRX() {
		return 11;
	}
	public static short Get_Endereco_RDados_rec_R4maisRX() {
		return 12;
	}
	public static short Get_Endereco_RDados_rec_RYmenosRDados() {
		return 13;
	}
	public static short Get_Endereco_RDados_rec_R0menosRY() {
		return 14;
	}
	public static short Get_Endereco_RDados_rec_R1menosRY() {
		return 15;
	}
	public static short Get_Endereco_RDados_rec_R2menosRX() {
		return 16;
	}
	public static short Get_Endereco_RDados_rec_R3menosRX() {
		return 17;
	}
	public static short Get_Endereco_RDados_rec_R4menosRX() {
		return 18;
	}
	public static short Get_Endereco_RDados_rec_RY() {
		return 19;
	}
	public static short Get_Endereco_RDados_rec_R0() {
		return 20;
	}
	public static short Get_Endereco_RDados_rec_R1() {
		return 21;
	}
	public static short Get_Endereco_RDados_rec_R2() {
		return 22;
	}
	public static short Get_Endereco_RDados_rec_R3() {
		return 23;
	}
	public static short Get_Endereco_RDados_rec_R4() {
		return 24;
	}
	public static short Get_Endereco_RDados_rec_RDadosandRY() {
		return 31;
	}
	public static short Get_Endereco_RDados_rec_R0andRY() {
		return 32;
	}
	public static short Get_Endereco_RDados_rec_R1andRY() {
		return 33;
	}
	public static short Get_Endereco_RDados_rec_R2andRX() {
		return 34;
	}
	public static short Get_Endereco_RDados_rec_R3andRX() {
		return 35;
	}
	public static short Get_Endereco_RDados_rec_R4andRX() {
		return 36;
	}
	public static short Get_Endereco_RDados_rec_RDadosorRY() {
		return 37;
	}
	public static short Get_Endereco_RDados_rec_R0orRY() {
		return 38;
	}
	public static short Get_Endereco_RDados_rec_R1orRY() {
		return 39;
	}
	public static short Get_Endereco_RDados_rec_R2orRX() {
		return 40;
	}
	public static short Get_Endereco_RDados_rec_R3orRX() {
		return 41;
	}
	public static short Get_Endereco_RDados_rec_R4orRX() {
		return 42;
	}
	public static short Get_Endereco_RDados_rec_notRDados() {
		return 43;
	}
	public static short Get_Endereco_RDados_rec_negRDados() {
		return 44;
	}
	public static short Get_Endereco_RDados_rec_0() {
		return 45;
	}
	public static short Get_Endereco_RDados_rec_shlRDados() {
		return 46;
	}
	public static short Get_Endereco_RDados_rec_shrRDados() {
		return 47;
	}
	/* Instrucoes R0 recebe algo */
	public static short Get_Endereco_R0_rec_R0andRY() {
		return 68;
	}
	public static short Get_Endereco_R0_rec_R0andR2() {
		return 69;
	}
	public static short Get_Endereco_R0_rec_R0andR3() {
		return 70;
	}
	public static short Get_Endereco_R0_rec_R0andR4() {
		return 71;
	}
	public static short Get_Endereco_R0_rec_R0orRY() {
		return 72;
	}
	public static short Get_Endereco_R0_rec_R0orR2() {
		return 73;
	}
	public static short Get_Endereco_R0_rec_R0orR3() {
		return 74;
	}
	public static short Get_Endereco_R0_rec_R0orR4() {
		return 75;
	}
	public static short Get_Endereco_R0_rec_R0maisRY() {
		return 55;
	}
	public static short Get_Endereco_R0_rec_R0maisR2() {
		return 56;
	}
	public static short Get_Endereco_R0_rec_R0maisR3() {
		return 57;
	}
	public static short Get_Endereco_R0_rec_R0maisR4() {
		return 58;
	}
	public static short Get_Endereco_R0_rec_RYmenosR0() {
		return 59;
	}
	public static short Get_Endereco_R0_rec_R2menosR0() {
		return 60;
	}
	public static short Get_Endereco_R0_rec_R3menosR0() {
		return 61;
	}
	public static short Get_Endereco_R0_rec_R4menosR0() {
		return 62;
	}
	public static short Get_Endereco_R0_rec_RDados() {
		return 63;
	}
	public static short Get_Endereco_R0_rec_R1() {
		return 64;
	}
	public static short Get_Endereco_R0_rec_R2() {
		return 65;
	}
	public static short Get_Endereco_R0_rec_R3() {
		return 66;
	}
	public static short Get_Endereco_R0_rec_R4() {
		return 67;
	}
	public static short Get_Endereco_R0_rec_notR0() {
		return 76;
	}
	public static short Get_Endereco_R0_rec_negR0() {
		return 77;
	}
	public static short Get_Endereco_R0_rec_0() {
		return 78;
	}
	public static short Get_Endereco_R0_rec_shlR0() {
		return 79;
	}
	public static short Get_Endereco_R0_rec_shrR0() {
		return 80;
	}
	/* Instrucoes R1 recebe algo */
	public static short Get_Endereco_R1_rec_R1andRY() {
		return 94;
	}
	public static short Get_Endereco_R1_rec_R1andR2() {
		return 95;
	}
	public static short Get_Endereco_R1_rec_R1andR3() {
		return 96;
	}
	public static short Get_Endereco_R1_rec_R1andR4() {
		return 97;
	}
	public static short Get_Endereco_R1_rec_R1orRY() {
		return 98;
	}
	public static short Get_Endereco_R1_rec_R1orR2() {
		return 99;
	}
	public static short Get_Endereco_R1_rec_R1orR3() {
		return 100;
	}
	public static short Get_Endereco_R1_rec_R1orR4() {
		return 101;
	}
	public static short Get_Endereco_R1_rec_R1maisRY() {
		return 81;
	}
	public static short Get_Endereco_R1_rec_R1maisR2() {
		return 82;
	}
	public static short Get_Endereco_R1_rec_R1maisR3() {
		return 83;
	}
	public static short Get_Endereco_R1_rec_R1maisR4() {
		return 84;
	}
	public static short Get_Endereco_R1_rec_RYmenosR1() {
		return 85;
	}
	public static short Get_Endereco_R1_rec_R2menosR1() {
		return 86;
	}
	public static short Get_Endereco_R1_rec_R3menosR1() {
		return 87;
	}
	public static short Get_Endereco_R1_rec_R4menosR1() {
		return 88;
	}
	public static short Get_Endereco_R1_rec_RDados() {
		return 89;
	}
	public static short Get_Endereco_R1_rec_R0() {
		return 90;
	}
	public static short Get_Endereco_R1_rec_R2() {
		return 91;
	}
	public static short Get_Endereco_R1_rec_R3() {
		return 92;
	}
	public static short Get_Endereco_R1_rec_R4() {
		return 93;
	}
	public static short Get_Endereco_R1_rec_notR1() {
		return 102;
	}
	public static short Get_Endereco_R1_rec_negR1() {
		return 103;
	}
	public static short Get_Endereco_R1_rec_0() {
		return 104;
	}
	public static short Get_Endereco_R1_rec_shlR1() {
		return 105;
	}
	public static short Get_Endereco_R1_rec_shrR1() {
		return 106;
	}
	/* Instrucoes R2 recebe algo  */
	public static short Get_Endereco_R2_rec_R2andRDados() {
		return 120;
	}
	public static short Get_Endereco_R2_rec_R2andR0() {
		return 121;
	}
	public static short Get_Endereco_R2_rec_R2andR1() {
		return 122;
	}
	public static short Get_Endereco_R2_rec_R2andRX() {
		return 123;
	}
	public static short Get_Endereco_R2_rec_R2orRDados() {
		return 124;
	}
	public static short Get_Endereco_R2_rec_R2orR0() {
		return 125;
	}
	public static short Get_Endereco_R2_rec_R2orR1() {
		return 126;
	}
	public static short Get_Endereco_R2_rec_R2orRX() {
		return 127;
	}
	public static short Get_Endereco_R2_rec_R2maisRDados() {
		return 107;
	}
	public static short Get_Endereco_R2_rec_R2maisRX() {
		return 108;
	}
	public static short Get_Endereco_R2_rec_R2maisR0() {
		return 109;
	}
	public static short Get_Endereco_R2_rec_R2maisR1() {
		return 110;
	}
	public static short Get_Endereco_R2_rec_RDadosmenosR2() {
		return 111;
	}
	public static short Get_Endereco_R2_rec_RXmenosR2() {
		return 112;
	}
	public static short Get_Endereco_R2_rec_R0menosR2() {
		return 113;
	}
	public static short Get_Endereco_R2_rec_R1menosR2() {
		return 114;
	}
	public static short Get_Endereco_R2_rec_RDados() {
		return 115;
	}
	public static short Get_Endereco_R2_rec_R0() {
		return 116;
	}
	public static short Get_Endereco_R2_rec_R1() {
		return 117;
	}
	public static short Get_Endereco_R2_rec_R3() {
		return 118;
	}
	public static short Get_Endereco_R2_rec_R4() {
		return 119;
	}
	public static short Get_Endereco_R2_rec_notR2() {
		return 128;
	}
	public static short Get_Endereco_R2_rec_negR2() {
		return 129;
	}
	public static short Get_Endereco_R2_rec_0() {
		return 130;
	}
	public static short Get_Endereco_R2_rec_shlR2() {
		return 131;
	}
	public static short Get_Endereco_R2_rec_shrR2() {
		return 132;
	}
	/* Instrucoes R3 recebe algo */
	public static short Get_Endereco_R3_rec_R3andRDados() {
		return 146;
	}
	public static short Get_Endereco_R3_rec_R3andR0() {
		return 147;
	}
	public static short Get_Endereco_R3_rec_R3andR1() {
		return 148;
	}
	public static short Get_Endereco_R3_rec_R3andRX() {
		return 149;
	}
	public static short Get_Endereco_R3_rec_R3orRDados() {
		return 150;
	}
	public static short Get_Endereco_R3_rec_R3orR0() {
		return 151;
	}
	public static short Get_Endereco_R3_rec_R3orR1() {
		return 152;
	}
	public static short Get_Endereco_R3_rec_R3orRX() {
		return 153;
	}
	public static short Get_Endereco_R3_rec_R3maisRDados() {
		return 133;
	}
	public static short Get_Endereco_R3_rec_R3maisRX() {
		return 134;
	}
	public static short Get_Endereco_R3_rec_R3maisR0() {
		return 135;
	}
	public static short Get_Endereco_R3_rec_R3maisR1() {
		return 136;
	}
	public static short Get_Endereco_R3_rec_RDadosmenosR3() {
		return 137;
	}
	public static short Get_Endereco_R3_rec_RXmenosR3() {
		return 138;
	}
	public static short Get_Endereco_R3_rec_R0menosR3() {
		return 139;
	}
	public static short Get_Endereco_R3_rec_R1menosR3() {
		return 140;
	}
	public static short Get_Endereco_R3_rec_RDados() {
		return 141;
	}
	public static short Get_Endereco_R3_rec_R0() {
		return 142;
	}
	public static short Get_Endereco_R3_rec_R1() {
		return 143;
	}
	public static short Get_Endereco_R3_rec_R2() {
		return 144;
	}
	public static short Get_Endereco_R3_rec_R4() {
		return 145;
	}
	public static short Get_Endereco_R3_rec_notR3() {
		return 154;
	}
	public static short Get_Endereco_R3_rec_negR3() {
		return 155;
	}
	public static short Get_Endereco_R3_rec_0() {
		return 156;
	}
	public static short Get_Endereco_R3_rec_shlR3() {
		return 157;
	}
	public static short Get_Endereco_R3_rec_shrR3() {
		return 158;
	}
	/* Instrucoes R4 recebe algo */
	public static short Get_Endereco_R4_rec_R4andRDados() {
		return 172;
	}
	public static short Get_Endereco_R4_rec_R4andR0() {
		return 173;
	}
	public static short Get_Endereco_R4_rec_R4andR1() {
		return 174;
	}
	public static short Get_Endereco_R4_rec_R4andRX() {
		return 175;
	}
	public static short Get_Endereco_R4_rec_R4orRDados() {
		return 176;
	}
	public static short Get_Endereco_R4_rec_R4orR0() {
		return 177;
	}
	public static short Get_Endereco_R4_rec_R4orR1() {
		return 178;
	}
	public static short Get_Endereco_R4_rec_R4orRX() {
		return 179;
	}
	public static short Get_Endereco_R4_rec_R4maisRDados() {
		return 159;
	}
	public static short Get_Endereco_R4_rec_R4maisRX() {
		return 160;
	}
	public static short Get_Endereco_R4_rec_R4maisR0() {
		return 161;
	}
	public static short Get_Endereco_R4_rec_R4maisR1() {
		return 162;
	}
	public static short Get_Endereco_R4_rec_RDadosmenosR4() {
		return 163;
	}
	public static short Get_Endereco_R4_rec_RXmenosR4() {
		return 164;
	}
	public static short Get_Endereco_R4_rec_R0menosR4() {
		return 165;
	}
	public static short Get_Endereco_R4_rec_R1menosR4() {
		return 166;
	}
	public static short Get_Endereco_R4_rec_RDados() {
		return 167;
	}
	public static short Get_Endereco_R4_rec_R0() {
		return 168;
	}
	public static short Get_Endereco_R4_rec_R1() {
		return 169;
	}
	public static short Get_Endereco_R4_rec_R2() {
		return 170;
	}
	public static short Get_Endereco_R4_rec_R3() {
		return 171;
	}
	public static short Get_Endereco_R4_rec_notR4() {
		return 180;
	}
	public static short Get_Endereco_R4_rec_negR4() {
		return 181;
	}
	public static short Get_Endereco_R4_rec_0() {
		return 182;
	}
	public static short Get_Endereco_R4_rec_shlR4() {
		return 183;
	}
	public static short Get_Endereco_R4_rec_shrR4() {
		return 184;
	}
	/* Instrucoes sem recebe */
	public static short Get_Endereco_RYmenosR0() {
		return 185;
	}
	public static short Get_Endereco_R2menosR0() {
		return 186;
	}
	public static short Get_Endereco_R3menosR0() {
		return 187;
	}
	public static short Get_Endereco_R4menosR0() {
		return 188;
	}
	public static short Get_Endereco_RYmenosR1() {
		return 189;
	}
	public static short Get_Endereco_R2menosR1() {
		return 190;
	}
	public static short Get_Endereco_R3menosR1() {
		return 191;
	}
	public static short Get_Endereco_R4menosR1() {
		return 192;
	}
	public static short Get_Endereco_RDadosmenosR2() {
		return 193;
	}
	public static short Get_Endereco_RXmenosR2() {
		return 194;
	}
	public static short Get_Endereco_R0menosR2() {
		return 195;
	}
	public static short Get_Endereco_R1menosR2() {
		return 196;
	}
	public static short Get_Endereco_RDadosmenosR3() {
		return 197;
	}
	public static short Get_Endereco_RXmenosR3() {
		return 198;
	}
	public static short Get_Endereco_R0menosR3() {
		return 199;
	}
	public static short Get_Endereco_R1menosR3() {
		return 200;
	}
	public static short Get_Endereco_RDadosmenosR4() {
		return 201;
	}
	public static short Get_Endereco_RXmenosR4() {
		return 202;
	}
	public static short Get_Endereco_R0menosR4() {
		return 203;
	}
	public static short Get_Endereco_R1menosR4() {
		return 204;
	}
	public static short Get_Endereco_RYmenosRDados() {
		return 205;
	}
	public static short Get_Endereco_R0menosRY() {
		return 206;
	}
	public static short Get_Endereco_R1menosRY() {
		return 207;
	}
	public static short Get_Endereco_R2menosRX() {
		return 208;
	}
	public static short Get_Endereco_R3menosRX() {
		return 209;
	}
	public static short Get_Endereco_R4menosRX() {
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

		/*
		for (int i = 0; i < TAM_CTRL; i++) {

			System.out.println("Vetor[" + i + "] = " + vetor[i]);
		}
		 */
		return vetor;
	}

}
