package principal;

import java.util.Arrays;

import entidade.teste;

public class testeDois {

	public static void main(String[] args) {
        teste aluno1 = new teste("João", 1, new float[] {8.5f, 7.0f, 9.5f});
        teste aluno2 = new teste("Maria", 2, new float[] {7.0f, 6.5f, 8.0f});

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Número: " + aluno1.getNumero());
        System.out.println("Notas: " + Arrays.toString(aluno1.getNotas()));
        System.out.println("Média: " + aluno1.calcularMedia());

        System.out.println("\nAluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Número: " + aluno2.getNumero());
        System.out.println("Notas: " + Arrays.toString(aluno2.getNotas()));
        System.out.println("Média: " + aluno2.calcularMedia());
    }
}