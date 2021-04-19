package cdsr99.com.github.projetorh.controles;

public class Funcionario {

	
	private String nome;
	private String matricula;
	private String cargo;
	private String salario;
	
	
	
	public Funcionario(String nome, String matricula, String cargo, String salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
}
