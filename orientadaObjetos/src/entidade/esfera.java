package entidade;

public class esfera {
	private double raio;
	private double pi;
	
	
	//metodo contas
	
	public double getArea() {
		double pi= 3.14;
		return  4* pi *(Math.pow(raio, 2));
	}
	
	
	public double getVolume() {
		double pi= 3.14;
		return 1.3 * pi *(Math.pow(raio, 3));
	}
	
	
	
	
	//metodo Gets e Sets
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	public void setPi(double pi) {
		this.pi = pi;
	}
}
