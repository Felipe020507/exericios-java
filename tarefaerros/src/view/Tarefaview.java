package view;

import java.util.List;
import model.Tarefa;
import java.util.Scanner;

public class Tarefaview {
	public void mostrarTarefa(List<Tarefa> tarefa) {
		System.out.println("Lista de Tarefas:");
		for (int i = 0; i < tarefa.size(); i++) {
			Tarefa tarefa1 = tarefa.get(i);
			System.out.println((i + 1) + ". [" + (tarefa1.isCompleto() ? "x" : " ") + "] " + tarefa1.getDescricao());
		}
	}
}