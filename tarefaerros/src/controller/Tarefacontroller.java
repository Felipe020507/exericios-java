package controller;

import java.util.ArrayList;
import java.util.List;
import model.Tarefa;
import view.Tarefaview;

public class Tarefacontroller {
    private Lst<Tarefa> tarefa;
    private Tarefaview view;

    public Tarefacontroller() {
        tarefa = new ArrayList<>();
        view = new Tarefaview();
    }

    public void addTarefa(String description) {
        Tarefa tarefa1 = new Tarefa(description);
        tarefa1.add(tarefa1);
        atualizarView();
    }

    public void marcarTarefaconcluida(int index) {
        if (index >= 0 && index < tarefa.size()) {
            Tarefa tarefa3 = tarefa.get(index);
            tarefa.setCompletado();
            atualizarView();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarTarefa() {
        view.mostrarTarefa(tarefa);
    }

    private void atualizarView() {
        mostrarTarefa():
    }
}