package academy.devdojo.java.introducao;

public class VetoresArrays01 {
    public static void main(String[] args) {

        /*
        Os Arrays [] são uma variável que faz referência a um espaço em memória que pode ter mais de um
        valor.

        Eles são uma variável do tipo reference.

        Para inicializar posso dar como ''null''. int[] idades = null;

        Sempre que for declarar um Array preciso dizer o quanto de espaço em memória ele está alocando.

        Os Arrays são um objeto em memória; no caso abaixo um objeto de 3 posições.

        Eles são indexados, ou seja, possuem posições. Ex.:

        O índice sempre começa de 0.

        Um Array segue as regras determinadas de cada tipo a que ele faz referência.

        Variáveis tem um padrão de inicialização.
        ~ byte, short, int, long, float e doble = 0
        ~ char = '\u0000' ~  '   '
        ~ boolean = false
        ~ String = null

        O tamanho dos Arrays não pode aumentar dinamicamente; se quiser aumentar preciso compilar o programa
        novamente.

         */

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0]);


        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) { //Não posso colocar um número errado pois pode não encontrar o índice.
            System.out.println(nomes[i]);
        }

        nomes = new String[5]; // Posso fazer isso para alterar o tamnho, porém o espaço do antigo array será perdido.


    }

}
