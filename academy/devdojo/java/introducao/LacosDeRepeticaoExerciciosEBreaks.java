package academy.devdojo.java.introducao;

public class LacosDeRepeticaoExerciciosEBreaks {
    public static void main(String[] args) {

        // Imprima todos os números pares de 0 até 1000000

        for(int i = 0;i <= 1000000; i++) {
            if (i % 2 == 0) {                               //Para números ímpares, basta mudar o i por 1.
                System.out.println(i);
            }
        }

        // Imprima os primeiros 25 números de um dado valor. Por exemplo: 50.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){  //Podia fazer assim: if (i > 25) {break;
                break;
            }
            System.out.println("O valor de i é: " + i);

            //O break sai do laço de repetição.

        }

    }
}
