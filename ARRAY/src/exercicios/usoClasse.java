package exercicios;

import java.util.Arrays;

public class usoClasse {

	public static void main(String[] args) {
		boolean b;
		int localizacao;
		int[] arrayPreenchido;
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int[] intArrayCopia;
		double[] array = {8.4, 9.3, 0.2, 7.9, 3.4};
		
		intArrayCopia = new int[intArray.length];
		Arrays.sort(array);
		System.out.println("Array de double: ");
		
		for(double d : array) {
			System.out.printf("%.1f ",d);
		}
	}
}