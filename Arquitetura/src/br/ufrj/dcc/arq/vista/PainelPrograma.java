package br.ufrj.dcc.arq.vista;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PainelPrograma extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PainelPrograma() {
		JButton botao1 = new JButton();
		Container cp = getContentPane();
		cp.setLayout(null);
		botao1.setBounds(0,100,140,20);
		//botao1.addActionListener(this);
		cp.add(botao1);
		
	}

}
