package br.ufrj.dcc.arq.modelo;

/**
 * Determina o comportamento de um multiplexador 2 X 1 (Duas entradas e uma saída).
 * Passa para a saída ou o dado lido da memória (Sinal de controle = 0) ou a saída 
 * da ULA (Sinal de controle = 1).
 * 
 * @author Francisco Viégas Vianna
 *
 */
public class Multiplex2E {
	public static final int QTD_SINAIS = 1;
	public static final int INICIO = Uc.L;
	
	/** Usado para setar o sinal de controle */  
	public static final int L = 0;
	
	/**  Configurações dos sinais do multiplex e as operações correspondentes */
	public static final short[] PASSAMEM  = {0};
	public static final short[] PASSASULA = {1};
	
	/** Recebe valores Lidos da memória. */
	public short a;
	/** Recebe valores da saída da ULA. */ 
	public short b;
	/** Saída. */
	public static short s;
	
	/** Sinais de controle */
	public Bit[] sinal = new Bit[QTD_SINAIS];

	
	/******************** Construtores ********************
	 ******************************************************
	 * Atribui 0 aos atributos a, b e s.
	 * Instancia os Bits dos sinais, atriuindo 0 a todos.
	 */
	public Multiplex2E(int v) {
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
	 * @param v Vetor de short com uma configuração válida para os sinais de controle.
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
	 * @param a Valor que será atribuido a 'a'. 
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
	 * @param a Valor que será atribuido a 'b'. 
	 */
	public void setB(short b) {
		this.b = b;
	}

	
	/**************** Funções do Multiplex ****************
	 ******************************************************
	 * Escolhe qual operando será propagado para a saída de acordo 
	 * com a configuração dos sinais de controle.
	 */
	public void opera(){
		a = Memoria.dadoLido;
		b = Ula.s;
		short vet[] = {Uc.sinais[Uc.L].getValor()};
		this.setSinal(vet);
		
		if (sinal[L].getValor() == 0) s = a;
		else s = b;
	}
	
}
