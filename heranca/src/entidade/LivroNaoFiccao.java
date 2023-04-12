package entidade;

public class LivroNaoFiccao extends Livro {
private String topico;
private String tema;



	public void recomendarOutrosTitulos() {
		System.out.println("Recomendações: ");
		System.out.println("Programação");
		System.out.println("Historia");
		System.out.println("Minecraft");
	}
	
	@Override
	public void informarDetalhes() {
		super.informarDetalhes();
		System.out.println(this.topico);
		System.out.println(this.tema);
	}








//metod Getts e setts

public String getTopico() {
	return topico;
}
public void setTopico(String topico) {
	this.topico = topico;
}
public String getTema() {
	return tema;
}
public void setTema(String tema) {
	this.tema = tema;
}

}
