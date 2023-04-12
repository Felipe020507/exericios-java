package principal;

import java.util.Scanner;
import entidade.Livro;
import entidade.LivrosDidaticos;
import entidade.LivroFiccao;
import entidade.LivroNaoFiccao;

public class Bibiloteca {

	public static void main(String[] args) {
		String nomedoAutor, nomedoLivro, disciplinaLivrosDidaticos;
		int quantidadedePaginas, anoEscolar ;
		int numero = 0;

		Scanner lerDado = new Scanner(System.in);

		Livro LivroparaTodos = new Livro();

		LivrosDidaticos LivroInfantil = new LivrosDidaticos();
		
		LivroFiccao  LivroInventados = new LivroFiccao();

		System.out.println("1 para Livros Livres");
		System.out.println("2 para Livros Didaticos");
		System.out.println("3 para Livros Ficcao");
		System.out.println("4 para Livros de Nao Ficcao");
		System.out.println("5 para Sair");
		numero = lerDado.nextInt();

		switch (numero) {
		case 1:

			System.out.println("Nome do Autor: ");
			nomedoAutor = lerDado.next();
			LivroparaTodos.setNomedoautor(nomedoAutor);

			System.out.println("Nome do Livro: ");
			nomedoLivro = lerDado.next();
			LivroparaTodos.setTitulo(nomedoLivro);

			System.out.println("Numero de Paginas: ");
			quantidadedePaginas = lerDado.nextInt();
			LivroparaTodos.setNumerodepaginas(quantidadedePaginas);
			break;
		case 2:
			System.out.println("Digite a disciplina do Livro: ");
			disciplinaLivrosDidaticos = lerDado.next();
			LivroInfantil.setDisciplina(disciplinaLivrosDidaticos);

			System.out.println("Digite o ano escolar: ");
			anoEscolar = lerDado.nextInt();
			LivroInfantil.setAnoescolar(anoEscolar);
			break;
		case 3:
			System.out.println("Digite o genero do Livro: ");
			System.out.println("Digite o subgenero: ");
		}

	}

}
