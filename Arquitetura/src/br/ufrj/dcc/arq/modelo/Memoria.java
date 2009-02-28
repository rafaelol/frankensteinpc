package br.ufrj.dcc.arq.modelo;

import br.ufrj.dcc.arq.vista.Comecar;
/**
 * Classe onde sera armazenada os dados da memoria
 */
public class Memoria {
	public static final int TAM_MEM = 65536;
	public static final int LEIT = 0;
	public static final int ESC  = 1;
	
	public static final int QTD_SINAIS = 1;

	public static final int X = 0;
	
	public short dadoLido;
	
	private short mem[];
	private Bit sinal;
	
	public Memoria() {
		mem = new short[TAM_MEM];
		sinal = new Bit((short)LEIT);
		
		for(int i=0; i< mem.length; i++) mem[i] = 0;
	}


	public void setMemPos(int p, short v) {
		this.mem[p] = v;
	}
	
	public short getMemPos(int p) {
		return this.mem[p];
	}
	
	public Bit getSinal() {
		return sinal;
	}

	public void setSinal(Bit sinal) {
		this.sinal = sinal;
	}


	public void escreve(Processador proc) {

		System.out.println("REND = " + ConverteInt(proc.registrador.rend));
		proc.memoria.mem[ConverteInt(proc.registrador.rend)] = proc.registrador.rdados;
		
		Comecar.listaMemoria.replaceItem(String.valueOf(ConverteInt(proc.registrador.rend))+ ". " + String.valueOf(proc.registrador.rdados),ConverteInt(proc.registrador.rend));
		
	}
	
	public void le(Processador proc) {
		this.dadoLido = proc.memoria.mem[ConverteInt(proc.registrador.rend)];
	}
	
	public void opera(Processador proc) {
		proc.memoria.sinal = proc.uc.sinais[Uc.X];
		if(proc.memoria.sinal.getValor() == ESC) {
			proc.memoria.escreve(proc);
		}
		else if (proc.memoria.sinal.getValor() == LEIT) {
			proc.memoria.le(proc);
		}
	}
	
	public static int ConverteInt(short valor) {
		int numero = ( valor & 0xffff );
		
		return numero;
	}
}
