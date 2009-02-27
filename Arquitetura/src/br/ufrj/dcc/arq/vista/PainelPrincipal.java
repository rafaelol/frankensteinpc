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
	
	/*
	 * Sinais
	 */
	public static String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x = new String();
	
	/*
	 * Flags
	 */
	public static String zero,sinal,carry,overflow,paridade = new String();
	
	/*
	 * Registradores
	 */
	
	public static String r0,r1,r2,r3,r4,pc,rDados,rEnd,ri,rx,ry;
	
	public void paint(Graphics graficoPrincipal) {
		
		if (graficoPrincipal != null) {
			grafico = graficoPrincipal;
		}
		
		fundoMenu.setImagem("./imagens/arquiteturanovo.png");
		grafico.drawImage(fundoMenu.getImagem(), 0, 0, null);
		
		grafico.setColor(Color.black); // define a cor do painel
		grafico.setFont(new Font("Arial", Font.BOLD, 12)); // a fonte a ser usada
		
		/*Registradores do Mux A*/
		
		grafico.drawString(l, 172, 56);
		grafico.drawString(c, 260, 40);
		grafico.drawString(d, 327, 40);
		grafico.drawString(h, 390, 40);
		
		grafico.drawString(r0,215,85);
		grafico.drawString(r1,280,85);
		grafico.drawString(rx,345,85);
		
		/*Registradores do Mux B*/
		grafico.drawString(e, 486, 40);
		grafico.drawString(f, 550, 40);
		grafico.drawString(g, 618, 40);
		grafico.drawString(i, 683, 40);
		
		grafico.drawString(r2,445,85);
		grafico.drawString(r3,510,85);
		grafico.drawString(r4,575,85);
		grafico.drawString(ry,640,85);
		
		/*PC e RDados*/
		
		grafico.drawString(a, 753, 108);
		grafico.drawString(b, 157, 134);
		
		grafico.drawString(rDados,75,135);
		grafico.drawString(pc,710,155);
		
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
		
		grafico.drawString(ri,630,565);
		
		/*REnd e Memoria*/
		
		grafico.drawString(j, 201, 538);
		grafico.drawString(x, 37, 530);
		
		grafico.drawString(rEnd,120,535);
		
		/*Flags*/
		
		grafico.setColor(Color.red);
		
		grafico.drawString(zero,483,429);
		grafico.drawString(sinal,483,445);
		grafico.drawString(carry,483,461);
		grafico.drawString(overflow,483,477);
		grafico.drawString(paridade,483,493);
		
		grafico.setColor(Color.black);

	}
}
