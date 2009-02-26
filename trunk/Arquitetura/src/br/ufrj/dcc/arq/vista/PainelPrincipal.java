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
		
		grafico.drawString(l, 172, 56);
		grafico.drawString(c, 260, 40);
		grafico.drawString(d, 327, 40);
		grafico.drawString(h, 390, 40);
		
		/*Registradores do Mux B*/
		grafico.drawString(e, 486, 40);
		grafico.drawString(f, 550, 40);
		grafico.drawString(g, 618, 40);
		grafico.drawString(i, 683, 40);
		
		/*PC e RDados*/
		
		grafico.drawString(a, 753, 108);
		grafico.drawString(b, 157, 134);
		
		/*Mux A*/
		
		grafico.drawString(m, 379, 200);
		grafico.drawString(n, 379, 222);
		
		/*Mux B*/
		
		grafico.drawString(o, 648, 202);
		grafico.drawString(p, 648, 222);
		grafico.drawString(q, 648, 244);
		
		/*ULA*/
		
		grafico.drawString(r, 300, 315);
		grafico.drawString(s, 300, 336);
		grafico.drawString(t, 300, 357);
		grafico.drawString(u, 300, 378);
		grafico.drawString(v, 300, 399);
		grafico.drawString(w, 300, 420);
		
		/*IR*/
		
		grafico.drawString(k, 710, 563);
		
		/*REnd e Memoria*/
		
		grafico.drawString(j, 201, 538);
		grafico.drawString(x, 37, 530);
	}
}
