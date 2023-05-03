package entidade;

public abstract class Produto {
	private String nome;
	protected float precounitario;
	protected int quantidade;

	public Produto(String nome, float precounitario, int quantidade) {
		this.nome = nome;
		this.precounitario = precounitario;
		this.quantidade = quantidade;
	}

	public abstract double calcularPrecoTotal();

	public void exibirInformacoes() {
		System.out.printf("Nome: %s ", this.nome);
		System.out.printf("Quantidade: %d ", this.quantidade);
		System.out.printf("Preco unitatio: %.2f ", this.precounitario);
	}

//Metodo Getts e Setts

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrecounitario(float precounitario) {
		this.precounitario = precounitario;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
