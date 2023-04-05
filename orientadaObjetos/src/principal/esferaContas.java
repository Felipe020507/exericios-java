package principal;

import java.util.Scanner;

import entidade.esfera;

public class esferaContas {

	public static void main(String[] args) {
		
		esfera EsferaRecebe = new esfera();
		Scanner lerDado = new Scanner(System.in);
		
		System.out.println("Digite o Raio: ");
		EsferaRecebe.setRaio(lerDado.nextDouble());
		
		System.out.println(EsferaRecebe.getArea());
		System.out.println(EsferaRecebe.getVolume());

	}

}
