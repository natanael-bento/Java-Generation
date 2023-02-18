package Exercicios_If_09_02;
import java.util.Scanner;

public class Laço_If_abc {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
	System.out.println("digite o numero A: ");
	     a = leia.nextInt();
	System.out.println("digite o numero B: ");
	     b = leia.nextInt();
	System.out.println("digite o numero C: ");
		 c = leia.nextInt();
	
		int r;
	    r = a + b;
		
		if (r > c)
			
			System.out.println( a + " + " + b +  " = "+ r +  " > " + c + "\n a soma de A + B é maior que c");
			
		else if ( r < c)	
			
			System.out.println( a + " + " + b + " = " + r + " < " + c+ "\n a soma de A + B é menor que C");
			

		else if (r == c)
			System.out.println(  a + " + " + b + " = " + r + " = " + c + "\na soma de A + B é igual a C");

	}

}
