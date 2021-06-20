package cdsr99.com.github.Classes;

import java.util.ArrayList;
import cdsr99.com.github.Classes.*;

public class Contact_Schedule extends Company{
	private String nome;
	private String sobrenome;
	private String descricao;
	protected ArrayList<Contact> contato;
	protected ArrayList<Address_data> endereco;
	

	
	public Contact_Schedule(String nome, ArrayList<Contact> contato, ArrayList<Address_data> endereco) {
		
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
	public ArrayList<Contact> getContato() {
		return contato;
	}
	public void setContato(ArrayList<Contact> contato) {
		this.contato = contato;
	}
	public ArrayList<Address_data> getEndereco() {
		return endereco;
	}
	public void setEndereco(ArrayList<Address_data> endereco) {
		this.endereco = endereco;
	}
}
