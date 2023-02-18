package Laço_while;

import java.util.Scanner;

public class LaçoCondicionalWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite uma idade: ");
	int idade = leia.nextInt();

		int m21 = 0;
		int m50 = 0;

		while (idade >= 0) {
			
			if (idade < 21) {
				m21++;
				
			} else if (idade > 50) {
				m50++;
			}
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}

		System.out.println("total de pessoas menores de 21 anos: " + m21);

		System.out.println("total de pessoas maiores de 50 anos: " + m50);

		leia.close();
	}

}
