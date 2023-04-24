package principal;

import entidade.Diretor;
import entidade.Vendedor;
import entidade.Atendente;

public class Classesabstratas {

	public class Principal {
	public static void main(String[] args) {
	Diretor diretor = new Diretor("Carlos", 1, 3000);
	Vendedor vendedor = new Vendedor("Felipe", 2, 2000, 10, 5);
	Atendente atendente = new Atendente("Ricardo", 3, 1500, 10);
	System.out.println(diretor.toString() + " \nSalario Final: " +
	diretor.calcularSalario() + "\n");
	System.out.println(vendedor.toString() + " \nSalario Final: " +
	vendedor.calcularSalario() + "\n");
	System.out.println(atendente.toString() + " \nSalario Final: " +
	atendente.calcularSalario());
	}
	
	
	}
}
