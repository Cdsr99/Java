package Cdsr99.com.github.pessoas;

import java.util.ArrayList;
import Cdsr99.com.github.transportes.*;


public class Pessoa {
	private String nome;
	private int idade;
	private String profissao;
	private String cpf;
	protected ArrayList<Contato> contato;
	private ArrayList<Carro> carro;
	private ArrayList<Moto> moto;
	private ArrayList<Bicicleta> bicicleta;
	
	
	// Constructor ------------------------------------------------------	
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	//Getters and Setters -----------------------------------------------
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ArrayList<Contato> getContato() {
		return contato;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contato = contato;
	}

	public ArrayList<Carro> getCarro() {
		return carro;
	}

	public void setCarro(ArrayList<Carro> carro) {
		this.carro = carro;
	}

	public ArrayList<Moto> getMoto() {
		return moto;
	}

	public void setMoto(ArrayList<Moto> moto) {
		this.moto = moto;
	}

	public ArrayList<Bicicleta> getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(ArrayList<Bicicleta> bicicleta) {
		this.bicicleta = bicicleta;
	}




	
	
	
	

}
