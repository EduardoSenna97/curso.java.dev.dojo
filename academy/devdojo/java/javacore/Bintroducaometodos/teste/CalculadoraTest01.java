package academy.devdojo.java.javacore.Bintroducaometodos.teste;

import academy.devdojo.java.javacore.Bintroducaometodos.dominio.Calculadora;

//Os métodos são utilizados dentro de um objeto.

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();


        // Coloquei parâmetros na classe calculadora, porém agora preciso dos argumentos para usar aqui.
        calculadora.multiplicaDoisNumeros(10, 20);


    }


}
