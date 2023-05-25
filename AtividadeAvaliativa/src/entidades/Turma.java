package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> listaProfessor;

	public Turma() {
		alunos = new ArrayList<>();
		listaProfessor = new ArrayList<>();
	}

	// metodo para adicionar um aluno para a ArrayList
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	//metodo para adiconar nota dos alunos
	public void addNota(int cpf) {
		for (Aluno aluno : alunos) {
			if (cpf == aluno.getCpf()) {
				System.out.println("Aluno encontrado");
				aluno.setNotas(aluno.adicionarNota());
			} else {
				System.out.println("Aluno não encontrado");
			}
		}
	}

	// metodo para remover um aluno para a ArrayList
	public void removerAluno(int cpf) {
		if (!alunos.isEmpty()) {
			for (int i = 0; i < alunos.size(); i++) {
				if (alunos.get(i).cpf == cpf) {
					alunos.remove(alunos.get(i));
					System.out.println("Aluno removido...");
				}
			}
		} else {
			System.out.println("Lista de Alunos Vazia !");
		}

	}

	// metodo para listar os alunos usando o for
	public void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("Nao tem Alunos na lista");
		} else {
			for (int i = 0; i < alunos.size(); i++) {
				System.out.println(alunos.get(i));
			}
		}
	}

	// metodo para editar o codigo da turma e a diciplina da classe aluno
	public void editarInfoAluno(int cpf, String novoCODTURMA, Disciplina novaDISCIPLINA) {
		for (Aluno aluno : alunos) {
			if (cpf == aluno.getCpf()) {
				aluno.setCodigoTurma(novoCODTURMA);
				aluno.setDisciplinas(novaDISCIPLINA);
			}
		}
	}

	// Metodos para procurar professores
	public void procurarProf(int cpf) {

		for (Professor professor : listaProfessor) {
			if (cpf == professor.getCpf()) {
				professor.Informacao();
			}
		}
	}

	// metodo para adicionar Professor
	public void AdicionarProfessor(Professor professor) {
		listaProfessor.add(professor);
	}

	// metodo para remover Professor
	public void removerProfessor(int cpf) {
		if(!listaProfessor.isEmpty()) {
			for(int i = 0; i < listaProfessor.size();i++) {
				if(listaProfessor.get(i).cpf == cpf) {
					listaProfessor.remove(listaProfessor.get(i));
					System.out.println("Professor Removido");
				}
			}
		} else {
			System.out.println("Lista de Professores esta vazia !");
		}
	}

	// metodo para listar Professores
	public void listarProfessores() {
		if (listaProfessor.isEmpty()) {
			System.out.println("Nao tem Alunos na lista");
		} else {
			for (Professor professor : listaProfessor) {
				professor.Informacao();
			}

		}
	}

}
