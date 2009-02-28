package br.ufrj.dcc.arq.parse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Parser {
	public short Vet_Codigos[] = null;
	public static int qnt_codigo;

	private static Object dadosDoMap;
	Map<Integer, String> mapLabels =  new HashMap<Integer, String>();
	public static String Vet_Linhas[] = null;
	String label, label2, label3;
	int tam_max;
	int i;

	public Parser(String nomeArq) {
		qnt_codigo = 0;
		tam_max = Trata_Arquivo(nomeArq);
		PassaPraMaiuscula();
		ImprimeLabels();
		RemoveLabels();
		Tira_Comentario();
		ajustaMap();
		ImprimeLabels();
		Vet_Codigos = new short[2 * tam_max];
		Codifica();
		Imprime();
	}

	public Parser(String vetProg[], int tamanho) {
		tam_max = tamanho;
		Vet_Linhas = vetProg;
		PassaPraMaiuscula();
		ImprimeLabels();
		RemoveLabels();
		Tira_Comentario();
		ajustaMap();
		ImprimeLabels();
		Vet_Codigos = new short[2 * tam_max];
		Codifica();
		Imprime();
	}

	int Trata_Arquivo(String arquivo) {
		LerEscreverArquivo arquivoParser = new LerEscreverArquivo(arquivo);

		Vet_Linhas = new String[arquivoParser.qtdParser.size()];
		Vet_Linhas = arquivoParser.qtdParser.toArray(new String[arquivoParser.qtdParser.size()]);

		return arquivoParser.qtdParser.size();
	}

	/* Primeira parte. Remove as declaracoes de label e coloca num map, depois tira os comentarios */	
	void RemoveLabels() {
		for (i = 0; i < tam_max; i++) {
			label = new String();
			label = Trata_Linha_Para_Label(i);
			if (!(label.isEmpty())) {
				mapLabels.put(i, label);
			}
		}
	}

	void Tira_Comentario() {
		for (int j = 0; j < tam_max; j++) {
			for (int i = 0; i < Vet_Linhas[j].length(); i++) {
				if (Vet_Linhas[j].charAt(i) == ';') {
					Vet_Linhas[j] = Vet_Linhas[j].substring(0, i);
				}
			}
		}

	}

	/* Segunda parte. Pega cada declaracao ja sem label e comentario e a codifica */
	void Codifica() {
		for (i = 0; i < tam_max; i++) {
			label = label2 = label3 = new String();
			Separa_Linha(i);
			System.out.println("Label = " + label);
			System.out.println("Label2 = " + label2);
			System.out.println("Label3 = " + label3);
			System.out.println("");

			if (label.equals("HALT")) {
				Vet_Codigos[qnt_codigo] = 0;
			}
			/*
			 * ***************
			 * INSTRUCOES ADD
			 * ***************
			 */
			else if (label.equals("ADD")) {
				if (label2.equals("R0")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 11;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 12;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 13;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 14;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 15;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 36;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 37;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 38;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 39;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 40;
					}
				}
				else if (label2.equals("R1")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 16;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 17;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 18;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 19;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 20;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 41;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 42;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 43;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 44;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 45;
					}
				}
				else if (label2.equals("R2")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 21;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 22;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 23;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 24;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 25;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 46;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 47;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 48;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 49;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 50;
					}
				}
				else if (label2.equals("R3")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 26;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 27;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 28;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 29;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 30;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 51;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 52;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 53;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 54;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 55;
					}
				}
				else if (label2.equals("R4")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 31;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 32;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 33;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 34;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 35;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 56;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 57;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 58;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 59;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 60;
					}
				}
				else if (label2.equals("(R0)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 61;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 62;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 63;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 64;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 65;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 86;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 87;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 88;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 89;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 90;
					}
				}
				else if (label2.equals("(R1)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 66;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 67;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 68;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 69;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 70;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 91;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 92;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 93;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 94;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 95;
					}
				}
				else if (label2.equals("(R2)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 71;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 72;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 73;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 74;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 75;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 96;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 97;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 98;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 99;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 100;
					}
				}
				else if (label2.equals("(R3)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 76;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 77;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 78;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 79;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 80;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 101;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 102;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 103;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 104;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 105;
					}
				}
				else if (label2.equals("(R4)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 81;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 82;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 83;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 84;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 85;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 106;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 107;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 108;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 109;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 110;
					}
				}
				// Item 3 do meu e-mail de 08/01/2008
				else {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 1;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short)Integer.parseInt(label2);
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 2;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 3;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 4;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 5;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 6;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 7;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 8;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 9;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 10;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
				}
			}
			/*
			 * ***************
			 * INSTRUCOES SUB
			 * ***************
			 */
			else if (label.equals("SUB")) {
				if (label2.equals("R0")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 121;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 122;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 123;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 124;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 125;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 146;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 147;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 148;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 149;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 150;
					}
				}
				else if (label2.equals("R1")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 126;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 127;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 128;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 129;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 130;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 151;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 152;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 153;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 154;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 155;
					}
				}
				else if (label2.equals("R2")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 131;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 132;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 133;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 134;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 135;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 156;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 157;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 158;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 159;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 160;
					}
				}
				else if (label2.equals("R3")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 136;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 137;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 138;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 139;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 140;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 161;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 162;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 163;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 164;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 165;
					}
				}
				else if (label2.equals("R4")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 141;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 142;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 143;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 144;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 145;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 166;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 167;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 168;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 169;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 170;
					}
				}
				else if (label2.equals("(R0)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 171;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 172;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 173;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 174;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 175;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 196;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 197;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 198;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 199;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 200;
					}
				}
				else if (label2.equals("(R1)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 176;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 177;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 178;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 179;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 180;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 201;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 202;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 203;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 204;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 205;
					}
				}
				else if (label2.equals("(R2)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 181;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 182;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 183;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 184;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 185;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 206;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 207;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 208;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 209;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 210;
					}
				}
				else if (label2.equals("(R3)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 186;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 187;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 188;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 189;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 190;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 211;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 212;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 213;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 214;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 215;
					}
				}
				else if (label2.equals("(R4)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 191;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 192;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 193;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 194;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 195;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 216;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 217;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 218;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 219;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 220;
					}
				}
				// Item 3 do meu e-mail de 08/01/2008
				else {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 111;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 112;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 113;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 114;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 115;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 116;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 117;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 118;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 119;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 120;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
				}
			}
			/*
			 * ***************
			 * INSTRUCOES MOV
			 * ***************
			 */
			else if (label.equals("MOV")) {
				if (label2.equals("R0")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 231;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 232;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 233;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 234;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 235;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 256;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 257;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 258;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 259;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 260;
					}
				}
				else if (label2.equals("R1")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 236;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 237;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 238;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 239;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 240;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 261;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 262;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 263;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 264;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 265;
					}
				}
				else if (label2.equals("R2")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 241;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 242;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 243;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 244;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 245;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 266;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 267;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 268;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 269;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 270;
					}
				}
				else if (label2.equals("R3")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 246;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 247;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 248;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 249;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 250;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 271;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 272;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 273;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 274;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 275;
					}
				}
				else if (label2.equals("R4")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 251;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 252;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 253;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 254;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 255;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 276;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 277;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 278;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 279;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 280;
					}
				}
				else if (label2.equals("(R0)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 281;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 282;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 283;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 284;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 285;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 306;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 307;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 308;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 309;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 310;
					}
				}
				else if (label2.equals("(R1)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 286;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 287;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 288;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 289;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 290;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 311;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 312;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 313;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 314;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 315;
					}
				}
				else if (label2.equals("(R2)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 291;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 292;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 293;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 294;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 295;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 316;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 317;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 318;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 319;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 320;
					}
				}
				else if (label2.equals("(R3)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 296;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 297;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 298;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 299;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 300;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 321;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 322;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 323;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 324;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 325;
					}
				}
				else if (label2.equals("(R4)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 301;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 302;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 303;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 304;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 305;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 326;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 327;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 328;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 329;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 330;
					}
				}
				// Item 3 do meu e-mail de 08/01/2008
				else {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 221;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 222;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 223;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 224;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 225;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 226;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 227;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 228;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 229;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 230;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
				}
			}
			/*
			 * ***************
			 * INSTRUCOES CMP
			 * ***************
			 */
			else if (label.equals("CMP")) {
				if (label2.equals("R0")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 341;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 342;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 343;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 344;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 345;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 366;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 367;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 368;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 369;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 370;
					}
				}
				else if (label2.equals("R1")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 346;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 347;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 348;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 349;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 350;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 371;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 372;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 373;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 374;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 375;
					}
				}
				else if (label2.equals("R2")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 351;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 352;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 353;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 354;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 355;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 376;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 377;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 378;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 379;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 380;
					}
				}
				else if (label2.equals("R3")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 356;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 357;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 358;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 359;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 360;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 381;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 382;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 383;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 384;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 385;
					}
				}
				else if (label2.equals("R4")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 361;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 362;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 363;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 364;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 365;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 386;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 387;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 388;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 389;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 390;
					}
				}
				else if (label2.equals("(R0)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 391;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 392;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 393;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 394;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 395;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 416;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 417;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 418;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 419;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 420;
					}
				}
				else if (label2.equals("(R1)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 396;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 397;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 398;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 399;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 400;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 421;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 422;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 423;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 424;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 425;
					}
				}
				else if (label2.equals("(R2)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 401;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 402;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 403;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 404;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 405;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 426;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 427;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 428;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 429;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 430;
					}
				}
				else if (label2.equals("(R3)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 406;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 407;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 408;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 409;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 410;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 431;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 432;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 433;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 434;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 435;
					}
				}
				else if (label2.equals("(R4)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 411;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 412;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 413;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 414;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 415;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 436;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 437;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 438;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 439;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 440;
					}
				}
				// Item 3 do meu e-mail de 08/01/2008
				else {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 331;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 332;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 333;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 334;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 335;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 336;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 337;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 338;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 339;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 340;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
				}
			}
			/*
			 * ***************
			 * INSTRUCOES AND
			 * ***************
			 */
			else if (label.equals("AND")) {
				if (label2.equals("R0")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 451;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 452;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 453;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 454;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 455;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 476;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 477;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 478;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 479;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 480;
					}
				}
				else if (label2.equals("R1")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 456;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 457;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 458;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 459;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 460;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 481;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 482;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 483;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 484;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 485;
					}
				}
				else if (label2.equals("R2")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 461;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 462;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 463;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 464;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 465;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 486;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 487;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 488;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 489;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 490;
					}
				}
				else if (label2.equals("R3")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 466;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 467;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 468;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 469;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 470;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 491;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 492;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 493;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 494;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 495;
					}
				}
				else if (label2.equals("R4")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 471;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 472;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 473;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 474;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 475;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 496;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 497;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 498;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 499;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 500;
					}
				}
				else if (label2.equals("(R0)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 501;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 502;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 503;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 504;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 505;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 526;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 527;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 528;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 529;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 530;
					}
				}
				else if (label2.equals("(R1)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 506;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 507;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 508;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 509;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 510;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 531;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 532;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 533;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 534;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 535;
					}
				}
				else if (label2.equals("(R2)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 511;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 512;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 513;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 514;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 515;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 536;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 537;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 538;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 539;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 540;
					}
				}
				else if (label2.equals("(R3)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 516;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 517;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 518;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 519;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 520;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 541;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 542;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 543;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 544;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 545;
					}
				}
				else if (label2.equals("(R4)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 521;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 522;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 523;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 524;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 525;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 546;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 547;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 548;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 549;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 550;
					}
				}
				// Item 3 do meu e-mail de 08/01/2008
				else {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 441;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 442;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 443;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 444;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 445;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 446;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 447;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 448;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 449;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 450;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
				}
			}
			/*
			 * ***************
			 * INSTRUCOES OR
			 * ***************
			 */
			else if (label.equals("OR")) {
				if (label2.equals("R0")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 561;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 562;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 563;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 564;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 565;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 586;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 587;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 588;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 589;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 590;
					}
				}
				else if (label2.equals("R1")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 566;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 567;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 568;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 569;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 570;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 591;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 592;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 593;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 594;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 595;
					}
				}
				else if (label2.equals("R2")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 571;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 572;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 573;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 574;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 575;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 596;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 597;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 598;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 599;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 600;
					}
				}
				else if (label2.equals("R3")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 576;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 577;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 578;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 579;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 580;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 601;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 602;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 603;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 604;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 605;
					}
				}
				else if (label2.equals("R4")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 581;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 582;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 583;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 584;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 585;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 606;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 607;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 608;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 609;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 610;
					}
				}
				else if (label2.equals("(R0)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 611;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 612;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 613;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 614;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 615;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 636;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 637;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 638;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 639;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 640;
					}
				}
				else if (label2.equals("(R1)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 616;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 617;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 618;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 619;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 620;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 641;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 642;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 643;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 644;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 645;
					}
				}
				else if (label2.equals("(R2)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 621;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 622;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 623;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 624;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 625;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 646;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 647;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 648;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 649;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 650;
					}
				}
				else if (label2.equals("(R3)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 626;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 627;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 628;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 629;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 630;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 651;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 652;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 653;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 654;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 655;
					}
				}
				else if (label2.equals("(R4)")) {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 631;
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 632;
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 633;
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 634;
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 635;
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 656;
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 657;
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 658;
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 659;
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 660;
					}
				}
				// Item 3 do meu e-mail de 08/01/2008
				else {
					if (label3.equals("R0")) {
						Vet_Codigos[qnt_codigo] = 551;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R1")) {
						Vet_Codigos[qnt_codigo] = 552;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R2")) {
						Vet_Codigos[qnt_codigo] = 553;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R3")) {
						Vet_Codigos[qnt_codigo] = 554;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("R4")) {
						Vet_Codigos[qnt_codigo] = 555;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R0)")) {
						Vet_Codigos[qnt_codigo] = 556;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R1)")) {
						Vet_Codigos[qnt_codigo] = 557;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R2)")) {
						Vet_Codigos[qnt_codigo] = 558;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R3)")) {
						Vet_Codigos[qnt_codigo] = 559;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
					else if (label3.equals("(R4)")) {
						Vet_Codigos[qnt_codigo] = 560;
						qnt_codigo++;
						Vet_Codigos[qnt_codigo] = (short) Integer.parseInt(label2);
					}
				}
			}
			/*
			 * ***************
			 * INSTRUCOES NOT
			 * ***************
			 */
			else if (label.equals("NOT")) {
				if (label2.equals("R0")) {
					Vet_Codigos[qnt_codigo] = 661;
				}
				else if (label2.equals("R1")) {
					Vet_Codigos[qnt_codigo] = 662;
				}
				else if (label2.equals("R2")) {
					Vet_Codigos[qnt_codigo] = 663;
				}
				else if (label2.equals("R3")) {
					Vet_Codigos[qnt_codigo] = 664;
				}
				else if (label2.equals("R4")) {
					Vet_Codigos[qnt_codigo] = 665;
				}
				else if (label2.equals("(R0)")) {
					Vet_Codigos[qnt_codigo] = 666;
				}
				else if (label2.equals("(R1)")) {
					Vet_Codigos[qnt_codigo] = 667;
				}
				else if (label2.equals("(R2)")) {
					Vet_Codigos[qnt_codigo] = 668;
				}
				else if (label2.equals("(R3)")) {
					Vet_Codigos[qnt_codigo] = 669;
				}
				else if (label2.equals("(R4)")) {
					Vet_Codigos[qnt_codigo] = 670;
				}
			}
			/*
			 * ***************
			 * INSTRUCOES NEG
			 * ***************
			 */
			else if (label.equals("NEG")) {
				if (label2.equals("R0")) {
					Vet_Codigos[qnt_codigo] = 671;
				}
				else if (label2.equals("R1")) {
					Vet_Codigos[qnt_codigo] = 672;
				}
				else if (label2.equals("R2")) {
					Vet_Codigos[qnt_codigo] = 673;
				}
				else if (label2.equals("R3")) {
					Vet_Codigos[qnt_codigo] = 674;
				}
				else if (label2.equals("R4")) {
					Vet_Codigos[qnt_codigo] = 675;
				}
				else if (label2.equals("(R0)")) {
					Vet_Codigos[qnt_codigo] = 676;
				}
				else if (label2.equals("(R1)")) {
					Vet_Codigos[qnt_codigo] = 677;
				}
				else if (label2.equals("(R2)")) {
					Vet_Codigos[qnt_codigo] = 678;
				}
				else if (label2.equals("(R3)")) {
					Vet_Codigos[qnt_codigo] = 679;
				}
				else if (label2.equals("(R4)")) {
					Vet_Codigos[qnt_codigo] = 680;
				}
			}
			/*
			 * ***************
			 * INSTRUCOES CLR
			 * ***************
			 */
			else if (label.equals("CLR")) {
				if (label2.equals("R0")) {
					Vet_Codigos[qnt_codigo] = 681;
				}
				else if (label2.equals("R1")) {
					Vet_Codigos[qnt_codigo] = 682;
				}
				else if (label2.equals("R2")) {
					Vet_Codigos[qnt_codigo] = 683;
				}
				else if (label2.equals("R3")) {
					Vet_Codigos[qnt_codigo] = 684;
				}
				else if (label2.equals("R4")) {
					Vet_Codigos[qnt_codigo] = 685;
				}
				else if (label2.equals("(R0)")) {
					Vet_Codigos[qnt_codigo] = 686;
				}
				else if (label2.equals("(R1)")) {
					Vet_Codigos[qnt_codigo] = 687;
				}
				else if (label2.equals("(R2)")) {
					Vet_Codigos[qnt_codigo] = 688;
				}
				else if (label2.equals("(R3)")) {
					Vet_Codigos[qnt_codigo] = 689;
				}
				else if (label2.equals("(R4)")) {
					Vet_Codigos[qnt_codigo] = 690;
				}
			}
			/*
			 * ***************
			 * INSTRUCOES SHL
			 * ***************
			 */
			else if (label.equals("SHL")) {
				if (label2.equals("R0")) {
					Vet_Codigos[qnt_codigo] = 691;
				}
				else if (label2.equals("R1")) {
					Vet_Codigos[qnt_codigo] = 692;
				}
				else if (label2.equals("R2")) {
					Vet_Codigos[qnt_codigo] = 693;
				}
				else if (label2.equals("R3")) {
					Vet_Codigos[qnt_codigo] = 694;
				}
				else if (label2.equals("R4")) {
					Vet_Codigos[qnt_codigo] = 695;
				}
				else if (label2.equals("(R0)")) {
					Vet_Codigos[qnt_codigo] = 696;
				}
				else if (label2.equals("(R1)")) {
					Vet_Codigos[qnt_codigo] = 697;
				}
				else if (label2.equals("(R2)")) {
					Vet_Codigos[qnt_codigo] = 698;
				}
				else if (label2.equals("(R3)")) {
					Vet_Codigos[qnt_codigo] = 699;
				}
				else if (label2.equals("(R4)")) {
					Vet_Codigos[qnt_codigo] = 700;
				}
			}
			/*
			 * ***************
			 * INSTRUCOES SHR
			 * ***************
			 */
			else if (label.equals("SHR")) {
				if (label2.equals("R0")) {
					Vet_Codigos[qnt_codigo] = 701;
				}
				else if (label2.equals("R1")) {
					Vet_Codigos[qnt_codigo] = 702;
				}
				else if (label2.equals("R2")) {
					Vet_Codigos[qnt_codigo] = 703;
				}
				else if (label2.equals("R3")) {
					Vet_Codigos[qnt_codigo] = 704;
				}
				else if (label2.equals("R4")) {
					Vet_Codigos[qnt_codigo] = 705;
				}
				else if (label2.equals("(R0)")) {
					Vet_Codigos[qnt_codigo] = 706;
				}
				else if (label2.equals("(R1)")) {
					Vet_Codigos[qnt_codigo] = 707;
				}
				else if (label2.equals("(R2)")) {
					Vet_Codigos[qnt_codigo] = 708;
				}
				else if (label2.equals("(R3)")) {
					Vet_Codigos[qnt_codigo] = 709;
				}
				else if (label2.equals("(R4)")) {
					Vet_Codigos[qnt_codigo] = 710;
				}
			}
			/*
			 * ***************
			 * INSTRUCOES BRZ
			 * ***************
			 */
			else if (label.equals("BRZ")) {
				int valor = Verifica_Na_Label(label2, i);
				Vet_Codigos[qnt_codigo] = 711;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;			
			}
			/*
			 * ***************
			 * INSTRUCOES BRN
			 * ***************
			 */
			else if (label.equals("BRN")) {
				int valor = Verifica_Na_Label(label2, i);
				Vet_Codigos[qnt_codigo] = 712;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;	
			}
			/*
			 * ***************
			 * INSTRUCOES BRE
			 * ***************
			 */
			else if (label.equals("BRE")) {
				int valor = Verifica_Na_Label(label2, i);
				Vet_Codigos[qnt_codigo] = 713;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;	
			}
			/*
			 * ***************
			 * INSTRUCOES BRL
			 * ***************
			 */
			else if (label.equals("BRL")) {
				int valor = Verifica_Na_Label(label2, i);
				Vet_Codigos[qnt_codigo] = 714;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;	
			}
			/*
			 * ***************
			 * INSTRUCOES BRG
			 * ***************
			 */
			else if (label.equals("BRG")) {
				int valor = Verifica_Na_Label(label2, i);
				Vet_Codigos[qnt_codigo] = 715;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;	
			}
			/*
			 * ***************
			 * INSTRUCOES BRC
			 * ***************
			 */
			else if (label.equals("BRC")) {
				int valor = Verifica_Na_Label(label2, i);
				Vet_Codigos[qnt_codigo] = 716;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;	
			}
			/*
			 * ***************
			 * INSTRUCOES JMP
			 * ***************
			 */
			else if (label.equals("JMP")) {
				int valor = Verifica_Na_Label(label2, (qnt_codigo + 1));
				Vet_Codigos[qnt_codigo] = 717;
				qnt_codigo++;
				Vet_Codigos[qnt_codigo] = (short) valor;	
			}
			qnt_codigo++;
		}
	}

	/* 
	 * ******************
	 * Metodos auxiliares
	 * ******************
	 */

	int Verifica_Na_Label(String label, int linha) {
		Iterator itMap = mapLabels.keySet().iterator();
		int qnt_linhas;

		while (itMap.hasNext()) {
			dadosDoMap = itMap.next();

			if (label.equals(mapLabels.get(dadosDoMap) )) {
				qnt_linhas = (short) Integer.parseInt(dadosDoMap.toString()) - linha;
				return qnt_linhas;				
			} 
		}
		return -1;
	}

	String Trata_Linha_Para_Label(int linha) {
		int j;
		String label = new String();

		for (int i = 0; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) == ':') {
				label = Vet_Linhas[linha].substring(0, i);
				for (j = i + 1; j < Vet_Linhas[linha].length(); j++) {
					if (Vet_Linhas[linha].charAt(j) != ' ') break;
				}
				Vet_Linhas[linha] = Vet_Linhas[linha].substring(j, Vet_Linhas[linha].length());
			}
		}

		return label;
	}



	void Separa_Linha(int linha) {
		int i, j;

		//Pegando primeira parte da instrucao
		for (i = 0; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) == '<') break;
		}

		label = Vet_Linhas[linha].substring(0, i);
		j = i;

