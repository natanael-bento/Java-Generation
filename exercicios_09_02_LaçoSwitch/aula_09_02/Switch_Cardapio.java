import java.util.Scanner;

public class Switch_Cardapio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pro, qu;
		
		System.out.println("SELECIONE UM PRODUTO:");

		System.out.println("produto 1:\tCachorro Quente = R$ 10,00");
		System.out.println("produto 2:\tX-salada = R$ 15,00");
		System.out.println("produto 3:\tX-bacon = R$ 18,00");
		System.out.println("produto 4:\tBauru = R$ 12,00");
		System.out.println("produto 5:\trefrigerante = R$ 8,00");
		System.out.println("produto 6:\tsuco de laranja = R$ 13,00");

		System.out.println("digite o codigo do produto:");
		pro = leia.nextInt();
		System.out.println("Digite a quantidadeque deseja:");
		qu = leia.nextInt();
		int vr;
		switch (pro) {
		case 1:
		 vr = 10 * qu;
		 
			System.out.println("PRODUTO: cahorro quente\nValor Total: R$" + vr);
		
			break;
		case 2:
			vr = 15 * qu;
			System.out.println("PRODUTO: X-salada\nValor Total: R$" + vr);
			break;
		case 3:
			vr = 18 * qu;
			System.out.println("PRODUTO: X-Bancon\nValor Total: R$" + vr);
			break;
		case 4:
			vr = 12 * qu;
			System.out.println("PRODUTO: Bauru\nValor Total: R$" + vr);
			break;
		case 5:
			vr = 8 * qu;
			System.out.println("PRODUTO: Refrigerante\nValor Total: R$ " + vr);
			break;
		case 6:
			vr = 13 * qu;
			System.out.println("PRODUTO: Suco de Laranja\nValor Total: R$ " + vr);
			break;
		default:
			System.out.println("Porduto invalido");
			leia.close();
		}

	}

}
