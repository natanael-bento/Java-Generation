package exercicios_08_02;

import java.util.Scanner;

public class ecercicio4 {

	public static void main(String[] args) {
	
	try (Scanner leia = new Scanner(System.in)) {
		int n1; 
		int n2;
		int n3;
		int n4; 
		
System.out.println("digite o primeiro numero: ");
 n1 = leia.nextInt();
System.out.println("digite o segundo numero:");
 n2 = leia.nextInt();
System.out.println("digite o terceiro numero:");
 n3 = leia.nextInt();
System.out.println("digite o quarto numero:");
 n4 = leia.nextInt();
 
 int cal = (n1 * n2) - (n3 * n4 );

System.out.println("o resultado do calculo é: " + cal);
	}
		}

}
