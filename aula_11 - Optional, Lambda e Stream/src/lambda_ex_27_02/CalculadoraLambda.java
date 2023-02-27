package lambda_ex_27_02;

import java.util.Scanner;

import lambda_ex_27_02.OperacaoMatematica;

public class CalculadoraLambda {
	
	public static int calcular(OperacaoMatematica om, int num1, int num2) {
		return  om.executar(num1, num2);
	}
	
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int num1, num2;
	int opcao;
	
	System.out.println("Digite o primeiro numero que deseja calcular:");
	num1 = leia.nextInt();
	
	System.out.println("digite o segundo numero que deseja calcular:");
	num2 = leia.nextInt();
	
	System.out.println("digite 1 para somar(+):");
	System.out.println("digite 2 para subtrair(-):");
	System.out.println("digite 3 para multiplicar(x)");
	System.out.println("digite 4 para dividir(%):");
	opcao=leia.nextInt();
	
	switch(opcao) {
	         case 1:
	         System.out.println("Resultado da Soma = " + calcular((a,b) -> a + b, num1, num2));
	         break;
	         
	         case 2:
	         System.out.println("Resultado da Subtração = " + calcular((a,b) -> a - b, num1, num2));
	         break; 
	         
	         case 3:
	         System.out.println("Resultado da Multiplicação = " + calcular((a,b) -> a * b, num1, num2));
             break;
             
	         case 4:
             System.out.println("Resultado da Divisão = " + calcular((a,b) -> a / b, num1, num2));
             break;
             
             default:
             System.out.println("operação ivalida!");
	}
}
	
	
	
}
