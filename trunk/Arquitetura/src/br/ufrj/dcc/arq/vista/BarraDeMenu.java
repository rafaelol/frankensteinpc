package br.ufrj.dcc.arq.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.ufrj.dcc.arq.parse.Parser;

public class BarraDeMenu implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar barraMenu = new JMenuBar();

	// MENU PROGRAMA

	private JMenu menuPrograma = new JMenu();

	private JMenuItem menuNovoPrograma = new JMenuItem();
	
	private JMenuItem menuFazerPrograma = new JMenuItem();
	
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
			
			JFileChooser escolhePrograma = new JFileChooser();  
			escolhePrograma.setFileFilter(new ExtensionFileFilter("Arquivos de texto", "txt", "log", "html", "htm", "css"));  
			if (escolhePrograma.showOpenDialog(escolhePrograma) != JFileChooser.APPROVE_OPTION)   
			   return;  
			   
			System.out.println("Arquivo selecionado: " + escolhePrograma.getSelectedFile().toString());
			Parser parser = new Parser(escolhePrograma.getSelectedFile().toString());
		}
		else if (source == menuFazerPrograma) {
			new CriaPrograma();
		}
		else if (source == menuSair) {
			System.exit(0);
		}
		else if (source == menuInstrucoes) {
			new Instrucoes();
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
		menuPrograma.add(getSubMenuCarregarPrograma());
		menuPrograma.add(getSubMenuNovoPrograma());
		menuPrograma.addSeparator();
		menuPrograma.add(getSubMenuSair());

		return menuPrograma;
	}

	/**
	 * Cria o submenu Carregar Programa.
	 */
	private JMenuItem getSubMenuCarregarPrograma() {
		menuNovoPrograma.setMnemonic('C');
		menuNovoPrograma.setText("Carregar Programa");
		menuNovoPrograma.addActionListener(this);

		return menuNovoPrograma;
	}
	
	/**
	 * Cria o submenu Criar Programa.
	 */
	private JMenuItem getSubMenuNovoPrograma() {
		menuFazerPrograma.setMnemonic('P');
		menuFazerPrograma.setText("Criar Programa");
		menuFazerPrograma.addActionListener(this);

		return menuFazerPrograma;
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
