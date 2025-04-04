package academy.devdojo.java.javacore.Bintroducaometodos.teste;

import academy.devdojo.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.divideDoisNumeros(20, 2);
        //Preciso criar uma variável do mesmo tipo do método para receber o resultado

        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20, 2));
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("-------------------------");
       /*
        System.out.println(calculadora.imprimeDivisaoDeDoisNumeros);

        ~Quando tenho um método que tem o ''sout'', não posso colocar dentro dele uma chamada de um método que não
        retorna um valor. Ocorre erro de compilação.Se eu colocar uma chamada de um método dentro de um sout que
        o retorno não existe (void), ocorre isto pois o sout precisa de um valor para imprimir no console.

        */

        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
