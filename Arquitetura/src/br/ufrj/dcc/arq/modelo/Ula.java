package br.ufrj.dcc.arq.modelo;

/**
 * Determina o comportamento de uma Unidade Logica e Aritimetica simples.
 * 
 * Trabalha com dados de 16 bits, e opera somente sobre as suas propriedades.
 * Possui um conjunto de sinais de controle que determinam a operacao a ser 
 * realizada e um conjunto de flags que prove informacoes sobre a ultima operacao
 * realizada.
 *  
 * Foi utilizada como fonte de Consulta sobre as condicoes sob as quais
 * as flags da ULA sao alteradas a pagina do professor Nelson Quilula Vasconcelos:
 * 
 * http://www.dcc.ufrj.br/~cp/maq2002/3INDICAD.HTM
 *     
 * @author Francisco Viegas Vianna
 * 
 */

public class Ula {
	public static final int QTD_FLAGS  = 5;
	public static final int QTD_SINAIS = 6;
	
	/** Usados para setar o vetor de Flags */
	public static final int SINAL    = 0;
	public static final int OVERFLOW = 1;
	public static final int CARRY    = 2;
	public static final int ZERO     = 3;
	public static final int PARIDADE = 4;

	/** Usado para setar o vetor de sinais de controle */
	public static final int R = 0; // Mais Significativo
	public static final int S = 1;
	public static final int T = 2;
	public static final int U = 3;
	public static final int V = 4;	
	public static final int W = 5; // Menos Significativo	
	
	/**  Configuracoes dos sinais da ULA e as operacoes correspondentes */
	public static final short[] PASSAA 		= {0,0,0,0,0,0};
	public static final short[] PASSAB 		= {0,0,0,0,0,1};
	public static final short[] ADD    		= {0,0,0,0,1,0};
	public static final short[] SUBAB 	 	= {0,0,0,0,1,1};
	public static final short[] SUBBA  		= {0,0,0,1,0,0};
	public static final short[] NOTA   		= {0,0,0,1,0,1};
	public static final short[] NOTB   		= {0,0,0,1,1,0};
	public static final short[] NEGA   		= {0,0,0,1,1,1};
	public static final short[] NEGB	   	= {0,0,1,0,0,0};
	public static final short[] SHLA   		= {0,0,1,0,0,1};
	public static final short[] SHLB   		= {0,0,1,0,1,0};
	public static final short[] SHRA   		= {0,0,1,0,1,1};
	public static final short[] SHRB   		= {0,0,1,1,0,0};
	public static final short[] AND    		= {0,0,1,1,0,1};
	public static final short[] OR     		= {0,0,1,1,1,0}; 
	public static final short[] INCA   		= {0,0,1,1,1,1};
	public static final short[] INCB   		= {0,1,0,0,0,0};
	public static final short[] PASSAZERO   = {0,1,0,0,0,1};
	
	
	/** Primeiro operando da ULA */
	private short a;
	/** Segundo operando da ULA */
	private short b;
	/** Resultado da operacao sobre A e/ou B - Saida da ULA*/
	public static short s; 
	
	/** String de sinais de controle */
	private Bit sinais[] = new Bit[QTD_SINAIS];
	/** Vetor de Bits de flags de status da ULA */
	private Bit flags[]  = new Bit[QTD_FLAGS];


	/******************** Construtores ********************
	 ******************************************************
	 * Atribui 0 aos atributos a, b e s.
	 * Instancia os Bits das Flags e dos Sinais, atriuindo 0 a todos.
	 */
	public Ula()
	{
		for(int i = 0; i < QTD_FLAGS; i++) {
			this.flags[i] = new Bit((short)0);
		}
		
		for(int i = 0; i < QTD_SINAIS; i++) {
			this.sinais[i] = new Bit((short)0);
		}
		
		this.a = this.b = s = 0;
	}

	
	/****************** Getters e Setters *****************
	 ******************************************************
	 * Get para o atributo 'sinais'.
	 * 
	 * @return Vetor de shorts com o estado atual dos sinais de controle da ULA.
	 */
	public short[] getSinais() {
		short vet[] = {sinais[R].getValor(),
			    	   sinais[S].getValor(),
			    	   sinais[T].getValor(),
			    	   sinais[U].getValor(),
			    	   sinais[V].getValor(),
			    	   sinais[W].getValor()
			   	      };
		
		return vet;
	}
	
