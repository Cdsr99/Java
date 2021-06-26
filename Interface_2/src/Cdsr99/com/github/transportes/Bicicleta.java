package Cdsr99.com.github.transportes;

public class Bicicleta {
	
	private String modelo;
	private String cor;
	private String preco;
	private String ano;
	
	//Constructor -------------------------------------------
	
	public Bicicleta(String modelo) {
		this.modelo = modelo;
	}

	//Getters and Setters ----------------------------------
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
	

}
