package atividade2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario f1 = new Funcionario ("Natanael Da Silva", "10.523.987", "Projetos", "Dev Junior FullStack", 5000.0f);
		
		Funcionario f2 = new Funcionario ("Hellen Souza", "10.523.989", "Opraçoes", "Dev JUnior FullStack", 5000.0f );
		
		f1.visualizar();
		
	    f2.visualizar();
		
		Gerente g1 = new Gerente ("Jonas Mallik", "01 .088.786", "Tecnologia", "Gerente", 15000.0f, "2");
		
		Gerente g2 = new Gerente ("Alicia Kiss", "11.636.087", "Vendas", "Gerente", 13500.0f, "2");
		
		g1.visualizar();
		
		g2.visualizar();
		
		Vendedor v1 = new Vendedor ("Fernando Pessoa", "10.023.45", "Vendas", "Vendedor", 4000.0f, "3", "0.8 %");
		
		Vendedor v2 = new Vendedor ("Maria Clara dos Anjos", "08.023.45", "Vendas", "Vendedora", 4000.0f, "5", "0.8 %");
		
		v1.visualizar();
		
		v2.visualizar();
		

	}

}
