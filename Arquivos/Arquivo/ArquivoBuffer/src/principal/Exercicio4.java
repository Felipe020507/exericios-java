package principal;

/*import java.io.*; - Importa todas as classes do pacote java.io, incluindo as classes relacionadas
 * a manipulacao de arquivos e fluxos de entrada/saida.
 * 
 * import java.util.ArrayList; - Importa a classe ArrayList do pacote java.util, usada para
 * armazenar a lista de produtos.
 * 
 * import java.util.List; - Importa a interface List do pacote java.util, usada para definir a 
 * lista de produtos.
 * 
 * import java.util.Scanner; - Importa a classe Scanner do pacote java.util,
 * usada para ler dados de entrada.*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.Produto;

public class Exercicio4 {

	/*
	 * private static final String nome_arquivo = "arquivo.txt";: Declara uma
	 * constante chamada nome_arquvio com o valor "arquivo.txt", representando o
	 * nome do arquivo a ser manipulado.
	 */

	private static final String nome_arquivo = "teste4.txt";

	public static void main(String[] args) {

		/*
		 * Exercicio4 manipulador = new Exercicio4();: Cria uma instancia da classe
		 * ManipularProdutos chamada manipulador.
		 * 
		 * manipulador.listarProdutos(produtos);: Chama o metodo listarProdutos do
		 * objeto manipulador para exibir os produtos da lista.
		 * 
		 * manipulador.removerProduto(produtos, 321);: Chama o metodo removerProduto do
		 * objeto manipulador para remover um produto da lista com o código 321.
		 * 
		 * manipulador.listarProdutos(produtos);: Chama o metodo `listarProdutos` do
		 * objeto manipulador novamente para exibir a lista atualizada de produtos.
		 * 
		 * manipulador.atualizarArquivo(produtos);: Chama o metodo atualizarArquivo do
		 * objeto manipulador para salvar as alteracoes na lista no arquivo.
		 */

		Exercicio4 manipulador = new Exercicio4();
		List<Produto> produtos = manipulador.carregarProduto();
		manipulador.listarProdutos(produtos);
		manipulador.removerProduto(produtos, 321);
		manipulador.listarProdutos(produtos);
		manipulador.atualizarArquivo(produtos);
	}

	/*
	 * public List<Produto> carregarProduto() {: Declara o mtodo carregarProduto,
	 * que retorna uma lista de produtos.
	 * 
	 * List<Produto> produtos = new ArrayList<>();: Cria uma nova lista de produtos
	 * vazia usando a implementacao ArrayList.
	 */

	public List<Produto> carregarProduto() {
		List<Produto> produtos = new ArrayList<>();

		/*
		 * try (FileInputStream fileInputStream = new FileInputStream(nome_arquivo);:
		 * Inicia um bloco de try-with-resources para abrir um arquivo de entrada.
		 * 
		 * BufferedInputStream bufferedInputStream = new
		 * BufferedInputStream(fileInputStream); :Cria um BufferedInputStream para
		 * melhorar o desempenho da leitura do arquivo.
		 * 
		 * Scanner scanner = new Scanner(bufferedInputStream)) {: Cria um objeto Scanner
		 * para ler o arquivo usando o bufferedInputStream.
		 */

		try (FileInputStream fileInputStream = new FileInputStream(nome_arquivo);
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
				Scanner scanner = new Scanner(bufferedInputStream)) {

			/*
			 * while (scanner.hasNextLine()) {: Inicia um loop para iterar sobre cada linha
			 * do arquivo enquanto houver mais linhas para ler.
			 * 
			 * String linha = scanner.nextLine();: Le a proxima linha do arquivo e armazena
			 * na variavel linha.
			 * 
			 * String[] partes = linha.split(", ");: Divide a linha em partes separadas pelo
			 * delimitador ", " e armazena cada parte em um array de strings chamado partes.
			 */

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String[] partes = linha.split(", ");

				/*
				 * if (partes.length == 5) {: Verifica se o numero de partes divididas e igual a
				 * 5.
				 * 
				 * int codigo = Integer.parseInt(partes[0].trim());`: Converte a primeira parte
				 * em um valor inteiro, removendo quaisquer espaços em branco no início ou no
				 * final da string.
				 * 
				 * int quantidade = Integer.parseInt(partes[1].trim());: Converte a segunda
				 * parte em um valor inteiro, removendo quaisquer espaços em branco no inicio ou
				 * no final da string.
				 * 
				 * String nome = partes[2].trim();: Atribui a terceira parte a uma variavel
				 * nome, removendo quaisquer espaços em branco no inicio ou no final da string.
				 * 
				 * String tamanho = partes[3].trim();: Atribui a quarta parte a uma variavel
				 * tamanho, removendo quaisquer espaços em branco no inicio ou no final da
				 * string.
				 * 
				 * double valor = Double.parseDouble(partes[4].trim());: Converte a quinta parte
				 * em um valor de ponto flutuante, removendo quaisquer espaços em branco no
				 * inicio ou no final da string.
				 */

				if (partes.length == 5) {
					int codigo = Integer.parseInt(partes[0].trim());
					int quantidade = Integer.parseInt(partes[1].trim());
					String nome = partes[2].trim();
					String tamanho = partes[3].trim();
					double valor = Double.parseDouble(partes[4].trim());

					/*
					 * * Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);:
					 * Cria um novo objeto Produto com os valores extraídos da linha atual.
					 * produtos.add(produto);`: Adiciona o objeto produto a lista de produtos.
					 */

					Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);
					produtos.add(produto);
				}
			}

			/*
			 * } catch (IOException e) {: Captura uma excecao caso ocorra um erro durante a
			 * leitura do arquivo.
			 * 
			 * System.out.println("Erro ao ler o arquivo: " + e.getMessage());`: Exibe uma
			 * mensagem de erro informando o motivo da excecao.
			 */

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		/* return produtos;: Retorna a lista de produtos carregados do arquivo. */

		return produtos;
	}

	/*
	 * public void removerProduto(List<Produto> produtos, int codigo) {: Declara o
	 * metodo removerProduto, que recebe uma lista de produtos e um codigo como
	 * argumentos.
	 * 
	 * produtos.removeIf(produto -> produto.getCodigo() == codigo);: Remove um
	 * produto da lista se o codigo corresponder ao codigo fornecido.
	 */

	public void removerProduto(List<Produto> produtos, int codigo) {
		produtos.removeIf(produto -> produto.getCodigo() == codigo);
	}

	/*
	 * public void listarProdutos(List<Produto> produtos) {: Declara o metodo
	 * listarProdutos, que recebe uma lista de produtos como argumento.
	 * 
	 * System.out.println("Conteúdo do arquivo:");: Exibe uma mensagem indicando o
	 * conteudo do arquivo.
	 * 
	 * for (Produto produto : produtos) {: Inicia um loop para repetir cada produto
	 * na lista.
	 * 
	 * System.out.println(produto): Exibe o produto atual.
	 * 
	 * System.out.println();: Imprime uma linha em branco para separar os produtos
	 * exibidos.
	 */

	public void listarProdutos(List<Produto> produtos) {
		System.out.println("Conteúdo do arquivo:");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		System.out.println();
	}

	/*
	 * public void atualizarArquivo(List<Produto> produtos) {: Declara o metodo
	 * atualizarArquivo, que recebe uma lista de produtos como argumento.
	 * 
	 * try (PrintWriter writer = new PrintWriter(new FileWriter(nome_arquivo))) {:
	 * Inicia um bloco try-with-resources para abrir um arquivo para escrita.
	 * 
	 * for (Produto produto : produtos) {: Inicia um loop para repetir cada produto
	 * na lista de produtos.
	 * 
	 * writer.println(produto.getCodigo() + ", " + produto.getQuantidade() + ", " +
	 * produto.getNome() + ", " + produto.getTamanho() + ", " +
	 * produto.getValor());: Escreve no arquivo uma linha contendo as informacoes do
	 * produto, separadas por virgula e espaço.
	 * 
	 * System.out.println("Arquivo atualizado com sucesso!");: Exibe uma mensagem
	 * informando que o arquivo foi atualizado com sucesso.
	 *  
	 *  } catch (IOException e) {: Captura uma excecaoo caso ocorra um erro durante a
	 * atualizacao do arquivo.
	 * 
	 * System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());:
	 * Exibe uma mensagem de erro informando o motivo da excecao. 
	 */

	public void atualizarArquivo(List<Produto> produtos) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(nome_arquivo))) {
			for (Produto produto : produtos) {
				writer.println(produto.getCodigo() + ", " + produto.getQuantidade() + ", " + produto.getNome() + ", "
						+ produto.getTamanho() + ", " + produto.getValor());
			}
			System.out.println("Arquivo atualizado com sucesso!");
		} catch (IOException e) {
			System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
		}
	}
}
