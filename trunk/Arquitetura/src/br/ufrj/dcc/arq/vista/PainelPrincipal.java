package br.ufrj.dcc.arq.vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;


public class PainelPrincipal extends Component{
	private static final long serialVersionUID = 1L;

	private Figura fundoMenu = new Figura();

	public static Graphics grafico;

	String temp = new String();
	
	/*Flags*/
	static String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x = new String();
	
	public void paint(Graphics graficoPrincipal) {
		
		if (graficoPrincipal != null) {
			grafico = graficoPrincipal;
		}
		
		fundoMenu.setImagem("./imagens/arquiteturanovo.png");
		grafico.drawImage(fundoMenu.getImagem(), 0, 0, null);
		
		grafico.setColor(Color.black); // define a cor do painel
		grafico.setFont(new Font("Arial", Font.BOLD, 15)); // a fonte a ser usada
		
		/*Registradores do Mux A*/
		
		grafico.drawString(l, 216, 70);
		grafico.drawString(c, 325, 48);
		grafico.drawString(d, 410, 48);
		grafico.drawString(h, 490, 48);
		
		/*Registradores do Mux B*/
		grafico.drawString(e, 607, 48);
		grafico.drawString(f, 690, 48);
		grafico.drawString(g, 774, 48);
		grafico.drawString(i, 855, 48);
		
		/*PC e RDados*/
		
		grafico.drawString(a, 943, 133);
		grafico.drawString(b, 197, 166);
		
		/*Mux A*/
		
		grafico.drawString(m, 476, 250);
		grafico.drawString(n, 476, 276);
		
		/*Mux B*/
		
		grafico.drawString(o, 812, 250);
		grafico.drawString(p, 812, 276);
		grafico.drawString(q, 812, 302);
		
		/*ULA*/
		
		grafico.drawString(r, 376, 390);
		grafico.drawString(s, 376, 418);
		grafico.drawString(t, 376, 445);
		grafico.drawString(u, 376, 472);
		grafico.drawString(v, 376, 498);
		grafico.drawString(w, 376, 524);
		
		/*IR*/
		
		grafico.drawString(k, 888, 700);
		
		/*REnd e Memoria*/
		
		grafico.drawString(j, 252, 670);
		grafico.drawString(x, 47, 662);
	}
}
