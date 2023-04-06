package exercicios;

import java.util.Scanner;

public class temperaturasDia {

	public static void main(String[] args) {
		double[] array= new double[1];
		double temp1, temp2, temp3;
		double maior= 0, menor = 1000;
		
		Scanner lerDado = new Scanner(System.in);
		
		
		for(int i = 0; i <array.length;i++) {
			System.out.println("Digite a Temperatura da Manha: ");
			temp1= lerDado.nextDouble();
			System.out.println("Digite  a Temperatura da Tarde: ");
			temp2 = lerDado.nextDouble();
			System.out.println("Digite a Temperatura da Noite: ");
			temp3= lerDado.nextDouble();
						
		if(temp1>temp2) {
			
			maior=temp1;
			
		}
		else if (temp2>maior) {
			
			maior=temp2;
			
		}
		else {
			maior=temp3;
		}
		
		if(temp1<temp2) {
			
			menor=temp1;
			
		}
		
		else if (temp2<menor) {
			
			menor=temp2;
		}
			
		else {
			
			menor=temp3;
		}
		
			System.out.printf("A maior temperatura e %.2f ", maior);
			System.out.printf("A menor temperatura e %.2f ", menor);
			
		}
		
	}

}
