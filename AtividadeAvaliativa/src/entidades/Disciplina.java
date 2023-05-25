package entidades;

/**
 * 
 * @author Aluno will
 * 
 * Aqui nos temos um enum com os atributos (FPOO,LM,SO,REDES) e um get
 *
 */
public enum Disciplina {
	//atributos
	FPOO("fpoo"),
	LM("lm"),
	SO("so"),
	REDES("redes");
	
	private String materias;
	
	//construtor com o parametro materia
	private Disciplina(String materia) {
		this.materias = materia;
	}
	
	//get
	public String getMaterias() {
		return materias;
	}

}
