package entidade;

public class LivrosDidaticos extends Livro {
	private String disciplina;
	private int anoescolar;
	

	
	@Override
	public void informarDetalhes() {
		super.informarDetalhes();
		System.out.println(this.disciplina);
		System.out.println(this.anoescolar);
	}

	// metodo Getts e Setts

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getAnoescolar() {
		return anoescolar;
	}

	public void setAnoescolar(int anoescolar) {
		this.anoescolar = anoescolar;
	}

}
