package entidade;

public class Aluno extends PessoaAluno {
	private String nomeDoCurso;

	public Aluno(String nome, int idade, String nomeDoCurso) {
		super(nome, idade);
		this.nomeDoCurso = nomeDoCurso;
	}
	
	@Override
	public void mostarDados() {
		super.mostarDados();
		System.out.println(this.nomeDoCurso);
	}
}
