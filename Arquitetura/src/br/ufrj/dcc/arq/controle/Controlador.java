package br.ufrj.dcc.arq.controle;

import javax.swing.JOptionPane;

import br.ufrj.dcc.arq.modelo.Memoria;
import br.ufrj.dcc.arq.modelo.Processador;
import br.ufrj.dcc.arq.modelo.Uc;
import br.ufrj.dcc.arq.modelo.Ula;
import br.ufrj.dcc.arq.parse.Parser;
import br.ufrj.dcc.arq.vista.Comecar;
import br.ufrj.dcc.arq.vista.PainelPrincipal;

/***
 * Classe que faz  ligacao do Modelo com a Vista
 */

public class Controlador extends Thread {

	public static boolean executa_por_micro;
	
	public static boolean executa_por_instrucao;
	
	public static Processador proc;
	
	public static Parser parser;
	
	private int percorreVetorParser;
	
	private short mempos;
	
	public Controlador(String nomeArq) {
		// TODO Auto-generated constructor stub
		
		proc 		= new Processador();
		parser 		= new Parser(nomeArq);

		/****
		 * Carrega o programa na memoria
		 */ 
		for (percorreVetorParser = 0; percorreVetorParser < parser.getVetorParser().length; percorreVetorParser++){

			proc.memoria.setMemPos(percorreVetorParser, parser.getVetorParser()[percorreVetorParser]);
		}
		Comecar.colocarNoListPrograma();
		Comecar.colocarNaMemoria();
	}	
	
	public Controlador(String vetProg[], int tamanho) {
		Parser parser = new Parser(vetProg,tamanho);
		Memoria memoria = new Memoria();
	}
	
