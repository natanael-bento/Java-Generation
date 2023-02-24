package atividade1;

public class Cliente {
	
	protected String Nome;
	protected String cpf;
	protected String email;
	protected String endereco;
	protected String nTelefone;
	
	public Cliente(String nome, String cpf, String email, String endereco, String nTelefone) {
		Nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.nTelefone = nTelefone;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getnTelefone() {
		return nTelefone;
	}

	public void setnTelefone(String nTelefone) {
		this.nTelefone = nTelefone;
	}
	
	 public void visualizar() {
		 System.out.println("\n");
         System.out.println("Nome do cliente: " + this.Nome);
         System.out.println("CPF: " + this.cpf);
         System.out.println("Email: " + this.email);
         System.out.println("Endereço: " + this.endereco);
         System.out.println("Numero de telfone: " + this.nTelefone);
	
	 }

}
