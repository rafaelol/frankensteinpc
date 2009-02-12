package br.ufrj.dcc.arq.vista;

import java.awt.Component;
import java.awt.Graphics;


public class PainelInstrucoes extends Component{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Figura instrucoes = new Figura();

	public static Graphics grafico;
	
	/**
	 * Construtor da Classe. Seta a imagem INSTRUCOES.
	 * 
	 */
	
	public PainelInstrucoes(){
		instrucoes.setImagem("./imagens/fundoInstrucoes.jpg");
	}
	
	/**
	 * Pinta a imagem no Painel
	 */
	
	public void paint(Graphics graficoPrincipal) {
		if (graficoPrincipal != null) {
			grafico = graficoPrincipal;
		}
		graficoPrincipal.drawImage(instrucoes.getImagem(), 0, 0, null);
	}
}
