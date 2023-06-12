package principal;

/* import java.io.BufferedInputStream; - importa a biblioteca java.io.BufferedInputStream
 * import java.io.BufferedOutputStream; - importa a biblioteca java.io.BufferedOutputStream
 *import java.io.BufferedOutputStream; - importa a biblioteca java.io.FileInputStream
 * import java.io.FileOutputStream; - importa a biblioteca  java.io.FileOutputStream
 * import java.io.IOException; - importa a biblioteca import java.io.IOException
 * import java.util.Scanner; - importa a biblioteca import java.util.Scanner;*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		   try (FileInputStream fileInputStream = new FileInputStream("arquivo.txt");
		             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
		            
		            byte[] bytes = new byte[bufferedInputStream.available()];
		            int bytesRead = bufferedInputStream.read(bytes);
		            
		            String texto = new String(bytes);
		            
		            System.out.println("Conteúdo do arquivo:");
		            System.out.println(texto);
		            
		        } catch (IOException e) {
		            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		        }
		    }
		}

}

}
