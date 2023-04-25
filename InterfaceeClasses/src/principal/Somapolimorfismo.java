package principal;

import entidade.Soma;

public class Somapolimorfismo {

	public static void main(String []args){
		Soma soma = new Soma();
		System.out.println(soma.adicao(4, 5));
		System.out.println(soma.adicao(3, 3, 3));
		System.out.println(soma.adicao(2.3, 1.7, 5.0));
		}
}