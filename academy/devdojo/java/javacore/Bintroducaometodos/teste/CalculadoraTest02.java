package academy.devdojo.java.javacore.Bintroducaometodos.teste;

import academy.devdojo.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros(10, 20);
        calculadora.multiplicaDoisNumeros2(10, 20.0F);
    }


}
