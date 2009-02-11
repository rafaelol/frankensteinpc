package br.ufrj.dcc.arq.parse;

import java.util.ArrayList;
import java.util.List;


public class LerArquivo{

	public static ArquivoTexto arqParser;

	public static List<String> qtdParser = new ArrayList<String>();

	public LerArquivo(){
		
	}
	
	public LerArquivo(String nome_do_arquivo){
		try {
			arqParser = new ArquivoTexto(nome_do_arquivo);

			while (arqParser.maisLinhas()) {
				qtdParser.add(arqParser.getLinha());
			}
			
			System.out.println("Quatindade de Linhas do Arquivo: " + qtdParser.size());

		} catch (Exception e) {
			System.out.println("Erro no metodo LerArquivo!");
		}
	}
}