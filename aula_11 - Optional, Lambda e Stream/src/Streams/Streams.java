package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numerosDesordenados = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

		List<String> estados = Arrays.asList("Pernambuco", "São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		List<String> estados2 = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", 
				"Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");
 
		System.out.println("\nExemplo - Método Map");

		List<Integer> numerosAoCubo = numeros.stream().map(x -> x * x * x).collect(Collectors.toList());

		System.out.println("\nNumeros elevados ao Cubo: " + numerosAoCubo);

		System.out.println("\nExemplo - Método Map");

		List<Integer> numerosPares = numeros.stream()
	 .filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println("\nNumeros pares: " + numerosPares);


		List<Integer> numerosOrdenadosAsc = numerosDesordenados.stream()
	    .sorted()
	    .collect(Collectors.toList());
       //sorted(comparator.reverseOrder()) para reverter
		System.out.println("\nNumeros ordenados: " + numerosOrdenadosAsc );
		
		List<String> estadosNDuplicados = estados.stream()
			    .distinct()
			    .collect(Collectors.toList());
		      
				System.out.println("\nEstados sem repetiçoes: " + estadosNDuplicados );
				
	long estadosIniciamLetraR = estados2.stream()
			    .filter(x -> x.toString().startsWith("R"))
			    .count();
	//starwitch serve para identificar o começo da string
				      
				System.out.println("\n numeros de Estados iniciados com a letra R: "
				+ estadosIniciamLetraR + " estado(s)");
						
	}

}
