package atividade2;

public class Funcionario {
	
	private String nome;
	private String id;
	private String setor;
	private String cargo;
	private float salario;
	
	public Funcionario(String nome, String id, String setor, String cargo, float salario) {
		this.nome = nome;
		this.id = id;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
 public void visualizar() {
		 
         System.out.println("Nome do Funcionario: " + this.nome);
         System.out.println("n° crachá: " + this.id);
         System.out.println("Setor: " + this.setor);
         System.out.println("Cargo: " + this.cargo);
         System.out.println("Salario: " + this.salario);
	
 }

}
