package entidade;

public class Empresa extends Funcionario {
	private String nomedaempresa;

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println(this.nomedaempresa);
	}

//	metodo Getts e Setts

	public String getNomedaempresa() {
		return nomedaempresa;
	}

	public void setNomedaempresa(String nomedaempresa) {
		this.nomedaempresa = nomedaempresa;
	}
}
