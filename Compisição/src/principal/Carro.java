package principal;

import entidade.Automovel;
import entidade.Motor;
import entidade.Pneu;

public class Carro {

	public static void main(String[] args) {
		Motor motor = new Motor(20,10);
		Pneu peneuzinho = new Pneu ("China", 10,(float) 20.10);
		Automovel carro = new Automovel("fusca",(float) 90.540,motor.toString(),peneuzinho.toString());

		System.out.println(carro.Exibir());
		
	}

}
