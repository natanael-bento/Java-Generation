package atividade2;

public class Gerente extends Funcionario{

	private String GerProjetos;

	public Gerente(String nome, String id, String setor, String cargo, float salario, String gerProjetos) {
		super(nome, id, setor, cargo, salario);
		GerProjetos = gerProjetos;
	}

	public String getGerProjetos() {
		return GerProjetos;
	}

	public void setGerProjetos(String gerProjetos) {
		GerProjetos = gerProjetos;
	}
	
	public void visualizar() {
		super.visualizar();
        System.out.println("N° de projetos gerenciados atualmente: " + this.GerProjetos);
       
	}
}
