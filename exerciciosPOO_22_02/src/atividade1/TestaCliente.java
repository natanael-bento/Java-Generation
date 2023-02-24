package atividade1;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Vania Spring dos Santos", "056.045,789-75", "vaniaspring@hotmail.com",
				"Rua Doutor Java, n°21 - café", "(11)940028922");

		Cliente c2 = new Cliente("Jonas Scrum", "456.488.654-44", "JJscrum22@gmail.com",
				"Rua Met. Agil, n°34 - Bom time", "(11)945685486");

		c1.visualizar();
		c2.visualizar();

		PessoaFisica pf1 = new PessoaFisica("Marinalva Pyhton", "698.456.654-89", "MariPhy@email.com",
				"Rua Map, n°456 - Jardim jiboia", "(11)998878243", "62.789.404-4");

		PessoaFisica pf2 = new PessoaFisica("Igor C. Ollections", "474.782.421-45", "Igor_C011@gmail.com",
				"Rua pilhafila, n°4 - getset", "(11)9998898997", "89.899.754-2");

		pf1.visualizar();
		pf2.visualizar();

		PessoaJuridica pj1 = new PessoaJuridica("Javinson Arrays dos Santos", "258.838.232-32", "javinrray@email.com",
				"Rua Stackinson, n°02 - café", "(11)921326161", "18975622/0058-67");

		PessoaJuridica pj2 = new PessoaJuridica("Hellen T. Miles Lima ", "786.660.086-77", "H-T-M-L@gmailmail.com",
				"Rua Dusalgoritmo, n°475 - Cobolandia", "(21)974239991", "08674550/0001-09");

		pj1.visualizar();
		pj2.visualizar();
	}

}
