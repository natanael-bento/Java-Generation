package javapet;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 0;

		do {
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("*                                             *");
			System.out.println("*              INSTITUTO JAVA PET             *");
			System.out.println("*                                             *");
			System.out.println("***********************************************");
			System.out.println("*                                             *");
			System.out.println("*         1 - Cadastrar novo animal           *");
			System.out.println("*         2 - Listar todos os animais         *");
			System.out.println("*         3 - Buscar Animal por ID            *");
			System.out.println("*         4 - Atualizar dados do animal       *");
			System.out.println("*         5 - Apagar cadastro                 *");
			System.out.println("*         6 - Estoque                         *");
			System.out.println("*         0 - Sair                            *");
			System.out.println("*                                             *");
			System.out.println("***********************************************");
			System.out.println("           Entre com a opção desejada:         ");
			System.out.println("                                                ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Instituto Java Pet");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo animal");
				break;

			case 2:
				System.out.println("Listar todo os animais");
				break;

			case 3:
				System.out.println("Buscar animal por ID");
				break;
			case 4:
				System.out.println("Atualizar dados do animal");
				break;

			case 5:
				System.out.println("Apagar cadastro do animal");
				break;

			case 6:
				System.out.println("Estoque");
				break;

			default:
				System.out.println("opção invalidada!");
				break;
			}

		} while (opcao != 0);

	}

}
