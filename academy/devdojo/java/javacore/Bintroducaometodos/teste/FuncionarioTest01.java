package academy.devdojo.java.javacore.Bintroducaometodos.teste;


import academy.devdojo.java.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jurema");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 937.32, 2000});

        funcionario.imprimeFuncionario();
        funcionario.imprimeMediaSalarios();
        System.out.println("Média " + funcionario.getMedia());

    }
}
