package br.ufrj.dcc.arq.testes;

import br.ufrj.dcc.arq.modelo.Ula;
public class TesteUla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ula ula = new Ula();
		short x, y;
		
		for(int i = 0; i<100; i++) {
			x = (short)(Math.random() * 32767);	
			y = (short)(Math.random() * 32767);
			
			if(Math.random()%2 == 0) x *= -1;
			if(Math.random()%2 == 0) y *= -1;
			
			ula.setA(x);
			ula.setB(y);
			
			System.out.println("ADD\n");
			ula.opera(Ula.ADD);
			ula.imprimeUla();
	
			System.out.println("SUBAB\n");
			ula.opera(Ula.SUBAB);
			ula.imprimeUla();
	
			System.out.println("SUBBA\n");
			ula.opera(Ula.SUBBA);
			ula.imprimeUla();
	
			System.out.println("NOTA\n");
			ula.opera(Ula.NOTA);
			ula.imprimeUla();
	
			System.out.println("NOTB\n");
			ula.opera(Ula.NOTB);
			ula.imprimeUla();
	
			System.out.println("NEGA\n");
			ula.opera(Ula.NEGA);
			ula.imprimeUla();
	
			System.out.println("NEGB\n");
			ula.opera(Ula.NEGB);
			ula.imprimeUla();
	
			System.out.println("SHLA\n");
			ula.opera(Ula.SHLA);
			ula.imprimeUla();
	
			System.out.println("SHLB\n");
			ula.opera(Ula.SHLB);
			ula.imprimeUla();
	
			System.out.println("SHRA\n");
			ula.opera(Ula.SHRA);
			ula.imprimeUla();
	
			System.out.println("SHRB\n");
			ula.opera(Ula.SHRB);
			ula.imprimeUla();
	
			System.out.println("AND\n");
			ula.opera(Ula.AND);
			ula.imprimeUla();
	
			System.out.println("OR\n");		
			ula.opera(Ula.OR);
			ula.imprimeUla();
		}

	}

}
