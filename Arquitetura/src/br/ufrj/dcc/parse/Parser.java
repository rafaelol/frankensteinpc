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
		}
		else if (label == "add") {
			if (label2 == "R0") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 11;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 12;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 13;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 14;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 15;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 36;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 37;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 38;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 39;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 40;
				}
			}
			else if (label2 == "R1") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 16;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 17;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 18;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 19;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 20;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 41;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 42;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 43;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 44;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 45;
				}
			}
			else if (label2 == "R2") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 21;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 22;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 23;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 24;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 25;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 46;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 47;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 48;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 49;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 50;
				}
			}
			else if (label2 == "R3") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 26;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 27;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 28;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 29;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 30;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 51;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 52;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 53;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 54;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 55;
				}
			}
			else if (label2 == "R4") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 31;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 32;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 33;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 34;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 35;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 56;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 57;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 58;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 59;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 60;
				}
			}
			else if (label2 == "(R0)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 61;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 62;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 63;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 64;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 65;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 86;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 87;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 88;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 89;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 90;
				}
			}
			else if (label2 == "(R1)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 66;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 67;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 68;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 69;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 70;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 91;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 92;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 93;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 94;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 95;
				}
			}
			else if (label2 == "(R2)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 71;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 72;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 73;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 74;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 75;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 96;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 97;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 98;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 99;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 100;
				}
			}
			else if (label2 == "(R3)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 76;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 47;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 78;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 79;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 80;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 101;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 102;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 103;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 104;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 105;
				}
			}
			else if (label2 == "(R4)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 81;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 82;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 83;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 84;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 85;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 106;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 107;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 108;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 109;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 110;
				}
			}
			else {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 1;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 2;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 3;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 4;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 5;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 6;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 7;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 8;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 9;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 10;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
			}
		}
		else if (label == "sub") {
			if (label2 == "R0") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 121;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 122;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 123;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 124;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 125;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 146;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 147;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 148;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 149;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 150;
				}
			}
			else if (label2 == "R1") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 126;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 127;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 128;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 129;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 130;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 151;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 152;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 153;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 154;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 155;
				}
			}
			else if (label2 == "R2") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 131;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 132;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 133;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 134;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 135;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 156;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 157;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 158;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 159;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 160;
				}
			}
			else if (label2 == "R3") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 136;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 137;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 138;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 139;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 140;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 161;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 162;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 163;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 164;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 165;
				}
			}
			else if (label2 == "R4") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 141;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 142;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 143;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 144;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 145;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 166;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 167;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 168;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 169;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 170;
				}
			}
			else if (label2 == "(R0)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 171;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 172;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 173;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 174;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 175;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 196;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 197;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 198;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 199;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 200;
				}
			}
			else if (label2 == "(R1)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 176;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 177;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 178;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 179;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 180;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 201;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 202;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 203;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 204;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 205;
				}
			}
			else if (label2 == "(R2)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 181;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 182;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 183;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 184;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 185;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 206;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 207;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 208;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 209;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 210;
				}
			}
			else if (label2 == "(R3)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 186;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 187;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 188;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 189;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 190;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 211;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 212;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 213;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 214;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 215;
				}
			}
			else if (label2 == "(R4)") {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 191;
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 192;
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 193;
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 194;
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 195;
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 216;
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 217;
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 218;
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 219;
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 220;
				}
			}
			else {
				if (label3 == "R0") {
					Vet_Codigos[qnt_codigo] = 111;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R1") {
					Vet_Codigos[qnt_codigo] = 112;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R2") {
					Vet_Codigos[qnt_codigo] = 113;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R3") {
					Vet_Codigos[qnt_codigo] = 114;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "R4") {
					Vet_Codigos[qnt_codigo] = 115;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R0)") {
					Vet_Codigos[qnt_codigo] = 116;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R1)") {
					Vet_Codigos[qnt_codigo] = 117;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R2)") {
					Vet_Codigos[qnt_codigo] = 118;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R3)") {
					Vet_Codigos[qnt_codigo] = 119;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
				else if (label3 == "(R4)") {
					Vet_Codigos[qnt_codigo] = 120;
					qnt_codigo++;
					Vet_Codigos[qnt_codigo] = // passar label2 pra int. Como faz isso mesmo? =P
				}
			}

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
		qnt_codigo++;
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
		if (linha.charAt(i) == '<') break;
	}
	
	j = i;
	
	//Pegando segunda label
	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) == ',') break;
	}

	label2 = linha.substring(j, i);
	j = i;
	
	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) != ' ') break;
	}
	
	j = i;
	
	//Pegando terceira label
	for (i = j; i < linha.length(); i++) {
		if (linha.charAt(i) == '>') break;
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