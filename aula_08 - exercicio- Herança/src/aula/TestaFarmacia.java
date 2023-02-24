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
		int tipo;
		String principioAtivo = "", fragancia = "";
		
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
		
		System.out.println("\nTipo: " );
		tipo = leia.nextInt();
		
		switch(tipo) {
		case 1 -> {
			System.out.println("\nPrincipio Ativo: " );
			leia.skip("\\R?");
			principioAtivo = leia.nextLine();
			
			Medicamento m1 = new Medicamento (id, nome, nomeComercial, fabricante, foto, preco, tipo, principioAtivo);
		
		    medicamentos.add(m1);
		     
		}
		
		case 2 ->{
			 System.out.println("\nFragancia: ");
			 leia.skip("\\R?");
			 fragancia = leia.nextLine();
			 
			 Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragancia);
		    
			 medicamentos.add(p1);
		}
		
	}
		 
		Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo, principioAtivo);
		
		Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragancia);
		
		System.out.println("\nDeseja continuar? " );
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		
		for(var produto : medicamentos) {
		   produto.reajuste(0.10f);
		   produto.visualizar();
		
	}
		leia.close();
	}

}
