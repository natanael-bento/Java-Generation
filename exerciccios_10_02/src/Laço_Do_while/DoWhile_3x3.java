package Laço_Do_while;

import java.util.Scanner;

public class DoWhile_3x3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n, ns = 0, i = 0;

		do {
			System.out.print("Digite um número: ");
			n = leia.nextInt();

			if (n % 3 == 0 && n != 0) {
				ns += n;
				i++;
			}
		} while (n != 0);
		
		int tot = ns / i;

		System.out.println("A média de todos os números múltiplos de 3 é: " + tot);

		leia.close();
	}

}
