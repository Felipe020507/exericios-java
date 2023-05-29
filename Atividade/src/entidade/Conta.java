package entidade;

public class Conta extends Exception  {
double saldo;
int valorlimete;
int codigoIdentificacao;



public Conta(double saldo, int valorlimete, int codigoIdentificacao) {
}


public void sacar (double valor) throws ContaExcecao {
    if (valor > valorlimete) {
        throw new ContaExcecao("Valor maior que o limite.");
    }
    else {
    	saldo = saldo - valor;
    	
    	System.out.println("Novo saldo: " +saldo);
    }
}


public void depositar(double valor) {
    saldo = saldo + valor;
    System.out.println("Seu saldo e " + saldo);
}



//Metodo Getts e Setts


public float getValorlimete() {
	return valorlimete;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public void setValorlimete(int valorlimete) {
	this.valorlimete = valorlimete;
}
public int getCodigoIdentificacao() {
	return codigoIdentificacao;
}
public void setCodigoIdentificacao(int codigoIdentificacao) {
	this.codigoIdentificacao = codigoIdentificacao;
}

}
