package academy.devdojo.java.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {

        //Doar se salário > 5000

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //Quando tenho essa sintaxe acima, posso utilizar o operador ternário

        double salario2 = 7000;
        String mensagemDoar2 = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar2 = "Ainda não tenho condições, mas vou ter!";

        //(condição) ? verdadeiro : falso

        String resultado2 = salario2>5000 ? mensagemDoar2 : mensagemNaoDoar2;

        //tenho que tomar cuidado para não colocar um valor que não seja o mesmo do tipo da variável.

        System.out.println(resultado2);
    }
}


