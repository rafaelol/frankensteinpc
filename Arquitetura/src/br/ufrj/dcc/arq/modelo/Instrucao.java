package br.ufrj.dcc.arq.modelo;

import java.util.ArrayList;

public class Instrucao {
	
	private int id;
	private MicroInstrucao[] cabecalho; /* Será definido estaticamente aqui*/
	private ArrayList<MicroInstrucao> microInstrucoes;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<MicroInstrucao> getMicroInstrucoes() {
		return microInstrucoes;
	}
	
	public void setMicroInstrucoes(ArrayList<MicroInstrucao> microInstrucoes) {
		this.microInstrucoes = microInstrucoes;
	}

	public MicroInstrucao[] getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(MicroInstrucao[] cabecalho) {
		this.cabecalho = cabecalho;
	}
	
}
