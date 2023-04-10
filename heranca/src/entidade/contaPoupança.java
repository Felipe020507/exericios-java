package entidade;

public class contaPoupança extends contaBancaria {
	private int dataRendimento;
	private int diaDeRendimento;
	
	public int getDataRendimento() {
		return dataRendimento;
	}

	//Construtor
	public contaPoupança(String nomeCliente, int numConta, float saldo, int dataRendimento) {
		super(nomeCliente, numConta, saldo);
		this.dataRendimento = dataRendimento;
	}

	//Getters and Setters
	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}
	
	//Métodos
	public float calcularNovoSaldo(float taxaDeRendimento, int diaDeRendimento) {
		float novoSaldo;
		
		this.diaDeRendimento = diaDeRendimento;
		
		if(dataRendimento == diaDeRendimento) {
			novoSaldo = (getSaldo() + (getSaldo()*(taxaDeRendimento/100)));
			setSaldo(novoSaldo);
		}
		
		return getSaldo();
	}
	
	@Override
	public String toString() {
		return "contaPoupanca [dataRendimento=" + getDataRendimento() + ", diaDeRendimento=" + getDiaDeRendimento() + "]";
	}

}