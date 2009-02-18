package br.ufrj.dcc.arq.modelo;

/**
 * Determina o comportamento de um multiplexador 4 X 1 (Duas entradas e uma saída).
 * Passa para a saída ou o valor em RDados, ou em R0, ou em R1, ou em RX.
 * 
 * @author Francisco Viégas Vianna
 *
 */
public class Multiplex4E {
	public static final int QTD_SINAIS = 2;
	public static final int ID         = Uc.M;

	/** Usado para setar o sinal de controle */  
	public static final int M = 0;
	public static final int N = 1;

	/**  Configurações dos sinais do multiplex e as operações correspondentes */
	public static final short[] PASSARDADOS = {0,0};
	public static final short[] PASSAR0     = {0,1};
	public static final short[] PASSAR1     = {1,0};
	public static final short[] PASSARX     = {1,1};
	
	/** Recebe valores de RDados */
	public short a;
	/** Recebe valores de R0 */
	public short b;
	/** Recebe valores de R1 */
	public short c;
	/** Recebe valores de RX */
	public short d;
	/** Saída */
	public static short s;
	
	/** Sinais de Controle */
	public Bit[] sinais = new Bit[QTD_SINAIS];

	
	/******************** Construtores ********************
	 ******************************************************
	 * Atribui 0 aos atributos a, b, c, d e s.
	 * Instancia os Bits dos sinais, atriuindo 0 a todos.
	 */
	public Multiplex4E(int v) {
		a = b = c = d = s = (short)0;
		for(int i = 0; i<QTD_SINAIS; i++) {
			sinais[i] = new Bit((short)0);
		}
	}
	
	
	/****************** Getters e Setters *****************
	 ******************************************************
	 * Getter para o atributo 'sinais'.
	 * 
	 * @return vetor de shorts com o estado dos sinais de controle.
	 */
	public short[] getSinais() {
		short[] ret = {sinais[M].getValor(),
				       sinais[N].getValor() };
		return ret;
	}

	/**********************************
	 * Setter para o atributo 'sinais'.
	 * 
	 * @param v Vetor de short com uma configuração válida para os sinais de controle.
	 */
	public void setSinais(short[] v) {
		this.sinais[M].setValor(v[M]);
		this.sinais[N].setValor(v[N]);
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

	/**********************************
	 * Getter para o atributo 'c'.
	 * 
	 * @return Valor de 'c'.
	 */
	public short getC() {
		return c;
	}

	/**********************************
	 * Setter para o atributo 'c'.
	 * 
	 * @param a Valor que será atribuido a 'c'. 
	 */
	public void setC(short c) {
		this.c = c;
	}

	/**********************************
	 * Getter para o atributo 'd'.
	 * 
	 * @return Valor de 'd'.
	 */
	public short getD() {
		return d;
	}

	/**********************************
	 * Setter para o atributo 'd'.
	 * 
	 * @param a Valor que será atribuido a 'd'. 
	 */
	public void setD(short d) {
		this.d = d;
	}
	
	
	/**************** Funções do Multiplex ****************
	 ******************************************************
	 * Escolhe qual operando será propagado para a saída de acordo 
	 * com a configuração dos sinais de controle.
	 */
	public void opera(short[] v){
		this.a = Registrador.rdados;
		this.b = Registrador.r0;
		this.c = Registrador.r1;
		this.d = Registrador.rx;
		
		short vet[] = {Uc.sinais[Uc.M].getValor(),
				       Uc.sinais[Uc.N].getValor()
					  };

		this.setSinais(vet);
		
		if (compara(PASSARDADOS)) s = a;
		if (compara(PASSAR0))     s = b;
		if (compara(PASSAR1))     s = c;
		if (compara(PASSARX))     s = d;
	}
	
	/**********************************
	 * Compara os valores em sinais com o vetor de sinais fornecido como parâmetro.
	 * 
	 * @param v Vetor com uma configuração de sinais de controle.
	 * @return Valor booleano que indica se o vetor 'sinais' é igual ao atributo fornecido. 
	 */
	public boolean compara(short[] v) {
		boolean ret = true;
		
		for(int i = 0; i<QTD_SINAIS; i++) {
			if(sinais[i].getValor() != v[i]) { ret = false; break; }
		}
		
		return ret;
	}

}
