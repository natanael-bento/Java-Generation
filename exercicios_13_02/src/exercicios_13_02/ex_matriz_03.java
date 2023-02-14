
		
package exercicios_13_02;

import java.util.Scanner;

public class ex_matriz_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float[][] matriz = new float[2][2];

		// Nao terminado
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// ler colunas
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				//System.out.println(matrizesInteiros[indiceI][indiceJ]);

			}

		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("digite um valor real: ");
				  matriz[indiceI][indiceJ] = leia.nextFloat();
			}
		}

		for (float[] vetor : matriz) {
			for (var elemento : vetor) {
				System.out.println(elemento);
			}
		}

		leia.close();
  //NAO TERMINADO

	}

}
