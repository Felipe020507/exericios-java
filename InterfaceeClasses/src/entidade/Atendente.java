package entidade;



public final class Atendente extends Empregado {
private float salario;
private float horasAdicionais; 
public Atendente(String nome, int identificacao, float salario, float horasAdicionais) {
super(nome, identificacao);
this.salario = salario;
this.horasAdicionais = horasAdicionais;
}
public void setSalario(float salario) {
if (salario > 0) {
this.salario = salario;
} else {
this.salario = 0;
}
}

public void setHorasAdicionais(float horasAdicionais) {
if ((horasAdicionais >= 0) && (horasAdicionais <= 300)) {
this.horasAdicionais = horasAdicionais;
} else {
this.horasAdicionais = 0;
}
}
@Override
public float calcularSalario() {
return (salario + (salario*(horasAdicionais/100)));
}
@Override
public String toString() {
return "Atendente: salario = " + salario + " "+ super.toString() + "]";
}

}
