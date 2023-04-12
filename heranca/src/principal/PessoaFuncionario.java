package principal;

import java.util.Scanner;
import entidade.Pessoa;
import entidade.Funcionario;
import entidade.Empresa;

public class PessoaFuncionario {

	public static void main(String[] args) {
		String cargoFuncionario, pessoaNome, gerenteFuncionario, nomeEmpresa;
		int idadePessoa;
		double rgPessoa;

		Scanner lerDado = new Scanner(System.in);

		Pessoa NomePessoa = new Pessoa();

		Funcionario FuncoesFuncionario = new Funcionario();

		Empresa MarcaEmpresa = new Empresa();

		System.out.println("Nome do Funcionario: ");
		pessoaNome = lerDado.next();
		NomePessoa.setNome(pessoaNome);

		System.out.println("Idade do Funcionario: ");
		idadePessoa = lerDado.nextInt();
		NomePessoa.setIdade(idadePessoa);

		System.out.println("Qual o RG da pessoa: ");
		rgPessoa = lerDado.nextDouble();
		NomePessoa.setRg(rgPessoa);

		System.out.println("Qual o cargo:");
		cargoFuncionario = lerDado.next();
		FuncoesFuncionario.setCargo(cargoFuncionario);

		System.out.println("Esse funcionario e um gerente SIM ou NAO: ");
		gerenteFuncionario = lerDado.next();
		FuncoesFuncionario.setGerente(gerenteFuncionario);

		System.out.println("Qual o nome da Empresa que ele atua: ");
		nomeEmpresa = lerDado.next();
		MarcaEmpresa.setNomedaempresa(nomeEmpresa);

		System.out.println("Nome:  " + pessoaNome);
		System.out.println("Tem: " + idadePessoa + " anos");
		System.out.println("RG:  " + rgPessoa);
		System.out.println("O cargo:  " + cargoFuncionario);
		System.out.println("Sobre ser um gerente: " + gerenteFuncionario);
		System.out.println("O nome da empresa que ele atual:  " + nomeEmpresa);


}
