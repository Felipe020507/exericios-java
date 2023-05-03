package principal;

import entidade.Produto;
import entidade.Caderno;
import entidade.LivroPapelaria;

public class Papelaria {

	public static void main(String[] args) {
		
		
		
		Caderno caderno = new Caderno("Felipe", 12, 4, "Identific", 8, "Bic");

		//sLivroPapelaria livro = new LivroPapelaria("Felipe", 23, 65, "Terror", "Carlos", "HS" );
		
		
		caderno.exibirInformacoes();
		//livro.exibirInformacoes();
	}

}
