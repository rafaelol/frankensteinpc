package br.ufrj.dcc.parse;

public class TesteParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigoPrograma[] = new String[6];
		
		codigoPrograma[0] = "TESTE: mov <10,R0>";
		codigoPrograma[1] = "mov <20,(R1)>";
		codigoPrograma[2] = "add <R0,R1>";
		codigoPrograma[3] = "neg <R1>";
		codigoPrograma[4] = "jmp <TESTE>";
		codigoPrograma[5] = "halt";
		
		Parser parser = new Parser(codigoPrograma, 5);
		
	}

}
