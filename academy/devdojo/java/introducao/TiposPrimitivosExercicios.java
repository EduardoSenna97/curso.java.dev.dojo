package academy.devdojo.java.introducao;

    /* Prática!
        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte
        mensagem:

        Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario <salario,
        na data <data>. Obrigado!
     */

public class TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String endereco = "Rua Alfredo Ferreira - Bom Jesus";
        double salario = 1465.85;
        String data = "26/03/2025";

            System.out.println("Eu "+ nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario R$ "+
                    salario + ", na data "+ data + ". Obrigado!");

    }
}
