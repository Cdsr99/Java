package carro;

public class proprietario {
	
	private String nome;
	private int CPF;

	
	
	public proprietario(String nome, int cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}

	

}
