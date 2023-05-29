package principal;

import entidade.Conta;
import entidade.ContaExcecao;

public class Exercicio2e3 {

	public static void main(String[] args) {
		Conta contateste = new Conta(0,0,0);
		
		contateste.setValorlimete(1000000);
		contateste.setCodigoIdentificacao(1);
		contateste.setSaldo(400);
		contateste.depositar(500);
		
		try {
			contateste.sacar(400);
			
		}catch(ContaExcecao e) {
			System.out.println("Erro " + e.getMessage());
		}
		
		
	}

}
