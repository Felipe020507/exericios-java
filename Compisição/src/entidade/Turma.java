package entidade;

public class Turma {
	private String disciplina;
	private String professor;
	
	
	public Turma(String disciplina, String professor) {
		this.disciplina = disciplina;
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		
		return disciplina +  "\n" + professor;
		
	}
	
	
	
	
	
	
	
	
	//metodo Getts e Setts
	
	public String getDisciplina() {
		return disciplina;
	}

	public String getProfessor() {
		return professor;
	}

}
