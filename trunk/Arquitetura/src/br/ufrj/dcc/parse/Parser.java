package br.ufrj.dcc.parse;

public class Parser {
	
}

String Trata_Linha_Para_Label(String linha) {
	int i, j;
	String label = new String();
	
	for (i = 0; i < linha.length(); i++) {
		if (linha.charAt(i) == ':') {
				System.out.println("achei!");
				label = linha.substring(0, i - 1);
				for (j = i + 1; j < linha.length(); j++) {
					if (linha.charAt(j) != ' ') break;
				}
				linha = linha.substring(j, linha.length());
		}
	}
	
	return label;
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