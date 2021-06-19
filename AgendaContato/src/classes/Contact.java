package classes;


public class Contact {
	private String fixo;
	private String celular;
	
	public Contact(String celular) {
		this.celular = celular;
		
	}

	public String getFixo() {
		return fixo;
	}

	public void setFixo(String fixo) {
		this.fixo = fixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
