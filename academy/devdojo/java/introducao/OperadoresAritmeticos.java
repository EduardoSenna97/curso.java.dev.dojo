package academy.devdojo.java.introducao;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        /*Os operadores são: + - / * %
         */

        int numero01 = 10;
        double numero02 = 20;
        System.out.println(numero02 + numero01);

        //Tomar cuidado com uma String dentro do println, pois deste modo ele não irá somar os valores,
        //mas sim concatenar, tudo que estiver após a String. Porém antes não; veja a diferença:

        System.out.println("Valor " + numero02 + numero01);

        System.out.println(numero02 + numero01 + " Valor " + numero02 + numero01);

        double resultado = numero01 * numero02;

        System.out.println(resultado);

        double resultado2 = numero01 / numero02;

         /* O resultado deveria ser 0.5, porém a divisão entre um número inteiro e outro número inteiro, somente dá
         um resultado de número inteiro. Para ajustar, é preciso colocar no mínimo uma das variáveis como double.
          */

        System.out.println(resultado2);

        int resto = 20 % 2;
        System.out.println(resto);

        /* Operadores lógicos sempre retornam valor booleano são eles:
        <  >  <=  >=  == (igual ~ comparação)  != (diferente)  */

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;


        System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte" + isDezIgualVinte);
        System.out.println("isDezIgualDez" + isDezIgualDez);
        System.out.println("isDezDiferenteDez" + isDezDiferenteDez);

        //+ Operadores lógicos: && (AND) (duas condições precisam ser verdadeiras para ser verdadeiro)
        // || (or)  (basta uma das condições ser verdadeira para ser verdadeiro)
        // ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel =
                valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println(isPlaystationCincoCompravel);

        // Operadores de atribuição (atribuem algo à variável): = += =+ *= /= %=

        double bonus = 1800;  // 1800
        bonus += 1000; // 2800
        bonus -= 1000;  //1800
        bonus *= 2;   // Usa-se para abreviar, pois é o mesmo que bonus = bonus * 2
        bonus /= 2;
        bonus %= 2; //Ele retorna zero pois o número é par.
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador +=1; //contador = contador +1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);//Primeiro ele vai imprimir, depois incrementar o +1
        System.out.println(contador2);
        System.out.println(++contador2);  //Incrementa o valor e depois imprime.


        /*Tabela verdade:

        V && V = V
        V && F = F
        F && V = F
        F && F = F
        V && V && V && F = F

        F || F = F
        F || V = V
        V || F = V
        V || V = V
        F || F || F || V = V        */






}
}