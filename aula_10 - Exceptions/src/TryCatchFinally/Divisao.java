package TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) throws MinhaExcecao {

		try (Scanner ler = new Scanner(System.in)) {
			int dividendo = 0;
			int divisor = 0;

			boolean loop = true;

			do {
				try {
					System.out.println("");
					System.out.println("Digite o Dividendo: ");
					dividendo = ler.nextInt();

					System.out.println("Digite o Divisor: ");
					divisor = ler.nextInt();

					divide(dividendo, divisor);

					loop = false;

				} catch (InputMismatchException e) {
					// System.err.println("Exceçao: " + e);
					ler.nextLine();
					System.out.println("Digite somente numeros!");

				} catch (ArithmeticException e) {
					ler.nextLine();
					System.out.println("Digite um numero diferente de Zero!");

				} finally {
					System.out.println("");
					System.out.println("Sempre serei executado :)");
					//System.exit(0);
				}

			} while (loop);
		}
	}

	public static void divide(int dividendo, int divisor) throws MinhaExcecao {
		System.out.println("Divisão = " + (dividendo / divisor));
		
		if ((dividendo / divisor) > 5)
			throw new MinhaExcecao(" a divisao é maior que 5!");
	}

}
