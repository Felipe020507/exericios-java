package principal;

import java.util.Scanner;

import entidade.Aluno;
import entidade.Pessoa;


public class AlunoPessoa {

	public static void main(String[] args) {
		String nomeDoAluno, nomeDisciplina;
		int idadeAluno;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe um nome:");
		nomeDoAluno = lerDados.next();
		System.out.println("Informe a idade:");
		idadeAluno = lerDados.nextInt();

		System.out.println("Informe a disciplina:");
		nomeDisciplina = lerDados.next();
		
		//Pessoa pessoa = new Pessoa(nomeDoAluno, idadeAluno);
		//pessoa.mostarDados();
		
		Aluno aluno = new Aluno(nomeDoAluno,idadeAluno,nomeDisciplina);
		aluno.mostarDados();
		
	}

}
