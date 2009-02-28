package br.ufrj.dcc.arq.modelo;
/**
 * Classe responsavel pelos Bits da Arquitetura
 * @author Programa Arquitetura
 *
 */
public class Bit {
	
	private short valor;

	public Bit(short v) {
		this.valor = v;
	}
	
	public short getValor() {
		return this.valor;
	}

	public void setValor(short valor) {
		this.valor = valor;
	}
}
