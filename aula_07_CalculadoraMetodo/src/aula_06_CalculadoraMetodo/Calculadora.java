package aula_06_CalculadoraMetodo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        
		Calculos Calc = new Calculos();
		int opcao;

		double n1, n2;

		while (true) {
			System.out.println("1- soma");
			System.out.println("2- divisao");
			System.out.println("3- multiplicaçao");
			System.out.println("4- divisao\n");

		

			System.out.println("Digite o numero da operação:");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				leia.close();
				System.exit(0);
			}
			
			System.out.println("Digite o primeiro numero:");
			n1 = leia.nextDouble();

			System.out.println("Digite o segundo numero:");
			n2 = leia.nextDouble();

			switch(opcao){
			case 1 -> System.out.println("Soma: " + Calc.soma(n1, n2));
			case 2 -> System.out.println("subtraçao: " + Calc.subtracao(n1, n2));
			case 3 -> System.out.println("multiplicaçao: " + Calc.multiplicacao(n1, n2));
			case 4 -> {
				System.out.println("Divisao: " + Calc.divisao(n1, n2));
				System.out.println("dividi bem, hein?");
			}
			
			default -> System.out.println("opçao invalida!");
			}
		}

	}

}
