package exercicios_13_02;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
		//EXERCICIO NAO TERMINADO!
		Scanner leia = new Scanner(System.in);
		
		int matriz[] [] =  new int[4] [10];
		int dp = 0, ds = 0;
	
		for (int indice =0; indice < matriz.length; indice ++){
			System.out.println("diagonal principal: "+ matriz [indice] [indice]);
			  dp += matriz[indice][indice];
	}
     
		for (int indice =0; indice < matriz.length; indice ++){
			System.out.println("diagonal principal: "+ matriz [indice] [matriz.length - 1- indice]);
			  ds += matriz[indice][matriz.length - 1 - indice];
		}
	 
	 System.out.println("a soma do elementos da diagonal é: " + ds);
	
	
		//EXERCICIO NAO TERMINADO!	
		
	}

}
