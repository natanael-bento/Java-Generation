package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1- Cadastrar nota");
			System.out.println("2- listar notas");
			System.out.println("3- buscar uma nota ");
			System.out.println("4- remover um numero da lista");
			System.out.println("5- atualizar uma nota");
			System.out.println("6- sair");
			System.out.println("digite a opcao desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);

				break;

			case 2:
				System.out.println("listar as notas");

				if (notas.isEmpty())
					System.out.println("base de dados vazia!");
				else
					notas.forEach(System.out::println);

				break;

			case 3:
				System.out.println("procuraruma nota");
				System.out.println("digite uma nota:");
				nota = leia.nextDouble();
				System.out.println("a nota" + nota + "existe?" + notas.contains(nota));

				if (notas.contains(notas))
					System.out.println("o indice da minha nota é; " + notas.indexOf(nota));

				break;

			case 4:
				System.out.println("digite a nota a ser removida:");
				nota = leia.nextDouble();
				notas.remove(nota);

				break;

			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("digite a nota atual:");
				nota = leia.nextDouble();
				System.out.println("digite a nova nota:");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);

			default:
				if (opcao > 6)
					System.out.println("opcao invalida!");
			}

		} while (opcao != 6);

	}

}
