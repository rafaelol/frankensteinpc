package br.ufrj.dcc.arq.controle;

import br.ufrj.dcc.arq.modelo.Bit;
import br.ufrj.dcc.arq.modelo.Instrucoes;
import br.ufrj.dcc.arq.modelo.Memoria;
import br.ufrj.dcc.arq.modelo.Registrador;
import br.ufrj.dcc.arq.modelo.Uc;
import br.ufrj.dcc.arq.parse.Parser;

public class Controlador extends Parser{

	public static boolean executa_por_micro;
	public static boolean executa_por_instrucao;
	
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
		Instrucoes.Cabecalho(executa_por_micro);
		
		/**
		 * Loop que executa as instruções do programa.
		 */
		percorreVetorParser = Registrador.pc;
		while(memoria.getMemPos(percorreVetorParser) != 0) {
			Uc.decodificaEChama(memoria.getMemPos(percorreVetorParser), executa_por_micro);
			while (executa_por_instrucao) {
				//espera proximo clique
			}
			percorreVetorParser = Registrador.pc;
		}
		
	}	
	
	public Controlador(String vetProg[], int tamanho) {
		super(vetProg, tamanho);
		Parser parser = new Parser(vetProg,tamanho);
		Memoria memoria = new Memoria();
	}
	
	
}
