package Laço_for;

import java.util.Scanner;

public class LaçoCondicionalFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	
	       	  System.out.println("digite o primeiro numero:");
	         	int pn1 = leia.nextInt();
	         	
		      System.out.println("digite o ultimo numero:");
	           int un2 = leia.nextInt();

    	    if (pn1 > un2) {
    		   System.out.println("Intervalo inválido!");
        }
            else {
                System.out.println("No Intervalo entre " + pn1 + " e " + un2 + ": ");
        }

     for(int i = pn1 ;i <= un2; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
    	}
    leia.close();	
        }
	}  	
}
