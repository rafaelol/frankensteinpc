package br.ufrj.dcc.arq.modelo;

import java.util.ArrayList;

public class Instrucao {
	
	private int id;
	private MicroInstrucoes[] cabecalho; /* Será definido estaticamente aqui*/
	private ArrayList<MicroInstrucoes> microInstrucoes;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<MicroInstrucoes> getMicroInstrucoes() {
		return microInstrucoes;
	}
	
	public void setMicroInstrucoes(ArrayList<MicroInstrucoes> microInstrucoes) {
		this.microInstrucoes = microInstrucoes;
	}

	public MicroInstrucoes[] getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(MicroInstrucoes[] cabecalho) {
		this.cabecalho = cabecalho;
	}
	
}
