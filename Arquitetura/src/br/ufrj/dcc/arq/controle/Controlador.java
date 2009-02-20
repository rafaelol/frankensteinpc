package br.ufrj.dcc.arq.controle;

import br.ufrj.dcc.arq.modelo.Bit;
import br.ufrj.dcc.arq.modelo.Instrucoes;
import br.ufrj.dcc.arq.modelo.Memoria;
import br.ufrj.dcc.arq.parse.Parser;

public class Controlador extends Parser{

	public Controlador(String nomeArq) {
		super(nomeArq);
		// TODO Auto-generated constructor stub
		
		Parser parser = new Parser(nomeArq);
		Memoria memoria = new Memoria();
		Bit bitMemoria = new Bit((short)0);
		int percorreVetorParser;
		
		/**
		 * Carrega o programa na Memoria
		 */
		for (percorreVetorParser = 0; percorreVetorParser < parser.getVetorParser().length; percorreVetorParser++){
			//memoria.setMemPos(posicao, valor);
			memoria.setMemPos(percorreVetorParser, parser.getVetorParser()[percorreVetorParser]);
		}
		System.out.println("\nMemoria");
		for(int i =0; i< parser.getVetorParser().length; i++){
			System.out.print(memoria.getMemPos(i) + " ");
		}
		
		/**
		 * IR recebe a primeira instrucao
		 */
		Instrucoes.Cabecalho(true);
		
	}	
	
	public Controlador(String vetProg[], int tamanho) {
		super(vetProg, tamanho);
		Parser parser = new Parser(vetProg,tamanho);
		Memoria memoria = new Memoria();
	}
	
	
}
