package entidade;

public class quadrado {
	private double ladoQuadrado;
	private double altura;
	
	
	//Conatrutor
	
	
	public quadrado(double ladoQuadrado, double altura) {
		this.ladoQuadrado = ladoQuadrado;
		this.altura = altura;
	}
	
	//metodo conta
	public double calcularArea() {
		return (Math.pow(ladoQuadrado, 2));
	}
	
	public double calcularPerimetro() {
		return (4*ladoQuadrado);
	}
	

	//metodo Get e Set
	public double getLadoQuadrado() {
		return ladoQuadrado;
	}

	public void setLadoQuadrado(double ladoQuadrado) {
		this.ladoQuadrado = ladoQuadrado;
	}

	

	
	
}
