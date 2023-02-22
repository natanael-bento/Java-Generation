package javapet.model;

public class dadosAnimal {

	private boolean aptoDoacao;
	private String nome;
	private String porte;
	private String raca;
	private String sexo;
	private int idade;
	private int ID;
	private double peso;

	public dadosAnimal(String nome, int iD, String raca, int idade, double peso, String sexo, boolean aptoDoacao,
			String porte) {
		super();
		this.nome = nome;
		this.ID = iD;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
		this.aptoDoacao = aptoDoacao;
		this.porte = porte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isAptoDoacao() {
		return aptoDoacao;
	}

	public void setAptoDoacao(boolean aptoDoacao) {
		this.aptoDoacao = aptoDoacao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

}
