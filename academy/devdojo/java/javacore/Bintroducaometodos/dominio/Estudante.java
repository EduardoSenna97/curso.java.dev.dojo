package academy.devdojo.java.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){    //this. ~ usado para se referir a algum atributo de dentro do objeto.
        System.out.println("-----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
