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

	private int velocidadeMax;
	private int velocidadeAtual;
	private int numeroPortas;
	private String teto; 
	private String automatico;
	private int tanque;
	
	
	
	
	
	
	
	public Carro(String proprietario) {
		
		this.proprietario = proprietario;
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
	
	

}
