package br.ufrj.dcc.arq.modelo;

/**
 * Determina o comportamento de um multiplexador 2 X 1 (Duas entradas e uma saida).
 * Passa para a saida ou o dado lido da memoria (Sinal de controle = 0) ou a saida 
 * da ULA (Sinal de controle = 1).
 * 
 * @author Francisco Viegas Vianna
 *
 */
public class Multiplex2E {
	public static final int QTD_SINAIS = 1;

	/** Usado para setar o sinal de controle */  
	public static final int L = 0;
	
	/**  Configuracoes dos sinais do multiplex e as operacoes correspondentes */
	public static final short[] PASSAMEM  = {0};
	public static final short[] PASSASULA = {1};
	
	/** Recebe valores Lidos da memoria. */
	public short a;
	/** Recebe valores da saida da ULA. */ 
	public short b;
	/** Saida. */
	public short s;
	
	/** Sinais de controle */
	public Bit[] sinal = new Bit[QTD_SINAIS];

	
	/******************** Construtores ********************
	 ******************************************************
	 * Atribui 0 aos atributos a, b e s.
	 * Instancia os Bits dos sinais, atribuindo 0 a todos.
	 */
	public Multiplex2E() {
		a = b = s = (short)0;
		for(int i=0; i<QTD_SINAIS; i++)
			sinal[i] = new Bit((short)0);
	}
	
	
	/****************** Getters e Setters *****************
	 ******************************************************
	 * Getter para o atributo 'sinal'.
	 * 
	 * @return vetor de shorts com o estado dos sinais de controle.
	 */
	public short[] getSinal() {
		short[] ret = {sinal[L].getValor()};
		return ret;
	}

	/**********************************
	 * Setter para o atributo 'sinal'.
	 * 
	 * @param v Vetor de short com uma configuracao valida para os sinais de controle.
	 */
	public void setSinal(short[] v) {
		this.sinal[L].setValor(v[L]);
	}

	/**********************************
	 * Getter para o atributo 'a'.
	 * 
	 * @return Valor de 'a'.
	 */
	public short getA() {
		return a;
	}
	
	/**********************************
	 * Setter para o atributo 'a'.
	 * 
	 * @param a Valor que sera atribuido a 'a'. 
	 */
	public void setA(short a) {
		this.a = a;
	}
	
	/**********************************
	 * Getter para o atributo 'b'.
	 * 
	 * @return Valor de 'b'.
	 */
	public short getB() {
		return b;
	}

	/**********************************
	 * Setter para o atributo 'b'.
	 * 
	 * @param a Valor que sera atribuido a 'b'. 
	 */
	public void setB(short b) {
		this.b = b;
	}

	
	/**************** Funcoes do Multiplex ****************
	 ******************************************************
	 * Escolhe qual operando sera propagado para a saida de acordo 
	 * com a configuracao dos sinais de controle.
	 */
	public void opera(Processador proc){
		proc.mux2.a = proc.memoria.dadoLido;
		proc.mux2.b = proc.ula.s;
		short vet[] = {proc.uc.sinais[Uc.L].getValor()};
		proc.mux2.setSinal(vet);
		
		if (sinal[L].getValor() == Multiplex2E.PASSAMEM[0]) {
			proc.mux2.s = proc.mux2.a;
		}
		else if (sinal[L].getValor() == Multiplex2E.PASSASULA[0]) {
			proc.mux2.s = proc.mux2.b;
		}
	}
	
}
