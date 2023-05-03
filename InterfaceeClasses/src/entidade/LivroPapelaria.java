package entidade;

public class LivroPapelaria extends Produto {
	private String tema;
	private String nomedoautor;
	private String editora;

	public LivroPapelaria(String nome, float precounitario, int quantidade, String tema, String nomedoautor,
			String editora) {
		super(nome, precounitario, quantidade);
		this.tema = tema;
		this.nomedoautor = nomedoautor;
		this.editora = editora;
	}

	@Override
	public double calcularPrecoTotal() {
		return (precounitario + quantidade) + 10;
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.printf("Tema: ", tema);
		System.out.printf("Nome do Autor: ", this.nomedoautor);
		System.out.printf("Editora: ", this.editora);
	}

	
	
	
	// Metodo Getts e Setts
	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setNomedoautor(String nomedoautor) {
		this.nomedoautor = nomedoautor;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
