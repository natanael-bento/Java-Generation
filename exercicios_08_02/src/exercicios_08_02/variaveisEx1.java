package exercicios_08_02;

import java.util.Scanner;

public class variaveisEx1 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			float sa , abo;
			
				System.out.println("digite o salario:");
    sa = leia.nextFloat();
    
     System.out.println("digite o abono:");
     abo = leia.nextFloat();
     
     float nosal = sa + abo;
     
     System.out.println("Novo salario: " + nosal);
		}
      
	}

}
