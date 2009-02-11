package br.ufrj.dcc.arq.modelo;

public class MicroInstrucoes {
	
	public static final int TAM_END = 6;
	public static final int TAM_CTRL = 24;

	/*
	 * NOMENCLATURA DAS MICROINSTRUCOES:
	 * rec => recebe
	 */
	
	/* Instrucoes PC recebe algo */
	
	public static void PC_rec_PCmais1() {
		
	}
	
	/* Instrucoes IR recebe algo */
	
	public static void IR_rec_RDados() {
		
	}
	
	/* Instrucoes REnd recebe algo */
	
	public static void REnd_rec_PC() {
		
	}
	
	public static void REnd_rec_R0() {
		
	}
	
	public static void REnd_rec_R1() {
		
	}
	
	public static void REnd_rec_R2() {
		
	}
	
	public static void REnd_rec_R3() {
		
	}
	
	public static void REnd_rec_R4() {
		
	}
	
	/* Instrucoes RY recebe algo */
	
	public static void RY_rec_RDados() {
		
	}
	
	public static void RY_rec_R0() {
		
	}
	
	public static void RY_rec_R1() {
		
	}
	
	/* Instrucoes RX recebe algo */
	
	public static void RX_rec_RDados() {
		
	}

	public static void RX_rec_R2() {
		
	}
	
	public static void RX_rec_R3() {
		
	}
	
	public static void RX_rec_R4() {
		
	}
	
	/* Instrucoes RDados recebe algo
	Faltam:

	Rdados ← Rdados - Ry. Esc.
	Rdados ← Ry – R0. Esc.
	Rdados ← Ry - R1. Esc.
	Rdados ← Rx – R2. Esc.
	Rdados ← Rx – R3. Esc.
	Rdados ← Rx – R4. Esc.
	Rdados ← Ry. Esc.
	Rdados ← R0. Esc.
	Rdados ← R1. Esc.
	Rdados ← R2. Esc.
	Rdados ← R3. Esc.
	Rdados ← R4. Esc.
	Rdados ← Ry cmp Rdados. Esc.
	Rdados ← R0 cmp Ry. Esc.
	Rdados ← R1 cmp Ry. Esc.
	Rdados ← R2 cmp Rx. Esc.
	Rdados ← R3 cmp Rx. Esc.
	Rdados ← R4 cmp Rx. Esc.
	Rdados ← Rdados and Ry. Esc.
	Rdados ← R0 and Ry. Esc.
	Rdados ← R1 and Ry. Esc.
	Rdados ← R2 and Rx. Esc.
	Rdados ← R3 and Rx. Esc.
	Rdados ← R4 and Rx. Esc.
	Rdados ← Rdados or Ry. Esc.
	Rdados ← R0 or Ry. Esc.
	Rdados ← R1 or Ry. Esc.
	Rdados ← R2 or Rx. Esc.
	Rdados ← R3 or Rx. Esc.
	Rdados ← R4 or Rx. Esc.
	Rdados ← not Rdados. Esc
	Rdados ← neg Rdados. Esc
	Rdados ← 0. Esc.
	Rdados ← shl Rdados. Esc
	Rdados ← shr Rdados. Esc

*/
	
	public static void RDados_rec_Inflida() {
		
	}
	
	public static void RDados_rec_RY() {
		
	}
	
	public static void RDados_rec_R0maisRY() {
		
	}
	
	public static void RDados_rec_R1maisRY() {
		
	}
	
	public static void RDados_rec_R2maisRX() {
		
	}
	
	public static void RDados_rec_R3maisRX() {
		
	}
	
	public static void RDados_rec_R4maisRX() {
		
	}
}
