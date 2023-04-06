package entidade;

public class piramidaquad {
	private double lado;
	private double altura;
	private double base;
	
	//metodo contas
	
	public double getArea() {
		return Math.pow(lado, 2);
	}
	
	
	public double getVolume() {
		return (base * altura)/3; 
	}
	
	
	
	//metodo Get e Set
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
}





//lado ao quadrado