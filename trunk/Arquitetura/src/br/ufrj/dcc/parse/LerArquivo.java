package br.ufrj.dcc.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;


public class LerArquivo{

	static ArquivoTexto arqParser;

	static List<String> qtdParser = new ArrayList<String>();


	public LerArquivo(){
		try {
			arqParser = new ArquivoTexto("./arquivo/programa.txt");

			while (arqParser.maisLinhas()) {
				qtdParser.add(arqParser.getLinha());
			}
			
			System.out.println("Quatindade de Linhas do Arquivo: " + qtdParser.size());

		} catch (Exception e) {
			System.out.println("Erro no metodo LerArquivo!");
		}
	}
}
