package academy.devdojo.java.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    /*Métodos - são parecidos com os atributos, porém um pouco diferentes.

     A construção segue a seguinte:
     Modificador de acesso | Retorno | Nome do método (mesma convenção das variáveis)() {}  */

    public void somaDoisNumeros() {

        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    // Parâmetros são variáveis locais/vidas durante o contexto do bloco. Elas seguem os mesmos padrões das variáveis.
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public void multiplicaDoisNumeros2(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }

        return 0;


    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;                                            //É como se fosse um break.
        }/* else {                                              ~Posso colocar esse else também
            System.out.println(num1 / num2); */
        System.out.println(num1 / num2);

    }

    /* Passagens de parãmetros tipos primitivos:

     a = 1 e b = 2 são copiados para numero1 e numero2.
     Dentro do método, você muda os valores de numero1 e numero2 para 99 e 33, mas essas mudanças afetam
     apenas as cópias.
     Fora do método, a e b continuam com os valores originais, 1 e 2, porque não foram alterados diretamente,
     só suas cópias.

     É como se você tivesse duas folhas de papel:

    Você escreve 1 e 2 nas suas folhas (a e b).
    Depois, você tira cópias dessas folhas e as dá para o método (numero1 e numero2).
    O método rabisca as cópias e escreve 99 e 33.
    Mas as folhas originais (a e b) ainda estão intocadas com 1 e 2.

     */

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);

    }
}
