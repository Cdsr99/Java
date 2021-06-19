package classes;

import java.util.ArrayList;

public class Contact_Schedule {
	private String nome;
	private String sobrenome;
	private String descricao;
	private String contato;
	private String endereco;
	
	
	public Contact_Schedule(String nome, String contato, String endereco) {
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getContato() {
		return this.contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	


	
	

}
