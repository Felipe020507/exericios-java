package entidade;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void mostarDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
	}


}
