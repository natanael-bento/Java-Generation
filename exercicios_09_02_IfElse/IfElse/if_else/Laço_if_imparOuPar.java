package if_else;
import java.util.Scanner;

public class Laço_if_imparOuPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nu;
		System.out.println("Digite um numero:");
		nu = leia.nextInt();
		
		   if ( nu % 2 == 0 && nu > 0 ) {
			System.out.println("O numero " + nu + " é par e positvo"); 
		   }
		else if   (nu %2 == 0 && nu < 0 )	{		
			System.out.println("o numero " + nu + " é par e negativo");
		} 
	else if (!((nu % 2) == 0) && nu > 0 ) {
		System.out.println("O numero " + nu + " é impar e positivo");
	}
			
	    else  {
			System.out.println("O numero " + nu + " é impar e negativo ");
	    }
	
	
		leia.close();

	}
}
