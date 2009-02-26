package br.ufrj.dcc.arq.vista;

import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import br.ufrj.dcc.arq.parse.ArquivoTexto;


public class Instrucoes extends JFrame implements WindowListener{

	/**
	 * Janela das Instrucoes
	 */
	
	private static final long serialVersionUID = 1L;
	
	public static List areaTexto;
	
	private final int JanelaLargura = 450;

	private final int JanelaAltura = 450;
	
	private JLabel titulo;

	private JPanel painel;
	
	private JScrollPane scrollTextArea;
	
	private ArquivoTexto arquivoLido;
	
	private int contador;

	public Instrucoes (){
		
		/*
		 * Variavel para saber o tamanho da janela
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension tamanhoPrograma = new Dimension(JanelaLargura, JanelaAltura);
		
		titulo = new JLabel("As Instruções seguem abaixo:");
		
		areaTexto = new List();
		
		painel = new JPanel();
		
		scrollTextArea = new JScrollPane(areaTexto);
		
		painel.setLayout(null);
		
		/*
		 * Adiciona item no painel
		 */
		titulo.setBounds(130, 10, 500, 20);
		painel.add(titulo);
		
		try {
			arquivoLido = new ArquivoTexto("./arquivo/instrucoes.txt");
			contador = 0;
			while (arquivoLido.maisLinhas()) {
				
				/*Nao pega linha vazia*/
				if (!(arquivoLido.getLinha().equals(""))){
					areaTexto.add(Integer.toString(contador) + ". " + arquivoLido.getLinha());
				}
				contador++;
			}
		} catch (Exception e) {
			System.out.println("Erro no metodo LerArquivo!");
		}
		
		scrollTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollTextArea.setBounds(48,40,350,370);
		painel.add(scrollTextArea);
		
		//Mostra a Janela
		add(painel);
		setSize(tamanhoPrograma);
		setResizable(false);
		setLocation((screenSize.width - JanelaLargura) / 2,(screenSize.height - JanelaAltura) / 2);
		setTitle("Instruções");
		setVisible(true);
		
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