	/**********************************
	 * Set para o atributo 'sinais'.
	 * 
	 * @param Vetor de shorts com um estado para os sinais de controle da ULA.
	 */
	public void setSinais(short[] v) {
		sinais[R].setValor(v[R]);
		sinais[S].setValor(v[S]);
		sinais[T].setValor(v[T]);
		sinais[U].setValor(v[U]);
		sinais[V].setValor(v[V]);
		sinais[W].setValor(v[W]);
	}

	/**********************************
	 * Get e Set para o atributo 'flags'.
	 * 
	 * @return Vetor de shorts com o estado atual das flags de status da ULA.
	 */
	public short[] getFlags() {
		short[] ret = {flags[SINAL].getValor(),
					   flags[OVERFLOW].getValor(),
					   flags[CARRY].getValor(),
					   flags[ZERO].getValor(),
					   flags[PARIDADE].getValor() };
	
		return ret;
	}
	
	/**********************************
	 * Set para o atributo 'flags'.
	 * 
	 * @param Vetor de Bits com uma configuracao para as flags de status da ULA.
	 */
	public void setFlags(short[] v) {
		this.flags[SINAL].setValor(v[SINAL]);
		this.flags[OVERFLOW].setValor(v[OVERFLOW]);
		this.flags[CARRY].setValor(v[CARRY]);
		this.flags[ZERO].setValor(v[ZERO]);
		this.flags[PARIDADE].setValor(v[PARIDADE]);
	}

	/**********************************
	 * Get para o atributo 'A'.
	 * 
	 * @return Valor atual do atributo A.
	 */
	public short getA() {
		return this.a;
	}

	/**********************************
	 * Set para o atributo 'A'.
	 * 
	 * @Param Um valor para ser atribuido ao atributo A.
	 */
	public void setA(short a) {
		this.a = a;
	}

	/**********************************
	 * Get para o atributo 'B'
	 * 
	 * @return Valor atual do atributo B
	 */
	public short getB() {
		return this.b;
	}

	/**********************************
	 * Set para o atributo 'B'.
	 * 
	 * @Param Um valor para ser atribuido ao atributo B.
	 */
	public void setB(short b) {
		this.b = b;
	}

	
	/****************** Funcoes da ULA ******************
	 ****************************************************
	 * Soma os dois operandos A B e atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 *    Overflow se operandos de mesmo sinal e resultado de sinal diferente.
	 *    Carry se a soma terminar em vai um (propagar um 17o bit)
	 */
	public void add() {
		s = (short)((short)a + (short)b);
		int s2 = a + b;
		
		if( ((a > 0) && (b > 0) && (s < 0)) || ((a < 0) && (b < 0) && (s > 0)) ) 
			this.flags[OVERFLOW].setValor((short)1);
		else
			this.flags[OVERFLOW].setValor((short)0);
		
		if((s2 & 0x00010000) == 0x00010000)
			this.flags[CARRY].setValor((short)1);
		else
			this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/**********************************
	 * Subtrai do operando B o operando A (B-A) e atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 *    Overflow se operandos de sinal diferente e resultado de sinal diferente do minuendo(B).
	 *    Carry se modulo do minuendo(B) for menor que o modulo do subtrendo(A).
	 */	
	public void subAB() {
		int op1, op2;
		
		s = (short)((short)b - (short)a);
		
		if((b < 0) && (a > 0) && (s > 0))
		{
			this.flags[OVERFLOW].setValor((short)1);
		}
		else
		{
			if((b > 0) && (a < 0) && (s < 0))
			{
				this.flags[OVERFLOW].setValor((short)1);
			}
			else
			{
				this.flags[OVERFLOW].setValor((short)0);
			}
		}
			
		if(a < 0) op1 = a * -1; else op1 = a;
		if(b < 0) op2 = b * -1; else op2 = b;
		
		if(op2 < op1)
			this.flags[CARRY].setValor((short)1);
		else
			this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);	
	}
	
