package br.ufrj.dcc.arq.testes;

import br.ufrj.dcc.arq.parse.LerArquivo;
import br.ufrj.dcc.arq.parse.Parser;

public class TesteParser extends LerArquivo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*A variavel teste somente esta testando se o LerArquivo esta funcionando.
 * Ja a variavel parser testa o parser propriamente dito*/		
/*		LerArquivo teste = new LerArquivo();

		String[] codigoPrograma = qtdParser.toArray(new String[qtdParser.size()]);
		
		Parser parser = new Parser(codigoPrograma, qtdParser.size());
*/
		Parser parser = new Parser("./arquivo/programa.txt");
		/*
		 * String codigoPrograma[] = new String[6];
                
                codigoPrograma[0] = "TESTE: mov <10,R0>";
                codigoPrograma[1] = "mov <20,(R1)>";
                codigoPrograma[2] = "add <R0,R1>";
                codigoPrograma[3] = "neg <R1>";
                codigoPrograma[4] = "jmp <TESTE>";
                codigoPrograma[5] = "halt";
                
                Parser parser = new Parser(codigoPrograma, 6);
		 */
		
	}

}
