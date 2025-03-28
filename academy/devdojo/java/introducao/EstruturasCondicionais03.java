package academy.devdojo.java.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {

        /* Aprendendo Switch:

        Imprima o dia da semana, considerando 1 como domingo.           */

        byte dia = 5;
        /*Posso colocar variáveis do tipo char, int, byte, short, enum, String
        Se eu não mandar o switch parar, ele vai executar todos que forem após o valor da variável ter sido
        atingida.
         */
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;

        }

        /* Exercício de Switch:

        1. Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo.

         */

        byte diaSemana = 7;
        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é final de semana; é domingo!");
                break;
            case 2:
                System.out.println("Hoje é dia útil; é segunda-feira!!");
                break;
            case 3:
                System.out.println("Hoje é dia útil; é terça-feira!!");
                break;
            case 4:
                System.out.println("Hoje é dia útil; é quarta-feira!!");
                break;
            case 5:
                System.out.println("Hoje é dia útil; é quinta-feira!!");
                break;
            case 6:
                System.out.println("Hoje é dia útil; é sexta-feira!");
                break;
            case 7:
                System.out.println("Hoje é final de semana; é sábado!");
                break;
            default:
                System.out.println("Opção inválida");
            /*
            Podia também ter realizado desta maneira:

            byte diaSemana = 4;
            switch (diaSemana){
                case 1:
                case 7:
                    System.out.println("Dia útil");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia útil");
                    break;
                default
                    System.out.println("Opção inválida");
                    break;
            }                                                               */


        }

    }
}
