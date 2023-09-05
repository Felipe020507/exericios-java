package Main;

import java.util.Scanner;
import Controller.Pais_controller;

public class Main1 {

	public static void main(String[] args) {
		Pais_controller paiscontroller = new Pais_controller();
		
		Scanner lerDado = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("==== Menu ====");
            System.out.println("1. Adicionar Pa�s");
            System.out.println("2. Exibir lista de Pa�ses");
            System.out.println("0. Sair");
            System.out.print("Escolha uma op��o: ");
            
            opcao = lerDado.nextInt(); // Ler a op��o escolhida pelo usu�rio
            
            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Pa�s:");
                    lerDado.nextLine(); // Limpar o buffer do scanner
                    String pais = lerDado.nextLine();
                    
                    System.out.println("Adicionar Capital: ");
                    String capital = lerDado.nextLine();
                    
                    paiscontroller.adicionarPais(pais, capital);
                    break;
                case 2:
                    paiscontroller.exibirListaPaises();
                    break;
                case 0:
                    System.out.println("Voc� escolheu sair");
                    break;
                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
            }
        }
        
        lerDado.close(); // Fechar o scanner ao sair do loop
	}
}
