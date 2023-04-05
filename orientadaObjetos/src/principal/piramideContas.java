package principal;

import java.util.Scanner;

import entidade.piramidaquad;

public class piramideContas {

	public static void main(String[] args) {
		
		piramidaquad PiramideRecebe = new piramidaquad();
		Scanner lerDado = new Scanner(System.in);
		
		System.out.println("Digite um lado: ");
		PiramideRecebe.setLado(lerDado.nextDouble());

		System.out.println("Digite a altura: ");
		PiramideRecebe.setAltura(lerDado.nextDouble());
		
		System.out.println("Digite a base: ");
		PiramideRecebe.setBase(lerDado.nextDouble());
		
		System.out.println("A Area e " + PiramideRecebe.getArea());
		System.out.println("O Volume e " + PiramideRecebe.getVolume());
	}

}
