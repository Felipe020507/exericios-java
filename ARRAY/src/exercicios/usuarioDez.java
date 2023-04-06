package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class usuarioDez {

	public static void main(String[] args) {
		int[] array = new int[4];
		int total= 0;
		
		Scanner lerDado = new Scanner(System.in);
		
		
		for(int i = 0; i < array.length; i++){
			
			System.out.println("Digite um numero: ");
			array[i]=lerDado.nextInt();
			total=total+array[i];
			
		}
		
			System.out.printf("A soma e %d ", total);	
	}

}
