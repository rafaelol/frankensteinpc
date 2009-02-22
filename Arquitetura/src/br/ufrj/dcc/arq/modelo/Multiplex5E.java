package br.ufrj.dcc.arq.modelo;

public class Multiplex5E {
	public static final int QTD_SINAIS = 3;
	public static final int ID         = Uc.O;

	/** Usado para setar o sinal de controle */
	public static final int O = 0;
	public static final int P = 1;
	public static final int Q = 2;
	
	/**  Configurações dos sinais do multiplex e as operações correspondentes */
	public static final short[] PASSAR2 = {0,0,0};
	public static final short[] PASSAR3 = {0,0,1};
	public static final short[] PASSAR4 = {0,1,0};
	public static final short[] PASSARY = {0,1,1};
	public static final short[] PASSAPC = {1,0,0};
	
	/** Recebe valores de R2 */
	public short a;
	/** Recebe valores de R3 */
	public short b;
	/** Recebe valores de R4 */
	public short c;
	/** Recebe valores de RY */
	public short d;
	/** Recebe valores de PC */
	public short e;
	/** Saida */
	public static short s;
	
	/** Sinais de controle */
	public Bit[] sinais = new Bit[QTD_SINAIS];

	
	/******************** Construtores ********************
	 ******************************************************
	 * Atribui 0 aos atributos a, b, c, d e s.
	 * Instancia os Bits dos sinais, atriuindo 0 a todos.
	 */
	public Multiplex5E() {
		a = b = c = d = e = s = (short)0;
		for(int i =0; i<QTD_SINAIS; i++) {
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
		short[] ret = {sinais[O].getValor(),
				       sinais[P].getValor(),
				       sinais[Q].getValor()};
		return ret;
	}

	/**********************************
	 * Setter para o atributo 'sinais'.
	 * 
	 * @param v Vetor de short com uma configuração válida para os sinais de controle.
	 */
	public void setSinais(short[] v) {
		this.sinais[O].setValor(v[O]);
		this.sinais[P].setValor(v[P]);
		this.sinais[Q].setValor(v[Q]);
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

	/**********************************
	 * Getter para o atributo 'e'.
	 * 
	 * @return Valor de 'e'.
	 */
	public short getE() {
		return e;
	}

	/**********************************
	 * Setter para o atributo 'e'.
	 * 
	 * @param a Valor que será atribuido a 'e'. 
	 */
	public void setE(short e) {
		this.e = e;
	}

	
	/**************** Funções do Multiplex ****************
	 ******************************************************
	 * Escolhe qual operando será propagado para a saída de acordo 
	 * com a configuração dos sinais de controle.
	 */
	public void opera() {
		this.a = Registrador.r2;
		this.b = Registrador.r3;
		this.c = Registrador.r4;
		this.d = Registrador.ry;
		this.e = Registrador.pc;
		
		short vet[] = {Uc.sinais[Uc.O].getValor(),
			           Uc.sinais[Uc.P].getValor(),
			           Uc.sinais[Uc.Q].getValor()
				  };
		
		this.setSinais(vet);
		
		if (compara(PASSAR2)) s = a;
		if (compara(PASSAR3)) s = b;
		if (compara(PASSAR4)) s = c;
		if (compara(PASSARY)) s = d;
		if (compara(PASSAPC)) s = e;
	}
	
	/**********************************
	 * Compara os valores em sinais com o vetor de sinais fornecido como parâmetro.
	 * 
	 * @param v Vetor com uma configuração de sinais de controle.
	 * @return Valor booleano que indica se o vetor 'sinais' é igual ao atributo fornecido. 
	 */
	public boolean compara(short[] b) {
		boolean ret = true;
		
		for(int i = 0; i<QTD_SINAIS; i++) {
			if(sinais[i].getValor() != b[i]) ret = false;
		}
		
		return ret;
	}

}
