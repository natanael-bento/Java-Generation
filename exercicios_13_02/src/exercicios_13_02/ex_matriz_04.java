package exercicios_13_02;

import java.util.Scanner;

public class ex_matriz_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float matriz [][] = new  float [3] [4];
		float media [] = new float [3];
		float soma = 0.0f;
		
	for (int linha = 0; linha < matriz.length; linha ++) {
		
		for (int coluna = 0; coluna < matriz[linha].length; coluna ++) {
		
			System.out.println("digite a nota: ");
			matriz[linha][coluna] = leia.nextFloat();
		}	
	}
	
	for(int linha = 0; linha < matriz.length; linha ++){
		
	   for (int coluna = 0; coluna < matriz.length; coluna ++) {
		
	     soma += matriz[linha][coluna];	
		
		
		}
		media[linha] = soma / matriz[linha].length;
		soma = 0.0f;
	}
	for(var medias : media)
		System.out.println(medias);
	}	
}
