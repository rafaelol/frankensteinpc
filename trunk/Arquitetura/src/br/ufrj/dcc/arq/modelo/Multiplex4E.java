package br.ufrj.dcc.arq.modelo;

/**
 * Determina o comportamento de um multiplexador 4 X 1 (Duas entradas e uma saida).
 * Passa para a saida ou o valor em RDados, ou em R0, ou em R1, ou em RX.
 * 
 * @author Francisco Viegas Vianna
 *
 */
public class Multiplex4E {
	public static final int QTD_SINAIS = 2;
	public static final int ID         = Uc.M;

	/** Usado para setar o sinal de controle */  
	public static final int M = 0;
	public static final int N = 1;

	/**  Configuracoes dos sinais do multiplex e as operacoes correspondentes */
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
	/** Saida */
	public short s;
	
	/** Sinais de Controle */
	public Bit[] sinais = new Bit[QTD_SINAIS];

	
	/******************** Construtores ********************
	 ******************************************************
	 * Atribui 0 aos atributos a, b, c, d e s.
	 * Instancia os Bits dos sinais, atriuindo 0 a todos.
	 */
	public Multiplex4E() {
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
	 * @param v Vetor de short com uma configuracao valida para os sinais de controle.
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
	 * @param a Valor que sera atribuido a 'c'. 
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
	 * @param a Valor que sera atribuido a 'd'. 
	 */
	public void setD(short d) {
		this.d = d;
	}
	
	
	/**************** Funcoes do Multiplex ****************
	 ******************************************************
	 * Escolhe qual operando sera propagado para a saida de acordo 
	 * com a configuracao dos sinais de controle.
	 */
	public void opera(Processador proc){
		proc.mux4.a = proc.registrador.rdados;
		proc.mux4.b = proc.registrador.r0;
		proc.mux4.c = proc.registrador.r1;
		proc.mux4.d = proc.registrador.rx;
		
		short vet[] = {proc.uc.sinais[Uc.M].getValor(),
				       proc.uc.sinais[Uc.N].getValor()
					  };

		proc.mux4.setSinais(vet);
		
		if (compara(PASSARDADOS, proc)) proc.mux4.s = proc.mux4.a;
		if (compara(PASSAR0, proc))     proc.mux4.s = proc.mux4.b;
		if (compara(PASSAR1, proc))     proc.mux4.s = proc.mux4.c;
		if (compara(PASSARX, proc))     proc.mux4.s = proc.mux4.d;
	}
	
	/**********************************
	 * Compara os valores em sinais com o vetor de sinais fornecido como parametro.
	 * 
	 * @param v Vetor com uma configuracao de sinais de controle.
	 * @return Valor booleano que indica se o vetor 'sinais' e igual ao atributo fornecido. 
	 */
	public boolean compara(short[] v, Processador proc) {
		boolean ret = true;
		
		for(int i = 0; i<QTD_SINAIS; i++) {
			if(proc.mux4.sinais[i].getValor() != v[i]) { ret = false; break; }
		}
		
		return ret;
	}

}
