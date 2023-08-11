package controller;

import java.util.ArrayList;
import model.Tarefa;
import java.util.List;
import view.Tarefaview;

public class Tarefacontroller {
	private List<Tarefa> tarefa;
	private Tarefaview view;

	public Tarefacontroller() {
		tarefa = new ArrayList<>();
		view = new Tarefaview();
	}

	public void addTarefa(String description) {
		Tarefa tarefa1 = new Tarefa(description);
		tarefa.add(tarefa1);
		atualizarView();
	}

	public void marcarTarefaconcluida(int index) {
		if (index >= 0 && index < tarefa.size()) {
			Tarefa tarefa3 = tarefa.get(index);
			tarefa3.setCompletado(true);
			atualizarView();
		} else {
			System.out.println("Índice inválido.");
		}
	}

	public void mostrarTarefa() {
		view.mostrarTarefa(tarefa);
	}

	private void atualizarView() {
        mostrarTarefa();
    }
}