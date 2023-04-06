package matriz;

import java.util.Scanner;

public class gerenciamentoEstoque {

		public static void main(String[] args) {
			int nroDeProdutos;
			float valorTotalEstoque = 0;
			float[][] vetorDeEstoque; 
			
			Scanner lerDados = new Scanner(System.in);

			System.out.println("Informe o numero de produtos em Estoque: ");
			nroDeProdutos = lerDados.nextInt();
			
			vetorDeEstoque = new float[nroDeProdutos][2];

			for (int i = 0; i < nroDeProdutos; i++) {
				System.out.printf("Insira a quantidade do produto[%d]: ",i);
				vetorDeEstoque[i][0] = lerDados.nextInt();
				System.out.printf("Insira o preco do produto[%d]: ",i);
				vetorDeEstoque[i][1] = lerDados.nextFloat();
			}

			for (int i = 0; i < nroDeProdutos; i++) {
				valorTotalEstoque += vetorDeEstoque[i][0] * vetorDeEstoque[i][1];
			}

			System.out.println("Total do estoque em produtos: R$ " + valorTotalEstoque);
			lerDados.close();
		}
	}
