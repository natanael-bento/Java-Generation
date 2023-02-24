package aula_23_02;

public class TestaAtleta {

	public static void main(String[] args) {

		Triatleta at1 = new Triatleta("Antony");
		Triatleta at2 = new Triatleta("Nytoan");
		
		at1.aquecer();
		at1.correr();
		
		at2.aquecer();
		at2.pedalar();
		at2.nadar();
	}

}