/*
		for (i = j; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) == '<') break;
		}

		j = i;
*/
		
		label = label.trim();
		
		//Pegando segunda parte da instrucao
		/*
		for (i = j; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) != ' ') break;
		}

		j = i;
*/
		
		for (i = j; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) == ',' || Vet_Linhas[linha].charAt(i) == '>') break;
		}
		if (j != i) {
			label2 = Vet_Linhas[linha].substring(j + 1, i);	
			label2 = label2.trim();
		}
		j = i;

/*
		for (i = j; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) != ' ') break;
		}

		j = i;
*/
		
		//Pegando terceira parte da instrucao
		for (i = j; i < Vet_Linhas[linha].length(); i++) {
			if (Vet_Linhas[linha].charAt(i) == '>') break;
		}

		if (j != i) {
			label3 = Vet_Linhas[linha].substring(j + 1, i);
			label3 = label3.trim();
		}

		j = i;	
	}

	public void Imprime() {
		for (int i = 0; i < 2 * tam_max; i++) {
			System.out.print(Vet_Codigos[i] + " ");
		}
		System.out.println(" ");
	}

	void PassaPraMaiuscula() {
		for (int i = 0; i < Vet_Linhas.length; i++) {
			Vet_Linhas[i] = Vet_Linhas[i].toUpperCase();
		}
	}

	public void ImprimeLabels() {
		System.out.println();
		for (int i = 0; i < Vet_Linhas.length; i++) {
			System.out.println(Vet_Linhas[i]);
		}
		System.out.println();
	}

	public short[] getVetorParser(){
		return Vet_Codigos;
	}


	void ajustaMap() {
		int linhasduplas[] = new int[tam_max];
		int qnt = 0;
		int adicionar;
		Iterator itMap = mapLabels.entrySet().iterator();
		Map<Integer, String> mapTemp =  new HashMap<Integer, String>();
		int valor;
		Map.Entry mapa;
		
		
		for (int i = 0; i < tam_max; i++) {
			Separa_Linha(i);
			
			if (!((label2.equals("R0")) || 
				(label2.equals("R1")) ||
				(label2.equals("R2")) ||
				(label2.equals("R3")) ||
				(label2.equals("R4")) ||
				(label2.equals("(R0)")) || 
				(label2.equals("(R1)")) ||
				(label2.equals("(R2)")) ||
				(label2.equals("(R3)")) ||
				(label2.equals("(R4)")))) {
				
				linhasduplas[qnt] = i;
				qnt++;
			}
		}
				
		while (itMap.hasNext()) {
			mapa = (Map.Entry<Integer, String>) itMap.next();
			
			valor = Integer.parseInt(mapa.getKey().toString());
			
			adicionar = 0;
			
			for (int i = 0; i < qnt; i++) {
				if (linhasduplas[i] < valor) {
					adicionar++;
				}
			}
			
			mapTemp.put(valor + adicionar, mapa.getValue().toString());
		}
		
		mapLabels = mapTemp;
		
	}
}