package meiotransporte;

public class TestaTransporte {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(5);
		
		Terrestre tr1 = new Terrestre(5,4, 200);
		Automovel a1 = new Automovel(5, 4, 200, "branco", 4, "xt400", 4);
		
		t1.visualizar();
		
		System.out.println("\n");
		
		tr1.visualizar();
		
		System.out.println("\n");
		 a1.visualizar();
		
       //   a1.mensagem();
       //   a1.mensagem("o carnaval acabou");
	}

}
