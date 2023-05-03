package principal;

import entidade.Aniversario;
import entidade.Pascoa;
import entidade.Natal;


public class CartoPromo {

	public static void main(String[] args) {
		Pascoa [] pascoa = new Pascoa[1];
		Natal [] natal = new Natal[1];
		Aniversario [] aniversario = new Aniversario[1];
		
		
		pascoa[0] = new Pascoa("Felipe");
		natal[0] = new Natal("Felipe");
		aniversario[0] = new Aniversario("Felipe");
		  
		  for(int i =0; i<pascoa.length;i++) {
			  pascoa[i].exibirMensagem();
		  }
		  
		  for(int i=0; i<natal.length; i++) {
			  natal[i].exibirMensagem();
		  }
		  
		  for(int i=0; i<aniversario.length; i++) {
			  aniversario[i].exibirMensagem()
		  }
		  

	}

}
