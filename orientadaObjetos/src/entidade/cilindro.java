package entidade;

public class cilindro {
	private double raio;
	private double altura;
	private double pi;
	private double base;
	
	//metodod contas
	
	public double getArea() {
		pi = 3.14;
		return (2 * pi * (Math.pow(raio, 2)) + (2 * pi * raio * altura));
	}
	
	
	public double getCalcVolume() {
		pi = 3.14;
		return(base * altura);
	}
	
	
	
	//metodo Get e Set
	
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double setPi() {
		return pi;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
}
