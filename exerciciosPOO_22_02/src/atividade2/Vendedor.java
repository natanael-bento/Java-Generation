package atividade2;

public class Vendedor extends Funcionario{

	private String VendasRealizadas;

	private String Bonus;

	public Vendedor(String nome, String id, String setor, String cargo, float salario, String vendasRealizadas,
			String bonus) {
		super(nome, id, setor, cargo, salario);
		VendasRealizadas = vendasRealizadas;
		Bonus = bonus;
	}

	public String getVendasRealizadas() {
		return VendasRealizadas;
	}

	public void setVendasRealizadas(String vendasRealizadas) {
		VendasRealizadas = vendasRealizadas;
	}

	public String getBonus() {
		return Bonus;
	}

	public void setBonus(String bonus) {
		Bonus = bonus;
	}

	public void visualizar() {
		super.visualizar();
        System.out.println("N° de de vendas realizadas: " + this.VendasRealizadas);
        System.out.println("Bonus salarial desse mes: " + this.Bonus + " de bonus por venda");
	
	
	
	}
	
}
