package academy.devdojo.java.introducao;

public class LacosDeRepeticaoExerciciosBreaksEContinue {
    public static void main(String[] args) {

        // Imprima todos os números pares de 0 até 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {                               //Para números ímpares, basta mudar o i por 1.
                System.out.println(i);
            }
        }

        // Imprima os primeiros 25 números de um dado valor. Por exemplo: 50.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {  //Podia fazer assim: if (i > 25) {break;
                break;
            }
            System.out.println("O valor de i é: " + i);

            //O break sai do laço de repetição.

        }
        /* Exercício:
         Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
         Condição é que o valorParcela >=1000
         */


        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);

            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for " + parcela);
        }

        //Posso abreviar o código de maneira mais fácil e mais limpa:

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ "+ valorParcela);
        }

        /*
         Continue - é o contrário do break; ele vai ignorar tudo que tem ''embaixo'' e vai
         para o começo, contando da próxima interação. Ex.:1
         */

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela <1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ "+ valorParcela);
        }

    }
}
