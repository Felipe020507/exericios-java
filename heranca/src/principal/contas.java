package principal;

import java.util.Scanner;

import entidade.contaCorrente;
import entidade.contaPoupança;

public class contas {
	
	public static void saqueEmContaCorrente(Scanner lerDados, contaCorrente contaCorrente) {
		float valorDeSaque, conteudoValorSaque;
		
		System.out.println("Valor de saque para Conta Corrente: ");
		valorDeSaque = lerDados.nextFloat();
		conteudoValorSaque = contaCorrente.sacar(valorDeSaque);
		
		if(conteudoValorSaque == -1) {
			System.out.println("VocÃª nÃ£o tem crÃ©dito para sacar esse valor");
		}else{
			System.out.printf("Valor retirado: %.2f\n",valorDeSaque);
			System.out.println("Saldo atual: "+contaCorrente.getSaldo());
		}
		
		
	}
	
	
	public static void saqueEmContaPoupanca(Scanner lerDados, contaPoupança contaPoupanca) {
		float valorDeSaque, conteudoValorSaque;
		
		System.out.println("Valor de saque para Conta PoupanÃ§a: ");
		valorDeSaque = lerDados.nextFloat();
		conteudoValorSaque = contaPoupanca.sacar(valorDeSaque);
		if(conteudoValorSaque == -1) {
			System.out.println("VocÃª nÃ£o tem saldo para sacar esse valor");	
		}else{
			System.out.println("Valor retirado: "+conteudoValorSaque);
		}
		
		System.out.println("Saldo atual: "+contaPoupanca.getSaldo());
	}
	
	public static void main(String[] args) {
		contaPoupança contaPoupanca = new contaPoupança("Amadeu", 1, 200, 10);
		contaCorrente contaCorrente = new  contaCorrente("Carlos", 2, 300, 200); 
		float saldo;
		Scanner lerDados = new Scanner(System.in);
		
		//saqueEmContaCorrente(lerDados, contaCorrente);
		//System.out.println("\n");
		//saqueEmContaPoupanca(lerDados, contaPoupanca);
		System.out.println(contaPoupanca.getSaldo());
		//saldo = contaPoupanca.calcularNovoSaldo(5, 1);
		saldo = contaPoupanca.calcularNovoSaldo(5, 1);
		System.out.println(contaPoupanca.toString());
		System.out.println("Novo saldo do cliente, a partir da taxa de rendimento: "+saldo);
		
		//System.out.println(contaBancaria.toString());
		lerDados.close();
	}
	
}