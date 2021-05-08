package carro;

public class Carro {
	
	private String modelo;
	private String fabricante;
	private String status;
	private String cor;
	private String proprietario;
	private int marcha;
	private int ano;
	private int chassi;
	private int velocidadeMax = 120;
	private int velocidadeAtual;
	private int numeroPortas;
	private String teto; 
	private String automatico;
	private int tanque;
	private int cpf;
		
	
	public Carro(String proprietario, int cpf) {
		
		this.proprietario = proprietario;
		this.cpf = cpf;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setVelocidade(int vel) {
		this.velocidadeAtual = vel;
	}

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		if(velocidadeAtual <= this.velocidadeMax) {
			this.velocidadeAtual = velocidadeAtual;	
		}else {
			System.out.println("Max Speed Limit! It cannot speed up!");
		}
		
	}

	
	
	

}
