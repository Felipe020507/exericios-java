package entidade;

public class Aniversario extends CartoPromo {

	public Aniversario(String destinatario) {
		super(destinatario);
	}
	

	@Override
	public void exibirMensagem() {
		System.out.printf("Feliz Aniversario \n");
	}
}
