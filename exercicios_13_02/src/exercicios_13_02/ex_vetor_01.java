package exercicios_13_02;

import java.util.Scanner;

public class ex_vetor_01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, casa = 0;
		boolean desejado = false;

		System.out.println("Digite o número que você deseja encontrar:");
		numero = leia.nextInt();

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] == numero) {
				casa = i;
				desejado = true;
			}
		}

		if (desejado == true) {

			System.out.println("o numero " + numero + " esta na posiçao : " + casa);
		} else {
			System.out.println("O numero " + numero + " nao foi encontrado! ");

		}

	}

}
