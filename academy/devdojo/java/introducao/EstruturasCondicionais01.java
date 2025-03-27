package academy.devdojo.java.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
    /* Operadores condicionais:

    if()
    ~ O que for posto dentro dos parênteses precisa extritamente ser booleano.
    ~O if só é executado se a condição dentro do if ser verdadeira; se for falso não executa.
    ~Geralmente as condições if possuem um bloco ( { } ).
     */
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {   //Aqui não executa se for falso
            System.out.println("Autorizado a comprar bebida alcoólica");
        }


        if (isAutorizadoComprarBebida == false) { //Aqui executa se for falso
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        //Pode ser abreviado com ! antes da variável.

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");

        }
        //If precisa obrigatoriamente retornar um booleano.


        //Podem ocorrer casos em provas onde são comparados os códigos. Ex.:
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        if (c == true) {
            System.out.println("Não vai ser executado anterior ao if acima, porém agora c é verdadeiro");

        }

        System.out.println("Não está sendo executado no if");

        // else ~ executa o código dele sempre que o if não for executado.

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }


    }

}
