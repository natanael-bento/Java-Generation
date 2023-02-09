import java.util.Scanner;

public class Plano_de_Saude {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade :");
		idade = leia.nextInt();
		
		if (idade >= 0 && idade <= 10)
			System.out.println("Ovalor do plano sera de R$ 100,00 reais");
		else if (idade > 10 && idade <= 29)			
			System.out.println("o valor do plano sera R$ 200,00 reais");
		else if (idade > 29 && idade <= 45)
			System.out.println("o valor do plano sera R$ 300,00 reais");
		else if (idade > 45 && idade <= 59)
			System.out.println("o valor do plano sera R$ 500,00 reais");
		else if (idade > 59 && idade <= 65)
			System.out.println("o valor do plano sera R$ 600,00 reais");
		else if (idade > 65)
			System.out.println("o valor do plano sera R$ 1.000,00 reais");
			else
			System.out.println("idade invalida");

		leia.close();

	}

}
