package model;
public class Tarefa {
    private String descricao;
    private boolean completado;

    public Tarefa(String description) {
        this.descricao = description;
        this.completado = false;
    }
   

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleto() {
        return completado;
    }

    public void setCompletado(boolean completed) {
        this.completado = completed;
    }
}