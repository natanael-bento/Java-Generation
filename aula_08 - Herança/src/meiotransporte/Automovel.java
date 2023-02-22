package meiotransporte;

public class Automovel extends Terrestre {

	private String cor;
	private int nPortas;
	private String placa;
    private int marcha;
    
	public Automovel(int capacidade, int nRodas, float velocidade, String cor, int nPortas, String placa, int marcha) {
		super(capacidade, nRodas, velocidade);
		this.cor = cor;
		this.nPortas = nPortas;
		this.placa = placa;
		this.marcha = marcha;
	}
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
     public void visualizar() {
          super.visualizar();
          System.out.println("cor :" + this.cor);
          System.out.println("numero de portas :" + this.nPortas);
          System.out.println("placa :" + this.placa);
          System.out.println("marcha :" + this.marcha);
          
     }
    
  //  public void mensagem () {
   // 	System.out.println("mensagem padrao");
  //  }

//    public void mensagem (String mensagem) {
 //   	System.out.println(mensagem);
 //   }



    
}
