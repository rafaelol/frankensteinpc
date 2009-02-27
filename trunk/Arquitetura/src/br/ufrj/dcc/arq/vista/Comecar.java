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
import br.ufrj.dcc.arq.parse.Parser;


public class Comecar extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static Thread controla = null;
	
	public static JanelaPrincipal janela = null;
	
	public static PainelPrincipal painelFundo = null;
	
	public static JPanel painelMemoria = null;
	
	public static JPanel painelMemoriaControl = null;
	
	public static JPanel painelPrograma = null;
	
	public static JPanel painelControle = null;
	
	public static List listaMemoria = new List();
	
	public static List listaMemoriaControl = new List();
	
	public static List listaPrograma = new List();
	
	public static JButton proximoPasso = null;
	
	public static JButton finalizar = null;
	
	public static JLabel modoOperacao = null;
	
	public static JLabel status = null;
	
	public static boolean cliqueMenuComecar = true;
	
	public static boolean cliqueProximoPasso = false;
	
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
		
		JScrollPane scrollTextPrograma = new JScrollPane(listaPrograma);
		
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
		painelMemoriaControl.setBounds(842, 300, 0, 110);
		painelMemoriaControl.setBackground(corMemoriaControl);
		
		painelPrograma.setBounds(10, 290, 175, 300);
		
		painelPrograma.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Programa"));
		
		painelControle.setBounds(10, 10, 175, 280);
		
		painelControle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Controle"));
		
		/*
		 * Inicia as STRINGS das flags, registradores para pintar
		 */
		
		PainelPrincipal.a = PainelPrincipal.b = PainelPrincipal.c = PainelPrincipal.d = PainelPrincipal.e = PainelPrincipal.f = PainelPrincipal.g = PainelPrincipal.h = PainelPrincipal.i = PainelPrincipal.j = PainelPrincipal.k = PainelPrincipal.l = PainelPrincipal.m = PainelPrincipal.n = PainelPrincipal.o = PainelPrincipal.p = PainelPrincipal.q = PainelPrincipal.r = PainelPrincipal.s = PainelPrincipal.t = PainelPrincipal.u = PainelPrincipal.v = PainelPrincipal.w = PainelPrincipal.x = "0";
		PainelPrincipal.r0 = PainelPrincipal.r1 = PainelPrincipal.r2 = PainelPrincipal.r3 = PainelPrincipal.r4 = PainelPrincipal.pc = PainelPrincipal.rDados = PainelPrincipal.rEnd = PainelPrincipal.ri = PainelPrincipal.rx = PainelPrincipal.ry = "NULO";
		PainelPrincipal.zero = PainelPrincipal.sinal = PainelPrincipal.carry = PainelPrincipal.overflow = PainelPrincipal.paridade = "";
		
		/*
		 * Coloca falso nas flags executar por instrucao E executar por microinstrucao
		 */
		
		Controlador.executa_por_micro = false;
		Controlador.executa_por_instrucao = false;
		
		/*
		 * Lista que ficara na memoria principal: ira imprimir o getVetorParser
		 */
		listaMemoria.add("Memoria vazia !");

		
		
		/*String[] nomeColuna = {"Endere�o", "Conte�do"};
		Object[][] dados = {
				{"0","224"},
				{"0","225"},
				{"0","226"},
				{"0","227"},
				{"0","228"},
				{"0","229"},
				{"0","221"},
				{"0","222"},
				{"0","223"},
				{"0","224"},
				{"0","225"},
				{"0","226"},
				{"0","227"},
				{"0","228"},
				{"0","229"},
				{"0","220"},
				{"0","221"},
				{"0","222"},
				{"0","222"},
				{"0","223"},
				{"0","224"},
				{"0","225"},
				{"0","224"},
				{"0","224"},
				{"0","224"}
			};
		JTable table = new JTable(dados,nomeColuna);
		
		
		JScrollPane scrollTextArea = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		TableColumn column = null;
		column = table.getColumnModel().getColumn(0);
		column.setPreferredWidth(15);
		
		painelMemoria.setLayout(null);
		table.setBackground(corMemoria);
		scrollTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTextArea.setBounds(0,0,197,230);
		painelMemoria.add(scrollTextArea);*/
		
		
		
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
		
		painelMemoriaControl.setLayout(null);
		listaMemoriaControl.setBackground(corMemoriaControl);
		scrollTextAreaControl.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextAreaControl.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTextAreaControl.setBounds(0,0,0,106);
		painelMemoriaControl.add(scrollTextAreaControl);
		
		listaMemoriaControl.setFocusable(true);
		
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
		status = new JLabel("Esperando ...");
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
		listaMemoria.removeAll();
		for(contadorList = 0; contadorList < Controlador.parser.getVetorParser().length; contadorList++){
			listaMemoria.add(Integer.toString(contadorList) + ". " + String.valueOf(Controlador.parser.getVetorParser()[contadorList]));
		}
		
		//fica muito lerdo...
		/*for(int cont = contadorList; cont < Memoria.TAM_MEM; cont++){
			listaMemoria.add(Integer.toString(cont) + ". ");
		}*/
		
		listaMemoria.select(0);
	}
	
	public static void colocarNoListPrograma(){
		listaPrograma.removeAll();
		for (int contador=0; contador < Parser.Vet_Linhas.length; contador++){
			listaPrograma.add(Parser.Vet_Linhas[contador]);
		}
	}
	
	public static int retornarIndexListMemoria(String item){
		
		int indice;

		for(indice = 0; indice < listaMemoria.getItemCount(); indice++){
			if (listaMemoria.getItem(indice).equals(Integer.toString(indice) + ". " + item)){
				break;
			}
		}
		if (indice == listaMemoria.getItemCount()){
			return 0;
		}else{
			return indice;
		}		
	}
	
	public static void zeraMemoriaEPrograma(){
		listaPrograma.removeAll();
		listaPrograma.add("Programa Pronto!");
		status.setText("Pronto");
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
					proximoPasso.setText("Pr�ximo Passo");
					finalizar.setEnabled(true);
				}
				
				if(cliqueMenuComecar){
					controla = new Controlador(BarraDeMenu.escolhePrograma.getSelectedFile().toString());
					controla.start();
				}
				else{
					controla = new Controlador("./arquivo/programa.txt");
					controla.start();
				}
				
			}else if(proximoPasso.getText().equals("Pr�ximo Passo")){
				Controlador.executa_por_instrucao = false;
				cliqueProximoPasso = true;
			}
		}
		else if(source == finalizar){
			proximoPasso.setText("Iniciar");
			finalizar.setEnabled(false);
		}
		
	}	
}
