package exericios_15_02;

import java.util.Scanner;
import java.util.Stack;

public class Collection_Stack {

	public static void main(String[] args) {
	
		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int lista;
		String livroN;
	
		
		do {
			System.out.println(" ");
			System.out.println("1 -  Adicionar novo livro.");
			System.out.println("2 - Listar todos os livros.");
			System.out.println("3 - Retirar livro.");
			System.out.println("0 -  Sair");
			
			System.out.println("\nDigite a opção desejada: ");
			lista = leia.nextInt();

			switch(lista) {
			case 1:
				System.out.println("__ Adcionar livro a pilha__");
				System.out.println(" ");
				System.out.println("Digite o nome do livro ");
				leia.skip("\\R?");
				livroN = leia.nextLine();
				
				livros.push(livroN);
				System.out.println("Livro adicionado!");
				
				break;
				
			case 2:
				
				if(!livros.empty()) {
					System.out.println("Lista de livros na pilha: ");
					for(var volume:livros)
						System.out.println(volume);
				}
				else
					System.out.println("Não há Livros na pilha.");
				
				break;
				
			case 3:
				if(!livros.empty()) {
					System.out.println("Um Livro foi retirado da pilha!");
					//System.out.println(livros.pop());
					livros.pop();
				}
				else
					System.out.println("A pilha de livros esta vazia!");
				
				break;
			case 0:
			    lista = 0;
				System.out.println("Programa finalizado.");
				break;
				
			default:
				
				System.out.println("Opção inválida.");
				break;
			}
			
			
		}while(lista != 0);
		
		
		leia.close();	
		

	}

}
