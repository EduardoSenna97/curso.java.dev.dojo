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


}
