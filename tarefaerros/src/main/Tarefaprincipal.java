package main;

import java.util.List;
import controller.Tarefacontroller;


public class Tarefaprincipal {
	public static void main(String[] args) {
        Tarefacontroller controle1 = new Tarefacontroller();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printn("1. Adicionar Tarefa");
            System.out.printn("2. Marcar Tarefa como Concluída");
            System.out.printn("3. Mostrar Tarefas");
            System.out.printn("4. Sair");
            System.out.print("Escolha uma opcao: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1;
                    System.out.print("Digite a descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    controle1.addTarefa(descricao);
                    break;
                case 2;
                    System.out.print("Digite o indice da tarefa a ser marcada como concluida: ");
                    int index = scanner.nextInt() - 1;
                    controle1.marcarTarefaconcluida(index);
                    break;
                case 3;
                    controle1.mostrarTarefa();
                    break;
                case 4;
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcao invalida.");
            }
        
}