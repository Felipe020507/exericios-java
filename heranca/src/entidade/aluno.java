package entidade;

public class aluno extends pessoa {
private String Curso;

public String getCurso() {
	return Curso;
}

public void setCurso(String curso) {
	Curso = curso;
}


public aluno(String nome,int idade,String Curso) {
	super(nome, idade);
	this.Curso = Curso;
}

public void mostar() {
	
	System.out.println(getNome());
	System.out.println(getIdade());
	System.out.println(getCurso());
}
}
