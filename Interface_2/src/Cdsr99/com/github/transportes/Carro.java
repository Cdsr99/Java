package Cdsr99.com.github.transportes;

import Cdsr99.com.github.Interfaces.Iacoes;

public class Carro implements Iacoes{

	private String modelo;
	private String fabricante;
	private String cor;
	private String preco;
	private String ano;
	
	//Constructor ------------------------------------------------------
	
	public Carro(String modelo) {
		this.modelo = modelo;
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

	@Override
	public Float acelerar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float freiar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float parar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float ligar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float desligar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float pedalar() {
		// TODO Auto-generated method stub
		return 0;
	}
}
