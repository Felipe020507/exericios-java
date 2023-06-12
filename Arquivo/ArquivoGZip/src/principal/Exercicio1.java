package principal;

/*import java.io.FileInputStream - importa a biblioteca java.io.FileInputStream
 * import java.io.FileOutStream - importa a biblioteca java.io.FileOutStream
 * import java.io.IOException; - importa a biblioteca java.io.IOException
 * import java.util.zip.GZIPOutputStream - importa a biblioteca java.util.zip.GZIPOutpitStream*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Exercicio1 {

	/*
	 * public class Main {: Declaracao da classe principal chamada Main. public
	 * static void main(String[] args) {: Declaracao do metodo principal main.
	 * 
	 * String texto = "Ola Java";: Declaracao de uma variavel texto que contem a
	 * string "Ola Java".
	 * 
	 * String arquivo = "exemplo.txt";: Declaracao de uma variavel arquivo que
	 * contem o nome do arquivo de destino.
	 */

	public static void main(String[] args) {
		String texto = "Ola java";
		String arquivo = "exemplo.txt";

		/*
		 * String arquivo = "exemplo.txt";`: Declaracao de uma variavel arquivo que
		 * contem o nome do arquivo de destino.
		 * 
		 * try (FileOutputStream fileOutputStream = new FileOutputStream(arquivo)) {:
		 * Início do bloco try-with-resources para abrir o FileOutputStream para o
		 * arquivo especificado. byte[] teste = texto.getBytes();: Converte a string
		 * texto em um array de bytes.
		 * 
		 * fileOutputStream.write(teste);: Escreve os bytes no arquivo.
		 * 
		 * System.out.println("Arquivo exemplo.txt criado com sucesso!");: Exibe uma
		 * mensagem indicando que o arquivo foi criado com sucesso. } catch (IOException
		 * e) {: Captura uma exceção do tipo IOException caso ocorra um erro durante a
		 * escrita do arquivo. e.printStackTrace();: Imprime a pilha de exceções para
		 * depuração.
		 */

		try (FileOutputStream fileOutputStream = new FileOutputStream(arquivo)) {
			byte[] teste = texto.getBytes();
			fileOutputStream.write(teste);
			System.out.println("Arquivo exemplo.txt criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * try (FileOutputStream fileOutputStream = new
		 * FileOutputStream("exemplo.txt.gz");: Inicio do bloco try-with-resources para
		 * abrir o FileOutputStream para o arquivo .
		 * 
		 * gz GZIPOutputStream gzipOutputStream = new GZIPOutputStream
		 * (fileOutputStream)) {: Cria um GZIPOutputStream a partir do FileOutputStream`
		 * para compactar os dados. byte[] teste = new byte[1024];: Cria um buffer de
		 * bytes com tamanho 1024 para ler o arquivo original e escrever no arquivo
		 * compactado. int len;: Declara uma variavel len para armazenar o tamanho dos
		 * dados lidos.
		 * 
		 * try (FileInputStream fileInputStream = new FileInputStream(arquivo)) {:
		 * Inicio do bloco try-with-resources para abrir o FileInputStream para o
		 * arquivo original. while ((len = fileInputStream.read(teste2)) > 0) {: Le
		 * dados do arquivo original para o buffer ate que nenhum dado seja lido.
		 * 
		 * gzipOutputStream.write(teste2, 0, len);: Escreve os dados do buffer no
		 * arquivo compactado.
		 * System.out.println("Arquivo exemplo.txt.gz criado com sucesso!");: Exibe uma
		 * mensagem indicando que o arquivo compactado foi criado com sucesso. } catch
		 * (IOException e) {: Captura uma excecao do tipo IOException caso ocorra um
		 * erro
		 */

		try (FileOutputStream fileOutputStream = new FileOutputStream("exemplo.txt.gz");
				GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream)) {

			byte[] teste2 = new byte[1024];
			int len;

			try (FileInputStream fileInputStream = new FileInputStream(arquivo)) {
				while ((len = fileInputStream.read(teste2)) > 0) {
					gzipOutputStream.write(teste2, 0, len);
				}
			}

			System.out.println("Arquivo exemplo.txt.gz criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
