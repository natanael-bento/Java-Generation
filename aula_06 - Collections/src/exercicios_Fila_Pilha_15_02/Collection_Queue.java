package exercicios_Fila_Pilha_15_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Collection_Queue {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> nomes = new LinkedList<String>();

		int opcao;
		String nome;

		do {
			
			System.out.println("\n1 - Adcionar cliente na fila");
			System.out.println("2 - listaer todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair\n");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Adcionar cliente na fila");
				System.out.println("Digite o nome do Cliente:");
				leia.skip("\\R?");
				nome = leia.nextLine();

				nomes.add(nome);
				System.out.println("Cliente Adcionado!");

				break;

			case 2:
				if (!nomes.isEmpty()) {
					System.out.println("Clientes na fila: ");
					for (var cliente : nomes)
						System.out.println(cliente + " ");
				} else
					System.out.println("\n A Fila esta vazia!");

				break;

			case 3:
				System.out.println("Próximo da Fila: ");
				System.out.println("\n");
				if (!nomes.isEmpty())
					System.out.println(nomes.poll());
				else
					System.out.println("Todos os Cliente foram chamados");

				break;
			case 0:
				opcao = 0;
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);

		leia.close();

	}

}
