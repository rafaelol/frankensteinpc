package br.ufrj.dcc.arq.modelo;

public class Instrucoes {
	
	public static void Cabecalho(boolean executa_por_micro){
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_IR_rec_RDados();
		MemoriaControle.IR_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.UC_rec_IR(executa_por_micro);
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void halt() {
		
	}
	
	/* ==================== Instrucoes ADD ==================== */
	
	public static void addImedR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRDados();
		MemoriaControle.R2_rec_R2maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRDados();
		MemoriaControle.R3_rec_R3maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRDados();
		MemoriaControle.R4_rec_R4maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addImedER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addImedER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addR0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addR0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R2maisR0();
		MemoriaControle.R2_rec_R2maisR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R3maisR0();
		MemoriaControle.R3_rec_R3maisR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R4maisR0();
		MemoriaControle.R4_rec_R4maisR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addR1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
	}
	
	public static void addR1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addR1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R2maisR1();
		MemoriaControle.R2_rec_R2maisR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}
	
	public static void addR1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R3maisR1();
		MemoriaControle.R3_rec_R3maisR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R4maisR1();
		MemoriaControle.R4_rec_R4maisR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0maisR2();
		MemoriaControle.R0_rec_R0maisR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1maisR2();
		MemoriaControle.R1_rec_R1maisR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRX();
		MemoriaControle.R2_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}				
	}
	
	public static void addR2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRX();
		MemoriaControle.R3_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addR2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRX();
		MemoriaControle.R4_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0maisR3();
		MemoriaControle.R0_rec_R0maisR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1maisR3();
		MemoriaControle.R1_rec_R1maisR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRX();
		MemoriaControle.R2_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void addR3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRX();
		MemoriaControle.R3_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRX();
		MemoriaControle.R4_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0maisR4();
		MemoriaControle.R0_rec_R0maisR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1maisR4();
		MemoriaControle.R1_rec_R1maisR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRX();
		MemoriaControle.R2_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRX();
		MemoriaControle.R3_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addR4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRX();
		MemoriaControle.R4_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0maisRY();
		MemoriaControle.RDados_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0maisRY();
		MemoriaControle.RDados_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0maisRY();
		MemoriaControle.RDados_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0maisRY();
		MemoriaControle.RDados_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0maisRY();
		MemoriaControle.RDados_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1maisRY();
		MemoriaControle.RDados_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1maisRY();
		MemoriaControle.RDados_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1maisRY();
		MemoriaControle.RDados_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1maisRY();
		MemoriaControle.RDados_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1maisRY();
		MemoriaControle.RDados_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2maisRX();
		MemoriaControle.RDados_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2maisRX();
		MemoriaControle.RDados_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2maisRX();
		MemoriaControle.RDados_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2maisRX();
		MemoriaControle.RDados_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2maisRX();
		MemoriaControle.RDados_rec_R2maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3maisRX();
		MemoriaControle.RDados_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3maisRX();
		MemoriaControle.RDados_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3maisRX();
		MemoriaControle.RDados_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3maisRX();
		MemoriaControle.RDados_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3maisRX();
		MemoriaControle.RDados_rec_R3maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4maisRX();
		MemoriaControle.RDados_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4maisRX();
		MemoriaControle.RDados_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4maisRX();
		MemoriaControle.RDados_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4maisRX();
		MemoriaControle.RDados_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addR4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4maisRX();
		MemoriaControle.RDados_rec_R4maisRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRDados();
		MemoriaControle.R2_rec_R2maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRDados();
		MemoriaControle.R3_rec_R3maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRDados();
		MemoriaControle.R4_rec_R4maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRDados();
		MemoriaControle.R2_rec_R2maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRDados();
		MemoriaControle.R3_rec_R3maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRDados();
		MemoriaControle.R4_rec_R4maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRDados();
		MemoriaControle.R2_rec_R2maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRDados();
		MemoriaControle.R3_rec_R3maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRDados();
		MemoriaControle.R4_rec_R4maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRDados();
		MemoriaControle.R2_rec_R2maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRDados();
		MemoriaControle.R3_rec_R3maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRDados();
		MemoriaControle.R4_rec_R4maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0maisRY();
		MemoriaControle.R0_rec_R0maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1maisRY();
		MemoriaControle.R1_rec_R1maisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2maisRDados();
		MemoriaControle.R2_rec_R2maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3maisRDados();
		MemoriaControle.R3_rec_R3maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4maisRDados();
		MemoriaControle.R4_rec_R4maisRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void addER0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void addER0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void addER0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void addER4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosmaisRY();
		MemoriaControle.RDados_rec_RDadosmaisRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ==================== Instruções SUB ==================== */
	public static void subImedR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDadosmenosR2();
		MemoriaControle.R2_rec_RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDadosmenosR3();
		MemoriaControle.R3_rec_RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDadosmenosR4();
		MemoriaControle.R4_rec_RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subImedER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subImedER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subR0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subR0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R0menosR2();
		MemoriaControle.R2_rec_R0menosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R0menosR3();
		MemoriaControle.R3_rec_R0menosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R0menosR4();
		MemoriaControle.R4_rec_R0menosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subR1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
	}
	
	public static void subR1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subR1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R1menosR2();
		MemoriaControle.R2_rec_R1menosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}
	
	public static void subR1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R1menosR3();
		MemoriaControle.R3_rec_R1menosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R1menosR4();
		MemoriaControle.R4_rec_R1menosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R2menosR0();
		MemoriaControle.R0_rec_R2menosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R2menosR1();
		MemoriaControle.R1_rec_R2menosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RXmenosR2();
		MemoriaControle.R2_rec_RXmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}				
	}
	
	public static void subR2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RXmenosR3();
		MemoriaControle.R3_rec_RXmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subR2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RXmenosR4();
		MemoriaControle.R4_rec_RXmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R3menosR0();
		MemoriaControle.R0_rec_R3menosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R3menosR1();
		MemoriaControle.R1_rec_R3menosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RXmenosR2();
		MemoriaControle.R2_rec_RXmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void subR3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RXmenosR3();
		MemoriaControle.R3_rec_RXmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RXmenosR4();
		MemoriaControle.R4_rec_RXmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R4menosR0();
		MemoriaControle.R0_rec_R4menosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R4menosR1();
		MemoriaControle.R1_rec_R4menosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RXmenosR2();
		MemoriaControle.R2_rec_RXmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RXmenosR3();
		MemoriaControle.R3_rec_RXmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subR4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RXmenosR4();
		MemoriaControle.R4_rec_RXmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0menosRY();
		MemoriaControle.RDados_rec_R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0menosRY();
		MemoriaControle.RDados_rec_R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0menosRY();
		MemoriaControle.RDados_rec_R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0menosRY();
		MemoriaControle.RDados_rec_R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0menosRY();
		MemoriaControle.RDados_rec_R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1menosRY();
		MemoriaControle.RDados_rec_R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1menosRY();
		MemoriaControle.RDados_rec_R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1menosRY();
		MemoriaControle.RDados_rec_R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1menosRY();
		MemoriaControle.RDados_rec_R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1menosRY();
		MemoriaControle.RDados_rec_R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2menosRX();
		MemoriaControle.RDados_rec_R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2menosRX();
		MemoriaControle.RDados_rec_R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2menosRX();
		MemoriaControle.RDados_rec_R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2menosRX();
		MemoriaControle.RDados_rec_R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2menosRX();
		MemoriaControle.RDados_rec_R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3menosRX();
		MemoriaControle.RDados_rec_R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3menosRX();
		MemoriaControle.RDados_rec_R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3menosRX();
		MemoriaControle.RDados_rec_R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3menosRX();
		MemoriaControle.RDados_rec_R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3menosRX();
		MemoriaControle.RDados_rec_R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4menosRX();
		MemoriaControle.RDados_rec_R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4menosRX();
		MemoriaControle.RDados_rec_R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4menosRX();
		MemoriaControle.RDados_rec_R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4menosRX();
		MemoriaControle.RDados_rec_R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subR4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4menosRX();
		MemoriaControle.RDados_rec_R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDadosmenosR2();
		MemoriaControle.R2_rec_RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDadosmenosR3();
		MemoriaControle.R3_rec_RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDadosmenosR4();
		MemoriaControle.R4_rec_RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDadosmenosR2();
		MemoriaControle.R2_rec_RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDadosmenosR3();
		MemoriaControle.R3_rec_RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDadosmenosR4();
		MemoriaControle.R4_rec_RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDadosmenosR2();
		MemoriaControle.R2_rec_RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDadosmenosR3();
		MemoriaControle.R3_rec_RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDadosmenosR4();
		MemoriaControle.R4_rec_RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDadosmenosR2();
		MemoriaControle.R2_rec_RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDadosmenosR3();
		MemoriaControle.R3_rec_RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDadosmenosR4();
		MemoriaControle.R4_rec_RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RYmenosR0();
		MemoriaControle.R0_rec_RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RYmenosR1();
		MemoriaControle.R1_rec_RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDadosmenosR2();
		MemoriaControle.R2_rec_RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDadosmenosR3();
		MemoriaControle.R3_rec_RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDadosmenosR4();
		MemoriaControle.R4_rec_RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void subER0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void subER0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void subER0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void subER4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RYmenosRDados();
		MemoriaControle.RDados_rec_RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}	
	/* ==================== Instruções MOV ==================== */
	
	public static void movImedR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RDados();
		MemoriaControle.R0_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}
	
	public static void movImedR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RDados();
		MemoriaControle.R1_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDados();
		MemoriaControle.R2_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDados();
		MemoriaControle.R3_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDados();
		MemoriaControle.R4_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RY();
		MemoriaControle.RDados_rec_RY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RY();
		MemoriaControle.RDados_rec_RY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RY();
		MemoriaControle.RDados_rec_RY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RY();
		MemoriaControle.RDados_rec_RY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movImedER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();		
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RY();
		MemoriaControle.RDados_rec_RY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R0();
		MemoriaControle.R1_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}
	
	public static void movR0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R0();
		MemoriaControle.R2_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R0();
		MemoriaControle.R3_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R0();
		MemoriaControle.R4_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R1();
		MemoriaControle.R0_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R1();
		MemoriaControle.R2_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R1();
		MemoriaControle.R3_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R1();
		MemoriaControle.R4_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R2();
		MemoriaControle.R0_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R2();
		MemoriaControle.R1_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R2();
		MemoriaControle.R3_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R2();
		MemoriaControle.R4_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R3();
		MemoriaControle.R0_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R3();
		MemoriaControle.R1_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R3();
		MemoriaControle.R2_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R3();
		MemoriaControle.R4_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R4();
		MemoriaControle.R0_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R4();
		MemoriaControle.R1_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R4();
		MemoriaControle.R2_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R4();
		MemoriaControle.R3_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movR4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0();
		MemoriaControle.RDados_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void movR0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0();
		MemoriaControle.RDados_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void movR0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0();
		MemoriaControle.RDados_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void movR0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0();
		MemoriaControle.RDados_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void movR0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0();
		MemoriaControle.RDados_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void movR1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1();
		MemoriaControle.RDados_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void movR1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1();
		MemoriaControle.RDados_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1();
		MemoriaControle.RDados_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1();
		MemoriaControle.RDados_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1();
		MemoriaControle.RDados_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2();
		MemoriaControle.RDados_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2();
		MemoriaControle.RDados_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2();
		MemoriaControle.RDados_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2();
		MemoriaControle.RDados_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2();
		MemoriaControle.RDados_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3();
		MemoriaControle.RDados_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3();
		MemoriaControle.RDados_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3();
		MemoriaControle.RDados_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3();
		MemoriaControle.RDados_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3();
		MemoriaControle.RDados_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4();
		MemoriaControle.RDados_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4();
		MemoriaControle.RDados_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4();
		MemoriaControle.RDados_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4();
		MemoriaControle.RDados_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movR4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4();
		MemoriaControle.RDados_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0R0(boolean executa_por_micro) {	
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RDados();
		MemoriaControle.R0_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RDados();
		MemoriaControle.R1_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDados();
		MemoriaControle.R2_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDados();
		MemoriaControle.R3_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDados();
		MemoriaControle.R4_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RDados();
		MemoriaControle.R0_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RDados();
		MemoriaControle.R1_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDados();
		MemoriaControle.R2_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDados();
		MemoriaControle.R3_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDados();
		MemoriaControle.R4_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RDados();
		MemoriaControle.R0_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RDados();
		MemoriaControle.R1_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDados();
		MemoriaControle.R2_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDados();
		MemoriaControle.R3_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDados();
		MemoriaControle.R4_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RDados();
		MemoriaControle.R0_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RDados();
		MemoriaControle.R1_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDados();
		MemoriaControle.R2_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDados();
		MemoriaControle.R3_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDados();
		MemoriaControle.R4_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_RDados();
		MemoriaControle.R0_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_RDados();
		MemoriaControle.R1_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_RDados();
		MemoriaControle.R2_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_RDados();
		MemoriaControle.R3_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_RDados();
		MemoriaControle.R4_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void movER0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void movER4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ==================== Instruções CMP ==================== */
	
	public static void cmpImedR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR2();
		MemoriaControle.RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR3();
		MemoriaControle.RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR4();
		MemoriaControle.RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpImedER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpImedER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpR0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpR0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0menosR2();
		MemoriaControle.R0menosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0menosR3();
		MemoriaControle.R0menosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0menosR4();
		MemoriaControle.R0menosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpR1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
		
	}
	
	public static void cmpR1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpR1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1menosR2();
		MemoriaControle.R1menosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}
	
	public static void cmpR1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1menosR3();
		MemoriaControle.R1menosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1menosR4();
		MemoriaControle.R1menosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2menosR0();
		MemoriaControle.R2menosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2menosR1();
		MemoriaControle.R2menosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR2();
		MemoriaControle.RXmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}				
	}
	
	public static void cmpR2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR3();
		MemoriaControle.RXmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpR2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR4();
		MemoriaControle.RXmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3menosR0();
		MemoriaControle.R3menosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3menosR1();
		MemoriaControle.R3menosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR2();
		MemoriaControle.RXmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}		
	}
	
	public static void cmpR3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR3();
		MemoriaControle.RXmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR4();
		MemoriaControle.RXmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4menosR0();
		MemoriaControle.R4menosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4menosR1();
		MemoriaControle.R4menosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR2();
		MemoriaControle.RXmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR3();
		MemoriaControle.RXmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpR4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RXmenosR4();
		MemoriaControle.RXmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0menosRY();
		MemoriaControle.R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0menosRY();
		MemoriaControle.R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0menosRY();
		MemoriaControle.R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0menosRY();
		MemoriaControle.R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0menosRY();
		MemoriaControle.R0menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1menosRY();
		MemoriaControle.R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1menosRY();
		MemoriaControle.R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1menosRY();
		MemoriaControle.R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1menosRY();
		MemoriaControle.R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1menosRY();
		MemoriaControle.R1menosRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2menosRX();
		MemoriaControle.R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2menosRX();
		MemoriaControle.R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2menosRX();
		MemoriaControle.R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2menosRX();
		MemoriaControle.R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2menosRX();
		MemoriaControle.R2menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3menosRX();
		MemoriaControle.R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3menosRX();
		MemoriaControle.R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3menosRX();
		MemoriaControle.R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3menosRX();
		MemoriaControle.R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3menosRX();
		MemoriaControle.R3menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4menosRX();
		MemoriaControle.R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4menosRX();
		MemoriaControle.R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4menosRX();
		MemoriaControle.R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4menosRX();
		MemoriaControle.R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpR4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4menosRX();
		MemoriaControle.R4menosRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR2();
		MemoriaControle.RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR3();
		MemoriaControle.RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR4();
		MemoriaControle.RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR2();
		MemoriaControle.RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR3();
		MemoriaControle.RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR4();
		MemoriaControle.RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR2();
		MemoriaControle.RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR3();
		MemoriaControle.RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR4();
		MemoriaControle.RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR2();
		MemoriaControle.RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR3();
		MemoriaControle.RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR4();
		MemoriaControle.RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR0();
		MemoriaControle.RYmenosR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosR1();
		MemoriaControle.RYmenosR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR2();
		MemoriaControle.RDadosmenosR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR3();
		MemoriaControle.RDadosmenosR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDadosmenosR4();
		MemoriaControle.RDadosmenosR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void cmpER0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void cmpER0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void cmpER0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void cmpER4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RYmenosRDados();
		MemoriaControle.RYmenosRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	/* ==================== Instruções AND ==================== */
	
	public static void andImedR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRDados();
		MemoriaControle.R2_rec_R2andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRDados();
		MemoriaControle.R3_rec_R3andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRDados();
		MemoriaControle.R4_rec_R4andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andImedER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R2andR0();
		MemoriaControle.R2_rec_R2andR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R3andR0();
		MemoriaControle.R3_rec_R3andR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R4andR0();
		MemoriaControle.R4_rec_R4andR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R2andR1();
		MemoriaControle.R2_rec_R2andR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R3andR1();
		MemoriaControle.R3_rec_R3andR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R4andR1();
		MemoriaControle.R4_rec_R4andR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0andR2();
		MemoriaControle.R0_rec_R0andR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1andR2();
		MemoriaControle.R1_rec_R1andR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRX();
		MemoriaControle.R2_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRX();
		MemoriaControle.R3_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRX();
		MemoriaControle.R4_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0andR3();
		MemoriaControle.R0_rec_R0andR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1andR3();
		MemoriaControle.R1_rec_R1andR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRX();
		MemoriaControle.R2_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRX();
		MemoriaControle.R3_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRX();
		MemoriaControle.R4_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0andR4();
		MemoriaControle.R0_rec_R0andR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1andR4();
		MemoriaControle.R1_rec_R1andR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRX();
		MemoriaControle.R2_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRX();
		MemoriaControle.R3_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andR4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRX();
		MemoriaControle.R4_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0andRY();
		MemoriaControle.RDados_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0andRY();
		MemoriaControle.RDados_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0andRY();
		MemoriaControle.RDados_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0andRY();
		MemoriaControle.RDados_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0andRY();
		MemoriaControle.RDados_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1andRY();
		MemoriaControle.RDados_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1andRY();
		MemoriaControle.RDados_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1andRY();
		MemoriaControle.RDados_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1andRY();
		MemoriaControle.RDados_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1andRY();
		MemoriaControle.RDados_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2andRX();
		MemoriaControle.RDados_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2andRX();
		MemoriaControle.RDados_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2andRX();
		MemoriaControle.RDados_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2andRX();
		MemoriaControle.RDados_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2andRX();
		MemoriaControle.RDados_rec_R2andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3andRX();
		MemoriaControle.RDados_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3andRX();
		MemoriaControle.RDados_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3andRX();
		MemoriaControle.RDados_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3andRX();
		MemoriaControle.RDados_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3andRX();
		MemoriaControle.RDados_rec_R3andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4andRX();
		MemoriaControle.RDados_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4andRX();
		MemoriaControle.RDados_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4andRX();
		MemoriaControle.RDados_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4andRX();
		MemoriaControle.RDados_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andR4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4andRX();
		MemoriaControle.RDados_rec_R4andRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRDados();
		MemoriaControle.R2_rec_R2andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRDados();
		MemoriaControle.R3_rec_R3andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRDados();
		MemoriaControle.R4_rec_R4andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRDados();
		MemoriaControle.R2_rec_R2andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRDados();
		MemoriaControle.R3_rec_R3andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRDados();
		MemoriaControle.R4_rec_R4andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRDados();
		MemoriaControle.R2_rec_R2andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRDados();
		MemoriaControle.R3_rec_R3andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRDados();
		MemoriaControle.R4_rec_R4andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRDados();
		MemoriaControle.R2_rec_R2andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRDados();
		MemoriaControle.R3_rec_R3andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRDados();
		MemoriaControle.R4_rec_R4andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0andRY();
		MemoriaControle.R0_rec_R0andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1andRY();
		MemoriaControle.R1_rec_R1andRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2andRDados();
		MemoriaControle.R2_rec_R2andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3andRDados();
		MemoriaControle.R3_rec_R3andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4andRDados();
		MemoriaControle.R4_rec_R4andRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void andER0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void andER0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void andER0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void andER4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosandRY();
		MemoriaControle.RDados_rec_RDadosandRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	/* ==================== Instruções OR ===================== */
	
	public static void orImedR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRDados();
		MemoriaControle.R2_rec_R2orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRDados();
		MemoriaControle.R3_rec_R3orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRDados();
		MemoriaControle.R4_rec_R4orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orImedER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_PC();
		MemoriaControle.REnd_rec_PC();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
			
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}

		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R0();
		MemoriaControle.RY_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R2orR0();
		MemoriaControle.R2_rec_R2orR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R3orR0();
		MemoriaControle.R3_rec_R3orR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R4orR0();
		MemoriaControle.R4_rec_R4orR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RY_rec_R1();
		MemoriaControle.RY_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_R2orR1();
		MemoriaControle.R2_rec_R2orR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_R3orR1();
		MemoriaControle.R3_rec_R3orR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_R4orR1();
		MemoriaControle.R4_rec_R4orR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0orR2();
		MemoriaControle.R0_rec_R0orR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1orR2();
		MemoriaControle.R1_rec_R1orR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRX();
		MemoriaControle.R2_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRX();
		MemoriaControle.R3_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R2();
		MemoriaControle.RX_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRX();
		MemoriaControle.R4_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0orR3();
		MemoriaControle.R0_rec_R0orR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1orR3();
		MemoriaControle.R1_rec_R1orR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRX();
		MemoriaControle.R2_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRX();
		MemoriaControle.R3_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R3();
		MemoriaControle.RX_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRX();
		MemoriaControle.R4_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_R0orR4();
		MemoriaControle.R0_rec_R0orR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_R1orR4();
		MemoriaControle.R1_rec_R1orR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRX();
		MemoriaControle.R2_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRX();
		MemoriaControle.R3_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orR4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_RX_rec_R4();
		MemoriaControle.RX_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRX();
		MemoriaControle.R4_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0orRY();
		MemoriaControle.RDados_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0orRY();
		MemoriaControle.RDados_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0orRY();
		MemoriaControle.RDados_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0orRY();
		MemoriaControle.RDados_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R0orRY();
		MemoriaControle.RDados_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1orRY();
		MemoriaControle.RDados_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1orRY();
		MemoriaControle.RDados_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1orRY();
		MemoriaControle.RDados_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1orRY();
		MemoriaControle.RDados_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R1orRY();
		MemoriaControle.RDados_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2orRX();
		MemoriaControle.RDados_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2orRX();
		MemoriaControle.RDados_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2orRX();
		MemoriaControle.RDados_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2orRX();
		MemoriaControle.RDados_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R2orRX();
		MemoriaControle.RDados_rec_R2orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3orRX();
		MemoriaControle.RDados_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3orRX();
		MemoriaControle.RDados_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3orRX();
		MemoriaControle.RDados_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3orRX();
		MemoriaControle.RDados_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R3orRX();
		MemoriaControle.RDados_rec_R3orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4orRX();
		MemoriaControle.RDados_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4orRX();
		MemoriaControle.RDados_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4orRX();
		MemoriaControle.RDados_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4orRX();
		MemoriaControle.RDados_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orR4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RX_rec_RDados();
		MemoriaControle.RX_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_R4orRX();
		MemoriaControle.RDados_rec_R4orRX();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRDados();
		MemoriaControle.R2_rec_R2orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRDados();
		MemoriaControle.R3_rec_R3orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRDados();
		MemoriaControle.R4_rec_R4orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRDados();
		MemoriaControle.R2_rec_R2orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRDados();
		MemoriaControle.R3_rec_R3orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRDados();
		MemoriaControle.R4_rec_R4orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRDados();
		MemoriaControle.R2_rec_R2orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRDados();
		MemoriaControle.R3_rec_R3orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRDados();
		MemoriaControle.R4_rec_R4orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRDados();
		MemoriaControle.R2_rec_R2orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRDados();
		MemoriaControle.R3_rec_R3orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRDados();
		MemoriaControle.R4_rec_R4orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4R0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R0_rec_R0orRY();
		MemoriaControle.R0_rec_R0orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4R1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();	
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R1_rec_R1orRY();
		MemoriaControle.R1_rec_R1orRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4R2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R2_rec_R2orRDados();
		MemoriaControle.R2_rec_R2orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4R3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R3_rec_R3orRDados();
		MemoriaControle.R3_rec_R3orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4R4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_R4_rec_R4orRDados();
		MemoriaControle.R4_rec_R4orRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	public static void orER0ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void orER0ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
	}

	public static void orER0ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER0ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER1ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER2ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER3ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4ER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4ER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4ER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4ER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void orER4ER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RY_rec_RDados();
		MemoriaControle.RY_rec_RDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_RDadosorRY();
		MemoriaControle.RDados_rec_RDadosorRY();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ==================== Instruções NOT ==================== */
	
	public static void notR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_notR0();
		MemoriaControle.R0_rec_notR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_notR1();
		MemoriaControle.R1_rec_notR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_notR2();
		MemoriaControle.R2_rec_notR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_notR3();
		MemoriaControle.R3_rec_notR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_notR4();
		MemoriaControle.R4_rec_notR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_notRDados();
		MemoriaControle.RDados_rec_notRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_notRDados();
		MemoriaControle.RDados_rec_notRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_notRDados();
		MemoriaControle.RDados_rec_notRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_notRDados();
		MemoriaControle.RDados_rec_notRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void notER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_notRDados();
		MemoriaControle.RDados_rec_notRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ==================== Instruções NEG ==================== */
	
	public static void negR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_negR0();
		MemoriaControle.R0_rec_negR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_negR1();
		MemoriaControle.R1_rec_negR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_negR2();
		MemoriaControle.R2_rec_negR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_negR3();
		MemoriaControle.R3_rec_negR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_negR4();
		MemoriaControle.R4_rec_negR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_negRDados();
		MemoriaControle.RDados_rec_negRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_negRDados();
		MemoriaControle.RDados_rec_negRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_negRDados();
		MemoriaControle.RDados_rec_negRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_negRDados();
		MemoriaControle.RDados_rec_negRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void negER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_negRDados();
		MemoriaControle.RDados_rec_negRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ==================== Instruções CLR ==================== */
	
	public static void clrR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_0();
		MemoriaControle.R0_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_0();
		MemoriaControle.R1_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_0();
		MemoriaControle.R2_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_0();
		MemoriaControle.R3_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_0();
		MemoriaControle.R4_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_0();
		MemoriaControle.RDados_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_0();
		MemoriaControle.RDados_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_0();
		MemoriaControle.RDados_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_0();
		MemoriaControle.RDados_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void clrER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_0();
		MemoriaControle.RDados_rec_0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}
	
	/* ==================== Instruções SHL ==================== */
	
	public static void shlR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_shlR0();
		MemoriaControle.R0_rec_shlR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_shlR1();
		MemoriaControle.R1_rec_shlR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_shlR2();
		MemoriaControle.R2_rec_shlR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_shlR3();
		MemoriaControle.R3_rec_shlR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_shlR4();
		MemoriaControle.R4_rec_shlR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shlRDados();
		MemoriaControle.RDados_rec_shlRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shlRDados();
		MemoriaControle.RDados_rec_shlRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shlRDados();
		MemoriaControle.RDados_rec_shlRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shlRDados();
		MemoriaControle.RDados_rec_shlRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shlER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shlRDados();
		MemoriaControle.RDados_rec_shlRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ==================== Instruções SHR ==================== */
	
	public static void shrR0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R0_rec_shrR0();
		MemoriaControle.R0_rec_shrR0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrR1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R1_rec_shrR1();
		MemoriaControle.R1_rec_shrR1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrR2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R2_rec_shrR2();
		MemoriaControle.R2_rec_shrR2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrR3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R3_rec_shrR3();
		MemoriaControle.R3_rec_shrR3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrR4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_R4_rec_shrR4();
		MemoriaControle.R4_rec_shrR4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrER0(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R0();
		MemoriaControle.REnd_rec_R0();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shrRDados();
		MemoriaControle.RDados_rec_shrRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrER1(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R1();
		MemoriaControle.REnd_rec_R1();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shrRDados();
		MemoriaControle.RDados_rec_shrRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrER2(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R2();
		MemoriaControle.REnd_rec_R2();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shrRDados();
		MemoriaControle.RDados_rec_shrRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrER3(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R3();
		MemoriaControle.REnd_rec_R3();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shrRDados();
		MemoriaControle.RDados_rec_shrRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	public static void shrER4(boolean executa_por_micro) {
		MemoriaControle.Get_Endereco_REnd_rec_R4();
		MemoriaControle.REnd_rec_R4();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Le();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_Inflida();
		MemoriaControle.RDados_rec_Inflida();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_RDados_rec_shrRDados();
		MemoriaControle.RDados_rec_shrRDados();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Escreve();
		while (executa_por_micro) {
			//espera proximo clique
		}
		
		MemoriaControle.Get_Endereco_PC_rec_PCmais1();
		MemoriaControle.PC_rec_PCmais1();
		while (executa_por_micro) {
			//espera proximo clique
		}
	}

	/* ================ Instrucoes de Desvio ==================== */
	
	public static void brz(boolean executa_por_micro) {
		
	}

	public static void brn(boolean executa_por_micro) {
		
	}

	public static void bre(boolean executa_por_micro) {
		
	}

	public static void brl(boolean executa_por_micro) {
		
	}

	public static void brg(boolean executa_por_micro) {
		
	}

	public static void brc(boolean executa_por_micro) {
		
	}

	public static void jmp(boolean executa_por_micro) {
		
	}
}