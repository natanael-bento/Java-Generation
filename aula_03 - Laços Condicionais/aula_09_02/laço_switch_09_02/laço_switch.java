package laço_switch_09_02;
import java.util.Scanner;

public class laço_switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2;
		int op;
		System.out.println("digite o primeiro numero:");
		n1 = leia.nextFloat();
		System.out.println("digite o segundo numero:");
		n2 = leia.nextFloat();

		System.out.println("faixa 1:\tSoma");
		System.out.println("faixa 2:\tSubtraçao");
		System.out.println("faixa 3:\tDivisao");
		System.out.println("faixa 4:\tMultiplicaçao");

		System.out.println("digite o numero da operção:");
		op = leia.nextInt();

		switch (op) {
		case 1:
			System.out.println("o resultado é : " + n1 + n2);
			break;
		case 2:
			System.out.println("o resultado é : " + (n1 - n2));
			break;
		case 3:
			System.out.println("o resultado é : " + n1 / n2);
			break;
		case 4:
			System.out.println("o resultado é : " + n1 * n2);
			break;

		default:
			System.out.println(" Operação invalida");

			leia.close();

		}

	}

}
