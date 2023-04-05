package entidade;

public class teste {

	private String nome;
    private int numero;
    private float[] notas;

    public teste(String nome, int numero, float[] notas) {
        this.nome = nome;
        this.numero = numero;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public float[] getNotas() {
        return notas;
    }

    public float calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