	public static void repintaTela(Processador proc) {
		/***
		 * reimprime registradores
		 */   
		PainelPrincipal.r0 = Short.toString(proc.registrador.r0);
		PainelPrincipal.r1 = Short.toString(proc.registrador.r1);
		PainelPrincipal.r2 = Short.toString(proc.registrador.r2);
		PainelPrincipal.r3 = Short.toString(proc.registrador.r3);
		PainelPrincipal.r4 = Short.toString(proc.registrador.r4);
		PainelPrincipal.rDados = Short.toString(proc.registrador.rdados);
		PainelPrincipal.rEnd = Short.toString(proc.registrador.rend);
		PainelPrincipal.ri = Short.toString(proc.registrador.ri);
		PainelPrincipal.rx = Short.toString(proc.registrador.rx);
		PainelPrincipal.ry = Short.toString(proc.registrador.ry);
		PainelPrincipal.pc = Short.toString(proc.registrador.pc);
		
		/***
		 * reimprime sinais
		 */
		PainelPrincipal.a = Short.toString(proc.uc.sinais[Uc.A].getValor());
		PainelPrincipal.b = Short.toString(proc.uc.sinais[Uc.B].getValor());
		PainelPrincipal.c = Short.toString(proc.uc.sinais[Uc.C].getValor());
		PainelPrincipal.d = Short.toString(proc.uc.sinais[Uc.D].getValor());
		PainelPrincipal.e = Short.toString(proc.uc.sinais[Uc.E].getValor());
		PainelPrincipal.f = Short.toString(proc.uc.sinais[Uc.F].getValor());
		PainelPrincipal.g = Short.toString(proc.uc.sinais[Uc.G].getValor());
		PainelPrincipal.h = Short.toString(proc.uc.sinais[Uc.H].getValor());
		PainelPrincipal.i = Short.toString(proc.uc.sinais[Uc.I].getValor());
		PainelPrincipal.j = Short.toString(proc.uc.sinais[Uc.J].getValor());
		PainelPrincipal.k = Short.toString(proc.uc.sinais[Uc.K].getValor());
		PainelPrincipal.l = Short.toString(proc.uc.sinais[Uc.L].getValor());
		PainelPrincipal.m = Short.toString(proc.uc.sinais[Uc.M].getValor());
		PainelPrincipal.n = Short.toString(proc.uc.sinais[Uc.N].getValor());
		PainelPrincipal.o = Short.toString(proc.uc.sinais[Uc.O].getValor());
		PainelPrincipal.p = Short.toString(proc.uc.sinais[Uc.P].getValor());
		PainelPrincipal.q = Short.toString(proc.uc.sinais[Uc.Q].getValor());
		PainelPrincipal.r = Short.toString(proc.uc.sinais[Uc.R].getValor());
		PainelPrincipal.s = Short.toString(proc.uc.sinais[Uc.S].getValor());
		PainelPrincipal.t = Short.toString(proc.uc.sinais[Uc.T].getValor());
		PainelPrincipal.u = Short.toString(proc.uc.sinais[Uc.U].getValor());
		PainelPrincipal.v = Short.toString(proc.uc.sinais[Uc.V].getValor());
		PainelPrincipal.w = Short.toString(proc.uc.sinais[Uc.W].getValor());
		PainelPrincipal.x = Short.toString(proc.uc.sinais[Uc.X].getValor());
		
		/***
		 * reimprime flags
		 */
		if(proc.ula.getFlags()[Ula.CARRY] != 0){
			PainelPrincipal.carry = "x";		
		}
		if(proc.ula.getFlags()[Ula.OVERFLOW] != 0){
			PainelPrincipal.overflow = "x";
		}
		if(proc.ula.getFlags()[Ula.PARIDADE] != 0){
			PainelPrincipal.paridade = "x";
		}
		if(proc.ula.getFlags()[Ula.SINAL] != 0){
			PainelPrincipal.sinal = "x";
		}
		if(proc.ula.getFlags()[Ula.ZERO] != 0){
			PainelPrincipal.zero = "x";
		}
		
		/***
		 * reimprime flags
		 */
		Comecar.painelFundo.repaint();
	}
	public synchronized void run() {
			try {
				
				while(proc.executa_programa) {
					
					Comecar.status.setText("Pronto");
					
					mempos = proc.memoria.getMemPos(proc.registrador.pc);	
					Comecar.listaMemoria.select(Comecar.retornarIndexListMemoria(String.valueOf(mempos)));
					proc.uc.decodificaEChama(mempos, proc);
					System.out.println("**********************************");
					System.out.println("Impressao de Registradores e Flags");
					System.out.println("**********************************");
					System.out.println("R0 = " + proc.registrador.r0);
					System.out.println("R1 = " + proc.registrador.r1);
					System.out.println("R2 = " + proc.registrador.r2);
					System.out.println("R3 = " + proc.registrador.r3);
					System.out.println("R4 = " + proc.registrador.r4);
					System.out.println("PC = " + proc.registrador.pc);
					System.out.println("RDADOS = " + proc.registrador.rdados);
					System.out.println("REND = " + proc.registrador.rend);
					System.out.println("RI = " + proc.registrador.ri);
					System.out.println("RX = " + proc.registrador.rx);
					System.out.println("RY = " + proc.registrador.ry);
					System.out.println("(R0) = " + proc.memoria.getMemPos(Memoria.ConverteInt(proc.registrador.r0)));
					System.out.println("(R1) = " + proc.memoria.getMemPos(Memoria.ConverteInt(proc.registrador.r1)));
					System.out.println("(R2) = " + proc.memoria.getMemPos(Memoria.ConverteInt(proc.registrador.r2)));
					System.out.println("(R3) = " + proc.memoria.getMemPos(Memoria.ConverteInt(proc.registrador.r3)));
					System.out.println("(R4) = " + proc.memoria.getMemPos(Memoria.ConverteInt(proc.registrador.r4)));
					System.out.println("\n");
					System.out.println("Flag CARRY    = " + proc.ula.getFlags()[Ula.CARRY]);
					System.out.println("Flag OVERFLOW = " + proc.ula.getFlags()[Ula.OVERFLOW]);
					System.out.println("Flag PARIDADE = " + proc.ula.getFlags()[Ula.PARIDADE]);
					System.out.println("Flag SINAL    = " + proc.ula.getFlags()[Ula.SINAL]);
					System.out.println("Flag ZERO     = " + proc.ula.getFlags()[Ula.ZERO]);
					System.out.println("****************");
					System.out.println("Fim da Impressao");
					System.out.println("****************");
					repintaTela(proc);
					
					while (executa_por_instrucao) {// interrompe a thread
						sleep(1000 / 80);
						Comecar.status.setText("Esperando ...");
					}
					
					if (Comecar.cliqueProximoPassoInstrucao){
						executa_por_instrucao = true;
					}					
				}
				Comecar.proximoPasso.setText("Iniciar");
				Comecar.finalizar.setEnabled(false);
				Comecar.status.setText("Pronto");
				JOptionPane.showMessageDialog(null, "Fim de Execucao !", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				System.out.println("Erro na Thread Controlador");
			}
	}
}
