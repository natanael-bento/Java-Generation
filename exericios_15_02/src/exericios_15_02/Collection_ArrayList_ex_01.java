package exericios_15_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection_ArrayList_ex_01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		String cor;
		
		System.out.println("Digite cinco(5) cores, uma(1) por vez: ");
		
		
		for (int contador = 0; contador <= 4; contador++) {
			cor = leia.nextLine();
			cores.add(cor);
			
		}

		System.out.println("\nListar todas as cores: ");
		cores.forEach(System.out::println);
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores:");
		cores.forEach(System.out::println);
		
		leia.close();
	}

}
