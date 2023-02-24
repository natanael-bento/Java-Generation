package atividade1;

public class PessoaFisica extends Cliente {

	private String rg;

	public PessoaFisica(String nome, String cpf, String email, String endereco, String nTelefone, String rg) {
		super(nome, cpf, email, endereco, nTelefone);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public void visualizar() {
		super.visualizar();
        System.out.println("N° do RG: " + this.rg);
		
	
	} 
}
