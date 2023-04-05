package entidade;

public class operacoes {
	private int primeiro;
	private int segundo;

	public int getSoma() {
		return (primeiro + segundo);
	}
	
	
	public int getSubtracao() {
	    return (primeiro - segundo);
	}
	
	
	public float getDivisao() {
		return (primeiro / segundo);
	}
	
	public int getMultiplicacao() {
		return (primeiro * segundo);
	}
	
	public double getRaiz() {
		return Math.sqrt(primeiro);
	}
	
	
	public double getPotencia() {
		return Math.pow(primeiro, segundo);
	}

	public double getLoga() {
		return Math.log(primeiro)/ Math.log(segundo);
		}

	
	// metodo Get e Set
	
	public int getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}


	public int getSegundo() {
		return segundo;
	}


	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	

	
}
