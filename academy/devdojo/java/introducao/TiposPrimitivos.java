package academy.devdojo.java.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {

        /* Tipos primitivos: byte (-127 a 128); short (-32,768 a 32,767);

            int (-2 milhões a 2 milões); long (O maior de todos)
            boolean eBrasileiro : true;
            char letra = 'A';
            double - representa números de ponto flutuando com mais precisão (armazena mais
            depois da vírgula.
            float - representa números de ponto flutuante com menos precisão.
            Ex.:
            double idade = 22.50;
            float salario = 400.20F;

            Nota especial: nomenclatura de variável sempre começa com letra minúscula e caso seja palavra composta
            deve ser colocado maiúscula. Ex.: int idade = 10;    int idadeDoPai = 10;

            Quando eu crio as variáveis, elas apenas armazenam o valor na memória, se eu executar o programa,
            nada acontece. Para ela executar e aparecer, uso o System.out.println(idade); se quiser colocar um caracter
            junto, basta colocar + dentro dos ().
                                                         */
        int idade = 23;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 12;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A'; //Posso usar tabela unicode ou Ascii para colocar determinado caractere no char.
        char caractereUnicodeAscii = '\u0041';

        System.out.println("A idade é " +idade+ " anos");
        System.out.println(falso);
        System.out.println("char" + caractere);

        //Posso fazer um cast (forçar a entrada do valor), por exemplo:

        byte testeCast = (byte) 130;
        System.out.println(testeCast);

        String nome = "Eduardo";

        /* String!
        A String não é um tipo primitivo, ela é uma classe (classes começam com letras maiúsculas);
        A String precisa de um identificador (nome). Pode colocar um texto grande. */

        System.out.println("Oi meu nome é "+ nome);
    }

}
