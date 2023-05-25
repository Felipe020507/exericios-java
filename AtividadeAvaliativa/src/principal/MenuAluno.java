package principal;

import entidades.Aluno;
import entidades.Turma;

public class MenuAluno extends Menu {
	
	private Aluno aluno = new Aluno(null, null,null,null);
    Turma turma;
	
	@Override
	public void menu() {
		do {
			listarOpcoes();
			opcao=entrada.nextInt();
			switch(opcao) {
			case 1:adicionarNota();
				break;
				
			case 2:removerNota();
				break;
				
			case 3:listarNotas();
				break;
				
			case 4:calcularMedia();
				break;
			}
		}while(opcao != 5);
	
	}
	
	
	//metodo para adicionar nota dos alunos
	private void adicionarNota() {
		double nota;
		System.out.println("Qual a nota do aluno: ");
		 int cpf =entrada.nextInt();
		turma.listarAlunos();
		turma.addNota(cpf);
		
		
		
	}
	
	
	//metodo para listar notas do aluno
	private void listarNotas() {
		System.out.println("____Lista de Notas___");
		aluno.listarNotas();
		System.out.println("_____________________");
	}
	
	//metodo para remover notas do aluno
	private void removerNota() {
		listarNotas();
		System.out.println("Qual nota deseja Remover: ");
		double nota = entrada.nextDouble();
		aluno.removerNota(nota);
		
	}
	
	//metodo para calcular media das notas do aluno
	private void calcularMedia() {
		 listarNotas();
	     double media = aluno.calcularNota();
	     System.out.println("Media : "+ media);
		
		if(media >= 6 ) {
			System.out.println("Esse Aluno foi Aprovado");
		}
		else {
			System.out.println("Esse Aluno foi Reprovado");
		}
		
	}
	

	@Override
	protected void listarOpcoes() {
		System.out.println("______Menu Aluno______");
		System.out.println("__1 - Adicionar Nota__");
		System.out.println("__2 - remover Nota____");
		System.out.println("__3 - Listar Notas____");
		System.out.println("__4 - Calcular Media______");
		System.out.println("__5 - Sair____________");
	}

}
