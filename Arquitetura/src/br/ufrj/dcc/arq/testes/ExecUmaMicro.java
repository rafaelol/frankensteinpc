package br.ufrj.dcc.arq.testes;

public class ExecUmaMicro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short numero;
		int numeroint;
		
		numero = 10;
		numeroint = ( numero & 0xffff );		
		System.out.println("short = " + numero);
		System.out.println("int   = " + numeroint);	

		numero = (short)64000;
		numeroint = ( numero & 0xffff );		
		System.out.println("short = " + numero);
		System.out.println("int   = " + numeroint);	
	
	}

}
