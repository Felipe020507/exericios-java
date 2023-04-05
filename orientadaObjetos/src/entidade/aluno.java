package entidade;

public class aluno {
	private String nome;
	private int numero;
	private float[] notas;

	//Construtor
	public Aluno(String nome, int numero, float[] notas) {
		this.nome = nome;
		this.numero = numero;
		this.notas = notas;
	}
	
	//calculo de média
	public float calcularMedia(float[] vetorDeNotas) {
		float soma = 0, media = 0;
		
		for (float nota : vetorDeNotas) {
			soma += nota;
		}
		 media = (soma/vetorDeNotas.length); 
		return media;
	}

	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	//método to String
	public String toString() {
		return "Aluno: " + nome + " | Numero: " + numero + " | Média: " + calcularMedia(notas);
	}
}