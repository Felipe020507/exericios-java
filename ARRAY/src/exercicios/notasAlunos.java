package exercicios;

import java.util.Scanner;

public class notasAlunos {

	public static void main(String[] args) {
		int[]array = new int[10];
		float num1,num2,num3;
	
		
		Scanner lerDado = new Scanner(System.in);
		
		for(int i = 0; i < array.length;i++) {
			System.out.println("Digite a primeira nota: ");
			num1 = lerDado.nextFloat();
			System.out.println("Digite a segunda nota: ");
			num2=lerDado.nextFloat();
			System.out.println("Digite a terceira nota: ");
			num3=lerDado.nextFloat();
			array[i] =(int) (num1 + num2 + num3)/3;
			
		}
		
		for(int i = 0;i< array.length;i++) {
			System.out.printf("A media do [%d]: ", i);
			System.out.println(array[i]);
		}
	}

}


//%.2f