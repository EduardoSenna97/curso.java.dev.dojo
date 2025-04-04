package academy.devdojo.java.javacore.Aintroducaoclasses.teste;

import academy.devdojo.java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        /*Sintaxe -> Tenho uma variável de referência do tipo estudante -> para criar objeto coloco new
        para criar o objeto -> Em seguida ponho o nome do objeto que quero criar.
        Variável de referência do tipo estudante mais objeto do tipo estudante*/
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
