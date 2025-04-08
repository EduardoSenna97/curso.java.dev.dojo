package academy.devdojo.java.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


    /*
    Construtores - Construtores não possuem nenhum tipo de retorno; Sintaxe:
    modificador de acesso - nome da classe - parênteses + chaves

    Os CONSTRUTORES são INICIALIZADOS SEMPRE PRIMEIRO QUE OS MÉTODOS!
     */

    public Anime(String nome, String tipo, int episodios, String genero){
        this();//this só pode ser usado dentro do corpo de um construtor. Para chamar outro construtor, PRIMEIRA LINHA
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        System.out.println("Dentro do construtor");
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }


    public void imprime() {
        System.out.println(nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(genero);
        System.out.println(estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
