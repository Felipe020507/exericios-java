package entidade;

public class Livro {
	private String titulo;
	private String nomedoautor;
	private int numerodepaginas;

	public void informarDetalhes() {
		System.out.println(this.titulo);
		System.out.println(this.numerodepaginas);
		System.out.println(this.nomedoautor);
	}

	// metodo Getts e Setts

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNomedoautor() {
		return nomedoautor;
	}

	public void setNomedoautor(String nomedoautor) {
		this.nomedoautor = nomedoautor;
	}

	public int getNumerodepaginas() {
		return numerodepaginas;
	}

	public void setNumerodepaginas(int numerodepaginas) {
		this.numerodepaginas = numerodepaginas;
	}

	public void InformarDados() {

	}

}
