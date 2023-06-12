package principal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.Produto;

public class Exercicio3 {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();

		try (FileInputStream fileInputStream = new FileInputStream("teste4.txt");
				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

			Scanner lerdado = new Scanner(bufferedInputStream);
			lerdado.useDelimiter("\\s*,\\s*|\n");

			while (lerdado.hasNext()) {
				int codigo = lerdado.nextInt();
				int quantidade = lerdado.nextInt();
				String nome = lerdado.next();
				String tamanho = lerdado.next();
				double valor = lerdado.nextDouble();

				Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);
				produtos.add(produto);
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		System.out.println("Conteúdo do arquivo:");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}

}
