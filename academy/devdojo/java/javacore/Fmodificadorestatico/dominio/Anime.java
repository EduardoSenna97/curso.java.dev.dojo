package academy.devdojo.java.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //0 - Bloco de inicialização é executado quando a JVM carregar a classe.
    //1 - Alocado espaço em memória para o objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
    //3 - Bloco de inicialização executado
    //4 - Construtor é executado

    //Bloco de inicialização de instância - é executado tds vezes que objeto é criado.

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
