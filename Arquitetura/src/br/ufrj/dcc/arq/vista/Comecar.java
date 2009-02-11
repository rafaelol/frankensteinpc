package br.ufrj.dcc.arq.vista;

import javax.swing.JFrame;


public class Comecar {
	
	public static JanelaPrincipal janela = null;
	static PainelPrincipal painel = null;
	/**
	 * Construtor da Classe. Cria uma nova janela e coloca o Menu e a imagem do
	 * Menu.
	 */
	public Comecar() {
		
		JanelaPrincipal.ProgramaLargura = 1000;
		JanelaPrincipal.ProgramaAltura = 800;

		BarraDeMenu menu = new BarraDeMenu();

		if (painel == null) {
			painel = new PainelPrincipal();
		}
		
		if (janela == null) {
			janela = new JanelaPrincipal();
		}
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setJMenuBar(menu.getBarraMenu());// Coloca o Menu na Janela
		janela.add(painel);
		janela.setVisible(true);
	}
}
