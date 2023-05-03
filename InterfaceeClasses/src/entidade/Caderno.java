package entidade;

public class Caderno extends Produto {
	private String identificacao;
	private int numerodepaginas;
	private String fabricante;

	public Caderno(String nome, float precounitario, int quantidade, String identificacao, int numerodepaginas,
			String fabricante) {
		super(nome, precounitario, quantidade);
		this.identificacao = identificacao;
		this.numerodepaginas = numerodepaginas;
		this.fabricante = fabricante;
	}

	@Override
	public double calcularPrecoTotal() {
		return (precounitario + quantidade) * 0.11;
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.printf("identificacao: %s ", this.identificacao);
		System.out.printf("Numero de Paginas: %d ", this.numerodepaginas);
		System.out.printf("Fabricante: %s ", this.fabricante);
	}

//Metodo Getts e Setts

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public void setNumerodepaginas(int numerodepaginas) {
		this.numerodepaginas = numerodepaginas;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
