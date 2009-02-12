package br.ufrj.dcc.arq.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.ufrj.dcc.arq.vista.CriaPrograma;


public class LerEscreverArquivo extends CriaPrograma{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArquivoTexto arqParser;

	public List<String> qtdParser = new ArrayList<String>();
	
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
	
	public LerEscreverArquivo() throws IOException {
		ArquivoTexto novoArquivo = new ArquivoTexto();
		try{
			novoArquivo.gravarLinha(areaTexto.getText());
		}
		catch(Exception e){
			System.out.println("Erro ao gravar arquivo.");
		}
		novoArquivo.fecharArquivo();
		
	}
}
