package br.ufrj.dcc.arq.controle;

import br.ufrj.dcc.arq.modelo.Bit;
import br.ufrj.dcc.arq.modelo.Instrucoes;
import br.ufrj.dcc.arq.modelo.Memoria;
import br.ufrj.dcc.arq.modelo.Processador;
import br.ufrj.dcc.arq.parse.Parser;

public class Controlador extends Parser{

	public static boolean executa_por_micro;
	public static boolean executa_por_instrucao;
	Processador proc;
	Parser parser;
	Bit bitMemoria;
	int percorreVetorParser;
	
	public Controlador(String nomeArq) {
		super(nomeArq);
		// TODO Auto-generated constructor stub
		short mempos;
		proc 		= new Processador();
		parser 		= new Parser(nomeArq);
		bitMemoria 	= new Bit((short)0);
		
		// Carrega o programa na memoria
		for (percorreVetorParser = 0; percorreVetorParser < parser.getVetorParser().length; percorreVetorParser++){
			//memoria.setMemPos(posicao, valor);
			proc.memoria.setMemPos(percorreVetorParser, parser.getVetorParser()[percorreVetorParser]);
		}
		
		// Imprime Posicoes de Memoria
		/* Comentado. Motivo: Verificado que foi colocado corretamente na mem�ria. =)
		System.out.println("\nImpressao da Memoria");
		for(int i =0; i< parser.getVetorParser().length; i++){
			System.out.print(proc.memoria.getMemPos(i) + " ");
		}
		System.out.println("\nFim da Impressao da Memoria");
		*/
		
		// IR recebe a primeira instrucao
		Instrucoes.Cabecalho(executa_por_micro, proc);
		
		// Executa as instru��es do programa.
		percorreVetorParser = proc.registrador.pc;
		
		while(proc.memoria.getMemPos(percorreVetorParser) != 0) {
			mempos = proc.memoria.getMemPos(percorreVetorParser);
			proc.uc.decodificaEChama(mempos, executa_por_micro, proc);
			while (executa_por_instrucao) {
				//espera proximo clique
			}
			percorreVetorParser = proc.registrador.pc;
		}	
	}	
	
	public Controlador(String vetProg[], int tamanho) {
		super(vetProg, tamanho);
		Parser parser = new Parser(vetProg,tamanho);
		Memoria memoria = new Memoria();
	}
}
