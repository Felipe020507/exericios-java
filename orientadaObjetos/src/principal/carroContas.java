package principal;

import java.util.Scanner;

import entidade.carros;

public class carroContas {

    public static void main(String[] args) {
        //int[] parcelas = { 2, 4, 6 };
    	//int[] valorParcelas = venda.calcularParcelas(3);
        int[] valorParcelas;
        Scanner lerDados = new Scanner(System.in);
        carros venda = new carros();
        
        //Venda venda = new Venda(1, "Gol", 40000.00, "João", parcelas);
        
        System.out.println("Informe o nome do vendedor: ");
        venda.setNomeVendedor(lerDados.next());
        
        System.out.println("Informe o modelo do carro: ");
        venda.setModeloCarro(lerDados.next());
        
        System.out.println("Informe o valor da venda: ");
        venda.setValorVenda(lerDados.nextFloat());
        
        System.out.println("Informe o número da venda: ");
        venda.setNumVenda(lerDados.nextInt());
        
        System.out.println("Informe o número de parcelas: ");
        valorParcelas = venda.calcularParcelas(lerDados.nextInt());
        
        System.out.println("Número da venda: " + venda.getNumVenda());
        System.out.println("Modelo do carro: " + venda.getModeloCarro());
        System.out.println("Valor da venda: " + venda.getValorVenda());
        System.out.println("Nome do vendedor: " + venda.getNomeVendedor());

        for (int i = 0; i < valorParcelas.length; i++) {
            System.out.printf("\nValor da parcela[%d]: %d",i+1, valorParcelas[i]);
        }
        
        lerDados.close();
    }


}