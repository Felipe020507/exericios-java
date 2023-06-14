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
	 * public static void main(String[] args) {: Declaracao do metodo principal
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
			 * Scanner lerdado = new Scanner(bufferedInputStream);: Cria uma instancia do
			 * Scanner para ler os dados do arquivo usando o BufferedInputStream.
			 */

			Scanner lerdado = new Scanner(bufferedInputStream);

			/*
			 * while (scanner.hasNextLine()) {: Inicia um loop para ler cada linha do
			 * arquivo enquanto houver mais linhas.
			 * 
			 * String linha = scanner.nextLine();: Le a proxima linha do arquivo e atribui a
			 * variavel linha.
			 * 
			 * String[] partes = linha.split(", ");: Divide a linha em partes separadas pelo
			 * delimitador ", " e armazena cada parte em um array de strings chamado partes.
			 * 
			 */

			while (lerdado.hasNextLine()) {
				String linha = lerdado.nextLine();
				String[] partes = linha.split(", ");
				;

				/*
				 * .if (partes.length == 5) {: Verifica se o numero de partes divididas e igual
				 * a 5.
				 * 
				 * int codigo = Integer.parseInt(partes[0].trim());: Converte a primeira parte
				 * em um valor inteiro e atribui a variavel codigo, removendo quaisquer espaços
				 * em branco extras antes e depois.
				 * 
				 * int quantidade = Integer.parseInt(partes[1].trim());`: Converte a segunda
				 * parte em um valor inteiro e atribui a variavel quantidade, removendo
				 * quaisquer espaços em branco extras antes e depois.
				 * 
				 * String nome = partes[2].trim();: Atribui a terceira parte a variavel nome,
				 * removendo quaisquer espaços em branco extras antes e depois.
				 * 
				 * String tamanho = partes[3].trim();: Atribui a quarta parte a variavel
				 * tamanho, removendo quaisquer espaços em branco extras antes e depois.
				 * 
				 * double valor = Double.parseDouble(partes[4].trim());: Converte a quinta parte
				 * em um valor double e atribui a variavel valor, removendo quaisquer espaços em
				 * branco extras antes e depois.
				 */

				if (partes.length == 5) {
					int codigo = Integer.parseInt(partes[0].trim());
					int quantidade = Integer.parseInt(partes[1].trim());
					String nome = partes[2].trim();
					String tamanho = partes[3].trim();
					double valor = Double.parseDouble(partes[4].trim());

					/*
					 * Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);:
					 * Cria uma instância da classe Produto com os valores lidos da linha.
					 * 
					 * produtos.add(produto): Adiciona o produto a lista de produtos.
					 */

					Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);
					produtos.add(produto);
				}
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		/*
		 * System.out.println("Conteúdo do arquivo:");: Exibe uma mensagem indicando o
		 * conteudo do arquivo.
		 * 
		 * for (Produto produto : produtos) {: Inicia um loop para iterar sobre cada
		 * produto na lista de produtos. 
		 * 
		 * System.out.println(produto);: Exibe o
		 * produto atual.
		 */

		System.out.println("Conteúdo do arquivo:");
		for (Produto produto : produtos) {
			System.out.println(produto);

		}

	}

}
