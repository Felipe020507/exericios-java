package principal;

import java.util.Scanner;

import entidade.operacoes;

public class operacoesMatematicas {

	public static void main(String[] args) {
		int numero;
		Scanner lerDado = new Scanner(System.in);
		operacoes Opera = new operacoes();
		
		while(true) {
			
			System.out.println(" Digite \n 1 para Adicao \n 2 para Subtracao \n 3 para Divisao \n 4 para Multiplicacao \n 5 para Raiz \n 6 para Potencia \n 8 para Logaritmo \n 9 para Sair ");
			numero= lerDado.nextInt();			
			if (numero==9) {
				break;
			}
			else {
				switch(numero) {
				case 1:
					System.out.println("Digite o primeiro numero: ");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("Digite o segundo numero: ");
					Opera.setSegundo(lerDado.nextInt());
					
					System.out.println("A soma e " + Opera.getSoma());
					break;
				case 2:
					System.out.println("Digite o primeiro numero: ");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("Digie o segundo numero: ");
					Opera.setSegundo(lerDado.nextInt());
					
					System.out.println("A subtracao e" + Opera.getSubtracao());
					break;
				case 3:
					System.out.println("Digite o primeiro numero:");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("Digite o segundo numero: ");
					Opera.setSegundo(lerDado.nextInt());
						if(Opera.getPrimeiro() != 0 && Opera.getSegundo() != 0) {
							System.out.println("A divisao e " + Opera.getDivisao());
						}
						else {
							System.out.println("divisao por 0");
						}
				
					break;
				case 4:
					System.out.println("Digite o primeiro numero:");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("Digite o segundo numero: ");
					Opera.setSegundo(lerDado.nextInt());
					
					System.out.println("A multiplicacao e " + Opera.getMultiplicacao());
					break;
				case 5:
					System.out.println("Digite um numero");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("A raiz e " + Opera.getRaiz());
					break;
				case 6:
					System.out.println("Digite um numero");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("Digite o segundo numero: ");
					Opera.setSegundo(lerDado.nextInt());
					
					System.out.println("A potencia e " + Opera.getPotencia());
					break;
					//case7
				case 8:
					System.out.println("Digite o primeiro numero");
					Opera.setPrimeiro(lerDado.nextInt());
					System.out.println("Digite o segundo numero: ");
					Opera.setSegundo(lerDado.nextInt());
					
					System.out.println(Opera.getLoga());
					break;
				}
			}
		}

	}

}
