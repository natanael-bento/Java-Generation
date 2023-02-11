package Laço_Do_while;

import java.util.Scanner;

public class LaçoCondicionalWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n, ns = 0;

		do {
			System.out.print("Digite um número: ");
			n = leia.nextInt();

			if (n > 0) {
				ns += n;
			}
		} while (n != 0);

		System.out.println("A soma dos números positivos é: " + ns);

leia.close();
	}

}
