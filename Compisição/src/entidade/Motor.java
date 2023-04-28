package entidade;

public class Motor {
	private float combustivel;
	private int potencia;
	
	
	public Motor(float combustivel, int potencia) {
		this.combustivel = combustivel;
		this.potencia = potencia;
	}
	
	
	public String toString() {
		
		return combustivel + "\n" + potencia+"\n";
		
	}
	
	//metodo Getts e Setts
	
	public float getCombustivel() {
		return combustivel;
	}
	public int getPotencia() {
		return potencia;
	}
	
	
}
