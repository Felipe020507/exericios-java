package principal;

/*import entidades.Disciplina; :importa a classe Disciplina do pacote entidades.*/
import entidades.Disciplina;

/*A classe MenuDisciplina tem como objetivo representar um menu especifico
 *  para a escolha de uma disciplina. 
 *  Ela herda todos os atributos e metodos da classe Menu.*/

public class MenuDisciplina extends Menu {

	/*
	 * private Disciplina disciplina;: Declara uma variavel privada do tipo
	 * Disciplina chamada disciplina, que sera usada para representar a disciplina
	 * escolhida
	 */

	private Disciplina disciplina;

	/*
	 * O metodo menu() e uma implementacao do metodo abstrato menu() da classe pai.
	 * Ele exibe um menu para o usuario, onde o usuario pode escolher uma disciplina
	 * atraves de um numero inteiro usando uma estrutura switch-case. A disciplina
	 * escolhida e atribuida a variavel disciplina.
	 */
	@Override
	public void menu() {
		listarOpcoes();
		opcao = entrada.nextInt();
		switch (opcao) {
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

	/*
	 * private Disciplina disciplina;: Declara uma variavel privada do tipo
	 * Disciplina chamada disciplina, que sera usada para representar a disciplina
	 * escolhida
	 */

	public Disciplina pegarDisciplinaEscolhida() {
		return disciplina;
	}

	/*
	 * @Override: Indica que o metodo que segue e uma implementacao de um metodo da
	 * classe pai (Menu). 
	 * 1: disciplina = Disciplina.FPOO;: A disciplina escolhida 
	 * Fundamentos de Programacao Oriebtada a Objetos. 
	 * 2: disciplina = Disciplina.LM;: A disciplina escolhida  Linguagem de Maracacao. 
	 * 3: disciplina = Disciplina.SO;: A disciplina escolhida  Sistema Operacional.
	 * 4: disciplina = Disciplina.REDES;: A disciplina escolhida  Redes e Hardware.
	 */

	@Override
	protected void listarOpcoes() {
		System.out.println("|---------------------------------------------------|");
		System.out.println("|                Disciplina                         |");
		System.out.println("|1 -  Fundamentos de Programacao Oriebtada a Objetos|");
		System.out.println("|2-     Linguagem de Maracacao                      |");
		System.out.println("|3-       Sistema Operacional                       |");
		System.out.println("|4-       Redes e Hardware                          |");
		System.out.println("|---------------------------------------------------|");
	}

}
