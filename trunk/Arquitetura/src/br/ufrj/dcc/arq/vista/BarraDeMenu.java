package br.ufrj.dcc.arq.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraDeMenu implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar barraMenu = new JMenuBar();

	// MENU JOGO

	private JMenu menuPrograma = new JMenu();

	private JMenuItem menuNovoPrograma = new JMenuItem();
	
	private JMenuItem menuSair = new JMenuItem();
	

	// MENU AJUDA

	private JMenu menuAjuda = new JMenu();

	private JMenuItem menuInstrucoes = new JMenuItem();

	private JMenuItem menuSobre = new JMenuItem();

	/**
	 * Executa as funcoes para cada parte do Menu.
	 */
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();

		if (source == menuNovoPrograma) {
			System.out.println("Novo Programa");
		}
		else if (source == menuSair) {
			System.exit(0);
		}
		else if (source == menuInstrucoes) {
			System.out.println("Instrucoes");
		}
		else if (source == menuSobre) {
			System.out.println("Sobre");
		}
	}

	/**
	 * Cria a Barra de Menu
	 */
	protected JMenuBar getBarraMenu() {
		barraMenu.add(getMenuPrograma());
		barraMenu.add(getMenuAjuda());

		return barraMenu;
	}

	/**
	 * Cria o menu Jogo na barra de menu.
	 */
	private JMenu getMenuPrograma() {
		menuPrograma.setMnemonic('A');
		menuPrograma.setText("Arquivo");
		menuPrograma.add(getSubMenuNovoJogo());
		menuPrograma.addSeparator();
		menuPrograma.add(getSubMenuSair());

		return menuPrograma;
	}

	/**
	 * Cria o submenu Novo Jogo.
	 */
	private JMenuItem getSubMenuNovoJogo() {
		menuNovoPrograma.setMnemonic('N');
		menuNovoPrograma.setText("Novo Programa");
		menuNovoPrograma.addActionListener(this);

		return menuNovoPrograma;
	}


	/**
	 * Cria o submenu Sair.
	 */
	private JMenuItem getSubMenuSair() {
		menuSair.setMnemonic('S');
		menuSair.setText("Sair");
		menuSair.addActionListener(this);

		return menuSair;
	}

	/**
	 * Cria o menu Ajuda na barra de menu.
	 */
	private JMenu getMenuAjuda() {
		menuAjuda.setMnemonic('j');
		menuAjuda.setText("Ajuda");
		menuAjuda.add(getSubMenuInstrucoes());
		menuAjuda.addSeparator();
		menuAjuda.add(getSubMenuSobre());

		return menuAjuda;
	}

	/**
	 * Cria o submenu Instrucoes.
	 */
	private JMenuItem getSubMenuInstrucoes() {
		menuInstrucoes.setMnemonic('I');
		menuInstrucoes.setText("Instrucoes");
		menuInstrucoes.addActionListener(this);

		return menuInstrucoes;
	}

	/**
	 * Cria o submenu Sobre.
	 */
	private JMenuItem getSubMenuSobre() {
		menuSobre.setMnemonic('S');
		menuSobre.setText("Sobre");
		menuSobre.addActionListener(this);

		return menuSobre;
	}

	public static void Pausar() {
		//Pintar.interromperPintar = true;
	}
}
