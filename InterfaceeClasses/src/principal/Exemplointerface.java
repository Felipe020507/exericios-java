package principal;

import entidade.HerdaInterface;

public class Exemplointerface {

	public class Principal {
		public static void main(String[] args) {
		HerdaInterface herdaInterface = new HerdaInterface();
		herdaInterface.exibirInformacoes();
		System.out.println(herdaInterface.VALOR);
		}
		}
}
