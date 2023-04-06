package entidade;

public class aluno {
	private String nome;
	private float[] numero;
	private float[] nota1;
	private float[] nota2;
	
	
	








	public float calcularMedia() {
		return ((nota1 * nota2)/2); 
	}
	
	
	
	
	
	
	
	

	// Metodo Gets e Sets
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float[] getNumero() {
		return numero;
	}
	public void setNumero(float numero[]) {
		this.numero = numero;
	}
	public float[] getNota1() {
		return nota1;
	}
	public void setNota1(float nota1[]) {
		this.nota1 = nota1;
	}
	
    public float[] getNota2() {
		return nota2;
		}
    
	public void setNota2(float nota2[]) {
		this.nota2 = nota2;
		}
}
