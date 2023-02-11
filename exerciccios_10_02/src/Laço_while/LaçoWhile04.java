package Laço_while;

import java.util.Scanner;

public class LaçoWhile04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, full = 0;

		String continua = "s";
		while (continua.equalsIgnoreCase("s")) {

			System.out.println("digite a idade");
			idade = leia.nextInt();

			System.out.println("digite o sexo");
			sexo = leia.nextInt();

			System.out.println("digite a categoria");
			categoria = leia.nextInt();
			if (categoria == 1)
				backend++;
			if (categoria == 2 && sexo == 2)
				frontend++;
			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile++;
			if (categoria == 4 && sexo == 2 && idade < 30)
				full++;

			System.out.println("deseja continuar(s/n)?");
			leia.skip("\\R?");
			continua = leia.nextLine();

			System.out.println("\ntotal de pessoas desenvolvedoras Backend:" + backend);
			System.out.println("\ntotal de mulheres desenvolvedoras frontend:" + frontend);
			System.out.println("\ntotal de homens desenvolvedores mobile maiores de 40 anos:" + mobile);
			System.out.println("\ntotal de mulheres desenvolvedoras fullStack menores de 30 anos:" + full);

			leia.close();
		}
	}

}
