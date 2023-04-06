package exercicios;

import java.util.Scanner;

public class posicaoN {

	public static void main(String[] args) {
		int[] array;
		int tamanhoArray;
		Scanner lerDados = new Scanner(System.in);
			
	        System.out.printf("Informe o tamanho do Array: ");
		tamanhoArray = lerDados.nextInt();
		array = new int[tamanhoArray];
	for(int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Informe a  posição[%d]: ",i);
			array[i] = lerDados.nextInt();
		}

		System.out.printf("\n%s%7s\n","Indice","Valor");
		for(int i = 0; i < tamanhoArray; i++){
			System.out.printf("%s%9s\n",i,array[i]);
		}		
		lerDados.close();
	}
}
