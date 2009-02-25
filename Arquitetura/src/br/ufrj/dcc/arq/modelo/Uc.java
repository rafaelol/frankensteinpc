package br.ufrj.dcc.arq.modelo;

public class Uc {
	public static final short A = 0;
	public static final short B = 1;
	public static final short C = 2;
	public static final short D = 3;
	public static final short E = 4;
	public static final short F = 5;
	public static final short G = 6;
	public static final short H = 7;
	public static final short I = 8;
	public static final short J = 9;
	public static final short K = 10;
	public static final short L = 11;
	public static final short M = 12;
	public static final short N = 13;
	public static final short O = 14;
	public static final short P = 15;
	public static final short Q = 16;
	public static final short R = 17;
	public static final short S = 18;
	public static final short T = 19;
	public static final short U = 20;
	public static final short V = 21;
	public static final short W = 22;
	public static final short X = 23;
	
	public static int renduc;
	public Bit sinais[] = new Bit[MemoriaControle.TAM_CTRL];

	/****************************************************/
	/****************************************************/
	
	public Uc() {
		for(int i=0; i < MemoriaControle.TAM_CTRL; i++) {
			sinais[i] = new Bit((short)0);
		}
				
		renduc = 0;
	}
	
	/****************************************************/
	/****************************************************/
	
	public short[] getSinais() {
		short vet[] =  {sinais[A].getValor(), sinais[B].getValor(),	sinais[C].getValor(),
			    		sinais[D].getValor(), sinais[E].getValor(), sinais[F].getValor(),
			    		sinais[G].getValor(), sinais[H].getValor(), sinais[I].getValor(),
			    		sinais[J].getValor(), sinais[K].getValor(), sinais[L].getValor(),
			    		sinais[M].getValor(), sinais[N].getValor(), sinais[O].getValor(),
			    		sinais[P].getValor(), sinais[Q].getValor(), sinais[R].getValor(),
			    		sinais[S].getValor(), sinais[T].getValor(), sinais[U].getValor(),
			    		sinais[V].getValor(), sinais[W].getValor(), sinais[X].getValor(),
					   };
		
		return vet;
	}

	public void setSinais(short[] v) {
		sinais[A].setValor(v[A]); sinais[B].setValor(v[B]); sinais[C].setValor(v[C]);
		sinais[D].setValor(v[D]); sinais[E].setValor(v[E]); sinais[F].setValor(v[F]);
		sinais[G].setValor(v[G]); sinais[H].setValor(v[H]); sinais[I].setValor(v[I]);
		sinais[J].setValor(v[J]); sinais[K].setValor(v[K]); sinais[L].setValor(v[L]);
		sinais[M].setValor(v[M]); sinais[N].setValor(v[N]); sinais[O].setValor(v[O]);
		sinais[P].setValor(v[P]); sinais[Q].setValor(v[Q]); sinais[R].setValor(v[R]);
		sinais[S].setValor(v[S]); sinais[T].setValor(v[T]); sinais[U].setValor(v[U]);
		sinais[V].setValor(v[V]); sinais[W].setValor(v[W]); sinais[X].setValor(v[X]);
		
	}
	
	
/* ========================== Operar ======================== */
	
