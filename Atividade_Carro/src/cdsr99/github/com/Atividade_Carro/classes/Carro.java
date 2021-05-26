package cdsr99.github.com.Atividade_Carro.classes;

public class Carro {
private String modelo;
private String cor;
private String ano;
private String marca;
private String chassi;

private Proprietario proprietario;

private Integer velocidadeMaxima = 200;
private Integer velocidadeAtual = 0;
private Integer numeroMarchas;
private Integer marchaAtual = 1;
private Integer volumeCombustivel;

private boolean temTetoSolar;
private boolean temCambioAutomatico;


public Carro(String modelo, String marca, Proprietario proprietario, boolean temTetoSolar,
		boolean temCambioAutomatico, Integer numeroMarchas) {
	super();
	this.modelo = modelo;
	this.marca = marca;
	this.proprietario = proprietario;
	this.temTetoSolar = temTetoSolar;
	this.temCambioAutomatico = temCambioAutomatico;
	this.numeroMarchas = numeroMarchas;
}


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


public String getAno() {
	return ano;
}


public void setAno(String ano) {
	this.ano = ano;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getChassi() {
	return chassi;
}


public void setChassi(String chassi) {
	this.chassi = chassi;
}


public Proprietario getProprietario() {
	return proprietario;
}


public void setProprietario(Proprietario proprietario) {
	this.proprietario = proprietario;
}


public Integer getVelocidadeMaxima() {
	return velocidadeMaxima;
}


public void setVelocidadeMaxima(Integer velocidadeMaxima) {
	this.velocidadeMaxima = velocidadeMaxima;
}


public Integer getVelocidadeAtual() {
	return velocidadeAtual;
}


public void setVelocidadeAtual(Integer velocidadeAtual) {
	this.velocidadeAtual = velocidadeAtual;
}


public Integer getNumeroMarchas() {
	return numeroMarchas;
}


public void setNumeroMarchas(Integer numeroMarchas) {
	this.numeroMarchas = numeroMarchas;
}


public Integer getMarchaAtual() {
	return marchaAtual;
}


public void setMarchaAtual(Integer marchaAtual) {
	this.marchaAtual = marchaAtual;
}


public Integer getVolumeCombustivel() {
	return volumeCombustivel;
}


public void setVolumeCombustivel(Integer volumeCombustivel) {
	this.volumeCombustivel = volumeCombustivel;
}


public boolean isTemTetoSolar() {
	return temTetoSolar;
}


public void setTemTetoSolar(boolean temTetoSolar) {
	this.temTetoSolar = temTetoSolar;
}


public boolean isTemCambioAutomatico() {
	return temCambioAutomatico;
}


public void setTemCambioAutomatico(boolean temCambioAutomatico) {
	this.temCambioAutomatico = temCambioAutomatico;
}


// *****************************************************************************************************

public void acelerar() {
	if(this.getVelocidadeAtual() < this.getVelocidadeMaxima()) {
		this.setVelocidadeAtual(this.getVelocidadeAtual() + 1);
		System.out.println("Acelerando: " + this.getVelocidadeAtual() + " de " + this.getVelocidadeMaxima() );
	}else {
		System.out.println("Velocidade Maxima atingida!!");
	}
}

public void reduzir() {
	if(this.getVelocidadeAtual() > 1 ) {
		this.setVelocidadeAtual(this.getVelocidadeAtual() - 1);
		System.out.println("reduzindo: " + this.getVelocidadeAtual() + " de " + this.getVelocidadeMaxima() );
	}else {
		System.out.println("O Carro esta parado!!");
	}
}

public void aumentaMarcha() {
	
	if(this.getMarchaAtual() > this.getNumeroMarchas()) {
		System.out.println("Numero de marchar atingido, reduza");
	}else {
		this.setMarchaAtual(this.getMarchaAtual() + 1);
		System.out.println("Marcha atual: " + this.getMarchaAtual());
	}
}


public void reduzMarcha() {
	
	if(this.getMarchaAtual() < this.getNumeroMarchas()) {
		System.out.println("Numero de marchar no minimo, suba as marchas");
	}else {
		this.setMarchaAtual(this.getMarchaAtual() + 1);
		System.out.println("Marcha atual: " + this.getMarchaAtual());
	}
}







}




