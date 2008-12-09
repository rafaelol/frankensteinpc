package br.ufrj.dcc.arq.controle;

import br.ufrj.dcc.arq.modelo.Bit;
import br.ufrj.dcc.arq.modelo.Registrador;

public class FuncoesAuxiliares {

	public int binToInt(Bit[] n) {
		return 1;
	}
	
	public double binToFloat(Bit[] n) {
		return 1;
	}
	
	public Bit[] intToBin(int n) {
		Bit[] bin = new Bit[Registrador.PALAVRA_DADOS];
		return bin;
	}
	
	public Bit[] floatToBin(double n) {
		Bit[] bin = new Bit[Registrador.PALAVRA_DADOS];
		return bin;
	}
}

/*
 * Obs: Em representação de 16 bits, temos:
 *    1  - Sinal
 *    5  - Expoente
 *    10 - Mantissa
 *
 */