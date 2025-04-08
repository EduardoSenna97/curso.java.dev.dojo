package academy.devdojo.java.javacore.Bintroducaometodos.dominio;

 /*

    Exercício:

    Crie uma classe funcionário com os seguintes atributos:
    nome
    idade
    salario ~ três salários devem ser guardados;

    Crie dois métodos

    1. para imprimir os dados
    2. para tirar a media dos salário e imprimir o resultado

     */


public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salarios : salarios) {
            System.out.println(salarios + " ");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }


    public void imprimeMediaSalarios() {
        if(salarios == null){
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial " + media);
    }


}
