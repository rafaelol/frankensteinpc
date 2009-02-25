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
		//bitMemoria 	= new Bit((short)0);
		
		// Carrega o programa na memoria
		for (percorreVetorParser = 0; percorreVetorParser < parser.getVetorParser().length; percorreVetorParser++){
			//memoria.setMemPos(posicao, valor);
			proc.memoria.setMemPos(percorreVetorParser, parser.getVetorParser()[percorreVetorParser]);
		}
		
		// Imprime Posicoes de Memoria
		/* Comentado. Motivo: Verificado que foi colocado corretamente na memoria. =)
		System.out.println("\nImpressao da Memoria");
		for(int i =0; i< parser.getVetorParser().length; i++){
			System.out.print(proc.memoria.getMemPos(i) + " ");
		}
		System.out.println("\nFim da Impressao da Memoria");
		*/
		
		// IR recebe a primeira instrucao -> Isso vai morrer
		//Instrucoes.Cabecalho(executa_por_micro, proc);
		
		// Executa as instrucoes do programa.
		System.out.println("PC = " + proc.registrador.pc);
		proc.registrador.r0 = 50;
		proc.registrador.r1 = 51;
		proc.registrador.r2 = 52;
		proc.registrador.r3 = 53;
		proc.registrador.r4 = 54;
		proc.memoria.setMemPos(50, (short)1);
		proc.memoria.setMemPos(51, (short)1);
		proc.memoria.setMemPos(52, (short)1);
		proc.memoria.setMemPos(53, (short)1);
		proc.memoria.setMemPos(54, (short)1);
		System.out.println("POSICAO 50 = " + proc.memoria.getMemPos(50));
		System.out.println("POSICAO 51 = " + proc.memoria.getMemPos(51));
		System.out.println("POSICAO 52 = " + proc.memoria.getMemPos(52));
		System.out.println("POSICAO 53 = " + proc.memoria.getMemPos(53));
		System.out.println("POSICAO 54 = " + proc.memoria.getMemPos(54));
		
		while(proc.executa_programa) {
		//while(proc.memoria.getMemPos(percorreVetorParser) != 0) {
			mempos = proc.memoria.getMemPos(proc.registrador.pc);
			proc.uc.decodificaEChama(mempos, executa_por_micro, proc);
			while (executa_por_instrucao) {
				//espera proximo clique
			}
		}
		
		System.out.println("R0 = " + proc.registrador.r0);
		System.out.println("R1 = " + proc.registrador.r1);
		System.out.println("R2 = " + proc.registrador.r2);
		System.out.println("R3 = " + proc.registrador.r3);
		System.out.println("R4 = " + proc.registrador.r4);
		System.out.println("PC = " + proc.registrador.pc);
		System.out.println("POSICAO 50 = " + proc.memoria.getMemPos(50));
		System.out.println("POSICAO 51 = " + proc.memoria.getMemPos(51));
		System.out.println("POSICAO 52 = " + proc.memoria.getMemPos(52));
		System.out.println("POSICAO 53 = " + proc.memoria.getMemPos(53));
		System.out.println("POSICAO 54 = " + proc.memoria.getMemPos(54));
	}	
	
	public Controlador(String vetProg[], int tamanho) {
		super(vetProg, tamanho);
		Parser parser = new Parser(vetProg,tamanho);
		Memoria memoria = new Memoria();
	}
}
