package principal;

import java.util.Scanner;

import entidade.aluno;

public class alunoContas {

	public static void main(String[] args) {
		float []vetorDeNotas;
		String nomeAluno;
		int nroAluno;
		Scanner lerDados = new Scanner(System.in); 
		aluno aluno = new aluno();
		
		System.out.println("Informe o nome do Aluno: ");
		nomeAluno = lerDados.next();
		aluno.setNome(nomeAluno);
		
		System.out.println("Informe o numero do Aluno: ");
		nroAluno = lerDados.nextInt();
		aluno.setNumero(nroAluno);
		
		System.out.println("Informe a quantidade de provas: ");
		vetorDeNotas = new float[lerDados.nextInt()];
		
		for(int i = 0; i < vetorDeNotas.length; i++) {
			System.out.printf("\nInsira a nota[%d]: ",i);
			vetorDeNotas[i] = lerDados.nextFloat(); 	
		}
		
		aluno.setNotas(vetorDeNotas);
		System.out.println(aluno.toString());
		
		
		lerDados.close();
	}
}
