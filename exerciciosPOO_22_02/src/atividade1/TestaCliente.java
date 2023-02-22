package atividade1;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Vania Spring", "056.045,789-75", "vaniaspring@hotmail.com",
				"Rua Doutor Java, n°21 - café", "(11)940028922");

		Cliente c2 = new Cliente("Jonas Scrum", "456.488.654-44", "JJscrum22@gmail.com",
				"Rua Met. Agil, n°34 - Bom time", "(11)945685486");
		
		c1.visualizar();
		System.out.println("\n");
		
		c2.visualizar();

	}

}
