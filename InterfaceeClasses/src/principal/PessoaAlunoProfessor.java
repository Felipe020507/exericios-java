package principal;

import entidade.Aluno;
import entidade.Professor;

public class PessoaAlunoProfessor {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Carlos",16, new String[]{"Matematica", "HTML"}, 2);
		 System.out.println("Informacoes do aluno: ");
	        aluno.exibirInformacoes();
	        aluno.estudar();

	        
	        System.out.println("\nInformacoes do professor: ");
	        Professor professor1 = new Professor("Eduardo", 37, new String[]{"Turma 1", "Turma 2"}, 2);
	        professor1.exibirInformacoes();
	        professor1.ensinar();
	}

}
