package principal;

/*import java.io.BufferedOutputStream; - importa a classe java.io.BufferedOutputStream
 * import java.io.FileOutputStream; - importa a classe  java.io.FileOutputStream
 * import java.io.IOException; - importa a classe import java.io.IOException
 * import java.util.Scanner; - importa a classe import java.util.Scanner;*/

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {

	/*
	 * public class Main {: Declaracao da classe principal chamada Main. public
	 * static void main(String[] args) {: Declaracao do metodo principal main.
	 * 
	 * Scanner lerdado = new Scanner(System.in); - Cria uma instancia do `Scanner`
	 * para ler a entrada do usuário.
	 */

	public static void main(String[] args) {
		Scanner lerdado = new Scanner(System.in);

		/*
		 * System.out.print("Digite o texto a ser salvo no arquivo") - mostra uma
		 * mensagem ao usuario para digitar o texto para ser salvo
		 * 
		 * String texto = lerdado.nextLine - Cria uma variavel do tipo String com o nome
		 * texto e instancio o nome que o usuario digitar nela
		 */

		System.out.print("Digite o texto a ser salvo no arquivo: ");
		String texto = lerdado.nextLine();

		/*
		 * try (FileOutputStream fileOutputStream = new
		 * FileOutputStream("arquivo.txt");: Inicio do bloco try-with-resources para
		 * abrir o FileOutputStream para o arquivo "arquivo.txt".
		 * 
		 * BufferedOutputStream bufferedOutputStream = new
		 * BufferedOutputStream(fileOutputStream)) {: 
		 * Cria um BufferedOutputStream a partir do FileOutputStream para fornecer
		 * bufferização durante a escrita.
		 * 
		 * byte[] teste = texto.getBytes();: Converte a string texto em um array
		 * de bytes. 
		 * bufferedOutputStream.write(teste);: Escreve os bytes no arquivo usando o 
		 * BufferedOutputStream.
		 * s
		 * System.out.println("Texto salvo no arquivo com sucesso!");: Exibe uma
		 * mensagem indicando que o texto foi salvo com sucesso no arquivo. 
		 * 
		 * 
		 */

		try (FileOutputStream fileOutputStream = new FileOutputStream("arquivo.txt");
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

			byte[] teste = texto.getBytes();
			bufferedOutputStream.write(teste);

			System.out.println("Texto salvo no arquivo com sucesso!");

		} catch (IOException e) {
			System.out.println("Erro ao salvar o texto no arquivo: " + e.getMessage());
		}

	}

}
