package br.ufrj.dcc.arq.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

import br.ufrj.dcc.arq.controle.Controlador;

public class BarraDeMenu implements ActionListener {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	private JMenuBar barraMenu = new JMenuBar();
	
	public static CriaPrograma clicaNovoPrograma = null;

	// MENU PROGRAMA

	private JMenu menuPrograma = new JMenu();

	private JMenuItem menuNovoPrograma = new JMenuItem();
	
	private JMenuItem menuFazerPrograma = new JMenuItem();
	
	private JMenuItem menuSair = new JMenuItem();

	//MENU EXECUTAR
	
	private JMenu menuExecutar = new JMenu();
	
	private JMenuItem menuExecutaPrograma = new JRadioButtonMenuItem();
	
	private JMenuItem menuExecutaInstrucao = new JRadioButtonMenuItem();
	
	private JMenuItem menuExecutaMicroInstrucao = new JRadioButtonMenuItem();

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
			escolhePrograma.setFileFilter(new ExtensionFileFilter("Arquivos texto", "txt"));  
			if (escolhePrograma.showOpenDialog(escolhePrograma) != JFileChooser.APPROVE_OPTION)   
			   return;  
			   
			System.out.println("Arquivo selecionado: " + escolhePrograma.getSelectedFile().toString());
			Controlador controlador = new Controlador(escolhePrograma.getSelectedFile().toString());
			Controlador.executa_por_micro = false;
			Controlador.executa_por_instrucao = false;
			
			Comecar.colocarNaMemoria();
			
			//Parser parser = new Parser(escolhePrograma.getSelectedFile().toString());
		}
		else if (source == menuFazerPrograma) {
			clicaNovoPrograma = new CriaPrograma();
		}
		else if (source == menuSair) {
			System.exit(0);
		}
		else if (source == menuInstrucoes) {
			new Instrucoes();
		}
		else if (source == menuSobre) {
			new Sobre();
		}
		else if (source == menuExecutaPrograma) {
			Controlador.executa_por_instrucao = Controlador.executa_por_micro = false;
			menuExecutaPrograma.setSelected(true);
			menuExecutaInstrucao.setSelected(false);
			menuExecutaMicroInstrucao.setSelected(false);
			System.out.println("Executa Programa Inteiro.");
		}
		else if (source == menuExecutaInstrucao) {
			Controlador.executa_por_instrucao = true;
			Controlador.executa_por_micro = false;
			menuExecutaPrograma.setSelected(false);
			menuExecutaInstrucao.setSelected(true);
			menuExecutaMicroInstrucao.setSelected(false);
			System.out.println("Executa Instrucao do Programa.");
		}
		else if (source == menuExecutaMicroInstrucao) {
			Controlador.executa_por_instrucao = false;
			Controlador.executa_por_micro = true;
			menuExecutaPrograma.setSelected(false);
			menuExecutaInstrucao.setSelected(false);
			menuExecutaMicroInstrucao.setSelected(true);
			System.out.println("Executa MicroInstrucao do Programa.");
		}
	}

	/**
	 * Cria a Barra de Menu
	 */
	protected JMenuBar getBarraMenu() {
		barraMenu.add(getMenuPrograma());
		barraMenu.add(getMenuExecutar());
		barraMenu.add(getMenuAjuda());

		return barraMenu;
	}

	/**
	 * Cria o menu Arquivo na barra de menu.
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
	 * Cria o menu Executar na barra de menu.
	 */
	private JMenu getMenuExecutar() {
		menuExecutar.setMnemonic('E');
		menuExecutar.setText("Executar");
		menuExecutar.add(getSubMenuExecutaPrograma());
		menuExecutar.add(getSubMenuExecutaInstrucao());
		menuExecutar.add(getSubMenuExecutaMicroInstrucao());
		
		return menuExecutar;
	}
	
	/**
	 * Cria o submenu Executa Programa.
	 */
	private JMenuItem getSubMenuExecutaPrograma() {
		menuExecutaPrograma.setMnemonic('P');
		menuExecutaPrograma.setText("Executar Programa");
		menuExecutaPrograma.addActionListener(this);

		return menuExecutaPrograma;
	}
	
	/**
	 * Cria o submenu Executa Programa Por Instrucao.
	 */
	private JMenuItem getSubMenuExecutaInstrucao() {
		menuExecutaInstrucao.setMnemonic('I');
		menuExecutaInstrucao.setText("Executar Instrucao");
		menuExecutaInstrucao.addActionListener(this);

		return menuExecutaInstrucao;
	}
	
	/**
	 * Cria o submenu Executa Programa Por MicroInstrucao.
	 */
	private JMenuItem getSubMenuExecutaMicroInstrucao() {
		menuExecutaMicroInstrucao.setMnemonic('M');
		menuExecutaMicroInstrucao.setText("Executar MicroInstrucao");
		menuExecutaMicroInstrucao.addActionListener(this);

		return menuExecutaMicroInstrucao;
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
