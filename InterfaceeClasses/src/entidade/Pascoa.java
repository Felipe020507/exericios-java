package entidade;

public class Pascoa extends CartoPromo {

	public Pascoa (String destinatario) {
		super (destinatario);
	}
	
	@Override
	public void exibirMensagem() {
		System.out.printf("Feliz Pascoa \n");
		
	}

}
