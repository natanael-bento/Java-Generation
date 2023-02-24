package atividade1;

public class PessoaJuridica extends Cliente {
	
	 private String cnpj;

	 

	public PessoaJuridica(String nome, String cpf, String email, String endereco, String nTelefone, String cnpj) {
		super(nome, cpf, email, endereco, nTelefone);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public void visualizar() {
		super.visualizar();
        System.out.println("N° do CNPJ: " + this.cnpj);
        
	}
}
