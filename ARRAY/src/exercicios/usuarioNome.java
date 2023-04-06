package exercicios;

import java.util.Scanner;

public class usuarioNome {

	public static void main(String[] args) {
		String[]nomearray= new String[9];
		
		Scanner lerDado = new Scanner(System.in);
		
		
		for (int i = 0; i < nomearray.length; i ++) {
			System.out.println("Digite os Nomes: ");
			nomearray[i]=lerDado.next();
		}
		
		
		for(int i = 0; i < nomearray.length; i++) {
			System.out.printf("Os nomes sao: ", nomearray[i]);
			
		}
		
	}

}
