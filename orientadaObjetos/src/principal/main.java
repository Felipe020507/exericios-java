package principal;

import java.util.Scanner;

import orientadaObjetos.inicio;

public class main {

	public static void main(String[] args) {
		
		inicio quadrado = new inicio();
		Scanner lerDado = new Scanner(System.in);
		
		System.out.println("lado");
		quadrado.setLargura(lerDado.nextInt());
		
		System.out.println(quadrado.getLargura1());

		
		

	}

}
