package classes;

public class Contact {
	private Integer fixo;
	private Integer celular;
	
	public Contact(Integer celular) {
		this.celular = celular;
	}

	public Integer getFixo() {
		return fixo;
	}

	public void setFixo(Integer fixo) {
		this.fixo = fixo;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	
}
