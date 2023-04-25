package entidade;

public class Calculadora implements OperBasicas{
private int num1, num2;
public Calculadora(int num1, int num2) {
this.num1 = num1;
this.num2 = num2;
}
@Override
public float adicao() {
return (num1 + num2);
}
@Override
public float subtracao() {
return (num1 - num2);
}
@Override
public float multiplicacao() {
return (num1 * num2);
}

@Override
public float divisao() {
float resultado = 0;
if(num2 == 0) {
System.out.println("Divisão por Zero não é permitido !");
return 0;
}else {
resultado = (num1/num2);
return resultado;
}
}
}
