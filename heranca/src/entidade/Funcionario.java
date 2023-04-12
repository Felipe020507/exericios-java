package entidade;

public class Funcionario extends Pessoa {
	private String cargo;
	private String gerente;

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println(this.cargo);
		System.out.println(this.gerente);
	}

	// metod Getts e Setts

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
}
