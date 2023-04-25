package entidade;



public class Aluno extends Pessoa {
private String[] disciplina;
private int id;

public Aluno (String nome,int idade, String[]disciplina, int id) {
	super(nome, idade);
	this.disciplina = disciplina;
	this.id = id;
}

public void estudar() {
	System.out.println("Estou estudando");
}


@Override
public void exibirInformacoes() {
	super.exibirInformacoes();
	
	System.out.printf("Numero de id: %d \n", id);
	
	System.out.print("Disciplinas: ");
	for (String disciplina: disciplina) {
		System.out.println(disciplina + "");
	}
	System.out.println();
}

public String[] getDisciplina() {
	return disciplina;
}

public int getId() {
	return id;
}

}
