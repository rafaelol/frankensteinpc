package br.ufrj.dcc.arq.vista;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class JanelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;

	public static int ProgramaLargura;

	public static int ProgramaAltura;
	
	Figura icone = new Figura();

	// Variavel para saber o tamanho da janela
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	Dimension tamanhoPrograma = new Dimension(ProgramaLargura, ProgramaAltura);

	/**
	 * Construtor da Classe. Nela sao definidas todos os par�metros que a janela
	 * do programa ter�.
	 * 
	 */
	public JanelaPrincipal() {

		icone.setImagem("./imagens/icone.png");
		setIconImage(icone.getImagem());
		setTitle("Trabalho de Arquitetura");
		setSize(tamanhoPrograma);
		setResizable(false);
		setLocation((screenSize.width - ProgramaLargura) / 2,
				(screenSize.height - ProgramaAltura) / 2);
	}
}
