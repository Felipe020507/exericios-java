package entidade;

public class Pessoa {
	private String nome;
	private int idade;
	private double rg;

	public void mostrarDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.rg);
	}

	// metodo Getts e Setts

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRg() {
		return rg;
	}

	public void setRg(double rg) {
		this.rg = rg;
	}

}
