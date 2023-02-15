package aula_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FirtIn_FirstOut {

	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Rony");
		fila.add("Lucas");
		fila.add("Isaac");
		fila.add("Fernando");
		fila.add("Laise");
		fila.add("Elizangela");
		
		Iterator<String> iFila = fila.iterator();
		
		while(iFila.hasNext()) {
			  System.out.println(iFila.next());
		}
		
		System.out.println("retirar um elemento da fila");
		
		System.out.println(fila.poll());
		
		System.out.println("fila atalizada:");
		
		//System.out.println(fila.size()); para mostrar o tamanho.
		
		for(var elemento: fila) {
			  System.out.println(elemento);
				
		}

	}

}
