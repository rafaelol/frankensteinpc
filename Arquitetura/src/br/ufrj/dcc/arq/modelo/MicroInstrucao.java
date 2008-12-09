package br.ufrj.dcc.arq.modelo;

public class MicroInstrucao {
	
	public static final int TAM_END = 6;
	public static final int TAM_CTRL = 24;
	
	private int id;
	private Bit controle[] = new Bit[TAM_CTRL];
	private Bit endereco[] = new Bit[TAM_END];
	private String descricao;
	
	public MicroInstrucao() {
		for(int i = 0; i<TAM_END; i++) {
			endereco[i] = new Bit((short)0);
		}
		
		for(int i = 0; i<TAM_CTRL; i++) {
			controle[i] = new Bit((short)0);
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Bit[] getControle() {
		return this.controle;
	}

	public void setControle(Bit[] controle) {
		this.controle = controle;
	}
	
	public Bit[] getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Bit[] endereco) {
		this.endereco = endereco;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
}
