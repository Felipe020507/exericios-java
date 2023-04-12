package entidade;

public class LivroFiccao extends Livro {
	private String genero;
	private String subgenero;
	
	
	
	public void SinopsedoL() {
		System.out.println("A guerra e ruim agora faz o L imediatamente");
	}
	
	@Override
	public void informarDetalhes() {
		super.informarDetalhes();
		System.out.println(this.genero);
		System.out.println(this.subgenero);
	}
	
	
	//metodo Getts e Setts
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSubgenero() {
		return subgenero;
	}
	public void setSubgenero(String subgenero) {
		this.subgenero = subgenero;
	}
}
