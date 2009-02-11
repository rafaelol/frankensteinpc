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
	 */
	
	public static void RDados_rec_Inflida() {
		
	}
	
	public static void RDados_rec_RDadosmaisRY() {
		
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
	
	public static void RDados_rec_RDadosmenosRY() {
		
	}
	
	public static void RDados_rec_RYmenosR0() {
		
	}
	
	public static void RDados_rec_RYmenosR1() {
		
	}
	
	public static void RDados_rec_RXmenosR2() {
		
	}
	
	public static void RDados_rec_RXmenosR3() {
		
	}
	
	public static void RDados_rec_RXmenosR4() {
		
	}
	
	public static void RDados_rec_RY() {
		
	}
	
	public static void RDados_rec_R0() {
		
	}
	
	public static void RDados_rec_R1() {
		
	}
	
	public static void RDados_rec_R2() {
		
	}
	
	public static void RDados_rec_R3() {
		
	}
	
	public static void RDados_rec_R4() {
		
	}
	
	public static void RDados_rec_notRDados() {
		
	}
	
	public static void RDados_rec_negRDados() {
		
	}
	
	public static void RDados_rec_0() {
		
	}
	
	public static void RDados_rec_shl() {
		
	}
	
	public static void RDados_rec_shr() {
		
	}
	
	/* Instrucoes R0 recebe algo
	Faltam:

	R0 ← R0 cmp Ry
	R0 ← Ry cmp R0
	R0 ← R2 cmp R0
	R0 ← R3 cmp R0
	R0 ← R4 cmp R0
	R0 ← R0 and Ry
	R0 ← R0 and R2
	R0 ← R0 and R3
	R0 ← R0 and R4
	R0 ← R0 or Ry
	R0 ← R0 or R2
	R0 ← R0 or R3
	R0 ← R0 or R4
	 */

	public static void R0_rec_R0maisRY() {
		
	}
	
	public static void R0_rec_R0maisR2() {
		
	}

	public static void R0_rec_R0maisR3() {
		
	}

	public static void R0_rec_R0maisR4() {
		
	}
	
	public static void R0_rec_R0menosRY() {
		
	}
	
	public static void R0_rec_R0menosR2() {
		
	}

	public static void R0_rec_R0menosR3() {
		
	}

	public static void R0_rec_R0menosR4() {
		
	}

	public static void R0_rec_RDados() {
		
	}
	
	public static void R0_rec_R1() {
		
	}

	public static void R0_rec_R2() {
		
	}

	public static void R0_rec_R3() {
		
	}
	
	public static void R0_rec_R4() {
		
	}
	
	public static void R0_rec_notR0() {
		
	}
	
	public static void R0_rec_negR0() {
		
	}
	
	public static void R0_rec_0() {
		
	}
	
	public static void R0_rec_shl() {
		
	}
	
	public static void R0_rec_shr() {
		
	}
	
	/* Instrucoes R1 recebe algo
	Faltam:

	R1 ← R1 cmp Ry
	R1 ← Ry cmp R1
	R1 ← R2 cmp R1
	R1 ← R3 cmp R1
	R1 ← R4 cmp R1
	R1 ← R1 and Ry
	R1 ← R1 and R2
	R1 ← R1 and R3
	R1 ← R1 and R4
	R1 ← R1 or Ry
	R1 ← R1 or R2
	R1 ← R1 or R3
	R1 ← R1 or R4

	*/

	public static void R1_rec_R1maisRY() {
		
	}
	
	public static void R1_rec_R1maisR2() {
		
	}

	public static void R1_rec_R1maisR3() {
		
	}

	public static void R1_rec_R1maisR4() {
		
	}
	
	public static void R1_rec_R1menosRY() {
		
	}
	
	public static void R1_rec_R1menosR2() {
		
	}

	public static void R1_rec_R1menosR3() {
		
	}

	public static void R1_rec_R1menosR4() {
		
	}

	public static void R1_rec_RDados() {
		
	}
	
	public static void R1_rec_R0() {
		
	}

	public static void R1_rec_R2() {
		
	}

	public static void R1_rec_R3() {
		
	}
	
	public static void R1_rec_R4() {
		
	}
	
	public static void R1_rec_notR1() {
		
	}
	
	public static void R1_rec_negR1() {
		
	}
	
	public static void R1_rec_0() {
		
	}
	
	public static void R1_rec_shl() {
		
	}
	
	public static void R1_rec_shr() {
		
	}
	
	/* Instrucoes R2 recebe algo
	Faltam:
	
	R2 ← R2 cmp Rdados
	R2 ← R0 cmp R2
	R2 ← R1 cmp R2
	R2 ← Rx cmp R2
	R2 ← R2 and Rdados
	R2 ← R2 and R0
	R2 ← R2 and R1
	R2 ← R2 and Rx
	R2 ← R2 or Rdados
	R2 ← R2 or R0
	R2 ← R2 or R1
	R2 ← R2 or Rx
	 */

	public static void R2_rec_R2maisRDados() {
		
	}
	
	public static void R2_rec_R2maisRX() {
		
	}

	public static void R2_rec_R2maisR0() {
		
	}

	public static void R2_rec_R2maisR1() {
		
	}
	
	public static void R2_rec_R2menosRDados() {
		
	}
	
	public static void R2_rec_R2menosRX() {
		
	}

	public static void R2_rec_R2menosR0() {
		
	}

	public static void R2_rec_R2menosR1() {
		
	}

	public static void R2_rec_RDados() {
		
	}
	
	public static void R2_rec_R0() {
		
	}

	public static void R2_rec_R1() {
		
	}

	public static void R2_rec_R3() {
		
	}
	
	public static void R2_rec_R4() {
		
	}
	
	public static void R2_rec_notR2() {
		
	}
	
	public static void R2_rec_negR2() {
		
	}
	
	public static void R2_rec_0() {
		
	}
	
	public static void R2_rec_shl() {
		
	}
	
	public static void R2_rec_shr() {
		
	}
	
	/* Instrucoes R3 recebe algo
	Faltam:

	R3 ← R3 cmp Rdados
	R3 ← R0 cmp R3
	R3 ← R1 cmp R3
	R3 ← Rx cmp R3
	R3 ← R3 and Rdados
	R3 ← R3 and R0
	R3 ← R3 and R1
	R3 ← R3 and Rx
	R3 ← R3 or Rdados
	R3 ← R3 or R0
	R3 ← R3 or R1
	R3 ← R3 or Rx
	*/

	public static void R3_rec_R3maisRDados() {
		
	}
	
	public static void R3_rec_R3maisRX() {
		
	}

	public static void R3_rec_R3maisR0() {
		
	}

	public static void R3_rec_R3maisR1() {
		
	}
	
	public static void R3_rec_R3menosRDados() {
		
	}
	
	public static void R3_rec_R3menosRX() {
		
	}

	public static void R3_rec_R3menosR0() {
		
	}

	public static void R3_rec_R3menosR1() {
		
	}

	public static void R3_rec_RDados() {
		
	}
	
	public static void R3_rec_R0() {
		
	}

	public static void R3_rec_R1() {
		
	}

	public static void R3_rec_R2() {
		
	}
	
	public static void R3_rec_R4() {
		
	}
	
	public static void R3_rec_notR3() {
		
	}
	
	public static void R3_rec_negR3() {
		
	}
	
	public static void R3_rec_0() {
		
	}
	
	public static void R3_rec_shl() {
		
	}
	
	public static void R3_rec_shr() {
		
	}
	
	/* Instrucoes R4 recebe algo
	Faltam:

	R4 ← R4 cmp Rdados
	R4 ← R0 cmp R4
	R4 ← R1 cmp R4
	R4 ← Rx cmp R4
	R4 ← R4 and Rdados
	R4 ← R4 and R0
	R4 ← R4 and R1
	R4 ← R4 and Rx
	R4 ← R4 or Rdados
	R4 ← R4 or R0
	R4 ← R4 or R1
	R4 ← R4 or Rx

	*/

	public static void R4_rec_R4maisRDados() {
		
	}
	
	public static void R4_rec_R4maisRX() {
		
	}

	public static void R4_rec_R4maisR0() {
		
	}

	public static void R4_rec_R4maisR1() {
		
	}
	
	public static void R4_rec_R4menosRDados() {
		
	}
	
	public static void R4_rec_R4menosRX() {
		
	}

	public static void R4_rec_R4menosR0() {
		
	}

	public static void R4_rec_R4menosR1() {
		
	}

	public static void R4_rec_RDados() {
		
	}
	
	public static void R4_rec_R0() {
		
	}

	public static void R4_rec_R1() {
		
	}

	public static void R4_rec_R2() {
		
	}
	
	public static void R4_rec_R3() {
		
	}
	
	public static void R4_rec_notR4() {
		
	}
	
	public static void R4_rec_negR4() {
		
	}
	
	public static void R4_rec_0() {
		
	}
	
	public static void R4_rec_shl() {
		
	}
	
	public static void R4_rec_shr() {
		
	}
}
