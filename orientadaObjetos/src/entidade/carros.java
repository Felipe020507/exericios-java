package entidade;

public class carros {
	private int numVenda;
	private float valorVenda;
	private String modeloCarro;
	private String nomeVendedor;
	private int[] parcelas;

//    public Venda(int numVenda, String modeloCarro, float valorVenda, String nomeVendedor, int[] parcelas) {
//        this.numVenda = numVenda;
//        this.modeloCarro = modeloCarro;
//        this.valorVenda = valorVenda;
//        this.nomeVendedor = nomeVendedor;
//        this.parcelas = parcelas;
//    }

	public int[] calcularParcelas(int numParcelas) {
		int[] valorParcelas;
		float valorParcela;

		valorParcelas = new int[numParcelas];
		valorParcela = this.valorVenda / numParcelas;

		for (int i = 0; i < numParcelas; i++) {
			valorParcelas[i] = (int) valorParcela;
		}

		return valorParcelas;
	}

	// getters and setters
	public int getNumVenda() {
		return numVenda;
	}

	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	
	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}
	
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}



}
