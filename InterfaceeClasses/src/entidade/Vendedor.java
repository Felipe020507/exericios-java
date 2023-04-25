package entidade;

public final class Vendedor extends Empregado {
private float salario;
private float comissao;
private int vendas;




public Vendedor(String nome, int identificacao, float salario, float comissao, int
vendas) {
super(nome, identificacao);
this.salario = salario;
this.comissao = comissao;
this.vendas = vendas;
}


public void setSalario(float salario) {
if(salario > 0) {
this.salario = salario;
}else {
this.salario = 0;
}
}
}

public void setComissao(float comissao) {
if(comissao > 0) {
this.comissao = comissao;
}else {
this.comissao = 0;
}
}
public void setVendas(int vendas) {
if(vendas > 0) {
this.vendas = vendas;
}else {
this.vendas = 0;
}
}
@Override
public float calcularSalario() {
return (salario + (comissao* vendas));
}
@Override
public String toString() {
return "Vendedor: salario = " + salario + " "+ super.toString() + "]";
}
}