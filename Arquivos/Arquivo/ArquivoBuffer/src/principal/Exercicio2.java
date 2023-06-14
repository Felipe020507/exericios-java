package principal;

/* import java.io.BufferedInputStream; - importa a classe java.io.BufferedInputStream
 * import java.io.BufferedOutputStream; - importa a classe java.io.BufferedOutputStream
 *import java.io.BufferedOutputStream; - importa a classe java.io.FileInputStream
 * import java.io.FileOutputStream; - importa a classe java.io.FileOutputStream
 * import java.io.IOException; - importa a classe import java.io.IOException
 * import java.util.Scanner; - importa a classe import java.util.Scanner;*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

	/*
	 * public class Main {: Declaracao da classe principal chamada Main. public
	 * static void main(String[] args) {: Declaracao do metodo principal main.
	 */

	public static void main(String[] args) {

		/*
		 * try (FileInputStream fileInputStream = new FileInputStream("arquivo.txt");:
		 * Inicio do bloco try-with-resources para abrir o FileInputStream para o
		 * arquivo "arquivo.txt".
		 * 
		 * BufferedInputStream bufferedInputStream = new
		 * BufferedInputStream(fileInputStream)) {: Cria um BufferedInputStream a 
		 * partir do FileInputStream para fornecer bufferização durante a leitura.
		 */

		try (FileInputStream fileInputStream = new FileInputStream("arquivo.txt");
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

			/*
			 * byte[] teste = new byte[bufferedInputStream.available()];: Cria um array
			 * de bytes com o tamanho disponivel no BufferedInputStream.
			 * 
			 * int bytesRead = bufferedInputStream.read(bytes);: Le os bytes do arquivo
			 * para o array de bytes e armazena a quantidade de bytes lidos
			 * na variavel bytesRead
			 */

			byte[] teste = new byte[bufferedInputStream.available()];
			int bytesRead = bufferedInputStream.read(teste);

			/*
			 * String texto = new String(bytes);: Converte os bytes lidos em uma string
			 * usando a codificação padrão do sistema.
			 */

			String texto = new String(teste);

			/*
			 * System.out.println("Conteúdo do arquivo:");: Exibe uma mensagem indicando
			 * o inicio do conteúdo do arquivo.
			 * 
			 * System.out.println(texto);: Exibe o conteudo do arquivo lido.
			 */

			System.out.println("Conteúdo do arquivo:");
			System.out.println(texto);

			/**
			 * } catch (IOException e) {: Captura uma exceção do tipo IOException caso
			 * ocorra um erro durante a leitura do arquivo.
			 * 
			 * System.out.println("Erro ao ler o arquivo: " + e.getMessage());: Exibe uma
			 * mensagem de erro indicando o problema ocorrido durante a leitura do 
			 * arquivo. A mensagem de erro é obtida a partir da excecao IOException.
			 */

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}
}