	public void decodificaEChama(int cod, boolean executa_por_micro, Processador proc) {
		switch(cod) {
	/* ==================== Instrucoes ADD ==================== */

		case   0: { Instrucoes.halt(executa_por_micro, proc); break; }
		case   1: { Instrucoes.addImedR0(executa_por_micro, proc); break; }
		case   2: { Instrucoes.addImedR1(executa_por_micro, proc); break; }
		case   3: { Instrucoes.addImedR2(executa_por_micro, proc); break; }
		case   4: { Instrucoes.addImedR3(executa_por_micro, proc); break; }
		case   5: { Instrucoes.addImedR4(executa_por_micro, proc); break; }
		case   6: { Instrucoes.addImedER0(executa_por_micro, proc); break; }
		case   7: { Instrucoes.addImedER1(executa_por_micro, proc); break; }
		case   8: { Instrucoes.addImedER2(executa_por_micro, proc); break; }
		case   9: { Instrucoes.addImedER3(executa_por_micro, proc); break; }
		case  10: { Instrucoes.addImedER4(executa_por_micro, proc); break; }

		case  11: { Instrucoes.addR0R0(executa_por_micro, proc); break; }
		case  12: { Instrucoes.addR0R1(executa_por_micro, proc); break; }
		case  13: { Instrucoes.addR0R2(executa_por_micro, proc); break; }
		case  14: { Instrucoes.addR0R3(executa_por_micro, proc); break; }
		case  15: { Instrucoes.addR0R4(executa_por_micro, proc); break; }
		case  16: { Instrucoes.addR1R0(executa_por_micro, proc); break; }
		case  17: { Instrucoes.addR1R1(executa_por_micro, proc); break; }
		case  18: { Instrucoes.addR1R2(executa_por_micro, proc); break; }
		case  19: { Instrucoes.addR1R3(executa_por_micro, proc); break; }
		case  20: { Instrucoes.addR1R4(executa_por_micro, proc); break; }
		case  21: { Instrucoes.addR2R0(executa_por_micro, proc); break; }
		case  22: { Instrucoes.addR2R1(executa_por_micro, proc); break; }
		case  23: { Instrucoes.addR2R2(executa_por_micro, proc); break; }
		case  24: { Instrucoes.addR2R3(executa_por_micro, proc); break; }
		case  25: { Instrucoes.addR2R4(executa_por_micro, proc); break; }
		case  26: { Instrucoes.addR3R0(executa_por_micro, proc); break; }
		case  27: { Instrucoes.addR3R1(executa_por_micro, proc); break; }
		case  28: { Instrucoes.addR3R2(executa_por_micro, proc); break; }
		case  29: { Instrucoes.addR3R3(executa_por_micro, proc); break; }
		case  30: { Instrucoes.addR3R4(executa_por_micro, proc); break; }
		case  31: { Instrucoes.addR4R0(executa_por_micro, proc); break; }
		case  32: { Instrucoes.addR4R1(executa_por_micro, proc); break; }
		case  33: { Instrucoes.addR4R2(executa_por_micro, proc); break; }
		case  34: { Instrucoes.addR4R3(executa_por_micro, proc); break; }
		case  35: { Instrucoes.addR4R4(executa_por_micro, proc); break; }

		case  36: { Instrucoes.addR0ER0(executa_por_micro, proc); break; }
		case  37: { Instrucoes.addR0ER1(executa_por_micro, proc); break; }
		case  38: { Instrucoes.addR0ER2(executa_por_micro, proc); break; }
		case  39: { Instrucoes.addR0ER3(executa_por_micro, proc); break; }
		case  40: { Instrucoes.addR0ER4(executa_por_micro, proc); break; }
		case  41: { Instrucoes.addR1ER0(executa_por_micro, proc); break; }
		case  42: { Instrucoes.addR1ER1(executa_por_micro, proc); break; }
		case  43: { Instrucoes.addR1ER2(executa_por_micro, proc); break; }
		case  44: { Instrucoes.addR1ER3(executa_por_micro, proc); break; }
		case  45: { Instrucoes.addR1ER4(executa_por_micro, proc); break; }
		case  46: { Instrucoes.addR2ER0(executa_por_micro, proc); break; }
		case  47: { Instrucoes.addR2ER1(executa_por_micro, proc); break; }
		case  48: { Instrucoes.addR2ER2(executa_por_micro, proc); break; }
		case  49: { Instrucoes.addR2ER3(executa_por_micro, proc); break; }
		case  50: { Instrucoes.addR2ER4(executa_por_micro, proc); break; }
		case  51: { Instrucoes.addR3ER0(executa_por_micro, proc); break; }
		case  52: { Instrucoes.addR3ER1(executa_por_micro, proc); break; }
		case  53: { Instrucoes.addR3ER2(executa_por_micro, proc); break; }
		case  54: { Instrucoes.addR3ER3(executa_por_micro, proc); break; }
		case  55: { Instrucoes.addR3ER4(executa_por_micro, proc); break; }
		case  56: { Instrucoes.addR4ER0(executa_por_micro, proc); break; }
		case  57: { Instrucoes.addR4ER1(executa_por_micro, proc); break; }
		case  58: { Instrucoes.addR4ER2(executa_por_micro, proc); break; }
		case  59: { Instrucoes.addR4ER3(executa_por_micro, proc); break; }
		case  60: { Instrucoes.addR4ER4(executa_por_micro, proc); break; }

		case  61: { Instrucoes.addER0R0(executa_por_micro, proc); break; }
		case  62: { Instrucoes.addER0R1(executa_por_micro, proc); break; }
		case  63: { Instrucoes.addER0R2(executa_por_micro, proc); break; }
		case  64: { Instrucoes.addER0R3(executa_por_micro, proc); break; }
		case  65: { Instrucoes.addER0R4(executa_por_micro, proc); break; }
		case  66: { Instrucoes.addER1R0(executa_por_micro, proc); break; }
		case  67: { Instrucoes.addER1R1(executa_por_micro, proc); break; }
		case  68: { Instrucoes.addER1R2(executa_por_micro, proc); break; }
		case  69: { Instrucoes.addER1R3(executa_por_micro, proc); break; }
		case  70: { Instrucoes.addER1R4(executa_por_micro, proc); break; }
		case  71: { Instrucoes.addER2R0(executa_por_micro, proc); break; }
		case  72: { Instrucoes.addER2R1(executa_por_micro, proc); break; }
		case  73: { Instrucoes.addER2R2(executa_por_micro, proc); break; }
		case  74: { Instrucoes.addER2R3(executa_por_micro, proc); break; }
		case  75: { Instrucoes.addER2R4(executa_por_micro, proc); break; }
		case  76: { Instrucoes.addER3R0(executa_por_micro, proc); break; }
		case  77: { Instrucoes.addER3R1(executa_por_micro, proc); break; }
		case  78: { Instrucoes.addER3R2(executa_por_micro, proc); break; }
		case  79: { Instrucoes.addER3R3(executa_por_micro, proc); break; }
		case  80: { Instrucoes.addER3R4(executa_por_micro, proc); break; }
		case  81: { Instrucoes.addER4R0(executa_por_micro, proc); break; }
		case  82: { Instrucoes.addER4R1(executa_por_micro, proc); break; }
		case  83: { Instrucoes.addER4R2(executa_por_micro, proc); break; }
		case  84: { Instrucoes.addER4R3(executa_por_micro, proc); break; }
		case  85: { Instrucoes.addER4R4(executa_por_micro, proc); break; }

		case  86: { Instrucoes.addER0ER0(executa_por_micro, proc); break; }
		case  87: { Instrucoes.addER0ER1(executa_por_micro, proc); break; }
		case  88: { Instrucoes.addER0ER2(executa_por_micro, proc); break; }
		case  89: { Instrucoes.addER0ER3(executa_por_micro, proc); break; }
		case  90: { Instrucoes.addER0ER4(executa_por_micro, proc); break; }
		case  91: { Instrucoes.addER1ER0(executa_por_micro, proc); break; }
		case  92: { Instrucoes.addER1ER1(executa_por_micro, proc); break; }
		case  93: { Instrucoes.addER1ER2(executa_por_micro, proc); break; }
		case  94: { Instrucoes.addER1ER3(executa_por_micro, proc); break; }
		case  95: { Instrucoes.addER1ER4(executa_por_micro, proc); break; }
		case  96: { Instrucoes.addER2ER0(executa_por_micro, proc); break; }
		case  97: { Instrucoes.addER2ER1(executa_por_micro, proc); break; }
		case  98: { Instrucoes.addER2ER2(executa_por_micro, proc); break; }
		case  99: { Instrucoes.addER2ER3(executa_por_micro, proc); break; }
		case 100: { Instrucoes.addER2ER4(executa_por_micro, proc); break; }
		case 101: { Instrucoes.addER3ER0(executa_por_micro, proc); break; }
		case 102: { Instrucoes.addER3ER1(executa_por_micro, proc); break; }
		case 103: { Instrucoes.addER3ER2(executa_por_micro, proc); break; }
		case 104: { Instrucoes.addER3ER3(executa_por_micro, proc); break; }
		case 105: { Instrucoes.addER3ER4(executa_por_micro, proc); break; }
		case 106: { Instrucoes.addER4ER0(executa_por_micro, proc); break; }
		case 107: { Instrucoes.addER4ER1(executa_por_micro, proc); break; }
		case 108: { Instrucoes.addER4ER2(executa_por_micro, proc); break; }
		case 109: { Instrucoes.addER4ER3(executa_por_micro, proc); break; }
		case 110: { Instrucoes.addER4ER4(executa_por_micro, proc); break; }

		/* ==================== Instruções SUB ==================== */

		case 111: { Instrucoes.subImedR0(executa_por_micro, proc); break; }
		case 112: { Instrucoes.subImedR1(executa_por_micro, proc); break; }
		case 113: { Instrucoes.subImedR2(executa_por_micro, proc); break; }
		case 114: { Instrucoes.subImedR3(executa_por_micro, proc); break; }
		case 115: { Instrucoes.subImedR4(executa_por_micro, proc); break; }
		case 116: { Instrucoes.subImedER0(executa_por_micro, proc); break; }
		case 117: { Instrucoes.subImedER1(executa_por_micro, proc); break; }
		case 118: { Instrucoes.subImedER2(executa_por_micro, proc); break; }
		case 119: { Instrucoes.subImedER3(executa_por_micro, proc); break; }
		case 120: { Instrucoes.subImedER4(executa_por_micro, proc); break; }

		case 121: { Instrucoes.subR0R0(executa_por_micro, proc); break; }
		case 122: { Instrucoes.subR0R1(executa_por_micro, proc); break; }
		case 123: { Instrucoes.subR0R2(executa_por_micro, proc); break; }
		case 124: { Instrucoes.subR0R3(executa_por_micro, proc); break; }
		case 125: { Instrucoes.subR0R4(executa_por_micro, proc); break; }
		case 126: { Instrucoes.subR1R0(executa_por_micro, proc); break; }
		case 127: { Instrucoes.subR1R1(executa_por_micro, proc); break; }
		case 128: { Instrucoes.subR1R2(executa_por_micro, proc); break; }
		case 129: { Instrucoes.subR1R3(executa_por_micro, proc); break; }
		case 130: { Instrucoes.subR1R4(executa_por_micro, proc); break; }
		case 131: { Instrucoes.subR2R0(executa_por_micro, proc); break; }
		case 132: { Instrucoes.subR2R1(executa_por_micro, proc); break; }
		case 133: { Instrucoes.subR2R2(executa_por_micro, proc); break; }
		case 134: { Instrucoes.subR2R3(executa_por_micro, proc); break; }
		case 135: { Instrucoes.subR2R4(executa_por_micro, proc); break; }
		case 136: { Instrucoes.subR3R0(executa_por_micro, proc); break; }
		case 137: { Instrucoes.subR3R1(executa_por_micro, proc); break; }
		case 138: { Instrucoes.subR3R2(executa_por_micro, proc); break; }
		case 139: { Instrucoes.subR3R3(executa_por_micro, proc); break; }
		case 140: { Instrucoes.subR3R4(executa_por_micro, proc); break; }
		case 141: { Instrucoes.subR4R0(executa_por_micro, proc); break; }
		case 142: { Instrucoes.subR4R1(executa_por_micro, proc); break; }
		case 143: { Instrucoes.subR4R2(executa_por_micro, proc); break; }
		case 144: { Instrucoes.subR4R3(executa_por_micro, proc); break; }
		case 145: { Instrucoes.subR4R4(executa_por_micro, proc); break; }

		case 146: { Instrucoes.subR0ER0(executa_por_micro, proc); break; }
		case 147: { Instrucoes.subR0ER1(executa_por_micro, proc); break; }
		case 148: { Instrucoes.subR0ER2(executa_por_micro, proc); break; }
		case 149: { Instrucoes.subR0ER3(executa_por_micro, proc); break; }
		case 150: { Instrucoes.subR0ER4(executa_por_micro, proc); break; }
		case 151: { Instrucoes.subR1ER0(executa_por_micro, proc); break; }
		case 152: { Instrucoes.subR1ER1(executa_por_micro, proc); break; }
		case 153: { Instrucoes.subR1ER2(executa_por_micro, proc); break; }
		case 154: { Instrucoes.subR1ER3(executa_por_micro, proc); break; }
		case 155: { Instrucoes.subR1ER4(executa_por_micro, proc); break; }
		case 156: { Instrucoes.subR2ER0(executa_por_micro, proc); break; }
		case 157: { Instrucoes.subR2ER1(executa_por_micro, proc); break; }
		case 158: { Instrucoes.subR2ER2(executa_por_micro, proc); break; }
		case 159: { Instrucoes.subR2ER3(executa_por_micro, proc); break; }
		case 160: { Instrucoes.subR2ER4(executa_por_micro, proc); break; }
		case 161: { Instrucoes.subR3ER0(executa_por_micro, proc); break; }
		case 162: { Instrucoes.subR3ER1(executa_por_micro, proc); break; }
		case 163: { Instrucoes.subR3ER2(executa_por_micro, proc); break; }
		case 164: { Instrucoes.subR3ER3(executa_por_micro, proc); break; }
		case 165: { Instrucoes.subR3ER4(executa_por_micro, proc); break; }
		case 166: { Instrucoes.subR4ER0(executa_por_micro, proc); break; }
		case 167: { Instrucoes.subR4ER1(executa_por_micro, proc); break; }
		case 168: { Instrucoes.subR4ER2(executa_por_micro, proc); break; }
		case 169: { Instrucoes.subR4ER3(executa_por_micro, proc); break; }
		case 170: { Instrucoes.subR4ER4(executa_por_micro, proc); break; }

		case 171: { Instrucoes.subER0R0(executa_por_micro, proc); break; }
		case 172: { Instrucoes.subER0R1(executa_por_micro, proc); break; }
		case 173: { Instrucoes.subER0R2(executa_por_micro, proc); break; }
		case 174: { Instrucoes.subER0R3(executa_por_micro, proc); break; }
		case 175: { Instrucoes.subER0R4(executa_por_micro, proc); break; }
		case 176: { Instrucoes.subER1R0(executa_por_micro, proc); break; }
		case 177: { Instrucoes.subER1R1(executa_por_micro, proc); break; }
		case 178: { Instrucoes.subER1R2(executa_por_micro, proc); break; }
		case 179: { Instrucoes.subER1R3(executa_por_micro, proc); break; }
		case 180: { Instrucoes.subER1R4(executa_por_micro, proc); break; }
		case 181: { Instrucoes.subER2R0(executa_por_micro, proc); break; }
		case 182: { Instrucoes.subER2R1(executa_por_micro, proc); break; }
		case 183: { Instrucoes.subER2R2(executa_por_micro, proc); break; }
		case 184: { Instrucoes.subER2R3(executa_por_micro, proc); break; }
		case 185: { Instrucoes.subER2R4(executa_por_micro, proc); break; }
		case 186: { Instrucoes.subER3R0(executa_por_micro, proc); break; }
		case 187: { Instrucoes.subER3R1(executa_por_micro, proc); break; }
		case 188: { Instrucoes.subER3R2(executa_por_micro, proc); break; }
		case 189: { Instrucoes.subER3R3(executa_por_micro, proc); break; }
		case 190: { Instrucoes.subER3R4(executa_por_micro, proc); break; }
		case 191: { Instrucoes.subER4R0(executa_por_micro, proc); break; }
		case 192: { Instrucoes.subER4R1(executa_por_micro, proc); break; }
		case 193: { Instrucoes.subER4R2(executa_por_micro, proc); break; }
		case 194: { Instrucoes.subER4R3(executa_por_micro, proc); break; }
		case 195: { Instrucoes.subER4R4(executa_por_micro, proc); break; }

		case 196: { Instrucoes.subER0ER0(executa_por_micro, proc); break; }
		case 197: { Instrucoes.subER0ER1(executa_por_micro, proc); break; }
		case 198: { Instrucoes.subER0ER2(executa_por_micro, proc); break; }
		case 199: { Instrucoes.subER0ER3(executa_por_micro, proc); break; }
		case 200: { Instrucoes.subER0ER4(executa_por_micro, proc); break; }
		case 201: { Instrucoes.subER1ER0(executa_por_micro, proc); break; }
		case 202: { Instrucoes.subER1ER1(executa_por_micro, proc); break; }
		case 203: { Instrucoes.subER1ER2(executa_por_micro, proc); break; }
		case 204: { Instrucoes.subER1ER3(executa_por_micro, proc); break; }
		case 205: { Instrucoes.subER1ER4(executa_por_micro, proc); break; }
		case 206: { Instrucoes.subER2ER0(executa_por_micro, proc); break; }
		case 207: { Instrucoes.subER2ER1(executa_por_micro, proc); break; }
		case 208: { Instrucoes.subER2ER2(executa_por_micro, proc); break; }
		case 209: { Instrucoes.subER2ER3(executa_por_micro, proc); break; }
		case 210: { Instrucoes.subER2ER4(executa_por_micro, proc); break; }
		case 211: { Instrucoes.subER3ER0(executa_por_micro, proc); break; }
		case 212: { Instrucoes.subER3ER1(executa_por_micro, proc); break; }
		case 213: { Instrucoes.subER3ER2(executa_por_micro, proc); break; }
		case 214: { Instrucoes.subER3ER3(executa_por_micro, proc); break; }
		case 215: { Instrucoes.subER3ER4(executa_por_micro, proc); break; }
		case 216: { Instrucoes.subER4ER0(executa_por_micro, proc); break; }
		case 217: { Instrucoes.subER4ER1(executa_por_micro, proc); break; }
		case 218: { Instrucoes.subER4ER2(executa_por_micro, proc); break; }
		case 219: { Instrucoes.subER4ER3(executa_por_micro, proc); break; }
		case 220: { Instrucoes.subER4ER4(executa_por_micro, proc); break; }

		/* ==================== Instruções MOV ==================== */

		case 221: { Instrucoes.movImedR0(executa_por_micro, proc); break; }
		case 222: { Instrucoes.movImedR1(executa_por_micro, proc); break; }
		case 223: { Instrucoes.movImedR2(executa_por_micro, proc); break; }
		case 224: { Instrucoes.movImedR3(executa_por_micro, proc); break; }
		case 225: { Instrucoes.movImedR4(executa_por_micro, proc); break; }
		case 226: { Instrucoes.movImedER0(executa_por_micro, proc); break; }
		case 227: { Instrucoes.movImedER1(executa_por_micro, proc); break; }
		case 228: { Instrucoes.movImedER2(executa_por_micro, proc); break; }
		case 229: { Instrucoes.movImedER3(executa_por_micro, proc); break; }
		case 230: { Instrucoes.movImedER4(executa_por_micro, proc); break; }

		case 231: { Instrucoes.movR0R0(executa_por_micro, proc); break; }
		case 232: { Instrucoes.movR0R1(executa_por_micro, proc); break; }
		case 233: { Instrucoes.movR0R2(executa_por_micro, proc); break; }
		case 234: { Instrucoes.movR0R3(executa_por_micro, proc); break; }
		case 235: { Instrucoes.movR0R4(executa_por_micro, proc); break; }
		case 236: { Instrucoes.movR1R0(executa_por_micro, proc); break; }
		case 237: { Instrucoes.movR1R1(executa_por_micro, proc); break; }
		case 238: { Instrucoes.movR1R2(executa_por_micro, proc); break; }
		case 239: { Instrucoes.movR1R3(executa_por_micro, proc); break; }
		case 240: { Instrucoes.movR1R4(executa_por_micro, proc); break; }
		case 241: { Instrucoes.movR2R0(executa_por_micro, proc); break; }
		case 242: { Instrucoes.movR2R1(executa_por_micro, proc); break; }
		case 243: { Instrucoes.movR2R2(executa_por_micro, proc); break; }
		case 244: { Instrucoes.movR2R3(executa_por_micro, proc); break; }
		case 245: { Instrucoes.movR2R4(executa_por_micro, proc); break; }
		case 246: { Instrucoes.movR3R0(executa_por_micro, proc); break; }
		case 247: { Instrucoes.movR3R1(executa_por_micro, proc); break; }
		case 248: { Instrucoes.movR3R2(executa_por_micro, proc); break; }
		case 249: { Instrucoes.movR3R3(executa_por_micro, proc); break; }
		case 250: { Instrucoes.movR3R4(executa_por_micro, proc); break; }
		case 251: { Instrucoes.movR4R0(executa_por_micro, proc); break; }
		case 252: { Instrucoes.movR4R1(executa_por_micro, proc); break; }
		case 253: { Instrucoes.movR4R2(executa_por_micro, proc); break; }
		case 254: { Instrucoes.movR4R3(executa_por_micro, proc); break; }
		case 255: { Instrucoes.movR4R4(executa_por_micro, proc); break; }

		case 256: { Instrucoes.movR0ER0(executa_por_micro, proc); break; }
		case 257: { Instrucoes.movR0ER1(executa_por_micro, proc); break; }
		case 258: { Instrucoes.movR0ER2(executa_por_micro, proc); break; }
		case 259: { Instrucoes.movR0ER3(executa_por_micro, proc); break; }
		case 260: { Instrucoes.movR0ER4(executa_por_micro, proc); break; }
		case 261: { Instrucoes.movR1ER0(executa_por_micro, proc); break; }
		case 262: { Instrucoes.movR1ER1(executa_por_micro, proc); break; }
		case 263: { Instrucoes.movR1ER2(executa_por_micro, proc); break; }
		case 264: { Instrucoes.movR1ER3(executa_por_micro, proc); break; }
		case 265: { Instrucoes.movR1ER4(executa_por_micro, proc); break; }
		case 266: { Instrucoes.movR2ER0(executa_por_micro, proc); break; }
		case 267: { Instrucoes.movR2ER1(executa_por_micro, proc); break; }
		case 268: { Instrucoes.movR2ER2(executa_por_micro, proc); break; }
		case 269: { Instrucoes.movR2ER3(executa_por_micro, proc); break; }
		case 270: { Instrucoes.movR2ER4(executa_por_micro, proc); break; }
		case 271: { Instrucoes.movR3ER0(executa_por_micro, proc); break; }
		case 272: { Instrucoes.movR3ER1(executa_por_micro, proc); break; }
		case 273: { Instrucoes.movR3ER2(executa_por_micro, proc); break; }
		case 274: { Instrucoes.movR3ER3(executa_por_micro, proc); break; }
		case 275: { Instrucoes.movR3ER4(executa_por_micro, proc); break; }
		case 276: { Instrucoes.movR4ER0(executa_por_micro, proc); break; }
		case 277: { Instrucoes.movR4ER1(executa_por_micro, proc); break; }
		case 278: { Instrucoes.movR4ER2(executa_por_micro, proc); break; }
		case 279: { Instrucoes.movR4ER3(executa_por_micro, proc); break; }
		case 280: { Instrucoes.movR4ER4(executa_por_micro, proc); break; }

		case 281: { Instrucoes.movER0R0(executa_por_micro, proc); break; }
		case 282: { Instrucoes.movER0R1(executa_por_micro, proc); break; }
		case 283: { Instrucoes.movER0R2(executa_por_micro, proc); break; }
		case 284: { Instrucoes.movER0R3(executa_por_micro, proc); break; }
		case 285: { Instrucoes.movER0R4(executa_por_micro, proc); break; }
		case 286: { Instrucoes.movER1R0(executa_por_micro, proc); break; }
		case 287: { Instrucoes.movER1R1(executa_por_micro, proc); break; }
		case 288: { Instrucoes.movER1R2(executa_por_micro, proc); break; }
		case 289: { Instrucoes.movER1R3(executa_por_micro, proc); break; }
		case 290: { Instrucoes.movER1R4(executa_por_micro, proc); break; }
		case 291: { Instrucoes.movER2R0(executa_por_micro, proc); break; }
		case 292: { Instrucoes.movER2R1(executa_por_micro, proc); break; }
		case 293: { Instrucoes.movER2R2(executa_por_micro, proc); break; }
		case 294: { Instrucoes.movER2R3(executa_por_micro, proc); break; }
		case 295: { Instrucoes.movER2R4(executa_por_micro, proc); break; }
		case 296: { Instrucoes.movER3R0(executa_por_micro, proc); break; }
		case 297: { Instrucoes.movER3R1(executa_por_micro, proc); break; }
		case 298: { Instrucoes.movER3R2(executa_por_micro, proc); break; }
		case 299: { Instrucoes.movER3R3(executa_por_micro, proc); break; }
		case 300: { Instrucoes.movER3R4(executa_por_micro, proc); break; }
		case 301: { Instrucoes.movER4R0(executa_por_micro, proc); break; }
		case 302: { Instrucoes.movER4R1(executa_por_micro, proc); break; }
		case 303: { Instrucoes.movER4R2(executa_por_micro, proc); break; }
		case 304: { Instrucoes.movER4R3(executa_por_micro, proc); break; }
		case 305: { Instrucoes.movER4R4(executa_por_micro, proc); break; }

		case 306: { Instrucoes.movER0ER0(executa_por_micro, proc); break; }
		case 307: { Instrucoes.movER0ER1(executa_por_micro, proc); break; }
		case 308: { Instrucoes.movER0ER2(executa_por_micro, proc); break; }
		case 309: { Instrucoes.movER0ER3(executa_por_micro, proc); break; }
		case 310: { Instrucoes.movER0ER4(executa_por_micro, proc); break; }
		case 311: { Instrucoes.movER1ER0(executa_por_micro, proc); break; }
		case 312: { Instrucoes.movER1ER1(executa_por_micro, proc); break; }
		case 313: { Instrucoes.movER1ER2(executa_por_micro, proc); break; }
		case 314: { Instrucoes.movER1ER3(executa_por_micro, proc); break; }
		case 315: { Instrucoes.movER1ER4(executa_por_micro, proc); break; }
		case 316: { Instrucoes.movER2ER0(executa_por_micro, proc); break; }
		case 317: { Instrucoes.movER2ER1(executa_por_micro, proc); break; }
		case 318: { Instrucoes.movER2ER2(executa_por_micro, proc); break; }
		case 319: { Instrucoes.movER2ER3(executa_por_micro, proc); break; }
		case 320: { Instrucoes.movER2ER4(executa_por_micro, proc); break; }
		case 321: { Instrucoes.movER3ER0(executa_por_micro, proc); break; }
		case 322: { Instrucoes.movER3ER1(executa_por_micro, proc); break; }
		case 323: { Instrucoes.movER3ER2(executa_por_micro, proc); break; }
		case 324: { Instrucoes.movER3ER3(executa_por_micro, proc); break; }
		case 325: { Instrucoes.movER3ER4(executa_por_micro, proc); break; }
		case 326: { Instrucoes.movER4ER0(executa_por_micro, proc); break; }
		case 327: { Instrucoes.movER4ER1(executa_por_micro, proc); break; }
		case 328: { Instrucoes.movER4ER2(executa_por_micro, proc); break; }
		case 329: { Instrucoes.movER4ER3(executa_por_micro, proc); break; }
		case 330: { Instrucoes.movER4ER4(executa_por_micro, proc); break; }

		/* ==================== Instruções CMP ==================== */

		case 331: { Instrucoes.cmpImedR0(executa_por_micro, proc); break; }
		case 332: { Instrucoes.cmpImedR1(executa_por_micro, proc); break; }
		case 333: { Instrucoes.cmpImedR2(executa_por_micro, proc); break; }
		case 334: { Instrucoes.cmpImedR3(executa_por_micro, proc); break; }
		case 335: { Instrucoes.cmpImedR4(executa_por_micro, proc); break; }
		case 336: { Instrucoes.cmpImedER0(executa_por_micro, proc); break; }
		case 337: { Instrucoes.cmpImedER1(executa_por_micro, proc); break; }
		case 338: { Instrucoes.cmpImedER2(executa_por_micro, proc); break; }
		case 339: { Instrucoes.cmpImedER3(executa_por_micro, proc); break; }
		case 340: { Instrucoes.cmpImedER4(executa_por_micro, proc); break; }

		case 341: { Instrucoes.cmpR0R0(executa_por_micro, proc); break; }
		case 342: { Instrucoes.cmpR0R1(executa_por_micro, proc); break; }
		case 343: { Instrucoes.cmpR0R2(executa_por_micro, proc); break; }
		case 344: { Instrucoes.cmpR0R3(executa_por_micro, proc); break; }
		case 345: { Instrucoes.cmpR0R4(executa_por_micro, proc); break; }
		case 346: { Instrucoes.cmpR1R0(executa_por_micro, proc); break; }
		case 347: { Instrucoes.cmpR1R1(executa_por_micro, proc); break; }
		case 348: { Instrucoes.cmpR1R2(executa_por_micro, proc); break; }
		case 349: { Instrucoes.cmpR1R3(executa_por_micro, proc); break; }
		case 350: { Instrucoes.cmpR1R4(executa_por_micro, proc); break; }
		case 351: { Instrucoes.cmpR2R0(executa_por_micro, proc); break; }
		case 352: { Instrucoes.cmpR2R1(executa_por_micro, proc); break; }
		case 353: { Instrucoes.cmpR2R2(executa_por_micro, proc); break; }
		case 354: { Instrucoes.cmpR2R3(executa_por_micro, proc); break; }
		case 355: { Instrucoes.cmpR2R4(executa_por_micro, proc); break; }
		case 356: { Instrucoes.cmpR3R0(executa_por_micro, proc); break; }
		case 357: { Instrucoes.cmpR3R1(executa_por_micro, proc); break; }
		case 358: { Instrucoes.cmpR3R2(executa_por_micro, proc); break; }
		case 359: { Instrucoes.cmpR3R3(executa_por_micro, proc); break; }
		case 360: { Instrucoes.cmpR3R4(executa_por_micro, proc); break; }
		case 361: { Instrucoes.cmpR4R0(executa_por_micro, proc); break; }
		case 362: { Instrucoes.cmpR4R1(executa_por_micro, proc); break; }
		case 363: { Instrucoes.cmpR4R2(executa_por_micro, proc); break; }
		case 364: { Instrucoes.cmpR4R3(executa_por_micro, proc); break; }
		case 365: { Instrucoes.cmpR4R4(executa_por_micro, proc); break; }

		case 366: { Instrucoes.cmpR0ER0(executa_por_micro, proc); break; }
		case 367: { Instrucoes.cmpR0ER1(executa_por_micro, proc); break; }
		case 368: { Instrucoes.cmpR0ER2(executa_por_micro, proc); break; }
		case 369: { Instrucoes.cmpR0ER3(executa_por_micro, proc); break; }
		case 370: { Instrucoes.cmpR0ER4(executa_por_micro, proc); break; }
		case 371: { Instrucoes.cmpR1ER0(executa_por_micro, proc); break; }
		case 372: { Instrucoes.cmpR1ER1(executa_por_micro, proc); break; }
		case 373: { Instrucoes.cmpR1ER2(executa_por_micro, proc); break; }
		case 374: { Instrucoes.cmpR1ER3(executa_por_micro, proc); break; }
		case 375: { Instrucoes.cmpR1ER4(executa_por_micro, proc); break; }
		case 376: { Instrucoes.cmpR2ER0(executa_por_micro, proc); break; }
		case 377: { Instrucoes.cmpR2ER1(executa_por_micro, proc); break; }
		case 378: { Instrucoes.cmpR2ER2(executa_por_micro, proc); break; }
		case 379: { Instrucoes.cmpR2ER3(executa_por_micro, proc); break; }
		case 380: { Instrucoes.cmpR2ER4(executa_por_micro, proc); break; }
		case 381: { Instrucoes.cmpR3ER0(executa_por_micro, proc); break; }
		case 382: { Instrucoes.cmpR3ER1(executa_por_micro, proc); break; }
		case 383: { Instrucoes.cmpR3ER2(executa_por_micro, proc); break; }
		case 384: { Instrucoes.cmpR3ER3(executa_por_micro, proc); break; }
		case 385: { Instrucoes.cmpR3ER4(executa_por_micro, proc); break; }
		case 386: { Instrucoes.cmpR4ER0(executa_por_micro, proc); break; }
		case 387: { Instrucoes.cmpR4ER1(executa_por_micro, proc); break; }
		case 388: { Instrucoes.cmpR4ER2(executa_por_micro, proc); break; }
		case 389: { Instrucoes.cmpR4ER3(executa_por_micro, proc); break; }
		case 390: { Instrucoes.cmpR4ER4(executa_por_micro, proc); break; }

		case 391: { Instrucoes.cmpER0R0(executa_por_micro, proc); break; }
		case 392: { Instrucoes.cmpER0R1(executa_por_micro, proc); break; }
		case 393: { Instrucoes.cmpER0R2(executa_por_micro, proc); break; }
		case 394: { Instrucoes.cmpER0R3(executa_por_micro, proc); break; }
		case 395: { Instrucoes.cmpER0R4(executa_por_micro, proc); break; }
		case 396: { Instrucoes.cmpER1R0(executa_por_micro, proc); break; }
		case 397: { Instrucoes.cmpER1R1(executa_por_micro, proc); break; }
		case 398: { Instrucoes.cmpER1R2(executa_por_micro, proc); break; }
		case 399: { Instrucoes.cmpER1R3(executa_por_micro, proc); break; }
		case 400: { Instrucoes.cmpER1R4(executa_por_micro, proc); break; }
		case 401: { Instrucoes.cmpER2R0(executa_por_micro, proc); break; }
		case 402: { Instrucoes.cmpER2R1(executa_por_micro, proc); break; }
		case 403: { Instrucoes.cmpER2R2(executa_por_micro, proc); break; }
		case 404: { Instrucoes.cmpER2R3(executa_por_micro, proc); break; }
		case 405: { Instrucoes.cmpER2R4(executa_por_micro, proc); break; }
		case 406: { Instrucoes.cmpER3R0(executa_por_micro, proc); break; }
		case 407: { Instrucoes.cmpER3R1(executa_por_micro, proc); break; }
		case 408: { Instrucoes.cmpER3R2(executa_por_micro, proc); break; }
		case 409: { Instrucoes.cmpER3R3(executa_por_micro, proc); break; }
		case 410: { Instrucoes.cmpER3R4(executa_por_micro, proc); break; }
		case 411: { Instrucoes.cmpER4R0(executa_por_micro, proc); break; }
		case 412: { Instrucoes.cmpER4R1(executa_por_micro, proc); break; }
		case 413: { Instrucoes.cmpER4R2(executa_por_micro, proc); break; }
		case 414: { Instrucoes.cmpER4R3(executa_por_micro, proc); break; }
		case 415: { Instrucoes.cmpER4R4(executa_por_micro, proc); break; }

		case 416: { Instrucoes.cmpER0ER0(executa_por_micro, proc); break; }
		case 417: { Instrucoes.cmpER0ER1(executa_por_micro, proc); break; }
		case 418: { Instrucoes.cmpER0ER2(executa_por_micro, proc); break; }
		case 419: { Instrucoes.cmpER0ER3(executa_por_micro, proc); break; }
		case 420: { Instrucoes.cmpER0ER4(executa_por_micro, proc); break; }
		case 421: { Instrucoes.cmpER1ER0(executa_por_micro, proc); break; }
		case 422: { Instrucoes.cmpER1ER1(executa_por_micro, proc); break; }
		case 423: { Instrucoes.cmpER1ER2(executa_por_micro, proc); break; }
		case 424: { Instrucoes.cmpER1ER3(executa_por_micro, proc); break; }
		case 425: { Instrucoes.cmpER1ER4(executa_por_micro, proc); break; }
		case 426: { Instrucoes.cmpER2ER0(executa_por_micro, proc); break; }
		case 427: { Instrucoes.cmpER2ER1(executa_por_micro, proc); break; }
		case 428: { Instrucoes.cmpER2ER2(executa_por_micro, proc); break; }
		case 429: { Instrucoes.cmpER2ER3(executa_por_micro, proc); break; }
		case 430: { Instrucoes.cmpER2ER4(executa_por_micro, proc); break; }
		case 431: { Instrucoes.cmpER3ER0(executa_por_micro, proc); break; }
		case 432: { Instrucoes.cmpER3ER1(executa_por_micro, proc); break; }
		case 433: { Instrucoes.cmpER3ER2(executa_por_micro, proc); break; }
		case 434: { Instrucoes.cmpER3ER3(executa_por_micro, proc); break; }
		case 435: { Instrucoes.cmpER3ER4(executa_por_micro, proc); break; }
		case 436: { Instrucoes.cmpER4ER0(executa_por_micro, proc); break; }
		case 437: { Instrucoes.cmpER4ER1(executa_por_micro, proc); break; }
		case 438: { Instrucoes.cmpER4ER2(executa_por_micro, proc); break; }
		case 439: { Instrucoes.cmpER4ER3(executa_por_micro, proc); break; }
		case 440: { Instrucoes.cmpER4ER4(executa_por_micro, proc); break; }

		/* ==================== Instruções AND ==================== */

		case 441: { Instrucoes.andImedR0(executa_por_micro, proc); break; }
		case 442: { Instrucoes.andImedR1(executa_por_micro, proc); break; }
		case 443: { Instrucoes.andImedR2(executa_por_micro, proc); break; }
		case 444: { Instrucoes.andImedR3(executa_por_micro, proc); break; }
		case 445: { Instrucoes.andImedR4(executa_por_micro, proc); break; }
		case 446: { Instrucoes.andImedER0(executa_por_micro, proc); break; }
		case 447: { Instrucoes.andImedER1(executa_por_micro, proc); break; }
		case 448: { Instrucoes.andImedER2(executa_por_micro, proc); break; }
		case 449: { Instrucoes.andImedER3(executa_por_micro, proc); break; }
		case 450: { Instrucoes.andImedER4(executa_por_micro, proc); break; }

		case 451: { Instrucoes.andR0R0(executa_por_micro, proc); break; }
		case 452: { Instrucoes.andR0R1(executa_por_micro, proc); break; }
		case 453: { Instrucoes.andR0R2(executa_por_micro, proc); break; }
		case 454: { Instrucoes.andR0R3(executa_por_micro, proc); break; }
		case 455: { Instrucoes.andR0R4(executa_por_micro, proc); break; }
		case 456: { Instrucoes.andR1R0(executa_por_micro, proc); break; }
		case 457: { Instrucoes.andR1R1(executa_por_micro, proc); break; }
		case 458: { Instrucoes.andR1R2(executa_por_micro, proc); break; }
		case 459: { Instrucoes.andR1R3(executa_por_micro, proc); break; }
		case 460: { Instrucoes.andR1R4(executa_por_micro, proc); break; }
		case 461: { Instrucoes.andR2R0(executa_por_micro, proc); break; }
		case 462: { Instrucoes.andR2R1(executa_por_micro, proc); break; }
		case 463: { Instrucoes.andR2R2(executa_por_micro, proc); break; }
		case 464: { Instrucoes.andR2R3(executa_por_micro, proc); break; }
		case 465: { Instrucoes.andR2R4(executa_por_micro, proc); break; }
		case 466: { Instrucoes.andR3R0(executa_por_micro, proc); break; }
		case 467: { Instrucoes.andR3R1(executa_por_micro, proc); break; }
		case 468: { Instrucoes.andR3R2(executa_por_micro, proc); break; }
		case 469: { Instrucoes.andR3R3(executa_por_micro, proc); break; }
		case 470: { Instrucoes.andR3R4(executa_por_micro, proc); break; }
		case 471: { Instrucoes.andR4R0(executa_por_micro, proc); break; }
		case 472: { Instrucoes.andR4R1(executa_por_micro, proc); break; }
		case 473: { Instrucoes.andR4R2(executa_por_micro, proc); break; }
		case 474: { Instrucoes.andR4R3(executa_por_micro, proc); break; }
		case 475: { Instrucoes.andR4R4(executa_por_micro, proc); break; }

		case 476: { Instrucoes.andR0ER0(executa_por_micro, proc); break; }
		case 477: { Instrucoes.andR0ER1(executa_por_micro, proc); break; }
		case 478: { Instrucoes.andR0ER2(executa_por_micro, proc); break; }
		case 479: { Instrucoes.andR0ER3(executa_por_micro, proc); break; }
		case 480: { Instrucoes.andR0ER4(executa_por_micro, proc); break; }
		case 481: { Instrucoes.andR1ER0(executa_por_micro, proc); break; }
		case 482: { Instrucoes.andR1ER1(executa_por_micro, proc); break; }
		case 483: { Instrucoes.andR1ER2(executa_por_micro, proc); break; }
		case 484: { Instrucoes.andR1ER3(executa_por_micro, proc); break; }
		case 485: { Instrucoes.andR1ER4(executa_por_micro, proc); break; }
		case 486: { Instrucoes.andR2ER0(executa_por_micro, proc); break; }
		case 487: { Instrucoes.andR2ER1(executa_por_micro, proc); break; }
		case 488: { Instrucoes.andR2ER2(executa_por_micro, proc); break; }
		case 489: { Instrucoes.andR2ER3(executa_por_micro, proc); break; }
		case 490: { Instrucoes.andR2ER4(executa_por_micro, proc); break; }
		case 491: { Instrucoes.andR3ER0(executa_por_micro, proc); break; }
		case 492: { Instrucoes.andR3ER1(executa_por_micro, proc); break; }
		case 493: { Instrucoes.andR3ER2(executa_por_micro, proc); break; }
		case 494: { Instrucoes.andR3ER3(executa_por_micro, proc); break; }
		case 495: { Instrucoes.andR3ER4(executa_por_micro, proc); break; }
		case 496: { Instrucoes.andR4ER0(executa_por_micro, proc); break; }
		case 497: { Instrucoes.andR4ER1(executa_por_micro, proc); break; }
		case 498: { Instrucoes.andR4ER2(executa_por_micro, proc); break; }
		case 499: { Instrucoes.andR4ER3(executa_por_micro, proc); break; }
		case 500: { Instrucoes.andR4ER4(executa_por_micro, proc); break; }

		case 501: { Instrucoes.andER0R0(executa_por_micro, proc); break; }
		case 502: { Instrucoes.andER0R1(executa_por_micro, proc); break; }
		case 503: { Instrucoes.andER0R2(executa_por_micro, proc); break; }
		case 504: { Instrucoes.andER0R3(executa_por_micro, proc); break; }
		case 505: { Instrucoes.andER0R4(executa_por_micro, proc); break; }
		case 506: { Instrucoes.andER1R0(executa_por_micro, proc); break; }
		case 507: { Instrucoes.andER1R1(executa_por_micro, proc); break; }
		case 508: { Instrucoes.andER1R2(executa_por_micro, proc); break; }
		case 509: { Instrucoes.andER1R3(executa_por_micro, proc); break; }
		case 510: { Instrucoes.andER1R4(executa_por_micro, proc); break; }
		case 511: { Instrucoes.andER2R0(executa_por_micro, proc); break; }
		case 512: { Instrucoes.andER2R1(executa_por_micro, proc); break; }
		case 513: { Instrucoes.andER2R2(executa_por_micro, proc); break; }
		case 514: { Instrucoes.andER2R3(executa_por_micro, proc); break; }
		case 515: { Instrucoes.andER2R4(executa_por_micro, proc); break; }
		case 516: { Instrucoes.andER3R0(executa_por_micro, proc); break; }
		case 517: { Instrucoes.andER3R1(executa_por_micro, proc); break; }
		case 518: { Instrucoes.andER3R2(executa_por_micro, proc); break; }
		case 519: { Instrucoes.andER3R3(executa_por_micro, proc); break; }
		case 520: { Instrucoes.andER3R4(executa_por_micro, proc); break; }
		case 521: { Instrucoes.andER4R0(executa_por_micro, proc); break; }
		case 522: { Instrucoes.andER4R1(executa_por_micro, proc); break; }
		case 523: { Instrucoes.andER4R2(executa_por_micro, proc); break; }
		case 524: { Instrucoes.andER4R3(executa_por_micro, proc); break; }
		case 525: { Instrucoes.andER4R4(executa_por_micro, proc); break; }

		case 526: { Instrucoes.andER0ER0(executa_por_micro, proc); break; }
		case 527: { Instrucoes.andER0ER1(executa_por_micro, proc); break; }
		case 528: { Instrucoes.andER0ER2(executa_por_micro, proc); break; }
		case 529: { Instrucoes.andER0ER3(executa_por_micro, proc); break; }
		case 530: { Instrucoes.andER0ER4(executa_por_micro, proc); break; }
		case 531: { Instrucoes.andER1ER0(executa_por_micro, proc); break; }
		case 532: { Instrucoes.andER1ER1(executa_por_micro, proc); break; }
		case 533: { Instrucoes.andER1ER2(executa_por_micro, proc); break; }
		case 534: { Instrucoes.andER1ER3(executa_por_micro, proc); break; }
		case 535: { Instrucoes.andER1ER4(executa_por_micro, proc); break; }
		case 536: { Instrucoes.andER2ER0(executa_por_micro, proc); break; }
		case 537: { Instrucoes.andER2ER1(executa_por_micro, proc); break; }
		case 538: { Instrucoes.andER2ER2(executa_por_micro, proc); break; }
		case 539: { Instrucoes.andER2ER3(executa_por_micro, proc); break; }
		case 540: { Instrucoes.andER2ER4(executa_por_micro, proc); break; }
		case 541: { Instrucoes.andER3ER0(executa_por_micro, proc); break; }
		case 542: { Instrucoes.andER3ER1(executa_por_micro, proc); break; }
		case 543: { Instrucoes.andER3ER2(executa_por_micro, proc); break; }
		case 544: { Instrucoes.andER3ER3(executa_por_micro, proc); break; }
		case 545: { Instrucoes.andER3ER4(executa_por_micro, proc); break; }
		case 546: { Instrucoes.andER4ER0(executa_por_micro, proc); break; }
		case 547: { Instrucoes.andER4ER1(executa_por_micro, proc); break; }
		case 548: { Instrucoes.andER4ER2(executa_por_micro, proc); break; }
		case 549: { Instrucoes.andER4ER3(executa_por_micro, proc); break; }
		case 550: { Instrucoes.andER4ER4(executa_por_micro, proc); break; }

		/* ==================== Instruções OR ===================== */

		case 551: { Instrucoes.orImedR0(executa_por_micro, proc); break; }
		case 552: { Instrucoes.orImedR1(executa_por_micro, proc); break; }
		case 553: { Instrucoes.orImedR2(executa_por_micro, proc); break; }
		case 554: { Instrucoes.orImedR3(executa_por_micro, proc); break; }
		case 555: { Instrucoes.orImedR4(executa_por_micro, proc); break; }
		case 556: { Instrucoes.orImedER0(executa_por_micro, proc); break; }
		case 557: { Instrucoes.orImedER1(executa_por_micro, proc); break; }
		case 558: { Instrucoes.orImedER2(executa_por_micro, proc); break; }
		case 559: { Instrucoes.orImedER3(executa_por_micro, proc); break; }
		case 560: { Instrucoes.orImedER4(executa_por_micro, proc); break; }

		case 561: { Instrucoes.orR0R0(executa_por_micro, proc); break; }
		case 562: { Instrucoes.orR0R1(executa_por_micro, proc); break; }
		case 563: { Instrucoes.orR0R2(executa_por_micro, proc); break; }
		case 564: { Instrucoes.orR0R3(executa_por_micro, proc); break; }
		case 565: { Instrucoes.orR0R4(executa_por_micro, proc); break; }
		case 566: { Instrucoes.orR1R0(executa_por_micro, proc); break; }
		case 567: { Instrucoes.orR1R1(executa_por_micro, proc); break; }
		case 568: { Instrucoes.orR1R2(executa_por_micro, proc); break; }
		case 569: { Instrucoes.orR1R3(executa_por_micro, proc); break; }
		case 570: { Instrucoes.orR1R4(executa_por_micro, proc); break; }
		case 571: { Instrucoes.orR2R0(executa_por_micro, proc); break; }
		case 572: { Instrucoes.orR2R1(executa_por_micro, proc); break; }
		case 573: { Instrucoes.orR2R2(executa_por_micro, proc); break; }
		case 574: { Instrucoes.orR2R3(executa_por_micro, proc); break; }
		case 575: { Instrucoes.orR2R4(executa_por_micro, proc); break; }
		case 576: { Instrucoes.orR3R0(executa_por_micro, proc); break; }
		case 577: { Instrucoes.orR3R1(executa_por_micro, proc); break; }
		case 578: { Instrucoes.orR3R2(executa_por_micro, proc); break; }
		case 579: { Instrucoes.orR3R3(executa_por_micro, proc); break; }
		case 580: { Instrucoes.orR3R4(executa_por_micro, proc); break; }
		case 581: { Instrucoes.orR4R0(executa_por_micro, proc); break; }
		case 582: { Instrucoes.orR4R1(executa_por_micro, proc); break; }
		case 583: { Instrucoes.orR4R2(executa_por_micro, proc); break; }
		case 584: { Instrucoes.orR4R3(executa_por_micro, proc); break; }
		case 585: { Instrucoes.orR4R4(executa_por_micro, proc); break; }

		case 586: { Instrucoes.orR0ER0(executa_por_micro, proc); break; }
		case 587: { Instrucoes.orR0ER1(executa_por_micro, proc); break; }
		case 588: { Instrucoes.orR0ER2(executa_por_micro, proc); break; }
		case 589: { Instrucoes.orR0ER3(executa_por_micro, proc); break; }
		case 590: { Instrucoes.orR0ER4(executa_por_micro, proc); break; }
		case 591: { Instrucoes.orR1ER0(executa_por_micro, proc); break; }
		case 592: { Instrucoes.orR1ER1(executa_por_micro, proc); break; }
		case 593: { Instrucoes.orR1ER2(executa_por_micro, proc); break; }
		case 594: { Instrucoes.orR1ER3(executa_por_micro, proc); break; }
		case 595: { Instrucoes.orR1ER4(executa_por_micro, proc); break; }
		case 596: { Instrucoes.orR2ER0(executa_por_micro, proc); break; }
		case 597: { Instrucoes.orR2ER1(executa_por_micro, proc); break; }
		case 598: { Instrucoes.orR2ER2(executa_por_micro, proc); break; }
		case 599: { Instrucoes.orR2ER3(executa_por_micro, proc); break; }
		case 600: { Instrucoes.orR2ER4(executa_por_micro, proc); break; }
		case 601: { Instrucoes.orR3ER0(executa_por_micro, proc); break; }
		case 602: { Instrucoes.orR3ER1(executa_por_micro, proc); break; }
		case 603: { Instrucoes.orR3ER2(executa_por_micro, proc); break; }
		case 604: { Instrucoes.orR3ER3(executa_por_micro, proc); break; }
		case 605: { Instrucoes.orR3ER4(executa_por_micro, proc); break; }
		case 606: { Instrucoes.orR4ER0(executa_por_micro, proc); break; }
		case 607: { Instrucoes.orR4ER1(executa_por_micro, proc); break; }
		case 608: { Instrucoes.orR4ER2(executa_por_micro, proc); break; }
		case 609: { Instrucoes.orR4ER3(executa_por_micro, proc); break; }
		case 610: { Instrucoes.orR4ER4(executa_por_micro, proc); break; }

		case 611: { Instrucoes.orER0R0(executa_por_micro, proc); break; }
		case 612: { Instrucoes.orER0R1(executa_por_micro, proc); break; }
		case 613: { Instrucoes.orER0R2(executa_por_micro, proc); break; }
		case 614: { Instrucoes.orER0R3(executa_por_micro, proc); break; }
		case 615: { Instrucoes.orER0R4(executa_por_micro, proc); break; }
		case 616: { Instrucoes.orER1R0(executa_por_micro, proc); break; }
		case 617: { Instrucoes.orER1R1(executa_por_micro, proc); break; }
		case 618: { Instrucoes.orER1R2(executa_por_micro, proc); break; }
		case 619: { Instrucoes.orER1R3(executa_por_micro, proc); break; }
		case 620: { Instrucoes.orER1R4(executa_por_micro, proc); break; }
		case 621: { Instrucoes.orER2R0(executa_por_micro, proc); break; }
		case 622: { Instrucoes.orER2R1(executa_por_micro, proc); break; }
		case 623: { Instrucoes.orER2R2(executa_por_micro, proc); break; }
		case 624: { Instrucoes.orER2R3(executa_por_micro, proc); break; }
		case 625: { Instrucoes.orER2R4(executa_por_micro, proc); break; }
		case 626: { Instrucoes.orER3R0(executa_por_micro, proc); break; }
		case 627: { Instrucoes.orER3R1(executa_por_micro, proc); break; }
		case 628: { Instrucoes.orER3R2(executa_por_micro, proc); break; }
		case 629: { Instrucoes.orER3R3(executa_por_micro, proc); break; }
		case 630: { Instrucoes.orER3R4(executa_por_micro, proc); break; }
		case 631: { Instrucoes.orER4R0(executa_por_micro, proc); break; }
		case 632: { Instrucoes.orER4R1(executa_por_micro, proc); break; }
		case 633: { Instrucoes.orER4R2(executa_por_micro, proc); break; }
		case 634: { Instrucoes.orER4R3(executa_por_micro, proc); break; }
		case 635: { Instrucoes.orER4R4(executa_por_micro, proc); break; }

		case 636: { Instrucoes.orER0ER0(executa_por_micro, proc); break; }
		case 637: { Instrucoes.orER0ER1(executa_por_micro, proc); break; }
		case 638: { Instrucoes.orER0ER2(executa_por_micro, proc); break; }
		case 639: { Instrucoes.orER0ER3(executa_por_micro, proc); break; }
		case 640: { Instrucoes.orER0ER4(executa_por_micro, proc); break; }
		case 641: { Instrucoes.orER1ER0(executa_por_micro, proc); break; }
		case 642: { Instrucoes.orER1ER1(executa_por_micro, proc); break; }
		case 643: { Instrucoes.orER1ER2(executa_por_micro, proc); break; }
		case 644: { Instrucoes.orER1ER3(executa_por_micro, proc); break; }
		case 645: { Instrucoes.orER1ER4(executa_por_micro, proc); break; }
		case 646: { Instrucoes.orER2ER0(executa_por_micro, proc); break; }
		case 647: { Instrucoes.orER2ER1(executa_por_micro, proc); break; }
		case 648: { Instrucoes.orER2ER2(executa_por_micro, proc); break; }
		case 649: { Instrucoes.orER2ER3(executa_por_micro, proc); break; }
		case 650: { Instrucoes.orER2ER4(executa_por_micro, proc); break; }
		case 651: { Instrucoes.orER3ER0(executa_por_micro, proc); break; }
		case 652: { Instrucoes.orER3ER1(executa_por_micro, proc); break; }
		case 653: { Instrucoes.orER3ER2(executa_por_micro, proc); break; }
		case 654: { Instrucoes.orER3ER3(executa_por_micro, proc); break; }
		case 655: { Instrucoes.orER3ER4(executa_por_micro, proc); break; }
		case 656: { Instrucoes.orER4ER0(executa_por_micro, proc); break; }
		case 657: { Instrucoes.orER4ER1(executa_por_micro, proc); break; }
		case 658: { Instrucoes.orER4ER2(executa_por_micro, proc); break; }
		case 659: { Instrucoes.orER4ER3(executa_por_micro, proc); break; }
		case 660: { Instrucoes.orER4ER4(executa_por_micro, proc); break; }

		/* ==================== Instruções NOT ==================== */

		case 661: { Instrucoes.notR0(executa_por_micro, proc); break; }
		case 662: { Instrucoes.notR1(executa_por_micro, proc); break; }
		case 663: { Instrucoes.notR2(executa_por_micro, proc); break; }
		case 664: { Instrucoes.notR3(executa_por_micro, proc); break; }
		case 665: { Instrucoes.notR4(executa_por_micro, proc); break; }
		case 666: { Instrucoes.notER0(executa_por_micro, proc); break; }
		case 667: { Instrucoes.notER1(executa_por_micro, proc); break; }
		case 668: { Instrucoes.notER2(executa_por_micro, proc); break; }
		case 669: { Instrucoes.notER3(executa_por_micro, proc); break; }
		case 670: { Instrucoes.notER4(executa_por_micro, proc); break; }

		/* ==================== Instruções NEG ===================== */

		case 671: { Instrucoes.negR0(executa_por_micro, proc); break; }
		case 672: { Instrucoes.negR1(executa_por_micro, proc); break; }
		case 673: { Instrucoes.negR2(executa_por_micro, proc); break; }
		case 674: { Instrucoes.negR3(executa_por_micro, proc); break; }
		case 675: { Instrucoes.negR4(executa_por_micro, proc); break; }
		case 676: { Instrucoes.negER0(executa_por_micro, proc); break; }
		case 677: { Instrucoes.negER1(executa_por_micro, proc); break; }
		case 678: { Instrucoes.negER2(executa_por_micro, proc); break; }
		case 679: { Instrucoes.negER3(executa_por_micro, proc); break; }
		case 680: { Instrucoes.negER4(executa_por_micro, proc); break; }

		/* ==================== Instruções CLR ===================== */

		case 681: { Instrucoes.clrR0(executa_por_micro, proc); break; }
		case 682: { Instrucoes.clrR1(executa_por_micro, proc); break; }
		case 683: { Instrucoes.clrR2(executa_por_micro, proc); break; }
		case 684: { Instrucoes.clrR3(executa_por_micro, proc); break; }
		case 685: { Instrucoes.clrR4(executa_por_micro, proc); break; }
		case 686: { Instrucoes.clrER0(executa_por_micro, proc); break; }
		case 687: { Instrucoes.clrER1(executa_por_micro, proc); break; }
		case 688: { Instrucoes.clrER2(executa_por_micro, proc); break; }
		case 689: { Instrucoes.clrER3(executa_por_micro, proc); break; }
		case 690: { Instrucoes.clrER4(executa_por_micro, proc); break; }

		/* ==================== Instruções SHL ===================== */

		case 691: { Instrucoes.shlR0(executa_por_micro, proc); break; }
		case 692: { Instrucoes.shlR1(executa_por_micro, proc); break; }
		case 693: { Instrucoes.shlR2(executa_por_micro, proc); break; }
		case 694: { Instrucoes.shlR3(executa_por_micro, proc); break; }
		case 695: { Instrucoes.shlR4(executa_por_micro, proc); break; }
		case 696: { Instrucoes.shlER0(executa_por_micro, proc); break; }
		case 697: { Instrucoes.shlER1(executa_por_micro, proc); break; }
		case 698: { Instrucoes.shlER2(executa_por_micro, proc); break; }
		case 699: { Instrucoes.shlER3(executa_por_micro, proc); break; }
		case 700: { Instrucoes.shlER4(executa_por_micro, proc); break; }

		/* ==================== Instruções SHR ===================== */

		case 701: { Instrucoes.shrR0(executa_por_micro, proc); break; }
		case 702: { Instrucoes.shrR1(executa_por_micro, proc); break; }
		case 703: { Instrucoes.shrR2(executa_por_micro, proc); break; }
		case 704: { Instrucoes.shrR3(executa_por_micro, proc); break; }
		case 705: { Instrucoes.shrR4(executa_por_micro, proc); break; }
		case 706: { Instrucoes.shrER0(executa_por_micro, proc); break; }
		case 707: { Instrucoes.shrER1(executa_por_micro, proc); break; }
		case 708: { Instrucoes.shrER2(executa_por_micro, proc); break; }
		case 709: { Instrucoes.shrER3(executa_por_micro, proc); break; }
		case 710: { Instrucoes.shrER4(executa_por_micro, proc); break; }

		/* ================= Instruções de Desvio ================== */

		case 711: { Instrucoes.brz(executa_por_micro, proc); break; }
		case 712: { Instrucoes.brn(executa_por_micro, proc); break; }
		case 713: { Instrucoes.bre(executa_por_micro, proc); break; }
		case 714: { Instrucoes.brl(executa_por_micro, proc); break; }
		case 715: { Instrucoes.brg(executa_por_micro, proc); break; }
		case 716: { Instrucoes.brc(executa_por_micro, proc); break; }
		case 717: { Instrucoes.jmp(executa_por_micro, proc, true); break; }
		}
	}
}
