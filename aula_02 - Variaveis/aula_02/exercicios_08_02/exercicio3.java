package exercicios_08_02;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			
			float sb, an, hex, des;  
		
			System.out.println("digite o valor do salario bruto:");
			   sb = leia.nextFloat();
			System.out.println("digite o valor do adcional noturno:");
			   an = leia.nextFloat();
		    System.out.println("digite o valor das horas extras:");
			   hex = leia.nextFloat();
			System.out.println("digite o valor dos descontos:");
			   des = leia.nextFloat();
			   float liquido = sb + an + (hex * 5) - des;
			   System.out.println("seu salario liquido terá o valor de: " + liquido);
			
		}

	}

}
