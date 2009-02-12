package br.ufrj.dcc.arq.vista;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class Instrucoes extends JFrame implements WindowListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static JanelaPrincipal janela = null;

	private PainelInstrucoes painel = new PainelInstrucoes();
	
	public Instrucoes(){
		JanelaPrincipal.ProgramaLargura = 350;
		JanelaPrincipal.ProgramaAltura = 410;

		if (janela == null) {
			janela = new JanelaPrincipal();
		}

		janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		janela.addWindowListener(this);
		janela.add(painel);
		janela.setVisible(true);
	}

	
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
