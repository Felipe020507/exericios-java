package entidade;

public final class Diretor extends Empregado{
private float salario;
public Diretor(String nome, int identificacao, float salario) {
super(nome, identificacao);
this.salario = salario;
}
public void setSalario(float salario) {
if(salario > 0) {
this.salario = salario;
}else {
this.salario = 0;
}
}
@Override
public float calcularSalario() {
return salario;
}

@Override
public String toString() {
return "Diretor: salario = " + salario + " "+ super.toString() + "]";
}
}