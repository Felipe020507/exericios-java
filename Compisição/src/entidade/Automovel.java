package entidade;

public class Automovel {
	private String marca;
	private float quilometragem;
	private String motor;
	private String pneu;
	



	public Automovel(String marca, float quilometragem,String motor,String pneu) {
		this.quilometragem = quilometragem;
		this.marca = marca;
		this.motor=motor;
		this.pneu=pneu;
	}



	public String Exibir() {
		return marca+"\n" + quilometragem+"\n" + motor.toString()+pneu.toString();
	}
	
	
	
	
	//metod Getts e Setts
	
	
	public String getMotor() {
		return motor;
	}



	public String getPneu() {
		return pneu;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public float getQuilometragem() {
		return quilometragem;
	}
	
}
