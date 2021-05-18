package cdsr99.github.com.carro.classes;

public class Carro {

	
	 private String modelo;
	 private String cor;
	 private String ano;
	 private String marca;
	 private String chassi;
	 private proprietario Proprietario;
	 
	 private Integer velociadeMax = 140;
	 private Integer velociadeAtual;
	 private Integer nPortas;
	 private Integer nMarchas;
	 private Integer VolumeCombustivel;
	 private Integer marchaAtual;
	 
	 private boolean temTetoSolar;
	 private boolean temCambioAutomatico;
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
	public proprietario getProprietario() {
		return Proprietario;
	}
	public void setProprietario(proprietario proprietario) {
		Proprietario = proprietario;
	}
	public Integer getVelociadeMax() {
		return velociadeMax;
	}
	public void setVelociadeMax(Integer velociadeMax) {
		this.velociadeMax = velociadeMax;
	}
	public Integer getVelociadeAtual() {
		return velociadeAtual;
	}
	public void setVelociadeAtual(Integer velociadeAtual) {
		if(getVelociadeAtual() < getVelociadeMax()) {
		this.velociadeAtual = velociadeAtual;
		}else {
			System.out.println("Erro! we couldn't speed up! Speed Max Limit");
		}
	}
	public Integer getnPortas() {
		return nPortas;
	}
	public void setnPortas(Integer nPortas) {
		this.nPortas = nPortas;
	}
	public Integer getnMarchas() {
		return nMarchas;
	}
	public void setnMarchas(Integer nMarchas) {
		this.nMarchas = nMarchas;
	}
	public Integer getVolumeCombustivel() {
		return VolumeCombustivel;
	}
	public void setVolumeCombustivel(Integer volumeCombustivel) {
		VolumeCombustivel = volumeCombustivel;
	}
	public boolean TemTetoSolar() {
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
	public Integer getMarchaAtual() {
		return marchaAtual;
	}
	 
	public void acelerar() {
		setVelociadeAtual(getVelociadeAtual() + 1 );
	}
	 public void SetMarchaAtual(Integer marchaAtual) {
		 if(marchaAtual <= getNumeroMarchas() && marchaAtual > 0 ) {
			 System.out.println();
		 }
	}
	 public Integer getNumeroMarchas() {
		 return nMarchas;
	 }
	 
	 public void freiar() {
		 setVelociadeAtual(0);
		 System.out.println("Car status: Stopped");
	 }
	 public void aumentaMarcha() {
		 SetMarchaAtual(getMarchaAtual() + 1);
		 System.out.println("Current marcha: " + getMarchaAtual());
	 }
	 public void reduzMarcha() {
		 SetMarchaAtual(getMarchaAtual() - 1);
		 System.out.println("Current marcha: " + getMarchaAtual());
	 }
	 
	 
	 
	 
	 }

