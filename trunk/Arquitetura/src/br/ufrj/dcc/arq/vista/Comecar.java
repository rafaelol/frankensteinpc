package br.ufrj.dcc.arq.vista;

import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Comecar extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JanelaPrincipal janela = null;
	
	static PainelPrincipal painel = null;
	
	private JPanel painelBotoes = new JPanel();
	Button botao1 = new Button("Botao 1");
	Button botao2 = new Button("Botao 2");
	
	/**
	 * Construtor da Classe. Cria uma nova janela e coloca o Menu e a imagem do
	 * Menu.
	 */
	public Comecar() {
		
		JanelaPrincipal.ProgramaLargura = 1010;
		JanelaPrincipal.ProgramaAltura = 800;

		BarraDeMenu menu = new BarraDeMenu();

		if (painel == null) {
			painel = new PainelPrincipal();
		}
		
		if (janela == null) {
			janela = new JanelaPrincipal();
		}

		/*Inicia as STRINGS das flags para pintar*/
		
		PainelPrincipal.a = PainelPrincipal.b = PainelPrincipal.c = PainelPrincipal.d = PainelPrincipal.e = PainelPrincipal.f = PainelPrincipal.g = PainelPrincipal.h = PainelPrincipal.i = PainelPrincipal.j = PainelPrincipal.k = PainelPrincipal.l = PainelPrincipal.m = PainelPrincipal.n = PainelPrincipal.o = PainelPrincipal.p = PainelPrincipal.q = PainelPrincipal.r = PainelPrincipal.s = PainelPrincipal.t = PainelPrincipal.u = PainelPrincipal.v = PainelPrincipal.w = PainelPrincipal.x = "0";
		
		/*Criando Grid - Container - para colocar os botões*/
		Container cp = getContentPane();
		cp.setLayout(null);
		botao1.setBounds(0,100,140,20);
		botao1.addActionListener(this);
		cp.add(botao1);
		
		botao2.setBounds(200,200,100,20);
		botao2.addActionListener(this);
		cp.add(botao2);		
		
		painelBotoes.add(cp);
		painelBotoes.setBounds(0, 0, cp.WIDTH, cp.HEIGHT);
		
		
		janela.add(painelBotoes);
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setJMenuBar(menu.getBarraMenu());// Coloca o Menu na Janela
		janela.setVisible(true);		
	}
	
	/**
	 * Executa as funcoes para cada Botao.
	 */
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();

		if (source == botao1) {
			System.out.println("Botao 1 foi clicado.");
			PainelPrincipal.a = "1";
			painel.repaint();
		}
		else if (source == botao2) {
			System.out.println("Botao 2 foi clicado.");
			PainelPrincipal.a = "0";
			painel.repaint();
		}
	}
}