	/**********************************
	 * Subtrai do operando A o operando B (A-B) e atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 *    Overflow se operandos de sinal diferente e resultado de sinal diferente do minuendo(A).
	 *    Carry se modulo do minuendo(A) for menor que o modulo do subtraendo(B).
	 */	
	public void subBA() {
		int op1, op2;
		
		s = (short)((short)a - (short)b);
		
		if((a < 0) && (b > 0) && (s > 0))
		{
			this.flags[OVERFLOW].setValor((short)1);
		}
		else
		{
			if((a > 0) && (b < 0) && (s < 0))
			{
				this.flags[OVERFLOW].setValor((short)1);
			}
			else
			{
				this.flags[OVERFLOW].setValor((short)0);
			}
		}
		
		if(a < 0) op1 = a * -1; else op1 = a;
		if(b < 0) op2 = b * -1; else op2 = b;
		
		if(op1 < op2)
			this.flags[CARRY].setValor((short)1);
		else
			this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);			
	}

	/**********************************
	 * Copia o operando A para a saida.
	 */
	public void passaA() {
		s = a;
	}
	
	/**********************************
	 * Copia o operando B para a saida.
	 */	
	public void passaB() {
		s = b;
	}

	/**********************************
	 * Faz a negacao logica do operando A e atribui esse valor a saida.
	 * 
	 * Nao Altera nenhuma das flags.
	 */
	public void notA() {	
		s = (short)(~ (short)a);
	}

	/**********************************
	 * Faz a negacao logica do operando B e atribui esse valor a saida.
	 * 
	 * Nao Altera nenhuma das flags.
	 */
	public void notB() {	
		s = (short)(~ (int)b);
	}

	/**********************************
	 * Faz a negacao aritmetica do operando A e atribui esse valor a saida.
	 * 
	 * Nao Altera nenhuma das flags.
	 */
	public void negA() {
		s = (short)((short)-1 * a);
	}

	/**********************************
	 * Faz a negacao aritmetica do operando B e atribui esse valor a saida.
	 * 
	 * Nao Altera nenhuma das flags.
	 */
	public void negB() {
		s = (short)((short)-1 * b);
	}

	/**********************************
	 * Realiza uma operacao de deslocamento a esquerda com o operando A e 
	 * atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Overflow se muda o sinal do operando.
	 *    Carry recebe o bit que sobrou apos o deslocamento.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 */
	public void shlA() {
		s = (short)((short)a << 1);

		if((a < 0) && (s > 0)) {
			this.flags[OVERFLOW].setValor((short)1);
		}
		else
		{
			if((a > 0) && (s < 0)) {
				this.flags[OVERFLOW].setValor((short)1);
			}
			else
			{
				this.flags[OVERFLOW].setValor((short)0);
			}
		}
		
		if((a & 0x8000) == 0x8000) this.flags[CARRY].setValor((short)1);
		else this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/**********************************
	 * Realiza uma operacao de deslocamento a esquerda com o operando B e 
	 * atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Overflow se muda o sinal do operando.
	 *    Carry recebe o bit que sobrou apos o deslocamento.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 */
	public void shlB() {
		s = (short)((short)b << 1);

		if((b < 0) && (s > 0)) {
			this.flags[OVERFLOW].setValor((short)1);
		}
		else
		{
			if((b > 0) && (s < 0)) {
				this.flags[OVERFLOW].setValor((short)1);
			}
			else
			{
				this.flags[OVERFLOW].setValor((short)0);
			}
		}
		
		if((b & 0x8000) == 0x8000) this.flags[CARRY].setValor((short)1);
		else this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/**********************************
	 * Realiza uma operacao de deslocamento a direita com o operando A e 
	 * atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Overflow se muda o sinal do operando.
	 *    Carry recebe o bit que sobrou apos o deslocamento.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 */	
	public void shrA(){
		s = (short)(a >> 1);
		
		if((a < 0) && (s > 0)) {
			this.flags[OVERFLOW].setValor((short)1);
		}
		else
		{
			if((a > 0) && (s < 0)) {
				this.flags[OVERFLOW].setValor((short)1);
			}
			else
			{
				this.flags[OVERFLOW].setValor((short)0);
			}
		}
		
		if(a % 2 == 1) this.flags[CARRY].setValor((short)1); 
		else this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}
	
	/**********************************
	 * Realiza uma operacao de deslocamento a direita com o operando B e 
	 * atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Overflow se muda o sinal do operando.
	 *    Carry recebe o bit que sobrou apos o deslocamento.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 */
	public void shrB(){
		s = (short)(b >> 1);
		
		if((b < 0) && (s > 0)) {
			this.flags[OVERFLOW].setValor((short)1);
		}
		else
		{
			if((b > 0) && (s < 0)) {
				this.flags[OVERFLOW].setValor((short)1);
			}
			else
			{
				this.flags[OVERFLOW].setValor((short)0);
			}
		}
		
		if(b % 2 == 1) this.flags[CARRY].setValor((short)1); 
		else this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/**********************************
	 * Realiza o 'e' logico dos operandos A e B e atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *    Zera Flags Carry e Overflow.
	 *    Paridade, Sinal e Zero de acordo com o resultado.
	 */
	public void and() {
		s = (short)((short)a & (short)b);

		this.flags[CARRY].setValor((short)0);
		this.flags[OVERFLOW].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/**********************************
	 *  Realiza o 'ou' logico dos operandos A e B e atribui esse valor a saida.
	 * 
	 * Altera todas as flags.
	 *   Zera Flags Carry e Overflow.
	 *   Paridade, Sinal e Zero de acordo com o resultado.
	 */
	public void or() {
		s = (short)((short)a | (short)b);
		
		this.flags[CARRY].setValor((short)0);
		this.flags[OVERFLOW].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}
	
	/**********************************
	 *  Realiza a instrucao Passa Zero. Com isso, a saida da Ula sair� com o valor 0.
	 * 
	 * Altera a Zero-Flag, setando com o valor 1.
	 */
	public void passaZero() {
		s = (short) 0;
		
		setarFlagsSinalZeroParidade(s);
	}
	
	/**********************************
	 *  Realiza a instrucao IncA. Com isso, a saida da Ula sair� com o valor A + 1.
	 * 
	 * Altera todas as flags.
	 */
	public void incA() {
		s = (short)((short)a + (short)1);
		int s2 = a + 1;
		
		if( ((a > 0) && (s < 0)) || ((a < 0) && (s > 0)) ) 
			this.flags[OVERFLOW].setValor((short)1);
		else
			this.flags[OVERFLOW].setValor((short)0);
		
		if((s2 & 0x00010000) == 0x00010000)
			this.flags[CARRY].setValor((short)1);
		else
			this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/**********************************
	 *  Realiza a instrucao IncB. Com isso, a saida da Ula sair� com o valor B + 1.
	 * 
	 * Altera todas as flags.
	 */
	public void incB() {
		s = (short)((short)b + (short)1);
		int s2 = b + 1;
		
		if( ((b > 0) && (s < 0)) || ((b < 0) && (s > 0)) ) 
			this.flags[OVERFLOW].setValor((short)1);
		else
			this.flags[OVERFLOW].setValor((short)0);
		
		if((s2 & 0x00010000) == 0x00010000)
			this.flags[CARRY].setValor((short)1);
		else
			this.flags[CARRY].setValor((short)0);
		
		setarFlagsSinalZeroParidade(s);
	}

	/************** Metodos Auxiliares *****************
	 ***************************************************
	 * Seta as flags de sinal e zero, de acordo com valor especificado.
	 *
	 * @param Valor utilzado como referencia para a atribuicao de valores das flags.
	 *        Tipicamente o resultado de uma das operacoes da ULA.  
	 */
	public void setarFlagsSinalZeroParidade(short a) {

		/* Signal */
		if(a < 0) {
			this.flags[SINAL].setValor((short)1);
		}
		else {
			this.flags[SINAL].setValor((short)0);
		}
		
		/* Zero */
		if(a == 0) {
			this.flags[ZERO].setValor((short)1);
		}
		else {
			this.flags[ZERO].setValor((short)0);
		}
		
		verificaParidade();
	}
	
	/**********************************
	 * Verifica se o numero de bits com valor 1 no atributo S eh par.
	 * Seta a flag de de paridade, caso seja.
	 */
	public void verificaParidade() {
		int cont = 0;
		String str = Integer.toBinaryString(s);
		String str2 = "";
		
		if(s < 0) {
			str2 += str.charAt(0);
			for(int i=17; i<str.length(); i++) str2 += str.charAt(i);
		}
		else
		{
			for(int i = 0; i < 16 - str.length(); i++) str2 += '0';
			for(int j = 0; j < str.length(); j++) str2 += str.charAt(j);
		}
		
		System.out.println(str2);
		
		for(int i=0; i < str2.length(); i++) {
			if(str2.charAt(i) == '1') cont ++;
		}
		
		if(cont % 2 == 0) this.flags[PARIDADE].setValor((short)1);
		else this.flags[PARIDADE].setValor((short)0);
	}
	
	/**********************************
	 * Imprime o status atual da ULA.
	 */
	public void imprimeUla() {
		System.out.println("==============================================\n");
		System.out.println("a = " + a + "  //  b = " + b + "  //  s = " + s + "\n");
		System.out.println("Carry    = " + flags[CARRY].getValor());
		System.out.println("Zero     = " + flags[ZERO].getValor());
		System.out.println("Overflow = " + flags[OVERFLOW].getValor());
		System.out.println("Sinal    = " + flags[SINAL].getValor());
		System.out.println("Paridade = " + flags[PARIDADE].getValor());
		
		System.out.println("\nR = " + sinais[R].getValor());
		System.out.println("S = " + sinais[S].getValor());
		System.out.println("T = " + sinais[T].getValor());
		System.out.println("U = " + sinais[U].getValor());
		System.out.println("V = " + sinais[V].getValor());
		System.out.println("W = " + sinais[W].getValor());
		System.out.println("==============================================\n");
	}
	
	/**********************************
	 * Decide, de acordo com os sinais de controle da ULA, qual sera a operacao a
	 * ser realizada sobre os operadores A e B, chamando o metodo correspondente.
	 */
	public void opera(Processador proc) {
		short vet[] = {
						proc.uc.sinais[Uc.R].getValor(),
						proc.uc.sinais[Uc.S].getValor(),
						proc.uc.sinais[Uc.T].getValor(),
						proc.uc.sinais[Uc.U].getValor(),
						proc.uc.sinais[Uc.V].getValor(),
						proc.uc.sinais[Uc.W].getValor(),
				      };
				
		this.setSinais(vet);
		this.a = proc.mux4.s;
		this.b = proc.mux5.s;
		
		if     (comparaSinais(PASSAA)    == true) passaA();
		else if(comparaSinais(PASSAB) 	 == true) passaB();
		else if(comparaSinais(ADD)    	 == true) add();
		else if(comparaSinais(SUBAB)  	 == true) subAB();
		else if(comparaSinais(SUBBA)  	 == true) subBA();
		else if(comparaSinais(NOTA) 	 == true) notA();
		else if(comparaSinais(NOTB)   	 == true) notB();
		else if(comparaSinais(NEGA)   	 == true) negA();
		else if(comparaSinais(NEGB)  	 == true) negB();
		else if(comparaSinais(SHLA)   	 == true) shlA();
		else if(comparaSinais(SHLB)   	 == true) shlB();
		else if(comparaSinais(SHRA)      == true) shrA();
		else if(comparaSinais(SHRB)    	 == true) shrB();
		else if(comparaSinais(AND)    	 == true) and();
		else if(comparaSinais(OR)     	 == true) or();
		else if(comparaSinais(INCA)    	 == true) incA();
		else if(comparaSinais(INCB)    	 == true) incB();
		else if(comparaSinais(PASSAZERO) == true) passaZero();
	}

	/**********************************
	 * Compara os sinais da ULA com uma configuracao dada, referente a uma de suas operacoes.
	 * 
	 * @return true, caso seja igual a configuracao testada.
	 * @retun  false, caso contrario.
	 */
	public boolean comparaSinais(short[] p) {
		boolean ret = true;
		short[] v = getSinais();
		
		for(int i = 0; i<QTD_SINAIS; i++) {	
			if(v[i] != p[i]) { 
				ret = false;
				break;
			}
		}
		
		return ret;
	}
}