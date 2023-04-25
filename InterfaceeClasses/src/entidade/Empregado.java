package entidade;

public abstract class Empregado {
private String nome;
private int identificacao;



public Empregado(String nome, int identificacao) {
this.nome = nome;
this.identificacao = identificacao;
}
public String getNome() {
return nome;
}
public int getIdentificacao() {
return identificacao;
}
public String toString() {
return nome + ' ' + identificacao;
}

public abstract float calcualrSalario();
}