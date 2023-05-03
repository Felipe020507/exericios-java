package entidade;

public class Natal extends CartoPromo {

	public Natal(String destinatario) {
		super(destinatario);
	}
	
	
	@Override
	public void exibirMensagem() {
		System.out.printf("Feliz Natal \n");
	}
}
