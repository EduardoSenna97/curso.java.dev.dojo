package academy.devdojo.java.javacore.Bintroducaometodos.teste;

import academy.devdojo.java.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.java.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("---------");

        impressora.imprime(estudante01);        //Objetos receberam a troca dos valores.
        impressora.imprime(estudante02);
    }

}
