package br.ufrj.dcc.parse;

public class Parser {
	String Vet_Linhas[];
	int Vet_Codigos[];
	String label, label2, label3;
	int i;
	int tam_max;
	int qnt_codigo = 0;
		
	// Magicamente, o texto de um arquivo é passado para o Vet_Linhas... por enquanto ;D 
	// Ao fazer essa passagem, recebemos um "tam_max" que é a quantidade de instruções
	
	
	/* Primeira parte. Remove as declarações de label e coloca num map */
	for (i = 0; i < tam_max; i++) {
		label = new String();
		label = Trata_Linha_Para_Label(Vet_Linhas[i]);
		if (label != null) {
			//Insere Label na Map, junto com o valor de i
		}
	}
	
	for (i = 0; i < tam_max; i++) {
		label = label2 = label3 = new String();
		Separa_Linha(Vet_Linhas[i], label, label2, label3);
		
		if (label == "halt") {
			Vet_Codigos[qnt_codigo] = 0;
			qnt_codigo++;
		}
		else if (label == "add") {
			
		}
		else if (label == "sub") {
			
		}
		else if (label == "mov") {
			
		}
		else if (label == "cmp") {
			
		}
		else if (label == "and") {
			
		}
		else if (label == "or") {
			
		}
		else if (label == "not") {
			
		}
		else if (label == "neg") {
			
		}
		else if (label == "clr") {
			
		}
		else if (label == "shl") {
			
		}
		else if (label == "shr") {
			
		}
		else if (label == "brz") {
			
		}
		else if (label == "brn") {
			
		}
		else if (label == "bre") {
			
		}
		else if (label == "brl") {
			
		}
		else if (label == "brg") {
			
		}
		else if (label == "brc") {
			
		}
		else if (label == "jmp") {
			
		}
	}
	
}

String Trata_Linha_Para_Label(String linha) {
	int i, j;
	String label = new String();
	
	for (i = 0; i < linha.length(); i++) {
		if (linha.charAt(i) == ':') {
				System.out.println("achei!");
				label = linha.substring(0, i);
				for (j = i + 1; j < linha.length(); j++) {
					if (linha.charAt(j) != ' ') break;
				}
				linha = linha.substring(j, linha.length());
		}
	}
	
	return label;
}

void Separa_Linha(String linha, String label1, String label2, String label3) {
	int i, j;
	
	//Pegando primeira label
	for (i = 0; i < linha.length(); i++) {
		if (linha.charAt(i) == ' ') break;
	}

	label1 = linha.substring(0, i);
	j = i;

	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) != ' ') break;
	}
	
	j = i;
	
	//Pegando segunda label
	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) == ' ') break;
	}

	label2 = linha.substring(j, i);
	j = i;
	
	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) != ' ') break;
	}
	
	j = i;
	
	//Pegando terceira label
	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) == ' ') break;
	}

	label3 = linha.substring(j, i);
	j = i;
}


/*
Procura na string um ':'
Se tiver
               copia o texto anterior para primeira_parte - ok
               copia o valor de i - ok
               insere na map o primeira_parte e a linha
               remove tudo ate o primeiro caractere nao espaco depois do ':' - ok


Algoritmo para codificar:

Pega a primeira parte da String
if (prim_parte == "add")
{
               Pega a segunda parte da String
               if (seg_parte == "R1")
               {
                       Faz a mesma coisa da segunda parte para a terceira... sendo que faz
o return nessa parte
               }
               else if (seg_parte == "R2")
               {
                       Faz a mesma coisa da segunda parte para a terceira... sendo que
faz o return nessa parte
               }
               (e por ai vai)
               else -> nao achou registrado, é um numero ou um rótulo
               {
                       procura seg_parte na map
                       se achou
                       {
                               valor2 = i - numero_na_map (ou numero_na_map - i)
                               -> Isso é o jump relativo ;)
                               Faz a mesma coisa da segunda parte para a terceira... sendo que
faz o return nessa parte
                       }
                       senao
                       {
                               valor2 = converte a string para int
                               Faz a mesma coisa da segunda parte para a terceira... sendo que
faz o return nessa parte
                       }
               }
}
(e por ai vai com as outras instrucoes)
*/