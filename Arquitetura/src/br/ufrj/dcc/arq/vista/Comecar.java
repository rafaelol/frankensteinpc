package br.ufrj.dcc.arq.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import br.ufrj.dcc.arq.controle.Controlador;
import br.ufrj.dcc.arq.modelo.Instrucoes;
import br.ufrj.dcc.arq.parse.Parser;


public class Comecar extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static Thread controla = null;
	
	static Instrucoes instrucao = null;
	
	public static JanelaPrincipal janela = null;
	
	public static PainelPrincipal painelFundo = null;
	
	public static JPanel painelMemoria = null;
	
	public static JPanel painelMemoriaControl = null;
	
	public static JPanel painelPrograma = null;
	
	public static JPanel painelControle = null;
	
	public static List listaMemoria = new List();
	
	public static List listaMemoriaControl = new List(7,false);
	
	public static List listaPrograma = new List();
	
	public static JButton proximoPasso = null;
	
	public static JButton finalizar = null;
	
	public static JLabel modoOperacao = null;
	
	public static JLabel status = null;
	
	public static boolean cliqueMenuComecar = true;
	
	public static boolean cliqueProximoPassoInstrucao = false;
	
	public static boolean cliqueProximoPassoMicroInstrucao = false;
	
	/**
	 * Construtor da Classe. Cria uma nova janela e coloca o Menu e a imagem do
	 * Menu.
	 */
	
	public Comecar() {
		
		JanelaPrincipal.ProgramaLargura = 1000;
		
		JanelaPrincipal.ProgramaAltura = 640;

		BarraDeMenu menu = new BarraDeMenu();
		
		Color corMemoriaControl = new Color(255,255,255);
		
		JScrollPane scrollTextArea = new JScrollPane(listaMemoria);
		
		Color corMemoria = new Color(198,255,198);
		
		JScrollPane scrollTextPrograma = new JScrollPane(listaPrograma);
		
		double numAleatorioReg;
		
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
		
		if (painelPrograma == null) {
			painelPrograma = new JPanel();
		}
		
		if (painelControle == null) {
			painelControle = new JPanel();
		}
		
		painelFundo.setBounds(195, 0, 1000, 730);
		
		painelMemoria.setBounds(215, 255, 197, 230);
		
		painelMemoria.setBackground(corMemoria);
		
		painelMemoriaControl.setBounds(842, 300, 20, 100);
		
		painelMemoriaControl.setBackground(Color.black);
		
		painelPrograma.setBounds(10, 290, 175, 300);
		
		painelPrograma.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Programa"));
		
		painelControle.setBounds(10, 10, 175, 280);
		
		painelControle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Controle"));
		
		/*
		 * Inicia as STRINGS das flags, registradores para pintar
		 */
		
		PainelPrincipal.a = PainelPrincipal.b = PainelPrincipal.c = PainelPrincipal.d = PainelPrincipal.e = PainelPrincipal.f = PainelPrincipal.g = PainelPrincipal.h = PainelPrincipal.i = PainelPrincipal.j = PainelPrincipal.k = PainelPrincipal.l = PainelPrincipal.m = PainelPrincipal.n = PainelPrincipal.o = PainelPrincipal.p = PainelPrincipal.q = PainelPrincipal.r = PainelPrincipal.s = PainelPrincipal.t = PainelPrincipal.u = PainelPrincipal.v = PainelPrincipal.w = PainelPrincipal.x = "0";
		PainelPrincipal.zero = PainelPrincipal.sinal = PainelPrincipal.carry = PainelPrincipal.overflow = PainelPrincipal.paridade = "";
		
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.r0 = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.r1 = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.r2 = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.r3 = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.r4 = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.rDados = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.rEnd = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.ri = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.rx = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 1000*Math.random();
		PainelPrincipal.ry = Integer.toString((int)numAleatorioReg);
		numAleatorioReg = 210*Math.random();
		PainelPrincipal.rEndUC = Integer.toString((int)numAleatorioReg);
		PainelPrincipal.pc = "0";
		
		/*
		 * Coloca falso nas flags executar por instrucao E executar por microinstrucao
		 */
		
		Controlador.executa_por_micro = false;
		Controlador.executa_por_instrucao = false;
		Controlador.executa_por_micro = false;
		
		/*
		 * Lista que ficara na memoria principal: ira imprimir o getVetorParser
		 */
		
//		listaMemoria.add("Memoria vazia !");
		inicializaListMemoria();

		listaMemoria.setFocusable(true);		
		
		
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
		
		colocarNoListMemoriaControle();
		
		painelMemoriaControl.setLayout(null);
		listaMemoriaControl.setBackground(corMemoriaControl);
		listaMemoriaControl.setBounds(3,0,122,108);
		listaMemoriaControl.setFocusable(false);
		painelMemoriaControl.add(listaMemoriaControl);
	
		
		
		/*
		 * Lista que ficara no Programa
		 */
		
		painelPrograma.setLayout(null);
		scrollTextPrograma.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextPrograma.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTextPrograma.setBounds(10,20,155,270);
		painelPrograma.add(scrollTextPrograma);
		
		/*
		 * Painel Controle
		 */
	
		painelControle.setLayout(new FlowLayout(FlowLayout.CENTER,250,10));
		proximoPasso = new JButton("Iniciar");
		proximoPasso.setEnabled(false);
		proximoPasso.addActionListener(this);
		painelControle.add(proximoPasso);
		
		JLabel modoOperacaoTitulo = new JLabel("Modo Operacao: ");
		modoOperacaoTitulo.setBounds(0, 0, 100, 100);
		painelControle.add(modoOperacaoTitulo);
		modoOperacao = new JLabel("Executar Programa");
		modoOperacao.setBounds(0, 0, 100, 100);
		modoOperacao.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12));
		painelControle.add(modoOperacao);
		
		finalizar = new JButton("Finalizar");
		finalizar.addActionListener(this);
		finalizar.setEnabled(false);
		painelControle.add(finalizar);
		
		JLabel statusTitulo = new JLabel("Status: ");
		statusTitulo.setBounds(0, 0, 100, 100);
		painelControle.add(statusTitulo);
		status = new JLabel("Carregue um Programa");
		status.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12));
		status.setBounds(0, 0, 100, 100);
		painelControle.add(status);
		
		
		/*
		 * Seta a janela
		 */
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setJMenuBar(menu.getBarraMenu());// Coloca o Menu na Janela

		janela.setLayout(null);
		janela.add(painelFundo);
		janela.add(painelMemoria);
		janela.add(painelPrograma);
		janela.add(painelMemoriaControl);
		janela.add(painelControle);
		janela.setVisible(true);
		
	}
	
	public static void colocarNaMemoria(){	
		int contadorList;
		//listaMemoria.removeAll();
		
		for(contadorList = 0; contadorList < Parser.qnt_codigo; contadorList++){
			listaMemoria.replaceItem(Integer.toString(contadorList) + ". " + String.valueOf(Controlador.parser.getVetorParser()[contadorList]),contadorList);
		}
		
		listaMemoria.select(0);
	}
	
	public static void inicializaListMemoria(){
		int contadorList;
		listaMemoria.removeAll();
		
		//for(contadorList = 0; contadorList < Memoria.TAM_MEM; contadorList++){
		for(contadorList = 0; contadorList < 10000; contadorList++){
			listaMemoria.add(Integer.toString(contadorList) + ". 0");
		}
		
		listaMemoria.select(0);
	}
	
	public static void colocarNoListPrograma(){
		listaPrograma.removeAll();
		for (int contador=0; contador < Parser.Vet_Linhas.length; contador++){
			listaPrograma.add(Parser.Vet_Linhas[contador]);
		}
	}
	
	public static void colocarNoListMemoriaControle(){
		listaMemoriaControl.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 9));
		listaMemoriaControl.add("PC_REC_PCMAIS1"); 
		listaMemoriaControl.add("IR_REC_RDADOS"); 
		listaMemoriaControl.add("REND_REC_PC"); 
		listaMemoriaControl.add("REND_REC_R0"); 
		listaMemoriaControl.add("REND_REC_R1"); 
		listaMemoriaControl.add("REND_REC_R2"); 
		listaMemoriaControl.add("REND_REC_R3"); 
		listaMemoriaControl.add("REND_REC_R4"); 
		listaMemoriaControl.add("RY_REC_RDADOS");
		listaMemoriaControl.add("RY_REC_R0"); 
		listaMemoriaControl.add("RY_REC_R1"); 
		listaMemoriaControl.add("RX_REC_RDADOS"); 
		listaMemoriaControl.add("RX_REC_R2"); 
		listaMemoriaControl.add("RX_REC_R3"); 
		listaMemoriaControl.add("RX_REC_R4"); 
		listaMemoriaControl.add("RDADOS_REC_INFLIDA"); 
		listaMemoriaControl.add("RDADOS_REC_RDADOSMAISRY"); 
		listaMemoriaControl.add("RDADOS_REC_R0MAISRY"); 
		listaMemoriaControl.add("RDADOS_REC_R1MAISRY"); 
		listaMemoriaControl.add("RDADOS_REC_R2MAISRX"); 
		listaMemoriaControl.add("RDADOS_REC_R3MAISRX"); 
		listaMemoriaControl.add("RDADOS_REC_R4MAISRX"); 
		listaMemoriaControl.add("RDADOS_REC_RYMENOSRDADOS"); 
		listaMemoriaControl.add("RDADOS_REC_R0MENOSRY"); 
		listaMemoriaControl.add("RDADOS_REC_R1MENOSRY"); 
		listaMemoriaControl.add("RDADOS_REC_R2MENOSRX"); 
		listaMemoriaControl.add("RDADOS_REC_R3MENOSRX"); 
		listaMemoriaControl.add("RDADOS_REC_R4MENOSRX"); 
		listaMemoriaControl.add("RDADOS_REC_RY"); 
		listaMemoriaControl.add("RDADOS_REC_R0"); 
		listaMemoriaControl.add("RDADOS_REC_R1"); 
		listaMemoriaControl.add("RDADOS_REC_R2"); 
		listaMemoriaControl.add("RDADOS_REC_R3"); 
		listaMemoriaControl.add("RDADOS_REC_R4"); 
		listaMemoriaControl.add("RDADOS_REC_RDADOSANDRY"); 
		listaMemoriaControl.add("RDADOS_REC_R0ANDRY"); 
		listaMemoriaControl.add("RDADOS_REC_R1ANDRY"); 
		listaMemoriaControl.add("RDADOS_REC_R2ANDRX"); 
		listaMemoriaControl.add("RDADOS_REC_R3ANDRX"); 
		listaMemoriaControl.add("RDADOS_REC_R4ANDRX"); 
		listaMemoriaControl.add("RDADOS_REC_RDADOSORRY"); 
		listaMemoriaControl.add("RDADOS_REC_R0ORRY"); 
		listaMemoriaControl.add("RDADOS_REC_R1ORRY"); 
		listaMemoriaControl.add("RDADOS_REC_R2ORRX"); 
		listaMemoriaControl.add("RDADOS_REC_R3ORRX"); 
		listaMemoriaControl.add("RDADOS_REC_R4ORRX"); 
		listaMemoriaControl.add("RDADOS_REC_NOTRDADOS"); 
		listaMemoriaControl.add("RDADOS_REC_NEGRDADOS"); 
		listaMemoriaControl.add("RDADOS_REC_0"); 
		listaMemoriaControl.add("RDADOS_REC_SHLRDADOS"); 
		listaMemoriaControl.add("RDADOS_REC_SHRRDADOS"); 
		listaMemoriaControl.add("R0_REC_R0ANDRY"); 
		listaMemoriaControl.add("R0_REC_R0ANDR2"); 
		listaMemoriaControl.add("R0_REC_R0ANDR3");
		listaMemoriaControl.add("R0_REC_R0ANDR4"); 
		listaMemoriaControl.add("R0_REC_R0ORRY"); 
		listaMemoriaControl.add("R0_REC_R0ORR2"); 
		listaMemoriaControl.add("R0_REC_R0ORR3"); 
		listaMemoriaControl.add("R0_REC_R0ORR4"); 
		listaMemoriaControl.add("R0_REC_R0MAISRY"); 
		listaMemoriaControl.add("R0_REC_R0MAISR2"); 
		listaMemoriaControl.add("R0_REC_R0MAISR3"); 
		listaMemoriaControl.add("R0_REC_R0MAISR4"); 
		listaMemoriaControl.add("R0_REC_RYMENOSR0"); 
		listaMemoriaControl.add("R0_REC_R2MENOSR0"); 
		listaMemoriaControl.add("R0_REC_R3MENOSR0"); 
		listaMemoriaControl.add("R0_REC_R4MENOSR0"); 
		listaMemoriaControl.add("R0_REC_RDADOS"); 
		listaMemoriaControl.add("R0_REC_R1"); 
		listaMemoriaControl.add("R0_REC_R2"); 
		listaMemoriaControl.add("R0_REC_R3"); 
		listaMemoriaControl.add("R0_REC_R4"); 
		listaMemoriaControl.add("R0_REC_NOTR0"); 
		listaMemoriaControl.add("R0_REC_NEGR0"); 
		listaMemoriaControl.add("R0_REC_0"); 
		listaMemoriaControl.add("R0_REC_SHLR0"); 
		listaMemoriaControl.add("R0_REC_SHRR0"); 
		listaMemoriaControl.add("R1_REC_R1ANDRY"); 
		listaMemoriaControl.add("R1_REC_R1ANDR2"); 
		listaMemoriaControl.add("R1_REC_R1ANDR3"); 
		listaMemoriaControl.add("R1_REC_R1ANDR4"); 
		listaMemoriaControl.add("R1_REC_R1ORRY"); 
		listaMemoriaControl.add("R1_REC_R1ORR2"); 
		listaMemoriaControl.add("R1_REC_R1ORR3"); 
		listaMemoriaControl.add("R1_REC_R1ORR4"); 
		listaMemoriaControl.add("R1_REC_R1MAISRY"); 
		listaMemoriaControl.add("R1_REC_R1MAISR2"); 
		listaMemoriaControl.add("R1_REC_R1MAISR3"); 
		listaMemoriaControl.add("R1_REC_R1MAISR4"); 
		listaMemoriaControl.add("R1_REC_RYMENOSR1"); 
		listaMemoriaControl.add("R1_REC_R2MENOSR1"); 
		listaMemoriaControl.add("R1_REC_R3MENOSR1"); 
		listaMemoriaControl.add("R1_REC_R4MENOSR1"); 
		listaMemoriaControl.add("R1_REC_RDADOS"); 
		listaMemoriaControl.add("R1_REC_R0"); 
		listaMemoriaControl.add("R1_REC_R2"); 
		listaMemoriaControl.add("R1_REC_R3"); 
		listaMemoriaControl.add("R1_REC_R4"); 
		listaMemoriaControl.add("R1_REC_NOTR1"); 
		listaMemoriaControl.add("R1_REC_NEGR1"); 
		listaMemoriaControl.add("R1_REC_0"); 
		listaMemoriaControl.add("R1_REC_SHLR1"); 
		listaMemoriaControl.add("R1_REC_SHRR1"); 
		listaMemoriaControl.add("R2_REC_R2ANDRDADOS");
		listaMemoriaControl.add("R2_REC_R2ANDR0"); 
		listaMemoriaControl.add("R2_REC_R2ANDR1"); 
		listaMemoriaControl.add("R2_REC_R2ANDRX");
		listaMemoriaControl.add("R2_REC_R2ORRDADOS"); 
		listaMemoriaControl.add("R2_REC_R2ORR0"); 
		listaMemoriaControl.add("R2_REC_R2ORR1"); 
		listaMemoriaControl.add("R2_REC_R2ORRX"); 
		listaMemoriaControl.add("R2_REC_R2MAISRDADOS"); 
		listaMemoriaControl.add("R2_REC_R2MAISRX"); 
		listaMemoriaControl.add("R2_REC_R2MAISR0"); 
		listaMemoriaControl.add("R2_REC_R2MAISR1"); 
		listaMemoriaControl.add("R2_REC_RDADOSMENOSR2"); 
		listaMemoriaControl.add("R2_REC_RXMENOSR2"); 
		listaMemoriaControl.add("R2_REC_R0MENOSR2");
		listaMemoriaControl.add("R2_REC_R1MENOSR2"); 
		listaMemoriaControl.add("R2_REC_RDADOS"); 
		listaMemoriaControl.add("R2_REC_R0"); 
		listaMemoriaControl.add("R2_REC_R1"); 
		listaMemoriaControl.add("R2_REC_R3");
		listaMemoriaControl.add("R2_REC_R4"); 
		listaMemoriaControl.add("R2_REC_NOTR2"); 
		listaMemoriaControl.add("R2_REC_NEGR2"); 
		listaMemoriaControl.add("R2_REC_0"); 
		listaMemoriaControl.add("R2_REC_SHLR2"); 
		listaMemoriaControl.add("R2_REC_SHRR2"); 
		listaMemoriaControl.add("R3_REC_R3ANDRDADOS"); 
		listaMemoriaControl.add("R3_REC_R3ANDR0"); 
		listaMemoriaControl.add("R3_REC_R3ANDR1"); 
		listaMemoriaControl.add("R3_REC_R3ANDRX"); 
		listaMemoriaControl.add("R3_REC_R3ORRDADOS"); 
		listaMemoriaControl.add("R3_REC_R3ORR0"); 
		listaMemoriaControl.add("R3_REC_R3ORR1"); 
		listaMemoriaControl.add("R3_REC_R3ORRX"); 
		listaMemoriaControl.add("R3_REC_R3MAISRDADOS"); 
		listaMemoriaControl.add("R3_REC_R3MAISRX"); 
		listaMemoriaControl.add("R3_REC_R3MAISR0"); 
		listaMemoriaControl.add("R3_REC_R3MAISR1"); 
		listaMemoriaControl.add("R3_REC_RDADOSMENOSR3"); 
		listaMemoriaControl.add("R3_REC_RXMENOSR3"); 
		listaMemoriaControl.add("R3_REC_R0MENOSR3"); 
		listaMemoriaControl.add("R3_REC_R1MENOSR3"); 
		listaMemoriaControl.add("R3_REC_RDADOS"); 
		listaMemoriaControl.add("R3_REC_R0"); 
		listaMemoriaControl.add("R3_REC_R1"); 
		listaMemoriaControl.add("R3_REC_R2"); 
		listaMemoriaControl.add("R3_REC_R4"); 
		listaMemoriaControl.add("R3_REC_NOTR3"); 
		listaMemoriaControl.add("R3_REC_NEGR3"); 
		listaMemoriaControl.add("R3_REC_0"); 
		listaMemoriaControl.add("R3_REC_SHLR3"); 
		listaMemoriaControl.add("R3_REC_SHRR3"); 
		listaMemoriaControl.add("R4_REC_R4ANDRDADOS"); 
		listaMemoriaControl.add("R4_REC_R4ANDR0"); 
		listaMemoriaControl.add("R4_REC_R4ANDR1"); 
		listaMemoriaControl.add("R4_REC_R4ANDRX"); 
		listaMemoriaControl.add("R4_REC_R4ORRDADOS"); 
		listaMemoriaControl.add("R4_REC_R4ORR0"); 
		listaMemoriaControl.add("R4_REC_R4ORR1"); 
		listaMemoriaControl.add("R4_REC_R4ORRX"); 
		listaMemoriaControl.add("R4_REC_R4MAISRDADOS"); 
		listaMemoriaControl.add("R4_REC_R4MAISRX"); 
		listaMemoriaControl.add("R4_REC_R4MAISR0"); 
		listaMemoriaControl.add("R4_REC_R4MAISR1"); 
		listaMemoriaControl.add("R4_REC_RDADOSMENOSR4"); 
		listaMemoriaControl.add("R4_REC_RXMENOSR4"); 
		listaMemoriaControl.add("R4_REC_R0MENOSR4"); 
		listaMemoriaControl.add("R4_REC_R1MENOSR4"); 
		listaMemoriaControl.add("R4_REC_RDADOS"); 
		listaMemoriaControl.add("R4_REC_R0"); 
		listaMemoriaControl.add("R4_REC_R1"); 
		listaMemoriaControl.add("R4_REC_R2"); 
		listaMemoriaControl.add("R4_REC_R3"); 
		listaMemoriaControl.add("R4_REC_NOTR4"); 
		listaMemoriaControl.add("R4_REC_NEGR4"); 
		listaMemoriaControl.add("R4_REC_0"); 
		listaMemoriaControl.add("R4_REC_SHLR4"); 
		listaMemoriaControl.add("R4_REC_SHRR4"); 
		listaMemoriaControl.add("RYMENOSR0"); 
		listaMemoriaControl.add("R2MENOSR0");
		listaMemoriaControl.add("R3MENOSR0"); 
		listaMemoriaControl.add("R4MENOSR0"); 
		listaMemoriaControl.add("RYMENOSR1"); 
		listaMemoriaControl.add("R2MENOSR1"); 
		listaMemoriaControl.add("R3MENOSR1"); 
		listaMemoriaControl.add("R4MENOSR1"); 
		listaMemoriaControl.add("RDADOSMENOSR2");
		listaMemoriaControl.add("RXMENOSR2"); 
		listaMemoriaControl.add("R0MENOSR2");
		listaMemoriaControl.add("R1MENOSR2"); 
		listaMemoriaControl.add("RDADOSMENOSR3");
		listaMemoriaControl.add("RXMENOSR3"); 
		listaMemoriaControl.add("R0MENOSR3"); 
		listaMemoriaControl.add("R1MENOSR3"); 
		listaMemoriaControl.add("RDADOSMENOSR4");
		listaMemoriaControl.add("RXMENOSR4"); 
		listaMemoriaControl.add("R0MENOSR4"); 
		listaMemoriaControl.add("R1MENOSR4"); 
		listaMemoriaControl.add("RYMENOSRDADOS"); 
		listaMemoriaControl.add("R0MENOSRY"); 
		listaMemoriaControl.add("R1MENOSRY"); 
		listaMemoriaControl.add("R2MENOSRX"); 
		listaMemoriaControl.add("R3MENOSRX"); 
		listaMemoriaControl.add("R4MENOSRX"); 
		listaMemoriaControl.add("RY_REC_PC");
		listaMemoriaControl.add("PC_REC_RYMAISRDADOS");

		
	}
	
	public static int retornarIndexListMemoria(String item){
		
		int indice;
		int indiceAtual;
		
		indiceAtual = listaMemoria.getSelectedIndex();
		
		for(indice = 0; indice < listaMemoria.getItemCount(); indice++){
			if (listaMemoria.getItem(indice).equals(Integer.toString(indice) + ". " + item)){
				if(indice > indiceAtual)
					break;
			}
		}
		if (indice == listaMemoria.getItemCount()){
			return 0;
		}else{
			return indice;
		}		
	}

	public static int retornarIndexListMemoriaControle(String item){
		
		int indice;
	
		for(indice = 0; indice < listaMemoriaControl.getItemCount(); indice++){
			if (listaMemoriaControl.getItem(indice).equals(item)){
				break;
			}
		}
		
		Controlador.repintaTela(Controlador.proc);
		
		
		if (indice == listaMemoriaControl.getItemCount()){
			return 0;
		}else{
			return indice;
		}		
	}
	
	public static void zeraMemoriaEPrograma(){
		listaPrograma.removeAll();
		listaPrograma.add("Programa Pronto!");
		status.setText("Pronto");
		proximoPasso.setText("Iniciar");
		finalizar.setEnabled(false);
		Controlador.executa_por_instrucao = false;
		Controlador.executa_por_micro = false;
		cliqueProximoPassoInstrucao = false;
		cliqueProximoPassoMicroInstrucao = false;
		/*
		 * zera PC no inicio de cada programa.
		 */
		PainelPrincipal.pc = "0";
		
		/*PainelPrincipal.a = PainelPrincipal.b = PainelPrincipal.c = PainelPrincipal.d = PainelPrincipal.e = PainelPrincipal.f = PainelPrincipal.g = PainelPrincipal.h = PainelPrincipal.i = PainelPrincipal.j = PainelPrincipal.k = PainelPrincipal.l = PainelPrincipal.m = PainelPrincipal.n = PainelPrincipal.o = PainelPrincipal.p = PainelPrincipal.q = PainelPrincipal.r = PainelPrincipal.s = PainelPrincipal.t = PainelPrincipal.u = PainelPrincipal.v = PainelPrincipal.w = PainelPrincipal.x = "0";
		PainelPrincipal.r0 = PainelPrincipal.r1 = PainelPrincipal.r2 = PainelPrincipal.r3 = PainelPrincipal.r4 = PainelPrincipal.rDados = PainelPrincipal.rEnd = PainelPrincipal.ri = PainelPrincipal.rx = PainelPrincipal.ry = "NULO";
		PainelPrincipal.zero = PainelPrincipal.sinal = PainelPrincipal.carry = PainelPrincipal.overflow = PainelPrincipal.paridade = "";
		*/
		painelFundo.repaint();
	}
	
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();

		if (source == proximoPasso) {
			
			if(proximoPasso.getText().equals("Iniciar")){
				/*
				 * limpa flags
				 */
				PainelPrincipal.zero = PainelPrincipal.sinal = PainelPrincipal.carry = PainelPrincipal.overflow = PainelPrincipal.paridade = "";
				
				if (!modoOperacao.getText().equals("Executar Programa")){
					proximoPasso.setText("Proximo Passo");
					finalizar.setEnabled(true);
				}
				
				if(cliqueMenuComecar){
					controla = new Controlador(BarraDeMenu.escolhePrograma.getSelectedFile().toString());
					instrucao = new Instrucoes();
					controla.start();
					instrucao.start();
				}
				else{
					controla = new Controlador("./arquivo/programa.txt");
					controla.start();
				}
				
				if(modoOperacao.getText().equals("Executar Instrucao")){
					Controlador.executa_por_instrucao = true;
				}
				if(modoOperacao.getText().equals("Executar MicroInstrucao")){
					Controlador.executa_por_micro = true;
				}
				
			}else if(proximoPasso.getText().equals("Proximo Passo")){
				if(modoOperacao.getText().equals("Executar Instrucao")){
					Controlador.executa_por_instrucao = false;
					cliqueProximoPassoInstrucao = true;
				}
				if(modoOperacao.getText().equals("Executar MicroInstrucao")){
					Controlador.executa_por_instrucao = false;
					cliqueProximoPassoInstrucao = false;
					Controlador.executa_por_micro = false;
					cliqueProximoPassoMicroInstrucao = true;
				}
			}			
		}
		else if(source == finalizar){
			proximoPasso.setText("Iniciar");
			finalizar.setEnabled(false);
			Controlador.executa_por_instrucao = false;
			Controlador.executa_por_micro = false;
			cliqueProximoPassoInstrucao = false;
			cliqueProximoPassoMicroInstrucao = false;
		}
		
	}	
}
