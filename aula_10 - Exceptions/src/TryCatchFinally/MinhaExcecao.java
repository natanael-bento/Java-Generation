package TryCatchFinally;

public class MinhaExcecao extends Exception{

	//versionador padrão
	private static final long serialVersionUID = 1L;
	
	public MinhaExcecao() {}
	
	public MinhaExcecao (String mensagem) {
		 super(mensagem);
	}

}
