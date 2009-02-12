package br.ufrj.dcc.arq.parse;

import java.util.ArrayList;
import java.util.List;


public class LerEscreverArquivo{

	public ArquivoTexto arqParser;

	public List<String> qtdParser = new ArrayList<String>();

	public LerEscreverArquivo(){
		
	}
	
	public LerEscreverArquivo(String nome_do_arquivo){
		try {
			arqParser = new ArquivoTexto(nome_do_arquivo);

			while (arqParser.maisLinhas()) {
				
				/*Nao pega linha vazia*/
				if (!(arqParser.getLinha().equals(""))){
					qtdParser.add(arqParser.getLinha());
				}
			}
			
			System.out.println("Quantidade de Linhas Lidas do Arquivo: " + qtdParser.size());

		} catch (Exception e) {
			System.out.println("Erro no metodo LerArquivo!");
		}
	}
}
