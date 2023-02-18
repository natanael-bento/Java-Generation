package exercicios_08_02;

import java.util.Scanner;

public class ecercicio4 {

	public static void main(String[] args) {
	
	try (Scanner leia = new Scanner(System.in)) {
	     float n1, n2, n3, n4; 
		 
		
System.out.println("digite o primeiro numero: ");
 n1 = leia.nextFloat();
System.out.println("digite o segundo numero:");
 n2 = leia.nextFloat();
System.out.println("digite o terceiro numero:");
 n3 = leia.nextFloat();
System.out.println("digite o quarto numero:");
 n4 = leia.nextFloat();
 
 float cal = (n1 * n2) - (n3 * n4 );

System.out.println("o resultado do calculo é: " + cal);
	}
		}

}
