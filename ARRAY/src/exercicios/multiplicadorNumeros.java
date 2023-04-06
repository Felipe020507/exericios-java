package exercicios;

public class multiplicadorNumeros {

	public static void main(String[] args){
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
			int total = 1;
			for (int i = 0; i < array.length; i++) {
				total = total * array[i];
			}
			System.out.printf("Total de elementos do array: %d\n", total);

	}
}