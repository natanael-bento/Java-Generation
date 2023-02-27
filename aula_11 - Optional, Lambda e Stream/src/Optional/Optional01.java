package Optional;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {

       String [] palavras = new String [10];
       
       //for (var palavra : palavras)
    	 //  System.out.println(palavra);
       
       palavras[2] = "Generation Brasil - turma 61";
       
       Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
       
       Optional<String> checaNulo2 = Optional.ofNullable(palavras[2]);
       
     if(checaNulo.isPresent()) {
    	 String palavra = palavras[5].toLowerCase();
     
       System.out.println(palavra);
     }else System.out.println("Nao existe nenhuma palavra nesa posiçao");
	
     //mostra o que tem no optional []
     System.out.println( "\n" + checaNulo); 
     System.out.println( "\n" + checaNulo2);
     
     //mostra se esta vazio.
     System.out.println( "\n" +checaNulo2.isEmpty());
     
     //mostra o valor que tem dentro do optional
     System.out.println( "\n" + checaNulo2.get());
     
	}

}
