package principal;

/* import java.io.BufferedInputStream; - importa a classe BufferedInputStream do pacote java.io
 * import java.io.FileOutputStream; - importa a classe FileOutputStream do pacote java.io
 *  import java.io.IOException; - importa a classe IOException do pacote java.io
 *  import java.util.Arraylist - importa a classe Arraylist do pacote java.util*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.Produto;

public class Exercicio3 {

	/*
	 * public static void main(String[] args) {`: Declaracao do metodo principal
	 * main.
	 */

	public static void main(String[] args) {

		/*
		 * List<Produto> produtos = new ArrayList<>();: Cria uma lista de produtos vazia
		 * usando a classe ArrayList.
		 */

		List<Produto> produtos = new ArrayList<>();

		/*
		 * try (FileInputStream fileInputStream = new FileInputStream("arquivo.txt");`:
		 * Inicio do bloco try-with-resources para abrir o FileInputStream para o
		 * arquivo "arquivo.txt".
		 * 
		 * BufferedInputStream bufferedInputStream = new
		 * BufferedInputStream(fileInputStream)) {: Cria um BufferedInputStream a partir
		 * do FileInputStream para fornecer bufferizacao durante a leitura.
		 */

		try (FileInputStream fileInputStream = new FileInputStream("teste4.txt");
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

			/*
			 * Scanner scanner = new Scanner(bufferedInputStream);: Cria uma instancia do
			 * Scanner para ler os dados do arquivo usando o BufferedInputStream.
			 * 
			 * scanner.useDelimiter("\\s*,\\s*|\n");`: Define o delimitador do Scanner para
			 * uma vírgula seguida de zero ou mais espaços em branco ou uma nova linha.
			 */

			Scanner lerdado = new Scanner(bufferedInputStream);
			lerdado.useDelimiter("\\s*,\\s*|\n");

			/*
			 * while (scanner.hasNext()) {: Inicia um loop para ler cada linha do arquivo
			 * enquanto houver mais linhas.
			 * 
			 * int codigo = scanner.nextInt();: Le o proximo inteiro do arquivo e atribui a
			 * variavel codigo int quantidade = scanner.nextInt();: Le o proximo inteiro do
			 * arquivo e atribui a variavel quantidade.
			 * 
			 * String nome = scanner.next();: Le a proxima string do arquivo e atribui a
			 * variavel nome. String tamanho = scanner.next();:
			 * 
			 * Le a proxima string do arquivo e atribui a variavel tamanho. double valor =
			 * scanner.nextDouble();: Le o proximo valor double do arquivo e atribui a
			 * variavel valor.
			 */

			while (lerdado.hasNext()) {
				int codigo = lerdado.nextInt();
				int quantidade = lerdado.nextInt();
				String nome = lerdado.next();
				String tamanho = lerdado.next();
				double valor = lerdado.nextDouble();

				/*
				 * Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);:
				 * Cria uma instância da classe `Produto` com os valores lidos do arquivo.
				 * produtos.add(produto);: Adiciona o produto à lista de produtos.
				 */

				Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);
				produtos.add(produto);
			}

			/*
			 * } catch (IOException e) {: Captura uma exceção do tipo IOException caso
			 * ocorra um erro durante a leitura do arquivo.
			 */

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		/*
		 * . System.out.println("Erro ao ler o arquivo: " + e.getMessage());`: Exibe
		 * uma mensagem de erro indicando o problema
		 */

		System.out.println("Conteúdo do arquivo:");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}

}
