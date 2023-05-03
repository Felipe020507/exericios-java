package entidade;

public abstract class CartoPromo {
	private String destinatario;
	

	public CartoPromo(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public abstract void exibirMensagem();
	
	
}
