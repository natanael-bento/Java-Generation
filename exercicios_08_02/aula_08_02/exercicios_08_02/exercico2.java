package exercicios_08_02;

import java.util.Scanner;

public class exercico2 {

	public static void main(String[] args) {
		
	try (Scanner leia = new Scanner(System.in)) {
	
		float n1, n2, n3, n4;  
	
		System.out.println("digite a primeira nota:");
		   n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota:");
		   n2 = leia.nextFloat();
	    System.out.println("digite a terceira nota:");
		   n3 = leia.nextFloat();
		System.out.println("digite a quarta nota:");
		   n4 = leia.nextFloat();
		   float media = (n1 + n2 + n3 + n4)/ 4;
		   System.out.println("sua media é: " + media);
		
	}
	
	}

}
