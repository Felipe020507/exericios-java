package principal;

import java.util.Scanner;

import entidade.Quadrado;
import entidade.quadrado;

public class quadradoContas {

	public static void main(String[] args) {
		double ladoQuadrado;
		quadrado QuadradoRecebe = new quadrado();
		Scanner lerDado = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		ladoQuadrado = lerDado.nextDouble();
		QuadradoRecebe.setLadoQuadrado(ladoQuadrado);
		
		System.out.println("Area do quadrado: ");
		System.out.println(QuadradoRecebe.calcularArea());
		System.out.println("Perimetro do quadrado: ");
		System.out.println(QuadradoRecebe.calcularPerimetro());

		lerDado.close();
		

	}

}
