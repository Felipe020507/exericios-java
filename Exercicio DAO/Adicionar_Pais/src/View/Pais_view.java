package View;

import java.util.List;

import Model.Pais;

public class Pais_view {

	public void exibirListapais(List<Pais>paises) {
		System.out.println("======== Pa�ses ==========");
		System.out.println("==========================");
		
		for(Pais pais: paises) {
			System.out.println("Pa�s: " + pais.getNome() + "\nCapital: " + pais.getCapital());
		}
		
	}
}
