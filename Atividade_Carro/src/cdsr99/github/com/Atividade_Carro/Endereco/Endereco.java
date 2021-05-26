package cdsr99.github.com.Atividade_Carro.Endereco;

import cdsr99.github.com.Atividade_Carro.classes.*;

public class Endereco {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	private Proprietario proprietario;
	
	
	
	public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep,
			Proprietario proprietario) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.proprietario = proprietario;
	}
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
	//*********************************************************************************************
	
	public void rotaCasa() {
		
		System.out.println("Direcionando a rota para o endereço: " + this.getRua() + " no bairro: " + this.getBairro());
		System.out.println("....");
		System.out.println();
		System.out.println("...");
		System.out.println();
		System.out.println("..");
		System.out.println();
		System.out.println(".");
		System.out.println();
		System.out.println("CEP: " + this.getCep());
	}
	
	
	
}
