package br.ufrj.dcc.arq.vista;

import java.awt.Color;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import br.ufrj.dcc.arq.controle.Controlador;


public class Comecar extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static JanelaPrincipal janela = null;
	
	static PainelPrincipal painelFundo = null;
	
	public static JPanel painelMemoria = null;
	
	public static JPanel painelMemoriaControl = null;
	
	public static JPanel painelEsquerdo = null;
	
	public static List listaMemoria = new List();
	
	public static List listaMemoriaControl = new List();	
	
	/**
	 * Construtor da Classe. Cria uma nova janela e coloca o Menu e a imagem do
	 * Menu.
	 */
	
	public Comecar() {
		
		JanelaPrincipal.ProgramaLargura = 1000;
		
		JanelaPrincipal.ProgramaAltura = 640;

		BarraDeMenu menu = new BarraDeMenu();
		
		JScrollPane scrollTextAreaControl = new JScrollPane(listaMemoriaControl);
		
		Color corMemoriaControl = new Color(255,255,255);
		
		JScrollPane scrollTextArea = new JScrollPane(listaMemoria);
		
		Color corMemoria = new Color(198,255,198);
		
		if (painelFundo == null) {
			painelFundo = new PainelPrincipal();
		}
		
		if (janela == null) {
			janela = new JanelaPrincipal();
		}

		if (painelMemoria == null) {
			painelMemoria = new JPanel();
		}
		
		if (painelMemoriaControl == null) {
			painelMemoriaControl = new JPanel();
		}
		
		if (painelEsquerdo == null) {
			painelEsquerdo = new JPanel();
		}
		
		painelFundo.setBounds(195, 0, 1000, 730);
		painelMemoria.setBounds(215, 255, 197, 230);
		painelMemoria.setBackground(corMemoria);
		painelMemoriaControl.setBounds(842, 300, 0, 110);
		painelMemoriaControl.setBackground(corMemoriaControl);
		
		painelEsquerdo.setBounds(0, 0, 195, 730);
		
		/*Inicia as STRINGS das flags para pintar*/
		
		PainelPrincipal.a = PainelPrincipal.b = PainelPrincipal.c = PainelPrincipal.d = PainelPrincipal.e = PainelPrincipal.f = PainelPrincipal.g = PainelPrincipal.h = PainelPrincipal.i = PainelPrincipal.j = PainelPrincipal.k = PainelPrincipal.l = PainelPrincipal.m = PainelPrincipal.n = PainelPrincipal.o = PainelPrincipal.p = PainelPrincipal.q = PainelPrincipal.r = PainelPrincipal.s = PainelPrincipal.t = PainelPrincipal.u = PainelPrincipal.v = PainelPrincipal.w = PainelPrincipal.x = "0";
		
		
		/*
		 * Lista que ficara na memoria principal: ira imprimir o getVetorParser
		 */
		listaMemoria.add("Memoria vazia !");
		
		painelMemoria.setLayout(null);
		listaMemoria.setBackground(corMemoria);
		scrollTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTextArea.setBounds(0,0,197,230);
		painelMemoria.add(scrollTextArea);
		
		listaMemoria.setFocusable(true);

		/*
		 * Lista que ficara na memoria de controle
		 */
		
		painelMemoriaControl.setLayout(null);
		listaMemoriaControl.setBackground(corMemoriaControl);
		scrollTextAreaControl.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextAreaControl.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTextAreaControl.setBounds(0,0,0,106);
		painelMemoriaControl.add(scrollTextAreaControl);
		
		listaMemoriaControl.setFocusable(true);
		
		/*
		 * Seta a janela
		 */
		janela.setLayout(null);
		janela.add(painelMemoria);
		janela.add(painelMemoriaControl);
		janela.add(painelEsquerdo);
		janela.add(painelFundo);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setJMenuBar(menu.getBarraMenu());// Coloca o Menu na Janela
		janela.setVisible(true);		
	}
	
	public static void colocarNaMemoria(){	
		
		listaMemoria.removeAll();
		for(int cont = 0; cont < Controlador.parser.getVetorParser().length - 1; cont++){
			listaMemoria.add(Integer.toString(cont + 1) + ". " + String.valueOf(Controlador.parser.getVetorParser()[cont]));
		}
		listaMemoria.select(0);
	}
}
