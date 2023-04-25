package entidade;

public class Pessoa {
protected String nome;
protected int idade;

public Pessoa (String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
	
}

public void exibirInformacoes() {
	System.out.printf("Nome: ", this.nome);
	System.out.printf("Idade: ", this.idade);
}







// metodo Getts e Setts

public String getNome() {
	return nome;
}
public int getIdade() {
	return idade;
}


}
