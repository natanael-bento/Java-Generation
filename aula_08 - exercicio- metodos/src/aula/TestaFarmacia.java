package aula;

import java.util.ArrayList;
import java.util.Scanner;
 
public class TestaFarmacia {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;
		
		do {
			
		System.out.println("\nId: " );
		id = leia.nextLong();
		
		System.out.println("\nNome: " );
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nNome Comercial: " );
		nomeComercial = leia.nextLine();
		
		System.out.println("\nFabricante: " );
		fabricante = leia.nextLine();
		
		System.out.println("\nFoto: " );
		foto = leia.nextLine();
		
		System.out.println("\nPreço: " );
		preco = leia.nextFloat();
		
		Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
		
		medicamentos.add(f1);
		
		System.out.println("\nDeseja continuar? " );
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		leia.close();
	}

}
