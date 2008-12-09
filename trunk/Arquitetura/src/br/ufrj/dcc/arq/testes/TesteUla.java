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
			ula.setSinais(Ula.ADD);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("SUBAB\n");
			ula.setSinais(Ula.SUBAB);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("SUBBA\n");
			ula.setSinais(Ula.SUBBA);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("NOTA\n");
			ula.setSinais(Ula.NOTA);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("NOTB\n");
			ula.setSinais(Ula.NOTB);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("NEGA\n");
			ula.setSinais(Ula.NEGA);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("NEGB\n");
			ula.setSinais(Ula.NEGB);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("SHLA\n");
			ula.setSinais(Ula.SHLA);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("SHLB\n");
			ula.setSinais(Ula.SHLB);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("SHRA\n");
			ula.setSinais(Ula.SHRA);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("SHRB\n");
			ula.setSinais(Ula.SHRB);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("AND\n");
			ula.setSinais(Ula.AND);
			ula.opera();
			ula.imprimeUla();
	
			System.out.println("OR\n");		
			ula.setSinais(Ula.OR);
			ula.opera();
			ula.imprimeUla();
		}

	}

}
