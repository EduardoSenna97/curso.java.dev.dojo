package academy.devdojo.java.introducao;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*while, do while, for

        while - Obrigatoriamente o que você coloca no while precisa resultar em um valor booleano.
        Ele só executa se o for verdadeiro.

        do while - Irá executar pelo menos 1 vez, independente da condição ser verdadeira ou falsa.

        for - (declara variável ; faz comparação até onde o laço seja executado ; como a variável vai alterar o status?)
         */

        int count = 0;
        while (count < 10) { //se eu colocar <= 10 vai imprimir o 11, pois o código vê a condição e depois imprime.
            System.out.println(++count);
            //count = count + 1    |     count +=1;
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        //Variável local precisa ser inicializada antes de usar. Colocar um valor.

        for (int i = 0; i <= 10; i++) {
            System.out.println("For " + i);
        }
        //E se eu quiser colcar a mensagem só no final da contagem do for? Verificar

    }
}
