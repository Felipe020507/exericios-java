package principal;

import java.util.Scanner;

import entidade.cone;

public class coneContas {

	public static void main(String[] args) {
		
		cone ConeRecebe = new cone();
		Scanner lerDado = new Scanner(System.in);
		
		System.out.println("Digite o Raio: ");
		ConeRecebe.setRaio(lerDado.nextDouble());
		
		System.out.println("Digite a Altura:  ");
		ConeRecebe.setAltura(lerDado.nextDouble());
		
		System.out.println("Digite a Geratriz: ");
		ConeRecebe.setGeratriz(lerDado.nextDouble());
		
		System.out.println("A Area e " + ConeRecebe.getArea());
		System.out.println("O Volume e " + ConeRecebe.getVolume());
	}

}
