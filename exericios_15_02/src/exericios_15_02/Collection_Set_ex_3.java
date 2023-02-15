package exericios_15_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collection_Set_ex_3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> valores = new HashSet<Integer>();

		int valor;

		System.out.println("digite 10 valores inteiros não repetidos:");

		for (int contador = 0; contador <= 9; contador++) {
			valor = leia.nextInt();
			valores.add(valor);
		}
		Iterator<Integer> dados = valores.iterator();

		System.out.println("Listar dados do Set:");

		while (dados.hasNext()) {
			System.out.println(dados.next());
		}

		/* valores.forEach(System.out::println); */ //mostrar sem collection.
		
		leia.close();

	}

}
