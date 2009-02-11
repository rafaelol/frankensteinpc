package br.ufrj.dcc.arq.vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;


public class PainelPrincipal extends Component{
	private static final long serialVersionUID = 1L;

	private Figura fundoMenu = new Figura();

	private Figura fundoJogo1 = new Figura();

	private Figura fundoJogo2 = new Figura();

	private Figura fundoJogo3 = new Figura();

	private Figura gameover = new Figura();

	private Figura instrucoes = new Figura();

	private Figura recordes = new Figura();

	public static Figura pausar = new Figura();

	public static boolean inicioJogo;

	public static boolean atirar = false;

	public static boolean fundo;

	public static int posicaoExplosao;

	public static boolean colidiram, colidiuTodos, parabens;

	public static int contador;

	int intPosicao = 0;

	public static Graphics grafico;

	String temp = new String();
	
	public void paint(Graphics graficoPrincipal) {

		if (graficoPrincipal != null) {
			grafico = graficoPrincipal;
		}

			fundoMenu.setImagem("./imagens/arquiteturanovo.png");
			grafico.drawImage(fundoMenu.getImagem(), 0, 0, null); // Pinta
			// o
			
			grafico.setColor(Color.white); // define a cor do painel
			grafico.setFont(new Font("Homoarakhn", Font.BOLD, 20)); // a fonte a ser
			 
			//grafico.setFont(Font.createFont(1, new File ("C:\\Documents and Settings\\biacsf\\Desktop\\aranha.ttf")), Font.BOLD, 25); // a fonte a ser
			
																// utilizada
			// a partir daqui
	}
}
