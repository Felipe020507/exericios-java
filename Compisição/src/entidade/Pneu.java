package entidade;

public class Pneu {
	private String marca;
	private int pressao;
	private float quilometragem;
	



	public Pneu (String marca, int pressao, float quilometragem) {
		this.marca = marca;
		this.pressao = pressao;
		this.quilometragem = quilometragem;
	}
	
	
	public String toString() {
		return marca + "\n" + pressao + "\n" +quilometragem;
	}
	
	
	
	
	
	
	
	// metodo Getts e Setts
	
	
	public float getQuilometragem() {
		return quilometragem;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getPressao() {
		return pressao;
	}
}
