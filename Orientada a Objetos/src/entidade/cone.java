package entidade;

public class cone {
	private double raio;
	private double pi;
	private double geratriz;
	private double altura;
	
	//metodo contas
	
	public double getArea() {
		pi = 3.14;
		return pi * raio * (raio + geratriz);
	}
	
	
	public double getVolume() {
		pi = 3.14;
		return 0.3 * pi *(Math.pow(raio, 2) * altura);
	}
	
	
	//metodo Get e Set
	
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}
	
	public void setAltura(double altura) {
		this.altura= altura;
	}
	
	
}
