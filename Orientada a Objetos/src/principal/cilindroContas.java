package principal;

import java.util.Scanner;

import entidade.cilindro;

public class cilindroContas {

	public static void main(String[] args) {
		
		cilindro CilindroRecebe = new cilindro();
		Scanner lerDado = new Scanner (System.in);
		
		System.out.println("Digite o Raio: ");
		CilindroRecebe.setRaio(lerDado.nextDouble());
		
		System.out.println("Digite a Altura: ");
		CilindroRecebe.setAltura(lerDado.nextDouble());
		
		System.out.println("Digite a Area da base para saber o volume: ");
		CilindroRecebe.setBase(lerDado.nextDouble());
		
		System.out.println("O volume e " + CilindroRecebe.getCalcVolume());
		
		System.out.println("A area do  Cilindro e "  + CilindroRecebe.getArea());

	}

}
