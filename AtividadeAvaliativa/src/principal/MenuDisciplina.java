package principal;

import entidades.Disciplina;

public class MenuDisciplina extends Menu {
	
	private Disciplina disciplina;

	@Override
	public void menu() {
		listarOpcoes();
		opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			disciplina = Disciplina.FPOO;
			break;
		case 2:
			disciplina = Disciplina.LM;
			break;
		case 3:
			disciplina = Disciplina.SO;
			break;
		case 4:
			disciplina = Disciplina.REDES;
			break;
		}
	}
		
	public Disciplina pegarDisciplinaEscolhida() {
		return disciplina;
	}

	@Override
	protected void listarOpcoes() {
		System.out.println("Escolha: ");
		System.out.println("__1 - Fundamentos de Programação Orientada a Objetos");
		System.out.println("__2 - Linguagem de Marcação");
		System.out.println("__3 - Sistema Operacional");
		System.out.println("__4 - Redes");
	}

}
