import java.util.Scanner;

public class PlanoDeSaude_Case {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int faixa;
		System.out.println("faixas etarias:");

		System.out.println("faixa 1:\t ate 10 anos");
		System.out.println("faixa 2:\t de 11 a 29 anos");
		System.out.println("faixa 2:\t de 30 a 45 anos");
		System.out.println("faixa 3:\t de 46 a 59 anos");
		System.out.println("faixa 4:\t de 60 a 65 anos");
		System.out.println("faixa 5:\t acima de 65 anos");

		System.out.println("digite o numero da  faixa etaria:");
		faixa = leia.nextInt();
		switch (faixa) {
		case 1:
			System.out.println("o valor do plano sera R$ 100,00 reais");
			break;
		case 2:
			System.out.println("o valor do plano sera R$ 200,00 reais");
			break;
		case 3:
			System.out.println("o valor do plano sera R$ 300,00 reais");
			break;
		case 4:
			System.out.println("o valor do plano sera R$ 500,00 reais");
			break;
		case 5:
			System.out.println("o valor do plano sera R$ 600,00 reais");
			break;
		case 6:
			System.out.println("o valor do plano sera R$ 1.000,00 reais");
			break;
		default:
			System.out.println("faixa etaria invalida");
			leia.close();
		}

	}

}
