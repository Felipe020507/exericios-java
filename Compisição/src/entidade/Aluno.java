package entidade;
public class Aluno {
	
	private String nome;
	private int idade;
	private int matricula;
	private String turma;
	
	public Aluno(String nome, int matricula, int idade,String turma) {
		this.idade = idade;
		this.nome = nome;
		this.matricula = matricula;
		this.turma=turma;

	}
	
	public String exibirDados() {
		return nome + "\n" + idade + "\n" +matricula+"\n"+ turma.toString();
	}
	
	
	
	
	//metodo Getts e Setts
	

	public String getTurma() {
		return turma;
	}
	
	public String getNome() {
		return nome;
	}

	public String turma() {
		return turma;
	}
	public int getIdade() {
		return idade;
	}

	public int getMatricula() {
		return matricula;
	}

}
